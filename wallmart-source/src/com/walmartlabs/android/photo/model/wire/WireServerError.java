// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.wire;


public class WireServerError
{

    private String error;
    private String message;
    private int statusCode;

    public WireServerError()
    {
    }

    public String getError()
    {
        return error;
    }

    public String getMessage()
    {
        return message;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public void setError(String s)
    {
        error = s;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setStatusCode(int i)
    {
        statusCode = i;
    }
}
