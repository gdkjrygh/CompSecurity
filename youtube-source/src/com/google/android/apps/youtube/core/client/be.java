// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


// Referenced classes of package com.google.android.apps.youtube.core.client:
//            HeartbeatClient, bi

final class be
    implements Runnable
{

    final Exception a;
    final HeartbeatClient b;

    be(HeartbeatClient heartbeatclient, Exception exception)
    {
        b = heartbeatclient;
        a = exception;
        super();
    }

    public final void run()
    {
        HeartbeatClient.a(b).a(a);
    }
}
