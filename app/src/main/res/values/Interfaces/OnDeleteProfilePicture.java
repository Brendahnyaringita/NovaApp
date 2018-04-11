package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.ResponseUserModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 4/19/2017.
 */

public interface OnDeleteProfilePicture {


    @GET(Constants.DELETE_AVATAR_URL)
    Call<ResponseUserModel> delete();


}
