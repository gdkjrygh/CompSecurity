// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.order;


public class ServerError
{

    private String mError;
    private String mMessage;
    private int mStatusCode;

    public ServerError()
    {
    }

    public String getError()
    {
        return mError;
    }

    public String getMessage()
    {
        return mMessage;
    }

    public int getStatusCode()
    {
        return mStatusCode;
    }

    public void setError(String s)
    {
        mError = s;
    }

    public void setMessage(String s)
    {
        mMessage = s;
    }

    public void setStatusCode(int i)
    {
        mStatusCode = i;
    }
}
