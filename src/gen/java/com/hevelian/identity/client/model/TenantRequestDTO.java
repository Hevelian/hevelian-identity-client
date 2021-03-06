/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
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


package com.hevelian.identity.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.hevelian.identity.client.model.TenantAdminRequestDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * TenantRequestDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-21T06:58:56.984+01:00")
public class TenantRequestDTO   {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("contactEmail")
  private String contactEmail = null;

  @SerializedName("dateActiveChanged")
  private DateTime dateActiveChanged = null;

  @SerializedName("dateCreated")
  private DateTime dateCreated = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("tenantAdmin")
  private TenantAdminRequestDTO tenantAdmin = null;

  public TenantRequestDTO active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public TenantRequestDTO contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public TenantRequestDTO dateActiveChanged(DateTime dateActiveChanged) {
    this.dateActiveChanged = dateActiveChanged;
    return this;
  }

   /**
   * Get dateActiveChanged
   * @return dateActiveChanged
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDateActiveChanged() {
    return dateActiveChanged;
  }

  public void setDateActiveChanged(DateTime dateActiveChanged) {
    this.dateActiveChanged = dateActiveChanged;
  }

  public TenantRequestDTO dateCreated(DateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(DateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public TenantRequestDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TenantRequestDTO domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public TenantRequestDTO tenantAdmin(TenantAdminRequestDTO tenantAdmin) {
    this.tenantAdmin = tenantAdmin;
    return this;
  }

   /**
   * Get tenantAdmin
   * @return tenantAdmin
  **/
  @ApiModelProperty(example = "null", value = "")
  public TenantAdminRequestDTO getTenantAdmin() {
    return tenantAdmin;
  }

  public void setTenantAdmin(TenantAdminRequestDTO tenantAdmin) {
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
        Objects.equals(this.contactEmail, tenantRequestDTO.contactEmail) &&
        Objects.equals(this.dateActiveChanged, tenantRequestDTO.dateActiveChanged) &&
        Objects.equals(this.dateCreated, tenantRequestDTO.dateCreated) &&
        Objects.equals(this.description, tenantRequestDTO.description) &&
        Objects.equals(this.domain, tenantRequestDTO.domain) &&
        Objects.equals(this.tenantAdmin, tenantRequestDTO.tenantAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, contactEmail, dateActiveChanged, dateCreated, description, domain, tenantAdmin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantRequestDTO {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    dateActiveChanged: ").append(toIndentedString(dateActiveChanged)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

