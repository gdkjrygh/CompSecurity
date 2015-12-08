// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import android.content.Context;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;

public abstract class CancelableCallback extends CallbackSameThread
{

    private static final String TAG = com/walmart/android/service/wishlist/CancelableCallback.getSimpleName();
    private boolean mDone;

    public CancelableCallback()
    {
    }

    public CancelableCallback(Context context)
    {
        super(context);
    }

    public void cancel()
    {
        WLog.d(TAG, (new StringBuilder()).append("cancel ->  already cancelled: ").append(mDone).toString());
        if (!mDone)
        {
            mDone = true;
            onCancel();
        }
    }

    protected abstract void onCancel();

    public void onCancelledSameThread(Request request)
    {
        WLog.d(TAG, "onCancelledSameThread");
        cancel();
    }

    protected abstract void onResult(Result result);

    public void onResultSameThread(Request request, Result result)
    {
        WLog.d(TAG, (new StringBuilder()).append("onResultSameThread -> cancelled: ").append(mDone).toString());
        if (!mDone)
        {
            mDone = true;
            onResult(result);
        }
    }

}
