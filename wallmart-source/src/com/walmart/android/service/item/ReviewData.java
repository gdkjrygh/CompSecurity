// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Map;

public class ReviewData
{
    public static class Builder
    {

        protected float mAverageOverallRating;
        protected Map mRatingDistribution;
        protected int mRecommendedPercentage;
        protected int mTotalReviewCount;

        public ReviewData build()
        {
            return new ReviewData(this);
        }

        public Builder()
        {
            mAverageOverallRating = 0.0F;
        }
    }


    private final float mAverageOverallRating;
    private final Map mRatingDistribution;
    private final int mRecommendedPercentage;
    private final int mTotalReviewCount;

    public ReviewData()
    {
        this(new Builder());
    }

    public ReviewData(Builder builder)
    {
        mAverageOverallRating = builder.mAverageOverallRating;
        mRatingDistribution = builder.mRatingDistribution;
        mTotalReviewCount = builder.mTotalReviewCount;
        mRecommendedPercentage = builder.mRecommendedPercentage;
    }

    public float getAverageOverallRating()
    {
        return mAverageOverallRating;
    }

    public Map getRatingDistribution()
    {
        return mRatingDistribution;
    }

    public int getRecommendedPercentage()
    {
        return mRecommendedPercentage;
    }

    public int getTotalReviewCount()
    {
        return mTotalReviewCount;
    }
}
