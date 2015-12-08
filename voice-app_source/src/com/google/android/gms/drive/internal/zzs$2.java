// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzs, RemoveEventListenerRequest, zzbq, zzak, 
//            zzac

class lient extends a
{

    final DriveId zzaeU;
    final int zzaeV;
    final zzac zzaeX;
    final zzs zzaeY;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        zzs1.zzpB().zza(new RemoveEventListenerRequest(zzaeU, zzaeV), zzaeX, null, new zzbq(this));
    }

    lient(zzs zzs1, GoogleApiClient googleapiclient, DriveId driveid, int i, zzac zzac)
    {
        zzaeY = zzs1;
        zzaeU = driveid;
        zzaeV = i;
        zzaeX = zzac;
        super(googleapiclient);
    }
}
