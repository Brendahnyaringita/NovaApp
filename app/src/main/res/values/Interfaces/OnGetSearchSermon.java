package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.SermonModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 6/5/2017.
 */

public interface OnGetSearchSermon {

    @GET(Constants.SEARCH_SERMON_URL)
    Call<List<SermonModel>> getSearch(@Query("search") String search);
}
