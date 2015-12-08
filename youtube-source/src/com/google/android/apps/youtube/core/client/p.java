// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.SharedPreferences;

public final class p
{

    private SharedPreferences a;

    public p(SharedPreferences sharedpreferences)
    {
        a = sharedpreferences;
    }

    public final void a(DebugOnlyVmapAdRequester.ForceAdType forceadtype)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        if (forceadtype != null)
        {
            editor.putInt("debugAdType", forceadtype.ordinal());
        } else
        {
            editor.remove("debugAdType");
        }
        editor.commit();
    }

    public final void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putBoolean("debugAdEnable", flag);
        editor.commit();
    }

    public final boolean a()
    {
        return a.getBoolean("debugAdEnable", false);
    }

    public final DebugOnlyVmapAdRequester.ForceAdType b()
    {
        int i = a.getInt("debugAdType", -1);
        if (i >= 0 && i < DebugOnlyVmapAdRequester.ForceAdType.values().length)
        {
            return DebugOnlyVmapAdRequester.ForceAdType.values()[i];
        } else
        {
            return null;
        }
    }
}
