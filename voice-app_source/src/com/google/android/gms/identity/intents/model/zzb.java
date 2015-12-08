// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//            UserAddress

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(UserAddress useraddress, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, useraddress.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, useraddress.name, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, useraddress.zzawA, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, useraddress.zzawB, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, useraddress.zzawC, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, useraddress.zzawD, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 7, useraddress.zzawE, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 8, useraddress.zzawF, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 9, useraddress.zzawG, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 10, useraddress.zzEr, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 11, useraddress.zzawH, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 12, useraddress.zzawI, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 13, useraddress.zzawJ, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 14, useraddress.zzawK);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 15, useraddress.zzawL, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 16, useraddress.zzawM, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzea(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgm(i);
    }

    public UserAddress zzea(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s13 = null;
        String s12 = null;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        boolean flag = false;
        String s1 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s13 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s12 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    s11 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 5: // '\005'
                    s10 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 6: // '\006'
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 8: // '\b'
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 9: // '\t'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 10: // '\n'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 11: // '\013'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 12: // '\f'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 13: // '\r'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 14: // '\016'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 15: // '\017'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 16: // '\020'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new UserAddress(i, s13, s12, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, flag, s1, s);
            }
        } while (true);
    }

    public UserAddress[] zzgm(int i)
    {
        return new UserAddress[i];
    }
}
