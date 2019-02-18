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
import com.onfido.models.GenericAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-18T15:40:11.893Z[GMT]")
public class Address {
  public static final String SERIALIZED_NAME_FLAT_NUMBER = "flat_number";
  @SerializedName(SERIALIZED_NAME_FLAT_NUMBER)
  private String flatNumber;

  public static final String SERIALIZED_NAME_BUILDING_NUMBER = "building_number";
  @SerializedName(SERIALIZED_NAME_BUILDING_NUMBER)
  private String buildingNumber;

  public static final String SERIALIZED_NAME_BUILDING_NAME = "building_name";
  @SerializedName(SERIALIZED_NAME_BUILDING_NAME)
  private String buildingName;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_SUB_STREET = "sub_street";
  @SerializedName(SERIALIZED_NAME_SUB_STREET)
  private String subStreet;

  public static final String SERIALIZED_NAME_TOWN = "town";
  @SerializedName(SERIALIZED_NAME_TOWN)
  private String town;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public Address flatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
    return this;
  }

   /**
   * The flat number of this address
   * @return flatNumber
  **/
  @ApiModelProperty(value = "The flat number of this address")
  public String getFlatNumber() {
    return flatNumber;
  }

  public void setFlatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
  }

  public Address buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * The building number of this address
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "The building number of this address")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public Address buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * The building name of this address
   * @return buildingName
  **/
  @ApiModelProperty(value = "The building name of this address")
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The street of the applicant’s address
   * @return street
  **/
  @ApiModelProperty(value = "The street of the applicant’s address")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address subStreet(String subStreet) {
    this.subStreet = subStreet;
    return this;
  }

   /**
   * The sub-street of the applicant’s address
   * @return subStreet
  **/
  @ApiModelProperty(value = "The sub-street of the applicant’s address")
  public String getSubStreet() {
    return subStreet;
  }

  public void setSubStreet(String subStreet) {
    this.subStreet = subStreet;
  }

  public Address town(String town) {
    this.town = town;
    return this;
  }

   /**
   * The town of the applicant’s address
   * @return town
  **/
  @ApiModelProperty(value = "The town of the applicant’s address")
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public Address postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * The postcode or ZIP of the applicant’s address
   * @return postcode
  **/
  @ApiModelProperty(value = "The postcode or ZIP of the applicant’s address")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The 3 character ISO country code of this address. For example, GBR is the country code for the United Kingdom
   * @return country
  **/
  @ApiModelProperty(value = "The 3 character ISO country code of this address. For example, GBR is the country code for the United Kingdom")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date the applicant started living at this address
   * @return startDate
  **/
  @ApiModelProperty(value = "The date the applicant started living at this address")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Address endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date the applicant left this address. If current residence, leave null
   * @return endDate
  **/
  @ApiModelProperty(value = "The date the applicant left this address. If current residence, leave null")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The address state. US states must use the USPS abbreviation (see also ISO 3166-2:US), for example AK, CA, or TX.
   * @return state
  **/
  @ApiModelProperty(value = "The address state. US states must use the USPS abbreviation (see also ISO 3166-2:US), for example AK, CA, or TX.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.flatNumber, address.flatNumber) &&
        Objects.equals(this.buildingNumber, address.buildingNumber) &&
        Objects.equals(this.buildingName, address.buildingName) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.subStreet, address.subStreet) &&
        Objects.equals(this.town, address.town) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.startDate, address.startDate) &&
        Objects.equals(this.endDate, address.endDate) &&
        Objects.equals(this.state, address.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flatNumber, buildingNumber, buildingName, street, subStreet, town, postcode, country, startDate, endDate, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    subStreet: ").append(toIndentedString(subStreet)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

