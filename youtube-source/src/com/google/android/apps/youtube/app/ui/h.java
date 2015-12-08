// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class h
{

    static final int a[];

    static 
    {
        a = new int[SubscribeHelper.SubscriptionStatus.values().length];
        try
        {
            a[SubscribeHelper.SubscriptionStatus.SUBSCRIBED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[SubscribeHelper.SubscriptionStatus.NOT_SUBSCRIBED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SubscribeHelper.SubscriptionStatus.ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SubscribeHelper.SubscriptionStatus.WORKING.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
