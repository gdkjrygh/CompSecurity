// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.RemoteException;
import com.google.android.youtube.player.internal.RuntimeRemoteException;
import com.google.android.youtube.player.internal.m;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            a

final class f
    implements Runnable
{

    final boolean a;
    final a b;

    f(a a1, boolean flag)
    {
        b = a1;
        a = flag;
        super();
    }

    public final void run()
    {
        if (com.google.android.apps.youtube.api.jar.a.a.c(b) == null || !b.d())
        {
            break MISSING_BLOCK_LABEL_36;
        }
        com.google.android.apps.youtube.api.jar.a.a.c(b).a(a);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new RuntimeRemoteException(remoteexception);
    }
}
