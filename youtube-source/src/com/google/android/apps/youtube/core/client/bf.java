// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.os.Handler;
import android.text.TextUtils;
import com.google.a.a.a.a.gr;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.m;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            HeartbeatClient, bi

public final class bf
{

    private final b a;
    private final Executor b;
    private final Handler c;
    private final m d;
    private bi e;

    public bf(b b1, Executor executor, Handler handler, m m1)
    {
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        c = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler);
        d = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
    }

    public final HeartbeatClient a(gr gr1, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(e);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        boolean flag;
        if (gr1 != null && !TextUtils.isEmpty(gr1.b) && gr1.c > 0L && gr1.d != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return new HeartbeatClient(a, b, c, d, e, gr1.b, gr1.c, gr1.d, s);
        } else
        {
            return null;
        }
    }

    public final HeartbeatClient a(HeartbeatClient.HeartbeatClientState heartbeatclientstate)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(e);
        if (heartbeatclientstate == null)
        {
            return null;
        } else
        {
            HeartbeatClient heartbeatclient = new HeartbeatClient(a, b, c, d, e, HeartbeatClient.HeartbeatClientState.access$200(heartbeatclientstate), HeartbeatClient.HeartbeatClientState.access$300(heartbeatclientstate), HeartbeatClient.HeartbeatClientState.access$400(heartbeatclientstate), HeartbeatClient.HeartbeatClientState.access$500(heartbeatclientstate));
            HeartbeatClient.a(heartbeatclient, HeartbeatClient.HeartbeatClientState.access$700(heartbeatclientstate));
            return heartbeatclient;
        }
    }

    public final void a(bi bi)
    {
        e = bi;
    }
}
