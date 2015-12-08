// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.server:
//            FavaDiagnosticsEntity

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(FavaDiagnosticsEntity favadiagnosticsentity, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, favadiagnosticsentity.mVersionCode);
        zzb.zza(parcel, 2, favadiagnosticsentity.zzaeI, false);
        zzb.zzc(parcel, 3, favadiagnosticsentity.zzaeJ);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzal(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbK(i);
    }

    public FavaDiagnosticsEntity zzal(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new FavaDiagnosticsEntity(i, s, j);
            }
        } while (true);
    }

    public FavaDiagnosticsEntity[] zzbK(int i)
    {
        return new FavaDiagnosticsEntity[i];
    }
}
