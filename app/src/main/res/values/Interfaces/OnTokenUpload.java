package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.ServerResponse;
import com.church.chrysostom.Model.TokenServerRequestPost;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by heri on 12/11/16.
 */

public interface OnTokenUpload {

    @POST(Constants.END_URL_TOKEN)
    Call<ServerResponse> addToken(@Body TokenServerRequestPost request);

}
