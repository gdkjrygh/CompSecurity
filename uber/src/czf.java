// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class czf
{

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final SharedPreferences r;

    public czf(Context context, SharedPreferences sharedpreferences)
    {
        r = sharedpreferences;
        a = context.getString(0x7f07071a);
        b = context.getString(0x7f0706f8);
        c = context.getString(0x7f0706fa);
        d = context.getString(0x7f07071b);
        e = context.getString(0x7f07071d);
        f = context.getString(0x7f0706fc);
        g = context.getString(0x7f070729);
        h = context.getString(0x7f0706fe);
        i = context.getString(0x7f0706ff);
        j = context.getString(0x7f070700);
        k = context.getString(0x7f07071c);
        l = context.getString(0x7f070707);
        m = context.getString(0x7f07071e);
        n = context.getString(0x7f070724);
        o = context.getString(0x7f070716);
        p = context.getString(0x7f070727);
        q = context.getString(0x7f07072d);
        I();
    }

    private long H()
    {
        return r.getLong("preferences_version", 0L);
    }

    private void I()
    {
        for (long l1 = H(); l1 < 1L;)
        {
            a(l1, l1 + 1L);
            l1++;
            r.edit().putLong("preferences_version", l1).apply();
        }

    }

    private void a(long l1, long l2)
    {
        if (l1 == 0L && l2 == 1L)
        {
            dan.a(r, "has_tracked_install");
            dan.a(r, "new_confirmation_enabled");
            dan.a(r, "registered_with_notifier");
            dan.a(r, a);
            dan.a(r, d);
            dan.a(r, e);
            dan.a(r, h);
            dan.a(r, j);
            dan.a(r, l);
            dan.a(r, o);
            Object obj = r.getString(k, "");
            try
            {
                int i1 = Integer.parseInt(((String) (obj)));
                r.edit().putInt(k, i1).apply();
            }
            catch (NumberFormatException numberformatexception)
            {
                r.edit().remove(k).apply();
            }
            obj = r.getAll().keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s1 = (String)((Iterator) (obj)).next();
                if (s1.contains("employee.settings.surge.fake.view_format_"))
                {
                    r.edit().remove(s1).apply();
                }
            } while (true);
        }
    }

    public final String A()
    {
        return r.getString(p, "");
    }

    public final void B()
    {
        r.edit().remove(n).remove(q).apply();
    }

    public final boolean C()
    {
        return r.getBoolean(n, false);
    }

    public final boolean D()
    {
        return r.getBoolean("safetynet_configured", false);
    }

    public final boolean E()
    {
        return r.getBoolean("safetynet_popup_shown", false);
    }

    public final void F()
    {
        r.edit().putBoolean("safetynet_popup_shown", true).apply();
    }

    public final boolean G()
    {
        return r.getBoolean("add_music_dismissed", false);
    }

    public final void a(int i1)
    {
        if (i1 == 0)
        {
            r.edit().putInt(k, i1).apply();
            return;
        }
        if (i1 == 2)
        {
            r.edit().putInt(k, i1).apply();
            return;
        } else
        {
            r.edit().remove(k).apply();
            return;
        }
    }

    public final void a(String s1)
    {
        r.edit().putString(m, s1).apply();
    }

    public final void a(boolean flag)
    {
        r.edit().putBoolean(l, flag).apply();
    }

    public final boolean a()
    {
        return r.getBoolean(l, false);
    }

    public final void b(String s1)
    {
        r.edit().putBoolean(String.format("employee.settings.surge.fake.view_format_%s", new Object[] {
            s1
        }), true).apply();
    }

    public final void b(boolean flag)
    {
        r.edit().putBoolean(q, flag).apply();
    }

    public final boolean b()
    {
        return r.getBoolean(q, false);
    }

    public final void c()
    {
        r.edit().putBoolean(a, true).apply();
    }

    public final void c(String s1)
    {
        r.edit().putBoolean(String.format("employee.settings.surge.fake.view_format_%s", new Object[] {
            s1
        }), false).apply();
    }

    public final void c(boolean flag)
    {
        r.edit().putBoolean(c, flag).apply();
    }

    public final void d()
    {
        r.edit().putBoolean(a, false).apply();
    }

    public final void d(boolean flag)
    {
        r.edit().putBoolean(d, flag).apply();
    }

    public final boolean d(String s1)
    {
        return r.getBoolean(String.format("employee.settings.surge.fake.view_format_%s", new Object[] {
            s1
        }), false);
    }

    public final void e(String s1)
    {
        r.edit().putString(g, s1).apply();
    }

    public final void e(boolean flag)
    {
        r.edit().putBoolean(e, flag).apply();
    }

    public final boolean e()
    {
        return r.getBoolean(a, false);
    }

    public final String f()
    {
        String s2 = r.getString(m, "");
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = "live";
        }
        return s1;
    }

    public final void f(String s1)
    {
        r.edit().putString(b, s1).apply();
    }

    public final void f(boolean flag)
    {
        r.edit().putBoolean(f, flag).apply();
    }

    public final void g(String s1)
    {
        r.edit().putString("last_downloaded_employee_upgrade_uri", s1).apply();
    }

    public final void g(boolean flag)
    {
        r.edit().putBoolean(o, flag).apply();
    }

    public final boolean g()
    {
        return r.getBoolean(c, false);
    }

    public final void h(String s1)
    {
        r.edit().putString(p, s1).apply();
    }

    public final void h(boolean flag)
    {
        r.edit().putBoolean(j, flag).apply();
    }

    public final boolean h()
    {
        return r.getBoolean(d, false);
    }

    public final void i(boolean flag)
    {
        r.edit().putBoolean("registered_with_notifier", flag).apply();
    }

    public final boolean i()
    {
        return r.getBoolean(e, false);
    }

    public final void j(boolean flag)
    {
        r.edit().putBoolean(h, flag).apply();
    }

    public final boolean j()
    {
        return r.getBoolean(f, false);
    }

    public final void k()
    {
        r.edit().remove(g).apply();
    }

    public final void k(boolean flag)
    {
        r.edit().putBoolean(i, flag).apply();
    }

    public final String l()
    {
        return r.getString(g, "");
    }

    public final void l(boolean flag)
    {
        r.edit().putBoolean(n, flag).apply();
    }

    public final void m(boolean flag)
    {
        r.edit().putBoolean("safetynet_configured", flag).apply();
    }

    public final boolean m()
    {
        return !TextUtils.isEmpty(r.getString(g, ""));
    }

    public final int n()
    {
        return r.getInt(k, 1);
    }

    public final void n(boolean flag)
    {
        r.edit().putBoolean("add_music_dismissed", flag).apply();
    }

    public final boolean o()
    {
        return r.getBoolean(o, false);
    }

    public final boolean p()
    {
        return r.getBoolean(j, false);
    }

    public final boolean q()
    {
        return r.getBoolean("registered_with_notifier", false);
    }

    public final void r()
    {
        r.edit().putBoolean("has_tracked_install", true).apply();
    }

    public final boolean s()
    {
        return r.getBoolean("has_tracked_install", false);
    }

    public final void t()
    {
        r.edit().putBoolean("has_tracked_signup", true).apply();
    }

    public final boolean u()
    {
        return r.getBoolean("has_tracked_signup", false);
    }

    public final boolean v()
    {
        return r.getBoolean(h, false);
    }

    public final boolean w()
    {
        return !TextUtils.isEmpty(x());
    }

    public final String x()
    {
        return r.getString(b, "");
    }

    public final String y()
    {
        return r.getString("last_downloaded_employee_upgrade_uri", "");
    }

    public final boolean z()
    {
        return r.getBoolean(i, false);
    }
}
