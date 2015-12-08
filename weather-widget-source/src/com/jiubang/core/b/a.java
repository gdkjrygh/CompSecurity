// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.b;

import android.content.Context;
import android.content.SharedPreferences;

public class a
{

    private Context a;
    private SharedPreferences b;
    private SharedPreferences c;

    public a(Context context)
    {
        a = context.getApplicationContext();
        b = a.getSharedPreferences("goweatherex_info", 0);
        c = a.getSharedPreferences("goweatherex_world_info", 2);
    }

    public SharedPreferences a()
    {
        return b;
    }

    public SharedPreferences b()
    {
        return c;
    }
}
