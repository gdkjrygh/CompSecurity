// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.cache:
//            LocalCache

class uture
    implements Runnable
{

    final ueReference.setException this$0;
    final int val$hash;
    final Object val$key;
    final ListenableFuture val$loadingFuture;
    final ueReference val$loadingValueReference;

    public void run()
    {
        try
        {
            tAndRecordStats(val$key, val$hash, val$loadingValueReference, val$loadingFuture);
            return;
        }
        catch (Throwable throwable)
        {
            LocalCache.logger.log(Level.WARNING, "Exception thrown during refresh", throwable);
            val$loadingValueReference.setException(throwable);
            return;
        }
    }

    uture()
    {
        this$0 = final_uture;
        val$key = obj;
        val$hash = i;
        val$loadingValueReference = uereference;
        val$loadingFuture = ListenableFuture.this;
        super();
    }
}
