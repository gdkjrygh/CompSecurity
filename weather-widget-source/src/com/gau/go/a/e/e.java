// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;

// Referenced classes of package com.gau.go.a.e:
//            d, f

class e extends BroadcastReceiver
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        f f1;
        if ("com.action.broadreceiver.scheduler.manager".equals(intent.getAction()))
        {
            context = intent.getStringExtra("scheduler_task_key");
            com.gau.go.a.f.e.a((new StringBuilder()).append("taskSize:").append(d.a(a).size()).toString());
            if (TextUtils.isEmpty(context) || d.a(a) == null)
            {
                break MISSING_BLOCK_LABEL_194;
            }
            synchronized (d.a(a))
            {
                f1 = (f)d.a(a).get(context);
            }
            if (f1 != null && !f1.e())
            {
                break MISSING_BLOCK_LABEL_116;
            }
            com.gau.go.a.f.e.a("task is null");
        }
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        f1.a();
        if (f1.c() > 0L)
        {
            f1.a(System.currentTimeMillis() + f1.c());
            a.a(f1);
            return;
        }
        com.gau.go.a.f.e.a("intervaltime < 0");
        synchronized (d.a(a))
        {
            d.a(a).remove(context);
            f1.a(true);
            f1.g();
        }
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        com.gau.go.a.f.e.a("taskKey or mHashmap is null");
        return;
    }
}
