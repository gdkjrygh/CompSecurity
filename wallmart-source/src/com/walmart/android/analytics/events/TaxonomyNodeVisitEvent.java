// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class TaxonomyNodeVisitEvent extends AniviaEventJackson
    implements GoogleAnalyticsEvent
{

    private static final String EVENT_NAME = "department";
    private String mDepartmentId;
    private String mDepartmentName;

    private TaxonomyNodeVisitEvent()
    {
    }

    public TaxonomyNodeVisitEvent(String s, String s1)
    {
        super("department");
        mDepartmentId = s;
        mDepartmentName = s1;
    }

    public String getAction()
    {
        return mDepartmentId;
    }

    public String getCategory()
    {
        return "Shop by Dept";
    }

    public String getLabel()
    {
        return mDepartmentName;
    }

    public int getValue()
    {
        return 0;
    }
}
