package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.UserModel;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 3/20/2017.
 */

public interface OnSaveUser {

    @POST(Constants.REGISTER_URL)
    Call<UserModel> registerUser(@Query("name")String username_, @Query("email")String email_, @Query("password")String password);
}
