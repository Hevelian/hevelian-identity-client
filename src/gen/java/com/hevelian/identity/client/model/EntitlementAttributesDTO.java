package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-06T08:19:35.649+02:00")
public class EntitlementAttributesDTO   {
  
  private String action = null;
  private String environment = null;
  private String resource = null;
  private String subject = null;

  
  /**
   **/
  public EntitlementAttributesDTO action(String action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   **/
  public EntitlementAttributesDTO environment(String environment) {
    this.environment = environment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  
  /**
   **/
  public EntitlementAttributesDTO resource(String resource) {
    this.resource = resource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }
  public void setResource(String resource) {
    this.resource = resource;
  }

  
  /**
   **/
  public EntitlementAttributesDTO subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementAttributesDTO entitlementAttributesDTO = (EntitlementAttributesDTO) o;
    return Objects.equals(this.action, entitlementAttributesDTO.action) &&
        Objects.equals(this.environment, entitlementAttributesDTO.environment) &&
        Objects.equals(this.resource, entitlementAttributesDTO.resource) &&
        Objects.equals(this.subject, entitlementAttributesDTO.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, environment, resource, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementAttributesDTO {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

