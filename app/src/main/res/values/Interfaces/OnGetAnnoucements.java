package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.AnnouncementPager;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 2/28/2017.
 */

public interface OnGetAnnoucements {

    @GET(Constants.ANNOUNCEMENT_URL)
    Call<AnnouncementPager> getAnnouncements(@Query("page") String current_page);



}
