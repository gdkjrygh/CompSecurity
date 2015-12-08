// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.analytics.anivia;

import com.walmartlabs.analytics.AnalyticsPageView;

public class AniviaAnalyticsPageView extends AnalyticsPageView
{

    public String aniviaPage;

    public AniviaAnalyticsPageView(String s)
    {
        super(null);
        aniviaPage = s;
    }

    public AniviaAnalyticsPageView(String s, String s1)
    {
        super(s1);
        aniviaPage = s;
    }
}
