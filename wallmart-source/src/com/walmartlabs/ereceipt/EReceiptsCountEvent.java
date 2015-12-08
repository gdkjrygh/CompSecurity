// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class EReceiptsCountEvent extends AniviaEventJackson
    implements GoogleAnalyticsEvent
{

    private static final String EVENT_NAME = "eReceiptsShown";
    private String mCount;
    private boolean mIsSignedIn;

    private EReceiptsCountEvent()
    {
    }

    public EReceiptsCountEvent(String s, boolean flag)
    {
        super("eReceiptsShown");
        mCount = s;
        mIsSignedIn = flag;
    }

    public String getAction()
    {
        return "List view";
    }

    public String getCategory()
    {
        return "Ereceipt";
    }

    public String getLabel()
    {
        return mCount;
    }

    public int getValue()
    {
        return 0;
    }
}
