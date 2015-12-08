// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzw, zzs, CreateFileRequest, zzak

class lient extends d
{

    final MetadataChangeSet zzafm;
    final int zzafn;
    final int zzafo;
    final ExecutionOptions zzafp;
    final zzw zzafq;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        zzafm.zzpm().setContext(zzs1.getContext());
        CreateFileRequest createfilerequest = new CreateFileRequest(zzafq.getDriveId(), zzafm.zzpm(), zzafn, zzafo, zzafp);
        zzs1.zzpB().zza(createfilerequest, new a(this));
    }

    lient(zzw zzw1, GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, int i, int j, ExecutionOptions executionoptions)
    {
        zzafq = zzw1;
        zzafm = metadatachangeset;
        zzafn = i;
        zzafo = j;
        zzafp = executionoptions;
        super(googleapiclient);
    }
}
