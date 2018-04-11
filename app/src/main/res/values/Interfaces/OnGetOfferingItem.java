package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.OfferingsItemModel;
import com.church.chrysostom.Model.OfferingsPager;
import com.church.chrysostom.Model.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by isaac on 11/19/2017.
 */

public interface OnGetOfferingItem {
    @GET(Constants.OFFERING_ITEM_URL)
    Call<List<OfferingsItemModel>> getItems(@Query("id") String id);
}
