// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzlc;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntityCreator

public final class SnapshotMetadataEntity
    implements SafeParcelable, SnapshotMetadata
{

    public static final android.os.Parcelable.Creator CREATOR = new SnapshotMetadataEntityCreator();
    private final int zzCY;
    private final String zzadv;
    private final String zzakM;
    private final String zzapg;
    private final GameEntity zzaud;
    private final Uri zzavp;
    private final PlayerEntity zzavs;
    private final String zzavt;
    private final long zzavu;
    private final long zzavv;
    private final float zzavw;
    private final String zzavx;
    private final boolean zzavy;
    private final long zzavz;

    SnapshotMetadataEntity(int i, GameEntity gameentity, PlayerEntity playerentity, String s, Uri uri, String s1, String s2, 
            String s3, long l, long l1, float f, String s4, 
            boolean flag, long l2)
    {
        zzCY = i;
        zzaud = gameentity;
        zzavs = playerentity;
        zzapg = s;
        zzavp = uri;
        zzavt = s1;
        zzavw = f;
        zzadv = s2;
        zzakM = s3;
        zzavu = l;
        zzavv = l1;
        zzavx = s4;
        zzavy = flag;
        zzavz = l2;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotmetadata)
    {
        zzCY = 5;
        zzaud = new GameEntity(snapshotmetadata.getGame());
        zzavs = new PlayerEntity(snapshotmetadata.getOwner());
        zzapg = snapshotmetadata.getSnapshotId();
        zzavp = snapshotmetadata.getCoverImageUri();
        zzavt = snapshotmetadata.getCoverImageUrl();
        zzavw = snapshotmetadata.getCoverImageAspectRatio();
        zzadv = snapshotmetadata.getTitle();
        zzakM = snapshotmetadata.getDescription();
        zzavu = snapshotmetadata.getLastModifiedTimestamp();
        zzavv = snapshotmetadata.getPlayedTime();
        zzavx = snapshotmetadata.getUniqueName();
        zzavy = snapshotmetadata.hasChangePending();
        zzavz = snapshotmetadata.getProgressValue();
    }

    static int zza(SnapshotMetadata snapshotmetadata)
    {
        return zzt.hashCode(new Object[] {
            snapshotmetadata.getGame(), snapshotmetadata.getOwner(), snapshotmetadata.getSnapshotId(), snapshotmetadata.getCoverImageUri(), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio()), snapshotmetadata.getTitle(), snapshotmetadata.getDescription(), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getPlayedTime()), snapshotmetadata.getUniqueName(), 
            Boolean.valueOf(snapshotmetadata.hasChangePending()), Long.valueOf(snapshotmetadata.getProgressValue())
        });
    }

    static boolean zza(SnapshotMetadata snapshotmetadata, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof SnapshotMetadata) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (snapshotmetadata == obj) goto _L4; else goto _L3
_L3:
        obj = (SnapshotMetadata)obj;
        if (!zzt.equal(((SnapshotMetadata) (obj)).getGame(), snapshotmetadata.getGame()) || !zzt.equal(((SnapshotMetadata) (obj)).getOwner(), snapshotmetadata.getOwner()) || !zzt.equal(((SnapshotMetadata) (obj)).getSnapshotId(), snapshotmetadata.getSnapshotId()) || !zzt.equal(((SnapshotMetadata) (obj)).getCoverImageUri(), snapshotmetadata.getCoverImageUri()) || !zzt.equal(Float.valueOf(((SnapshotMetadata) (obj)).getCoverImageAspectRatio()), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())) || !zzt.equal(((SnapshotMetadata) (obj)).getTitle(), snapshotmetadata.getTitle()) || !zzt.equal(((SnapshotMetadata) (obj)).getDescription(), snapshotmetadata.getDescription()) || !zzt.equal(Long.valueOf(((SnapshotMetadata) (obj)).getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())) || !zzt.equal(Long.valueOf(((SnapshotMetadata) (obj)).getPlayedTime()), Long.valueOf(snapshotmetadata.getPlayedTime())) || !zzt.equal(((SnapshotMetadata) (obj)).getUniqueName(), snapshotmetadata.getUniqueName()) || !zzt.equal(Boolean.valueOf(((SnapshotMetadata) (obj)).hasChangePending()), Boolean.valueOf(snapshotmetadata.hasChangePending())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(Long.valueOf(((SnapshotMetadata) (obj)).getProgressValue()), Long.valueOf(snapshotmetadata.getProgressValue()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(SnapshotMetadata snapshotmetadata)
    {
        return zzt.zzt(snapshotmetadata).zzg("Game", snapshotmetadata.getGame()).zzg("Owner", snapshotmetadata.getOwner()).zzg("SnapshotId", snapshotmetadata.getSnapshotId()).zzg("CoverImageUri", snapshotmetadata.getCoverImageUri()).zzg("CoverImageUrl", snapshotmetadata.getCoverImageUrl()).zzg("CoverImageAspectRatio", Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())).zzg("Description", snapshotmetadata.getDescription()).zzg("LastModifiedTimestamp", Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())).zzg("PlayedTime", Long.valueOf(snapshotmetadata.getPlayedTime())).zzg("UniqueName", snapshotmetadata.getUniqueName()).zzg("ChangePending", Boolean.valueOf(snapshotmetadata.hasChangePending())).zzg("ProgressValue", Long.valueOf(snapshotmetadata.getProgressValue())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public SnapshotMetadata freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public float getCoverImageAspectRatio()
    {
        return zzavw;
    }

    public Uri getCoverImageUri()
    {
        return zzavp;
    }

    public String getCoverImageUrl()
    {
        return zzavt;
    }

    public String getDescription()
    {
        return zzakM;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzakM, chararraybuffer);
    }

    public Game getGame()
    {
        return zzaud;
    }

    public long getLastModifiedTimestamp()
    {
        return zzavu;
    }

    public Player getOwner()
    {
        return zzavs;
    }

    public long getPlayedTime()
    {
        return zzavv;
    }

    public long getProgressValue()
    {
        return zzavz;
    }

    public String getSnapshotId()
    {
        return zzapg;
    }

    public String getTitle()
    {
        return zzadv;
    }

    public String getUniqueName()
    {
        return zzavx;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public boolean hasChangePending()
    {
        return zzavy;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotMetadataEntityCreator.zza(this, parcel, i);
    }

}
