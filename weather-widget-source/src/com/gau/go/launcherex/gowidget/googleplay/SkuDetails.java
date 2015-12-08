// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.googleplay;

import org.json.JSONObject;

public class SkuDetails
{

    String mDescription;
    String mItemType;
    String mJson;
    String mPrice;
    String mSku;
    String mTitle;
    String mType;

    public SkuDetails(String s)
    {
        this("inapp", s);
    }

    public SkuDetails(String s, String s1)
    {
        mItemType = s;
        mJson = s1;
        s = new JSONObject(mJson);
        mSku = s.optString("productId");
        mType = s.optString("type");
        mPrice = s.optString("price");
        mTitle = s.optString("title");
        mDescription = s.optString("description");
    }

    public String getDescription()
    {
        return mDescription;
    }

    public String getPrice()
    {
        return mPrice;
    }

    public String getSku()
    {
        return mSku;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getType()
    {
        return mType;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SkuDetails:").append(mJson).toString();
    }
}
