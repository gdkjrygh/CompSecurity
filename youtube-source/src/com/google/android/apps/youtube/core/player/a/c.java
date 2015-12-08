// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import com.google.android.apps.youtube.common.L;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.apps.youtube.core.player.a:
//            b, d

final class c
    implements Runnable
{

    final b a;
    private final ExecutorService b = Executors.newFixedThreadPool(2);

    public c(b b1)
    {
        a = b1;
        super();
    }

    public final void run()
    {
        java.net.Socket socket;
        for (; !Thread.interrupted(); b.execute(new d(a, socket)))
        {
            socket = com.google.android.apps.youtube.core.player.a.b.a(a).accept();
        }

          goto _L1
        Object obj;
        obj;
        if (!((SocketException) (obj)).getMessage().equals("Socket closed")) goto _L3; else goto _L2
_L2:
        L.e("Server socket closed");
_L5:
        b.shutdownNow();
        return;
_L1:
        b.shutdownNow();
        return;
_L3:
        L.a("SocketException when accepting a new connection", ((Throwable) (obj)));
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        b.shutdownNow();
        throw obj;
        obj;
        L.a("IOException when accepting a new connection", ((Throwable) (obj)));
        b.shutdownNow();
        return;
    }
}
