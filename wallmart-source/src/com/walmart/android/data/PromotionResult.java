// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            PromotionContent, PromotionCollection, PromotionData

public class PromotionResult
{

    public static final String VO_HOTSPOT = "hotspot";
    public static final String VO_ITEM = "item";
    public static final String VO_PAGE = "page";
    public static final String VO_PROMOTION = "promotion";
    public static final String VO_TAG = "tag";
    private PromotionContent promotionContent;

    public PromotionResult()
    {
    }

    public PromotionData[] getData(String s)
    {
        PromotionData apromotiondata[];
        Object obj;
        obj = null;
        apromotiondata = obj;
        if (promotionContent == null) goto _L2; else goto _L1
_L1:
        PromotionCollection apromotioncollection[];
        apromotioncollection = promotionContent.collection;
        apromotiondata = obj;
        if (apromotioncollection == null) goto _L2; else goto _L3
_L3:
        int i = 0;
_L8:
        apromotiondata = obj;
        if (i >= apromotioncollection.length) goto _L2; else goto _L4
_L4:
        apromotiondata = apromotioncollection[i];
        if (apromotiondata == null || !s.equals(((PromotionCollection) (apromotiondata)).vo)) goto _L6; else goto _L5
_L5:
        apromotiondata = ((PromotionCollection) (apromotiondata)).data;
_L2:
        return apromotiondata;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void setContent(PromotionContent promotioncontent)
    {
        promotionContent = promotioncontent;
    }
}
