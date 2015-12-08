// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.a.c.b;

// Referenced classes of package org.a.c.a:
//            d

public class a
{

    protected boolean a_;

    public a()
    {
        a_ = false;
    }

    protected static float a(byte abyte0[], int i)
    {
        return a(abyte0, 0, i);
    }

    private static float a(byte abyte0[], int i, int j)
    {
        byte byte0 = abyte0[i + 0];
        byte byte1 = abyte0[i + 1];
        byte byte2 = abyte0[i + 2];
        i = abyte0[i + 3];
        if (j == 77)
        {
            i = (byte0 & 0xff) << 24 | (byte1 & 0xff) << 16 | (byte2 & 0xff) << 8 | (i & 0xff) << 0;
        } else
        {
            i = (byte0 & 0xff) << 0 | ((byte1 & 0xff) << 8 | ((byte2 & 0xff) << 16 | (i & 0xff) << 24));
        }
        return Float.intBitsToFloat(i);
    }

    private int a(String s, int i, byte abyte0[], int j)
    {
        if (i + 1 >= abyte0.length)
        {
            throw new b((new StringBuilder("Index out of bounds. Array size: ")).append(abyte0.length).append(", index: ").append(i).toString());
        }
        int k = abyte0[i + 0] & 0xff;
        i = abyte0[i + 1] & 0xff;
        if (j == 77)
        {
            i = k << 8 | i;
        } else
        {
            i = k | i << 8;
        }
        if (a_)
        {
            a(s, i, 2);
        }
        return i;
    }

    private static void a(int i, byte abyte0[], int j, int k)
    {
        if (k == 77)
        {
            abyte0[j + 0] = (byte)(i >> 24);
            abyte0[j + 1] = (byte)(i >> 16);
            abyte0[j + 2] = (byte)(i >> 8);
            abyte0[j + 3] = (byte)(i >> 0);
            return;
        } else
        {
            abyte0[j + 3] = (byte)(i >> 24);
            abyte0[j + 2] = (byte)(i >> 16);
            abyte0[j + 1] = (byte)(i >> 8);
            abyte0[j + 0] = (byte)(i >> 0);
            return;
        }
    }

    public static void a(InputStream inputstream, int i, String s)
    {
        long l = 0L;
        do
        {
            if ((long)i == l)
            {
                return;
            }
            long l1 = inputstream.skip((long)i - l);
            if (l1 < 1L)
            {
                throw new IOException((new StringBuilder(String.valueOf(s))).append(" (").append(l1).append(")").toString());
            }
            l += l1;
        } while (true);
    }

