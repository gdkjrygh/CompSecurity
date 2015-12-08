// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzz, zzs, UpdateMetadataRequest, zzak

class lient extends d
{

    final MetadataChangeSet zzafm;
    final zzz zzafy;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        zzafm.zzpm().setContext(zzs1.getContext());
        zzs1.zzpB().zza(new UpdateMetadataRequest(zzafy.zzacT, zzafm.zzpm()), new b(this));
    }

    lient(zzz zzz1, GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        zzafy = zzz1;
        zzafm = metadatachangeset;
        super(zzz1, googleapiclient, null);
    }
}
