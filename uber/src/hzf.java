// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class hzf
    implements hzg, hzh, Cloneable
{

    private static final byte c[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };
    hzs a;
    long b;

    public hzf()
    {
    }

    private hzf a(String s1, int i1, Charset charset)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("string == null");
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("endIndex < beginIndex: ")).append(i1).append(" < 0").toString());
        }
        if (i1 > s1.length())
        {
            throw new IllegalArgumentException((new StringBuilder("endIndex > string.length: ")).append(i1).append(" > ").append(s1.length()).toString());
        }
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(hzy.a))
        {
            return a(s1);
        } else
        {
            s1 = s1.substring(0, i1).getBytes(charset);
            return b(s1, 0, s1.length);
        }
    }

    private String a(long l1, Charset charset)
    {
        hzy.a(b, 0L, l1);
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        }
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount > Integer.MAX_VALUE: ")).append(l1).toString());
        }
        if (l1 == 0L)
        {
            charset = "";
        } else
        {
            hzs hzs1 = a;
            if ((long)hzs1.b + l1 > (long)hzs1.c)
            {
                return new String(e(l1), charset);
            }
            String s1 = new String(hzs1.a, hzs1.b, (int)l1, charset);
            hzs1.b = (int)((long)hzs1.b + l1);
            b = b - l1;
            charset = s1;
            if (hzs1.b == hzs1.c)
            {
                a = hzs1.a();
                hzt.a(hzs1);
                return s1;
            }
        }
        return charset;
    }

    private void c(byte abyte0[])
    {
        int j1;
        for (int i1 = 0; i1 < abyte0.length; i1 += j1)
        {
            j1 = a(abyte0, i1, abyte0.length - i1);
            if (j1 == -1)
            {
                throw new EOFException();
            }
        }

    }

    private hzi i(int i1)
    {
        if (i1 == 0)
        {
            return hzi.b;
        } else
        {
            return new hzu(this, i1);
        }
    }

    private String k(long l1)
    {
        return a(l1, hzy.a);
    }

    private hzf v()
    {
        return this;
    }

    private hzf w()
    {
        hzf hzf1 = new hzf();
        if (b == 0L)
        {
            return hzf1;
        }
        hzf1.a = new hzs(a);
        hzs hzs1 = hzf1.a;
        hzs hzs3 = hzf1.a;
        hzs hzs4 = hzf1.a;
        hzs3.g = hzs4;
        hzs1.f = hzs4;
        for (hzs hzs2 = a.f; hzs2 != a; hzs2 = hzs2.f)
        {
            hzf1.a.g.a(new hzs(hzs2));
        }

        hzf1.b = b;
        return hzf1;
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        hzy.a(abyte0.length, i1, j1);
        hzs hzs1 = a;
        if (hzs1 == null)
        {
            i1 = -1;
        } else
        {
            j1 = Math.min(j1, hzs1.c - hzs1.b);
            System.arraycopy(hzs1.a, hzs1.b, abyte0, i1, j1);
            hzs1.b = hzs1.b + j1;
            b = b - (long)j1;
            i1 = j1;
            if (hzs1.b == hzs1.c)
            {
                a = hzs1.a();
                hzt.a(hzs1);
                return j1;
            }
        }
        return i1;
    }

    public final long a()
    {
        return b;
    }

    public final long a(byte byte0)
    {
        return a(byte0, 0L);
    }

    public final long a(byte byte0, long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        hzs hzs1 = a;
        if (hzs1 == null)
        {
            return -1L;
        }
        long l2 = 0L;
        do
        {
            int i1 = hzs1.c - hzs1.b;
            hzs hzs2;
            if (l1 >= (long)i1)
            {
                l1 -= i1;
            } else
            {
                byte abyte0[] = hzs1.a;
                l1 = (long)hzs1.b + l1;
                for (long l3 = hzs1.c; l1 < l3; l1++)
                {
                    if (abyte0[(int)l1] == byte0)
                    {
                        return (l2 + l1) - (long)hzs1.b;
                    }
                }

                l1 = 0L;
            }
            l2 += i1;
            hzs2 = hzs1.f;
            hzs1 = hzs2;
        } while (hzs2 != a);
        return -1L;
    }

    public final long a(hzw hzw1)
    {
        if (hzw1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l1 = 0L;
        do
        {
            long l2 = hzw1.read(this, 2048L);
            if (l2 != -1L)
            {
                l1 += l2;
            } else
            {
                return l1;
            }
        } while (true);
    }

    public final hzf a(int i1)
    {
        if (i1 < 128)
        {
            b(i1);
            return this;
        }
        if (i1 < 2048)
        {
            b(i1 >> 6 | 0xc0);
            b(i1 & 0x3f | 0x80);
            return this;
        }
        if (i1 < 0x10000)
        {
            if (i1 >= 55296 && i1 <= 57343)
            {
                throw new IllegalArgumentException((new StringBuilder("Unexpected code point: ")).append(Integer.toHexString(i1)).toString());
            } else
            {
                b(i1 >> 12 | 0xe0);
                b(i1 >> 6 & 0x3f | 0x80);
                b(i1 & 0x3f | 0x80);
                return this;
            }
        }
        if (i1 <= 0x10ffff)
        {
            b(i1 >> 18 | 0xf0);
            b(i1 >> 12 & 0x3f | 0x80);
            b(i1 >> 6 & 0x3f | 0x80);
            b(i1 & 0x3f | 0x80);
            return this;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unexpected code point: ")).append(Integer.toHexString(i1)).toString());
        }
    }

    public final hzf a(hzf hzf1, long l1, long l2)
    {
        if (hzf1 == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        hzy.a(b, l1, l2);
        if (l2 != 0L)
        {
            hzf1.b = hzf1.b + l2;
            hzs hzs1 = a;
            hzs hzs3;
            long l3;
            long l4;
            do
            {
                hzs3 = hzs1;
                l3 = l1;
                l4 = l2;
                if (l1 < (long)(hzs1.c - hzs1.b))
                {
                    break;
                }
                l1 -= hzs1.c - hzs1.b;
                hzs1 = hzs1.f;
            } while (true);
            while (l4 > 0L) 
            {
                hzs hzs2 = new hzs(hzs3);
                hzs2.b = (int)((long)hzs2.b + l3);
                hzs2.c = Math.min(hzs2.b + (int)l4, hzs2.c);
                if (hzf1.a == null)
                {
                    hzs2.g = hzs2;
                    hzs2.f = hzs2;
                    hzf1.a = hzs2;
                } else
                {
                    hzf1.a.g.a(hzs2);
                }
                l4 -= hzs2.c - hzs2.b;
                hzs3 = hzs3.f;
                l3 = 0L;
            }
        }
        return this;
    }

    public final hzf a(hzi hzi1)
    {
        if (hzi1 == null)
        {
            throw new IllegalArgumentException("byteString == null");
        } else
        {
            hzi1.a(this);
            return this;
        }
    }

    public final hzf a(String s1)
    {
        return a(s1, 0, s1.length());
    }

    public final hzf a(String s1, int i1, int j1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("string == null");
        }
        if (i1 < 0)
        {
            throw new IllegalAccessError((new StringBuilder("beginIndex < 0: ")).append(i1).toString());
        }
        if (j1 < i1)
        {
            throw new IllegalArgumentException((new StringBuilder("endIndex < beginIndex: ")).append(j1).append(" < ").append(i1).toString());
        }
        if (j1 > s1.length())
        {
            throw new IllegalArgumentException((new StringBuilder("endIndex > string.length: ")).append(j1).append(" > ").append(s1.length()).toString());
        }
          goto _L1
_L3:
        hzs hzs1;
        int j2;
        int k1 = (i1 + j2) - hzs1.c;
        hzs1.c = hzs1.c + k1;
        b = b + (long)k1;
_L1:
        byte abyte0[];
        char c2;
        int k2;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_530;
        }
        c2 = s1.charAt(i1);
        if (c2 >= '\200')
        {
            break MISSING_BLOCK_LABEL_272;
        }
        hzs1 = e(1);
        abyte0 = hzs1.a;
        j2 = hzs1.c - i1;
        k2 = Math.min(j1, 2048 - j2);
        int l1 = i1 + 1;
        abyte0[j2 + i1] = (byte)c2;
        i1 = l1;
_L5:
        if (i1 >= k2) goto _L3; else goto _L2
_L2:
        char c1 = s1.charAt(i1);
        if (c1 >= '\200') goto _L3; else goto _L4
_L4:
        abyte0[i1 + j2] = (byte)c1;
        i1++;
          goto _L5
        if (c2 < '\u0800')
        {
            b(c2 >> 6 | 0xc0);
            b(c2 & 0x3f | 0x80);
            i1++;
        } else
        if (c2 < '\uD800' || c2 > '\uDFFF')
        {
            b(c2 >> 12 | 0xe0);
            b(c2 >> 6 & 0x3f | 0x80);
            b(c2 & 0x3f | 0x80);
            i1++;
        } else
        {
            int i2;
            if (i1 + 1 < j1)
            {
                i2 = s1.charAt(i1 + 1);
            } else
            {
                i2 = 0;
            }
            if (c2 > '\uDBFF' || i2 < '\uDC00' || i2 > '\uDFFF')
            {
                b(63);
                i1++;
            } else
            {
                i2 = (i2 & 0xffff23ff | (c2 & 0xffff27ff) << 10) + 0x10000;
                b(i2 >> 18 | 0xf0);
                b(i2 >> 12 & 0x3f | 0x80);
                b(i2 >> 6 & 0x3f | 0x80);
                b(i2 & 0x3f | 0x80);
                i1 += 2;
            }
        }
          goto _L1
        return this;
    }

    public final hzf a(String s1, Charset charset)
    {
        return a(s1, s1.length(), charset);
    }

    public final hzf a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return b(abyte0, 0, abyte0.length);
        }
    }

    public final String a(Charset charset)
    {
        try
        {
            charset = a(b, charset);
        }
        // Misplaced declaration of an exception variable
        catch (Charset charset)
        {
            throw new AssertionError(charset);
        }
        return charset;
    }

    public final void a(long l1)
    {
        if (b < l1)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final byte b(long l1)
    {
        hzy.a(b, l1, 1L);
        hzs hzs1 = a;
        do
        {
            int i1 = hzs1.c - hzs1.b;
            if (l1 < (long)i1)
            {
                return hzs1.a[hzs1.b + (int)l1];
            }
            l1 -= i1;
            hzs1 = hzs1.f;
        } while (true);
    }

    public final hzf b()
    {
        return this;
    }

    public final hzf b(int i1)
    {
        hzs hzs1 = e(1);
        byte abyte0[] = hzs1.a;
        int j1 = hzs1.c;
        hzs1.c = j1 + 1;
        abyte0[j1] = (byte)i1;
        b = b + 1L;
        return this;
    }

    public final hzf b(byte abyte0[], int i1, int j1)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        hzy.a(abyte0.length, i1, j1);
        for (int k1 = i1 + j1; i1 < k1;)
        {
            hzs hzs1 = e(1);
            int l1 = Math.min(k1 - i1, 2048 - hzs1.c);
            System.arraycopy(abyte0, i1, hzs1.a, hzs1.c, l1);
            i1 += l1;
            hzs1.c = l1 + hzs1.c;
        }

        b = b + (long)j1;
        return this;
    }

    public final hzg b(hzi hzi1)
    {
        return a(hzi1);
    }

    public final hzg b(String s1)
    {
        return a(s1);
    }

    public final hzg b(byte abyte0[])
    {
        return a(abyte0);
    }

    public final hzf c(int i1)
    {
        hzs hzs1 = e(2);
        byte abyte0[] = hzs1.a;
        int j1 = hzs1.c;
        int k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 8 & 0xff);
        abyte0[k1] = (byte)(i1 & 0xff);
        hzs1.c = k1 + 1;
        b = b + 2L;
        return this;
    }

    public final hzg c(byte abyte0[], int i1, int j1)
    {
        return b(abyte0, i1, j1);
    }

    public final hzi c(long l1)
    {
        return new hzi(e(l1));
    }

    public final OutputStream c()
    {
        return new OutputStream() {

            final hzf a;

            public final void close()
            {
            }

            public final void flush()
            {
            }

            public final String toString()
            {
                return (new StringBuilder()).append(this).append(".outputStream()").toString();
            }

            public final void write(int i1)
            {
                a.b((byte)i1);
            }

            public final void write(byte abyte0[], int i1, int j1)
            {
                a.b(abyte0, i1, j1);
            }

            
            {
                a = hzf.this;
                super();
            }
        };
    }

    public final Object clone()
    {
        return w();
    }

    public final void close()
    {
    }

    public final hzf d(int i1)
    {
        hzs hzs1 = e(4);
        byte abyte0[] = hzs1.a;
        int k1 = hzs1.c;
        int j1 = k1 + 1;
        abyte0[k1] = (byte)(i1 >>> 24 & 0xff);
        k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 16 & 0xff);
        j1 = k1 + 1;
        abyte0[k1] = (byte)(i1 >>> 8 & 0xff);
        abyte0[j1] = (byte)(i1 & 0xff);
        hzs1.c = j1 + 1;
        b = b + 4L;
        return this;
    }

    public final hzg d()
    {
        return this;
    }

    final String d(long l1)
    {
        if (l1 > 0L && b(l1 - 1L) == 13)
        {
            String s1 = k(l1 - 1L);
            f(2L);
            return s1;
        } else
        {
            String s2 = k(l1);
            f(1L);
            return s2;
        }
    }

    final hzs e(int i1)
    {
        if (i1 <= 0 || i1 > 2048)
        {
            throw new IllegalArgumentException();
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        hzs hzs1;
        a = hzt.a();
        hzs hzs2 = a;
        hzs hzs4 = a;
        hzs1 = a;
        hzs4.g = hzs1;
        hzs2.f = hzs1;
_L4:
        return hzs1;
_L2:
        hzs hzs3;
        hzs3 = a.g;
        if (hzs3.c + i1 > 2048)
        {
            break; /* Loop/switch isn't completed */
        }
        hzs1 = hzs3;
        if (hzs3.e) goto _L4; else goto _L3
_L3:
        return hzs3.a(hzt.a());
    }

    public final boolean e()
    {
        return b == 0L;
    }

    public final byte[] e(long l1)
    {
        hzy.a(b, 0L, l1);
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount > Integer.MAX_VALUE: ")).append(l1).toString());
        } else
        {
            byte abyte0[] = new byte[(int)l1];
            c(abyte0);
            return abyte0;
        }
    }

    public final boolean equals(Object obj)
    {
        long l2 = 0L;
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof hzf))
        {
            return false;
        }
        obj = (hzf)obj;
        if (b != ((hzf) (obj)).b)
        {
            return false;
        }
        if (b == 0L)
        {
            return true;
        }
        hzs hzs2 = a;
        obj = ((hzf) (obj)).a;
        int j1 = hzs2.b;
        int i1 = ((hzs) (obj)).b;
        while (l2 < b) 
        {
            long l3 = Math.min(hzs2.c - j1, ((hzs) (obj)).c - i1);
            for (int k1 = 0; (long)k1 < l3;)
            {
                if (hzs2.a[j1] != ((hzs) (obj)).a[i1])
                {
                    return false;
                }
                k1++;
                i1++;
                j1++;
            }

            int l1 = j1;
            hzs hzs1 = hzs2;
            if (j1 == hzs2.c)
            {
                hzs1 = hzs2.f;
                l1 = hzs1.b;
            }
            j1 = i1;
            Object obj1 = obj;
            if (i1 == ((hzs) (obj)).c)
            {
                obj1 = ((hzs) (obj)).f;
                j1 = ((hzs) (obj1)).b;
            }
            l2 += l3;
            i1 = j1;
            j1 = l1;
            hzs2 = hzs1;
            obj = obj1;
        }
        return true;
    }

    public final hzg f(int i1)
    {
        return d(i1);
    }

    public final InputStream f()
    {
        return new InputStream() {

            final hzf a;

            public final int available()
            {
                return (int)Math.min(a.b, 0x7fffffffL);
            }

            public final void close()
            {
            }

            public final int read()
            {
                if (a.b > 0L)
                {
                    return a.h() & 0xff;
                } else
                {
                    return -1;
                }
            }

            public final int read(byte abyte0[], int i1, int j1)
            {
                return a.a(abyte0, i1, j1);
            }

            public final String toString()
            {
                return (new StringBuilder()).append(a).append(".inputStream()").toString();
            }

            
            {
                a = hzf.this;
                super();
            }
        };
    }

    public final void f(long l1)
    {
        do
        {
            if (l1 <= 0L)
            {
                break;
            }
            if (a == null)
            {
                throw new EOFException();
            }
            int i1 = (int)Math.min(l1, a.c - a.b);
            b = b - (long)i1;
            long l2 = l1 - (long)i1;
            hzs hzs1 = a;
            hzs1.b = i1 + hzs1.b;
            l1 = l2;
            if (a.b == a.c)
            {
                hzs hzs2 = a;
                a = hzs2.a();
                hzt.a(hzs2);
                l1 = l2;
            }
        } while (true);
    }

    public final void flush()
    {
    }

    public final long g()
    {
        long l2 = b;
        long l1;
        if (l2 == 0L)
        {
            l1 = 0L;
        } else
        {
            hzs hzs1 = a.g;
            l1 = l2;
            if (hzs1.c < 2048)
            {
                l1 = l2;
                if (hzs1.e)
                {
                    return l2 - (long)(hzs1.c - hzs1.b);
                }
            }
        }
        return l1;
    }

    public final hzf g(long l1)
    {
        if (l1 == 0L)
        {
            return b(48);
        }
        hzs hzs1;
        byte abyte0[];
        int i1;
        boolean flag;
        int j1;
        if (l1 < 0L)
        {
            l1 = -l1;
            if (l1 < 0L)
            {
                return a("-9223372036854775808");
            }
            flag = true;
        } else
        {
            flag = false;
        }
        if (l1 < 0x5f5e100L)
        {
            if (l1 < 10000L)
            {
                if (l1 < 100L)
                {
                    if (l1 < 10L)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 2;
                    }
                } else
                if (l1 < 1000L)
                {
                    i1 = 3;
                } else
                {
                    i1 = 4;
                }
            } else
            if (l1 < 0xf4240L)
            {
                if (l1 < 0x186a0L)
                {
                    i1 = 5;
                } else
                {
                    i1 = 6;
                }
            } else
            if (l1 < 0x989680L)
            {
                i1 = 7;
            } else
            {
                i1 = 8;
            }
        } else
        if (l1 < 0xe8d4a51000L)
        {
            if (l1 < 0x2540be400L)
            {
                if (l1 < 0x3b9aca00L)
                {
                    i1 = 9;
                } else
                {
                    i1 = 10;
                }
            } else
            if (l1 < 0x174876e800L)
            {
                i1 = 11;
            } else
            {
                i1 = 12;
            }
        } else
        if (l1 < 0x38d7ea4c68000L)
        {
            if (l1 < 0x9184e72a000L)
            {
                i1 = 13;
            } else
            if (l1 < 0x5af3107a4000L)
            {
                i1 = 14;
            } else
            {
                i1 = 15;
            }
        } else
        if (l1 < 0x16345785d8a0000L)
        {
            if (l1 < 0x2386f26fc10000L)
            {
                i1 = 16;
            } else
            {
                i1 = 17;
            }
        } else
        if (l1 < 0xde0b6b3a7640000L)
        {
            i1 = 18;
        } else
        {
            i1 = 19;
        }
        j1 = i1;
        if (flag)
        {
            j1 = i1 + 1;
        }
        hzs1 = e(j1);
        abyte0 = hzs1.a;
        i1 = hzs1.c + j1;
        for (; l1 != 0L; l1 /= 10L)
        {
            int k1 = (int)(l1 % 10L);
            i1--;
            abyte0[i1] = c[k1];
        }

        if (flag)
        {
            abyte0[i1 - 1] = 45;
        }
        hzs1.c = hzs1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public final hzg g(int i1)
    {
        return c(i1);
    }

    public final byte h()
    {
        if (b == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        hzs hzs1 = a;
        int i1 = hzs1.b;
        int j1 = hzs1.c;
        byte abyte0[] = hzs1.a;
        int k1 = i1 + 1;
        byte byte0 = abyte0[i1];
        b = b - 1L;
        if (k1 == j1)
        {
            a = hzs1.a();
            hzt.a(hzs1);
            return byte0;
        } else
        {
            hzs1.b = k1;
            return byte0;
        }
    }

    public final hzf h(long l1)
    {
        if (l1 == 0L)
        {
            return b(48);
        }
        int j1 = Long.numberOfTrailingZeros(Long.highestOneBit(l1)) / 4 + 1;
        hzs hzs1 = e(j1);
        byte abyte0[] = hzs1.a;
        int i1 = (hzs1.c + j1) - 1;
        for (int k1 = hzs1.c; i1 >= k1; i1--)
        {
            abyte0[i1] = c[(int)(15L & l1)];
            l1 >>>= 4;
        }

        hzs1.c = hzs1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public final hzg h(int i1)
    {
        return b(i1);
    }

    public final int hashCode()
    {
        hzs hzs1 = a;
        if (hzs1 == null)
        {
            return 0;
        }
        int j1 = 1;
        hzs hzs2;
        int i1;
        do
        {
            int k1 = hzs1.b;
            int l1 = hzs1.c;
            for (i1 = j1; k1 < l1; i1 = j1 + i1 * 31)
            {
                j1 = hzs1.a[k1];
                k1++;
            }

            hzs2 = hzs1.f;
            j1 = i1;
            hzs1 = hzs2;
        } while (hzs2 != a);
        return i1;
    }

    public final hzg i(long l1)
    {
        return h(l1);
    }

    public final short i()
    {
        if (b < 2L)
        {
            throw new IllegalStateException((new StringBuilder("size < 2: ")).append(b).toString());
        }
        hzs hzs1 = a;
        int k1 = hzs1.b;
        int i1 = hzs1.c;
        if (i1 - k1 < 2)
        {
            return (short)((h() & 0xff) << 8 | h() & 0xff);
        }
        byte abyte0[] = hzs1.a;
        int j1 = k1 + 1;
        k1 = abyte0[k1];
        int l1 = j1 + 1;
        j1 = abyte0[j1];
        b = b - 2L;
        if (l1 == i1)
        {
            a = hzs1.a();
            hzt.a(hzs1);
        } else
        {
            hzs1.b = l1;
        }
        return (short)((k1 & 0xff) << 8 | j1 & 0xff);
    }

    public final int j()
    {
        if (b < 4L)
        {
            throw new IllegalStateException((new StringBuilder("size < 4: ")).append(b).toString());
        }
        hzs hzs1 = a;
        int j1 = hzs1.b;
        int i1 = hzs1.c;
        if (i1 - j1 < 4)
        {
            return (h() & 0xff) << 24 | (h() & 0xff) << 16 | (h() & 0xff) << 8 | h() & 0xff;
        }
        byte abyte0[] = hzs1.a;
        int k1 = j1 + 1;
        j1 = abyte0[j1];
        int i2 = k1 + 1;
        k1 = abyte0[k1];
        int l1 = i2 + 1;
        byte byte0 = abyte0[i2];
        i2 = l1 + 1;
        j1 = (j1 & 0xff) << 24 | (k1 & 0xff) << 16 | (byte0 & 0xff) << 8 | abyte0[l1] & 0xff;
        b = b - 4L;
        if (i2 == i1)
        {
            a = hzs1.a();
            hzt.a(hzs1);
            return j1;
        } else
        {
            hzs1.b = i2;
            return j1;
        }
    }

    public final hzg j(long l1)
    {
        return g(l1);
    }

    public final short k()
    {
        return hzy.a(i());
    }

    public final int l()
    {
        return hzy.a(j());
    }

    public final long m()
    {
        byte byte0;
        int k1;
        int l1;
        long l3;
        long l4;
        if (b == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        l3 = 0L;
        k1 = 0;
        l1 = 0;
        byte0 = 0;
        l4 = -7L;
_L6:
        Object obj;
        byte abyte0[];
        int i1;
        boolean flag;
        int j1;
        int i2;
        long l2;
        obj = a;
        abyte0 = ((hzs) (obj)).a;
        j1 = ((hzs) (obj)).b;
        i2 = ((hzs) (obj)).c;
        l2 = l3;
        i1 = k1;
        flag = l1;
        l3 = l4;
_L2:
        k1 = byte0;
        if (j1 >= i2)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        k1 = abyte0[j1];
        if (k1 < 48 || k1 > 57)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = 48 - k1;
        if (l2 < 0xf333333333333334L || l2 == 0xf333333333333334L && (long)l1 < l3)
        {
            obj = (new hzf()).g(l2).b(k1);
            if (!flag)
            {
                ((hzf) (obj)).h();
            }
            throw new NumberFormatException((new StringBuilder("Number too large: ")).append(((hzf) (obj)).p()).toString());
        }
        l2 = l2 * 10L + (long)l1;
_L3:
        j1++;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (k1 != 45 || i1 != 0)
            {
                break label0;
            }
            flag = true;
            l3--;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        if (i1 == 0)
        {
            throw new NumberFormatException((new StringBuilder("Expected leading [0-9] or '-' character but was 0x")).append(Integer.toHexString(k1)).toString());
        }
        k1 = 1;
        if (j1 == i2)
        {
            a = ((hzs) (obj)).a();
            hzt.a(((hzs) (obj)));
        } else
        {
            obj.b = j1;
        }
        if (k1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l4 = l3;
        byte0 = k1;
        l1 = ((flag) ? 1 : 0);
        k1 = i1;
        l3 = l2;
        if (a != null) goto _L6; else goto _L5
_L5:
        b = b - (long)i1;
        if (flag)
        {
            return l2;
        } else
        {
            return -l2;
        }
    }

    public final long n()
    {
        int i1;
        int j1;
        long l3;
        if (b == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        l3 = 0L;
        i1 = 0;
        j1 = 0;
_L6:
        Object obj;
        byte abyte0[];
        int k1;
        int l1;
        int i2;
        long l2;
        obj = a;
        abyte0 = ((hzs) (obj)).a;
        l1 = ((hzs) (obj)).b;
        i2 = ((hzs) (obj)).c;
        l2 = l3;
        k1 = i1;
_L7:
        byte byte0;
        i1 = j1;
        if (l1 >= i2)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        byte0 = abyte0[l1];
        if (byte0 < 48 || byte0 > 57) goto _L2; else goto _L1
_L1:
        i1 = byte0 - 48;
_L4:
        if ((0xf000000000000000L & l2) != 0L)
        {
            obj = (new hzf()).h(l2).b(byte0);
            throw new NumberFormatException((new StringBuilder("Number too large: ")).append(((hzf) (obj)).p()).toString());
        }
        break MISSING_BLOCK_LABEL_293;
_L2:
        if (byte0 >= 97 && byte0 <= 102)
        {
            i1 = (byte0 - 97) + 10;
            continue; /* Loop/switch isn't completed */
        }
        if (byte0 < 65 || byte0 > 70)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = (byte0 - 65) + 10;
        if (true) goto _L4; else goto _L3
_L3:
        if (k1 == 0)
        {
            throw new NumberFormatException((new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x")).append(Integer.toHexString(byte0)).toString());
        }
        i1 = 1;
        if (l1 == i2)
        {
            a = ((hzs) (obj)).a();
            hzt.a(((hzs) (obj)));
        } else
        {
            obj.b = l1;
        }
        if (i1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i1;
        i1 = k1;
        l3 = l2;
        if (a != null) goto _L6; else goto _L5
_L5:
        b = b - (long)k1;
        return l2;
        l3 = i1;
        k1++;
        l1++;
        l2 = l3 | l2 << 4;
          goto _L7
    }

    public final hzi o()
    {
        return new hzi(r());
    }

    public final String p()
    {
        String s1;
        try
        {
            s1 = a(b, hzy.a);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return s1;
    }

    public final String q()
    {
        long l1 = a((byte)10);
        if (l1 == -1L)
        {
            hzf hzf1 = new hzf();
            a(hzf1, 0L, Math.min(32L, b));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(a()).append(" content=").append(hzf1.o().d()).append("...").toString());
        } else
        {
            return d(l1);
        }
    }

    public final byte[] r()
    {
        byte abyte0[];
        try
        {
            abyte0 = e(b);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return abyte0;
    }

    public final long read(hzf hzf1, long l1)
    {
        if (hzf1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
        }
        if (b == 0L)
        {
            return -1L;
        }
        long l2 = l1;
        if (l1 > b)
        {
            l2 = b;
        }
        hzf1.write(this, l2);
        return l2;
    }

    public final void s()
    {
        try
        {
            f(b);
            return;
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
    }

    public final hzi t()
    {
        if (b > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("size > Integer.MAX_VALUE: ")).append(b).toString());
        } else
        {
            return i((int)b);
        }
    }

    public final hzx timeout()
    {
        return hzx.NONE;
    }

    public final String toString()
    {
        if (b == 0L)
        {
            return "Buffer[size=0]";
        }
        if (b <= 16L)
        {
            hzi hzi1 = w().o();
            return String.format("Buffer[size=%s data=%s]", new Object[] {
                Long.valueOf(b), hzi1.d()
            });
        }
        String s1;
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(a.a, a.b, a.c - a.b);
            for (hzs hzs1 = a.f; hzs1 != a; hzs1 = hzs1.f)
            {
                messagedigest.update(hzs1.a, hzs1.b, hzs1.c - hzs1.b);
            }

        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AssertionError();
        }
        s1 = String.format("Buffer[size=%s md5=%s]", new Object[] {
            Long.valueOf(b), hzi.a(messagedigest.digest()).d()
        });
        return s1;
    }

    public final hzg u()
    {
        return v();
    }

    public final void write(hzf hzf1, long l1)
    {
        if (hzf1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (hzf1 == this)
        {
            throw new IllegalArgumentException("source == this");
        }
        hzy.a(hzf1.b, 0L, l1);
        do
        {
label0:
            {
label1:
                {
                    if (l1 > 0L)
                    {
                        if (l1 >= (long)(hzf1.a.c - hzf1.a.b))
                        {
                            break label0;
                        }
                        hzs hzs1;
                        int i1;
                        long l2;
                        if (a != null)
                        {
                            hzs1 = a.g;
                        } else
                        {
                            hzs1 = null;
                        }
                        if (hzs1 == null || !hzs1.e)
                        {
                            break label1;
                        }
                        l2 = hzs1.c;
                        if (hzs1.d)
                        {
                            i1 = 0;
                        } else
                        {
                            i1 = hzs1.b;
                        }
                        if ((l2 + l1) - (long)i1 > 2048L)
                        {
                            break label1;
                        }
                        hzf1.a.a(hzs1, (int)l1);
                        hzf1.b = hzf1.b - l1;
                        b = b + l1;
                    }
                    return;
                }
                hzf1.a = hzf1.a.a((int)l1);
            }
            hzs hzs2 = hzf1.a;
            long l3 = hzs2.c - hzs2.b;
            hzf1.a = hzs2.a();
            if (a == null)
            {
                a = hzs2;
                hzs2 = a;
                hzs hzs3 = a;
                hzs hzs4 = a;
                hzs3.g = hzs4;
                hzs2.f = hzs4;
            } else
            {
                a.g.a(hzs2).b();
            }
            hzf1.b = hzf1.b - l3;
            b = b + l3;
            l1 -= l3;
        } while (true);
    }

}
