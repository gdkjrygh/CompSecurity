// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


public class PromotionPages
{
    public static class Content
    {

        public Collection collection[];
        public String date;

        public Content()
        {
        }
    }

    public static class Content.Collection
    {

        public Data data[];
        public String vo;

        public Content.Collection()
        {
        }
    }

    public static class Content.Collection.Data
    {

        public String coverpageflag;
        public String displayflag;
        public String displaypagenumber;
        public String enddate;
        public int imageheight;
        public String imageurl;
        public int imagewidth;
        public String pagecode;
        public String pageid;
        public int pageindex;
        public String pageorder;
        public String vo;

        public Content.Collection.Data()
        {
        }
    }


    public Content content;

    public PromotionPages()
    {
    }
}
