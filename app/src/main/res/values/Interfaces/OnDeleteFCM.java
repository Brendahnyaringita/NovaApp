package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 6/5/2017.
 */

public interface OnDeleteFCM {

    @GET(Constants.FCM_DELETE_URL)
    Call<String> delete(@Query("mode") String mode);
}
