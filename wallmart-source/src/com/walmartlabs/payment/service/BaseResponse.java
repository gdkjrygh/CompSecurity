// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service;


public class BaseResponse
{
    public static class Error
    {

        public String clientMessage;
        public String code;
        public String message;

        public Error()
        {
        }
    }

    public static class Meta
    {

        public String pluginVersion;

        public Meta()
        {
        }
    }


    public String apiVersion;
    public Error error;
    public Meta meta;

    public BaseResponse()
    {
    }

    public String getClientErrorMessage()
    {
        if (error != null)
        {
            return error.clientMessage;
        } else
        {
            return null;
        }
    }

    public boolean hasClientErrorMessage()
    {
        return error != null && error.clientMessage != null;
    }
}
