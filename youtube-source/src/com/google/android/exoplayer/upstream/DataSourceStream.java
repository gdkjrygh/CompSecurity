// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.e.k;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            o, p, j, a, 
//            i, b, UnexpectedLengthException

public final class DataSourceStream
    implements o, p
{

    private final i a;
    private final j b;
    private final b c;
    private a d;
    private long e;
    private volatile boolean f;
    private volatile long g;
    private volatile int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    public DataSourceStream(i i1, j j1, b b1)
    {
        a = i1;
        b = j1;
        c = b1;
    }

    private int a(ByteBuffer bytebuffer, byte abyte0[], int i1, int j1)
    {
        byte abyte1[][];
        int k1;
        int i2;
        if (e == b.e)
        {
            return -1;
        }
        i2 = (int)Math.min(g - e, j1);
        if (i2 == 0)
        {
            return 0;
        }
        if (e == 0L)
        {
            i = 0;
            a a1 = d;
            j = 0;
            k = d.b();
        }
        abyte1 = d.a();
        j1 = 0;
        k1 = i1;
        i1 = j1;
_L7:
        if (i1 >= i2) goto _L2; else goto _L1
_L1:
        int j2 = Math.min(k, i2 - i1);
        if (bytebuffer == null) goto _L4; else goto _L3
_L3:
        bytebuffer.put(abyte1[i], j, j2);
        j1 = k1;
_L5:
        e = e + (long)j2;
        int l1 = i1 + j2;
        j = j + j2;
        k = k - j2;
        k1 = j1;
        i1 = l1;
        if (k == 0)
        {
            k1 = j1;
            i1 = l1;
            if (e < (long)h)
            {
                i = i + 1;
                a a2 = d;
                i1 = i;
                j = 0;
                a2 = d;
                i1 = i;
                k = a2.b();
                k1 = j1;
                i1 = l1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        j1 = k1;
        if (abyte0 != null)
        {
            System.arraycopy(abyte1[i], j, abyte0, k1, j2);
            j1 = k1 + j2;
        }
        if (true) goto _L5; else goto _L2
_L2:
        return i1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int a(int i1)
    {
        return a(null, null, 0, i1);
    }

    public final int a(ByteBuffer bytebuffer, int i1)
    {
        return a(bytebuffer, null, 0, i1);
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        return a(null, abyte0, i1, j1);
    }

    public final void a()
    {
        e = 0L;
    }

    public final long b()
    {
        return g;
    }

    public final boolean c()
    {
        return h != 0 && e == (long)h;
    }

    public final void d()
    {
        if (d != null)
        {
            d.c();
            d = null;
        }
    }

    public final void g()
    {
        f = true;
    }

    public final boolean h()
    {
        return f;
    }

    public final void i()
    {
label0:
        {
            boolean flag1 = false;
            if (!f)
            {
                boolean flag = flag1;
                if (h != 0)
                {
                    flag = flag1;
                    if (g == (long)h)
                    {
                        flag = true;
                    }
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return;
        }
        if (h != 0) goto _L2; else goto _L1
_L1:
        j j1 = b;
        h = (int)a.a(j1);
_L4:
        if (d == null)
        {
            d = c.a(h);
        }
        if (g == 0L)
        {
            l = 0;
            a a1 = d;
            m = 0;
            n = d.b();
        }
        int i1 = 0x7fffffff;
        Object obj = d.a();
_L6:
        if (f || g >= (long)h || i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
          goto _L3
        obj;
        com.google.android.exoplayer.e.k.a(a);
        throw obj;
_L2:
        obj = new j(b.a, b.d + g, (long)h - g, b.f);
        a.a(((j) (obj)));
          goto _L4
_L3:
        int k1;
        i1 = (int)Math.min(n, (long)h - g);
        k1 = a.a(obj[l], m, i1);
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        g = g + (long)k1;
        m = m + k1;
        n = n - k1;
        i1 = k1;
        if (n != 0) goto _L6; else goto _L5
_L5:
        i1 = k1;
        if (g >= (long)h) goto _L6; else goto _L7
_L7:
        l = l + 1;
        a a2 = d;
        i1 = l;
        m = 0;
        a2 = d;
        i1 = l;
        n = a2.b();
        i1 = k1;
          goto _L6
        i1 = k1;
        if ((long)h == g) goto _L6; else goto _L8
_L8:
        throw new DataSourceStreamLoadException(new UnexpectedLengthException(h, g));
        com.google.android.exoplayer.e.k.a(a);
        return;
          goto _L4
    }

    private class DataSourceStreamLoadException extends IOException
    {

        public DataSourceStreamLoadException(IOException ioexception)
        {
            super(ioexception);
        }
    }

}
