package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.HymnsModel;
import com.church.chrysostom.Model.MinistryPersonModel;
import com.church.chrysostom.UI.MinistryPerson;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by isaac on 11/18/2017.
 */

public interface OnSearchMinistry {
    @GET(Constants.MINISTRY_SEARCH_URL)
    Call<List<MinistryPersonModel>> getSearch(@Query("search") String search);

}
