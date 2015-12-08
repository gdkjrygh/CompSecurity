// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            Snapshot, SnapshotEntityCreator, SnapshotMetadataEntity, SnapshotContentsEntity, 
//            SnapshotMetadata, SnapshotContents

public final class SnapshotEntity
    implements SafeParcelable, Snapshot
{

    public static final android.os.Parcelable.Creator CREATOR = new SnapshotEntityCreator();
    private final int zzCY;
    private final SnapshotMetadataEntity zzavk;
    private final SnapshotContentsEntity zzavl;

    SnapshotEntity(int i, SnapshotMetadata snapshotmetadata, SnapshotContentsEntity snapshotcontentsentity)
    {
        zzCY = i;
        zzavk = new SnapshotMetadataEntity(snapshotmetadata);
        zzavl = snapshotcontentsentity;
    }

    public SnapshotEntity(SnapshotMetadata snapshotmetadata, SnapshotContentsEntity snapshotcontentsentity)
    {
        this(2, snapshotmetadata, snapshotcontentsentity);
    }

    private boolean isClosed()
    {
        return zzavl.isClosed();
    }

    static boolean zza(Snapshot snapshot, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Snapshot) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (snapshot == obj) goto _L4; else goto _L3
_L3:
        obj = (Snapshot)obj;
        if (!zzt.equal(((Snapshot) (obj)).getMetadata(), snapshot.getMetadata()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((Snapshot) (obj)).getSnapshotContents(), snapshot.getSnapshotContents())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static int zzb(Snapshot snapshot)
    {
        return zzt.hashCode(new Object[] {
            snapshot.getMetadata(), snapshot.getSnapshotContents()
        });
    }

    static String zzc(Snapshot snapshot)
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.zzt(snapshot).zzg("Metadata", snapshot.getMetadata());
        boolean flag;
        if (snapshot.getSnapshotContents() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return zza1.zzg("HasContents", Boolean.valueOf(flag)).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Snapshot freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public SnapshotMetadata getMetadata()
    {
        return zzavk;
    }

    public SnapshotContents getSnapshotContents()
    {
        if (isClosed())
        {
            return null;
        } else
        {
            return zzavl;
        }
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzb(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotEntityCreator.zza(this, parcel, i);
    }

}
