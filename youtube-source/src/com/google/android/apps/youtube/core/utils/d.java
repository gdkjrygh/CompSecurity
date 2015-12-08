// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.security.SecureRandom;

public final class d
{

    public static boolean a(Context context, int i)
    {
        int j;
        int k;
        boolean flag;
        flag = false;
        context = PreferenceManager.getDefaultSharedPreferences(context);
        k = context.getInt("ANALYTICS_SAMPLE_ID_KEY", -1);
        j = k;
        if (k >= 0) goto _L2; else goto _L1
_L1:
        k = (new SecureRandom()).nextInt();
        if (k != 0x80000000) goto _L4; else goto _L3
_L3:
        j = 0;
_L6:
        context.edit().putInt("ANALYTICS_SAMPLE_ID_KEY", j).apply();
_L2:
        if (j % i == 0)
        {
            flag = true;
        }
        return flag;
_L4:
        j = k;
        if (k < 0)
        {
            j = -k;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
