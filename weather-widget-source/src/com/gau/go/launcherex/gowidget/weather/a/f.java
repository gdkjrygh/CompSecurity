// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.a;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.goweather.b.e;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.a:
//            a, i

public class f extends a
{

    private i c;

    public f(Context context)
    {
        super(context);
    }

    private void b()
    {
        if (c != null)
        {
            c.cancel(true);
            c = null;
        }
    }

    private e c(String s)
    {
        Object obj = new StringBuilder();
        ((StringBuilder) (obj)).append("http://").append("goweatherex.3g.cn").append("/goweatherex/city/search");
        obj = new e(((StringBuilder) (obj)).toString(), 5000, 5000);
        ((e) (obj)).a("k", s);
        ((e) (obj)).a(a);
        return ((e) (obj));
    }

    private e d(String s)
    {
        return new e(s, 5000, 5000);
    }

    public void a()
    {
        b();
        b = null;
    }

    public void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            b();
            c = new i(this, null);
            c.execute(new e[] {
                d(s)
            });
            return;
        }
    }

    public void b(String s)
    {
        if (TextUtils.isEmpty(s) || s.equals(b))
        {
            return;
        } else
        {
            b();
            b = s;
            c = new i(this, null);
            c.execute(new e[] {
                c(b)
            });
            return;
        }
    }
}
