// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzt, zzs, CloseContentsAndUpdateMetadataRequest, zzbq, 
//            zzak

class lient extends a
{

    final zzt zzafd;
    final MetadataChangeSet zzafe;
    final ExecutionOptions zzaff;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        zzafe.zzpm().setContext(zzs1.getContext());
        zzs1.zzpB().zza(new CloseContentsAndUpdateMetadataRequest(zzt.zza(zzafd).getDriveId(), zzafe.zzpm(), zzt.zza(zzafd).getRequestId(), zzt.zza(zzafd).zzpc(), zzaff), new zzbq(this));
    }

    lient(zzt zzt1, GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions)
    {
        zzafd = zzt1;
        zzafe = metadatachangeset;
        zzaff = executionoptions;
        super(googleapiclient);
    }
}
