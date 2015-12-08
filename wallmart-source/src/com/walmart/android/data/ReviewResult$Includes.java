// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.data:
//            ReviewResult

public static class Product
{
    public static class Product
    {

        public String name;
        public ReviewStatistics reviewStatistics;
        public int totalReviewCount;

        public Product()
        {
        }
    }

    public static class Product.ReviewStatistics
    {

        public float averageOverallRating;
        public int notRecommendedCount;
        public ArrayList ratingDistribution;
        public int recommendedCount;

        public Product.ReviewStatistics()
        {
        }
    }

    public static class Product.ReviewStatistics.RatingDistribution
    {

        public int count;
        public int ratingValue;

        public Product.ReviewStatistics.RatingDistribution()
        {
        }
    }


    public HashMap products;

    public Product()
    {
    }
}
