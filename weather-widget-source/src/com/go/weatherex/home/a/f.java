// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.scriptengine.parser.c;
import com.gau.go.launcherex.gowidget.scriptengine.parser.z;
import com.gtp.go.weather.sharephoto.x;
import com.jiubang.core.a.i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.go.weatherex.home.a:
//            g, j, i, k, 
//            e, h

public class f
{

    private Context a;
    private final x b;
    private final ExecutorService c = Executors.newSingleThreadExecutor();
    private Handler d;
    private com.go.weatherex.home.a.i e;
    private j f;
    private h g;

    public f(Context context)
    {
        a = context.getApplicationContext();
        d = new g(this);
        b = new x(a);
    }

    static i a(f f1, k k1)
    {
        return f1.b(k1);
    }

    static i a(f f1, k k1, i l)
    {
        return f1.a(k1, l);
    }

    private i a(k k1, i l)
    {
        Message.obtain(d, 1, ((Object) (new Object[] {
            k1, l
        }))).sendToTarget();
        return l;
    }

    private void a()
    {
        if (f != null)
        {
            f.cancel(true);
        }
        f = null;
        e = null;
    }

    private boolean a(k k1)
    {
        return f != null && e != null && e.a.a(k1);
    }

    private i b(k k1)
    {
        if (k1.a instanceof e)
        {
            return b.a(k1.b, k1.c);
        } else
        {
            return (new c(a, k1.a, k1.b, k1.c, false)).a(k1.a.a());
        }
    }

    static void b(f f1, k k1, i l)
    {
        f1.b(k1, l);
    }

    private void b(k k1, i l)
    {
        e = null;
        f = null;
        if (g != null)
        {
            g.a(l, k1.a, k1.b, k1.c);
        }
    }

    public void a(z z1, int l, int i1)
    {
        z1 = new k(z1, l, i1);
        if (a(((k) (z1))))
        {
            return;
        } else
        {
            a();
            e = new com.go.weatherex.home.a.i(this, z1);
            f = new j(this, e);
            c.execute(f);
            return;
        }
    }

    public void a(h h1)
    {
        g = h1;
    }

    public i b(z z1, int l, int i1)
    {
        k k1 = new k(z1, l, i1);
        if (!a(k1)) goto _L2; else goto _L1
_L1:
        z1 = (i)f.get();
_L4:
        Object obj = z1;
        if (z1 == null)
        {
            obj = b(k1);
        }
        return ((i) (obj));
        z1;
        z1.printStackTrace();
        z1 = null;
        continue; /* Loop/switch isn't completed */
        z1;
        z1.printStackTrace();
_L2:
        z1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
