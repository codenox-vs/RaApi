/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.2.4
 * Contact: ssc@swisssign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.client.model.RevocationReason;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RevocationStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RevocationStatus {
  public static final String SERIALIZED_NAME_REVOKED_ON = "revokedOn";
  @SerializedName(SERIALIZED_NAME_REVOKED_ON)
  private OffsetDateTime revokedOn;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private RevocationReason reason;

  public static final String SERIALIZED_NAME_REVOKED_BY = "revokedBy";
  @SerializedName(SERIALIZED_NAME_REVOKED_BY)
  private String revokedBy;

  public RevocationStatus() { 
  }

  
  public RevocationStatus(
     OffsetDateTime revokedOn, 
     String revokedBy
  ) {
    this();
    this.revokedOn = revokedOn;
    this.revokedBy = revokedBy;
  }

   /**
   * Revocation date in UTC
   * @return revokedOn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-02-12T05:10:50.520Z", required = true, value = "Revocation date in UTC")

  public OffsetDateTime getRevokedOn() {
    return revokedOn;
  }




  public RevocationStatus reason(RevocationReason reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RevocationReason getReason() {
    return reason;
  }


  public void setReason(RevocationReason reason) {
    this.reason = reason;
  }


   /**
   * email of the person who revoked the certificate
   * @return revokedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "some@email.org", required = true, value = "email of the person who revoked the certificate")

  public String getRevokedBy() {
    return revokedBy;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevocationStatus revocationStatus = (RevocationStatus) o;
    return Objects.equals(this.revokedOn, revocationStatus.revokedOn) &&
        Objects.equals(this.reason, revocationStatus.reason) &&
        Objects.equals(this.revokedBy, revocationStatus.revokedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revokedOn, reason, revokedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevocationStatus {\n");
    sb.append("    revokedOn: ").append(toIndentedString(revokedOn)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    revokedBy: ").append(toIndentedString(revokedBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("revokedOn");
    openapiFields.add("reason");
    openapiFields.add("revokedBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("revokedOn");
    openapiRequiredFields.add("reason");
    openapiRequiredFields.add("revokedBy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RevocationStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RevocationStatus.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevocationStatus is not found in the empty JSON string", RevocationStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RevocationStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevocationStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RevocationStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("revokedBy") != null && !jsonObj.get("revokedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revokedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revokedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevocationStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevocationStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevocationStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevocationStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<RevocationStatus>() {
           @Override
           public void write(JsonWriter out, RevocationStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevocationStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevocationStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevocationStatus
  * @throws IOException if the JSON string is invalid with respect to RevocationStatus
  */
  public static RevocationStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevocationStatus.class);
  }

 /**
  * Convert an instance of RevocationStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

