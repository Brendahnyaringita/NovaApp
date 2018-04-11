package com.church.chrysostom.Interfaces;


import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.ResponseUserModel;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface GetOnUpload {

    @Multipart
    @POST(Constants.UPLOAD_URL)
    Call<ResponseUserModel> upload(@Part("file\";filename=\"avatar.jpg\" ") RequestBody file,@Part("broom")RequestBody broom);
}
