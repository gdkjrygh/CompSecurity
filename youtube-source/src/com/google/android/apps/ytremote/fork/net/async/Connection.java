// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import com.google.android.apps.ytremote.fork.io.iobuffer.IOBufferOutputStream;
import com.google.android.apps.ytremote.fork.io.iobuffer.b;
import com.google.android.apps.ytremote.fork.io.iobuffer.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.IllegalBlockingModeException;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.ReadableByteChannel;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            af, an, e, aj, 
//            g, u, f, IORuntimeException

public final class Connection
    implements af, an, e
{

    static final boolean a;
    private final aj b;
    private final u c;
    private volatile f d;
    private final b e;
    private final b f;
    private final InputStream g;
    private final OutputStream h;
    private boolean i;
    private final ByteBuffer j;
    private volatile int k;
    private volatile int l;
    private int m;
    private volatile boolean n;

    public Connection(aj aj1, u u1, f f1, ConnectionMode connectionmode)
    {
        this(aj1, u1, f1, connectionmode, null);
    }

    private Connection(aj aj1, u u1, f f1, ConnectionMode connectionmode, byte abyte0[])
    {
        e = new b();
        f = new b();
        i = false;
        k = 0x7fffffff;
        l = 0x7fffffff;
        m = 0;
        n = false;
        if (connectionmode == null)
        {
            throw new NullPointerException("mode cannot be null");
        }
        if (aj1 == null)
        {
            throw new NullPointerException("channel cannot be null");
        }
        if (u1 == null)
        {
            throw new NullPointerException("eventRegistry cannot be null");
        }
        if (f1 == null)
        {
            throw new NullPointerException("callback cannot be null");
        }
        if (aj1.isBlocking())
        {
            throw new IllegalBlockingModeException();
        }
        if (!aj1.c())
        {
            throw new NotYetConnectedException();
        }
        b = aj1;
        c = u1;
        d = f1;
        g = new c(e);
        h = new IOBufferOutputStream(f);
        j = ByteBuffer.allocate(1024);
        j.position(1024);
        try
        {
            b.b().setTcpNoDelay(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aj aj1)
        {
            com.google.android.apps.ytremote.fork.net.async.g.a(d, aj1, c);
        }
    }

    private int a(ByteBuffer bytebuffer, int i1)
    {
        int j1;
        if (bytebuffer.remaining() <= i1)
        {
            return b.a(bytebuffer);
        }
        j1 = bytebuffer.limit();
        bytebuffer.limit(bytebuffer.position() + i1);
        i1 = b.a(bytebuffer);
        bytebuffer.limit(j1);
        return i1;
        Exception exception;
        exception;
        bytebuffer.limit(j1);
        throw exception;
    }

    private static int a(ReadableByteChannel readablebytechannel, ByteBuffer bytebuffer, int i1)
    {
        int j1;
        if (bytebuffer.remaining() <= i1)
        {
            return readablebytechannel.read(bytebuffer);
        }
        j1 = bytebuffer.limit();
        bytebuffer.limit(bytebuffer.position() + i1);
        i1 = readablebytechannel.read(bytebuffer);
        bytebuffer.limit(j1);
        return i1;
        readablebytechannel;
        bytebuffer.limit(j1);
        throw readablebytechannel;
    }

    public static void a(String s)
    {
    }

    public final InputStream a()
    {
        return g;
    }

    public final void a(int i1)
    {
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("maxNumByte must be positive");
        } else
        {
            k = i1;
            return;
        }
    }

    public final OutputStream b()
    {
        return h;
    }

    public final void b(int i1)
    {
        if (i1 > 0)
        {
            l = i1;
            n = true;
            return;
        }
        if (i1 == -1)
        {
            l = 0x7fffffff;
            n = false;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid maxNumByte ")).append(i1).toString());
        }
    }

    public final void c()
    {
        c.a(b, this);
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        f.b();
        if (!i)
        {
            c.a(b, this);
            i = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com.google.android.apps.ytremote.fork.net.async.g.a(d, ((Exception) (obj)), c);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void e()
    {
        b.close();
    }

    public final void f()
    {
        byte byte0 = -1;
        Object obj;
        b b1;
        int i2;
        obj = b;
        b1 = e;
        i2 = k;
        if (!a && i2 < 0)
        {
            try
            {
                throw new AssertionError();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                d.a(((Exception) (obj)));
            }
            return;
        }
        if (((ReadableByteChannel) (obj)).isOpen()) goto _L2; else goto _L1
_L1:
        int i1 = byte0;
_L14:
        if (i1 >= 0) goto _L4; else goto _L3
_L3:
        c.b(b);
        d.a();
        return;
_L9:
        int j1;
        int j2 = a(((ReadableByteChannel) (obj)), b1.e(), j1);
        if (a || j2 <= j1) goto _L6; else goto _L5
_L5:
        throw new AssertionError();
_L12:
        int k1;
        if (k1 >= i2) goto _L8; else goto _L7
_L7:
        b1.b();
          goto _L8
_L4:
        d.a(i1);
        return;
_L2:
        i1 = 0;
        j1 = i2;
          goto _L9
_L6:
        int l1;
        if (j2 > 0)
        {
            k1 = j1 - j2;
            l1 = i1;
        } else
        {
            l1 = i1;
            k1 = j1;
            if (j2 < 0)
            {
                l1 = 1;
                k1 = j1;
            }
        }
        if (k1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = l1;
        j1 = k1;
        if (j2 > 0) goto _L9; else goto _L10
_L10:
        if (l1 == 0) goto _L12; else goto _L11
_L11:
        i1 = byte0;
        if (k1 == i2)
        {
            continue; /* Loop/switch isn't completed */
        }
          goto _L12
_L8:
        i1 = i2 - k1;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final void g()
    {
        boolean flag1 = false;
        Object obj;
        if (!a && l < 0)
        {
            throw new AssertionError();
        }
          goto _L1
_L12:
        return;
_L1:
        int k1 = l;
        if (b.isOpen()) goto _L3; else goto _L2
_L2:
        int i1 = 0;
_L15:
        if (i1 >= 0) goto _L5; else goto _L4
_L4:
        throw new IORuntimeException("-1 returned when writing to channel");
_L13:
        if (!j.hasRemaining()) goto _L7; else goto _L6
_L6:
        int j1;
        i1 = a(j, j1);
          goto _L8
_L7:
        ByteBuffer bytebuffer = f.f();
        if (bytebuffer == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        if (!bytebuffer.hasRemaining())
        {
            break MISSING_BLOCK_LABEL_309;
        }
        if (bytebuffer.remaining() <= 1024) goto _L10; else goto _L9
_L9:
        i1 = a(bytebuffer, j1);
          goto _L8
_L10:
        j.clear();
        f.a(j);
        j.flip();
        i1 = a(j, j1);
          goto _L8
_L5:
        m = i1 + m;
        this;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        if (j.hasRemaining())
        {
            break MISSING_BLOCK_LABEL_235;
        }
        flag = flag1;
        if (f.d() != 0)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        c.c(b);
        i = false;
        flag = true;
        this;
        JVM INSTR monitorexit ;
        if (!n && !flag) goto _L12; else goto _L11
_L11:
        try
        {
            i1 = m;
            m = 0;
            d.a(i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d.a(((Exception) (obj)));
        }
          goto _L12
        bytebuffer;
        this;
        JVM INSTR monitorexit ;
        throw bytebuffer;
_L3:
        j1 = k1;
          goto _L13
_L8:
        int l1;
        l1 = j1 - i1;
        if (l1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = l1;
        if (i1 > 0) goto _L13; else goto _L14
_L14:
        i1 = k1 - l1;
          goto _L15
        i1 = 0;
          goto _L8
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("SocketChannel = ");
        stringbuffer.append(b.toString());
        stringbuffer.append("; Input buffer = ");
        stringbuffer.append(e.toString());
        stringbuffer.append("; Output buffer = ");
        stringbuffer.append(f.toString());
        stringbuffer.append("; Maximum size per read = ");
        stringbuffer.append(k);
        stringbuffer.append("; Maximum size per flush = ");
        stringbuffer.append(l);
        return stringbuffer.toString();
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/ytremote/fork/net/async/Connection.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
