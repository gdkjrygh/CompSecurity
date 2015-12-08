// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;


public class StripeResponse
{

    String responseBody;
    int responseCode;

    public StripeResponse(int i, String s)
    {
        responseCode = i;
        responseBody = s;
    }

    public String getResponseBody()
    {
        return responseBody;
    }

    public int getResponseCode()
    {
        return responseCode;
    }

    public void setResponseBody(String s)
    {
        responseBody = s;
    }

    public void setResponseCode(int i)
    {
        responseCode = i;
    }
}
