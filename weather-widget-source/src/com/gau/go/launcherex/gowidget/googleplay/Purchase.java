// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.googleplay;

import org.json.JSONObject;

public class Purchase
{

    String mDeveloperPayload;
    String mItemType;
    String mOrderId;
    String mOriginalJson;
    String mPackageName;
    int mPurchaseState;
    long mPurchaseTime;
    String mSignature;
    String mSku;
    String mToken;

    public Purchase(String s, String s1, String s2)
    {
        mItemType = s;
        mOriginalJson = s1;
        s = new JSONObject(mOriginalJson);
        mOrderId = s.optString("orderId");
        mPackageName = s.optString("packageName");
        mSku = s.optString("productId");
        mPurchaseTime = s.optLong("purchaseTime");
        mPurchaseState = s.optInt("purchaseState");
        mDeveloperPayload = s.optString("developerPayload");
        mToken = s.optString("token", s.optString("purchaseToken"));
        mSignature = s2;
    }

    public String getDeveloperPayload()
    {
        return mDeveloperPayload;
    }

    public String getItemType()
    {
        return mItemType;
    }

    public String getOrderId()
    {
        return mOrderId;
    }

    public String getOriginalJson()
    {
        return mOriginalJson;
    }

    public String getPackageName()
    {
        return mPackageName;
    }

    public int getPurchaseState()
    {
        return mPurchaseState;
    }

    public long getPurchaseTime()
    {
        return mPurchaseTime;
    }

    public String getSignature()
    {
        return mSignature;
    }

    public String getSku()
    {
        return mSku;
    }

    public String getToken()
    {
        return mToken;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PurchaseInfo(type:").append(mItemType).append("):").append(mOriginalJson).toString();
    }
}
