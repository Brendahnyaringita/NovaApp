package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.UserModel;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 6/6/2017.
 */

public interface OnGetLogin {

    @POST(Constants.LOGIN_URL)
    Call<UserModel> login(@Query("email") String email, @Query("password") String password);
}
