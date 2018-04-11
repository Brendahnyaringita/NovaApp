package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 3/20/2017.
 */

public interface OnDeleteHymn {

    @GET(Constants.DELETE_HYMN)
    Call<String> deleteHymn(@Query("id") String id,@Query("hymn_id") String hymn_id);
}
