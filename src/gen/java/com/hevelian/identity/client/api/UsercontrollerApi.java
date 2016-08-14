package com.hevelian.identity.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import com.hevelian.identity.client.model.AddRemoveUserRolesRequestDTO;
import com.hevelian.identity.client.model.AddRemoveUsersOfRoleRequestDTO;
import com.hevelian.identity.client.model.RoleRequestDTO;
import com.hevelian.identity.client.model.PrimitiveResultstring;
import com.hevelian.identity.client.model.NewUserRequestDTO;
import com.hevelian.identity.client.model.UserCredentialsRequestDTO;
import com.hevelian.identity.client.model.UserNameRequestDTO;
import com.hevelian.identity.client.model.IterableRole;
import com.hevelian.identity.client.model.IterableUser;
import com.hevelian.identity.client.model.UpdateRoleNameRequestDTO;
import com.hevelian.identity.client.model.UpdateUserRolesRequestDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-14T06:45:59.042+02:00")
public class UsercontrollerApi {
  private ApiClient apiClient;

  public UsercontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsercontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * addRemoveRolesOfUser
   * 
   * @param addRemoveUserRolesRequest addRemoveUserRolesRequest (required)
   * @throws ApiException if fails to make API call
   */
  public void addRemoveRolesOfUserUsingPOST(AddRemoveUserRolesRequestDTO addRemoveUserRolesRequest) throws ApiException {
    Object localVarPostBody = addRemoveUserRolesRequest;
    
    // verify the required parameter 'addRemoveUserRolesRequest' is set
    if (addRemoveUserRolesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'addRemoveUserRolesRequest' when calling addRemoveRolesOfUserUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/addRemoveRolesOfUser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * addRemoveUsersOfRole
   * 
   * @param addRemoveUsersOfRoleRequest addRemoveUsersOfRoleRequest (required)
   * @throws ApiException if fails to make API call
   */
  public void addRemoveUsersOfRoleUsingPOST(AddRemoveUsersOfRoleRequestDTO addRemoveUsersOfRoleRequest) throws ApiException {
    Object localVarPostBody = addRemoveUsersOfRoleRequest;
    
    // verify the required parameter 'addRemoveUsersOfRoleRequest' is set
    if (addRemoveUsersOfRoleRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'addRemoveUsersOfRoleRequest' when calling addRemoveUsersOfRoleUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/addRemoveUsersOfRole".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * addRole
   * 
   * @param role role (required)
   * @return PrimitiveResultstring
   * @throws ApiException if fails to make API call
   */
  public PrimitiveResultstring addRoleUsingPOST(RoleRequestDTO role) throws ApiException {
    Object localVarPostBody = role;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling addRoleUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/addRole".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<PrimitiveResultstring> localVarReturnType = new GenericType<PrimitiveResultstring>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * addUser
   * 
   * @param user user (required)
   * @return PrimitiveResultstring
   * @throws ApiException if fails to make API call
   */
  public PrimitiveResultstring addUserUsingPOST(NewUserRequestDTO user) throws ApiException {
    Object localVarPostBody = user;
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling addUserUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/addUser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<PrimitiveResultstring> localVarReturnType = new GenericType<PrimitiveResultstring>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * changePassword
   * 
   * @param userCredentials userCredentials (required)
   * @throws ApiException if fails to make API call
   */
  public void changePasswordUsingPOST1(UserCredentialsRequestDTO userCredentials) throws ApiException {
    Object localVarPostBody = userCredentials;
    
    // verify the required parameter 'userCredentials' is set
    if (userCredentials == null) {
      throw new ApiException(400, "Missing the required parameter 'userCredentials' when calling changePasswordUsingPOST1");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/changePassword".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * deleteRole
   * 
   * @param role role (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoleUsingPOST(RoleRequestDTO role) throws ApiException {
    Object localVarPostBody = role;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling deleteRoleUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/deleteRole".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * deleteUser
   * 
   * @param userName userName (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserUsingPOST(UserNameRequestDTO userName) throws ApiException {
    Object localVarPostBody = userName;
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling deleteUserUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/deleteUser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * getRolesOfUser
   * 
   * @param userName userName (required)
   * @return IterableRole
   * @throws ApiException if fails to make API call
   */
  public IterableRole getRolesOfUserUsingPOST(UserNameRequestDTO userName) throws ApiException {
    Object localVarPostBody = userName;
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling getRolesOfUserUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/getRolesOfUser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<IterableRole> localVarReturnType = new GenericType<IterableRole>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * getUsersOfRole
   * 
   * @param role role (required)
   * @return IterableUser
   * @throws ApiException if fails to make API call
   */
  public IterableUser getUsersOfRoleUsingPOST(RoleRequestDTO role) throws ApiException {
    Object localVarPostBody = role;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling getUsersOfRoleUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/getUsersOfRole".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<IterableUser> localVarReturnType = new GenericType<IterableUser>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * listRoles
   * 
   * @return IterableRole
   * @throws ApiException if fails to make API call
   */
  public IterableRole listRolesUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/UserService/listRoles".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<IterableRole> localVarReturnType = new GenericType<IterableRole>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * listUsers
   * 
   * @return IterableUser
   * @throws ApiException if fails to make API call
   */
  public IterableUser listUsersUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/UserService/listUsers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<IterableUser> localVarReturnType = new GenericType<IterableUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * updateRoleName
   * 
   * @param updateRoleNameRequest updateRoleNameRequest (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRoleNameUsingPOST(UpdateRoleNameRequestDTO updateRoleNameRequest) throws ApiException {
    Object localVarPostBody = updateRoleNameRequest;
    
    // verify the required parameter 'updateRoleNameRequest' is set
    if (updateRoleNameRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateRoleNameRequest' when calling updateRoleNameUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/updateRoleName".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * updateRolesOfUser
   * 
   * @param updateUserRolesRequest updateUserRolesRequest (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRolesOfUserUsingPOST(UpdateUserRolesRequestDTO updateUserRolesRequest) throws ApiException {
    Object localVarPostBody = updateUserRolesRequest;
    
    // verify the required parameter 'updateUserRolesRequest' is set
    if (updateUserRolesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateUserRolesRequest' when calling updateRolesOfUserUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/UserService/updateRolesOfUser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * updateUsersOfRole
   * 
   * @param roleName roleName (optional)
   * @param newUserNames newUserNames (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateUsersOfRoleUsingPOST(String roleName, List<String> newUserNames) throws ApiException {
    Object localVarPostBody = newUserNames;
    
    // create path and map variables
    String localVarPath = "/api/UserService/updateUsersOfRole".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
