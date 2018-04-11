package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Streaming;

/**
 * Created by Isaac Heri on 3/26/2017.
 */


    public interface OnDownloadFile {
        @Streaming
        @GET(Constants.MEDIA_URL)
        Call<ResponseBody> downloadFile(@Query("media_id") String media_id);
    }

