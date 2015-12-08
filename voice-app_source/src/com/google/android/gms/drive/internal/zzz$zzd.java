// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzr, zzz

private abstract class ent extends zzr
{

    final zzz zzafy;

    public Result createFailedResult(Status status)
    {
        return zzA(status);
    }

    public com.google.android.gms.drive.ource.MetadataResult zzA(Status status)
    {
        return new <init>(status, null);
    }

    private ent(zzz zzz1, GoogleApiClient googleapiclient)
    {
        zzafy = zzz1;
        super(googleapiclient);
    }

    ent(zzz zzz1, GoogleApiClient googleapiclient, ent ent)
    {
        this(zzz1, googleapiclient);
    }
}
