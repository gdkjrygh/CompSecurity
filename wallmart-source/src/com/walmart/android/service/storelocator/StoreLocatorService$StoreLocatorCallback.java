// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.storelocator;

import android.content.Context;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.service.storelocator:
//            StoreLocatorService

private static class mCallback extends CallbackSameThread
{

    private final com.walmartlabs.storelocator.torCallback.mCallback mCallback;

    public void onResultSameThread(Request request, Result result)
    {
        if (result.successful() && result.hasData())
        {
            mCallback.ceived((com.walmartlabs.storelocator.StoreData[])result.getData());
            return;
        } else
        {
            mCallback.mCallback(AsyncCallbackWrapper.translateError(result).intValue());
            return;
        }
    }

    (Context context, com.walmartlabs.storelocator.torCallback torcallback)
    {
        super(context);
        mCallback = torcallback;
    }
}
