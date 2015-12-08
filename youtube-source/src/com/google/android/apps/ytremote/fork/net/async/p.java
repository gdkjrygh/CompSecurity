// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.IllegalBlockingModeException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            u, q, ak, IORuntimeException, 
//            t, o, af, an, 
//            r, s, c, IpV6BugException, 
//            a, b

public class p
    implements u
{

    static final boolean a;
    private static final s b = new q();
    private static final Logger n = Logger.getLogger(com/google/android/apps/ytremote/fork/net/async/p.getName());
    private final Selector c;
    private final Thread d = Thread.currentThread();
    private final ak e = new ak();
    private final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
    private final PriorityQueue g = new PriorityQueue();
    private volatile long h;
    private volatile boolean i;
    private volatile boolean j;
    private volatile boolean k;
    private volatile boolean l;
    private volatile boolean m;

    public p()
    {
        h = 0L;
        j = false;
        k = false;
        l = false;
        m = false;
        try
        {
            c = Selector.open();
        }
        catch (IOException ioexception)
        {
            throw new IORuntimeException(ioexception);
        }
    }

    private int a(Set set, boolean flag)
    {
        Iterator iterator;
        int j1;
        iterator = set.iterator();
        j1 = 0;
_L2:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_341;
        }
        set = (SelectionKey)iterator.next();
        iterator.remove();
        set;
        JVM INSTR monitorenter ;
        if (set.isValid())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        set;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        throw exception;
        Object obj;
        Object obj1;
        o o1;
        int k1;
        k1 = set.readyOps();
        obj1 = (t)set.attachment();
        obj = ((t) (obj1)).a;
        o1 = ((t) (obj1)).b;
        obj = ((t) (obj1)).c;
        obj1 = ((t) (obj1)).d;
        set;
        JVM INSTR monitorexit ;
        int i1 = j1;
        if ((k1 & 0x10) != 0)
        {
            try
            {
                n.finer("OP_ACCEPT event ready");
            }
            catch (RuntimeException runtimeexception3)
            {
                a(((SelectionKey) (set)));
                if (flag)
                {
                    throw runtimeexception3;
                }
                n.log(Level.SEVERE, "RuntimeException caught when invoking AcceptHandler.handleAcceptEvent", runtimeexception3);
            }
            i1 = j1 + 1;
        }
        j1 = i1;
        if ((k1 & 8) != 0)
        {
            try
            {
                n.finer("OP_CONNECT event ready");
                o1.a();
            }
            catch (RuntimeException runtimeexception2)
            {
                a(((SelectionKey) (set)));
                if (flag)
                {
                    throw runtimeexception2;
                }
                n.log(Level.SEVERE, "RuntimeException caught when invoking ConnectHandler.handleConnectEvent", runtimeexception2);
            }
            j1 = i1 + 1;
        }
        if ((k1 & 1) != 0)
        {
            try
            {
                n.finer("OP_READ event ready");
                ((af) (obj)).f();
            }
            catch (RuntimeException runtimeexception)
            {
                a(((SelectionKey) (set)));
                if (flag)
                {
                    throw runtimeexception;
                }
                n.log(Level.SEVERE, "RuntimeException caught when invoking ReadHandler.handleReadEvent", runtimeexception);
            }
            i1 = j1 + 1;
        } else
        {
            i1 = j1;
        }
        if ((k1 & 4) != 0)
        {
            try
            {
                n.finer("OP_WRITE event ready");
                ((an) (obj1)).g();
            }
            catch (RuntimeException runtimeexception1)
            {
                a(((SelectionKey) (set)));
                if (flag)
                {
                    throw runtimeexception1;
                }
                n.log(Level.SEVERE, "RuntimeException caught when invoking WriteHandler.handleWriteEvent", runtimeexception1);
            }
            i1++;
        }
        j1 = i1;
        continue; /* Loop/switch isn't completed */
        return j1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static long a(Queue queue, PriorityQueue priorityqueue, s s1, boolean flag)
    {
_L2:
        Runnable runnable = (Runnable)queue.poll();
        if (runnable != null)
        {
            try
            {
                runnable.run();
            }
            catch (RuntimeException runtimeexception)
            {
                if (flag)
                {
                    throw runtimeexception;
                }
                n.log(Level.SEVERE, "RuntimeException caught when invoking Runnable.run()", runtimeexception);
            }
            continue; /* Loop/switch isn't completed */
        }
        priorityqueue;
        JVM INSTR monitorenter ;
        if (!priorityqueue.isEmpty())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        priorityqueue;
        JVM INSTR monitorexit ;
        return 0L;
        r r1;
        long l1;
        r1 = (r)priorityqueue.peek();
        l1 = r1.a() - s1.a();
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        priorityqueue;
        JVM INSTR monitorexit ;
        return l1;
        if (n.isLoggable(Level.FINER))
        {
            n.finer((new StringBuilder("Alarm expired: ")).append(r1).toString());
        }
        r1 = (r)priorityqueue.poll();
        r1.b = false;
        priorityqueue;
        JVM INSTR monitorexit ;
        r1.b().a(r1);
        continue; /* Loop/switch isn't completed */
        RuntimeException runtimeexception1;
        runtimeexception1;
        if (flag)
        {
            throw runtimeexception1;
        }
        break MISSING_BLOCK_LABEL_180;
        queue;
        throw queue;
        n.log(Level.SEVERE, "RuntimeException caught when invoking AlarmHandler.handleAlarmEvent", runtimeexception1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a(SelectableChannel selectablechannel, int i1)
    {
        selectablechannel = selectablechannel.keyFor(c);
        if (selectablechannel == null)
        {
            return;
        }
        h();
        selectablechannel;
        JVM INSTR monitorenter ;
        if (selectablechannel.isValid())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        selectablechannel;
        JVM INSTR monitorexit ;
        i();
        return;
        Object obj;
        selectablechannel.interestOps(selectablechannel.interestOps() & ~i1);
        obj = (t)selectablechannel.attachment();
        if (i1 != 16) goto _L2; else goto _L1
_L1:
        obj.a = null;
        n.finer("OP_ACCEPT event deregistered");
_L3:
        selectablechannel;
        JVM INSTR monitorexit ;
        i();
        return;
_L2:
        if (i1 != 8)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj.b = null;
        n.finer("OP_CONNECT event deregistered");
          goto _L3
        obj;
        selectablechannel;
        JVM INSTR monitorexit ;
        throw obj;
        selectablechannel;
        i();
        throw selectablechannel;
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        obj.c = null;
        n.finer("OP_READ event deregistered");
          goto _L3
        if (i1 != 4)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        obj.d = null;
        n.finer("OP_WRITE event deregistered");
          goto _L3
        throw new IllegalArgumentException((new StringBuilder()).append(i1).append(" is not a valid op").toString());
    }

    private void a(SelectableChannel selectablechannel, int i1, a a1, o o1, af af1, an an1)
    {
        h();
        selectablechannel;
        JVM INSTR monitorenter ;
        a1 = selectablechannel.keyFor(c);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a1 = selectablechannel.register(c, i1, new t((byte)0));
        boolean flag = true;
_L7:
        selectablechannel;
        JVM INSTR monitorexit ;
        if (a || a1 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        throw new AssertionError();
        selectablechannel;
        i();
        throw selectablechannel;
        a1;
        throw new IORuntimeException(a1);
        a1;
        selectablechannel;
        JVM INSTR monitorexit ;
        throw a1;
        a1;
        JVM INSTR monitorenter ;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        a1.interestOps(a1.interestOps() | i1);
        selectablechannel = (t)a1.attachment();
        if (i1 != 16) goto _L4; else goto _L3
_L3:
        if (!a)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_133;
        selectablechannel;
        a1;
        JVM INSTR monitorexit ;
        throw selectablechannel;
        selectablechannel.a = null;
        n.finer("OP_ACCEPT event registered");
_L5:
        a1;
        JVM INSTR monitorexit ;
        i();
        return;
_L4:
        if (i1 != 8)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        if (a || o1 != null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        throw new AssertionError();
        selectablechannel.b = o1;
        n.finer("OP_CONNECT event registered");
          goto _L5
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        if (a || af1 != null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        throw new AssertionError();
        selectablechannel.c = af1;
        n.finer("OP_READ event registered");
          goto _L5
        if (i1 != 4)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        if (a || an1 != null)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        throw new AssertionError();
        selectablechannel.d = an1;
        n.finer("OP_WRITE event registered");
          goto _L5
        throw new IllegalArgumentException((new StringBuilder()).append(i1).append(" is not a valid op").toString());
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static void a(SelectableChannel selectablechannel, Object obj)
    {
        if (selectablechannel == null)
        {
            throw new NullPointerException("channel cannot be null");
        }
        if (obj == null)
        {
            throw new NullPointerException("callback cannot be null");
        }
        if (selectablechannel.isBlocking())
        {
            throw new IllegalBlockingModeException();
        } else
        {
            return;
        }
    }

    private void a(SelectionKey selectionkey)
    {
        if (!m)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        n.log(Level.WARNING, "Closing channel due to RuntimeException thrown by event handler");
        selectionkey.channel().close();
        return;
        selectionkey;
        n.log(Level.SEVERE, "Failed to close channel", selectionkey);
        return;
    }

    private long f()
    {
label0:
        {
            if (!f.isEmpty())
            {
                return -1L;
            }
            synchronized (g)
            {
                if (!g.isEmpty())
                {
                    break label0;
                }
            }
            return 0L;
        }
        long l1 = ((r)g.peek()).a() - System.currentTimeMillis();
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        return l1;
        exception;
        throw exception;
        priorityqueue;
        JVM INSTR monitorexit ;
        return -1L;
    }

    private boolean g()
    {
_L2:
        e.c();
_L1:
        return k;
        InterruptedException interruptedexception;
        interruptedexception;
        if (!k) goto _L2; else goto _L1
    }

    private void h()
    {
        if (e())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        e.a();
        c.wakeup();
        return;
        NullPointerException nullpointerexception;
        nullpointerexception;
        throw new IpV6BugException();
    }

    private void i()
    {
        if (!e())
        {
            e.b();
        }
    }

    public final b a(long l1, Object obj, c c1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("offsetMillis cannot be negative: ")).append(l1).toString());
        }
        if (c1 == null)
        {
            throw new NullPointerException("callback cannot be null");
        }
        PriorityQueue priorityqueue = g;
        priorityqueue;
        JVM INSTR monitorenter ;
        boolean flag;
        long l2 = System.currentTimeMillis();
        obj = new r(l2 + l1, l2, c1, obj);
        if (n.isLoggable(Level.FINER))
        {
            n.finer((new StringBuilder("Alarm created: ")).append(obj).toString());
        }
        flag = g.add(obj);
        if (a || flag)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        throw new AssertionError();
        obj;
        priorityqueue;
        JVM INSTR monitorexit ;
        throw obj;
        priorityqueue;
        JVM INSTR monitorexit ;
        if (!e())
        {
            c.wakeup();
        }
        return ((b) (obj));
    }

    public final void a()
    {
        if (!e())
        {
            throw new IllegalThreadStateException((new StringBuilder("Network thread is ")).append(d.getName()).append(" but the thread ").append(Thread.currentThread().getName()).append(" is trying to loop").toString());
        }
        if (j)
        {
            throw new IllegalStateException("Cannot recursively loop");
        }
        j = true;
        n.fine("Start looping");
        long l1 = f();
_L2:
        boolean flag;
        if (k)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        flag = g();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        if (l1 == 0L)
        {
            l1 = 0x5265c00L;
        }
        if (l1 < 0L)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        c.select(l1);
_L3:
        h = h + (long)a(c.selectedKeys(), false);
        long l2;
        i = true;
        l2 = a(((Queue) (f)), g, b, false);
        i = false;
        l1 = l2;
        if (!n.isLoggable(Level.FINER)) goto _L2; else goto _L1
_L1:
        n.finer((new StringBuilder("State at end of loop iteration: ")).append(toString()).toString());
        l1 = l2;
          goto _L2
        Object obj;
        obj;
        j = false;
        k = false;
        n.fine("Stop looping");
        if (l)
        {
            c.close();
        }
        throw obj;
        c.selectNow();
          goto _L3
        obj;
label0:
        {
            if (!((IOException) (obj)).getMessage().contains("Operation not permitted"))
            {
                break label0;
            }
            n.log(Level.WARNING, "Ignoring spurious IOException in server loop", ((Throwable) (obj)));
        }
          goto _L2
        throw obj;
        obj;
        i = false;
        throw obj;
        j = false;
        k = false;
        n.fine("Stop looping");
        if (l)
        {
            c.close();
        }
        return;
    }

    public final void a(SelectableChannel selectablechannel)
    {
        if (selectablechannel == null)
        {
            throw new NullPointerException("channel cannot be null");
        } else
        {
            a(selectablechannel, 8);
            return;
        }
    }

    public final void a(SelectableChannel selectablechannel, af af1)
    {
        a(selectablechannel, af1);
        a(selectablechannel, 1, null, null, af1, null);
    }

    public final void a(SelectableChannel selectablechannel, an an1)
    {
        a(selectablechannel, an1);
        a(selectablechannel, 4, null, null, null, an1);
    }

    public final void a(SelectableChannel selectablechannel, o o1)
    {
        a(selectablechannel, o1);
        a(selectablechannel, 8, null, o1, null, null);
    }

    public final void b()
    {
        k = true;
    }

    public final void b(SelectableChannel selectablechannel)
    {
        if (selectablechannel == null)
        {
            throw new NullPointerException("channel cannot be null");
        } else
        {
            a(selectablechannel, 1);
            return;
        }
    }

    public final void c()
    {
        k = true;
        if (!e())
        {
            c.wakeup();
        }
    }

    public final void c(SelectableChannel selectablechannel)
    {
        if (selectablechannel == null)
        {
            throw new NullPointerException("channel cannot be null");
        } else
        {
            a(selectablechannel, 4);
            return;
        }
    }

    public final void d()
    {
        c.close();
    }

    public final boolean e()
    {
        return Thread.currentThread() == d;
    }

    public void execute(Runnable runnable)
    {
        f.add(runnable);
        if (!e())
        {
            c.wakeup();
        }
    }

    public String toString()
    {
        obj = new StringBuffer();
        ((StringBuffer) (obj)).append("Alarm set = ");
        synchronized (g)
        {
            ((StringBuffer) (obj)).append(g.toString());
        }
        if (j)
        {
            ((StringBuffer) (obj)).append("; Looping");
        } else
        {
            ((StringBuffer) (obj)).append("; Not looping");
        }
        if (k)
        {
            ((StringBuffer) (obj)).append("; Loop exiting");
        }
        return ((StringBuffer) (obj)).toString();
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/ytremote/fork/net/async/p.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
