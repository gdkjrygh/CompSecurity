// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            de, cp, do, cg, 
//            ch, ce

public abstract class ci extends de
{

    private final ce a;
    private final ch b;

    public ci(ce ce, ch ch1)
    {
        a = ce;
        b = ch1;
    }

    private static cg a(cp cp1, ce ce)
    {
        try
        {
            cp1 = cp1.a(ce);
        }
        // Misplaced declaration of an exception variable
        catch (cp cp1)
        {
            com.google.android.gms.internal.do.a("Could not fetch ad response from ad request service.", cp1);
            return null;
        }
        return cp1;
    }

    public final void a()
    {
        Object obj = d();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new cg(0);
_L4:
        c();
        b.a(((cg) (obj)));
        return;
_L2:
        cg cg1 = a(((cp) (obj)), a);
        obj = cg1;
        if (cg1 != null) goto _L4; else goto _L3
_L3:
        obj = new cg(0);
          goto _L4
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public abstract void c();

    public abstract cp d();

    public final void v_()
    {
        c();
    }
}
