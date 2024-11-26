/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.5.13
 * Contact: ssc@swisssign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.client.JSON;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SearchCertificateOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchCertificateOrder {
  public static final String SERIALIZED_NAME_ORDER_REFERENCE = "orderReference";
  @SerializedName(SERIALIZED_NAME_ORDER_REFERENCE)
  private String orderReference;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "orderStatus";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private List<CertificateOrderStatus> orderStatus = null;

  public static final String SERIALIZED_NAME_REVOCATION_REASON = "revocationReason";
  @SerializedName(SERIALIZED_NAME_REVOCATION_REASON)
  private List<RevocationReason> revocationReason = null;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCES = "clientReferences";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCES)
  private List<String> clientReferences = null;

  public static final String SERIALIZED_NAME_START_AFTER = "startAfter";
  @SerializedName(SERIALIZED_NAME_START_AFTER)
  private LocalDate startAfter;

  public static final String SERIALIZED_NAME_START_BEFORE = "startBefore";
  @SerializedName(SERIALIZED_NAME_START_BEFORE)
  private LocalDate startBefore;

  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private String attribute;

  public static final String SERIALIZED_NAME_INCLUDE_CERTIFICATE_CHAIN = "includeCertificateChain";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CERTIFICATE_CHAIN)
  private Boolean includeCertificateChain;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public SearchCertificateOrder() { 
  }

  public SearchCertificateOrder orderReference(String orderReference) {
    
    this.orderReference = orderReference;
    return this;
  }

   /**
   * Certificate Order reference
   * @return orderReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ord-f0725b50-c533-4802-a844-de57bfb7a80e", value = "Certificate Order reference")

  public String getOrderReference() {
    return orderReference;
  }


  public void setOrderReference(String orderReference) {
    this.orderReference = orderReference;
  }


  public SearchCertificateOrder serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Certificate serial number (Big Integer HEX encoded) with optional wildcard attributes ? and/or *
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3893409CB*66E1F09?", value = "Certificate serial number (Big Integer HEX encoded) with optional wildcard attributes ? and/or *")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public SearchCertificateOrder orderStatus(List<CertificateOrderStatus> orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

  public SearchCertificateOrder addOrderStatusItem(CertificateOrderStatus orderStatusItem) {
    if (this.orderStatus == null) {
      this.orderStatus = new ArrayList<>();
    }
    this.orderStatus.add(orderStatusItem);
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CertificateOrderStatus> getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(List<CertificateOrderStatus> orderStatus) {
    this.orderStatus = orderStatus;
  }


  public SearchCertificateOrder revocationReason(List<RevocationReason> revocationReason) {
    
    this.revocationReason = revocationReason;
    return this;
  }

  public SearchCertificateOrder addRevocationReasonItem(RevocationReason revocationReasonItem) {
    if (this.revocationReason == null) {
      this.revocationReason = new ArrayList<>();
    }
    this.revocationReason.add(revocationReasonItem);
    return this;
  }

   /**
   * Get revocationReason
   * @return revocationReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RevocationReason> getRevocationReason() {
    return revocationReason;
  }


  public void setRevocationReason(List<RevocationReason> revocationReason) {
    this.revocationReason = revocationReason;
  }


  public SearchCertificateOrder clientReferences(List<String> clientReferences) {
    
    this.clientReferences = clientReferences;
    return this;
  }

  public SearchCertificateOrder addClientReferencesItem(String clientReferencesItem) {
    if (this.clientReferences == null) {
      this.clientReferences = new ArrayList<>();
    }
    this.clientReferences.add(clientReferencesItem);
    return this;
  }

   /**
   * Client reference UUID
   * @return clientReferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"cli-123e4567-e89b-12d3-a456-426614174000\"]", value = "Client reference UUID")

  public List<String> getClientReferences() {
    return clientReferences;
  }


  public void setClientReferences(List<String> clientReferences) {
    this.clientReferences = clientReferences;
  }


  public SearchCertificateOrder startAfter(LocalDate startAfter) {
    
    this.startAfter = startAfter;
    return this;
  }

   /**
   * Certificate Order not starting after Date
   * @return startAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Mar 20 00:00:00 UTC 2018", value = "Certificate Order not starting after Date")

  public LocalDate getStartAfter() {
    return startAfter;
  }


  public void setStartAfter(LocalDate startAfter) {
    this.startAfter = startAfter;
  }


  public SearchCertificateOrder startBefore(LocalDate startBefore) {
    
    this.startBefore = startBefore;
    return this;
  }

   /**
   * Certificate Order not starting before Date
   * @return startBefore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Mar 25 00:00:00 UTC 2018", value = "Certificate Order not starting before Date")

  public LocalDate getStartBefore() {
    return startBefore;
  }


  public void setStartBefore(LocalDate startBefore) {
    this.startBefore = startBefore;
  }


  public SearchCertificateOrder attribute(String attribute) {
    
    this.attribute = attribute;
    return this;
  }

   /**
   * Any certificate attribute OID or value with optional wildcard attributes ? and/or *
   * @return attribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "s?me@emai* or 2.5.4.r or street", value = "Any certificate attribute OID or value with optional wildcard attributes ? and/or *")

  public String getAttribute() {
    return attribute;
  }


  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  public SearchCertificateOrder includeCertificateChain(Boolean includeCertificateChain) {
    
    this.includeCertificateChain = includeCertificateChain;
    return this;
  }

   /**
   * Include the certificate chain in the certificate order when available
   * @return includeCertificateChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Include the certificate chain in the certificate order when available")

  public Boolean getIncludeCertificateChain() {
    return includeCertificateChain;
  }


  public void setIncludeCertificateChain(Boolean includeCertificateChain) {
    this.includeCertificateChain = includeCertificateChain;
  }


  public SearchCertificateOrder tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SearchCertificateOrder addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Customer label/tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"my.cmdb-tag\",\"my.cmdb-label\"]", value = "Customer label/tags")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCertificateOrder searchCertificateOrder = (SearchCertificateOrder) o;
    return Objects.equals(this.orderReference, searchCertificateOrder.orderReference) &&
        Objects.equals(this.serialNumber, searchCertificateOrder.serialNumber) &&
        Objects.equals(this.orderStatus, searchCertificateOrder.orderStatus) &&
        Objects.equals(this.revocationReason, searchCertificateOrder.revocationReason) &&
        Objects.equals(this.clientReferences, searchCertificateOrder.clientReferences) &&
        Objects.equals(this.startAfter, searchCertificateOrder.startAfter) &&
        Objects.equals(this.startBefore, searchCertificateOrder.startBefore) &&
        Objects.equals(this.attribute, searchCertificateOrder.attribute) &&
        Objects.equals(this.includeCertificateChain, searchCertificateOrder.includeCertificateChain) &&
        Objects.equals(this.tags, searchCertificateOrder.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderReference, serialNumber, orderStatus, revocationReason, clientReferences, startAfter, startBefore, attribute, includeCertificateChain, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCertificateOrder {\n");
    sb.append("    orderReference: ").append(toIndentedString(orderReference)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    revocationReason: ").append(toIndentedString(revocationReason)).append("\n");
    sb.append("    clientReferences: ").append(toIndentedString(clientReferences)).append("\n");
    sb.append("    startAfter: ").append(toIndentedString(startAfter)).append("\n");
    sb.append("    startBefore: ").append(toIndentedString(startBefore)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    includeCertificateChain: ").append(toIndentedString(includeCertificateChain)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("orderReference");
    openapiFields.add("serialNumber");
    openapiFields.add("orderStatus");
    openapiFields.add("revocationReason");
    openapiFields.add("clientReferences");
    openapiFields.add("startAfter");
    openapiFields.add("startBefore");
    openapiFields.add("attribute");
    openapiFields.add("includeCertificateChain");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchCertificateOrder
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchCertificateOrder.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchCertificateOrder is not found in the empty JSON string", SearchCertificateOrder.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchCertificateOrder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchCertificateOrder` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("orderReference") != null && !jsonObj.get("orderReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderReference").toString()));
      }
      if (jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("orderStatus") != null && !jsonObj.get("orderStatus").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderStatus` to be an array in the JSON string but got `%s`", jsonObj.get("orderStatus").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("revocationReason") != null && !jsonObj.get("revocationReason").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `revocationReason` to be an array in the JSON string but got `%s`", jsonObj.get("revocationReason").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("clientReferences") != null && !jsonObj.get("clientReferences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientReferences` to be an array in the JSON string but got `%s`", jsonObj.get("clientReferences").toString()));
      }
      if (jsonObj.get("attribute") != null && !jsonObj.get("attribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attribute").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchCertificateOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchCertificateOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchCertificateOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchCertificateOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchCertificateOrder>() {
           @Override
           public void write(JsonWriter out, SearchCertificateOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchCertificateOrder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchCertificateOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchCertificateOrder
  * @throws IOException if the JSON string is invalid with respect to SearchCertificateOrder
  */
  public static SearchCertificateOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchCertificateOrder.class);
  }

 /**
  * Convert an instance of SearchCertificateOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

