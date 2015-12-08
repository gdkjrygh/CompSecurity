// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel, LargeParcelTeleporter

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(AdResponseParcel adresponseparcel, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, adresponseparcel.versionCode);
        zzb.zza(parcel, 2, adresponseparcel.zzAT, false);
        zzb.zza(parcel, 3, adresponseparcel.body, false);
        zzb.zzb(parcel, 4, adresponseparcel.zzyw, false);
        zzb.zzc(parcel, 5, adresponseparcel.errorCode);
        zzb.zzb(parcel, 6, adresponseparcel.zzyx, false);
        zzb.zza(parcel, 7, adresponseparcel.zzDW);
        zzb.zza(parcel, 8, adresponseparcel.zzDX);
        zzb.zza(parcel, 9, adresponseparcel.zzDY);
        zzb.zzb(parcel, 10, adresponseparcel.zzDZ, false);
        zzb.zza(parcel, 11, adresponseparcel.zzyA);
        zzb.zzc(parcel, 12, adresponseparcel.orientation);
        zzb.zza(parcel, 13, adresponseparcel.zzEa, false);
        zzb.zza(parcel, 14, adresponseparcel.zzEb);
        zzb.zza(parcel, 15, adresponseparcel.zzEc, false);
        zzb.zza(parcel, 19, adresponseparcel.zzEe, false);
        zzb.zza(parcel, 18, adresponseparcel.zzEd);
        zzb.zza(parcel, 21, adresponseparcel.zzEf, false);
        zzb.zza(parcel, 23, adresponseparcel.zzsJ);
        zzb.zza(parcel, 22, adresponseparcel.zzEg);
        zzb.zza(parcel, 25, adresponseparcel.zzEh);
        zzb.zza(parcel, 24, adresponseparcel.zzDG);
        zzb.zzc(parcel, 27, adresponseparcel.zzEj);
        zzb.zza(parcel, 26, adresponseparcel.zzEi);
        zzb.zza(parcel, 29, adresponseparcel.zzEl, false);
        zzb.zza(parcel, 28, adresponseparcel.zzEk, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzk(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzD(i);
    }

    public AdResponseParcel[] zzD(int i)
    {
        return new AdResponseParcel[i];
    }

    public AdResponseParcel zzk(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int l = 0;
        String s6 = null;
        String s5 = null;
        java.util.ArrayList arraylist2 = null;
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        long l4 = 0L;
        boolean flag6 = false;
        long l3 = 0L;
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
        int j = 0;
        String s4 = null;
        long l1 = 0L;
        String s3 = null;
        boolean flag5 = false;
        String s2 = null;
        String s1 = null;
        boolean flag4 = false;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        int i = 0;
        LargeParcelTeleporter largeparcelteleporter = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(j1))
                {
                case 16: // '\020'
                case 17: // '\021'
                case 20: // '\024'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 4: // '\004'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, j1);
                    break;

                case 7: // '\007'
                    l4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 8: // '\b'
                    flag6 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 9: // '\t'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, j1);
                    break;

                case 11: // '\013'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 12: // '\f'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 13: // '\r'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 14: // '\016'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 15: // '\017'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 19: // '\023'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 18: // '\022'
                    flag5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 21: // '\025'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 23: // '\027'
                    flag3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 22: // '\026'
                    flag4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 25: // '\031'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 24: // '\030'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 27: // '\033'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 26: // '\032'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 29: // '\035'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 28: // '\034'
                    largeparcelteleporter = (LargeParcelTeleporter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, LargeParcelTeleporter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new AdResponseParcel(l, s6, s5, arraylist2, k, arraylist1, l4, flag6, l3, arraylist, l2, j, s4, l1, s3, flag5, s2, s1, flag4, flag3, flag2, flag1, flag, i, largeparcelteleporter, s);
            }
        } while (true);
    }
}
