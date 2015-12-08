// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.e.a;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            b, g, a

public final class f
    implements b
{

    public final int a;
    private int b;
    private int c;
    private byte d[][];

    public f(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.a(flag);
        a = i;
        d = new byte[100][];
    }

    public final int a()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = b;
        j = a;
        this;
        JVM INSTR monitorexit ;
        return i * j;
        Exception exception;
        exception;
        throw exception;
    }

    public final com.google.android.exoplayer.upstream.a a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        long l = i;
        byte abyte1[][];
        int j;
        j = (int)(((l + (long)a) - 1L) / (long)a);
        b = b + j;
        abyte1 = new byte[j][];
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        byte abyte0[][];
        int k;
        if (c <= 0)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        abyte0 = d;
        k = c - 1;
        c = k;
        Object obj;
        obj = abyte0[k];
        break MISSING_BLOCK_LABEL_113;
        obj = new byte[a];
        break MISSING_BLOCK_LABEL_113;
        obj = new g(this, abyte1);
        this;
        JVM INSTR monitorexit ;
        return ((com.google.android.exoplayer.upstream.a) (obj));
        obj;
        throw obj;
        abyte1[i] = ((byte []) (obj));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    final void a(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        g1 = g1.a();
        b = b - g1.length;
        int i = c + g1.length;
        if (d.length < i)
        {
            byte abyte0[][] = new byte[i * 2][];
            if (c > 0)
            {
                System.arraycopy(d, 0, abyte0, 0, c);
            }
            d = abyte0;
        }
        System.arraycopy(g1, 0, d, c, g1.length);
        c = i;
        this;
        JVM INSTR monitorexit ;
        return;
        g1;
        throw g1;
    }

    public final void b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        i = Math.max(0, ((a + i) - 1) / a - b);
        if (i < c)
        {
            Arrays.fill(d, i, c, null);
            c = i;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
