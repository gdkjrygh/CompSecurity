// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games:
//            Games

private static abstract class nt extends MethodImpl
{

    public Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    public Status zzb(Status status)
    {
        return status;
    }

    private nt(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    nt(GoogleApiClient googleapiclient, nt nt)
    {
        this(googleapiclient);
    }
}
