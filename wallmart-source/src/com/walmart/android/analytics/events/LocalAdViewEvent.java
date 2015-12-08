// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class LocalAdViewEvent extends AniviaEventJackson
{

    private static final String EVENT_NAME = "localAdView";
    private String mPromotionId;

    private LocalAdViewEvent()
    {
    }

    public LocalAdViewEvent(String s)
    {
        super("localAdView");
        mPromotionId = s;
    }
}
