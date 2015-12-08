// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzw, zzs, CreateFolderRequest, zzak

class lient extends f
{

    final MetadataChangeSet zzafm;
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
        zzs1.zzpB().zza(new CreateFolderRequest(zzafq.getDriveId(), zzafm.zzpm()), new b(this));
    }

    lient(zzw zzw1, GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        zzafq = zzw1;
        zzafm = metadatachangeset;
        super(googleapiclient);
    }
}
