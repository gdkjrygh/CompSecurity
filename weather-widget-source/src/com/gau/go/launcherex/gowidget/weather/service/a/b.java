// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service.a:
//            c, d, e, h, 
//            a, j, f, g

public final class b
    implements android.os.Handler.Callback
{

    private static b a;
    private final Executor b = Executors.newFixedThreadPool(1);
    private final Handler c = new Handler(Looper.getMainLooper(), this);
    private final List d = new ArrayList();
    private final List e = new ArrayList();

    private b()
    {
    }

    static b a()
    {
        return b();
    }

    public static void a(a a1)
    {
        a(((Runnable) (new c(a1))));
    }

    public static void a(a a1, Executor executor)
    {
        a(((Runnable) (new d(a1, executor))));
    }

    static void a(b b1, a a1)
    {
        b1.b(a1);
    }

    static void a(b b1, a a1, Executor executor)
    {
        b1.b(a1, executor);
    }

    static void a(b b1, g g1)
    {
        b1.c(g1);
    }

    public static void a(g g1)
    {
        a(((Runnable) (new e(g1))));
    }

    public static final void a(Runnable runnable)
    {
        if (c())
        {
            runnable.run();
            return;
        } else
        {
            h.a().post(runnable);
            return;
        }
    }

    public static final void a(Runnable runnable, long l)
    {
        if (c())
        {
            runnable.run();
            return;
        } else
        {
            h.a().postDelayed(runnable, l);
            return;
        }
    }

    private static b b()
    {
        if (!c())
        {
            throw new IllegalStateException("should call on UI thread...");
        }
        if (a == null)
        {
            a = new b();
        }
        return a;
    }

    private void b(a a1)
    {
        Message message = Message.obtain();
        message.what = 2;
        message.obj = a1;
        c.sendMessage(message);
    }

    private void b(a a1, Executor executor)
    {
        while (a1 == null || e.contains(a1)) 
        {
            return;
        }
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            if (((a)iterator.next()).a(a1))
            {
                return;
            }
        }

        e.add(a1);
        c(a1);
        Executor executor1 = executor;
        if (executor == null)
        {
            executor1 = b;
        }
        executor1.execute(new j(this, a1));
    }

    static void b(b b1, g g1)
    {
        b1.d(g1);
    }

    public static void b(g g1)
    {
        a(new f(g1));
    }

    private void c(a a1)
    {
        for (Iterator iterator = (new ArrayList(d)).iterator(); iterator.hasNext(); ((g)iterator.next()).a(a1)) { }
    }

    private void c(g g1)
    {
        if (d.contains(g1))
        {
            throw new IllegalStateException((new StringBuilder()).append(g1.toString()).append("had be added before, did you forget to call removeObserver()?").toString());
        } else
        {
            d.add(g1);
            return;
        }
    }

    private static boolean c()
    {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    private void d(a a1)
    {
        for (Iterator iterator = (new ArrayList(d)).iterator(); iterator.hasNext(); ((g)iterator.next()).c(a1)) { }
    }

    private void d(g g1)
    {
        d.remove(g1);
    }

    private void e(a a1)
    {
        for (Iterator iterator = (new ArrayList(d)).iterator(); iterator.hasNext(); ((g)iterator.next()).b(a1)) { }
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            d((a)message.obj);
            return true;

        case 2: // '\002'
            message = (a)message.obj;
            break;
        }
        e.remove(message);
        e(message);
        return true;
    }
}
