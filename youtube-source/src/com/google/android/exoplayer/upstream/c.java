// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.os.Handler;
import com.google.android.exoplayer.e.a;
import com.google.android.exoplayer.e.b;
import com.google.android.exoplayer.e.e;
import com.google.android.exoplayer.e.i;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            l, d, e

public final class c
    implements l
{

    private final Handler a;
    private final com.google.android.exoplayer.upstream.e b;
    private final b c;
    private final e d;
    private long e;
    private long f;
    private long g;
    private int h;

    public c(Handler handler, com.google.android.exoplayer.upstream.e e1)
    {
        this(handler, e1, ((b) (new i())));
    }

    private c(Handler handler, com.google.android.exoplayer.upstream.e e1, b b1)
    {
        this(handler, e1, b1, 2000);
    }

    private c(Handler handler, com.google.android.exoplayer.upstream.e e1, b b1, int j)
    {
        a = handler;
        b = e1;
        c = b1;
        d = new e(2000);
        g = -1L;
    }

    static com.google.android.exoplayer.upstream.e a(c c1)
    {
        return c1.b;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (h == 0)
        {
            f = c.a();
        }
        h = h + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int j)
    {
        this;
        JVM INSTR monitorenter ;
        e = e + (long)j;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        int j;
        long l1;
        long l2;
        long l3;
        boolean flag;
        if (h > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        l2 = c.a();
        j = (int)(l2 - f);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        f1 = (e * 1000L) / (long)j;
        d.a((int)Math.sqrt(e), f1);
        f1 = d.a(0.5F);
        if (f1 == (0.0F / 0.0F))
        {
            l1 = -1L;
        } else
        {
            l1 = (long)f1;
        }
        g = l1;
        l1 = e;
        l3 = g;
        if (a != null && b != null)
        {
            a.post(new d(this, j, l1, l3));
        }
        h = h - 1;
        if (h > 0)
        {
            f = l2;
        }
        e = 0L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long c()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = g;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }
}
