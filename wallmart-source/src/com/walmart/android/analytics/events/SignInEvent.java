// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class SignInEvent extends AniviaEventJackson
    implements GoogleAnalyticsEvent
{

    private static final String EVENT_NAME = "signIn";
    private String mCustomerId;
    private String mFrom;

    public SignInEvent(String s, String s1)
    {
        super("signIn");
        mCustomerId = s;
        mFrom = s1;
    }

    public String getAction()
    {
        return "Customer Login";
    }

    public String getCategory()
    {
        return "Account";
    }

    public String getLabel()
    {
        return mFrom;
    }

    public int getValue()
    {
        return 0;
    }
}
