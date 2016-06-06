package com.hevelian.identity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-06T08:19:35.649+02:00")
public class LoginDTO   {
  
  private String password = null;
  private Boolean rememberMe = null;
  private String username = null;

  
  /**
   **/
  public LoginDTO password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  public LoginDTO rememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rememberMe")
  public Boolean getRememberMe() {
    return rememberMe;
  }
  public void setRememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
  }

  
  /**
   **/
  public LoginDTO username(String username) {
    this.username = username;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginDTO loginDTO = (LoginDTO) o;
    return Objects.equals(this.password, loginDTO.password) &&
        Objects.equals(this.rememberMe, loginDTO.rememberMe) &&
        Objects.equals(this.username, loginDTO.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, rememberMe, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginDTO {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

