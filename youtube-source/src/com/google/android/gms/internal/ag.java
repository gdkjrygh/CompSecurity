// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            do, aj, ai, ap, 
//            am, ce, dn, ah, 
//            at

public final class ag
{

    private final ce a;
    private final at b;
    private final Context c;
    private final Object d = new Object();
    private final aj e;
    private boolean f;
    private am g;

    public ag(Context context, ce ce1, at at, aj aj1)
    {
        f = false;
        c = context;
        a = ce1;
        b = at;
        e = aj1;
    }

    public final ap a(long l, long l1)
    {
        Iterator iterator;
        com.google.android.gms.internal.do.a("Starting mediation.");
        iterator = e.a.iterator();
_L4:
        ai ai1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_246;
        }
        ai1 = (ai)iterator.next();
        com.google.android.gms.internal.do.b((new StringBuilder("Trying mediation network: ")).append(ai1.b).toString());
        iterator1 = ai1.c.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            ap ap1;
            synchronized (d)
            {
                if (!f)
                {
                    break label0;
                }
                ap1 = new ap(-1);
            }
            return ap1;
        }
        g = new am(c, s, b, e, ai1, a.hu, a.eq, a.en);
        obj;
        JVM INSTR monitorexit ;
        obj = g.a(l, 60000L);
        if (((ap) (obj)).a == 0)
        {
            com.google.android.gms.internal.do.a("Adapter succeeded.");
            return ((ap) (obj));
        }
        break MISSING_BLOCK_LABEL_218;
        exception;
        throw exception;
        if (((ap) (obj)).c != null)
        {
            dn.a.post(new ah(this, ((ap) (obj))));
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new ap(1);
    }

    public final void a()
    {
        synchronized (d)
        {
            f = true;
            if (g != null)
            {
                g.a();
            }
        }
    }
}
