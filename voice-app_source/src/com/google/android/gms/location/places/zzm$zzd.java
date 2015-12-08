// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.location.places:
//            zzm, PlaceLikelihoodBuffer

public static abstract class  extends 
{

    protected Result createFailedResult(Status status)
    {
        return zzaI(status);
    }

    protected PlaceLikelihoodBuffer zzaI(Status status)
    {
        return new PlaceLikelihoodBuffer(DataHolder.zzbi(status.getStatusCode()), 100, null);
    }

    public nt(com.google.android.gms.common.api.ntKey ntkey, GoogleApiClient googleapiclient)
    {
        super(ntkey, googleapiclient);
    }
}
