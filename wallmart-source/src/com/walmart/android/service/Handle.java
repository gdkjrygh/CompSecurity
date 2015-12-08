// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import java.util.concurrent.Future;

// Referenced classes of package com.walmart.android.service:
//            CancellableRunnable

public class Handle
{

    private Future mFuture;
    private CancellableRunnable mRunnable;

    public Handle(Future future, CancellableRunnable cancellablerunnable)
    {
        mFuture = future;
        mRunnable = cancellablerunnable;
    }

    public boolean cancel()
    {
        mFuture.cancel(false);
        return mRunnable.cancel();
    }
}
