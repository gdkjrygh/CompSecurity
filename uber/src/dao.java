// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ubercab.android.location.UberLocation;

public final class dao
    implements cht, cim
{

    private bjw a;
    private SharedPreferences b;

    public dao(Context context, bjw bjw1)
    {
        b = context.getSharedPreferences(".uber_preferences", 0);
        a = bjw1;
        t();
    }

    private void a(long l1, long l2)
    {
        if (l1 == 0L && l2 == 1L)
        {
            dan.a(b, "uber.analytics_v2_disable");
            dan.a(b, "uber.analytics_v2.logging");
            dan.a(b, "uber.monitoring_enabled");
        }
    }

    private long s()
    {
        return b.getLong("preferences_version", 0L);
    }

    private void t()
    {
        for (long l1 = s(); l1 < 1L;)
        {
            a(l1, l1 + 1L);
            l1++;
            b.edit().putLong("preferences_version", l1).apply();
        }

    }

    public final long a()
    {
        return b.getLong("ub.analytics_v2.counter", 0L);
    }

    public final void a(long l1)
    {
        b.edit().putLong("uber.analytics_v2.session_start_time", l1).apply();
    }

    public final void a(UberLocation uberlocation)
    {
        b.edit().putString("fake_location", a.a(uberlocation)).apply();
    }

    public final void a(String s1)
    {
        b.edit().putString("uber.analytics_v2.session_id", s1).apply();
    }

    public final void a(boolean flag)
    {
        b.edit().putBoolean("uber.analytics_v2.logging", flag).apply();
    }

    public final void b()
    {
        long l1 = a();
        b.edit().putLong("ub.analytics_v2.counter", l1 + 1L).apply();
    }

    public final void b(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            b.edit().remove("uber.cn_endpoint").apply();
            return;
        } else
        {
            b.edit().putString("uber.cn_endpoint", s1).apply();
            return;
        }
    }

    public final void b(boolean flag)
    {
        b.edit().putBoolean("uber.monitoring_enabled", flag).apply();
    }

    public final long c()
    {
        return b.getLong("uber.analytics_v2.session_start_time", 0L);
    }

    public final void c(String s1)
    {
        b.edit().putString("fake_geo", s1).apply();
    }

    public final String d()
    {
        return b.getString("uber.analytics_v2.session_id", "");
    }

    public final void d(String s1)
    {
        b.edit().putString("client_id", s1).apply();
    }

    public final void e(String s1)
    {
        b.edit().putString("employee.settings.other.version.fake", s1).apply();
    }

    public final boolean e()
    {
        return b.getBoolean("uber.analytics_v2.logging", false);
    }

    public final void f()
    {
        b.edit().remove("uber.cn_endpoint").apply();
    }

    public final String g()
    {
        return b.getString("uber.cn_endpoint", "");
    }

    public final String h()
    {
        String s2 = b.getString("fake_geo", "");
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = null;
        }
        return s1;
    }

    public final boolean i()
    {
        return h() != null;
    }

    public final void j()
    {
        b.edit().remove("fake_location").apply();
    }

    public final UberLocation k()
    {
        String s1 = b.getString("fake_location", "");
        if (TextUtils.isEmpty(s1))
        {
            return null;
        } else
        {
            return (UberLocation)a.a(s1, com/ubercab/android/location/UberLocation);
        }
    }

    public final boolean l()
    {
        return k() != null;
    }

    public final void m()
    {
        b.edit().remove("client_id").apply();
    }

    public final String n()
    {
        return b.getString("client_id", null);
    }

    public final boolean o()
    {
        return !TextUtils.isEmpty(n());
    }

    public final void p()
    {
        b.edit().remove("employee.settings.other.version.fake").apply();
    }

    public final boolean q()
    {
        return !TextUtils.isEmpty(r());
    }

    public final String r()
    {
        return b.getString("employee.settings.other.version.fake", "");
    }
}
