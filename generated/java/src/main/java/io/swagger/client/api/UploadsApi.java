/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Fault;
import java.io.File;
import io.swagger.client.model.Upload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UploadsApi {
    private ApiClient apiClient;

    public UploadsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UploadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createUpload
     * @param file The uploaded file. (optional)
     * @param name The desired name of the resulting activity. (optional)
     * @param description The desired description of the resulting activity. (optional)
     * @param trainer Whether the resulting activity should be marked as having been performed on a trainer. (optional)
     * @param commute Whether the resulting activity should be tagged as a commute. (optional)
     * @param dataType The format of the uploaded file. (optional)
     * @param externalId The desired external identifier of the resulting activity. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createUploadCall(File file, String name, String description, String trainer, String commute, String dataType, String externalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/uploads";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);
        if (name != null)
        localVarFormParams.put("name", name);
        if (description != null)
        localVarFormParams.put("description", description);
        if (trainer != null)
        localVarFormParams.put("trainer", trainer);
        if (commute != null)
        localVarFormParams.put("commute", commute);
        if (dataType != null)
        localVarFormParams.put("data_type", dataType);
        if (externalId != null)
        localVarFormParams.put("external_id", externalId);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "strava_oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createUploadValidateBeforeCall(File file, String name, String description, String trainer, String commute, String dataType, String externalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createUploadCall(file, name, description, trainer, commute, dataType, externalId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upload Activity
     * Uploads a new data file to create an activity from. Requires activity:write scope.
     * @param file The uploaded file. (optional)
     * @param name The desired name of the resulting activity. (optional)
     * @param description The desired description of the resulting activity. (optional)
     * @param trainer Whether the resulting activity should be marked as having been performed on a trainer. (optional)
     * @param commute Whether the resulting activity should be tagged as a commute. (optional)
     * @param dataType The format of the uploaded file. (optional)
     * @param externalId The desired external identifier of the resulting activity. (optional)
     * @return Upload
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Upload createUpload(File file, String name, String description, String trainer, String commute, String dataType, String externalId) throws ApiException {
        ApiResponse<Upload> resp = createUploadWithHttpInfo(file, name, description, trainer, commute, dataType, externalId);
        return resp.getData();
    }

    /**
     * Upload Activity
     * Uploads a new data file to create an activity from. Requires activity:write scope.
     * @param file The uploaded file. (optional)
     * @param name The desired name of the resulting activity. (optional)
     * @param description The desired description of the resulting activity. (optional)
     * @param trainer Whether the resulting activity should be marked as having been performed on a trainer. (optional)
     * @param commute Whether the resulting activity should be tagged as a commute. (optional)
     * @param dataType The format of the uploaded file. (optional)
     * @param externalId The desired external identifier of the resulting activity. (optional)
     * @return ApiResponse&lt;Upload&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Upload> createUploadWithHttpInfo(File file, String name, String description, String trainer, String commute, String dataType, String externalId) throws ApiException {
        com.squareup.okhttp.Call call = createUploadValidateBeforeCall(file, name, description, trainer, commute, dataType, externalId, null, null);
        Type localVarReturnType = new TypeToken<Upload>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload Activity (asynchronously)
     * Uploads a new data file to create an activity from. Requires activity:write scope.
     * @param file The uploaded file. (optional)
     * @param name The desired name of the resulting activity. (optional)
     * @param description The desired description of the resulting activity. (optional)
     * @param trainer Whether the resulting activity should be marked as having been performed on a trainer. (optional)
     * @param commute Whether the resulting activity should be tagged as a commute. (optional)
     * @param dataType The format of the uploaded file. (optional)
     * @param externalId The desired external identifier of the resulting activity. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createUploadAsync(File file, String name, String description, String trainer, String commute, String dataType, String externalId, final ApiCallback<Upload> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createUploadValidateBeforeCall(file, name, description, trainer, commute, dataType, externalId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Upload>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUploadById
     * @param uploadId The identifier of the upload. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUploadByIdCall(Long uploadId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/uploads/{uploadId}"
            .replaceAll("\\{" + "uploadId" + "\\}", apiClient.escapeString(uploadId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "strava_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUploadByIdValidateBeforeCall(Long uploadId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new ApiException("Missing the required parameter 'uploadId' when calling getUploadById(Async)");
        }
        

        com.squareup.okhttp.Call call = getUploadByIdCall(uploadId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Upload
     * Returns an upload for a given identifier. Requires activity:write scope.
     * @param uploadId The identifier of the upload. (required)
     * @return Upload
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Upload getUploadById(Long uploadId) throws ApiException {
        ApiResponse<Upload> resp = getUploadByIdWithHttpInfo(uploadId);
        return resp.getData();
    }

    /**
     * Get Upload
     * Returns an upload for a given identifier. Requires activity:write scope.
     * @param uploadId The identifier of the upload. (required)
     * @return ApiResponse&lt;Upload&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Upload> getUploadByIdWithHttpInfo(Long uploadId) throws ApiException {
        com.squareup.okhttp.Call call = getUploadByIdValidateBeforeCall(uploadId, null, null);
        Type localVarReturnType = new TypeToken<Upload>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Upload (asynchronously)
     * Returns an upload for a given identifier. Requires activity:write scope.
     * @param uploadId The identifier of the upload. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUploadByIdAsync(Long uploadId, final ApiCallback<Upload> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUploadByIdValidateBeforeCall(uploadId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Upload>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
