package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.HymnsPager;
import com.church.chrysostom.Model.MinistryPersonPager;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by isaac on 11/18/2017.
 */

public interface OnGetMinistryPerson {

    @GET(Constants.MINISTRY_URL)
    Call<MinistryPersonPager> getPersons(@Query("page") String current_page, @Query("id") String id);
}
