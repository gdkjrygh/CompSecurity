// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.f;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            q, r, ai, am, 
//            aj

class at
    implements q, r
{

    final ai a;

    private at(ai ai1)
    {
        a = ai1;
        super();
    }

    at(ai ai1, aj aj)
    {
        this(ai1);
    }

    public void a(int i)
    {
    }

    public void a(Bundle bundle)
    {
        com.google.android.gms.common.api.ai.f(a).a(new am(a));
    }

    public void a(ConnectionResult connectionresult)
    {
        ai.c(a).lock();
        if (!ai.b(a, connectionresult)) goto _L2; else goto _L1
_L1:
        ai.i(a);
        ai.j(a);
_L4:
        ai.c(a).unlock();
        return;
_L2:
        ai.a(a, connectionresult);
        if (true) goto _L4; else goto _L3
_L3:
        connectionresult;
        ai.c(a).unlock();
        throw connectionresult;
    }
}
