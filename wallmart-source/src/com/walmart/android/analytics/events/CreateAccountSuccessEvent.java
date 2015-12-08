// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.GoogleAnalyticsEvent;
import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class CreateAccountSuccessEvent extends AniviaEventJackson
    implements GoogleAnalyticsEvent
{

    private static final String EVENT_NAME = "register";
    private String mFrom;

    public CreateAccountSuccessEvent(String s)
    {
        super("register");
        mFrom = s;
    }

    public String getAction()
    {
        return "Create Account Complete";
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
