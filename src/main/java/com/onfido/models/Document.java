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
import java.time.OffsetDateTime;


/**
 * Document
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-14T11:19:36.236Z")
public class Document   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("file_name")
  private String fileName = null;

  @SerializedName("file_size")
  private Integer fileSize = null;

  @SerializedName("file_type")
  private String fileType = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("download_href")
  private String downloadHref = null;

  public Document id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the document
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier for the document")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Document createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the document was uploaded
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "The date and time at which the document was uploaded")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Document fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the uploaded file
   * @return fileName
  **/
  @ApiModelProperty(example = "null", value = "The name of the uploaded file")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Document fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The size of the file in bytes
   * @return fileSize
  **/
  @ApiModelProperty(example = "null", value = "The size of the file in bytes")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public Document fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * The file type of the uploaded file
   * @return fileType
  **/
  @ApiModelProperty(example = "null", value = "The file type of the uploaded file")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public Document type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of document
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The type of document")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Document side(String side) {
    this.side = side;
    return this;
  }

   /**
   * The side of the document, if applicable. The possible values are front and back
   * @return side
  **/
  @ApiModelProperty(example = "null", value = "The side of the document, if applicable. The possible values are front and back")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public Document href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The uri of this resource
   * @return href
  **/
  @ApiModelProperty(example = "null", value = "The uri of this resource")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Document downloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
    return this;
  }

   /**
   * The uri that can be used to download the document
   * @return downloadHref
  **/
  @ApiModelProperty(example = "null", value = "The uri that can be used to download the document")
  public String getDownloadHref() {
    return downloadHref;
  }

  public void setDownloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.id, document.id) &&
        Objects.equals(this.createdAt, document.createdAt) &&
        Objects.equals(this.fileName, document.fileName) &&
        Objects.equals(this.fileSize, document.fileSize) &&
        Objects.equals(this.fileType, document.fileType) &&
        Objects.equals(this.type, document.type) &&
        Objects.equals(this.side, document.side) &&
        Objects.equals(this.href, document.href) &&
        Objects.equals(this.downloadHref, document.downloadHref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, fileName, fileSize, fileType, type, side, href, downloadHref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    downloadHref: ").append(toIndentedString(downloadHref)).append("\n");
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

