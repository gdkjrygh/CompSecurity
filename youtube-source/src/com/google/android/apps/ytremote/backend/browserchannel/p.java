// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            k

final class p
    implements Callable
{

    final Future a;
    final k b;

    p(k k1, Future future)
    {
        b = k1;
        a = future;
        super();
    }

    public final Object call()
    {
        if (!a.isDone())
        {
            Log.w(k.c(), (new StringBuilder("Message ")).append(k.l(b)).append(" took longer than ").append(k.o(b)).append(" ms to send. Interrupting.").toString());
            a.cancel(true);
        }
        return null;
    }
}
