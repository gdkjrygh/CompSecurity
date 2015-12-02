// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InterruptedIOException;

public class hzc extends hzx
{

    private static hzc head;
    private boolean inQueue;
    private hzc next;
    private long timeoutAt;

    public hzc()
    {
    }

    private static hzc awaitTimeout()
    {
        Object obj = null;
        hzc;
        JVM INSTR monitorenter ;
        hzc hzc1 = head.next;
        if (hzc1 != null) goto _L2; else goto _L1
_L1:
        hzc.wait();
_L4:
        hzc;
        JVM INSTR monitorexit ;
        return ((hzc) (obj));
_L2:
        long l = hzc1.remainingNanos(System.nanoTime());
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        long l1 = l / 0xf4240L;
        hzc.wait(l1, (int)(l - 0xf4240L * l1));
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        head.next = hzc1.next;
        hzc1.next = null;
        obj = hzc1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean cancelScheduledTimeout(hzc hzc1)
    {
        hzc;
        JVM INSTR monitorenter ;
        hzc hzc2 = head;
_L8:
        if (hzc2 == null) goto _L2; else goto _L1
_L1:
        if (hzc2.next != hzc1) goto _L4; else goto _L3
_L3:
        hzc2.next = hzc1.next;
        hzc1.next = null;
        boolean flag = false;
_L6:
        hzc;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        hzc2 = hzc2.next;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        hzc1;
        throw hzc1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private long remainingNanos(long l)
    {
        return timeoutAt - l;
    }

    private static void scheduleTimeout(hzc hzc1, long l, boolean flag)
    {
        hzc;
        JVM INSTR monitorenter ;
        long l1;
        if (head == null)
        {
            head = new hzc();
            (new hzd()).start();
        }
        l1 = System.nanoTime();
        if (l == 0L || !flag) goto _L2; else goto _L1
_L1:
        hzc1.timeoutAt = Math.min(l, hzc1.deadlineNanoTime() - l1) + l1;
_L3:
        l = hzc1.remainingNanos(l1);
        for (hzc hzc2 = head; hzc2.next != null && l >= hzc2.next.remainingNanos(l1); hzc2 = hzc2.next)
        {
            break MISSING_BLOCK_LABEL_175;
        }

        hzc1.next = hzc2.next;
        hzc2.next = hzc1;
        if (hzc2 == head)
        {
            hzc.notify();
        }
        hzc;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        hzc1.timeoutAt = l1 + l;
          goto _L3
        hzc1;
        throw hzc1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        hzc1.timeoutAt = hzc1.deadlineNanoTime();
          goto _L3
        throw new AssertionError();
    }

    public final void enter()
    {
        if (inQueue)
        {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long l = timeoutNanos();
        boolean flag = hasDeadline();
        if (l == 0L && !flag)
        {
            return;
        } else
        {
            inQueue = true;
            scheduleTimeout(this, l, flag);
            return;
        }
    }

    final IOException exit(IOException ioexception)
    {
        if (!exit())
        {
            return ioexception;
        } else
        {
            InterruptedIOException interruptedioexception = new InterruptedIOException("timeout");
            interruptedioexception.initCause(ioexception);
            return interruptedioexception;
        }
    }

    final void exit(boolean flag)
    {
        if (exit() && flag)
        {
            throw new InterruptedIOException("timeout");
        } else
        {
            return;
        }
    }

    public final boolean exit()
    {
        if (!inQueue)
        {
            return false;
        } else
        {
            inQueue = false;
            return cancelScheduledTimeout(this);
        }
    }

    public final hzv sink(hzv hzv)
    {
        return new hzv(hzv) {

            final hzv a;
            final hzc b;

            public final void close()
            {
                b.enter();
                a.close();
                b.exit(true);
                return;
                Object obj;
                obj;
                throw b.exit(((IOException) (obj)));
                obj;
                b.exit(false);
                throw obj;
            }

            public final void flush()
            {
                b.enter();
                a.flush();
                b.exit(true);
                return;
                Object obj;
                obj;
                throw b.exit(((IOException) (obj)));
                obj;
                b.exit(false);
                throw obj;
            }

            public final hzx timeout()
            {
                return b;
            }

            public final String toString()
            {
                return (new StringBuilder("AsyncTimeout.sink(")).append(a).append(")").toString();
            }

            public final void write(hzf hzf, long l)
            {
                b.enter();
                a.write(hzf, l);
                b.exit(true);
                return;
                hzf;
                throw b.exit(hzf);
                hzf;
                b.exit(false);
                throw hzf;
            }

            
            {
                b = hzc.this;
                a = hzv1;
                super();
            }
        };
    }

    public final hzw source(hzw hzw)
    {
        return new hzw(hzw) {

            final hzw a;
            final hzc b;

            public final void close()
            {
                a.close();
                b.exit(true);
                return;
                Object obj;
                obj;
                throw b.exit(((IOException) (obj)));
                obj;
                b.exit(false);
                throw obj;
            }

            public final long read(hzf hzf, long l)
            {
                b.enter();
                l = a.read(hzf, l);
                b.exit(true);
                return l;
                hzf;
                throw b.exit(hzf);
                hzf;
                b.exit(false);
                throw hzf;
            }

            public final hzx timeout()
            {
                return b;
            }

            public final String toString()
            {
                return (new StringBuilder("AsyncTimeout.source(")).append(a).append(")").toString();
            }

            
            {
                b = hzc.this;
                a = hzw1;
                super();
            }
        };
    }

    public void timedOut()
    {
    }

}
