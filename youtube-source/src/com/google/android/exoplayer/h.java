// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer:
//            d, i, j, g, 
//            ExoPlaybackException, e, ak

final class h
    implements d
{

    private final Handler a = new i(this);
    private final j b;
    private final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    private final boolean d[];
    private boolean e;
    private int f;
    private int g;

    public h(int k, int l, int i1)
    {
        f = 1;
        d = new boolean[k];
        for (k = 0; k < d.length; k++)
        {
            d[k] = true;
        }

        b = new j(a, e, d, l, i1);
    }

    public final int a()
    {
        return f;
    }

    public final void a(int k)
    {
        b.a(k);
    }

    public final void a(int k, boolean flag)
    {
        if (d[1] != flag)
        {
            d[1] = flag;
            b.a(1, flag);
        }
    }

    final void a(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 33
    //                   2 83
    //                   3 127;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        f = message.arg1;
        message = c.iterator();
        while (message.hasNext()) 
        {
            ((g)message.next()).a(e, f);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        g = g - 1;
        if (g == 0)
        {
            message = c.iterator();
            while (message.hasNext()) 
            {
                message.next();
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        message = (ExoPlaybackException)message.obj;
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) 
        {
            ((g)iterator.next()).a(message);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void a(e e1, int k, Object obj)
    {
        b.a(e1, k, obj);
    }

    public final void a(g g1)
    {
        c.add(g1);
    }

    public final void a(boolean flag)
    {
        if (e != flag)
        {
            e = flag;
            g = g + 1;
            b.a(flag);
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((g)iterator.next()).a(flag, f)) { }
        }
    }

    public final transient void a(ak aak[])
    {
        b.a(aak);
    }

    public final void b(e e1, int k, Object obj)
    {
        b.b(e1, 1, null);
    }

    public final boolean b()
    {
        return e;
    }

    public final void c()
    {
        b.d();
        a.removeCallbacksAndMessages(null);
    }

    public final int d()
    {
        return b.c();
    }

    public final int e()
    {
        return b.a();
    }

    public final int f()
    {
        int k = b.b();
        int l = b.c();
        if (k == -1 || l == -1)
        {
            return 0;
        }
        if (l == 0)
        {
            return 100;
        } else
        {
            return (k * 100) / l;
        }
    }
}
