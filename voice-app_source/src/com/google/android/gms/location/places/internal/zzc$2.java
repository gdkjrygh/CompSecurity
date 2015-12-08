// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.zzm;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzc, zzd

class zzaAi extends com.google.android.gms.location.places.c
{

    final zzc zzaAh;
    final String zzaAi[];

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzd)ient);
    }

    protected void zza(zzd zzd1)
        throws RemoteException
    {
        java.util.List list = Arrays.asList(zzaAi);
        zzd1.zza(new zzm(this, zzd1.getContext()), list);
    }

    (zzc zzc1, com.google.android.gms.common.api.ientKey ientkey, GoogleApiClient googleapiclient, String as[])
    {
        zzaAh = zzc1;
        zzaAi = as;
        super(ientkey, googleapiclient);
    }
}
