// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.content.Context;
import android.os.Handler;
import com.jiubang.core.c.a.a;
import com.jiubang.core.c.a.b;
import java.io.File;
import java.util.WeakHashMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.d:
//            h, k, d, f, 
//            j, b

public class c
    implements com.jiubang.core.c.a.c
{

    private Context a;
    private b b;
    private WeakHashMap c;
    private Handler d;

    public c(Context context)
    {
        c = new WeakHashMap();
        a = context;
        b = new b(a);
        b.a(this);
        d = new Handler();
    }

    static Context a(c c1)
    {
        return c1.a;
    }

    static Handler b(c c1)
    {
        return c1.d;
    }

    public void a()
    {
        b.a(true);
    }

    public void a(j j, String s, com.gtp.go.weather.sharephoto.d.b b1, k k1)
    {
        j = com.gtp.go.weather.sharephoto.d.h.a(j);
        String s1 = (new StringBuilder()).append(com.gtp.go.weather.sharephoto.d.h.a(s)).append(".png").toString();
        String s2 = (new StringBuilder(j)).append(File.separator).append(s1).toString();
        if (com.gtp.go.weather.sharephoto.d.h.b(s2))
        {
            k1.a();
            (new d(this, s2, b1, k1, s)).start();
            return;
        } else
        {
            c.put(s, k1);
            b.a(new a(s, j, s1));
            return;
        }
    }

    public void a(a a1)
    {
        a1 = (k)c.get(a1.a);
        if (a1 != null)
        {
            a1.a();
        }
    }

    public void b(a a1)
    {
        k k1 = (k)c.get(a1.a);
        if (k1 != null)
        {
            k1.a(a1.e);
        }
    }

    public void c(a a1)
    {
        k k1 = (k)c.remove(a1.a);
        if (k1 != null)
        {
            (new f(this, a1, k1)).start();
        }
    }

    public void d(a a1)
    {
        k k1 = (k)c.remove(a1.a);
        if (k1 != null)
        {
            k1.a(false, a1.a, null, "");
        }
    }
}
