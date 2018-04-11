package com.church.chrysostom.Interfaces;

import com.church.chrysostom.Model.OfferingItemPager;
import com.church.chrysostom.Model.OfferingsItemModel;

import java.util.List;

/**
 * Created by isaac on 11/19/2017.
 */

public interface OnSetOfferingItem {

    void setItems(List<OfferingsItemModel> offeringsItemModelList);
}
