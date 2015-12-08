// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecommendationResponse
{
    public static class Content
    {

        public Item itemDesList[];

        public Content()
        {
        }
    }

    public static class Detail
    {

        public Content content;

        public Detail()
        {
        }
    }

    public static class Item
    {

        public String altImageText;
        public Object athClkBeacon;
        public String currency;
        public String description;
        public String id;
        public String imageUrl;
        public int priceAfterDecimal;
        public int priceBeforeDecimal;
        public String productId;
        public String productUrl;
        public float starRating;

        public Item()
        {
        }
    }

    public static class Module
    {

        public Detail details[];

        public Module()
        {
        }
    }

    public static class Result
    {

        public Module modulesOutput[];

        public Result()
        {
        }
    }


    public Object athBeacon;
    public Result result;
    public String status;

    public RecommendationResponse()
    {
    }

    public List getItems()
    {
        ArrayList arraylist = new ArrayList();
        if (result != null && result.modulesOutput != null)
        {
            Module amodule[] = result.modulesOutput;
            int k = amodule.length;
            for (int i = 0; i < k; i++)
            {
                Module module = amodule[i];
                if (module.details == null)
                {
                    continue;
                }
                Detail adetail[] = module.details;
                int l = adetail.length;
                for (int j = 0; j < l; j++)
                {
                    Detail detail = adetail[j];
                    if (detail.content != null && detail.content.itemDesList != null)
                    {
                        Collections.addAll(arraylist, detail.content.itemDesList);
                    }
                }

            }

        }
        return arraylist;
    }
}
