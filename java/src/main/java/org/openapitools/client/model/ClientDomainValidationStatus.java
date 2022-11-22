/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.0.223
 * Contact: ssc@swisssign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Status of the domain pre validation
 */
@JsonAdapter(ClientDomainValidationStatus.Adapter.class)
public enum ClientDomainValidationStatus {
  
  PENDING("pending"),
  
  EXPIRED("expired"),
  
  VALID("valid"),
  
  NOT_VALIDATED("not_validated");

  private String value;

  ClientDomainValidationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClientDomainValidationStatus fromValue(String value) {
    for (ClientDomainValidationStatus b : ClientDomainValidationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClientDomainValidationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClientDomainValidationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClientDomainValidationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClientDomainValidationStatus.fromValue(value);
    }
  }
}

