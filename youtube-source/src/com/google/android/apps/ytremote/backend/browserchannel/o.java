// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.util.Log;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            k, r

final class o
    implements Callable
{

    final k a;

    o(k k1)
    {
        a = k1;
        super();
    }

    private Void a()
    {
        if (!k.l(a).a()) goto _L2; else goto _L1
_L1:
        Log.w(k.c(), (new StringBuilder("Message: ")).append(k.l(a)).append(" is older than ").append(r.a).append(" ms. Dropping.").toString());
        k.m(a).poll();
        k.a(a, k.l(a).b, com.google.android.apps.ytremote.backend.logic.CloudService.OnSendMessageResult.SendMessageResult.CANCELED);
_L4:
        k.e(a);
        return null;
_L2:
        k.a(a, k.l(a).c, k.l(a).d, k.l(a).b);
        if (k.n(a) != null)
        {
            k.n(a).cancel(true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        k.e(a);
        throw exception;
    }

    public final Object call()
    {
        return a();
    }
}
