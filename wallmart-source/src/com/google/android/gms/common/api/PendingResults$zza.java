// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;

// Referenced classes of package com.google.android.gms.common.api:
//            zzb, PendingResults, Status, Result

private static final class zzaaB extends zzb
{

    private final Result zzaaB;

    protected Result zzb(Status status)
    {
        if (status.getStatusCode() != zzaaB.getStatus().getStatusCode())
        {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        } else
        {
            return zzaaB;
        }
    }

    public (Result result)
    {
        super(Looper.getMainLooper());
        zzaaB = result;
    }
}
