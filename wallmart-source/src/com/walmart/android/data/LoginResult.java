// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.text.TextUtils;
import java.util.Arrays;

public class LoginResult
{

    private String mCid;
    private String mCustomerId;
    private String mErrors[];
    private String mFirstName;
    private String mLastName;
    private boolean mLoggedIn;
    private String mShippingPass;
    private String mToken;

    public LoginResult()
    {
    }

    public String getCid()
    {
        return mCid;
    }

    public String getCustomerId()
    {
        return mCustomerId;
    }

    public String[] getErrors()
    {
        return mErrors;
    }

    public String getFirstName()
    {
        return mFirstName;
    }

    public String getLastName()
    {
        return mLastName;
    }

    public String getShippingPass()
    {
        return mShippingPass;
    }

    public String getToken()
    {
        return mToken;
    }

    public boolean hasFirstName()
    {
        return !TextUtils.isEmpty(mFirstName);
    }

    public boolean hasLastName()
    {
        return !TextUtils.isEmpty(mLastName);
    }

    public boolean isLoggedIn()
    {
        return mLoggedIn;
    }

    public void setCid(String s)
    {
        mCid = s;
    }

    public void setCustomerId(String s)
    {
        mCustomerId = s;
    }

    public void setErrors(String as[])
    {
        mErrors = as;
    }

    public void setFirstName(String s)
    {
        mFirstName = s;
    }

    public void setLastName(String s)
    {
        mLastName = s;
    }

    public void setLoggedIn(boolean flag)
    {
        mLoggedIn = flag;
    }

    public void setShippingPass(String s)
    {
        mShippingPass = s;
    }

    public void setToken(String s)
    {
        mToken = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LoginResult [mLoggedIn=").append(mLoggedIn).append(", mErrors=").append(Arrays.toString(mErrors)).append("]").toString();
    }
}
