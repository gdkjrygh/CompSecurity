// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotEntity, SnapshotMetadataEntity, SnapshotContentsEntity

public class SnapshotEntityCreator
    implements android.os.Parcelable.Creator
{

    public SnapshotEntityCreator()
    {
    }

    static void zza(SnapshotEntity snapshotentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, snapshotentity.getMetadata(), i, false);
        zzb.zzc(parcel, 1000, snapshotentity.getVersionCode());
        zzb.zza(parcel, 3, snapshotentity.getSnapshotContents(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdS(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgc(i);
    }

    public SnapshotEntity zzdS(Parcel parcel)
    {
        SnapshotContentsEntity snapshotcontentsentity = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        SnapshotMetadataEntity snapshotmetadataentity = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    snapshotmetadataentity = (SnapshotMetadataEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, SnapshotMetadataEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 3: // '\003'
                    snapshotcontentsentity = (SnapshotContentsEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, SnapshotContentsEntity.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SnapshotEntity(i, snapshotmetadataentity, snapshotcontentsentity);
            }
        } while (true);
    }

    public SnapshotEntity[] zzgc(int i)
    {
        return new SnapshotEntity[i];
    }
}
