// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.internal:
//            ci, cl, ce, cz, 
//            cg, ch, do, cp

public final class ck extends ci
    implements c, d
{

    private final ch a;
    private final cl b;
    private final Object c = new Object();

    public ck(Context context, ce ce1, ch ch1)
    {
        super(ce1, ch1);
        a = ch1;
        b = new cl(context, this, this, ce1.en.iO);
        b.d();
    }

    public final void a(a a1)
    {
        a.a(new cg(0));
    }

    public final void b()
    {
        com.google.android.gms.internal.do.a("Disconnected from remote ad request service.");
    }

    public final void c()
    {
        synchronized (c)
        {
            if (b.e() || b.f())
            {
                b.g();
            }
        }
    }

    public final cp d()
    {
        obj;
        JVM INSTR monitorenter ;
        cp cp;
        IllegalStateException illegalstateexception;
        synchronized (c)
        {
            cp = b.c();
        }
        return cp;
        illegalstateexception;
        return null;
    }

    public final void u_()
    {
        e();
    }
}
