// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdOverlayInfoParcel, AdLauncherIntentInfoParcel

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(AdOverlayInfoParcel adoverlayinfoparcel, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, adoverlayinfoparcel.versionCode);
        zzb.zza(parcel, 2, adoverlayinfoparcel.zzAO, i, false);
        zzb.zza(parcel, 3, adoverlayinfoparcel.zzeE(), false);
        zzb.zza(parcel, 4, adoverlayinfoparcel.zzeF(), false);
        zzb.zza(parcel, 5, adoverlayinfoparcel.zzeG(), false);
        zzb.zza(parcel, 6, adoverlayinfoparcel.zzeH(), false);
        zzb.zza(parcel, 7, adoverlayinfoparcel.zzAT, false);
        zzb.zza(parcel, 8, adoverlayinfoparcel.zzAU);
        zzb.zza(parcel, 9, adoverlayinfoparcel.zzAV, false);
        zzb.zza(parcel, 10, adoverlayinfoparcel.zzeJ(), false);
        zzb.zzc(parcel, 11, adoverlayinfoparcel.orientation);
        zzb.zzc(parcel, 12, adoverlayinfoparcel.zzAX);
        zzb.zza(parcel, 13, adoverlayinfoparcel.url, false);
        zzb.zza(parcel, 14, adoverlayinfoparcel.zzqb, i, false);
        zzb.zza(parcel, 15, adoverlayinfoparcel.zzeI(), false);
        zzb.zza(parcel, 17, adoverlayinfoparcel.zzBa, i, false);
        zzb.zza(parcel, 16, adoverlayinfoparcel.zzAZ, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzh(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzw(i);
    }

    public AdOverlayInfoParcel zzh(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int k = 0;
        AdLauncherIntentInfoParcel adlauncherintentinfoparcel = null;
        android.os.IBinder ibinder5 = null;
        android.os.IBinder ibinder4 = null;
        android.os.IBinder ibinder3 = null;
        android.os.IBinder ibinder2 = null;
        String s3 = null;
        boolean flag = false;
        String s2 = null;
        android.os.IBinder ibinder1 = null;
        int j = 0;
        int i = 0;
        String s1 = null;
        VersionInfoParcel versioninfoparcel = null;
        android.os.IBinder ibinder = null;
        String s = null;
        InterstitialAdParameterParcel interstitialadparameterparcel = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    adlauncherintentinfoparcel = (AdLauncherIntentInfoParcel)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, AdLauncherIntentInfoParcel.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 11: // '\013'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 13: // '\r'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 14: // '\016'
                    versioninfoparcel = (VersionInfoParcel)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, VersionInfoParcel.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 17: // '\021'
                    interstitialadparameterparcel = (InterstitialAdParameterParcel)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, InterstitialAdParameterParcel.CREATOR);
                    break;

                case 16: // '\020'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new AdOverlayInfoParcel(k, adlauncherintentinfoparcel, ibinder5, ibinder4, ibinder3, ibinder2, s3, flag, s2, ibinder1, j, i, s1, versioninfoparcel, ibinder, s, interstitialadparameterparcel);
            }
        } while (true);
    }

    public AdOverlayInfoParcel[] zzw(int i)
    {
        return new AdOverlayInfoParcel[i];
    }
}
