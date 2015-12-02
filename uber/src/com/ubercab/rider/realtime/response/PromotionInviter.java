// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


public abstract class PromotionInviter
{

    public PromotionInviter()
    {
    }

    public abstract String getFirstName();

    public abstract String getPictureUrl();

    abstract PromotionInviter setFirstName(String s);

    abstract PromotionInviter setPictureUrl(String s);
}
