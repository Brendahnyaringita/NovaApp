package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.MassPager;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 2/5/2017.
 */

public interface OnGetMass {

    @GET(Constants.MASS_URL)
    Call<MassPager> getMassData(@Query("page") String current_page);


}
