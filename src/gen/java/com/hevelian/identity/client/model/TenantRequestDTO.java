package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hevelian.identity.client.model.UserRequestDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-12T08:17:28.344+02:00")
public class TenantRequestDTO   {
  
  private Boolean active = null;
  private String domain = null;
  private UserRequestDTO tenantAdmin = null;

  
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

  
  /**
   **/
  public TenantRequestDTO tenantAdmin(UserRequestDTO tenantAdmin) {
    this.tenantAdmin = tenantAdmin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tenantAdmin")
  public UserRequestDTO getTenantAdmin() {
    return tenantAdmin;
  }
  public void setTenantAdmin(UserRequestDTO tenantAdmin) {
    this.tenantAdmin = tenantAdmin;
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
        Objects.equals(this.domain, tenantRequestDTO.domain) &&
        Objects.equals(this.tenantAdmin, tenantRequestDTO.tenantAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, domain, tenantAdmin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantRequestDTO {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    tenantAdmin: ").append(toIndentedString(tenantAdmin)).append("\n");
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

