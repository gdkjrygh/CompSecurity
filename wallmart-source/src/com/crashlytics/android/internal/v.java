// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.crashlytics.android.internal:
//            p, B, m, y, 
//            r, u, q, w, 
//            b

public final class v extends p
{

    private b a;
    private AtomicReference b;
    private boolean c;
    private File d;
    private Application e;
    private WeakReference f;
    private String g;
    private int h;
    private ConcurrentHashMap i;

    v()
    {
        b = new AtomicReference();
        h = 4;
        a = new B(m.a);
        i = new ConcurrentHashMap();
    }

    public static v a()
    {
        return y.a();
    }

    private v a(Activity activity)
    {
        f = new WeakReference(activity);
        return this;
    }

    static v a(v v1, Activity activity)
    {
        return v1.a(activity);
    }

    public static transient void a(Context context, u au[])
    {
        com/crashlytics/android/internal/v;
        JVM INSTR monitorenter ;
        boolean flag = y.a().isInitialized();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/crashlytics/android/internal/v;
        JVM INSTR monitorexit ;
        return;
_L2:
        v v1;
        int k;
        v1 = y.a();
        v1.e = r.b(context);
        v1 = v1.a(r.a(context));
        k = au.length;
        u u1;
        for (int j = 0; j >= k; j++)
        {
            break MISSING_BLOCK_LABEL_87;
        }

        u1 = au[j];
        if (!v1.i.containsKey(au))
        {
            v1.i.putIfAbsent(u1.getClass(), u1);
        }
        break MISSING_BLOCK_LABEL_101;
        v1.a(context);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final u a(Class class1)
    {
        return (u)i.get(class1);
    }

    public final void a(q q1)
    {
        b.set(q1);
    }

    public final void a(String s)
    {
        g = s;
    }

    public final void a(boolean flag)
    {
        c = flag;
        int j;
        if (flag)
        {
            j = 3;
        } else
        {
            j = 4;
        }
        h = j;
    }

    public final q b()
    {
        q q1 = (q)b.get();
        Object obj = q1;
        if (q1 == null)
        {
            r r1 = new r();
            obj = r1;
            if (!b.compareAndSet(null, r1))
            {
                obj = (q)b.get();
            }
        }
        return ((q) (obj));
    }

    protected final void c()
    {
        Context context = getContext();
        d = new File(context.getFilesDir(), "com.crashlytics.sdk.android");
        if (!d.exists())
        {
            d.mkdirs();
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            w.a(new w(this, (byte)0), e);
        }
        if (c && Log.isLoggable("CrashlyticsInternal", 3))
        {
            StringBuilder stringbuilder = new StringBuilder();
            p p1;
            long l;
            for (Iterator iterator1 = i.values().iterator(); iterator1.hasNext(); stringbuilder.append("sdkPerfStart.").append(p1.getClass().getName()).append('=').append(System.nanoTime() - l).append('\n'))
            {
                p1 = (p)iterator1.next();
                l = System.nanoTime();
                p1.a(context);
            }

            Log.d("CrashlyticsInternal", stringbuilder.toString());
        } else
        {
            Iterator iterator = i.values().iterator();
            while (iterator.hasNext()) 
            {
                ((p)iterator.next()).a(context);
            }
        }
    }

    public final Application d()
    {
        return e;
    }

    public final Activity e()
    {
        if (f != null)
        {
            return (Activity)f.get();
        } else
        {
            return null;
        }
    }

    public final boolean f()
    {
        return c;
    }

    public final int g()
    {
        return h;
    }

    public final String getVersion()
    {
        return "1.1.13.29";
    }

    public final File h()
    {
        return d;
    }

    public final String i()
    {
        return g;
    }
}
