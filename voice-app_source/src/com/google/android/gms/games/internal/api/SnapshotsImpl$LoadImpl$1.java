// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

class zzOl
    implements com.google.android.gms.games.snapshot.sult
{

    final Status zzOl;
    final zzOl zzasm;

    public SnapshotMetadataBuffer getSnapshots()
    {
        return new SnapshotMetadataBuffer(DataHolder.zzbi(14));
    }

    public Status getStatus()
    {
        return zzOl;
    }

    public void release()
    {
    }

    ( , Status status)
    {
        zzasm = ;
        zzOl = status;
        super();
    }
}
