// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;

import android.text.TextUtils;
import com.crashlytics.android.Crashlytics;
import java.text.DateFormat;
import java.util.Date;

public class CrashlyticsKeys
{

    public static final String ANIVIA_SESSION_ID = "anivia_sid";
    public static final String CURRENT_TIME = "current_time";
    public static final String LAST_LOGIN = "last_login";
    public static final String LAST_SESSION_RENEWAL = "last_session_renewal";
    public static final String WALMART_ANDROID_REPO = "walmart_android";

    public CrashlyticsKeys()
    {
    }

    public static void setString(String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            Crashlytics.setString(s, s1);
        }
    }

    public static void setTimestamp(String s, long l)
    {
        try
        {
            setString(s, DateFormat.getDateTimeInstance().format(new Date(l)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }
}
