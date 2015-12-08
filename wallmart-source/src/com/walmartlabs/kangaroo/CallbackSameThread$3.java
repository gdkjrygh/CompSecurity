// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;


// Referenced classes of package com.walmartlabs.kangaroo:
//            CallbackSameThread, Request

class val.request
    implements Runnable
{

    final CallbackSameThread this$0;
    final Request val$request;

    public void run()
    {
        onCancelledSameThread(val$request);
    }

    ()
    {
        this$0 = final_callbacksamethread;
        val$request = Request.this;
        super();
    }
}
