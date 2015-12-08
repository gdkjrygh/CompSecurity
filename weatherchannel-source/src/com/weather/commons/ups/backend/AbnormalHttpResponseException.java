// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;


public class AbnormalHttpResponseException extends Exception
{

    private static final long serialVersionUID = 1L;

    public AbnormalHttpResponseException(String s)
    {
        super((new StringBuilder()).append("Received Abnormal Http Response: ").append(s).toString());
    }
}
