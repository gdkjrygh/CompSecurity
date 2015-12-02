// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public final class doe
{

    private final SharedPreferences a;

    public doe(Context context)
    {
        a = context.getSharedPreferences(".preload", 0);
        h();
    }

    private void a(long l, long l1)
    {
        if (l == 0L && l1 == 1L)
        {
            dan.a(a, "has_been_opened");
        }
    }

    private long g()
    {
        return a.getLong("preferences_version", 0L);
    }

    private void h()
    {
        for (long l = g(); l < 1L;)
        {
            a(l, l + 1L);
            l++;
            a.edit().putLong("preferences_version", l).apply();
        }

    }

    public final void a()
    {
        a.edit().putBoolean("has_signed_in", true).apply();
    }

    final void a(String s)
    {
        a.edit().putString("preload_uuid", s).apply();
    }

    final boolean b()
    {
        return a.getBoolean("has_been_opened", false);
    }

    final void c()
    {
        a.edit().putBoolean("has_been_opened", true).apply();
    }

    final boolean d()
    {
        return a.getBoolean("has_signed_in", false);
    }

    final boolean e()
    {
        return a.getBoolean("has_accepted_permissions", false);
    }

    final void f()
    {
        a.edit().putBoolean("has_accepted_permissions", true).apply();
    }
}
