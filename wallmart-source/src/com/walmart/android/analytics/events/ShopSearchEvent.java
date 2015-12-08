// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class ShopSearchEvent extends AniviaEventJackson
    implements GoogleAnalyticsEvent
{

    private static final String EVENT_NAME = "searchTerm";
    private String mSearchTerm;
    private String mSearchType;

    private ShopSearchEvent()
    {
    }

    public ShopSearchEvent(String s, String s1)
    {
        super("searchTerm");
        mSearchTerm = s;
        mSearchType = s1;
    }

    public String getAction()
    {
        return mSearchType;
    }

    public String getCategory()
    {
        return "Search";
    }

    public String getLabel()
    {
        return mSearchTerm;
    }

    public int getValue()
    {
        return 0;
    }
}
