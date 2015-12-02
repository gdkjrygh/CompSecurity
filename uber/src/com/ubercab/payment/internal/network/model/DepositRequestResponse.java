// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.network.model;


public abstract class DepositRequestResponse
{

    public DepositRequestResponse()
    {
    }

    public abstract String getData();

    public abstract String getUrl();

    abstract DepositRequestResponse setData(String s);

    abstract DepositRequestResponse setUrl(String s);
}
