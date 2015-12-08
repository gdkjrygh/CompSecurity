// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.c;

import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import com.gau.go.launcherex.gowidget.gcm.b;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.c:
//            e, g, d

public class c
    implements o
{

    private static c b;
    private Context a;
    private SparseBooleanArray c;
    private com.gau.go.launcherex.gowidget.weather.c.e d;
    private f e;
    private e f;
    private i g;
    private com.gau.go.launcherex.gowidget.weather.d.f h;
    private b i;
    private g j;
    private final List k = new ArrayList();

    private c(Context context)
    {
        c = new SparseBooleanArray();
        a = context.getApplicationContext();
        j();
    }

    public static c a(Context context)
    {
        com/gau/go/launcherex/gowidget/weather/c/c;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new c(context);
        }
        context = b;
        com/gau/go/launcherex/gowidget/weather/c/c;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void j()
    {
        d = com.gau.go.launcherex.gowidget.weather.c.e.a(a);
        e = com.gau.go.launcherex.gowidget.weather.util.f.a(a);
        g = new i(a);
        f = com.gau.go.launcherex.gowidget.language.e.a(a);
        h = com.gau.go.launcherex.gowidget.weather.d.f.a(a);
        i = com.gau.go.launcherex.gowidget.gcm.b.a(a);
        j = new g(a);
    }

    private void k()
    {
        if (d.f())
        {
            d.c();
        }
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        a.sendStickyBroadcast(intent);
    }

    public void a()
    {
        c.put(1, false);
        c.put(4, false);
        c.put(5, false);
        c.put(6, false);
        d.a(this);
        e.a(this);
    }

    public void a(int l)
    {
        c.put(l, true);
        if (l == 1)
        {
            f.j();
            g.a(this);
            j.a(this);
        }
        if (b())
        {
            k();
            i();
        }
    }

    public void a(d d1)
    {
        if (d1 == null)
        {
            throw new IllegalArgumentException("DataStateListener can not be null!");
        }
        if (k.contains(d1))
        {
            throw new IllegalStateException("DataStateListener had register before, did you forget to unregister it?");
        } else
        {
            k.add(d1);
            return;
        }
    }

    public void b(d d1)
    {
        if (d1 == null)
        {
            throw new IllegalArgumentException("DataStateListener can not be null!");
        }
        if (!k.contains(d1))
        {
            throw new IllegalStateException("DataStateListener did not register before, do unregister the wrong one?");
        } else
        {
            k.remove(d1);
            return;
        }
    }

    public boolean b()
    {
        int i1 = c.size();
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        int l = 0;
_L5:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c.valueAt(l)) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        l++;
        if (true) goto _L5; else goto _L4
_L4:
        return true;
    }

    public e c()
    {
        return f;
    }

    public i d()
    {
        return g;
    }

    public com.gau.go.launcherex.gowidget.weather.d.f e()
    {
        return h;
    }

    public com.gau.go.launcherex.gowidget.weather.c.e f()
    {
        return d;
    }

    public g g()
    {
        return j;
    }

    public f h()
    {
        return e;
    }

    protected void i()
    {
        Object obj = new ArrayList();
        ((List) (obj)).addAll(k);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((d)((Iterator) (obj)).next()).a()) { }
    }
}
