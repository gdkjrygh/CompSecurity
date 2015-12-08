// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.weeklyad;

import android.content.Context;
import android.net.Uri;

public class WeeklyAdConfiguration
{

    private static final String WEEKLY_AD_SERVER_PRODUCTION = "http://weeklyads.walmart.com";
    private static final String WEEKLY_AD_SERVER_STAGING = "http://partneruat4.circularhub.com";
    private static WeeklyAdConfiguration sInstance;
    private Context mContext;

    private WeeklyAdConfiguration(Context context)
    {
        mContext = context;
    }

    public static WeeklyAdConfiguration get()
    {
        return sInstance;
    }

    public static void init(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new WeeklyAdConfiguration(context);
        }
    }

    public String getWeeklyAdServer()
    {
        return "http://weeklyads.walmart.com";
    }

    public boolean isStaging(String s)
    {
        return s.startsWith(Uri.parse("http://partneruat4.circularhub.com").getHost());
    }
}
