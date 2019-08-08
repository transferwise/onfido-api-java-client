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
import com.onfido.models.ReportTypeGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportTypeGroupsList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-08T09:20:21.785Z[GMT]")
public class ReportTypeGroupsList {
  public static final String SERIALIZED_NAME_REPORT_TYPE_GROUPS = "report_type_groups";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE_GROUPS)
  private List<ReportTypeGroup> reportTypeGroups = new ArrayList<>();

  public ReportTypeGroupsList reportTypeGroups(List<ReportTypeGroup> reportTypeGroups) {
    this.reportTypeGroups = reportTypeGroups;
    return this;
  }

  public ReportTypeGroupsList addReportTypeGroupsItem(ReportTypeGroup reportTypeGroupsItem) {
    if (this.reportTypeGroups == null) {
      this.reportTypeGroups = new ArrayList<>();
    }
    this.reportTypeGroups.add(reportTypeGroupsItem);
    return this;
  }

   /**
   * Get reportTypeGroups
   * @return reportTypeGroups
  **/
  @ApiModelProperty(value = "")
  public List<ReportTypeGroup> getReportTypeGroups() {
    return reportTypeGroups;
  }

  public void setReportTypeGroups(List<ReportTypeGroup> reportTypeGroups) {
    this.reportTypeGroups = reportTypeGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportTypeGroupsList reportTypeGroupsList = (ReportTypeGroupsList) o;
    return Objects.equals(this.reportTypeGroups, reportTypeGroupsList.reportTypeGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportTypeGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTypeGroupsList {\n");
    sb.append("    reportTypeGroups: ").append(toIndentedString(reportTypeGroups)).append("\n");
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

