// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


public class Promotions
{
    public static class Content
    {

        public Collection collection;
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

        public String code;
        public String customimagedescription;
        public String customimagelocation;
        public String displayorder;
        public String featuredpromotion;
        public String identifier;
        public String image;
        public String postenddate;
        public String poststartdate;
        public String previewenddate;
        public String previewstartdate;
        public String promotionchildtypeid;
        public String promotionchildtypename;
        public String promotionid;
        public String promotionmessage;
        public String retailerid;
        public String retailername;
        public String saleenddate;
        public String salestartdate;
        public String tag;
        public String title;
        public String typeid;
        public String vo;

        public Content.Collection.Data()
        {
        }
    }


    public Content content;

    public Promotions()
    {
    }

    public Content.Collection.Data[] getPromotionsData()
    {
        if (content != null && content.collection != null && content.collection.data != null)
        {
            return content.collection.data;
        } else
        {
            return null;
        }
    }
}
