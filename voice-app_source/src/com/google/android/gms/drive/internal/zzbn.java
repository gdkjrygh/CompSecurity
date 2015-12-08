// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DrivePreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            SetDrivePreferencesRequest

public class zzbn
    implements android.os.Parcelable.Creator
{

    public zzbn()
    {
    }

    static void zza(SetDrivePreferencesRequest setdrivepreferencesrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, setdrivepreferencesrequest.zzCY);
        zzb.zza(parcel, 2, setdrivepreferencesrequest.zzagi, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzbr(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdg(i);
    }

    public SetDrivePreferencesRequest zzbr(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        DrivePreferences drivepreferences = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    drivepreferences = (DrivePreferences)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DrivePreferences.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SetDrivePreferencesRequest(i, drivepreferences);
            }
        } while (true);
    }

    public SetDrivePreferencesRequest[] zzdg(int i)
    {
        return new SetDrivePreferencesRequest[i];
    }
}
