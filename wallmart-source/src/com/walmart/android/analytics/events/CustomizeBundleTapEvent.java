// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class CustomizeBundleTapEvent extends AniviaEventJackson
    implements GoogleAnalyticsEvent
{

    private static final String EVENT_NAME = "bundleChoiceInitiated";
    public String mItemId;

    private CustomizeBundleTapEvent()
    {
    }

    public CustomizeBundleTapEvent(String s)
    {
        super("bundleChoiceInitiated");
        mItemId = s;
    }

    public String getAction()
    {
        return "Customize Bundle";
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
