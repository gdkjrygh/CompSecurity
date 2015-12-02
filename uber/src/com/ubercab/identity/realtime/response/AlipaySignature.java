// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.identity.realtime.response;


public abstract class AlipaySignature
{

    public AlipaySignature()
    {
    }

    public abstract String getSignature();

    abstract AlipaySignature setSignature(String s);
}
