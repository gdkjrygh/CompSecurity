// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class hzo
    implements hzw
{

    private final hzh a;
    private final Inflater b;
    private int c;
    private boolean d;

    hzo(hzh hzh1, Inflater inflater)
    {
        if (hzh1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = hzh1;
            b = inflater;
            return;
        }
    }

    public hzo(hzw hzw1, Inflater inflater)
    {
        this(hzp.a(hzw1), inflater);
    }

    private void b()
    {
        if (c == 0)
        {
            return;
        } else
        {
            int i = c - b.getRemaining();
            c = c - i;
            a.f(i);
            return;
        }
    }

    public final boolean a()
    {
        if (!b.needsInput())
        {
            return false;
        }
        b();
        if (b.getRemaining() != 0)
        {
            throw new IllegalStateException("?");
        }
        if (a.e())
        {
            return true;
        } else
        {
            hzs hzs1 = a.b().a;
            c = hzs1.c - hzs1.b;
            b.setInput(hzs1.a, hzs1.b, c);
            return false;
        }
    }

    public final void close()
    {
        if (d)
        {
            return;
        } else
        {
            b.end();
            d = true;
            a.close();
            return;
        }
    }

    public final long read(hzf hzf1, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (d)
        {
            throw new IllegalStateException("closed");
        }
        if (l == 0L)
        {
            return 0L;
        }
_L2:
        boolean flag = a();
        hzs hzs1;
        int i;
        try
        {
            hzs1 = hzf1.e(1);
            i = b.inflate(hzs1.a, hzs1.c, 2048 - hzs1.c);
        }
        // Misplaced declaration of an exception variable
        catch (hzf hzf1)
        {
            throw new IOException(hzf1);
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        hzs1.c = hzs1.c + i;
        hzf1.b = hzf1.b + (long)i;
        return (long)i;
        if (b.finished() || b.needsDictionary())
        {
            b();
            if (hzs1.b == hzs1.c)
            {
                hzf1.a = hzs1.a();
                hzt.a(hzs1);
            }
            break MISSING_BLOCK_LABEL_209;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        throw new EOFException("source exhausted prematurely");
        return -1L;
    }

    public final hzx timeout()
    {
        return a.timeout();
    }
}
