// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import android.text.Html;
import android.text.TextUtils;
import com.walmart.android.app.item.HtmlListTagHandler;
import com.walmart.android.service.item.model.DrugFacts;
import com.walmart.android.service.item.model.Nutrition;
import com.walmart.android.service.item.model.SupplementFacts;
import com.walmart.android.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            StringPair

public class DescriptionModel
{
    public static class Builder
    {

        protected Description mAlbumInformation;
        protected Description mBookInformation;
        protected List mDirections;
        protected Description mDisclaimer;
        protected DrugFacts mDrugFacts;
        protected List mIndications;
        protected List mIngredients;
        protected List mLegalBadges;
        protected CharSequence mLongDescription;
        protected Description mManufacturerInformation;
        protected Description mMovieInformation;
        protected Nutrition mNutrition;
        protected Description mPricingPolicy;
        protected CharSequence mProductInformation;
        protected CharSequence mProductInformationShort;
        protected CharSequence mShortDescription;
        protected List mSpecifications;
        protected SupplementFacts mSupplementFacts;
        protected List mTrackListing;
        protected Description mVideoGameInformation;
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

        public Builder()
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

    public static class Description
    {

        private final CharSequence mText;
        private final CharSequence mTitle;

        public CharSequence getText()
        {
            return mText;
        }

        public CharSequence getTitle()
        {
            return mTitle;
        }

        public boolean hasText()
        {
            return !TextUtils.isEmpty(mText);
        }

        public Description(StringPair stringpair, boolean flag, boolean flag1)
        {
            Object obj;
            if (flag)
            {
                obj = Html.fromHtml(stringpair.name, null, new HtmlListTagHandler());
            } else
            {
                obj = stringpair.name;
            }
            if (flag1)
            {
                stringpair = Html.fromHtml(stringpair.value, null, new HtmlListTagHandler());
            } else
            {
                stringpair = stringpair.value;
            }
            this(((CharSequence) (obj)), ((CharSequence) (stringpair)));
        }

        public Description(CharSequence charsequence, CharSequence charsequence1)
        {
            if (charsequence == null)
            {
                charsequence = "";
            }
            mTitle = charsequence;
            if (charsequence1 == null)
            {
                charsequence1 = "";
            }
            mText = charsequence1;
        }
    }

    public static class IconDescription extends Description
    {

        private final String imageName;

        public String getImageName()
        {
            return imageName;
        }

        public IconDescription(CharSequence charsequence, CharSequence charsequence1, String s)
        {
            super(charsequence, charsequence1);
            imageName = s;
        }
    }


    private final Description mAlbumInformation;
    private final Description mBookInformation;
    private final List mDirections;
    private final Description mDisclaimer;
    private final DrugFacts mDrugFacts;
    private final List mIndications;
    private final List mIngredients;
    private final List mLegalBadges;
    private final CharSequence mLongDescription;
    private final Description mManufacturerInformation;
    private final Description mMovieInformation;
    private final Nutrition mNutrition;
    private final Description mPricingPolicy;
    private final CharSequence mProductInformation;
    private final CharSequence mProductInformationShort;
    private final CharSequence mShortDescription;
    private final List mSpecifications;
    private final SupplementFacts mSupplementFacts;
    private final List mTrackListing;
    private final Description mVideoGameInformation;
    private final List mWarnings;
    private final List mWarranties;
    private final List mWhatsIncluded;

    public DescriptionModel()
    {
        this(new Builder());
    }

    public DescriptionModel(Builder builder)
    {
        mProductInformationShort = builder.mProductInformationShort;
        mProductInformation = builder.mProductInformation;
        mShortDescription = builder.mShortDescription;
        mLongDescription = builder.mLongDescription;
        mSpecifications = builder.mSpecifications;
        mVideoGameInformation = builder.mVideoGameInformation;
        mMovieInformation = builder.mMovieInformation;
        mBookInformation = builder.mBookInformation;
        mAlbumInformation = builder.mAlbumInformation;
        mWhatsIncluded = builder.mWhatsIncluded;
        mPricingPolicy = builder.mPricingPolicy;
        mManufacturerInformation = builder.mManufacturerInformation;
        mWarnings = builder.mWarnings;
        mIndications = builder.mIndications;
        mDirections = builder.mDirections;
        mDisclaimer = builder.mDisclaimer;
        mNutrition = builder.mNutrition;
        mDrugFacts = builder.mDrugFacts;
        mSupplementFacts = builder.mSupplementFacts;
        mTrackListing = builder.mTrackListing;
        mIngredients = builder.mIngredients;
        mLegalBadges = builder.mLegalBadges;
        mWarranties = builder.mWarranties;
    }

    public Description getAlbumInformation()
    {
        return mAlbumInformation;
    }

    public Description getBookInformation()
    {
        return mBookInformation;
    }

    public List getDirections()
    {
        return mDirections;
    }

    public Description getDisclaimer()
    {
        return mDisclaimer;
    }

    public DrugFacts getDrugFacts()
    {
        return mDrugFacts;
    }

    public List getIndications()
    {
        return mIndications;
    }

    public List getIngredients()
    {
        return mIngredients;
    }

    public List getLegalBadges()
    {
        return mLegalBadges;
    }

    public CharSequence getLongDescription()
    {
        return mLongDescription;
    }

    public Description getManufacturerInformation()
    {
        return mManufacturerInformation;
    }

    public Description getMovieInformation()
    {
        return mMovieInformation;
    }

    public Nutrition getNutritionFacts()
    {
        return mNutrition;
    }

    public Description getPricingPolicy()
    {
        return mPricingPolicy;
    }

    public CharSequence getProductInformation()
    {
        return mProductInformation;
    }

    public CharSequence getProductInformationShort()
    {
        return mProductInformationShort;
    }

    public CharSequence getShortDescription()
    {
        return mShortDescription;
    }

    public List getSpecifications()
    {
        return mSpecifications;
    }

    public SupplementFacts getSupplementFacts()
    {
        return mSupplementFacts;
    }

    public List getTrackListing()
    {
        return mTrackListing;
    }

    public Description getVideoGameInformation()
    {
        return mVideoGameInformation;
    }

    public List getWarnings()
    {
        return mWarnings;
    }

    public List getWarranties()
    {
        return mWarranties;
    }

    public List getWhatsIncluded()
    {
        return mWhatsIncluded;
    }
}
