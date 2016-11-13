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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * UpdateUsersOfRoleRequestDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-13T17:51:29.818+01:00")
public class UpdateUsersOfRoleRequestDTO   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("newUserNames")
  private List<String> newUserNames = new ArrayList<String>();

  public UpdateUsersOfRoleRequestDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateUsersOfRoleRequestDTO newUserNames(List<String> newUserNames) {
    this.newUserNames = newUserNames;
    return this;
  }

  public UpdateUsersOfRoleRequestDTO addNewUserNamesItem(String newUserNamesItem) {
    this.newUserNames.add(newUserNamesItem);
    return this;
  }

   /**
   * Get newUserNames
   * @return newUserNames
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getNewUserNames() {
    return newUserNames;
  }

  public void setNewUserNames(List<String> newUserNames) {
    this.newUserNames = newUserNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUsersOfRoleRequestDTO updateUsersOfRoleRequestDTO = (UpdateUsersOfRoleRequestDTO) o;
    return Objects.equals(this.name, updateUsersOfRoleRequestDTO.name) &&
        Objects.equals(this.newUserNames, updateUsersOfRoleRequestDTO.newUserNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newUserNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUsersOfRoleRequestDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newUserNames: ").append(toIndentedString(newUserNames)).append("\n");
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

