// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.internal:
//            zzmd

static abstract class piClient extends piClient
{

    protected Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected Status zzb(Status status)
    {
        boolean flag;
        if (!status.isSuccess())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzV(flag);
        return status;
    }

    piClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
