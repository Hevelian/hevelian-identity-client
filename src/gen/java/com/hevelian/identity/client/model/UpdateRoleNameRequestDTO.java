package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-22T08:33:27.695+02:00")
public class UpdateRoleNameRequestDTO   {
  
  private String name = null;
  private String newName = null;

  
  /**
   **/
  public UpdateRoleNameRequestDTO name(String name) {
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
  public UpdateRoleNameRequestDTO newName(String newName) {
    this.newName = newName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("newName")
  public String getNewName() {
    return newName;
  }
  public void setNewName(String newName) {
    this.newName = newName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRoleNameRequestDTO updateRoleNameRequestDTO = (UpdateRoleNameRequestDTO) o;
    return Objects.equals(this.name, updateRoleNameRequestDTO.name) &&
        Objects.equals(this.newName, updateRoleNameRequestDTO.newName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRoleNameRequestDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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

