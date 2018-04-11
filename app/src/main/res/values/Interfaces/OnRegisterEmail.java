package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.UserModel;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 5/16/2017.
 */

public interface OnRegisterEmail {

    @POST(Constants.REGISTER_URL)
    Call<UserModel> register(@Query("name")String name, @Query("email")String email, @Query("password")String password, @Query("mode")String mode);
}
