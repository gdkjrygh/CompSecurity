// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.ytremote.backend.model.b;
import com.google.android.apps.ytremote.fork.net.async.IpV6BugException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            k, c, a

final class m extends Thread
{

    final CountDownLatch a;
    final k b;

    m(k k1, String s, CountDownLatch countdownlatch)
    {
        b = k1;
        a = countdownlatch;
        super(s);
    }

    public final void run()
    {
        try
        {
            a a1 = k.c(b).a((new b()).a());
            k.d(b, a1.b());
            k.a(b, a);
            return;
        }
        catch (IpV6BugException ipv6bugexception) { }
        catch (Exception exception)
        {
            Log.e(k.c(), "Error testing for buffered proxy. Will assume the worst (buffered proxy)", exception);
            k.d(b, true);
            return;
        }
        Log.i(k.c(), (new StringBuilder("IP Address of the phone is: ")).append(k.g(b)).toString());
        System.setProperty("java.net.preferIPv4Stack", "true");
        System.setProperty("java.net.preferIPv6Addresses", "false");
        Log.w(k.c(), "This device suffers from issue 9431 on code.google.com - setting java.net.preferIPv6Addresses to false, java.net.preferIPv4Stack to true");
        k.c(b).a((new b()).a());
        k.d(b, k.h(b).b());
        k.a(b, a);
_L1:
        Log.i(k.c(), "You're lucky - that seems to have worked!");
        return;
        IpV6BugException ipv6bugexception1;
        ipv6bugexception1;
        Log.w(k.c(), "Tough luck, still can't connect. The remote control will not work");
        android.content.Intent intent = com.google.android.apps.ytremote.intent.Intents.IntentAction.CLOUD_SERVICE_IPV6_ERROR.asIntent();
        k.i(b).sendBroadcast(intent);
          goto _L1
    }
}
