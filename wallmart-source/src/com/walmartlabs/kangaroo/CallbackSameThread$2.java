// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.walmartlabs.kangaroo:
//            CallbackSameThread, Request, Result

class val.updated
    implements Runnable
{

    final CallbackSameThread this$0;
    final Request val$request;
    final Result val$updated;

    public void run()
    {
        if (!CallbackSameThread.access$000(CallbackSameThread.this).get())
        {
            onResultSameThread(val$request, val$updated);
        }
    }

    ()
    {
        this$0 = final_callbacksamethread;
        val$request = request1;
        val$updated = Result.this;
        super();
    }
}
