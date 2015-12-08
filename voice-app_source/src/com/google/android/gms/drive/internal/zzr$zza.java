// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzr

public static abstract class ent extends zzr
{

    protected Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected Status zzb(Status status)
    {
        return status;
    }

    public ent(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
