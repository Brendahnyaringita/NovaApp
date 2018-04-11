package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.EventsPager;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 2/9/2017.
 */

public interface OnGetEvents {

    @GET(Constants.EVENT_URL)
    Call<EventsPager> getEventData(@Query("page") String current_page);
}
