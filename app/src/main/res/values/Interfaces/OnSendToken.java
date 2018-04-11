package com.church.chrysostom.Interfaces;


import com.church.chrysostom.Constant.Constants;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 2/23/2017.
 */

public interface OnSendToken {

    @POST(Constants.FCM_URL)
    Call<String> sendTokenToDB(@Query("firebase_token") String token);

}
