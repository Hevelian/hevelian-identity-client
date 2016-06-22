package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-22T08:33:27.695+02:00")
public class AddRemoveUserRolesRequestDTO   {
  
  private String name = null;
  private List<String> newRoles = new ArrayList<String>();
  private List<String> removedRoles = new ArrayList<String>();

  
  /**
   **/
  public AddRemoveUserRolesRequestDTO name(String name) {
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
  public AddRemoveUserRolesRequestDTO newRoles(List<String> newRoles) {
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

  
  /**
   **/
  public AddRemoveUserRolesRequestDTO removedRoles(List<String> removedRoles) {
    this.removedRoles = removedRoles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("removedRoles")
  public List<String> getRemovedRoles() {
    return removedRoles;
  }
  public void setRemovedRoles(List<String> removedRoles) {
    this.removedRoles = removedRoles;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRemoveUserRolesRequestDTO addRemoveUserRolesRequestDTO = (AddRemoveUserRolesRequestDTO) o;
    return Objects.equals(this.name, addRemoveUserRolesRequestDTO.name) &&
        Objects.equals(this.newRoles, addRemoveUserRolesRequestDTO.newRoles) &&
        Objects.equals(this.removedRoles, addRemoveUserRolesRequestDTO.removedRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newRoles, removedRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRemoveUserRolesRequestDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newRoles: ").append(toIndentedString(newRoles)).append("\n");
    sb.append("    removedRoles: ").append(toIndentedString(removedRoles)).append("\n");
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

