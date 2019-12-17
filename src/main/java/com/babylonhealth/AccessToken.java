package com.babylonhealth;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AccessToken {

  public static final String SERVICE_ACCESS_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik9USkNRVUk1TURnMk9VSXdSVFZFTUVGQlEwWkJNak5EUWpO"
          + "R1FqZzRNVVJGTlRaQlF6WkdRdyJ9.eyJodHRwczovL2JhYnlsb25oZWFsdGguY29tL3NlcnZpY2UiOiJwc"
          + "mVzY3JpcHRpb24tcHJvdmlkZXIiLCJodHRwczovL2JhYnlsb25oZWFsdGguY29tL2FsbG93ZWQtcmVnaW9"
          + "ucyI6ImRldi11ayIsImlzcyI6Imh0dHBzOi8vYmFieWxvbi1kZXYtdWsuZXUuYXV0aDAuY29tLyIsInN1Y"
          + "iI6IkNxbWVvUkEzclRDZVlYOWVobUQ4MFNBVFdTM0FpT081QGNsaWVudHMiLCJhdWQiOiJodHRwczovL2J"
          + "hYnlsb25oZWFsdGguY29tIiwiaWF0IjoxNTYzNDY0Njg3LCJleHAiOjE1NjM0NjY0ODcsImF6cCI6IkNxb"
          + "WVvUkEzclRDZVlYOWVobUQ4MFNBVFdTM0FpT081Iiwic2NvcGUiOiJpbnRlcm5hbCIsImd0eSI6ImNsaWV"
          + "udC1jcmVkZW50aWFscyJ9.jx7eJy44xYfIHxSZe2MZl_nLKrgER9HoGVCf_x8l2GeY_eE1WDKYej9hy2EE"
          + "3B6E6iigHI3567qQJHt_LlWdFTop5C-63qzp7OYNqRzUh6CJiGZbm0sxiqm3Jp9lqTY9KrYLO-6gJkQadl"
          + "UA9hO-YZf-21ac19L8JFnQJiCDRSd5I_yAkn4hM72inWfGDxOZaXEoYkWrqAPDXi3rvYLdotiN4VCEF1kg"
          + "PR3v-ERueYV7kY-vdr-vlWlaLr9lJecHB0kaL7ZSsGG-w5RFQQJXxYLmTkTTtkYIQcqKVD_lYWu0Tg1Lpg"
          + "mH8LLWkTXBPgG2nWBB_9RdCD5BnYaD64glAw";

  public static final String USER_ACCESS_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik9USkNRVUk1TURnMk9VSXdSVFZFTUVGQlEwWkJNak5EUWpOR1F"
          + "qZzRNVVJGTlRaQlF6WkdRdyJ9.eyJodHRwczovL2JhYnlsb25oZWFsdGguY29tL3VzZXIiOiI4MzI3YWIwZC0"
          + "4YjJmLTRkNjktYjBiMC0zZmMyMWE2NjA0MTAiLCJodHRwczovL2JhYnlsb25oZWFsdGguY29tL3VzZXIzMiI6"
          + "OTI2NjU1MSwiaHR0cHM6Ly9iYWJ5bG9uaGVhbHRoLmNvbS9hbGxvd2VkLXJlZ2lvbnMiOiJkZXYtdWsiLCJod"
          + "HRwczovL2JhYnlsb25oZWFsdGguY29tL3J1YnktdG9rZW4iOiJiNTEyYTE3YzVmNmMyYzU1NDRjMDU3NDQ1ZG"
          + "QxMTYyZCIsImlzcyI6Imh0dHBzOi8vYmFieWxvbi1kZXYtdWsuZXUuYXV0aDAuY29tLyIsInN1YiI6ImF1dGg"
          + "wfHN0YXRpYy11c2VyLWlkIiwiYXVkIjoiaHR0cHM6Ly9iYWJ5bG9uaGVhbHRoLmNvbSIsImlhdCI6MTU2MzM1"
          + "OTg0NiwiZXhwIjoxNTYzMzYxNjQ2LCJhenAiOiJ4b05pbVlDVnh3MUxwR2VuOHNEY3JUajAwaVpFMzJUTCIsI"
          + "nNjb3BlIjoiaW50ZXJuYWwgb2ZmbGluZV9hY2Nlc3MiLCJndHkiOiJwYXNzd29yZCJ9.qzePLV2Kno42lRhp5"
          + "lBA88EQM0L2i9aOgst3H47tQYTuJCxt7Zl8jWmsKh4hoCiM9Av_YWTUswHwRziY-nq8UqhKhqpqMOtL0hizD0"
          + "iRyhbhLBBV1FE79HsWgDJRpqU_PAGNYtq2OEFonF2GkyfOV9LDN4KPI-h3s7j4QtS3nO4ZyoBWW8BGZhqoj4n"
          + "Tn7biMQQN_9CPWt-RETGXqwFBHKWwzKVDZC5vyUdm47t9PQ_V_G0Apo53lYHXOhYlvhOn4ZI6IME9J6uIa0vn"
          + "EF_jqSM0Zg0eripRQkMGsk5InGzoCd6yj2ChYUR5DvF_JoKWVypACBP1N1itNcQDRUbHTA";

  public static final String GLOBAL_ADMIN_ACCESS_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik9USkNRVUk1TURnMk9VSXdSVFZFTUVGQlEwWkJN"
          + "ak5EUWpOR1FqZzRNVVJGTlRaQlF6WkdRdyJ9.eyJodHRwczovL2JhYnlsb25oZWFsdGguY29tL3VzZXIiOiI4MzI3YWIwZC04YjJmLTRkNjktYjBiMC0zZmMyMWE2NjA0MTAiLC"
          + "JodHRwczovL2JhYnlsb25oZWFsdGguY29tL3VzZXIzMiI6OTI2NjU1MSwiaHR0cHM6Ly9iYWJ5bG9uaGVhbHRoLmNvbS9hbGxvd2VkLXJlZ2lvbnMiOiJkZXYtdWsiLCJodHRwc"
          + "zovL2JhYnlsb25oZWFsdGguY29tL3J1YnktdG9rZW4iOiJiNTEyYTE3YzVmNmMyYzU1NDRjMDU3NDQ1ZGQxMTYyZCIsImlzcyI6Imh0dHBzOi8vYmFieWxvbi1kZXYtdWsuZXUu"
          + "YXV0aDAuY29tLyIsInN1YiI6ImF1dGgwfHN0YXRpYy11c2VyLWlkIiwiYXVkIjoiaHR0cHM6Ly9iYWJ5bG9uaGVhbHRoLmNvbSIsImlhdCI6MTU2MzM1OTg0NiwiZXhwIjoxNTY"
          + "zMzYxNjQ2LCJhenAiOiJ4b05pbVlDVnh3MUxwR2VuOHNEY3JUajAwaVpFMzJUTCIsInNjb3BlIjoiaW50ZXJuYWwgb2ZmbGluZV9hY2Nlc3MiLCJndHkiOiJwYXNzd29yZCJ9.q"
          + "zePLV2Kno42lRhp5lBA88EQM0L2i9aOgst3H47tQYTuJCxt7Zl8jWmsKh4hoCiM9Av_YWTUswHwRziY-nq8UqhKhqpqMOtL0hizD0iRyhbhLBBV1FE79HsWgDJRpqU_PAGNYtq2"
          + "OEFonF2GkyfOV9LDN4KPI-h3s7j4QtS3nO4ZyoBWW8BGZhqoj4nTn7biMQQN_9CPWt-RETGXqwFBHKWwzKVDZC5vyUdm47t9PQ_V_G0Apo53lYHXOhYlvhOn4ZI6IME9J6uIa0v"
          + "nEF_jqSM0Zg0eripRQkMGsk5InGzoCd6yj2ChYUR5DvF_JoKWVypACBP1N1itNcQDRUbHTA";

  public static final String NON_WHITELISTED_SERVICE_ACCESS_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik9USkNRVUk1TURnMk9VSXdSVFZFTUVG"
          + "QlEwWkJNak5EUWpOR1FqZzRNVVJGTlRaQlF6WkdRdyJ9.eyJodHRwczovL2JhYnlsb25oZWFsdGguY29tL3NlcnZpY2UiOiJtZW1iZXJzaGlwLXBsYW5zIiwiaHR0cHM6Ly9i"
          + "YWJ5bG9uaGVhbHRoLmNvbS9hbGxvd2VkLXJlZ2lvbnMiOiJkZXYtdWsiLCJpc3MiOiJodHRwczovL2JhYnlsb24tZGV2LXVrLmV1LmF1dGgwLmNvbS8iLCJzdWIiOiJzMUNzZ"
          + "2NaWGYybE82Mjd6dWIyYVp3V2FYRkVlVHZFUkBjbGllbnRzIiwiYXVkIjoiaHR0cHM6Ly9iYWJ5bG9uaGVhbHRoLmNvbSIsImlhdCI6MTU2NDQ5MzIyNCwiZXhwIjoxNTY0ND"
          + "k1MDI0LCJhenAiOiJzMUNzZ2NaWGYybE82Mjd6dWIyYVp3V2FYRkVlVHZFUiIsInNjb3BlIjoiaW50ZXJuYWwiLCJndHkiOiJjbGllbnQtY3JlZGVudGlhbHMifQ.UH05qjwB"
          + "XJ6zuBW0_-hIWjV6cn5XOYmffUehlcGnBpZ3LIrNDpqueQxTipzZBT29duUKZFtH_wkbqTKdr6bRhowpYIYV3AoXpSkrnx3VutICIeV88Gb2ObfnlzCLVaS5Cudj7yLrgnSi9"
          + "DKdjma4tDGBeJ8d6rfFaVlGGrb6mqmSo7kn0glsdAz7oXRqkxaqaXtmeBXqewd56fhPY2VT0_1xlVXRufC3WygJlcBsawdR9EAL5DF-YXGTd_k11XUBhvoNolxeLc_Y87g5LX"
          + "CPpph39x3u0jKMBfLaz4SVN5xE097JQa8RCgoWk7tCkwhY9Yo5xxn8vVSYPe3GUQm3Gg";

  public static final String NOT_BABYLON_USER_ACCESS_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4g" +
          "RG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";

  public static final Map<String, String> USER_TOKEN = Collections.unmodifiableMap(
          new HashMap<String, String>() {
            {
              put("user", USER_ACCESS_TOKEN);
              put("service", SERVICE_ACCESS_TOKEN);
              put("admin", GLOBAL_ADMIN_ACCESS_TOKEN);
              put("non-whitelisted-service", NON_WHITELISTED_SERVICE_ACCESS_TOKEN);
              put("not-babylon-user", NOT_BABYLON_USER_ACCESS_TOKEN);
              put("anonymous-user", null);
            }
          }
  );
}
