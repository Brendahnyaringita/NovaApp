package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Constant.Constants;
import com.church.chrysostom.Model.MinistryModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by isaac on 11/18/2017.
 */

public interface OnGetMinistryRoles {

    @GET(Constants.MINISTRY_ROLES_URL)
    Call<List<MinistryModel>> getRoles();
}
