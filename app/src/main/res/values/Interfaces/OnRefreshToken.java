package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.UserModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 5/23/2017.
 */

public interface OnRefreshToken {

    @POST(Constants.REFRESH_URL)
    Call<UserModel> refreshToken(@Query("refresh_token")String refresh_token);
}
