// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.config.e;

public final class o
    implements e
{

    private final SharedPreferences b;

    public o(SharedPreferences sharedpreferences)
    {
        b = (SharedPreferences)c.a(sharedpreferences);
    }

    public final boolean a()
    {
        return b.getBoolean("ApiRequestLogging", false);
    }

    public final boolean b()
    {
        return b.getBoolean("FullApiResponseLogging", false);
    }
}
