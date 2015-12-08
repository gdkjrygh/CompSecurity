// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            BundleModel

public static class Builder
{
    public static class Builder
    {

        protected int mBasePriceInCents;
        protected BundleModel.GroupType mGroupType;
        protected int mId;
        protected boolean mIsBasePriceInvalid;
        protected int mMaxSelectionsAllowed;
        protected int mMinRequired;
        protected List mOptions;
        protected String mTitle;

        public BundleModel.BundleGroup build()
        {
            return new BundleModel.BundleGroup(this, null);
        }

        public Builder()
        {
        }
    }


    private final int mBasePriceInCents;
    private final mIsBasePriceInvalid mGroupType;
    private final int mId;
    private final boolean mIsBasePriceInvalid;
    private final int mMaxSelectionsAllowed;
    private final int mMinRequired;
    private final List mOptions;
    private final String mTitle;

    public int getBasePriceInCents()
    {
        return mBasePriceInCents;
    }

    public mBasePriceInCents getGroupType()
    {
        return mGroupType;
    }

    public int getId()
    {
        return mId;
    }

    public int getMaximumSelectionsAllowed()
    {
        return mMaxSelectionsAllowed;
    }

    public int getMinimumSelectionsRequired()
    {
        return mMinRequired;
    }

    public List getOptions()
    {
        return mOptions;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public boolean isBasePriceInvalid()
    {
        return mIsBasePriceInvalid;
    }

    private Builder(Builder builder)
    {
        mGroupType = builder.mGroupType;
        String s;
        if (builder.mTitle != null)
        {
            s = builder.mTitle;
        } else
        {
            s = "";
        }
        mTitle = s;
        mMinRequired = builder.mMinRequired;
        mMaxSelectionsAllowed = builder.mMaxSelectionsAllowed;
        mOptions = Collections.unmodifiableList(builder.mOptions);
        mBasePriceInCents = builder.mBasePriceInCents;
        mIsBasePriceInvalid = builder.mIsBasePriceInvalid;
        mId = builder.mId;
    }

    Builder(Builder builder, Builder builder1)
    {
        this(builder);
    }
}
