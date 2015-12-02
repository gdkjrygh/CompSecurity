// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class hzr
    implements hzh
{

    public final hzf a;
    public final hzw b;
    private boolean c;

    public hzr(hzw hzw1)
    {
        this(hzw1, new hzf());
    }

    private hzr(hzw hzw1, hzf hzf1)
    {
        if (hzw1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            a = hzf1;
            b = hzw1;
            return;
        }
    }

    private long a(byte byte0, long l1)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        do
        {
            long l2 = l1;
            if (0L >= a.b)
            {
                if (b.read(a, 2048L) == -1L)
                {
                    return -1L;
                }
            } else
            {
                do
                {
                    l1 = a.a(byte0, l2);
                    if (l1 == -1L)
                    {
                        l2 = a.b;
                        if (b.read(a, 2048L) == -1L)
                        {
                            return -1L;
                        }
                    } else
                    {
                        return l1;
                    }
                } while (true);
            }
        } while (true);
    }

    static boolean a(hzr hzr1)
    {
        return hzr1.c;
    }

    private boolean b(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
        }
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        while (a.b < l1) 
        {
            if (b.read(a, 2048L) == -1L)
            {
                return false;
            }
        }
        return true;
    }

    public final long a(byte byte0)
    {
        return a(byte0, 0L);
    }

    public final void a(long l1)
    {
        if (!b(l1))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final hzf b()
    {
        return a;
    }

    public final hzi c(long l1)
    {
        a(l1);
        return a.c(l1);
    }

    public final void close()
    {
        if (c)
        {
            return;
        } else
        {
            c = true;
            b.close();
            a.s();
            return;
        }
    }

    public final boolean e()
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        return a.e() && b.read(a, 2048L) == -1L;
    }

    public final byte[] e(long l1)
    {
        a(l1);
        return a.e(l1);
    }

    public final InputStream f()
    {
        return new InputStream() {

            final hzr a;

            public final int available()
            {
                if (hzr.a(a))
                {
                    throw new IOException("closed");
                } else
                {
                    return (int)Math.min(a.a.b, 0x7fffffffL);
                }
            }

            public final void close()
            {
                a.close();
            }

            public final int read()
            {
                if (hzr.a(a))
                {
                    throw new IOException("closed");
                }
                if (a.a.b == 0L && a.b.read(a.a, 2048L) == -1L)
                {
                    return -1;
                } else
                {
                    return a.a.h() & 0xff;
                }
            }

            public final int read(byte abyte0[], int i1, int j1)
            {
                if (hzr.a(a))
                {
                    throw new IOException("closed");
                }
                hzy.a(abyte0.length, i1, j1);
                if (a.a.b == 0L && a.b.read(a.a, 2048L) == -1L)
                {
                    return -1;
                } else
                {
                    return a.a.a(abyte0, i1, j1);
                }
            }

            public final String toString()
            {
                return (new StringBuilder()).append(a).append(".inputStream()").toString();
            }

            
            {
                a = hzr.this;
                super();
            }
        };
    }

    public final void f(long l1)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
_L3:
        if (l1 > 0L)
        {
            if (a.b == 0L && b.read(a, 2048L) == -1L)
            {
                throw new EOFException();
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        long l2 = Math.min(l1, a.a());
        a.f(l2);
        l1 -= l2;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public final byte h()
    {
        a(1L);
        return a.h();
    }

    public final short i()
    {
        a(2L);
        return a.i();
    }

    public final int j()
    {
        a(4L);
        return a.j();
    }

    public final short k()
    {
        a(2L);
        return a.k();
    }

    public final int l()
    {
        a(4L);
        return a.l();
    }

    public final long m()
    {
        a(1L);
        int i1 = 0;
        do
        {
            if (!b(i1 + 1))
            {
                break;
            }
            byte byte0 = a.b(i1);
            if ((byte0 < 48 || byte0 > 57) && (i1 != 0 || byte0 != 45))
            {
                if (i1 == 0)
                {
                    throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[] {
                        Byte.valueOf(byte0)
                    }));
                }
                break;
            }
            i1++;
        } while (true);
        return a.m();
    }

    public final long n()
    {
        a(1L);
        int i1 = 0;
        do
        {
            if (!b(i1 + 1))
            {
                break;
            }
            byte byte0 = a.b(i1);
            if ((byte0 < 48 || byte0 > 57) && (byte0 < 97 || byte0 > 102) && (byte0 < 65 || byte0 > 70))
            {
                if (i1 == 0)
                {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[] {
                        Byte.valueOf(byte0)
                    }));
                }
                break;
            }
            i1++;
        } while (true);
        return a.n();
    }

    public final String q()
    {
        long l1 = a((byte)10);
        if (l1 == -1L)
        {
            hzf hzf1 = new hzf();
            a.a(hzf1, 0L, Math.min(32L, a.a()));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(a.a()).append(" content=").append(hzf1.o().d()).append("...").toString());
        } else
        {
            return a.d(l1);
        }
    }

    public final byte[] r()
    {
        a.a(b);
        return a.r();
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
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        if (a.b == 0L && b.read(a, 2048L) == -1L)
        {
            return -1L;
        } else
        {
            l1 = Math.min(l1, a.b);
            return a.read(hzf1, l1);
        }
    }

    public final hzx timeout()
    {
        return b.timeout();
    }

    public final String toString()
    {
        return (new StringBuilder("buffer(")).append(b).append(")").toString();
    }
}
