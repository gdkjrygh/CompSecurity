// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintStream;
import java.util.Queue;

public final class igg
    implements icl
{

    static int b;
    public static final int c;
    private static final idv d = idv.a();
    private static ige h = new ige() {

        private static ihh c()
        {
            return new ihh(igg.c);
        }

        protected final Object b()
        {
            return c();
        }

    };
    private static ige i = new ige() {

        private static igz c()
        {
            return new igz(igg.c);
        }

        protected final Object b()
        {
            return c();
        }

    };
    public volatile Object a;
    private Queue e;
    private final int f;
    private final ige g;

    igg()
    {
        this(((Queue) (new ign(c))), c);
    }

    private igg(ige ige1, int j)
    {
        g = ige1;
        e = (Queue)ige1.a();
        f = j;
    }

    private igg(Queue queue, int j)
    {
        e = queue;
        g = null;
        f = j;
    }

    public static igg a()
    {
        if (iho.a())
        {
            return new igg(h, c);
        } else
        {
            return new igg();
        }
    }

    public static boolean a(Object obj, icg icg)
    {
        return idv.a(icg, obj);
    }

    public static boolean b(Object obj)
    {
        return idv.b(obj);
    }

    public static igg d()
    {
        if (iho.a())
        {
            return new igg(i, c);
        } else
        {
            return new igg();
        }
    }

    public final void a(Object obj)
    {
        boolean flag = true;
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Queue queue = e;
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (queue.offer(idv.a(obj)))
        {
            flag = false;
        }
_L1:
        this;
        JVM INSTR monitorexit ;
        if (flag1)
        {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        break MISSING_BLOCK_LABEL_64;
        flag1 = true;
        flag = false;
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (flag)
        {
            throw new icx();
        } else
        {
            return;
        }
    }

    public final void b()
    {
        e();
    }

    public final boolean c()
    {
        return e == null;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        Queue queue;
        ige ige1;
        queue = e;
        ige1 = g;
        if (ige1 == null || queue == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        queue.clear();
        e = null;
        ige1.a(queue);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void f()
    {
        if (a == null)
        {
            a = idv.b();
        }
    }

    public final boolean g()
    {
        Queue queue = e;
        if (queue == null)
        {
            return true;
        } else
        {
            return queue.isEmpty();
        }
    }

    public final Object h()
    {
        this;
        JVM INSTR monitorenter ;
        Queue queue = e;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        Object obj;
        Object obj1;
        obj = queue.poll();
        obj1 = a;
        if (obj != null || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (queue.peek() != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a = null;
        obj = obj1;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        b = 128;
        if (igf.a())
        {
            b = 16;
        }
        String s = System.getProperty("rx.ring-buffer.size");
        if (s != null)
        {
            try
            {
                b = Integer.parseInt(s);
            }
            catch (Exception exception)
            {
                System.err.println((new StringBuilder("Failed to set 'rx.buffer.size' with value ")).append(s).append(" => ").append(exception.getMessage()).toString());
            }
        }
        c = b;
    }
}
