package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.MediaPager;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 2/9/2017.
 */

public interface OnGetMedia {

    @GET(Constants.MEDIA_URL)
    Call<MediaPager> getMediaData(@Query("page") String current_page, @Query("type") String type);
}
