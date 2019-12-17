package com.babylonhealth;

import java.util.List;
import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.babylonhealth.locuscommons.locus.client.CacheableLocusClient;
import com.babylonhealth.locuscommons.locus.client.domain.RetrieveData;
import com.babylonhealth.locuscommons.locus.client.shared.BatchKeyRetrieveRequest;
import com.babylonhealth.locuscommons.locus.client.shared.BatchLocalisedContent;
import com.babylonhealth.locuscommons.locus.client.shared.KeyRetrieveRequest;
import com.babylonhealth.locuscommons.locus.client.shared.LocalisedContent;

@Service
@Slf4j
public class LocusClientService {

  private final CacheableLocusClient cacheableLocusClient;
  private HttpHeaders headers;

  public LocusClientService(CacheableLocusClient cacheableLocusClient) {
    this.cacheableLocusClient = cacheableLocusClient;
    headers = new HttpHeaders();
    headers.set("babylon-request-id", UUID.randomUUID().toString());
    headers.set(HttpHeaders.ACCEPT_LANGUAGE, "en-GB");
    headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + AccessToken.USER_ACCESS_TOKEN);
    headers.set(HttpHeaders.CONTENT_TYPE, "application/json");
  }

  public ResponseEntity<LocalisedContent> retrieve(String projectId, KeyRetrieveRequest retrieve) {
    RetrieveData<KeyRetrieveRequest> retrieveData = RetrieveData.<KeyRetrieveRequest>builder()
        .projectName(projectId)
        .includeMetadata(false)
        .headers(headers)
        .payload(retrieve)
        .build();

    return cacheableLocusClient.retrieve(retrieveData);
  }

  public ResponseEntity<List<BatchLocalisedContent>> retrieveBatch(String projectId, BatchKeyRetrieveRequest retrieve) {
    RetrieveData<BatchKeyRetrieveRequest> retrieveData = RetrieveData.<BatchKeyRetrieveRequest>builder()
        .projectName(projectId)
        .includeMetadata(false)
        .headers(headers)
        .payload(retrieve)
        .build();

    return cacheableLocusClient.retrieveBatch(retrieveData);
  }
}
