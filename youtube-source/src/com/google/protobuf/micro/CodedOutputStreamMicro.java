// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.micro;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.protobuf.micro:
//            a, c, d

public final class CodedOutputStreamMicro
{

    private final byte a[];
    private final int b;
    private int c;
    private final OutputStream d = null;

    private CodedOutputStreamMicro(byte abyte0[], int i, int j)
    {
        a = abyte0;
        c = i;
        b = i + j;
    }

    public static int a(int i)
    {
        if (i >= 0)
        {
            return e(i);
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
            i = e(s.length);
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return j + i;
    }

    public static CodedOutputStreamMicro a(byte abyte0[], int i, int j)
    {
        return new CodedOutputStreamMicro(abyte0, i, j);
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

    private void a(byte abyte0[])
    {
        int j = abyte0.length;
        if (b - c >= j)
        {
            System.arraycopy(abyte0, 0, a, c, j);
            c = j + c;
            return;
        }
        int k = b - c;
        System.arraycopy(abyte0, 0, a, c, k);
        int i = k + 0;
        j -= k;
        c = b;
        b();
        if (j <= b)
        {
            System.arraycopy(abyte0, i, a, 0, j);
            c = j;
            return;
        } else
        {
            d.write(abyte0, i, j);
            return;
        }
    }

    public static int b(int i, int j)
    {
        return c(i) + a(j);
    }

    public static int b(int i, long l)
    {
        int j = c(i);
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
        if ((0x8000000000000000L & l) == 0L)
        {
            i = 9;
        } else
        {
            i = 10;
        }
        return i + j;
    }

    public static int b(int i, a a1)
    {
        return c(i) + (e(a1.a()) + a1.a());
    }

    public static int b(int i, c c1)
    {
        i = c(i);
        int j = c1.e();
        return i + (j + e(j));
    }

    public static int b(int i, String s)
    {
        return c(i) + a(s);
    }

    public static int b(int i, boolean flag)
    {
        return c(i) + 1;
    }

    private void b()
    {
        if (d == null)
        {
            throw new OutOfSpaceException();
        } else
        {
            d.write(a, 0, c);
            c = 0;
            return;
        }
    }

    private void b(int i)
    {
        byte byte0 = (byte)i;
        if (c == b)
        {
            b();
        }
        byte abyte0[] = a;
        i = c;
        c = i + 1;
        abyte0[i] = byte0;
    }

    private static int c(int i)
    {
        return e(com.google.protobuf.micro.d.a(i, 0));
    }

    private void c(int i, int j)
    {
        d(com.google.protobuf.micro.d.a(i, j));
    }

    private void d(int i)
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

    private static int e(int i)
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

    public final void a()
    {
        if (d == null)
        {
            if (b - c != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            } else
            {
                return;
            }
        } else
        {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        }
    }

    public final void a(int i, int j)
    {
        c(i, 0);
        if (j >= 0)
        {
            d(j);
            return;
        } else
        {
            a(j);
            return;
        }
    }

    public final void a(int i, long l)
    {
        c(i, 0);
        a(l);
    }

    public final void a(int i, a a1)
    {
        c(i, 2);
        a1 = a1.b();
        d(a1.length);
        a(((byte []) (a1)));
    }

    public final void a(int i, c c1)
    {
        c(i, 2);
        d(c1.e());
        c1.a(this);
    }

    public final void a(int i, String s)
    {
        c(i, 2);
        s = s.getBytes("UTF-8");
        d(s.length);
        a(((byte []) (s)));
    }

    public final void a(int i, boolean flag)
    {
        boolean flag1 = false;
        c(i, 0);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        b(i);
    }

    private class OutOfSpaceException extends IOException
    {

        private static final long serialVersionUID = 0x9f95917c52ce6e25L;

        OutOfSpaceException()
        {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

}
