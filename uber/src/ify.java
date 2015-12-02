// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class ify extends icj
    implements icl
{

    public static final int b = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();
    private static final boolean e;
    private static final ConcurrentHashMap f = new ConcurrentHashMap();
    private static final AtomicReference g = new AtomicReference();
    private static volatile Object h;
    private static final Object i = new Object();
    volatile boolean a;
    private final ScheduledExecutorService c;
    private final iib d = iia.a().d();

    public ify(ThreadFactory threadfactory)
    {
        threadfactory = Executors.newScheduledThreadPool(1, threadfactory);
        if (!a(threadfactory) && (threadfactory instanceof ScheduledThreadPoolExecutor))
        {
            a((ScheduledThreadPoolExecutor)threadfactory);
        }
        c = threadfactory;
    }

    public static void a(ScheduledThreadPoolExecutor scheduledthreadpoolexecutor)
    {
        do
        {
            if ((ScheduledExecutorService)g.get() != null)
            {
                break;
            }
            ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(1, new igh("RxSchedulerPurge-"));
            if (!g.compareAndSet(null, scheduledexecutorservice))
            {
                continue;
            }
            scheduledexecutorservice.scheduleAtFixedRate(new Runnable() {

                public final void run()
                {
                    ify.d();
                }

            }, b, b, TimeUnit.MILLISECONDS);
            break;
        } while (true);
        f.putIfAbsent(scheduledthreadpoolexecutor, scheduledthreadpoolexecutor);
    }

    public static boolean a(ScheduledExecutorService scheduledexecutorservice)
    {
        if (!e)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        Object obj;
        if (scheduledexecutorservice instanceof ScheduledThreadPoolExecutor)
        {
            obj = h;
            if (obj == i)
            {
                return false;
            }
            if (obj == null)
            {
                obj = c(scheduledexecutorservice);
                Object obj1;
                if (obj != null)
                {
                    obj1 = obj;
                } else
                {
                    obj1 = i;
                }
                h = obj1;
            } else
            {
                obj = (Method)obj;
            }
        } else
        {
            obj = c(scheduledexecutorservice);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        ((Method) (obj)).invoke(scheduledexecutorservice, new Object[] {
            Boolean.valueOf(true)
        });
        return true;
        scheduledexecutorservice;
        iia.a().b();
        return false;
    }

    private static void b(ScheduledExecutorService scheduledexecutorservice)
    {
        f.remove(scheduledexecutorservice);
    }

    private static Method c(ScheduledExecutorService scheduledexecutorservice)
    {
        scheduledexecutorservice = scheduledexecutorservice.getClass().getMethods();
        int k = scheduledexecutorservice.length;
        for (int j = 0; j < k; j++)
        {
            Method method = scheduledexecutorservice[j];
            if (!method.getName().equals("setRemoveOnCancelPolicy"))
            {
                continue;
            }
            Class aclass[] = method.getParameterTypes();
            if (aclass.length == 1 && aclass[0] == Boolean.TYPE)
            {
                return method;
            }
        }

        return null;
    }

    static void d()
    {
_L1:
        Object obj;
label0:
        {
            try
            {
                ScheduledThreadPoolExecutor scheduledthreadpoolexecutor;
                for (obj = f.keySet().iterator(); ((Iterator) (obj)).hasNext(); scheduledthreadpoolexecutor.purge())
                {
                    scheduledthreadpoolexecutor = (ScheduledThreadPoolExecutor)((Iterator) (obj)).next();
                    if (scheduledthreadpoolexecutor.isShutdown())
                    {
                        break label0;
                    }
                }

            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                icw.a(((Throwable) (obj)));
                iia.a().b();
            }
            return;
        }
        ((Iterator) (obj)).remove();
          goto _L1
    }

    public final icl a(idd idd)
    {
        return a(idd, 0L, null);
    }

    public final icl a(idd idd, long l, TimeUnit timeunit)
    {
        if (a)
        {
            return ijd.b();
        } else
        {
            return b(idd, l, timeunit);
        }
    }

    public final ifz a(idd idd, long l, TimeUnit timeunit, iiy iiy1)
    {
        ifz ifz1 = new ifz(iib.a(idd), iiy1);
        iiy1.a(ifz1);
        if (l <= 0L)
        {
            idd = c.submit(ifz1);
        } else
        {
            idd = c.schedule(ifz1, l, timeunit);
        }
        ifz1.a(idd);
        return ifz1;
    }

    public final ifz a(idd idd, igm igm1)
    {
        ifz ifz1 = new ifz(iib.a(idd), igm1);
        igm1.a(ifz1);
        if (0L <= 0L)
        {
            idd = c.submit(ifz1);
        } else
        {
            idd = c.schedule(ifz1, 0L, null);
        }
        ifz1.a(idd);
        return ifz1;
    }

    public final ifz b(idd idd, long l, TimeUnit timeunit)
    {
        ifz ifz1 = new ifz(iib.a(idd));
        if (l <= 0L)
        {
            idd = c.submit(ifz1);
        } else
        {
            idd = c.schedule(ifz1, l, timeunit);
        }
        ifz1.a(idd);
        return ifz1;
    }

    public final void b()
    {
        a = true;
        c.shutdownNow();
        b(c);
    }

    public final boolean c()
    {
        return a;
    }

    static 
    {
        boolean flag = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int j = igf.b();
        if (!flag && (j == 0 || j >= 21))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }
}
