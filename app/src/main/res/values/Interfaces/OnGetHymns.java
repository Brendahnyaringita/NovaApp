package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.HymnsPager;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 2/26/2017.
 */

public interface OnGetHymns {


    @GET(Constants.HYMNS_URL)
    Call<HymnsPager> getHymns(@Query("page") String current_page);
}
