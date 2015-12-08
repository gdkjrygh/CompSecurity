// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            jw

public final class ll
{

    private final byte a[];
    private final int b;
    private int c;

    private ll(byte abyte0[], int i, int j)
    {
        a = abyte0;
        c = i;
        b = i + j;
    }

    public static int a(int i)
    {
        return c(jw.a(i, 0));
    }

    public static int a(String s)
    {
        int i;
        int j;
        try
        {
            s = s.getBytes("UTF-8");
            i = c(s.length);
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return j + i;
    }

    public static ll a(byte abyte0[], int i, int j)
    {
        return new ll(abyte0, i, j);
    }

    public static int b(int i, long l)
    {
        int j = a(i);
        l = b(l);
        if ((-128L & l) == 0L)
        {
            i = 1;
        } else
        if ((-16384L & l) == 0L)
        {
            i = 2;
        } else
        if ((0xffffffffffe00000L & l) == 0L)
        {
            i = 3;
        } else
        if ((0xfffffffff0000000L & l) == 0L)
        {
            i = 4;
        } else
        if ((0xfffffff800000000L & l) == 0L)
        {
            i = 5;
        } else
        if ((0xfffffc0000000000L & l) == 0L)
        {
            i = 6;
        } else
        if ((0xfffe000000000000L & l) == 0L)
        {
            i = 7;
        } else
        if ((0xff00000000000000L & l) == 0L)
        {
            i = 8;
        } else
        if ((l & 0x8000000000000000L) == 0L)
        {
            i = 9;
        } else
        {
            i = 10;
        }
        return i + j;
    }

    private static long b(long l)
    {
        return l << 1 ^ l >> 63;
    }

    public static int c(int i)
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

    private void d(int i)
    {
        byte byte0 = (byte)i;
        if (c == b)
        {
            throw new a(c, b);
        } else
        {
            byte abyte0[] = a;
            i = c;
            c = i + 1;
            abyte0[i] = byte0;
            return;
        }
    }

    public final void a()
    {
        if (b - c != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public final void a(int i, int j)
    {
        b(jw.a(i, j));
    }

    public final void a(int i, long l)
    {
        a(i, 0);
        a(b(l));
    }

    public final void a(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                d((int)l);
                return;
            }
            d((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public final void b(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                d(i);
                return;
            }
            d(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public final void b(byte abyte0[], int i, int j)
    {
        if (b - c >= j)
        {
            System.arraycopy(abyte0, 0, a, c, j);
            c = c + j;
            return;
        } else
        {
            throw new a(c, b);
        }
    }

    private class a extends IOException
    {

        a(int i, int j)
        {
            super((new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ")).append(i).append(" limit ").append(j).append(").").toString());
        }
    }

}
