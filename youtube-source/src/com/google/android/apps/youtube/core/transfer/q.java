// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;


// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransfersExecutor

final class q extends Thread
{

    final TransfersExecutor a;

    q(TransfersExecutor transfersexecutor, Runnable runnable)
    {
        a = transfersexecutor;
        super(runnable);
    }

    public final void run()
    {
        TransfersExecutor.a(a).acquire();
        super.run();
        TransfersExecutor.a(a).release();
        return;
        Exception exception;
        exception;
        TransfersExecutor.a(a).release();
        throw exception;
    }
}
