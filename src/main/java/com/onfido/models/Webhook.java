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
import java.util.ArrayList;
import java.util.List;


/**
 * Webhook
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T08:37:28.149Z")
public class Webhook   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("environments")
  private List<String> environments = new ArrayList<String>();

  @SerializedName("events")
  private List<String> events = new ArrayList<String>();

  public Webhook id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the webhook.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier of the webhook.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url of the webhook
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The url of the webhook")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Webhook token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Webhook secret token used to sign the webhook's payload
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "Webhook secret token used to sign the webhook's payload")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Webhook enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Determine if the webhook is active.
   * @return enabled
  **/
  @ApiModelProperty(example = "null", value = "Determine if the webhook is active.")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Webhook href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The API endpoint to retrieve the webhook.
   * @return href
  **/
  @ApiModelProperty(example = "null", value = "The API endpoint to retrieve the webhook.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Webhook environments(List<String> environments) {
    this.environments = environments;
    return this;
  }

  public Webhook addEnvironmentsItem(String environmentsItem) {
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * The environments from which the webhook will receive events.
   * @return environments
  **/
  @ApiModelProperty(example = "null", value = "The environments from which the webhook will receive events.")
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
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The events that will be published to the webhook.
   * @return events
  **/
  @ApiModelProperty(example = "null", value = "The events that will be published to the webhook.")
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
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.token, webhook.token) &&
        Objects.equals(this.enabled, webhook.enabled) &&
        Objects.equals(this.href, webhook.href) &&
        Objects.equals(this.environments, webhook.environments) &&
        Objects.equals(this.events, webhook.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, token, enabled, href, environments, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

