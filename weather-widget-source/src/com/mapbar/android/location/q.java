// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.mapbar.android.location:
//            r, p

public abstract class q
{
    static final class a extends Handler
    {

        public final void handleMessage(Message message)
        {
            p p1 = (p)message.obj;
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                q.a(p1.a, p1.b[0]);
                return;

            case 2: // '\002'
                message = p1.a;
                message = ((Message) (p1.b));
                q.b();
                return;

            case 3: // '\003'
                message = p1.a;
                break;
            }
            q.c();
        }

        a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b[] a()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("PENDING", 0);
            b = new b("RUNNING", 1);
            c = new b("FINISHED", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }

    static abstract class c
        implements Callable
    {

        Object a[];

        c()
        {
            this((byte)0);
        }

        private c(byte byte0)
        {
        }
    }


    private static final LinkedBlockingQueue a;
    private static final ThreadFactory b;
    private static final ThreadPoolExecutor c;
    private static final a d = new a();
    private final c e = new c() {

        private q b;

        public final Object call()
        {
            try
            {
                Process.setThreadPriority(10);
                q q1 = b;
                Object aobj[] = a;
                q1.a();
            }
            catch (Exception exception) { }
            return null;
        }

            
            {
                b = q.this;
                super();
            }
    };
    private final FutureTask f;
    private volatile b g;

    public q()
    {
        g = b.a;
        f = new FutureTask(e) {

            private q a;

            protected final void done()
            {
                Object obj = null;
                Object obj2 = get();
                obj = obj2;
_L2:
                q.d().obtainMessage(1, new p(a, new Object[] {
                    obj
                })).sendToTarget();
                return;
                InterruptedException interruptedexception;
                interruptedexception;
                Log.w("CellTaskEx", interruptedexception);
                if (true) goto _L2; else goto _L1
_L1:
                Object obj1;
                obj1;
                throw new RuntimeException("An error occured while executing doInBackground()", ((ExecutionException) (obj1)).getCause());
                obj1;
                q.d().obtainMessage(3, new p(a, null)).sendToTarget();
                return;
                obj1;
                throw new RuntimeException("An error occured while executing doInBackground()", ((Throwable) (obj1)));
            }

            
            {
                a = q.this;
                super(callable);
            }
        };
    }

    static void a(q q1, Object obj)
    {
        q1.g = b.c;
    }

    protected static transient void b()
    {
    }

    protected static void c()
    {
    }

    static a d()
    {
        return d;
    }

    public final transient q a(Object aobj[])
    {
        if (g == b.a) goto _L2; else goto _L1
_L1:
        static final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[b.a().length];
                try
                {
                    a[b.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[g.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 71
    //                   2 81;
           goto _L2 _L3 _L4
_L2:
        g = b.b;
        e.a = aobj;
        c.execute(f);
        return this;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    protected transient abstract Object a();

    public final boolean a(boolean flag)
    {
        try
        {
            flag = f.cancel(true);
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    static 
    {
        a = new LinkedBlockingQueue();
        b = new r();
        c = new ThreadPoolExecutor(2, 2, 10L, TimeUnit.SECONDS, a, b);
    }

    // Unreferenced inner class com/mapbar/android/location/r
    static final class r
        implements ThreadFactory
    {

        private final AtomicInteger a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder()).append("CellTaskEx #").append(a.getAndIncrement()).toString());
        }

            r()
            {
            }
    }

}
