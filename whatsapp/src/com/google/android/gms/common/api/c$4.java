// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            c

class Ko
    implements leApiClient.OnConnectionFailedListener
{

    final c Kn;
    final b Ko;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        c.a(Kn).lock();
        if (c.k(Kn) == null || Ko.getPriority() < c.l(Kn))
        {
            c.a(Kn, connectionresult);
            c.b(Kn, Ko.getPriority());
        }
        c.d(Kn);
        c.a(Kn).unlock();
        return;
        connectionresult;
        c.a(Kn).unlock();
        throw connectionresult;
    }

    b(c c1, b b)
    {
        Kn = c1;
        Ko = b;
        super();
    }
}
