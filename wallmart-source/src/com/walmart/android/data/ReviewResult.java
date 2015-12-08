// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import java.util.ArrayList;
import java.util.HashMap;

public class ReviewResult
{
    public static class Badge
    {

        public String id;

        public Badge()
        {
        }
    }

    public static class Includes
    {

        public HashMap products;

        public Includes()
        {
        }
    }

    public static class Includes.Product
    {

        public String name;
        public ReviewStatistics reviewStatistics;
        public int totalReviewCount;

        public Includes.Product()
        {
        }
    }

    public static class Includes.Product.ReviewStatistics
    {

        public float averageOverallRating;
        public int notRecommendedCount;
        public ArrayList ratingDistribution;
        public int recommendedCount;

        public Includes.Product.ReviewStatistics()
        {
        }
    }

    public static class Includes.Product.ReviewStatistics.RatingDistribution
    {

        public int count;
        public int ratingValue;

        public Includes.Product.ReviewStatistics.RatingDistribution()
        {
        }
    }

    public static class Review
    {

        public HashMap badges;
        public String id;
        public int rating;
        public String reviewText;
        public HashMap secondaryRatings;
        public String submissionTime;
        public String title;
        public int totalFeedbackCount;
        public int totalNegativeFeedbackCount;
        public int totalPositiveFeedbackCount;
        public String userLocation;
        public String userNickname;

        public Review()
        {
        }
    }

    public static class SecondaryRating
    {

        public String label;
        public int value;

        public SecondaryRating()
        {
        }
    }


    public static final String BADGE_STAFF = "Staff";
    public static final String BADGE_VERIFIED_PURCHASER = "VerifiedPurchaser";
    public Includes includes;
    public ArrayList results;
    public int totalResults;

    public ReviewResult()
    {
    }
}
