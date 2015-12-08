// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeEntity

public class SnapshotMetadataChangeCreator
    implements android.os.Parcelable.Creator
{

    public SnapshotMetadataChangeCreator()
    {
    }

    static void zza(SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, snapshotmetadatachangeentity.getDescription(), false);
        zzb.zzc(parcel, 1000, snapshotmetadatachangeentity.getVersionCode());
        zzb.zza(parcel, 2, snapshotmetadatachangeentity.getPlayedTimeMillis(), false);
        zzb.zza(parcel, 4, snapshotmetadatachangeentity.getCoverImageUri(), i, false);
        zzb.zza(parcel, 5, snapshotmetadatachangeentity.zztQ(), i, false);
        zzb.zza(parcel, 6, snapshotmetadatachangeentity.getProgressValue(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdT(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgd(i);
    }

    public SnapshotMetadataChangeEntity zzdT(Parcel parcel)
    {
        Long long1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        Uri uri = null;
        BitmapTeleporter bitmapteleporter = null;
        Long long2 = null;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    long2 = com.google.android.gms.common.internal.safeparcel.zza.zzj(parcel, k);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    bitmapteleporter = (BitmapTeleporter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, BitmapTeleporter.CREATOR);
                    break;

                case 6: // '\006'
                    long1 = com.google.android.gms.common.internal.safeparcel.zza.zzj(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SnapshotMetadataChangeEntity(i, s, long2, bitmapteleporter, uri, long1);
            }
        } while (true);
    }

    public SnapshotMetadataChangeEntity[] zzgd(int i)
    {
        return new SnapshotMetadataChangeEntity[i];
    }
}
