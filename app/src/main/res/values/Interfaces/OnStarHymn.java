package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 3/20/2017.
 */

public interface OnStarHymn {


    @POST(Constants.STAR_HYMN)
    Call<String> starHymn(@Query("id") String id,@Query("hymn_id") String hymn_id);
}
