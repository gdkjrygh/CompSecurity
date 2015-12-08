// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class LocalAdChangeStoreTapEvent extends AniviaEventJackson
    implements GoogleAnalyticsEvent
{

    private static final String EVENT_NAME = "localAdNewStore";

    public LocalAdChangeStoreTapEvent()
    {
        super("localAdNewStore");
    }

    public String getAction()
    {
        return "Change Store Click";
    }

    public String getCategory()
    {
        return "Local Ad";
    }

    public String getLabel()
    {
        return "";
    }

    public int getValue()
    {
        return 0;
    }
}
