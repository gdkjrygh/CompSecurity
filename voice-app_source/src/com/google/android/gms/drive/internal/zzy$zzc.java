// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzr, zzy

private abstract class ent extends zzr
{

    final zzy zzafu;

    protected Result createFailedResult(Status status)
    {
        return zzz(status);
    }

    protected com.google.android.gms.drive.ferencesApi.FileUploadPreferencesResult zzz(Status status)
    {
        return new <init>(zzafu, status, null, null);
    }

    public ent(zzy zzy1, GoogleApiClient googleapiclient)
    {
        zzafu = zzy1;
        super(googleapiclient);
    }
}
