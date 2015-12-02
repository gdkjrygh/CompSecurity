// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class hzn
    implements hzw
{

    private int a;
    private final hzh b;
    private final Inflater c;
    private final hzo d;
    private final CRC32 e = new CRC32();

    public hzn(hzw hzw1)
    {
        a = 0;
        if (hzw1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            c = new Inflater(true);
            b = hzp.a(hzw1);
            d = new hzo(b, c);
            return;
        }
    }

    private void a()
    {
        b.a(10L);
        byte byte0 = b.b().b(3L);
        boolean flag;
        if ((byte0 >> 1 & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(b.b(), 0L, 10L);
        }
        a("ID1ID2", 8075, b.i());
        b.f(8L);
        if ((byte0 >> 2 & 1) == 1)
        {
            b.a(2L);
            if (flag)
            {
                a(b.b(), 0L, 2L);
            }
            int i = b.b().k();
            b.a(i);
            if (flag)
            {
                a(b.b(), 0L, i);
            }
            b.f(i);
        }
        if ((byte0 >> 3 & 1) == 1)
        {
            long l = b.a((byte)0);
            if (l == -1L)
            {
                throw new EOFException();
            }
            if (flag)
            {
                a(b.b(), 0L, 1L + l);
            }
            b.f(1L + l);
        }
        if ((byte0 >> 4 & 1) == 1)
        {
            long l1 = b.a((byte)0);
            if (l1 == -1L)
            {
                throw new EOFException();
            }
            if (flag)
            {
                a(b.b(), 0L, 1L + l1);
            }
            b.f(1L + l1);
        }
        if (flag)
        {
            a("FHCRC", b.k(), (short)(int)e.getValue());
            e.reset();
        }
    }

    private void a(hzf hzf1, long l, long l1)
    {
        hzf1 = hzf1.a;
        Object obj;
        long l2;
        long l3;
        do
        {
            obj = hzf1;
            l2 = l;
            l3 = l1;
            if (l < (long)(((hzs) (hzf1)).c - ((hzs) (hzf1)).b))
            {
                break;
            }
            l -= ((hzs) (hzf1)).c - ((hzs) (hzf1)).b;
            hzf1 = ((hzs) (hzf1)).f;
        } while (true);
        while (l3 > 0L) 
        {
            int i = (int)((long)((hzs) (obj)).b + l2);
            int j = (int)Math.min(((hzs) (obj)).c - i, l3);
            e.update(((hzs) (obj)).a, i, j);
            l3 -= j;
            obj = ((hzs) (obj)).f;
            l2 = 0L;
        }
    }

    private static void a(String s, int i, int j)
    {
        if (j != i)
        {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[] {
                s, Integer.valueOf(j), Integer.valueOf(i)
            }));
        } else
        {
            return;
        }
    }

    private void b()
    {
        a("CRC", b.l(), (int)e.getValue());
        a("ISIZE", b.l(), c.getTotalOut());
    }

    public final void close()
    {
        d.close();
    }

    public final long read(hzf hzf1, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (l == 0L)
        {
            return 0L;
        }
        if (a == 0)
        {
            a();
            a = 1;
        }
        if (a == 1)
        {
            long l1 = hzf1.b;
            l = d.read(hzf1, l);
            if (l != -1L)
            {
                a(hzf1, l1, l);
                return l;
            }
            a = 2;
        }
        if (a == 2)
        {
            b();
            a = 3;
            if (!b.e())
            {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final hzx timeout()
    {
        return b.timeout();
    }
}
