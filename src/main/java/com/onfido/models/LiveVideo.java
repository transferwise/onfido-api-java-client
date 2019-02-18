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

/**
 * LiveVideo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-18T15:40:11.893Z[GMT]")
public class LiveVideo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_DOWNLOAD_HREF = "download_href";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_HREF)
  private String downloadHref;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_SIZE = "file_size";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Integer fileSize;

  public static final String SERIALIZED_NAME_FILE_TYPE = "file_type";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private String fileType;

  public LiveVideo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the video.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier for the video.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LiveVideo createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the video was uploaded.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The date and time at which the video was uploaded.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LiveVideo href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The uri of this resource.
   * @return href
  **/
  @ApiModelProperty(value = "The uri of this resource.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public LiveVideo downloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
    return this;
  }

   /**
   * The uri that can be used to download the video.
   * @return downloadHref
  **/
  @ApiModelProperty(value = "The uri that can be used to download the video.")
  public String getDownloadHref() {
    return downloadHref;
  }

  public void setDownloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
  }

  public LiveVideo fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the uploaded file.
   * @return fileName
  **/
  @ApiModelProperty(value = "The name of the uploaded file.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public LiveVideo fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The size of the file in bytes.
   * @return fileSize
  **/
  @ApiModelProperty(value = "The size of the file in bytes.")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public LiveVideo fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * The file type of the uploaded file.
   * @return fileType
  **/
  @ApiModelProperty(value = "The file type of the uploaded file.")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveVideo liveVideo = (LiveVideo) o;
    return Objects.equals(this.id, liveVideo.id) &&
        Objects.equals(this.createdAt, liveVideo.createdAt) &&
        Objects.equals(this.href, liveVideo.href) &&
        Objects.equals(this.downloadHref, liveVideo.downloadHref) &&
        Objects.equals(this.fileName, liveVideo.fileName) &&
        Objects.equals(this.fileSize, liveVideo.fileSize) &&
        Objects.equals(this.fileType, liveVideo.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, href, downloadHref, fileName, fileSize, fileType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveVideo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    downloadHref: ").append(toIndentedString(downloadHref)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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

