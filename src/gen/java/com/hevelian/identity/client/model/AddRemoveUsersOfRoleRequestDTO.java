package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-22T08:33:27.695+02:00")
public class AddRemoveUsersOfRoleRequestDTO   {
  
  private String name = null;
  private List<String> newUserNames = new ArrayList<String>();
  private List<String> removedUserNames = new ArrayList<String>();

  
  /**
   **/
  public AddRemoveUsersOfRoleRequestDTO name(String name) {
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
  public AddRemoveUsersOfRoleRequestDTO newUserNames(List<String> newUserNames) {
    this.newUserNames = newUserNames;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("newUserNames")
  public List<String> getNewUserNames() {
    return newUserNames;
  }
  public void setNewUserNames(List<String> newUserNames) {
    this.newUserNames = newUserNames;
  }

  
  /**
   **/
  public AddRemoveUsersOfRoleRequestDTO removedUserNames(List<String> removedUserNames) {
    this.removedUserNames = removedUserNames;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("removedUserNames")
  public List<String> getRemovedUserNames() {
    return removedUserNames;
  }
  public void setRemovedUserNames(List<String> removedUserNames) {
    this.removedUserNames = removedUserNames;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRemoveUsersOfRoleRequestDTO addRemoveUsersOfRoleRequestDTO = (AddRemoveUsersOfRoleRequestDTO) o;
    return Objects.equals(this.name, addRemoveUsersOfRoleRequestDTO.name) &&
        Objects.equals(this.newUserNames, addRemoveUsersOfRoleRequestDTO.newUserNames) &&
        Objects.equals(this.removedUserNames, addRemoveUsersOfRoleRequestDTO.removedUserNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newUserNames, removedUserNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRemoveUsersOfRoleRequestDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newUserNames: ").append(toIndentedString(newUserNames)).append("\n");
    sb.append("    removedUserNames: ").append(toIndentedString(removedUserNames)).append("\n");
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

