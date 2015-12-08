// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.os.Handler;

// Referenced classes of package com.facebook.ads.a:
//            p, e

public abstract class f
{

    protected final a a;
    protected e b;
    private final long c;
    private final Handler d = new Handler();
    private final Runnable e = new _cls1();
    private Context f;
    private volatile boolean g;
    private volatile boolean h;

    public f(a a1, long l, Context context)
    {
        f = context;
        a = a1;
        c = l;
    }

    static boolean a(f f1, boolean flag)
    {
        f1.h = flag;
        return flag;
    }

    public e a()
    {
        return b;
    }

    public void a(e e1)
    {
        b = e1;
        g = false;
        h = false;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (g || h) goto _L2; else goto _L1
_L1:
        e e1 = b;
        if (e1 != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        d.postDelayed(e, c);
        h = true;
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (h)
        {
            d.removeCallbacks(e);
            h = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null) goto _L2; else goto _L1
_L1:
        boolean flag = g;
        if (!flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (a == null || a.a())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        b();
          goto _L2
        Exception exception;
        exception;
        throw exception;
        if (a != null)
        {
            a.c();
        }
        e();
        g = true;
        p.a(f, "Impression logged");
          goto _L2
    }

    protected abstract void e();

    private class _cls1
        implements Runnable
    {

        final f a;

        public void run()
        {
            f.a(a, false);
            a.d();
        }

        _cls1()
        {
            a = f.this;
            super();
        }
    }


    private class a
    {

        public abstract boolean a();

        public abstract void b();

        public abstract void c();

        public abstract boolean d();
    }

}
