// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CloseContentsAndUpdateMetadataRequest

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, closecontentsandupdatemetadatarequest.zzCY);
        zzb.zza(parcel, 2, closecontentsandupdatemetadatarequest.zzaeq, i, false);
        zzb.zza(parcel, 3, closecontentsandupdatemetadatarequest.zzaer, i, false);
        zzb.zza(parcel, 4, closecontentsandupdatemetadatarequest.zzaes, i, false);
        zzb.zza(parcel, 5, closecontentsandupdatemetadatarequest.zzado);
        zzb.zza(parcel, 6, closecontentsandupdatemetadatarequest.zzadn, false);
        zzb.zzc(parcel, 7, closecontentsandupdatemetadatarequest.zzaet);
        zzb.zzc(parcel, 8, closecontentsandupdatemetadatarequest.zzaeu);
        zzb.zza(parcel, 9, closecontentsandupdatemetadatarequest.zzaev);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaG(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzcq(i);
    }

    public CloseContentsAndUpdateMetadataRequest zzaG(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        int j = 0;
        boolean flag1 = false;
        Contents contents = null;
        MetadataBundle metadatabundle = null;
        DriveId driveid = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, MetadataBundle.CREATOR);
                    break;

                case 4: // '\004'
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Contents.CREATOR);
                    break;

                case 5: // '\005'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 8: // '\b'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new CloseContentsAndUpdateMetadataRequest(k, driveid, metadatabundle, contents, flag1, s, j, i, flag);
            }
        } while (true);
    }

    public CloseContentsAndUpdateMetadataRequest[] zzcq(int i)
    {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }
}
