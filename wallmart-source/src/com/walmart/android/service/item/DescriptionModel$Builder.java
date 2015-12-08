// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import com.walmart.android.service.item.model.DrugFacts;
import com.walmart.android.service.item.model.Nutrition;
import com.walmart.android.service.item.model.SupplementFacts;
import com.walmart.android.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            DescriptionModel

public static class mIngredients
{

    protected ion mAlbumInformation;
    protected ion mBookInformation;
    protected List mDirections;
    protected ion mDisclaimer;
    protected DrugFacts mDrugFacts;
    protected List mIndications;
    protected List mIngredients;
    protected List mLegalBadges;
    protected CharSequence mLongDescription;
    protected ion mManufacturerInformation;
    protected ion mMovieInformation;
    protected Nutrition mNutrition;
    protected ion mPricingPolicy;
    protected CharSequence mProductInformation;
    protected CharSequence mProductInformationShort;
    protected CharSequence mShortDescription;
    protected List mSpecifications;
    protected SupplementFacts mSupplementFacts;
    protected List mTrackListing;
    protected ion mVideoGameInformation;
    protected List mWarnings;
    protected List mWarranties;
    protected List mWhatsIncluded;

    public DescriptionModel build()
    {
        mWhatsIncluded = CollectionUtils.toUnmodifiableList(mWhatsIncluded);
        mSpecifications = CollectionUtils.toUnmodifiableList(mSpecifications);
        mWarnings = CollectionUtils.toUnmodifiableList(mWarnings);
        mTrackListing = CollectionUtils.toUnmodifiableList(mTrackListing);
        mLegalBadges = CollectionUtils.toUnmodifiableList(mLegalBadges);
        mWarranties = CollectionUtils.toUnmodifiableList(mWarranties);
        mIndications = CollectionUtils.toUnmodifiableList(mIndications);
        mDirections = CollectionUtils.toUnmodifiableList(mDirections);
        mIngredients = CollectionUtils.toUnmodifiableList(mIngredients);
        return new DescriptionModel(this);
    }

    public ion()
    {
        mWhatsIncluded = new ArrayList();
        mSpecifications = new ArrayList();
        mWarnings = new ArrayList();
        mTrackListing = new ArrayList();
        mLegalBadges = new ArrayList();
        mWarranties = new ArrayList();
        mIndications = new ArrayList();
        mDirections = new ArrayList();
        mIngredients = new ArrayList();
    }
}
