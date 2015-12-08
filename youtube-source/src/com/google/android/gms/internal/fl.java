// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            fd, fo

final class fl
    implements ServiceConnection
{

    final fd a;

    fl(fd fd1)
    {
        a = fd1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        a.b(ibinder);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        fd.a(a, null);
        fd.a(a).a(1);
    }
}
