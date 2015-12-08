// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


// Referenced classes of package com.google.android.apps.youtube.core.client:
//            HeartbeatClient

final class bh
    implements Runnable
{

    final HeartbeatClient a;

    private bh(HeartbeatClient heartbeatclient)
    {
        a = heartbeatclient;
        super();
    }

    bh(HeartbeatClient heartbeatclient, byte byte0)
    {
        this(heartbeatclient);
    }

    public final void run()
    {
        a.c();
    }
}
