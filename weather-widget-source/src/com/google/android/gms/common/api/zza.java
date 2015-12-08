// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            zzb, OptionalPendingResult, Result

public abstract class zza extends zzb
    implements OptionalPendingResult
{

    protected zza(Looper looper)
    {
        super(looper);
    }

    public Result get()
    {
        if (isReady())
        {
            return await(0L, TimeUnit.MILLISECONDS);
        } else
        {
            throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
        }
    }

    public boolean isDone()
    {
        return isReady();
    }
}
