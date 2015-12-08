// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.protobuf.nano:
//            c, f

public final class CodedOutputByteBufferNano
{

    private final byte a[];
    private final int b;
    private int c;

    private CodedOutputByteBufferNano(byte abyte0[], int i, int j)
    {
        a = abyte0;
        c = i;
        b = i + j;
    }

    public static int a(int i)
    {
        if (i >= 0)
        {
            return d(i);
        } else
        {
            return 10;
        }
    }

    public static int a(String s)
    {
        int i;
        int j;
        try
        {
            s = s.getBytes("UTF-8");
            i = d(s.length);
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return j + i;
    }

    public static int a(byte abyte0[])
    {
        return d(abyte0.length) + abyte0.length;
    }

    public static CodedOutputByteBufferNano a(byte abyte0[], int i, int j)
    {
        return new CodedOutputByteBufferNano(abyte0, i, j);
    }

    private void a(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                b((int)l);
                return;
            }
            b((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public static int b(int i, float f1)
    {
        return c(i) + 4;
    }

    public static int b(int i, c c1)
    {
        i = c(i);
        int j = c1.a();
        return i + (j + d(j));
    }

    public static int b(int i, String s)
    {
        return c(i) + a(s);
    }

    public static int b(int i, boolean flag)
    {
        return c(i) + 1;
    }

    public static int b(int i, byte abyte0[])
    {
        return c(i) + a(abyte0);
    }

    private static int b(long l)
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

    public static int c(int i)
    {
        return d(com.google.protobuf.nano.f.a(i, 0));
    }

    public static int c(int i, long l)
    {
        return c(i) + b(l);
    }

    public static int d(int i)
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

    public static int d(int i, int j)
    {
        return c(i) + a(j);
    }

    public static int d(int i, long l)
    {
        return c(i) + b(l);
    }

    public static int e(int i, int j)
    {
        return c(i) + 4;
    }

    private void e(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                b(i);
                return;
            }
            b(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public static int f(int i, int j)
    {
        return c(i) + d(j);
    }

    private void f(int i)
    {
        b(i & 0xff);
        b(i >> 8 & 0xff);
        b(i >> 16 & 0xff);
        b(i >> 24 & 0xff);
    }

    public final int a()
    {
        return b - c;
    }

    public final void a(int i, float f1)
    {
        g(i, 5);
        f(Float.floatToIntBits(f1));
    }

    public final void a(int i, int j)
    {
        g(i, 0);
        if (j >= 0)
        {
            e(j);
            return;
        } else
        {
            a(j);
            return;
        }
    }

    public final void a(int i, long l)
    {
        g(i, 0);
        a(l);
    }

    public final void a(int i, c c1)
    {
        g(i, 2);
        e(c1.b());
        c1.a(this);
    }

    public final void a(int i, String s)
    {
        g(i, 2);
        s = s.getBytes("UTF-8");
        e(s.length);
        b(s);
    }

    public final void a(int i, boolean flag)
    {
        boolean flag1 = false;
        g(i, 0);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        b(i);
    }

    public final void a(int i, byte abyte0[])
    {
        g(i, 2);
        e(abyte0.length);
        b(abyte0);
    }

    public final void b()
    {
        if (a() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public final void b(int i)
    {
        byte byte0 = (byte)i;
        if (c == b)
        {
            throw new OutOfSpaceException(c, b);
        } else
        {
            byte abyte0[] = a;
            i = c;
            c = i + 1;
            abyte0[i] = byte0;
            return;
        }
    }

    public final void b(int i, int j)
    {
        g(i, 5);
        f(j);
    }

    public final void b(int i, long l)
    {
        g(i, 0);
        a(l);
    }

    public final void b(byte abyte0[])
    {
        int i = abyte0.length;
        if (b - c >= i)
        {
            System.arraycopy(abyte0, 0, a, c, i);
            c = i + c;
            return;
        } else
        {
            throw new OutOfSpaceException(c, b);
        }
    }

    public final void c(int i, int j)
    {
        g(i, 0);
        e(j);
    }

    public final void g(int i, int j)
    {
        e(com.google.protobuf.nano.f.a(i, j));
    }

    private class OutOfSpaceException extends IOException
    {

        private static final long serialVersionUID = 0x9f95917c52ce6e25L;

        OutOfSpaceException(int i, int j)
        {
            super((new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ")).append(i).append(" limit ").append(j).append(").").toString());
        }
    }

}
