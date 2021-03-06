/*
 * Onfido API
 * The Onfido API is used to submit check requests.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onfido.models;

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

/**
 * SdkTokenRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-08T09:20:21.785Z[GMT]")
public class SdkTokenRequest {
  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private String applicantId;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private String referrer;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public SdkTokenRequest applicantId(String applicantId) {
    this.applicantId = applicantId;
    return this;
  }

   /**
   * The unique identifier of the applicant
   * @return applicantId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the applicant")
  public String getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(String applicantId) {
    this.applicantId = applicantId;
  }

  public SdkTokenRequest referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * The referrer URL pattern
   * @return referrer
  **/
  @ApiModelProperty(value = "The referrer URL pattern")
  public String getReferrer() {
    return referrer;
  }

  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }

  public SdkTokenRequest applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The application ID (iOS or Android)
   * @return applicationId
  **/
  @ApiModelProperty(value = "The application ID (iOS or Android)")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SdkTokenRequest sdkTokenRequest = (SdkTokenRequest) o;
    return Objects.equals(this.applicantId, sdkTokenRequest.applicantId) &&
        Objects.equals(this.referrer, sdkTokenRequest.referrer) &&
        Objects.equals(this.applicationId, sdkTokenRequest.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, referrer, applicationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SdkTokenRequest {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

