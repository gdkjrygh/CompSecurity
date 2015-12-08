// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.util;

import android.content.Context;
import android.content.SharedPreferences;

public final class UserSelectionUtils
{

    static final String PREF_KEY_LAUNCH_HISTORY = "version";

    private UserSelectionUtils()
    {
    }

    public static SharedPreferences getPrefsMain(Context context)
    {
        if (context == null)
        {
            return null;
        } else
        {
            return context.getSharedPreferences("twcprefs", 0);
        }
    }
}
