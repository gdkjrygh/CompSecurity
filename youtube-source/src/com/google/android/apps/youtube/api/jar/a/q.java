// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.RemoteException;
import com.google.android.youtube.player.internal.RuntimeRemoteException;
import com.google.android.youtube.player.internal.p;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            a

final class q
    implements Runnable
{

    final com.google.android.youtube.player.YouTubePlayer.ErrorReason a;
    final a b;

    q(a a1, com.google.android.youtube.player.YouTubePlayer.ErrorReason errorreason)
    {
        b = a1;
        a = errorreason;
        super();
    }

    public final void run()
    {
        if (com.google.android.apps.youtube.api.jar.a.a.b(b) == null || !b.d())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        com.google.android.apps.youtube.api.jar.a.a.b(b).b(a.name());
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new RuntimeRemoteException(remoteexception);
    }
}
