// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChange, SnapshotMetadataChangeEntity, SnapshotMetadata

public static final class 
{

    private String zzakM;
    private Long zzavm;
    private Long zzavn;
    private BitmapTeleporter zzavo;
    private Uri zzavp;

    public SnapshotMetadataChange build()
    {
        return new SnapshotMetadataChangeEntity(zzakM, zzavm, zzavo, zzavp, zzavn);
    }

    public zzavn fromMetadata(SnapshotMetadata snapshotmetadata)
    {
        zzakM = snapshotmetadata.getDescription();
        zzavm = Long.valueOf(snapshotmetadata.getPlayedTime());
        zzavn = Long.valueOf(snapshotmetadata.getProgressValue());
        if (zzavm.longValue() == -1L)
        {
            zzavm = null;
        }
        zzavp = snapshotmetadata.getCoverImageUri();
        if (zzavp != null)
        {
            zzavo = null;
        }
        return this;
    }

    public zzavo setCoverImage(Bitmap bitmap)
    {
        zzavo = new BitmapTeleporter(bitmap);
        zzavp = null;
        return this;
    }

    public zzavp setDescription(String s)
    {
        zzakM = s;
        return this;
    }

    public zzakM setPlayedTimeMillis(long l)
    {
        zzavm = Long.valueOf(l);
        return this;
    }

    public zzavm setProgressValue(long l)
    {
        zzavn = Long.valueOf(l);
        return this;
    }

    public ()
    {
    }
}
