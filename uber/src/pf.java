// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class pf extends rj
{

    private static List b = new ArrayList();
    private boolean c;
    private boolean d;
    private Set e;
    private boolean f;
    private volatile boolean g;
    private boolean h;

    public pf(qi qi1)
    {
        super(qi1);
        e = new HashSet();
    }

    public static pf a(Context context)
    {
        return qi.a(context).j();
    }

    private void b(boolean flag)
    {
        f = flag;
    }

    public static void c()
    {
        pf;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        pf;
        JVM INSTR monitorexit ;
        throw exception;
        b = null;
        pf;
        JVM INSTR monitorexit ;
    }

    private void m()
    {
        qe qe1 = o();
        if (qe1.d())
        {
            n().a(qe1.e());
        }
        if (qe1.h())
        {
            b(qe1.i());
        }
        if (qe1.d())
        {
            pj pj1 = pv.a();
            if (pj1 != null)
            {
                pj1.a(qe1.e());
            }
        }
    }

    private static pj n()
    {
        return pv.a();
    }

    private qe o()
    {
        return g().k();
    }

    public final pk a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new pk(g(), s);
        s.D();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a()
    {
        m();
        c = true;
    }

    public final void a(pj pj1)
    {
        pv.a(pj1);
        if (!h)
        {
            Log.i((String)re.c.a(), (new StringBuilder("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.")).append((String)re.c.a()).append(" DEBUG").toString());
            h = true;
        }
    }

    public final boolean b()
    {
        return c && !d;
    }

    public final boolean d()
    {
        return f;
    }

    public final boolean e()
    {
        return g;
    }

    public final String f()
    {
        wn.c("getClientId can not be called from the main thread");
        return g().o().b();
    }

}
