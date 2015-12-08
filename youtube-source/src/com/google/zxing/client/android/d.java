// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.zxing.client.android:
//            e, f, c

final class d
{

    private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor(new e((byte)0));
    private final Activity b;
    private ScheduledFuture c;
    private final BroadcastReceiver d = new f(this, (byte)0);

    d(Activity activity)
    {
        c = null;
        b = activity;
        a();
    }

    static void a(d d1)
    {
        d1.e();
    }

    private void e()
    {
        ScheduledFuture scheduledfuture = c;
        if (scheduledfuture != null)
        {
            scheduledfuture.cancel(true);
            c = null;
        }
    }

    final void a()
    {
        e();
        if (a.isShutdown())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        c = a.schedule(new c(b), 300L, TimeUnit.SECONDS);
        return;
        RejectedExecutionException rejectedexecutionexception;
        rejectedexecutionexception;
    }

    public final void b()
    {
        e();
        b.unregisterReceiver(d);
    }

    public final void c()
    {
        b.registerReceiver(d, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        a();
    }

    final void d()
    {
        e();
        a.shutdown();
    }
}
