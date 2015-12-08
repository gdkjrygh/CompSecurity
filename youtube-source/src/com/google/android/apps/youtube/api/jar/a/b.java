// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.RemoteException;
import com.google.android.youtube.player.internal.RuntimeRemoteException;
import com.google.android.youtube.player.internal.s;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            a

final class b
    implements Runnable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        if (com.google.android.apps.youtube.api.jar.a.a.a(a) == null || !a.d())
        {
            break MISSING_BLOCK_LABEL_32;
        }
        com.google.android.apps.youtube.api.jar.a.a.a(a).a();
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new RuntimeRemoteException(remoteexception);
    }
}
