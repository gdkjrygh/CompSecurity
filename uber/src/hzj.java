// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.zip.Deflater;

public final class hzj
    implements hzv
{

    private final hzg a;
    private final Deflater b;
    private boolean c;

    private hzj(hzg hzg1, Deflater deflater)
    {
        if (hzg1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = hzg1;
            b = deflater;
            return;
        }
    }

    public hzj(hzv hzv1, Deflater deflater)
    {
        this(hzp.a(hzv1), deflater);
    }

    private void a()
    {
        b.finish();
        a(false);
    }

    private void a(boolean flag)
    {
        hzf hzf1 = a.b();
        hzs hzs1;
label0:
        do
        {
            do
            {
                hzs1 = hzf1.e(1);
                int i;
                if (flag)
                {
                    i = b.deflate(hzs1.a, hzs1.c, 2048 - hzs1.c, 2);
                } else
                {
                    i = b.deflate(hzs1.a, hzs1.c, 2048 - hzs1.c);
                }
                if (i <= 0)
                {
                    continue label0;
                }
                hzs1.c = hzs1.c + i;
                hzf1.b = hzf1.b + (long)i;
                a.u();
            } while (true);
        } while (!b.needsInput());
        if (hzs1.b == hzs1.c)
        {
            hzf1.a = hzs1.a();
            hzt.a(hzs1);
        }
    }

    public final void close()
    {
        if (!c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Throwable throwable1 = null;
        Throwable throwable;
        Throwable throwable2;
        try
        {
            a();
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable1) { }
        b.end();
        throwable = throwable1;
_L3:
        a.close();
        throwable1 = throwable;
_L4:
        c = true;
        if (throwable1 != null)
        {
            hzy.a(throwable1);
            return;
        }
          goto _L1
        throwable;
        if (throwable1 != null)
        {
            throwable = throwable1;
        }
          goto _L3
        throwable2;
        throwable1 = throwable;
        if (throwable == null)
        {
            throwable1 = throwable2;
        }
          goto _L4
    }

    public final void flush()
    {
        a(true);
        a.flush();
    }

    public final hzx timeout()
    {
        return a.timeout();
    }

    public final String toString()
    {
        return (new StringBuilder("DeflaterSink(")).append(a).append(")").toString();
    }

    public final void write(hzf hzf1, long l)
    {
        hzy.a(hzf1.b, 0L, l);
        int i;
        for (; l > 0L; l -= i)
        {
            hzs hzs1 = hzf1.a;
            i = (int)Math.min(l, hzs1.c - hzs1.b);
            b.setInput(hzs1.a, hzs1.b, i);
            a(false);
            hzf1.b = hzf1.b - (long)i;
            hzs1.b = hzs1.b + i;
            if (hzs1.b == hzs1.c)
            {
                hzf1.a = hzs1.a();
                hzt.a(hzs1);
            }
        }

    }
}
