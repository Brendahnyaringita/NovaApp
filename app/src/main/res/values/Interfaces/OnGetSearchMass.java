package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.MassModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 6/5/2017.
 */

public interface OnGetSearchMass {

    @GET(Constants.SEARCH_MASS_URL)
    Call<List<MassModel>> getSearch(@Query("search") String search);
}
