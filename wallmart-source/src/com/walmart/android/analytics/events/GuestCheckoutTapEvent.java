// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class GuestCheckoutTapEvent extends AniviaEventJackson
    implements GoogleAnalyticsEvent
{

    private static final String EVENT_NAME = "guestCheckoutAttempt";

    public GuestCheckoutTapEvent()
    {
        super("guestCheckoutAttempt");
    }

    public String getAction()
    {
        return "Guest Checkout";
    }

    public String getCategory()
    {
        return "Cart";
    }

    public String getLabel()
    {
        return "Start";
    }

    public int getValue()
    {
        return 0;
    }
}
