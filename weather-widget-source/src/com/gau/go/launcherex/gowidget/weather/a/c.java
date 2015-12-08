// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.a;

import android.content.Context;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.a:
//            a, e

public class c extends a
{

    private e c;
    private final boolean d;

    public c(Context context, boolean flag)
    {
        super(context);
        d = flag;
    }

    static boolean a(c c1)
    {
        return c1.d;
    }

    private void b()
    {
        if (c != null)
        {
            c.cancel(true);
            c = null;
        }
    }

    public void a()
    {
        b();
        b = null;
    }

    public void b(String s)
    {
        if (s == null || s.equals(b))
        {
            return;
        } else
        {
            b();
            b = s;
            c = new e(this, null);
            c.execute(new String[] {
                b
            });
            return;
        }
    }
}
