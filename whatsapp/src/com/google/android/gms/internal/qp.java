// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            qw, qz

public final class qp
{

    private final int ayV;
    private final byte buffer[];
    private int position;

    private qp(byte abyte0[], int i, int k)
    {
        buffer = abyte0;
        position = i;
        ayV = i + k;
    }

    public static int D(long l)
    {
        return G(l);
    }

    public static int G(long l)
    {
        if ((-128L & l) == 0L)
        {
            return 1;
        }
        if ((-16384L & l) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l) != 0L ? 10 : 9;
    }

    public static int X(boolean flag)
    {
        return 1;
    }

    public static int b(int i, qw qw1)
    {
        return hc(i) * 2 + d(qw1);
    }

    public static qp b(byte abyte0[], int i, int k)
    {
        return new qp(abyte0, i, k);
    }

    public static int c(int i, qw qw1)
    {
        return hc(i) + e(qw1);
    }

    public static int c(int i, boolean flag)
    {
        return hc(i) + X(flag);
    }

    public static int d(int i, long l)
    {
        return hc(i) + D(l);
    }

    public static int d(qw qw1)
    {
        return qw1.rZ();
    }

    public static int dk(String s)
    {
        int i;
        int k;
        try
        {
            s = s.getBytes("UTF-8");
            i = he(s.length);
            k = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return k + i;
    }

    public static int e(qw qw1)
    {
        int i = qw1.rZ();
        return i + he(i);
    }

    public static int gZ(int i)
    {
        if (i >= 0)
        {
            try
            {
                i = he(i);
            }
            catch (RuntimeException runtimeexception)
            {
                throw runtimeexception;
            }
            return i;
        } else
        {
            return 10;
        }
    }

    public static int hc(int i)
    {
        return he(qz.y(i, 0));
    }

    public static int he(int i)
    {
        if ((i & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i) != 0 ? 5 : 4;
    }

    public static int j(int i, String s)
    {
        return hc(i) + dk(s);
    }

    public static qp q(byte abyte0[])
    {
        return b(abyte0, 0, abyte0.length);
    }

    public static int v(int i, int k)
    {
        return hc(i) + gZ(k);
    }

    public void B(long l)
    {
        F(l);
    }

    public void F(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                int i = (int)l;
                try
                {
                    hb(i);
                    return;
                }
                catch (RuntimeException runtimeexception)
                {
                    throw runtimeexception;
                }
            }
            hb((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public void W(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        hb(i);
    }

    public void a(int i, qw qw1)
    {
        x(i, 2);
        c(qw1);
    }

    public void b(byte byte0)
    {
        try
        {
            if (position == ayV)
            {
                throw new a(position, ayV);
            }
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        byte abyte0[] = buffer;
        int i = position;
        position = i + 1;
        abyte0[i] = byte0;
    }

    public void b(int i, long l)
    {
        x(i, 0);
        B(l);
    }

    public void b(int i, String s)
    {
        x(i, 2);
        dj(s);
    }

    public void b(int i, boolean flag)
    {
        x(i, 0);
        W(flag);
    }

    public void b(qw qw1)
    {
        qw1.a(this);
    }

    public void c(qw qw1)
    {
        hd(qw1.rY());
        qw1.a(this);
    }

    public void c(byte abyte0[], int i, int k)
    {
        int l;
        int i1;
        l = ayV;
        i1 = position;
        if (l - i1 < k)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        System.arraycopy(abyte0, i, buffer, position, k);
        position = position + k;
        if (!qw.a)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        throw new a(position, ayV);
        abyte0;
        throw abyte0;
        abyte0;
        throw abyte0;
    }

    public void dj(String s)
    {
        s = s.getBytes("UTF-8");
        hd(s.length);
        t(s);
    }

    public void gX(int i)
    {
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        hd(i);
        if (!qw.a)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        F(i);
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        throw runtimeexception;
    }

    public void hb(int i)
    {
        b((byte)i);
    }

    public void hd(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                try
                {
                    hb(i);
                    return;
                }
                catch (RuntimeException runtimeexception)
                {
                    throw runtimeexception;
                }
            }
            hb(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public void t(int i, int k)
    {
        x(i, 0);
        gX(k);
    }

    public void t(byte abyte0[])
    {
        c(abyte0, 0, abyte0.length);
    }

    public void x(int i, int k)
    {
        hd(qz.y(i, k));
    }

    private class a extends IOException
    {

        a(int i, int k)
        {
            super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(k).append(").").toString());
        }
    }

}
