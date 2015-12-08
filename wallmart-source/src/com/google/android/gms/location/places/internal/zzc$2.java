// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.zzl;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzc, zzd

class zzaEf extends com.google.android.gms.location.places.c
{

    final zzc zzaEe;
    final String zzaEf[];

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzd)b);
    }

    protected void zza(zzd zzd1)
        throws RemoteException
    {
        java.util.List list = Arrays.asList(zzaEf);
        zzd1.zza(new zzl(this, zzd1.getContext()), list);
    }

    (zzc zzc1, com.google.android.gms.common.api.c c, GoogleApiClient googleapiclient, String as[])
    {
        zzaEe = zzc1;
        zzaEf = as;
        super(c, googleapiclient);
    }
}
