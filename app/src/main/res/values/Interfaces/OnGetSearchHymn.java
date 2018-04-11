package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.HymnsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 2/28/2017.
 */

public interface OnGetSearchHymn {

    @GET(Constants.SEARCH_HYMN_URL)
    Call<List<HymnsModel>> getHymns(@Query("search") String search,@Query("mode") String mode);
}
