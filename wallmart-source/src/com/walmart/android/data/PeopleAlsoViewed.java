// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


public class PeopleAlsoViewed
{
    public static class RecommendedProduct
    {

        public String brand;
        public String genre;
        public String id;
        public String imageURL;
        public String name;
        public int priceCents;
        public int salePriceCents;

        public RecommendedProduct()
        {
        }
    }


    public String message;
    public RecommendedProduct recommendedProducts[];
    public String strategyName;

    public PeopleAlsoViewed()
    {
    }
}
