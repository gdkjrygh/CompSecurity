// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.io.iobuffer;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.ytremote.fork.io.iobuffer:
//            a

public class b
{

    private static final Logger a = Logger.getLogger(com/google/android/apps/ytremote/fork/io/iobuffer/b.getName());
    private final List b = new LinkedList();
    private ByteBuffer c;
    private CharBuffer d;
    private ByteBuffer e;
    private CharBuffer f;
    private String g;
    private CharsetEncoder h;
    private CharsetDecoder i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private a o;
    private ByteBuffer p;
    private CharBuffer q;
    private int r;

    public b()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = 4096;
        k = false;
        l = 0;
        m = -1;
        n = 0;
        o = null;
        p = null;
        q = null;
        r = 0;
    }

    private void a(CharBuffer charbuffer, boolean flag)
    {
        do
        {
            Object obj = e();
            CharBuffer charbuffer1;
            if (q != null && q.hasRemaining())
            {
                if (charbuffer.hasRemaining())
                {
                    q.put(charbuffer.get());
                }
                q.flip();
                charbuffer1 = q;
            } else
            {
                charbuffer1 = charbuffer;
            }
            obj = h.encode(charbuffer1, ((ByteBuffer) (obj)), flag);
            if (obj == CoderResult.OVERFLOW)
            {
                j();
            } else
            if (obj == CoderResult.UNDERFLOW && charbuffer1.hasRemaining())
            {
                q = CharBuffer.allocate(charbuffer1.remaining() + 1);
                while (charbuffer1.hasRemaining()) 
                {
                    q.put(charbuffer1.get());
                }
            }
        } while (charbuffer.hasRemaining());
    }

    private void b(boolean flag)
    {
        if (h == null)
        {
            throw new IllegalStateException("No encoding has been set. Must call setCharacterEncoding() before flushing buffers.");
        }
        f.flip();
        a(f, flag);
        if (f.hasRemaining())
        {
            throw new IllegalStateException("encode() should consume the entire write_char_buf_");
        }
        if (flag)
        {
            h.reset();
            f = null;
        } else
        {
            f.clear();
        }
        k();
    }

    private void g()
    {
        if (c != null && !c.hasRemaining())
        {
            c = null;
        }
    }

    private void h()
    {
        if (r == 0 || c == null || c.capacity() >= r)
        {
            return;
        } else
        {
            ByteBuffer bytebuffer = c;
            c = ByteBuffer.allocate(r);
            c.put(bytebuffer);
            c.flip();
            return;
        }
    }

    private CharBuffer i()
    {
        int i1 = 1024;
        if (f == null)
        {
            if (m != -1)
            {
                i1 = Math.min(1024, m);
            }
            f = CharBuffer.allocate(i1);
        } else
        {
            if (f.hasRemaining())
            {
                return f;
            }
            b(false);
        }
        return f;
    }

    private void j()
    {
        l = e.position();
        synchronized (b)
        {
            b.add(e);
        }
        e = null;
        k();
    }

    private void k()
    {
        if (m != -1 && d() >= m)
        {
            a(false);
        }
    }

    public final int a(ByteBuffer bytebuffer)
    {
        if (d != null)
        {
            throw new IllegalStateException("Cannot read from the byte buffer: character data has already been read.");
        }
        int j1 = 0;
        int i1 = bytebuffer.remaining();
        do
        {
            if (i1 <= 0)
            {
                break;
            }
            ByteBuffer bytebuffer1 = f();
            if (bytebuffer1 == null)
            {
                break;
            }
            int k1 = bytebuffer1.remaining();
            if (k1 <= i1)
            {
                bytebuffer.put(bytebuffer1);
                i1 = j1 + k1;
            } else
            {
                int l1 = bytebuffer1.limit();
                bytebuffer1.limit(bytebuffer1.position() + i1);
                bytebuffer.put(bytebuffer1);
                i1 += j1;
                bytebuffer1.limit(l1);
            }
            k1 = bytebuffer.remaining();
            g();
            j1 = i1;
            i1 = k1;
        } while (true);
        return j1;
    }

    public final int a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        if (d != null)
        {
            throw new IllegalStateException("Cannot read from the byte buffer: character data has already been read.");
        }
        int l1 = j1;
        int k1 = i1;
        for (i1 = l1; i1 > 0;)
        {
            ByteBuffer bytebuffer = f();
            if (bytebuffer == null)
            {
                if (j1 == i1)
                {
                    return -1;
                }
                break;
            }
            int j2 = bytebuffer.remaining();
            int i2 = j2;
            if (j2 > i1)
            {
                i2 = i1;
            }
            bytebuffer.get(abyte0, k1, i2);
            i1 -= i2;
            k1 += i2;
            g();
        }

        return j1 - i1;
    }

    public final long a(long l1)
    {
        if (d != null)
        {
            throw new IllegalStateException("Cannot skip bytes: character data has already been read.");
        }
        long l2;
        long l3;
        for (l2 = l1; l2 > 0L; l2 -= l3)
        {
            ByteBuffer bytebuffer = f();
            if (bytebuffer == null)
            {
                break;
            }
            int j1 = bytebuffer.remaining();
            int i1 = j1;
            if ((long)j1 > l2)
            {
                i1 = (int)l2;
            }
            bytebuffer.position(bytebuffer.position() + i1);
            l3 = i1;
            g();
        }

        return l1 - l2;
    }

    public final void a()
    {
        a(false);
    }

    public final void a(int i1)
    {
        i().put((char)i1);
    }

    public final void a(boolean flag)
    {
        a a1;
        if (o != null)
        {
            a1 = o;
        }
    }

    public final void a(char ac[], int i1, int j1)
    {
        CharBuffer charbuffer = i();
        int k1 = j1;
        j1 = i1;
        for (i1 = k1; i1 > 0;)
        {
            CharBuffer charbuffer1 = charbuffer;
            if (!charbuffer.hasRemaining())
            {
                charbuffer1 = i();
            }
            int i2 = charbuffer1.remaining();
            int l1 = i2;
            if (i2 > i1)
            {
                l1 = i1;
            }
            charbuffer1.put(ac, j1, l1);
            i1 -= l1;
            j1 += l1;
            charbuffer = charbuffer1;
        }

    }

    public final void b()
    {
        if (f != null)
        {
            b(true);
        }
        if (e != null && e.position() > 0)
        {
            j();
        }
    }

    public final void b(int i1)
    {
        if (f != null)
        {
            throw new IllegalStateException("Cannot write to the byte buffer: character data has already been written.");
        } else
        {
            e().put((byte)i1);
            return;
        }
    }

    public final void b(byte abyte0[])
    {
        b(abyte0, 0, abyte0.length);
    }

    public final void b(byte abyte0[], int i1, int j1)
    {
        if (f != null)
        {
            throw new IllegalStateException("Cannot write to the byte buffer: character data has already been written.");
        }
        while (j1 > 0) 
        {
            ByteBuffer bytebuffer = e();
            int l1 = bytebuffer.remaining();
            int k1 = l1;
            if (l1 > j1)
            {
                k1 = j1;
            }
            bytebuffer.put(abyte0, i1, k1);
            j1 -= k1;
            i1 += k1;
        }
    }

    public final int c()
    {
        if (d != null)
        {
            throw new IllegalStateException("Cannot read from byte buffer: character data has already been read.");
        }
        ByteBuffer bytebuffer = f();
        if (bytebuffer == null || !bytebuffer.hasRemaining())
        {
            return -1;
        } else
        {
            byte byte0 = bytebuffer.get();
            g();
            return byte0 & 0xff;
        }
    }

    public final int d()
    {
        int i1;
        i1 = 0;
        if (c != null)
        {
            i1 = c.remaining() + 0;
        }
        List list = b;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            i1 = ((ByteBuffer)iterator.next()).position() + i1;
        }

        list;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ByteBuffer e()
    {
        if (e != null && e.hasRemaining())
        {
            return e;
        }
        if (e != null)
        {
            j();
        }
        int i1 = n;
        if (l > 0)
        {
            ByteBuffer bytebuffer;
            if (!k && l <= j / 2)
            {
                j = j >> 1;
            } else
            if (l == j + 2)
            {
                j = j << 1;
                k = true;
            } else
            {
                k = false;
            }
            j = Math.max(j, i1);
            j = Math.min(j, 0x400000);
        }
        if (m != -1 && m < j)
        {
            j = m;
        }
        if (n != 0 && i1 > j)
        {
            j = i1;
        }
        bytebuffer = ByteBuffer.allocate(j + 2);
        if (a.isLoggable(Level.FINEST))
        {
            a.finest((new StringBuilder("allocating ")).append(j + 2).append(" byte input buffer last byte buf size: ").append(l).toString());
        }
        e = bytebuffer;
        e.clear();
        return e;
    }

    public final ByteBuffer f()
    {
        if (c != null && c.hasRemaining())
        {
            h();
            return c;
        }
        if (c != null)
        {
            c = null;
        }
        synchronized (b)
        {
            if (!b.isEmpty())
            {
                c = (ByteBuffer)b.remove(0);
                c.flip();
            }
        }
        h();
        return c;
    }

    public String toString()
    {
        Object obj;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        obj = g;
        if (obj == null)
        {
            obj = "US-ASCII";
        }
        if (d != null)
        {
            int i1 = d.arrayOffset();
            int j2 = d.position();
            int k3 = d.length();
            stringbuilder.append(new String(d.array(), i1 + j2, k3));
        }
        if (c != null)
        {
            int j1 = c.arrayOffset();
            int k2 = c.position();
            int l3 = c.limit();
            int i4 = c.position();
            stringbuilder.append(new String(c.array(), j1 + k2, l3 - i4, ((String) (obj))));
        }
        List list = b;
        list;
        JVM INSTR monitorenter ;
        ByteBuffer bytebuffer;
        int k1;
        int l2;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); stringbuilder.append(new String(bytebuffer.array(), k1, l2, ((String) (obj)))))
        {
            bytebuffer = (ByteBuffer)iterator.next();
            k1 = bytebuffer.arrayOffset();
            l2 = bytebuffer.position();
        }

        break MISSING_BLOCK_LABEL_260;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        list;
        JVM INSTR monitorexit ;
        try
        {
            if (f != null)
            {
                int l1 = f.arrayOffset();
                int i3 = f.position();
                stringbuilder.append(new String(f.array(), l1, i3));
            }
            if (e != null)
            {
                int i2 = e.arrayOffset();
                int j3 = e.position();
                stringbuilder.append(new String(e.array(), i2, j3, ((String) (obj))));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return (new StringBuilder("unable to convert IOBuffer to string: ")).append(((UnsupportedEncodingException) (obj)).getMessage()).toString();
        }
        return stringbuilder.toString();
    }

}
