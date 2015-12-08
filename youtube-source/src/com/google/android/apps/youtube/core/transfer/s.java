// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Environment;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransfersExecutor

final class s extends BroadcastReceiver
{

    final TransfersExecutor a;
    private volatile boolean b;

    public s(TransfersExecutor transfersexecutor)
    {
        a = transfersexecutor;
        super();
        b = Environment.getExternalStorageState().equals("mounted");
    }

    public final boolean a()
    {
        return b;
    }

    public final void b()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentfilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentfilter.addDataScheme("file");
        TransfersExecutor.b(a).registerReceiver(this, intentfilter);
    }

    public final void c()
    {
        TransfersExecutor.b(a).unregisterReceiver(this);
    }

    public final void onReceive(Context context, Intent intent)
    {
        b = "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction());
        L.e((new StringBuilder("media mounted ")).append(b).toString());
        TransfersExecutor.c(a);
    }
}
