package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.UserModel;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 5/16/2017.
 */

public interface OnSaveSocial {


    @POST(Constants.SOCIAL_URL)
    Call<UserModel> saveSocial(@Query("name")String name, @Query("email")String email, @Query("social")String hash);


}
