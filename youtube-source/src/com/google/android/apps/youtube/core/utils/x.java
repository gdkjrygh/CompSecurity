// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            w

final class x
    implements ServiceConnection
{

    final w a;

    x(w w1)
    {
        a = w1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (w.a(a))
        {
            w.a(a, (Binder)ibinder);
            a.b(w.b(a));
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        if (!w.a(a))
        {
            w.a(a, null);
        }
    }
}
