// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import com.google.android.apps.youtube.common.fromguava.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            f

public final class d
{

    private final LinkedList a;
    private final AtomicInteger b;
    private final Object c;
    private int d;

    public d()
    {
        this(0x7fffffff);
    }

    private d(int i)
    {
        a = new LinkedList();
        b = new AtomicInteger();
        c = new Object();
        d = 1000;
        a(0x7fffffff);
    }

    static int a(d d1, InputStream inputstream)
    {
        if (d1.b.intValue() == 0x7fffffff)
        {
            return inputstream.read();
        } else
        {
            d1 = d1.b(1);
            int i = inputstream.read();
            d1.a(1);
            return i;
        }
    }

    static int a(d d1, InputStream inputstream, byte abyte0[], int i, int j)
    {
        if (j == 0)
        {
            return 0;
        }
        if (d1.b.intValue() == 0x7fffffff)
        {
            return inputstream.read(abyte0, i, j);
        } else
        {
            d1 = d1.b(j);
            i = inputstream.read(abyte0, i, ((f) (d1)).b);
            d1.a(i);
            return i;
        }
    }

    private f b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
_L2:
        Object obj1;
        int l;
        long l2;
        l = b.intValue();
        l2 = System.currentTimeMillis();
        obj1 = a.iterator();
        int j;
        long l1;
        l1 = l2;
        j = 0;
_L3:
        f f1;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_140;
            }
            f1 = (f)((Iterator) (obj1)).next();
            if (f1.a > l2 - (long)d)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            ((Iterator) (obj1)).remove();
        } while (true);
        Object obj2;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        int k;
        if (!f1.b())
        {
            break MISSING_BLOCK_LABEL_130;
        }
        k = f1.a();
_L1:
        if (f1.a < l1)
        {
            l1 = f1.a;
        }
        break MISSING_BLOCK_LABEL_229;
        k = f1.b;
          goto _L1
        j = Math.min(l - j, i);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        obj2 = new f(c, j, l2);
        a.addLast(obj2);
        obj;
        JVM INSTR monitorexit ;
        this;
        JVM INSTR monitorexit ;
        return ((f) (obj2));
        c.wait((long)d - (l2 - l1));
          goto _L2
        obj2;
        IOException ioexception = new IOException("interrupted");
        ioexception.initCause(((Throwable) (obj2)));
        throw ioexception;
        j = k + j;
          goto _L3
    }

    public final void a(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "bytesPerSecond cannot be negative");
        b.set(i);
    }
}
