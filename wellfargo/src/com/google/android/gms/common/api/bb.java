// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            r, ax, bh, a

class bb
    implements r
{

    final a a;
    final int b;
    final ax c;

    bb(ax ax1, a a1, int i)
    {
        c = ax1;
        a = a1;
        b = i;
        super();
    }

    public void a(ConnectionResult connectionresult)
    {
        ax.a(c).lock();
        ax.b(c).a(connectionresult, a, b);
        ax.a(c).unlock();
        return;
        connectionresult;
        ax.a(c).unlock();
        throw connectionresult;
    }
}
