// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            fq, gi, fo, ff, 
//            fi, fm, fn, fz, 
//            fj, fr, fl, fg, 
//            fy

public abstract class fd
    implements b, fq
{

    public static final String d[] = {
        "service_esmobile", "service_googleme"
    };
    final Handler a;
    boolean b;
    boolean c;
    private final Context e;
    private IInterface f;
    private final ArrayList g;
    private fl h;
    private final String i[];
    private final fo j;
    private final Object k;

    private transient fd(Context context, com.google.android.gms.common.api.b b1, c c1, String as[])
    {
        g = new ArrayList();
        b = false;
        c = false;
        k = new Object();
        e = (Context)gi.a(context);
        j = new fo(this, null);
        a = new ff(this, context.getMainLooper());
        i = as;
        context = (com.google.android.gms.common.api.b)gi.a(b1);
        j.a(context);
        context = (c)gi.a(c1);
        j.a(context);
    }

    protected transient fd(Context context, com.google.android.gms.common.c c1, d d1, String as[])
    {
        this(context, ((com.google.android.gms.common.api.b) (new fi(c1))), ((c) (new fm(d1))), as);
    }

    static IInterface a(fd fd1, IInterface iinterface)
    {
        fd1.f = iinterface;
        return iinterface;
    }

    static fl a(fd fd1, fl fl1)
    {
        fd1.h = null;
        return null;
    }

    static fo a(fd fd1)
    {
        return fd1.j;
    }

    static Object b(fd fd1)
    {
        return fd1.k;
    }

    static ArrayList c(fd fd1)
    {
        return fd1.g;
    }

    static IInterface d(fd fd1)
    {
        return fd1.f;
    }

    static fl e(fd fd1)
    {
        return fd1.h;
    }

    static Context f(fd fd1)
    {
        return fd1.e;
    }

    protected abstract IInterface a(IBinder ibinder);

    protected abstract String a();

    protected final void a(int l, IBinder ibinder, Bundle bundle)
    {
        a.sendMessage(a.obtainMessage(1, new fn(this, l, ibinder, bundle)));
    }

    public final void a(com.google.android.gms.common.c c1)
    {
        j.a(new fi(c1));
    }

    protected abstract void a(fy fy, fj fj1);

    protected abstract String b();

    protected final void b(IBinder ibinder)
    {
        try
        {
            a(fz.a(ibinder), new fj(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "service died");
        }
    }

    public final void b(com.google.android.gms.common.c c1)
    {
        j.b(new fi(c1));
    }

    public final void d()
    {
        b = true;
        int l;
        synchronized (k)
        {
            c = true;
        }
        l = com.google.android.gms.common.e.a(e);
        if (l != 0)
        {
            a.sendMessage(a.obtainMessage(3, Integer.valueOf(l)));
        } else
        {
            if (h != null)
            {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
                f = null;
                fr.a(e).b(a(), h);
            }
            h = new fl(this);
            if (!fr.a(e).a(a(), h))
            {
                Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(a()).toString());
                a.sendMessage(a.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    public final boolean e()
    {
        return f != null;
    }

    public final boolean f()
    {
        boolean flag;
        synchronized (k)
        {
            flag = c;
        }
        return flag;
    }

    public final void g()
    {
        b = false;
        int l;
        int i1;
        synchronized (k)
        {
            c = false;
        }
        obj = g;
        obj;
        JVM INSTR monitorenter ;
        i1 = g.size();
        l = 0;
_L2:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((fg)g.get(l)).c();
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        g.clear();
        obj;
        JVM INSTR monitorexit ;
        f = null;
        if (h != null)
        {
            fr.a(e).b(a(), h);
            h = null;
            j.a(-1);
        }
        return;
        Exception exception1;
        exception1;
        throw exception1;
    }

    public final Context h()
    {
        return e;
    }

    protected final void i()
    {
        if (!e())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    protected final IInterface j()
    {
        i();
        return f;
    }

    public final boolean k()
    {
        return b;
    }

}
