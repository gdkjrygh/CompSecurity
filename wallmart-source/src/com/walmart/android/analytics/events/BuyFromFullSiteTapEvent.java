// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class BuyFromFullSiteTapEvent extends AniviaEventJackson
    implements GoogleAnalyticsEvent
{

    private static final String EVENT_NAME = "buyFullSite";
    private String mItemId;

    private BuyFromFullSiteTapEvent()
    {
    }

    public BuyFromFullSiteTapEvent(String s)
    {
        super("buyFullSite");
        mItemId = s;
    }

    public String getAction()
    {
        return "Buy Fullsite";
    }

    public String getCategory()
    {
        return "Item Buttons";
    }

    public String getLabel()
    {
        return mItemId;
    }

    public int getValue()
    {
        return 0;
    }
}
