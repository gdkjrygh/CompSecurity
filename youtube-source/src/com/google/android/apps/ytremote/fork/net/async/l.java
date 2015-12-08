// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            e, o, al, am, 
//            f, aj, IORuntimeException, u, 
//            Connection, g, m, n

public final class l
    implements e, o
{

    static final boolean a;
    private static final Logger b = Logger.getLogger(com/google/android/apps/ytremote/fork/net/async/l.getName());
    private final u c;
    private InetSocketAddress d;
    private aj e;
    private Connection f;
    private n g;
    private final al h = new al();
    private final am i = new am();
    private f j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private String o;
    private boolean p;

    public l(u u1, f f1)
    {
        e = null;
        f = null;
        g = null;
        k = -1;
        l = -1;
        m = false;
        n = false;
        p = false;
        if (u1 == null)
        {
            throw new NullPointerException("eventRegistry cannot be null");
        }
        if (f1 == null)
        {
            throw new NullPointerException("callback cannot be null");
        } else
        {
            c = u1;
            j = f1;
            return;
        }
    }

    private boolean g()
    {
        return e != null;
    }

    private boolean h()
    {
        return f != null;
    }

    public final void a()
    {
        try
        {
            if (h())
            {
                return;
            }
        }
        catch (Exception exception)
        {
            j.a(exception);
            return;
        }
        if (!p)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (!a && e != null)
        {
            throw new AssertionError();
        }
        if (e != null)
        {
            e.close();
            e = null;
            return;
        }
        break MISSING_BLOCK_LABEL_260;
        if (!e.d())
        {
            throw new IORuntimeException("Seems like a bug: handleConnectEvent() invoked when connection is still in progress");
        }
        c.a(e);
        f = new Connection(e, c, j, Connection.ConnectionMode.CLIENT);
        if (o != null)
        {
            Connection connection = f;
            Connection.a(o);
        }
        e = null;
        h.a(f.a());
        i.a(f.b());
        if (k > 0)
        {
            f.a(k);
        }
        if (l > 0)
        {
            f.b(l);
        }
        if (m)
        {
            f.c();
        }
        if (n)
        {
            f.d();
        }
        if (g != null)
        {
            Object obj = g;
            obj = f;
        }
    }

    public final void a(InetSocketAddress inetsocketaddress, n n1)
    {
        aj aj1;
        aj1 = aj.a();
        if (g())
        {
            throw new IllegalStateException("alreading connecting");
        }
          goto _L1
        inetsocketaddress;
        com.google.android.apps.ytremote.fork.net.async.g.a(j, inetsocketaddress, c);
_L2:
        return;
_L1:
        if (h())
        {
            throw new IllegalStateException("alreading connected");
        }
        if (p)
        {
            throw new IllegalStateException("already closed");
        }
        g = n1;
        e = aj1;
        e.configureBlocking(false);
        if (d != null)
        {
            n1 = e.b();
            n1.setReuseAddress(true);
            n1.bind(d);
        }
        e.a(inetsocketaddress);
        c.a(e, this);
        if (aj1.d())
        {
            c.execute(new m(this));
            return;
        }
          goto _L2
        inetsocketaddress;
        com.google.android.apps.ytremote.fork.net.async.g.a(j, inetsocketaddress, c);
        return;
    }

    public final InputStream b()
    {
        return h;
    }

    public final OutputStream c()
    {
        return i;
    }

    public final void d()
    {
        if (f != null)
        {
            f.c();
            return;
        } else
        {
            m = true;
            return;
        }
    }

    public final void e()
    {
        if (f != null)
        {
            f.d();
            return;
        } else
        {
            n = true;
            return;
        }
    }

    public final void f()
    {
        p = true;
        if (e != null)
        {
            e.close();
            e = null;
        }
        if (f != null)
        {
            f.e();
        }
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (g())
        {
            stringbuffer.append("Status = connecting; Connecting SocketChannel = ");
            stringbuffer.append(e.toString());
        } else
        if (h())
        {
            stringbuffer.append("Status = connected; Connection = ");
            stringbuffer.append(f.toString());
        } else
        {
            stringbuffer.append("Status = idle");
        }
        stringbuffer.append(";maxSizePerReadToSet_ = ");
        stringbuffer.append(k);
        stringbuffer.append(";maxSizePerFlushToSet_ = ");
        stringbuffer.append(l);
        stringbuffer.append(";asyncReadAfterConnect_ = ");
        stringbuffer.append(m);
        stringbuffer.append(";asyncFlushAfterConnect_ = ");
        stringbuffer.append(n);
        stringbuffer.append(";isClosed_ = ");
        stringbuffer.append(p);
        return stringbuffer.toString();
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/ytremote/fork/net/async/l.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
