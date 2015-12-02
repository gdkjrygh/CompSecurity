// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.InputStream;

// Referenced classes of package com.google:
//            d9, aI, c0, aQ

class g5 extends InputStream
{

    final aQ a;
    private int b;
    private c0 c;
    private int d;
    private int e;
    private aI f;
    private int g;

    public g5(aQ aq)
    {
        a = aq;
        super();
        b();
    }

    private int a(byte abyte0[], int i, int j)
    {
        int k1 = d9.c;
        int k = j;
        int l = i;
        i = k;
        k = l;
        int j1;
        do
        {
            j1 = i;
            if (i <= 0)
            {
                break;
            }
            aI ai;
            try
            {
                a();
                ai = f;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                try
                {
                    throw abyte0;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
            }
            if (ai == null)
            {
                j1 = i;
                if (i == j)
                {
                    return -1;
                }
                break;
            }
            j1 = Math.min(d - b, i);
            int i1 = k;
            if (abyte0 != null)
            {
                f.a(abyte0, b, k, j1);
                i1 = k + j1;
            }
            b = b + j1;
            j1 = i - j1;
            k = i1;
            i = j1;
        } while (k1 == 0);
        return j - j1;
    }

    private void a()
    {
        aI ai = f;
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        int i;
        int j;
        i = b;
        j = d;
        if (i != j)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        NullPointerException nullpointerexception;
        boolean flag;
        try
        {
            g = g + d;
            b = 0;
            flag = c.hasNext();
        }
        catch (NullPointerException nullpointerexception1)
        {
            try
            {
                throw nullpointerexception1;
            }
            catch (NullPointerException nullpointerexception2)
            {
                throw nullpointerexception2;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        f = c.b();
        d = f.c();
        if (d9.c == 0)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        f = null;
        d = 0;
        return;
        nullpointerexception;
        throw nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
    }

    private void b()
    {
        c = new c0(a, null);
        f = c.b();
        d = f.c();
        b = 0;
        g = 0;
    }

    public int available()
    {
        int i = g;
        int j = b;
        return a.c() - (i + j);
    }

    public void mark(int i)
    {
        e = g + b;
    }

    public boolean markSupported()
    {
        return true;
    }

    public int read()
    {
        aI ai;
        try
        {
            a();
            ai = f;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (ai == null)
        {
            return -1;
        } else
        {
            aI ai1 = f;
            int i = b;
            b = i + 1;
            return ai1.b(i) & 0xff;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        if (i < 0 || j < 0)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (j <= abyte0.length - i)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        throw new IndexOutOfBoundsException();
        abyte0;
        throw abyte0;
        return a(abyte0, i, j);
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        b();
        a(null, 0, e);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long skip(long l)
    {
        if (l < 0L)
        {
            try
            {
                throw new IndexOutOfBoundsException();
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
        }
        long l1 = l;
        if (l > 0x7fffffffL)
        {
            l1 = 0x7fffffffL;
        }
        return (long)a(null, 0, (int)l1);
    }
}
