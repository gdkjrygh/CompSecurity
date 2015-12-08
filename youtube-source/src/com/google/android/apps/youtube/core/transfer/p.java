// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransfersExecutor

final class p extends Handler
{

    final TransfersExecutor a;

    p(TransfersExecutor transfersexecutor, Looper looper)
    {
        a = transfersexecutor;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        a.a(message);
    }
}
