package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.HymnsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 2/26/2017.
 */

public interface OnGetHymn {

    @GET(Constants.HYMNS_URL_SINGLE)
    Call<HymnsModel> getHymns(@Query("id")String id);
}
