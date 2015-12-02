// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Build;
import com.ubercab.network.dispatch.DispatchApi;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import retrofit.Callback;
import retrofit.converter.GsonConverter;

public final class gqd
    implements gqm
{

    private final Context a;
    private final bjw b;
    private final Executor c;
    private final Executor d;
    private final List e = new CopyOnWriteArrayList();
    private final List f = new CopyOnWriteArrayList();
    private final Queue g = new ArrayBlockingQueue(1);
    private gqf h;
    private gqn i;
    private DispatchApi j;

    public gqd(Context context, gqf gqf1, bjw bjw, Executor executor, Executor executor1)
    {
        a = context;
        h = gqf1;
        b = bjw;
        c = executor;
        d = executor1;
        a();
        a(this);
    }

    static Queue a(gqd gqd1)
    {
        return gqd1.g;
    }

    static void a(gqd gqd1, gqg gqg1)
    {
        gqd1.d(gqg1);
    }

    static void a(gqd gqd1, gqg gqg1, Callback callback)
    {
        gqd1.a(gqg1, callback);
    }

    private void a(gqg gqg1, Callback callback)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((gqm)iterator.next()).a(gqg1)) { }
        j.request(gqg1.d(), callback);
    }

    static List b(gqd gqd1)
    {
        return gqd1.f;
    }

    private void c(gqg gqg1)
    {
        synchronized (g)
        {
            gqe gqe1 = new gqe(this, gqg1);
            if (!g.isEmpty())
            {
                g.remove();
            }
            g.add(gqe1);
            a(gqg1, gqe1);
        }
        return;
        gqg1;
        queue;
        JVM INSTR monitorexit ;
        throw gqg1;
    }

    private void d(gqg gqg1)
    {
        synchronized (g)
        {
            if (!g.isEmpty() && ((gqe)g.peek()).a() == gqg1)
            {
                g.remove();
            }
        }
        return;
        gqg1;
        queue;
        JVM INSTR monitorexit ;
        throw gqg1;
    }

    public final void a()
    {
        if (i != null)
        {
            String s = i.a().a();
            i.a(new gqx(s));
        }
        i = (gqn)h.a();
        j = (DispatchApi)(new grt(i)).a(new GsonConverter(b)).a(c, d).a().a(com/ubercab/network/dispatch/DispatchApi);
    }

    public final void a(gqg gqg1)
    {
        gqg1 = gqg1.d();
        gqg1.put("device", "android");
        gqg1.put("deviceId", cxf.a(cwt.a(a)));
        gqg1.put("deviceMobileDigits", cwt.d(a));
        gqg1.put("deviceMobileCountryIso2", cwt.e(a));
        gqg1.put("deviceModel", Build.MODEL);
        gqg1.put("deviceOS", android.os.Build.VERSION.RELEASE);
        gqg1.put("deviceSerialNumber", cwt.c());
        gqg1.put("epoch", Long.valueOf(System.currentTimeMillis()));
        gqg1.put("language", cwt.a());
    }

    public final void a(gqk gqk)
    {
        f.add(gqk);
    }

    public final void a(gqm gqm1)
    {
        e.add(gqm1);
    }

    public final void b(gqk gqk)
    {
        f.remove(gqk);
    }

    public final boolean b(gqg gqg1)
    {
label0:
        {
            if (gqg1.a() == gqi.a)
            {
                a(gqg1, new gqe(this, gqg1));
                return true;
            }
            if (gqg1.a() == gqi.b)
            {
                c(gqg1);
                return true;
            }
            if (gqg1.a() != gqi.c)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            synchronized (g)
            {
                if (!g.isEmpty())
                {
                    break label0;
                }
                c(gqg1);
            }
            return true;
        }
        if (!gqg1.b().equals(((gqe)g.peek()).a().b()))
        {
            break MISSING_BLOCK_LABEL_118;
        }
        c(gqg1);
        queue;
        JVM INSTR monitorexit ;
        return true;
        queue;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_128;
        gqg1;
        queue;
        JVM INSTR monitorexit ;
        throw gqg1;
        return false;
    }
}
