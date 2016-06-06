package com.hevelian.identity.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import com.hevelian.identity.client.model.TenantDomainDTO;
import com.hevelian.identity.client.model.PrimitiveResultstring;
import com.hevelian.identity.client.model.TenantRequestDTO;
import com.hevelian.identity.client.model.Tenant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-06T07:47:22.284+02:00")
public class TenantcontrollerApi {
  private ApiClient apiClient;

  public TenantcontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TenantcontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * activateTenant
   * 
   * @param tenantDomainDTO tenantDomainDTO (required)
   * @throws ApiException if fails to make API call
   */
  public void activateTenantUsingPOST(TenantDomainDTO tenantDomainDTO) throws ApiException {
    Object localVarPostBody = tenantDomainDTO;
    
    // verify the required parameter 'tenantDomainDTO' is set
    if (tenantDomainDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tenantDomainDTO' when calling activateTenantUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/TenantService/activateTenant".replaceAll("\\{format\\}","json");

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
   * addTenant
   * 
   * @param tenant tenant (required)
   * @return PrimitiveResultstring
   * @throws ApiException if fails to make API call
   */
  public PrimitiveResultstring addTenantUsingPOST(TenantRequestDTO tenant) throws ApiException {
    Object localVarPostBody = tenant;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling addTenantUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/TenantService/addTenant".replaceAll("\\{format\\}","json");

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
   * deactivateTenant
   * 
   * @param tenantDomainDTO tenantDomainDTO (required)
   * @throws ApiException if fails to make API call
   */
  public void deactivateTenantUsingPOST(TenantDomainDTO tenantDomainDTO) throws ApiException {
    Object localVarPostBody = tenantDomainDTO;
    
    // verify the required parameter 'tenantDomainDTO' is set
    if (tenantDomainDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tenantDomainDTO' when calling deactivateTenantUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/TenantService/deactivateTenant".replaceAll("\\{format\\}","json");

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
   * deleteTenant
   * 
   * @param tenantDomainDTO tenantDomainDTO (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTenantUsingPOST(TenantDomainDTO tenantDomainDTO) throws ApiException {
    Object localVarPostBody = tenantDomainDTO;
    
    // verify the required parameter 'tenantDomainDTO' is set
    if (tenantDomainDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tenantDomainDTO' when calling deleteTenantUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/TenantService/deleteTenant".replaceAll("\\{format\\}","json");

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
   * getAllTenants
   * 
   * @return List<Tenant>
   * @throws ApiException if fails to make API call
   */
  public List<Tenant> getAllTenantsUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/TenantService/getAllTenants".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Tenant>> localVarReturnType = new GenericType<List<Tenant>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * getTenant
   * 
   * @param tenantDomainDTO tenantDomainDTO (required)
   * @return Tenant
   * @throws ApiException if fails to make API call
   */
  public Tenant getTenantUsingGET(TenantDomainDTO tenantDomainDTO) throws ApiException {
    Object localVarPostBody = tenantDomainDTO;
    
    // verify the required parameter 'tenantDomainDTO' is set
    if (tenantDomainDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'tenantDomainDTO' when calling getTenantUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/TenantService/getTenant".replaceAll("\\{format\\}","json");

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

    
    GenericType<Tenant> localVarReturnType = new GenericType<Tenant>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * updateTenant
   * 
   * @param tenant tenant (required)
   * @return Tenant
   * @throws ApiException if fails to make API call
   */
  public Tenant updateTenantUsingPOST(TenantRequestDTO tenant) throws ApiException {
    Object localVarPostBody = tenant;
    
    // verify the required parameter 'tenant' is set
    if (tenant == null) {
      throw new ApiException(400, "Missing the required parameter 'tenant' when calling updateTenantUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/TenantService/updateTenant".replaceAll("\\{format\\}","json");

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

    
    GenericType<Tenant> localVarReturnType = new GenericType<Tenant>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
