// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;

public final class hch
{

    private final SharedPreferences a;

    public hch(SharedPreferences sharedpreferences)
    {
        a = sharedpreferences;
    }

    public final void a(String s)
    {
        a.edit().putString("com.ubercab.rds.PASSWORD_RESET_EMAIL", s).apply();
    }

    public final void a(boolean flag)
    {
        a.edit().putBoolean("com.ubercab.rds.LOCATION_OVERRIDE", flag).apply();
    }

    public final boolean a()
    {
        return a.getBoolean("com.ubercab.rds.LOCATION_OVERRIDE", false);
    }

    public final String b()
    {
        return a.getString("com.ubercab.rds.PASSWORD_RESET_EMAIL", "");
    }

    public final void b(String s)
    {
        a.edit().putString("com.ubercab.rds.RETURN_LOCATION", s).apply();
    }

    public final String c()
    {
        return a.getString("com.ubercab.rds.RETURN_LOCATION", "");
    }
}
