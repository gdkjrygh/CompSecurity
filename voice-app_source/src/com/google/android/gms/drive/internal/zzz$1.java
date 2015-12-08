// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzz, zzs, GetMetadataRequest, zzak

class lient extends d
{

    final boolean zzafx;
    final zzz zzafy;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        zzs1.zzpB().zza(new GetMetadataRequest(zzafy.zzacT, zzafx), new b(this));
    }

    lient(zzz zzz1, GoogleApiClient googleapiclient, boolean flag)
    {
        zzafy = zzz1;
        zzafx = flag;
        super(zzz1, googleapiclient, null);
    }
}
