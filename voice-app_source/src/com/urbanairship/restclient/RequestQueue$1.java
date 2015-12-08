// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;


// Referenced classes of package com.urbanairship.restclient:
//            AsyncHandler, RequestQueue, Request, Response

class nit> extends AsyncHandler
{

    final RequestQueue this$0;
    final AsyncHandler val$delegate;
    final Request val$request;

    public void onComplete(Response response)
    {
        RequestQueue.access$000(RequestQueue.this, val$request);
        val$delegate.onComplete(response);
    }

    public void onError(Exception exception)
    {
        RequestQueue.access$000(RequestQueue.this, val$request);
        val$delegate.onError(exception);
    }

    public void onProgress(int i)
    {
        val$delegate.onProgress(i);
    }

    ()
    {
        this$0 = final_requestqueue;
        val$request = request1;
        val$delegate = AsyncHandler.this;
        super();
    }
}
