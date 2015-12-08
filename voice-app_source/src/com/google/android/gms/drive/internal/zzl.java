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
//            CreateFileRequest

public class zzl
    implements android.os.Parcelable.Creator
{

    public zzl()
    {
    }

    static void zza(CreateFileRequest createfilerequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, createfilerequest.zzCY);
        zzb.zza(parcel, 2, createfilerequest.zzaeC, i, false);
        zzb.zza(parcel, 3, createfilerequest.zzaeA, i, false);
        zzb.zza(parcel, 4, createfilerequest.zzaes, i, false);
        zzb.zza(parcel, 5, createfilerequest.zzaeB, false);
        zzb.zza(parcel, 6, createfilerequest.zzaen);
        zzb.zza(parcel, 7, createfilerequest.zzadn, false);
        zzb.zzc(parcel, 8, createfilerequest.zzaeD);
        zzb.zzc(parcel, 9, createfilerequest.zzaeE);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaK(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzcv(i);
    }

    public CreateFileRequest zzaK(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int j = 0;
        boolean flag = false;
        Integer integer = null;
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
                    integer = com.google.android.gms.common.internal.safeparcel.zza.zzh(parcel, i1);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 8: // '\b'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new CreateFileRequest(k, driveid, metadatabundle, contents, integer, flag, s, j, i);
            }
        } while (true);
    }

    public CreateFileRequest[] zzcv(int i)
    {
        return new CreateFileRequest[i];
    }
}
