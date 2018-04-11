package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.HymnsModel;
import com.church.chrysostom.Model.HymnsPager;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 3/20/2017.
 */

public interface OnGetStarHymns {

    @GET(Constants.GET_STAR_HYMN)
    Call<HymnsPager> getStaredrHymns(@Query("current_page") String current_page, @Query("id") String id);
}
