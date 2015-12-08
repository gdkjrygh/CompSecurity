// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import java.util.ArrayList;

// Referenced classes of package com.walmart.android.data:
//            ReviewResult

public static class RatingDistribution
{
    public static class RatingDistribution
    {

        public int count;
        public int ratingValue;

        public RatingDistribution()
        {
        }
    }


    public float averageOverallRating;
    public int notRecommendedCount;
    public ArrayList ratingDistribution;
    public int recommendedCount;

    public RatingDistribution()
    {
    }
}
