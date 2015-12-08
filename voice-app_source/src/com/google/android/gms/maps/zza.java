// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, googlemapoptions.getVersionCode());
        zzb.zza(parcel, 2, googlemapoptions.zzvj());
        zzb.zza(parcel, 3, googlemapoptions.zzvk());
        zzb.zzc(parcel, 4, googlemapoptions.getMapType());
        zzb.zza(parcel, 5, googlemapoptions.getCamera(), i, false);
        zzb.zza(parcel, 6, googlemapoptions.zzvl());
        zzb.zza(parcel, 7, googlemapoptions.zzvm());
        zzb.zza(parcel, 8, googlemapoptions.zzvn());
        zzb.zza(parcel, 9, googlemapoptions.zzvo());
        zzb.zza(parcel, 10, googlemapoptions.zzvp());
        zzb.zza(parcel, 11, googlemapoptions.zzvq());
        zzb.zza(parcel, 12, googlemapoptions.zzvr());
        zzb.zza(parcel, 14, googlemapoptions.zzvs());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeI(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhi(i);
    }

    public GoogleMapOptions zzeI(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int j = 0;
        byte byte9 = -1;
        byte byte8 = -1;
        int i = 0;
        CameraPosition cameraposition = null;
        byte byte7 = -1;
        byte byte6 = -1;
        byte byte5 = -1;
        byte byte4 = -1;
        byte byte3 = -1;
        byte byte2 = -1;
        byte byte1 = -1;
        byte byte0 = -1;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l))
                {
                case 13: // '\r'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    byte9 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 3: // '\003'
                    byte8 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte7 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 7: // '\007'
                    byte6 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 8: // '\b'
                    byte5 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 9: // '\t'
                    byte4 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 10: // '\n'
                    byte3 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 11: // '\013'
                    byte2 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 12: // '\f'
                    byte1 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 14: // '\016'
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte9, byte8, i, cameraposition, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public GoogleMapOptions[] zzhi(int i)
    {
        return new GoogleMapOptions[i];
    }
}
