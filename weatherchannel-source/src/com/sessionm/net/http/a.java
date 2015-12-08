// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net.http;

import android.content.Context;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.sessionm.net.b;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.sessionm.net.http:
//            c

public class a
    implements com.sessionm.net.a
{

    private static final int cY = 10;
    private static final int cZ = 30;
    private static final int hM = 1;
    private static Class hP;
    private static int hQ = 1;
    private static int hR;
    private ThreadPoolExecutor hN;
    private int hO;

    public a(Context context)
    {
        this(context, false, true, new Object[0]);
    }

    public transient a(Context context, boolean flag, boolean flag1, Object aobj[])
    {
        int i = 1;
        super();
        hO = -1;
        if (aobj.length > 0)
        {
            i = ((Integer)aobj[0]).intValue();
        }
        aobj = new PriorityBlockingQueue(10, new Comparator() {

            final a hS;

            public int a(c c1, c c2)
            {
                return c2.getPriority() - c1.getPriority();
            }

            public int compare(Object obj, Object obj1)
            {
                return a((c)obj, (c)obj1);
            }

            
            {
                hS = a.this;
                super();
            }
        });
        hN = new ThreadPoolExecutor(i, i, 30L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (aobj)));
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            try
            {
                hN.getClass().getMethod("allowCoreThreadTimeOut", new Class[] {
                    Boolean.TYPE
                }).invoke(hN, new Object[] {
                    Boolean.valueOf(true)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[]) { }
        }
        hN.setThreadFactory(new ThreadFactory() {

            final a hS;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                runnable.setName((new StringBuilder()).append("SessionM Thread-").append(a.by()).toString());
                return runnable;
            }

            
            {
                hS = a.this;
                super();
            }
        });
        hN.prestartAllCoreThreads();
        CookieSyncManager.createInstance(context);
    }

    public static void a(Class class1)
    {
        hP = class1;
    }

    static int by()
    {
        int i = hQ;
        hQ = i + 1;
        return i;
    }

    public void a(String s, String s1, String s2, b b, int i, Map map, int j, 
            File file)
    {
        if (hP != null)
        {
            if (Log.isLoggable("SessionM.Request", 3))
            {
                Log.d("SessionM.Request", "http client is using a test request.");
            }
            try
            {
                file = (c)hP.newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException("Error creating test request.", s);
            }
        } else
        {
            file = new c();
        }
        file.G(s);
        file.setMethod(s1);
        file.H(s2);
        file.a(b);
        CookieManager.getInstance().setAcceptCookie(true);
        file.setPriority(i);
        file.e(System.currentTimeMillis());
        i = j;
        if (j == -1)
        {
            i = hO;
        }
        file.setTimeout(i);
        file.c(map);
        if (Log.isLoggable("SessionM.Request", 3))
        {
            Log.d("SessionM.Request", (new StringBuilder()).append("Enqueue request, URL: ").append(s).append(", max pool size: ").append(hN.getMaximumPoolSize()).append(", cur pool size: ").append(hN.getPoolSize()).append(", active threads: ").append(hN.getActiveCount()).toString());
        }
        hN.execute(file);
        hR++;
    }

    public int getRequestCount()
    {
        return hR;
    }

    public void n(int i)
    {
        hO = i;
    }

}
