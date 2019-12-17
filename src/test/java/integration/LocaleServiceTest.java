package integration;

import java.time.ZoneId;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import com.babylonhealth.Application;
import com.babylonhealth.locuscommons.locus.client.shared.ClockFormats;
import com.babylonhealth.locuscommons.locus.client.shared.Genders;
import com.babylonhealth.locuscommons.locus.client.shared.KeyName;
import com.babylonhealth.locuscommons.locus.client.shared.KeyRetrieveRequest;
import com.babylonhealth.locuscommons.locus.client.shared.LocalisedContent;
import com.babylonhealth.locuscommons.locus.client.shared.MemberContext;
import com.babylonhealth.locuscommons.locus.client.shared.Persons;
import com.babylonhealth.shared.ObjectMapperProvider;

import static com.google.common.collect.Maps.newHashMap;
import static java.util.Optional.of;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = {Application.class})
public class LocaleServiceTest {

  private static final String PROJECT_NAME = "global units";
  private static final MemberContext BABYLON_CONTEXT = emptyContext("babylon-health");
  private static final KeyName KEY_NAME = new KeyName("body_weight");
  private static final String KEY_VALUE = "%s kg";

  private final ObjectMapper objectMapper = new ObjectMapperProvider().getMapper();

  @Autowired
  private MockMvc mvc;

  @Test
  public void retrieve() throws Exception {
    KeyRetrieveRequest request = KeyRetrieveRequest.builder()
        .keyName(KEY_NAME)
        .context(BABYLON_CONTEXT)
        .version("latest")
        .variables(newHashMap())
        .build();

    MockHttpServletRequestBuilder requestBuilder = getLocalesRequestBuilder(PROJECT_NAME, request);

    MockHttpServletResponse response = mvc.perform(requestBuilder)
        .andReturn()
        .getResponse();

    assertEquals(HttpStatus.OK.value(), response.getStatus());
    String content = response.getContentAsString();

    LocalisedContent localisedContent = objectMapper.readValue(content, LocalisedContent.class);

    assertEquals(KEY_NAME, localisedContent.getKeyName());
    assertEquals(KEY_VALUE, localisedContent.getValue());
  }

  public static MemberContext emptyContext(String partnerId) {
    return MemberContext.builder()
        .partner(partnerId)
        .speakerGender(of(Genders.MALE))
        .subjectGender(of(Genders.MALE))
        .region(of("GBR"))
        .person(of(Persons.FIRST))
        .timezone(Optional.ofNullable(ZoneId.of("Europe/London")))
        .age(of(16))
        .clockFormat(of(ClockFormats.FORMAT_24))
        .build();
  }

  private MockHttpServletRequestBuilder getLocalesRequestBuilder(String projectId,
                                                                 KeyRetrieveRequest keyRetrieveRequest)
      throws JsonProcessingException {
    return get("/v1/retrieve/" + projectId)
        .contentType(MediaType.APPLICATION_JSON)
        .content(objectMapper.writeValueAsString(keyRetrieveRequest));
  }

}
