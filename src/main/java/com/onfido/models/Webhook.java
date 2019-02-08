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
import java.util.ArrayList;
import java.util.List;

/**
 * Webhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-08T10:17:04.685Z[GMT]")
public class Webhook {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<String> environments = new ArrayList<>();

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<>();

   /**
   * The unique identifier of the webhook. Read-only.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the webhook. Read-only.")
  public String getId() {
    return id;
  }

   /**
   * Webhook secret token used to sign the webhook&#39;s payload. Read-only.
   * @return token
  **/
  @ApiModelProperty(value = "Webhook secret token used to sign the webhook's payload. Read-only.")
  public String getToken() {
    return token;
  }

   /**
   * The API endpoint to retrieve the webhook. Read-only.
   * @return href
  **/
  @ApiModelProperty(value = "The API endpoint to retrieve the webhook. Read-only.")
  public String getHref() {
    return href;
  }

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url that will listen to notifications (must be https).
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The url that will listen to notifications (must be https).")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Webhook enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Determine if the webhook is active.
   * @return enabled
  **/
  @ApiModelProperty(value = "Determine if the webhook is active.")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Webhook environments(List<String> environments) {
    this.environments = environments;
    return this;
  }

  public Webhook addEnvironmentsItem(String environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * The environments from which the webhook will receive events. Allowed values are “sandbox” and “live”. If the environments parameter is omitted the webhook will receive events from both environments. 
   * @return environments
  **/
  @ApiModelProperty(value = "The environments from which the webhook will receive events. Allowed values are “sandbox” and “live”. If the environments parameter is omitted the webhook will receive events from both environments. ")
  public List<String> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<String> environments) {
    this.environments = environments;
  }

  public Webhook events(List<String> events) {
    this.events = events;
    return this;
  }

  public Webhook addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The events that will be published to the webhook. The supported events are: &#x60;report.completed&#x60;, &#x60;report.withdrawn&#x60;, &#x60;check.completed&#x60;, &#x60;check.started&#x60;, &#x60;check.form_opened&#x60;, &#x60;check.form_completed&#x60;. If the events parameter is omitted all the events will be subscribed. 
   * @return events
  **/
  @ApiModelProperty(value = "The events that will be published to the webhook. The supported events are: `report.completed`, `report.withdrawn`, `check.completed`, `check.started`, `check.form_opened`, `check.form_completed`. If the events parameter is omitted all the events will be subscribed. ")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.token, webhook.token) &&
        Objects.equals(this.href, webhook.href) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.enabled, webhook.enabled) &&
        Objects.equals(this.environments, webhook.environments) &&
        Objects.equals(this.events, webhook.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, href, url, enabled, environments, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

