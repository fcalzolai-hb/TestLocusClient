package com.babylonhealth;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.babylonhealth.locuscommons.locus.client.shared.BatchKeyRetrieveRequest;
import com.babylonhealth.locuscommons.locus.client.shared.BatchLocalisedContent;
import com.babylonhealth.locuscommons.locus.client.shared.KeyRetrieveRequest;
import com.babylonhealth.locuscommons.locus.client.shared.LocalisedContent;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1")
public class LocusClientController {

  private final LocusClientService locusClientService;

  public LocusClientController(LocusClientService locusClientService) {
    this.locusClientService = locusClientService;
  }

  @ApiOperation(
      value = "Retrieve",
      response = LocalisedContent.class)
  @ResponseStatus(OK)
  @GetMapping("/retrieve/{projectId}")
  public ResponseEntity<LocalisedContent> retrieve(
      @PathVariable String projectId,
      @Valid @RequestBody KeyRetrieveRequest retrieveData) {
    return locusClientService.retrieve(projectId, retrieveData);
  }

  @ApiOperation(
      value = "Retrieve  batch",
      response = LocalisedContent.class)
  @ResponseStatus(OK)
  @GetMapping("/retrieve-batch/{projectId}")
  public ResponseEntity<List<BatchLocalisedContent>> retrieve(
      @PathVariable String projectId,
      @RequestBody BatchKeyRetrieveRequest retrieveData) {
    return locusClientService.retrieveBatch(projectId, retrieveData);
  }
}
