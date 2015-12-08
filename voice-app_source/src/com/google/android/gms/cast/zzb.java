// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.cast:
//            CastDevice

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(CastDevice castdevice, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, castdevice.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, castdevice.getDeviceId(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, castdevice.zzQM, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, castdevice.getFriendlyName(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, castdevice.getModelName(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, castdevice.getDeviceVersion(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 7, castdevice.getServicePort());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 8, castdevice.getIcons(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 9, castdevice.getCapabilities());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 10, castdevice.getStatus());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzK(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzaA(i);
    }

    public CastDevice zzK(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int j = 0;
        int k = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 7: // '\007'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 8: // '\b'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1, WebImage.CREATOR);
                    break;

                case 9: // '\t'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new CastDevice(l, s4, s3, s2, s1, s, k, arraylist, j, i);
            }
        } while (true);
    }

    public CastDevice[] zzaA(int i)
    {
        return new CastDevice[i];
    }
}
