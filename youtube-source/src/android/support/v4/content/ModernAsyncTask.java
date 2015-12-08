// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package android.support.v4.content:
//            k, m

abstract class ModernAsyncTask
{

    public static final Executor a;
    private static final ThreadFactory b;
    private static final BlockingQueue c;
    private static final m d = new m((byte)0);
    private static volatile Executor e;
    private final FutureTask f;
    private volatile Status g;

    protected static transient void a()
    {
    }

    static void a(ModernAsyncTask modernasynctask, Object obj)
    {
        modernasynctask.f.isCancelled();
        modernasynctask.g = Status.FINISHED;
    }

    static 
    {
        b = new k();
        c = new LinkedBlockingQueue(10);
        a = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, c, b);
        e = a;
    }

    private class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(android/support/v4/content/ModernAsyncTask$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            PENDING = new Status("PENDING", 0);
            RUNNING = new Status("RUNNING", 1);
            FINISHED = new Status("FINISHED", 2);
            $VALUES = (new Status[] {
                PENDING, RUNNING, FINISHED
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }

}
