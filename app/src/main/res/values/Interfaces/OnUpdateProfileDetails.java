package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.ResponseUserModel;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 3/28/2017.
 */

public interface OnUpdateProfileDetails {

    @POST(Constants.UPDATE_PROFILE_URL)
    Call<ResponseUserModel> update(@Query("name") String name, @Query("phone_number")String phone_number);
}
