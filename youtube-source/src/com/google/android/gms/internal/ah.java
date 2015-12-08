// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ap, av, do, ag

final class ah
    implements Runnable
{

    final ap a;
    final ag b;

    ah(ag ag, ap ap1)
    {
        b = ag;
        a = ap1;
        super();
    }

    public final void run()
    {
        try
        {
            a.c.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.do.a("Could not destroy mediation adapter.", remoteexception);
        }
    }
}
