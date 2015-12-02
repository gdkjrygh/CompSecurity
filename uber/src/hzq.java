// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.OutputStream;

final class hzq
    implements hzg
{

    public final hzf a;
    public final hzv b;
    private boolean c;

    public hzq(hzv hzv1)
    {
        this(hzv1, new hzf());
    }

    private hzq(hzv hzv1, hzf hzf1)
    {
        if (hzv1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            a = hzf1;
            b = hzv1;
            return;
        }
    }

    static boolean a(hzq hzq1)
    {
        return hzq1.c;
    }

    public final long a(hzw hzw1)
    {
        if (hzw1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l = 0L;
        do
        {
            long l1 = hzw1.read(a, 2048L);
            if (l1 != -1L)
            {
                l += l1;
                u();
            } else
            {
                return l;
            }
        } while (true);
    }

    public final hzf b()
    {
        return a;
    }

    public final hzg b(hzi hzi)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(hzi);
            return u();
        }
    }

    public final hzg b(String s)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(s);
            return u();
        }
    }

    public final hzg b(byte abyte0[])
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(abyte0);
            return u();
        }
    }

    public final hzg c(byte abyte0[], int k, int l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(abyte0, k, l);
            return u();
        }
    }

    public final OutputStream c()
    {
        return new OutputStream() {

            final hzq a;

            public final void close()
            {
                a.close();
            }

            public final void flush()
            {
                if (!hzq.a(a))
                {
                    a.flush();
                }
            }

            public final String toString()
            {
                return (new StringBuilder()).append(a).append(".outputStream()").toString();
            }

            public final void write(int k)
            {
                if (hzq.a(a))
                {
                    throw new IOException("closed");
                } else
                {
                    a.a.b((byte)k);
                    a.u();
                    return;
                }
            }

            public final void write(byte abyte0[], int k, int l)
            {
                if (hzq.a(a))
                {
                    throw new IOException("closed");
                } else
                {
                    a.a.b(abyte0, k, l);
                    a.u();
                    return;
                }
            }

            
            {
                a = hzq.this;
                super();
            }
        };
    }

    public final void close()
    {
        if (!c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Throwable throwable;
        Throwable throwable1;
        throwable1 = null;
        throwable = throwable1;
        if (a.b <= 0L)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        b.write(a, a.b);
        throwable = throwable1;
_L4:
        b.close();
        throwable1 = throwable;
_L3:
        c = true;
        if (throwable1 != null)
        {
            hzy.a(throwable1);
            return;
        }
          goto _L1
        Throwable throwable2;
        throwable2;
        throwable1 = throwable;
        if (throwable == null)
        {
            throwable1 = throwable2;
        }
          goto _L3
        throwable;
          goto _L4
    }

    public final hzg d()
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        long l = a.a();
        if (l > 0L)
        {
            b.write(a, l);
        }
        return this;
    }

    public final hzg f(int k)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.d(k);
            return u();
        }
    }

    public final void flush()
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        if (a.b > 0L)
        {
            b.write(a, a.b);
        }
        b.flush();
    }

    public final hzg g(int k)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.c(k);
            return u();
        }
    }

    public final hzg h(int k)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(k);
            return u();
        }
    }

    public final hzg i(long l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.h(l);
            return u();
        }
    }

    public final hzg j(long l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.g(l);
            return u();
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

    public final hzg u()
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        long l = a.g();
        if (l > 0L)
        {
            b.write(a, l);
        }
        return this;
    }

    public final void write(hzf hzf1, long l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.write(hzf1, l);
            u();
            return;
        }
    }
}
