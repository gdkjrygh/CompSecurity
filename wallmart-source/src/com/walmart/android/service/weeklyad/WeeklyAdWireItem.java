// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.weeklyad;


public class WeeklyAdWireItem
{
    public static class Feature
    {

        public String text;

        public Feature()
        {
        }
    }

    public static class Review
    {

        public String body;
        public String byline;
        public String date;
        public String rating;
        public String title;

        public Review()
        {
        }
    }

    public static class Spec
    {

        public String name;
        public String value;

        public Spec()
        {
        }
    }


    public double average_rating;
    public String brand;
    public String category;
    public String current_price;
    public String current_price_range;
    public String custom1;
    public String custom2;
    public String custom3;
    public String cutout_image_url;
    public String description;
    public String disclaimer_text;
    public String dollars_off;
    public Feature features[];
    public String flyer_id;
    public double height;
    public String id;
    public String image_url;
    public int item_type;
    public String large_image_url;
    public double left;
    public String medium_image_url;
    public String name;
    public String original_price;
    public String original_price_range;
    public int page;
    public String percent_off;
    public String post_price_text;
    public String pre_price_text;
    public String price_text;
    public Review reviews[];
    public String sale_story;
    public String sku;
    public String small_image_url;
    public Spec specs[];
    public double top;
    public String ttm_url;
    public String valid_from;
    public String valid_to;
    public double width;
    public String x_large_image_url;

    public WeeklyAdWireItem()
    {
    }
}
