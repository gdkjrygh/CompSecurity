// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c.a;

import android.content.Context;
import android.text.TextUtils;
import com.gtp.go.weather.sharephoto.d.m;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.jiubang.core.c.a:
//            a, i

public class g
{

    private static g a;
    private Context b;
    private int c;
    private HashMap d;
    private ArrayList e;

    private g(Context context)
    {
        c = 0;
        b = context;
        c = 0;
        d = new HashMap();
    }

    static Context a(g g1)
    {
        return g1.b;
    }

    public static g a(Context context)
    {
        if (a == null)
        {
            a = new g(context);
        }
        return a;
    }

    public static String a(String s)
    {
        String s1 = m.a(s);
        if (!TextUtils.isEmpty(s1))
        {
            return s1;
        } else
        {
            return Integer.toString(s.hashCode());
        }
    }

    private void a()
    {
        int k = c;
        int j = k;
        if (e != null)
        {
            j = k + e.size();
        }
        if (j == 0)
        {
            b();
        } else
        if (e != null && e.size() > 0 && c < 2)
        {
            a a1 = (a)e.remove(0);
            c = c + 1;
            (new i(this, null)).execute(new a[] {
                a1
            });
            return;
        }
    }

    static HashMap b(g g1)
    {
        return g1.d;
    }

    private void b()
    {
        a = null;
        d.clear();
    }

    static int c(g g1)
    {
        int j = g1.c;
        g1.c = j - 1;
        return j;
    }

    static void d(g g1)
    {
        g1.a();
    }

    public void a(a a1)
    {
label0:
        {
            if (!d.containsKey(a1.a))
            {
                d.put(a1.a, a1);
                if (c >= 2)
                {
                    break label0;
                }
                c = c + 1;
                (new i(this, null)).execute(new a[] {
                    a1
                });
            }
            return;
        }
        if (e == null)
        {
            e = new ArrayList();
        }
        e.add(a1);
    }
}
