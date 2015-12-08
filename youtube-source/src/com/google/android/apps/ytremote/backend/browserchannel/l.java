// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import com.google.android.apps.ytremote.backend.model.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            k, c

final class l extends Thread
{

    final a a;
    final k b;

    l(k k1, String s, a a1)
    {
        b = k1;
        a = a1;
        super(s);
    }

    public final void run()
    {
        com.google.android.apps.ytremote.backend.browserchannel.k.a(b).set(false);
        if (k.b(b))
        {
            com.google.android.apps.ytremote.backend.browserchannel.k.a(b, false);
            k.b(b, false);
        }
        b.a(null);
        com.google.android.apps.ytremote.backend.browserchannel.k.a(b, k.c(b).a(a));
        k.d(b);
        if (b.a())
        {
            k.e(b);
        }
        k.c(b, false);
        k.f(b).countDown();
        return;
        Exception exception;
        exception;
        k.c(b, false);
        k.f(b).countDown();
        throw exception;
    }
}
