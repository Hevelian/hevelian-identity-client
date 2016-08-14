package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-14T06:45:59.042+02:00")
public class UpdateUserRolesRequestDTO   {
  
  private String name = null;
  private List<String> newRoles = new ArrayList<String>();

  
  /**
   **/
  public UpdateUserRolesRequestDTO name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public UpdateUserRolesRequestDTO newRoles(List<String> newRoles) {
    this.newRoles = newRoles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("newRoles")
  public List<String> getNewRoles() {
    return newRoles;
  }
  public void setNewRoles(List<String> newRoles) {
    this.newRoles = newRoles;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRolesRequestDTO updateUserRolesRequestDTO = (UpdateUserRolesRequestDTO) o;
    return Objects.equals(this.name, updateUserRolesRequestDTO.name) &&
        Objects.equals(this.newRoles, updateUserRolesRequestDTO.newRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRolesRequestDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newRoles: ").append(toIndentedString(newRoles)).append("\n");
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

