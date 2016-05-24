package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-24T10:10:58.495+02:00")
public class EntitlementRequestDTO   {
  
  private String request = null;

  
  /**
   **/
  public EntitlementRequestDTO request(String request) {
    this.request = request;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("request")
  public String getRequest() {
    return request;
  }
  public void setRequest(String request) {
    this.request = request;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementRequestDTO entitlementRequestDTO = (EntitlementRequestDTO) o;
    return Objects.equals(this.request, entitlementRequestDTO.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementRequestDTO {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

