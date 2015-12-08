// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.location.places:
//            zzl, PlaceBuffer

public static abstract class nt extends nt
{

    protected PlaceBuffer zzaQ(Status status)
    {
        return new PlaceBuffer(DataHolder.zzbp(status.getStatusCode()), null);
    }

    protected Result zzb(Status status)
    {
        return zzaQ(status);
    }

    public nt(com.google.android.gms.common.api..zzc zzc1, GoogleApiClient googleapiclient)
    {
        super(zzc1, googleapiclient);
    }
}
