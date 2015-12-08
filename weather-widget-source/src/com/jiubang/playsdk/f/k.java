// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import android.content.Context;
import android.content.SharedPreferences;

public class k
{

    private SharedPreferences a;
    private android.content.SharedPreferences.Editor b;

    public k(Context context, String s)
    {
        a = context.getSharedPreferences(s, 0);
        b = a.edit();
    }

    public String a(String s, String s1)
    {
        return a.getString(s, s1);
    }

    public void a()
    {
        b.commit();
    }

    public void a(String s, long l)
    {
        b.putLong(s, l);
    }

    public boolean a(String s, boolean flag)
    {
        return a.getBoolean(s, flag);
    }

    public long b(String s, long l)
    {
        return a.getLong(s, l);
    }

    public void b(String s, String s1)
    {
        b.putString(s, s1);
    }

    public void b(String s, boolean flag)
    {
        b.putBoolean(s, flag);
    }
}
