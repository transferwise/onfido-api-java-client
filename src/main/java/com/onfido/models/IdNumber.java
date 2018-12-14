/**
 * Onfido API
 * The Onfido API is used to submit check requests.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.onfido.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * IdNumber
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-14T11:19:36.236Z")
public class IdNumber   {
  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("state_code")
  private String stateCode = null;

  public IdNumber type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of ID number. Valid values are ssn, tax_id, identity_card and driving_license
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of ID number. Valid values are ssn, tax_id, identity_card and driving_license")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IdNumber value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of ID number
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "Value of ID number")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IdNumber stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Two letter code of issuing state (state-issued driving licenses only)
   * @return stateCode
  **/
  @ApiModelProperty(example = "null", value = "Two letter code of issuing state (state-issued driving licenses only)")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdNumber idNumber = (IdNumber) o;
    return Objects.equals(this.type, idNumber.type) &&
        Objects.equals(this.value, idNumber.value) &&
        Objects.equals(this.stateCode, idNumber.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, stateCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdNumber {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

