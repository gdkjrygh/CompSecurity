// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.os.Handler;
import com.walmart.android.data.SlapResponse;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl

class > extends AsyncCallbackOnThread
{

    final WalmartNetServiceImpl this$0;
    final AsyncCallback val$asyncCallback;

    public void onFailureSameThread(Integer integer, SlapResponse aslapresponse[])
    {
        val$asyncCallback.onFailure(integer, null);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (SlapResponse[])obj1);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((SlapResponse[])obj);
    }

    public void onSuccessSameThread(SlapResponse aslapresponse[])
    {
        val$asyncCallback.onSuccess(WalmartNetServiceImpl.access$1200(WalmartNetServiceImpl.this, aslapresponse));
    }

    (AsyncCallback asynccallback)
    {
        this$0 = final_walmartnetserviceimpl;
        val$asyncCallback = asynccallback;
        super(Handler.this);
    }
}
