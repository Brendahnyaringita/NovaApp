package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.UserModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 3/22/2017.
 */

public interface OnGetUserDetails {
    @GET(Constants.USER_DETAILS_URL)
    Call<UserModel> getDetails(@Query("id") String id);
}
