package com.hevelian.identity.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import com.hevelian.identity.client.model.EntitlementAttributesDTO;
import com.hevelian.identity.client.model.PrimitiveResultboolean;
import com.hevelian.identity.client.model.PrimitiveResultstring;
import com.hevelian.identity.client.model.EntitlementRequestDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-12T08:17:28.344+02:00")
public class EntitlementcontrollerApi {
  private ApiClient apiClient;

  public EntitlementcontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntitlementcontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * getBooleanDecision
   * 
   * @param attributes attributes (required)
   * @return PrimitiveResultboolean
   * @throws ApiException if fails to make API call
   */
  public PrimitiveResultboolean getBooleanDecisionUsingPOST(EntitlementAttributesDTO attributes) throws ApiException {
    Object localVarPostBody = attributes;
    
    // verify the required parameter 'attributes' is set
    if (attributes == null) {
      throw new ApiException(400, "Missing the required parameter 'attributes' when calling getBooleanDecisionUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/EntitlementService/getBooleanDecision".replaceAll("\\{format\\}","json");

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

    
    GenericType<PrimitiveResultboolean> localVarReturnType = new GenericType<PrimitiveResultboolean>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * getDecisionByAttributes
   * 
   * @param attributes attributes (required)
   * @return PrimitiveResultstring
   * @throws ApiException if fails to make API call
   */
  public PrimitiveResultstring getDecisionByAttributesUsingPOST(EntitlementAttributesDTO attributes) throws ApiException {
    Object localVarPostBody = attributes;
    
    // verify the required parameter 'attributes' is set
    if (attributes == null) {
      throw new ApiException(400, "Missing the required parameter 'attributes' when calling getDecisionByAttributesUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/EntitlementService/getDecisionByAttributes".replaceAll("\\{format\\}","json");

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
   * getDecision
   * 
   * @param request request (required)
   * @return PrimitiveResultstring
   * @throws ApiException if fails to make API call
   */
  public PrimitiveResultstring getDecisionUsingPOST(EntitlementRequestDTO request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling getDecisionUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/EntitlementService/getDecision".replaceAll("\\{format\\}","json");

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
  
}
