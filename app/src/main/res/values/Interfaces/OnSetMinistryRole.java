package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Model.MinistryModel;
import com.church.chrysostom.Model.MinistryRoles;
import com.church.chrysostom.UI.Ministry;

import java.util.List;

/**
 * Created by isaac on 11/18/2017.
 */

public interface OnSetMinistryRole {

    void setMinistryRoles(List<MinistryModel> ministryModelList);
}
