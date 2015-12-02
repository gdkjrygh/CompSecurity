// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class hzp
{

    private static final Logger a = Logger.getLogger(hzp.getName());

    private hzp()
    {
    }

    public static hzg a(hzv hzv)
    {
        if (hzv == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            return new hzq(hzv);
        }
    }

    public static hzh a(hzw hzw)
    {
        if (hzw == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return new hzr(hzw);
        }
    }

    private static hzv a(OutputStream outputstream)
    {
        return a(outputstream, new hzx());
    }

    private static hzv a(OutputStream outputstream, hzx hzx1)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        if (hzx1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new hzv(hzx1, outputstream) {

                final hzx a;
                final OutputStream b;

                public final void close()
                {
                    b.close();
                }

                public final void flush()
                {
                    b.flush();
                }

                public final hzx timeout()
                {
                    return a;
                }

                public final String toString()
                {
                    return (new StringBuilder("sink(")).append(b).append(")").toString();
                }

                public final void write(hzf hzf1, long l)
                {
                    hzy.a(hzf1.b, 0L, l);
                    do
                    {
                        if (l <= 0L)
                        {
                            break;
                        }
                        a.throwIfReached();
                        hzs hzs1 = hzf1.a;
                        int i = (int)Math.min(l, hzs1.c - hzs1.b);
                        b.write(hzs1.a, hzs1.b, i);
                        hzs1.b = hzs1.b + i;
                        long l1 = l - (long)i;
                        hzf1.b = hzf1.b - (long)i;
                        l = l1;
                        if (hzs1.b == hzs1.c)
                        {
                            hzf1.a = hzs1.a();
                            hzt.a(hzs1);
                            l = l1;
                        }
                    } while (true);
                }

            
            {
                a = hzx1;
                b = outputstream;
                super();
            }
            };
        }
    }

    public static hzv a(Socket socket)
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            hzc hzc1 = c(socket);
            return hzc1.sink(a(socket.getOutputStream(), ((hzx) (hzc1))));
        }
    }

    public static hzw a(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(((InputStream) (new FileInputStream(file))));
        }
    }

    private static hzw a(InputStream inputstream)
    {
        return a(inputstream, new hzx());
    }

    private static hzw a(InputStream inputstream, hzx hzx1)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (hzx1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new hzw(hzx1, inputstream) {

                final hzx a;
                final InputStream b;

                public final void close()
                {
                    b.close();
                }

                public final long read(hzf hzf1, long l)
                {
                    if (l < 0L)
                    {
                        throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
                    }
                    if (l == 0L)
                    {
                        return 0L;
                    }
                    a.throwIfReached();
                    hzs hzs1 = hzf1.e(1);
                    int i = (int)Math.min(l, 2048 - hzs1.c);
                    i = b.read(hzs1.a, hzs1.c, i);
                    if (i == -1)
                    {
                        return -1L;
                    } else
                    {
                        hzs1.c = hzs1.c + i;
                        hzf1.b = hzf1.b + (long)i;
                        return (long)i;
                    }
                }

                public final hzx timeout()
                {
                    return a;
                }

                public final String toString()
                {
                    return (new StringBuilder("source(")).append(b).append(")").toString();
                }

            
            {
                a = hzx1;
                b = inputstream;
                super();
            }
            };
        }
    }

    static Logger a()
    {
        return a;
    }

    public static hzv b(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(new FileOutputStream(file));
        }
    }

    public static hzw b(Socket socket)
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            hzc hzc1 = c(socket);
            return hzc1.source(a(socket.getInputStream(), hzc1));
        }
    }

    private static hzc c(Socket socket)
    {
        return new hzc(socket) {

            final Socket a;

            protected final void timedOut()
            {
                try
                {
                    a.close();
                    return;
                }
                catch (Exception exception)
                {
                    hzp.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), exception);
                }
            }

            
            {
                a = socket;
                super();
            }
        };
    }

    public static hzv c(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(new FileOutputStream(file, true));
        }
    }

}
