package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.MassModel;
import com.church.chrysostom.Model.OfferingsPager;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by isaac on 11/19/2017.
 */

public interface OnGetOfferings {

    @GET(Constants.OFFERINGS_URL)
    Call<OfferingsPager> getOfferings(@Query("page") String current_page);
}
