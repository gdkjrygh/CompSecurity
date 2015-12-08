// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeEntity, SnapshotMetadata

public abstract class SnapshotMetadataChange
{
    public static final class Builder
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

        public Builder fromMetadata(SnapshotMetadata snapshotmetadata)
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

        public Builder setCoverImage(Bitmap bitmap)
        {
            zzavo = new BitmapTeleporter(bitmap);
            zzavp = null;
            return this;
        }

        public Builder setDescription(String s)
        {
            zzakM = s;
            return this;
        }

        public Builder setPlayedTimeMillis(long l)
        {
            zzavm = Long.valueOf(l);
            return this;
        }

        public Builder setProgressValue(long l)
        {
            zzavn = Long.valueOf(l);
            return this;
        }

        public Builder()
        {
        }
    }


    public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChangeEntity();

    protected SnapshotMetadataChange()
    {
    }

    public abstract Bitmap getCoverImage();

    public abstract String getDescription();

    public abstract Long getPlayedTimeMillis();

    public abstract Long getProgressValue();

    public abstract BitmapTeleporter zztQ();

}
