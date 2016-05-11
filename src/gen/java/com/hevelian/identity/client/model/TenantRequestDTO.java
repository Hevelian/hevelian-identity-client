package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T11:41:01.432+02:00")
public class TenantRequestDTO   {
  
  private Boolean active = null;
  private String domain = null;

  
  /**
   **/
  public TenantRequestDTO active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   **/
  public TenantRequestDTO domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantRequestDTO tenantRequestDTO = (TenantRequestDTO) o;
    return Objects.equals(this.active, tenantRequestDTO.active) &&
        Objects.equals(this.domain, tenantRequestDTO.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, domain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantRequestDTO {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

