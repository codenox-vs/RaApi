/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.5.6
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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ProductValidity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductValidity {
  /**
   * Certificate validity types.   - YEARS: certificate validity in years.   - MONTHS: certificate validity in months.   - DAYS: certificate validity in days.   - HOURS: certificate validity in hours.   - MINUTES: certificate validity in minutes.   - SECONDS: certificate validity in seconds. 
   */
  @JsonAdapter(ValidityTypeEnum.Adapter.class)
  public enum ValidityTypeEnum {
    YEARS("YEARS"),
    
    MONTHS("MONTHS"),
    
    DAYS("DAYS"),
    
    HOURS("HOURS"),
    
    MINUTES("MINUTES"),
    
    SECONDS("SECONDS");

    private String value;

    ValidityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidityTypeEnum fromValue(String value) {
      for (ValidityTypeEnum b : ValidityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValidityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValidityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDITY_TYPE = "validityType";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TYPE)
  private ValidityTypeEnum validityType;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private Integer validity;

  public static final String SERIALIZED_NAME_VALIDITY_OPTIONS = "validityOptions";
  @SerializedName(SERIALIZED_NAME_VALIDITY_OPTIONS)
  private List<Integer> validityOptions = null;

  public ProductValidity() { 
  }

  
  public ProductValidity(
     ValidityTypeEnum validityType, 
     Integer validity, 
     List<Integer> validityOptions
  ) {
    this();
    this.validityType = validityType;
    this.validity = validity;
    this.validityOptions = validityOptions;
  }

   /**
   * Certificate validity types.   - YEARS: certificate validity in years.   - MONTHS: certificate validity in months.   - DAYS: certificate validity in days.   - HOURS: certificate validity in hours.   - MINUTES: certificate validity in minutes.   - SECONDS: certificate validity in seconds. 
   * @return validityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "HOURS", required = true, value = "Certificate validity types.   - YEARS: certificate validity in years.   - MONTHS: certificate validity in months.   - DAYS: certificate validity in days.   - HOURS: certificate validity in hours.   - MINUTES: certificate validity in minutes.   - SECONDS: certificate validity in seconds. ")

  public ValidityTypeEnum getValidityType() {
    return validityType;
  }




   /**
   * The default certificate validity
   * @return validity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The default certificate validity")

  public Integer getValidity() {
    return validity;
  }




   /**
   * Optional certificate validity values
   * @return validityOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional certificate validity values")

  public List<Integer> getValidityOptions() {
    return validityOptions;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductValidity productValidity = (ProductValidity) o;
    return Objects.equals(this.validityType, productValidity.validityType) &&
        Objects.equals(this.validity, productValidity.validity) &&
        Objects.equals(this.validityOptions, productValidity.validityOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(validityType, validity, validityOptions);
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
    sb.append("class ProductValidity {\n");
    sb.append("    validityType: ").append(toIndentedString(validityType)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    validityOptions: ").append(toIndentedString(validityOptions)).append("\n");
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
    openapiFields.add("validityType");
    openapiFields.add("validity");
    openapiFields.add("validityOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("validityType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductValidity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProductValidity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductValidity is not found in the empty JSON string", ProductValidity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProductValidity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductValidity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductValidity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("validityType") != null && !jsonObj.get("validityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validityType").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("validityOptions") != null && !jsonObj.get("validityOptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validityOptions` to be an array in the JSON string but got `%s`", jsonObj.get("validityOptions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductValidity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductValidity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductValidity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductValidity.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductValidity>() {
           @Override
           public void write(JsonWriter out, ProductValidity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductValidity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductValidity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductValidity
  * @throws IOException if the JSON string is invalid with respect to ProductValidity
  */
  public static ProductValidity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductValidity.class);
  }

 /**
  * Convert an instance of ProductValidity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

