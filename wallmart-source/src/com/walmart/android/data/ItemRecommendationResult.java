// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


public class ItemRecommendationResult
{
    public static class Module
    {

        public String moduleTitle;
        public RecommendedItem recommendedItems[];
        public String strategy;

        public Module()
        {
        }
    }

    public static class RecommendedItem
    {

        public String currentPrice;
        public String httpImageLink;
        public String itemId;
        public String productName;
        public float rating;
        public String submapType;
        public String usItemId;

        public RecommendedItem()
        {
        }
    }

    public static class Result
    {

        public Module modules[];
        public ResultDetail resultDetail;
        public Status status;

        public Result()
        {
        }
    }

    public static class ResultDetail
    {

        public ResultDetail()
        {
        }
    }

    public static class Status
    {

        public Status()
        {
        }
    }


    public static final String STRATEGY_PEOPLE_WHO_BOUGHT_ALSO_BOUGHT = "PWBAB";
    public static final String STRATEGY_PEOPLE_WHO_VIEWED_ALSO_VIEWED = "PWVAV";
    public static final String STRATEGY_PEOPLE_WHO_VIEWED_ULTIMATELY_BOUGHT = "PWVUB";
    public static final String STRATEGY_TOP_IN_CATEGORY = "TIC";
    public Result result;

    public ItemRecommendationResult()
    {
    }
}