    public static void a(InputStream inputstream, byte abyte0[], String s)
    {
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return;
            }
            int j = inputstream.read();
            byte byte0 = (byte)(j & 0xff);
            if (j < 0)
            {
                throw new b("Unexpected EOF.");
            }
            if (byte0 != abyte0[i])
            {
                throw new b(s);
            }
            i++;
        } while (true);
    }

    private static void a(PrintWriter printwriter, String s, int i, int j)
    {
        printwriter.print((new StringBuilder(String.valueOf(s))).append(": ").append(i).append(" (").toString());
        int k = 0;
        int l = i;
        do
        {
            if (k >= j)
            {
                printwriter.println((new StringBuilder(") [0x")).append(Integer.toHexString(i)).append(", ").append(Integer.toBinaryString(i)).append("]").toString());
                printwriter.flush();
                return;
            }
            if (k > 0)
            {
                printwriter.print(",");
            }
            int i1 = l & 0xff;
            printwriter.print((new StringBuilder(String.valueOf((char)i1))).append(" [").append(i1).append("]").toString());
            l >>= 8;
            k++;
        } while (true);
    }

    private static void a(String s, int i, int j)
    {
        PrintWriter printwriter = new PrintWriter(System.out);
        a(printwriter, s, i, j);
        printwriter.flush();
    }

    public static final boolean a(byte abyte0[], byte abyte1[], int i)
    {
_L2:
        return false;
        if (abyte0.length < i + 0 || abyte1.length < i + 0) goto _L2; else goto _L1
_L1:
        int j = 0;
        do
        {
            if (j >= i)
            {
                return true;
            }
            if (abyte0[j + 0] != abyte1[j + 0])
            {
                continue;
            }
            j++;
        } while (true);
        if (true) goto _L2; else goto _L3
_L3:
    }

    protected static byte[] a(int i, int j)
    {
        byte abyte0[] = new byte[2];
        if (j == 77)
        {
            abyte0[0] = (byte)(i >> 8);
            abyte0[1] = (byte)(i >> 0);
            return abyte0;
        } else
        {
            abyte0[1] = (byte)(i >> 8);
            abyte0[0] = (byte)(i >> 0);
            return abyte0;
        }
    }

    protected static byte[] a(d d1, int i)
    {
        byte abyte0[] = new byte[8];
        a(d1.a, abyte0, 0, i);
        a(d1.b, abyte0, 4, i);
        return abyte0;
    }

    protected static byte[] a(double ad[], int i)
    {
        byte abyte0[] = new byte[ad.length * 8];
        int j = 0;
        do
        {
            if (j >= ad.length)
            {
                return abyte0;
            }
            long l = Double.doubleToRawLongBits(ad[j]);
            int k = j * 8;
            if (i == 77)
            {
                abyte0[k + 0] = (byte)(int)(255L & l >> 0);
                abyte0[k + 1] = (byte)(int)(255L & l >> 8);
                abyte0[k + 2] = (byte)(int)(255L & l >> 16);
                abyte0[k + 3] = (byte)(int)(255L & l >> 24);
                abyte0[k + 4] = (byte)(int)(255L & l >> 32);
                abyte0[k + 5] = (byte)(int)(255L & l >> 40);
                abyte0[k + 6] = (byte)(int)(255L & l >> 48);
                abyte0[k + 7] = (byte)(int)(l >> 56 & 255L);
            } else
            {
                abyte0[k + 7] = (byte)(int)(255L & l >> 0);
                abyte0[k + 6] = (byte)(int)(255L & l >> 8);
                abyte0[k + 5] = (byte)(int)(255L & l >> 16);
                abyte0[k + 4] = (byte)(int)(255L & l >> 24);
                abyte0[k + 3] = (byte)(int)(255L & l >> 32);
                abyte0[k + 2] = (byte)(int)(255L & l >> 40);
                abyte0[k + 1] = (byte)(int)(255L & l >> 48);
                abyte0[k + 0] = (byte)(int)(l >> 56 & 255L);
            }
            j++;
        } while (true);
    }

    protected static byte[] a(float af[], int i)
    {
        byte abyte0[] = new byte[af.length * 4];
        int j = 0;
        do
        {
            if (j >= af.length)
            {
                return abyte0;
            }
            int k = Float.floatToRawIntBits(af[j]);
            int l = j * 4;
            if (i == 77)
            {
                abyte0[l + 0] = (byte)(k >> 0 & 0xff);
                abyte0[l + 1] = (byte)(k >> 8 & 0xff);
                abyte0[l + 2] = (byte)(k >> 16 & 0xff);
                abyte0[l + 3] = (byte)(k >> 24 & 0xff);
            } else
            {
                abyte0[l + 3] = (byte)(k >> 0 & 0xff);
                abyte0[l + 2] = (byte)(k >> 8 & 0xff);
                abyte0[l + 1] = (byte)(k >> 16 & 0xff);
                abyte0[l + 0] = (byte)(k >> 24 & 0xff);
            }
            j++;
        } while (true);
    }

    protected static byte[] a(int ai[], int i)
    {
        byte abyte0[] = new byte[ai.length * 4];
        int j = 0;
        do
        {
            if (j >= ai.length)
            {
                return abyte0;
            }
            a(ai[j], abyte0, j * 4, i);
            j++;
        } while (true);
    }

    protected static byte[] a(d ad[], int i)
    {
        byte abyte0[] = new byte[ad.length * 8];
        int j = 0;
        do
        {
            if (j >= ad.length)
            {
                return abyte0;
            }
            a(ad[j].a, abyte0, j * 8, i);
            a(ad[j].b, abyte0, j * 8 + 4, i);
            j++;
        } while (true);
    }

    private static void b(String s, byte abyte0[])
    {
        System.out.println((new StringBuilder(String.valueOf(s))).append(": ").append(abyte0.length).toString());
        int i = 0;
        do
        {
            if (i >= abyte0.length || i >= 50)
            {
                return;
            }
            a((new StringBuilder("\t (")).append(i).append(")").toString(), abyte0[i] & 0xff, 1);
            i++;
        } while (true);
    }

    protected static byte[] b(int ai[], int i)
    {
        byte abyte0[] = new byte[ai.length * 2];
        int j = 0;
        do
        {
            if (j >= ai.length)
            {
                return abyte0;
            }
            int k = ai[j];
            if (i == 77)
            {
                abyte0[j * 2 + 0] = (byte)(k >> 8);
                abyte0[j * 2 + 1] = (byte)(k >> 0);
            } else
            {
                abyte0[j * 2 + 1] = (byte)(k >> 8);
                abyte0[j * 2 + 0] = (byte)(k >> 0);
            }
            j++;
        } while (true);
    }

    protected static float[] d(String s, byte abyte0[], int i, int j)
    {
        int k = i * 4 + 0;
        if (abyte0.length >= k) goto _L2; else goto _L1
_L1:
        System.out.println((new StringBuilder(String.valueOf(s))).append(": expected length: ").append(k).append(", actual length: ").append(abyte0.length).toString());
        s = null;
_L4:
        return s;
_L2:
        float af[] = new float[i];
        int l = 0;
        do
        {
            s = af;
            if (l >= i)
            {
                continue;
            }
            af[l] = a(abyte0, l * 4 + 0, j);
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private d e(String s, byte abyte0[], int i, int j)
    {
        return new d(f(s, abyte0, i + 0, j), f(s, abyte0, i + 4, j));
    }

    private int f(String s, byte abyte0[], int i, int j)
    {
        byte byte0 = abyte0[i + 0];
        byte byte1 = abyte0[i + 1];
        byte byte2 = abyte0[i + 2];
        i = abyte0[i + 3];
        if (j == 77)
        {
            i = (byte0 & 0xff) << 24 | (byte1 & 0xff) << 16 | (byte2 & 0xff) << 8 | (i & 0xff) << 0;
        } else
        {
            i = (byte0 & 0xff) << 0 | ((byte1 & 0xff) << 8 | ((byte2 & 0xff) << 16 | (i & 0xff) << 24));
        }
        if (a_)
        {
            a(s, i, 4);
        }
        return i;
    }

    public final byte a(String s, InputStream inputstream, String s1)
    {
        int i = inputstream.read();
        if (i < 0)
        {
            System.out.println((new StringBuilder(String.valueOf(s))).append(": ").append(i).toString());
            throw new IOException(s1);
        }
        if (a_)
        {
            a(s, i, 1);
        }
        return (byte)(i & 0xff);
    }

    protected final int a(String s, InputStream inputstream, String s1, int i)
    {
        byte abyte0[] = new byte[4];
        int j = 0;
        do
        {
            if (j >= 4)
            {
                return b(s, abyte0, i);
            }
            int k = inputstream.read(abyte0, j, 4 - j);
            if (k <= 0)
            {
                throw new IOException(s1);
            }
            j += k;
        } while (true);
    }

    protected final d a(String s, byte abyte0[], int i)
    {
        return e(s, abyte0, 0, i);
    }

    public final byte[] a(String s, int i, InputStream inputstream, String s1)
    {
        byte abyte0[];
        int j;
        boolean flag;
        flag = false;
        abyte0 = new byte[i];
        j = 0;
_L5:
        if (j < i) goto _L2; else goto _L1
_L1:
        if (!a_) goto _L4; else goto _L3
_L3:
        j = ((flag) ? 1 : 0);
_L6:
        if (j < i && j < 50)
        {
            break MISSING_BLOCK_LABEL_83;
        }
_L4:
        return abyte0;
_L2:
        int k = inputstream.read(abyte0, j, i - j);
        if (k <= 0)
        {
            throw new IOException(s1);
        }
        j += k;
          goto _L5
        a((new StringBuilder(String.valueOf(s))).append(" (").append(j).append(")").toString(), abyte0[j] & 0xff, 1);
        j++;
          goto _L6
    }

    protected final byte[] a(String s, byte abyte0[])
    {
        int i = abyte0.length - 6;
        if (abyte0.length < i + 6)
        {
            throw new b((new StringBuilder("Invalid read. bytes.length: ")).append(abyte0.length).append(", start: 6, count: ").append(i).toString());
        }
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 6, abyte1, 0, i);
        if (a_)
        {
            b(s, abyte1);
        }
        return abyte1;
    }

    protected final d[] a(String s, byte abyte0[], int i, int j)
    {
        int k = i * 8 + 0;
        if (abyte0.length >= k) goto _L2; else goto _L1
_L1:
        d ad[];
        System.out.println((new StringBuilder(String.valueOf(s))).append(": expected length: ").append(k).append(", actual length: ").append(abyte0.length).toString());
        ad = null;
_L4:
        return ad;
_L2:
        d ad1[] = new d[i];
        int l = 0;
        do
        {
            ad = ad1;
            if (l >= i)
            {
                continue;
            }
            ad1[l] = e(s, abyte0, l * 8 + 0, j);
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final int b(String s, InputStream inputstream, String s1, int i)
    {
        byte abyte0[] = new byte[2];
        int j = 0;
        do
        {
            if (j >= 2)
            {
                return c(s, abyte0, i);
            }
            int k = inputstream.read(abyte0, j, 2 - j);
            if (k <= 0)
            {
                throw new IOException(s1);
            }
            j += k;
        } while (true);
    }

    protected final int b(String s, byte abyte0[], int i)
    {
        return f(s, abyte0, 0, i);
    }

    protected final int[] b(String s, byte abyte0[], int i, int j)
    {
        int k = i * 4 + 0;
        if (abyte0.length >= k) goto _L2; else goto _L1
_L1:
        int ai[];
        System.out.println((new StringBuilder(String.valueOf(s))).append(": expected length: ").append(k).append(", actual length: ").append(abyte0.length).toString());
        ai = null;
_L4:
        return ai;
_L2:
        int ai1[] = new int[i];
        int l = 0;
        do
        {
            ai = ai1;
            if (l >= i)
            {
                continue;
            }
            ai1[l] = f(s, abyte0, l * 4 + 0, j);
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final int c(String s, byte abyte0[], int i)
    {
        return a(s, 0, abyte0, i);
    }

    protected final int[] c(String s, byte abyte0[], int i, int j)
    {
        int k = i * 2 + 0;
        if (abyte0.length >= k) goto _L2; else goto _L1
_L1:
        int ai[];
        System.out.println((new StringBuilder(String.valueOf(s))).append(": expected length: ").append(k).append(", actual length: ").append(abyte0.length).toString());
        ai = null;
_L4:
        return ai;
_L2:
        int ai1[] = new int[i];
        int l = 0;
        do
        {
            ai = ai1;
            if (l >= i)
            {
                continue;
            }
            ai1[l] = a(s, l * 2 + 0, abyte0, j);
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
