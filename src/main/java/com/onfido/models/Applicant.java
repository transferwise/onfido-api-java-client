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
import com.onfido.models.Address;
import com.onfido.models.IdNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Applicant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-08T09:20:21.785Z[GMT]")
public class Applicant {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DELETE_AT = "delete_at";
  @SerializedName(SERIALIZED_NAME_DELETE_AT)
  private OffsetDateTime deleteAt;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_SANDBOX = "sandbox";
  @SerializedName(SERIALIZED_NAME_SANDBOX)
  private Boolean sandbox;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private LocalDate dob;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_MOTHERS_MAIDEN_NAME = "mothers_maiden_name";
  @SerializedName(SERIALIZED_NAME_MOTHERS_MAIDEN_NAME)
  private String mothersMaidenName;

  public static final String SERIALIZED_NAME_COUNTRY_OF_BIRTH = "country_of_birth";
  @SerializedName(SERIALIZED_NAME_COUNTRY_OF_BIRTH)
  private String countryOfBirth;

  public static final String SERIALIZED_NAME_TOWN_OF_BIRTH = "town_of_birth";
  @SerializedName(SERIALIZED_NAME_TOWN_OF_BIRTH)
  private String townOfBirth;

  public static final String SERIALIZED_NAME_PREVIOUS_LAST_NAME = "previous_last_name";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_LAST_NAME)
  private String previousLastName;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Address> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID_NUMBERS = "id_numbers";
  @SerializedName(SERIALIZED_NAME_ID_NUMBERS)
  private List<IdNumber> idNumbers = new ArrayList<>();

   /**
   * The unique identifier for the applicant. Read-only.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier for the applicant. Read-only.")
  public String getId() {
    return id;
  }

   /**
   * The date and time when this applicant was created. Read-only.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The date and time when this applicant was created. Read-only.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * The date and time when this applicant is scheduled to be deleted. Read-only.
   * @return deleteAt
  **/
  @ApiModelProperty(value = "The date and time when this applicant is scheduled to be deleted. Read-only.")
  public OffsetDateTime getDeleteAt() {
    return deleteAt;
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
   * Read-only.
   * @return sandbox
  **/
  @ApiModelProperty(value = "Read-only.")
  public Boolean getSandbox() {
    return sandbox;
  }

  public Applicant title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The applicant’s title
   * @return title
  **/
  @ApiModelProperty(value = "The applicant’s title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Applicant firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The applicant’s first name
   * @return firstName
  **/
  @ApiModelProperty(value = "The applicant’s first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Applicant middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The applicant’s middle name(s) or initial
   * @return middleName
  **/
  @ApiModelProperty(value = "The applicant’s middle name(s) or initial")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Applicant lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The applicant’s surname
   * @return lastName
  **/
  @ApiModelProperty(value = "The applicant’s surname")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Applicant email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The applicant’s email address. Required if doing a US check or a standard UK check.
   * @return email
  **/
  @ApiModelProperty(value = "The applicant’s email address. Required if doing a US check or a standard UK check.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Applicant gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The applicant’s gender. Valid values are male and female.
   * @return gender
  **/
  @ApiModelProperty(value = "The applicant’s gender. Valid values are male and female.")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Applicant dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

   /**
   * The applicant’s date of birth
   * @return dob
  **/
  @ApiModelProperty(value = "The applicant’s date of birth")
  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public Applicant telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * The applicant’s landline phone number
   * @return telephone
  **/
  @ApiModelProperty(value = "The applicant’s landline phone number")
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Applicant mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * The applicant’s mobile phone number
   * @return mobile
  **/
  @ApiModelProperty(value = "The applicant’s mobile phone number")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Applicant country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country where this applicant will be checked. This must be a three-letter ISO code e.g. GBR or USA
   * @return country
  **/
  @ApiModelProperty(value = "The country where this applicant will be checked. This must be a three-letter ISO code e.g. GBR or USA")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Applicant nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * The applicant&#39;s nationality. This must be a three-letter ISO code e.g. GBR or USA
   * @return nationality
  **/
  @ApiModelProperty(value = "The applicant's nationality. This must be a three-letter ISO code e.g. GBR or USA")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Applicant mothersMaidenName(String mothersMaidenName) {
    this.mothersMaidenName = mothersMaidenName;
    return this;
  }

   /**
   * The applicant’s mothers maiden name
   * @return mothersMaidenName
  **/
  @ApiModelProperty(value = "The applicant’s mothers maiden name")
  public String getMothersMaidenName() {
    return mothersMaidenName;
  }

  public void setMothersMaidenName(String mothersMaidenName) {
    this.mothersMaidenName = mothersMaidenName;
  }

  public Applicant countryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

   /**
   * The applicant’s country of birth
   * @return countryOfBirth
  **/
  @ApiModelProperty(value = "The applicant’s country of birth")
  public String getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public Applicant townOfBirth(String townOfBirth) {
    this.townOfBirth = townOfBirth;
    return this;
  }

   /**
   * The applicant’s town of birth
   * @return townOfBirth
  **/
  @ApiModelProperty(value = "The applicant’s town of birth")
  public String getTownOfBirth() {
    return townOfBirth;
  }

  public void setTownOfBirth(String townOfBirth) {
    this.townOfBirth = townOfBirth;
  }

  public Applicant previousLastName(String previousLastName) {
    this.previousLastName = previousLastName;
    return this;
  }

   /**
   * The applicant’s previous last name
   * @return previousLastName
  **/
  @ApiModelProperty(value = "The applicant’s previous last name")
  public String getPreviousLastName() {
    return previousLastName;
  }

  public void setPreviousLastName(String previousLastName) {
    this.previousLastName = previousLastName;
  }

  public Applicant addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Applicant addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public Applicant idNumbers(List<IdNumber> idNumbers) {
    this.idNumbers = idNumbers;
    return this;
  }

  public Applicant addIdNumbersItem(IdNumber idNumbersItem) {
    if (this.idNumbers == null) {
      this.idNumbers = new ArrayList<>();
    }
    this.idNumbers.add(idNumbersItem);
    return this;
  }

   /**
   * Get idNumbers
   * @return idNumbers
  **/
  @ApiModelProperty(value = "")
  public List<IdNumber> getIdNumbers() {
    return idNumbers;
  }

  public void setIdNumbers(List<IdNumber> idNumbers) {
    this.idNumbers = idNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Applicant applicant = (Applicant) o;
    return Objects.equals(this.id, applicant.id) &&
        Objects.equals(this.createdAt, applicant.createdAt) &&
        Objects.equals(this.deleteAt, applicant.deleteAt) &&
        Objects.equals(this.href, applicant.href) &&
        Objects.equals(this.sandbox, applicant.sandbox) &&
        Objects.equals(this.title, applicant.title) &&
        Objects.equals(this.firstName, applicant.firstName) &&
        Objects.equals(this.middleName, applicant.middleName) &&
        Objects.equals(this.lastName, applicant.lastName) &&
        Objects.equals(this.email, applicant.email) &&
        Objects.equals(this.gender, applicant.gender) &&
        Objects.equals(this.dob, applicant.dob) &&
        Objects.equals(this.telephone, applicant.telephone) &&
        Objects.equals(this.mobile, applicant.mobile) &&
        Objects.equals(this.country, applicant.country) &&
        Objects.equals(this.nationality, applicant.nationality) &&
        Objects.equals(this.mothersMaidenName, applicant.mothersMaidenName) &&
        Objects.equals(this.countryOfBirth, applicant.countryOfBirth) &&
        Objects.equals(this.townOfBirth, applicant.townOfBirth) &&
        Objects.equals(this.previousLastName, applicant.previousLastName) &&
        Objects.equals(this.addresses, applicant.addresses) &&
        Objects.equals(this.idNumbers, applicant.idNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, deleteAt, href, sandbox, title, firstName, middleName, lastName, email, gender, dob, telephone, mobile, country, nationality, mothersMaidenName, countryOfBirth, townOfBirth, previousLastName, addresses, idNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Applicant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    mothersMaidenName: ").append(toIndentedString(mothersMaidenName)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    townOfBirth: ").append(toIndentedString(townOfBirth)).append("\n");
    sb.append("    previousLastName: ").append(toIndentedString(previousLastName)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    idNumbers: ").append(toIndentedString(idNumbers)).append("\n");
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

