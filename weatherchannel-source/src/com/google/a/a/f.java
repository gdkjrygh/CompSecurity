// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.a.a:
//            e, a, l, i, 
//            j

public class f extends e
{
    class a
    {

        final f a;
        private String b;
        private boolean c;

        public String a()
        {
            return b;
        }

        public boolean b()
        {
            return c;
        }

        public a(String s, boolean flag)
        {
            a = f.this;
            super();
            b = s;
            c = flag;
        }
    }

    private static final class b
        implements Runnable
    {

        private Context a;

        public void run()
        {
            com/google/a/a/f;
            JVM INSTR monitorenter ;
            if (f.f() == null)
            {
                AdvertisingIdClient advertisingidclient = new AdvertisingIdClient(a);
                advertisingidclient.start();
                f.a(advertisingidclient);
            }
            f.g().countDown();
_L1:
            com/google/a/a/f;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            obj;
            f.a(true);
            f.g().countDown();
              goto _L1
            obj;
            com/google/a/a/f;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            f.g().countDown();
              goto _L1
            obj;
            f.g().countDown();
              goto _L1
            obj;
            f.g().countDown();
            throw obj;
        }

        public b(Context context)
        {
            a = context.getApplicationContext();
            if (a == null)
            {
                a = context;
            }
        }
    }


    private static AdvertisingIdClient e = null;
    private static CountDownLatch f = new CountDownLatch(1);
    private static volatile boolean g;
    private boolean h;

    protected f(Context context, i i, j j, boolean flag)
    {
        super(context, i, j);
        h = flag;
    }

    public static f a(String s, Context context)
    {
        return a(s, context, true);
    }

    public static f a(String s, Context context, boolean flag)
    {
        com.google.a.a.a a1;
        a1 = new com.google.a.a.a();
        a(s, context, ((i) (a1)));
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/a/a/f;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            (new Thread(new b(context))).start();
        }
        com/google/a/a/f;
        JVM INSTR monitorexit ;
_L2:
        return new f(context, a1, new l(239), flag);
        s;
        com/google/a/a/f;
        JVM INSTR monitorexit ;
        throw s;
    }

    static AdvertisingIdClient a(AdvertisingIdClient advertisingidclient)
    {
        e = advertisingidclient;
        return advertisingidclient;
    }

    static boolean a(boolean flag)
    {
        g = flag;
        return flag;
    }

    static AdvertisingIdClient f()
    {
        return e;
    }

    static CountDownLatch g()
    {
        return f;
    }

    protected void b(Context context)
    {
        super.b(context);
        if (g || !h)
        {
            a(24, d(context));
            return;
        }
        String s;
        context = e();
        s = context.a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        long l1;
        if (context.b())
        {
            l1 = 1L;
        } else
        {
            l1 = 0L;
        }
        try
        {
            a(28, l1);
            a(26, 5L);
            a(24, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
    }

    a e()
        throws IOException
    {
label0:
        {
            a a1;
            try
            {
                if (f.await(2L, TimeUnit.SECONDS))
                {
                    break label0;
                }
                a1 = new a(null, false);
            }
            catch (InterruptedException interruptedexception)
            {
                return new a(null, false);
            }
            return a1;
        }
        com/google/a/a/f;
        JVM INSTR monitorenter ;
        Object obj;
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        obj = new a(null, false);
        com/google/a/a/f;
        JVM INSTR monitorexit ;
        return ((a) (obj));
        Exception exception;
        exception;
        com/google/a/a/f;
        JVM INSTR monitorexit ;
        throw exception;
        exception = e.getInfo();
        com/google/a/a/f;
        JVM INSTR monitorexit ;
        return new a(a(exception.getId()), exception.isLimitAdTrackingEnabled());
    }

}
