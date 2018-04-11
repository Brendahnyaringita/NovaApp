package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 5/16/2017.
 */

public interface OnPasswordForgot {
    @GET(Constants.PASSWORD_FORGOT_URL)
    Call<String> reset(@Query("email") String email);
}
