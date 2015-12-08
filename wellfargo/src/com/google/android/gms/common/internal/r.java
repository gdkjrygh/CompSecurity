// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            au, am, m

public final class r
    implements ServiceConnection
{

    final m a;
    private final int b;

    public r(m m1, int i)
    {
        a = m1;
        super();
        b = i;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        au.a(ibinder, "Expecting a valid IBinder");
        m.a(a, am.a(ibinder));
        a.c(b);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a.a.sendMessage(a.a.obtainMessage(4, b, 1));
    }
}
