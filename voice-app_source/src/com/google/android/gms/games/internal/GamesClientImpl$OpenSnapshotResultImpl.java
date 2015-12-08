// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapL extends zzapL
    implements com.google.android.gms.games.snapshot.zzapL
{

    private final Snapshot zzapJ;
    private final String zzapK;
    private final Snapshot zzapL;
    private final Contents zzapM;
    private final SnapshotContents zzapN;

    public String getConflictId()
    {
        return zzapK;
    }

    public Snapshot getConflictingSnapshot()
    {
        return zzapL;
    }

    public SnapshotContents getResolutionSnapshotContents()
    {
        return zzapN;
    }

    public Snapshot getSnapshot()
    {
        return zzapJ;
    }

    (DataHolder dataholder, Contents contents)
    {
        this(dataholder, null, contents, null, null);
    }

    <init>(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
    {
        SnapshotMetadataBuffer snapshotmetadatabuffer;
        boolean flag;
        flag = true;
        super(dataholder);
        snapshotmetadatabuffer = new SnapshotMetadataBuffer(dataholder);
        if (snapshotmetadatabuffer.getCount() != 0) goto _L2; else goto _L1
_L1:
        zzapJ = null;
        zzapL = null;
_L3:
        snapshotmetadatabuffer.release();
        zzapK = s;
        zzapM = contents2;
        zzapN = new SnapshotContentsEntity(contents2);
        return;
_L2:
        if (snapshotmetadatabuffer.getCount() != 1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (dataholder.getStatusCode() == 4004)
        {
            flag = false;
        }
        zzb.zzU(flag);
        zzapJ = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
        zzapL = null;
          goto _L3
        dataholder;
        snapshotmetadatabuffer.release();
        throw dataholder;
        zzapJ = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
        zzapL = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), new SnapshotContentsEntity(contents1));
          goto _L3
    }
}
