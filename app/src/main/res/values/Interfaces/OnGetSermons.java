package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.SermonPager;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Isaac Heri on 3/24/2017.
 */

public interface OnGetSermons {

    @GET(Constants.SERMONS_URL)
    Call<SermonPager> getSermonsData(@Query("page") String current_page);

}
