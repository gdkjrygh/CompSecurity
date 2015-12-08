// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.orderhistory;

import android.text.TextUtils;

// Referenced classes of package com.walmart.android.service.orderhistory:
//            OrderDetailsResult

public static class I
{

    private String mCity;
    private String mCountry;
    private String mState;
    private String mStreet1;
    private String mStreet2;
    private String mZip;
    public boolean registry;

    public String getCity()
    {
        return mCity;
    }

    public String getCountry()
    {
        return mCountry;
    }

    public String getState()
    {
        return mState;
    }

    public String getStreet()
    {
        String s1 = mStreet1;
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = "";
        }
        s1 = s;
        if (!TextUtils.isEmpty(mStreet2))
        {
            s1 = (new StringBuilder()).append(s).append(", ").append(mStreet2).toString();
        }
        return s1;
    }

    public String getZip()
    {
        return mZip;
    }

    public void setCity(String s)
    {
        mCity = s;
    }

    public void setCountry(String s)
    {
        mCountry = s;
    }

    public void setState(String s)
    {
        mState = s;
    }

    public void setStreet1(String s)
    {
        mStreet1 = s;
    }

    public void setStreet2(String s)
    {
        mStreet2 = s;
    }

    public void setZip(String s)
    {
        mZip = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Address [mCity=").append(mCity).append(", mCountry=").append(mCountry).append(", mState=").append(mState).append(", mStreet=").append(mStreet1).append(", mZip=").append(mZip).append("]").toString();
    }

    public I()
    {
    }
}
