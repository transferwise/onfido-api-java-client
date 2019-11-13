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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * CheckCommon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-13T10:18:58.718Z[GMT]")
public class CheckCommon {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_DOWNLOAD_URI = "download_uri";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URI)
  private String downloadUri;

  public static final String SERIALIZED_NAME_FORM_URI = "form_uri";
  @SerializedName(SERIALIZED_NAME_FORM_URI)
  private String formUri;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirect_uri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_RESULTS_URI = "results_uri";
  @SerializedName(SERIALIZED_NAME_RESULTS_URI)
  private String resultsUri;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_REPORT_TYPE_GROUPS = "report_type_groups";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE_GROUPS)
  private List<String> reportTypeGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPRESS_FORM_EMAILS = "suppress_form_emails";
  @SerializedName(SERIALIZED_NAME_SUPPRESS_FORM_EMAILS)
  private Boolean suppressFormEmails;

  public static final String SERIALIZED_NAME_CHARGE_APPLICANT_FOR_CHECK = "charge_applicant_for_check";
  @SerializedName(SERIALIZED_NAME_CHARGE_APPLICANT_FOR_CHECK)
  private Boolean chargeApplicantForCheck;

  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_ASYNCHRONOUS = "asynchronous";
  @SerializedName(SERIALIZED_NAME_ASYNCHRONOUS)
  private Boolean asynchronous;

   /**
   * The unique identifier for the check. Read-only.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier for the check. Read-only.")
  public String getId() {
    return id;
  }

   /**
   * The date and time when this check was created. Read-only.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The date and time when this check was created. Read-only.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * The uri of this resource. Read-only.
   * @return href
  **/
  @ApiModelProperty(value = "The uri of this resource. Read-only.")
  public String getHref() {
    return href;
  }

   /**
   * The current state of the check in the checking process. Read-only.
   * @return status
  **/
  @ApiModelProperty(value = "The current state of the check in the checking process. Read-only.")
  public String getStatus() {
    return status;
  }

   /**
   * The overall result of the check, based on the results of the constituent reports. Read-only.
   * @return result
  **/
  @ApiModelProperty(value = "The overall result of the check, based on the results of the constituent reports. Read-only.")
  public String getResult() {
    return result;
  }

   /**
   * A link to a PDF output of the check results. Append &#x60;.pdf&#x60; to get the pdf file. Read-only.
   * @return downloadUri
  **/
  @ApiModelProperty(value = "A link to a PDF output of the check results. Append `.pdf` to get the pdf file. Read-only.")
  public String getDownloadUri() {
    return downloadUri;
  }

   /**
   * A link to the applicant form, if the check is of type &#x60;standard&#x60;. Read-only.
   * @return formUri
  **/
  @ApiModelProperty(value = "A link to the applicant form, if the check is of type `standard`. Read-only.")
  public String getFormUri() {
    return formUri;
  }

   /**
   * For &#x60;standard&#x60; checks, redirect to this URI when the applicant has submitted their data. Read-only.
   * @return redirectUri
  **/
  @ApiModelProperty(value = "For `standard` checks, redirect to this URI when the applicant has submitted their data. Read-only.")
  public String getRedirectUri() {
    return redirectUri;
  }

   /**
   * A link to the corresponding results page on the Onfido dashboard.
   * @return resultsUri
  **/
  @ApiModelProperty(value = "A link to the corresponding results page on the Onfido dashboard.")
  public String getResultsUri() {
    return resultsUri;
  }

  public CheckCommon type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the check, &#x60;standard&#x60; or &#x60;express&#x60;.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the check, `standard` or `express`.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CheckCommon reportTypeGroups(List<String> reportTypeGroups) {
    this.reportTypeGroups = reportTypeGroups;
    return this;
  }

  public CheckCommon addReportTypeGroupsItem(String reportTypeGroupsItem) {
    if (this.reportTypeGroups == null) {
      this.reportTypeGroups = new ArrayList<>();
    }
    this.reportTypeGroups.add(reportTypeGroupsItem);
    return this;
  }

   /**
   * Array containing ids of the Report type groups being requested for. Write-only.
   * @return reportTypeGroups
  **/
  @ApiModelProperty(value = "Array containing ids of the Report type groups being requested for. Write-only.")
  public List<String> getReportTypeGroups() {
    return reportTypeGroups;
  }

  public void setReportTypeGroups(List<String> reportTypeGroups) {
    this.reportTypeGroups = reportTypeGroups;
  }

  public CheckCommon tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CheckCommon addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Array of tags being assigned to this check.
   * @return tags
  **/
  @ApiModelProperty(value = "Array of tags being assigned to this check.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CheckCommon suppressFormEmails(Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
    return this;
  }

   /**
   * For standard checks, applicant form will not be automatically sent if this is set to true. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only. Defaults to false. 
   * @return suppressFormEmails
  **/
  @ApiModelProperty(value = "For standard checks, applicant form will not be automatically sent if this is set to true. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only. Defaults to false. ")
  public Boolean getSuppressFormEmails() {
    return suppressFormEmails;
  }

  public void setSuppressFormEmails(Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
  }

  public CheckCommon chargeApplicantForCheck(Boolean chargeApplicantForCheck) {
    this.chargeApplicantForCheck = chargeApplicantForCheck;
    return this;
  }

   /**
   * For standard checks, applicants will be presented with a mandatory payment screen before they can submit the applicant form, if this is set to true. In this case, your account will not be charged. Write-only. Defaults to false. 
   * @return chargeApplicantForCheck
  **/
  @ApiModelProperty(value = "For standard checks, applicants will be presented with a mandatory payment screen before they can submit the applicant form, if this is set to true. In this case, your account will not be charged. Write-only. Defaults to false. ")
  public Boolean getChargeApplicantForCheck() {
    return chargeApplicantForCheck;
  }

  public void setChargeApplicantForCheck(Boolean chargeApplicantForCheck) {
    this.chargeApplicantForCheck = chargeApplicantForCheck;
  }

  public CheckCommon brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * ID of the brand under which the check should be conducted. Write-only.
   * @return brandId
  **/
  @ApiModelProperty(value = "ID of the brand under which the check should be conducted. Write-only.")
  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public CheckCommon asynchronous(Boolean asynchronous) {
    this.asynchronous = asynchronous;
    return this;
  }

   /**
   * If this is set to true, we will queue checks for processing and return a response immediately. You can configure webhooks to notify you when the report is complete. Write-only. Defaults to false. 
   * @return asynchronous
  **/
  @ApiModelProperty(value = "If this is set to true, we will queue checks for processing and return a response immediately. You can configure webhooks to notify you when the report is complete. Write-only. Defaults to false. ")
  public Boolean getAsynchronous() {
    return asynchronous;
  }

  public void setAsynchronous(Boolean asynchronous) {
    this.asynchronous = asynchronous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckCommon checkCommon = (CheckCommon) o;
    return Objects.equals(this.id, checkCommon.id) &&
        Objects.equals(this.createdAt, checkCommon.createdAt) &&
        Objects.equals(this.href, checkCommon.href) &&
        Objects.equals(this.status, checkCommon.status) &&
        Objects.equals(this.result, checkCommon.result) &&
        Objects.equals(this.downloadUri, checkCommon.downloadUri) &&
        Objects.equals(this.formUri, checkCommon.formUri) &&
        Objects.equals(this.redirectUri, checkCommon.redirectUri) &&
        Objects.equals(this.resultsUri, checkCommon.resultsUri) &&
        Objects.equals(this.type, checkCommon.type) &&
        Objects.equals(this.reportTypeGroups, checkCommon.reportTypeGroups) &&
        Objects.equals(this.tags, checkCommon.tags) &&
        Objects.equals(this.suppressFormEmails, checkCommon.suppressFormEmails) &&
        Objects.equals(this.chargeApplicantForCheck, checkCommon.chargeApplicantForCheck) &&
        Objects.equals(this.brandId, checkCommon.brandId) &&
        Objects.equals(this.asynchronous, checkCommon.asynchronous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, href, status, result, downloadUri, formUri, redirectUri, resultsUri, type, reportTypeGroups, tags, suppressFormEmails, chargeApplicantForCheck, brandId, asynchronous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckCommon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    downloadUri: ").append(toIndentedString(downloadUri)).append("\n");
    sb.append("    formUri: ").append(toIndentedString(formUri)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    resultsUri: ").append(toIndentedString(resultsUri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reportTypeGroups: ").append(toIndentedString(reportTypeGroups)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    suppressFormEmails: ").append(toIndentedString(suppressFormEmails)).append("\n");
    sb.append("    chargeApplicantForCheck: ").append(toIndentedString(chargeApplicantForCheck)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
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

