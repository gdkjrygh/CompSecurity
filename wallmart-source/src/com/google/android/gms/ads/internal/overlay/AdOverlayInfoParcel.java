// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdd;
import com.google.android.gms.internal.zzdi;
import com.google.android.gms.internal.zzip;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzf, zzg, zzn, AdLauncherIntentInfoParcel

public final class AdOverlayInfoParcel
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    public final int orientation;
    public final String url;
    public final int versionCode;
    public final AdLauncherIntentInfoParcel zzAO;
    public final zza zzAP;
    public final zzg zzAQ;
    public final zzip zzAR;
    public final zzdd zzAS;
    public final String zzAT;
    public final boolean zzAU;
    public final String zzAV;
    public final zzn zzAW;
    public final int zzAX;
    public final zzdi zzAY;
    public final String zzAZ;
    public final InterstitialAdParameterParcel zzBa;
    public final VersionInfoParcel zzqb;

    AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, VersionInfoParcel versioninfoparcel, 
            IBinder ibinder5, String s3, InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        versionCode = i;
        zzAO = adlauncherintentinfoparcel;
        zzAP = (zza)zze.zzp(com.google.android.gms.dynamic.zzd.zza.zzbk(ibinder));
        zzAQ = (zzg)zze.zzp(com.google.android.gms.dynamic.zzd.zza.zzbk(ibinder1));
        zzAR = (zzip)zze.zzp(com.google.android.gms.dynamic.zzd.zza.zzbk(ibinder2));
        zzAS = (zzdd)zze.zzp(com.google.android.gms.dynamic.zzd.zza.zzbk(ibinder3));
        zzAT = s;
        zzAU = flag;
        zzAV = s1;
        zzAW = (zzn)zze.zzp(com.google.android.gms.dynamic.zzd.zza.zzbk(ibinder4));
        orientation = j;
        zzAX = k;
        url = s2;
        zzqb = versioninfoparcel;
        zzAY = (zzdi)zze.zzp(com.google.android.gms.dynamic.zzd.zza.zzbk(ibinder5));
        zzAZ = s3;
        zzBa = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(zza zza1, zzg zzg1, zzn zzn1, zzip zzip1, int i, VersionInfoParcel versioninfoparcel, String s, 
            InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        versionCode = 4;
        zzAO = null;
        zzAP = zza1;
        zzAQ = zzg1;
        zzAR = zzip1;
        zzAS = null;
        zzAT = null;
        zzAU = false;
        zzAV = null;
        zzAW = zzn1;
        orientation = i;
        zzAX = 1;
        url = null;
        zzqb = versioninfoparcel;
        zzAY = null;
        zzAZ = s;
        zzBa = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(zza zza1, zzg zzg1, zzn zzn1, zzip zzip1, boolean flag, int i, VersionInfoParcel versioninfoparcel)
    {
        versionCode = 4;
        zzAO = null;
        zzAP = zza1;
        zzAQ = zzg1;
        zzAR = zzip1;
        zzAS = null;
        zzAT = null;
        zzAU = flag;
        zzAV = null;
        zzAW = zzn1;
        orientation = i;
        zzAX = 2;
        url = null;
        zzqb = versioninfoparcel;
        zzAY = null;
        zzAZ = null;
        zzBa = null;
    }

    public AdOverlayInfoParcel(zza zza1, zzg zzg1, zzdd zzdd1, zzn zzn1, zzip zzip1, boolean flag, int i, 
            String s, VersionInfoParcel versioninfoparcel, zzdi zzdi1)
    {
        versionCode = 4;
        zzAO = null;
        zzAP = zza1;
        zzAQ = zzg1;
        zzAR = zzip1;
        zzAS = zzdd1;
        zzAT = null;
        zzAU = flag;
        zzAV = null;
        zzAW = zzn1;
        orientation = i;
        zzAX = 3;
        url = s;
        zzqb = versioninfoparcel;
        zzAY = zzdi1;
        zzAZ = null;
        zzBa = null;
    }

    public AdOverlayInfoParcel(zza zza1, zzg zzg1, zzdd zzdd1, zzn zzn1, zzip zzip1, boolean flag, int i, 
            String s, String s1, VersionInfoParcel versioninfoparcel, zzdi zzdi1)
    {
        versionCode = 4;
        zzAO = null;
        zzAP = zza1;
        zzAQ = zzg1;
        zzAR = zzip1;
        zzAS = zzdd1;
        zzAT = s1;
        zzAU = flag;
        zzAV = s;
        zzAW = zzn1;
        orientation = i;
        zzAX = 3;
        url = null;
        zzqb = versioninfoparcel;
        zzAY = zzdi1;
        zzAZ = null;
        zzBa = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, zza zza1, zzg zzg1, zzn zzn1, VersionInfoParcel versioninfoparcel)
    {
        versionCode = 4;
        zzAO = adlauncherintentinfoparcel;
        zzAP = zza1;
        zzAQ = zzg1;
        zzAR = null;
        zzAS = null;
        zzAT = null;
        zzAU = false;
        zzAV = null;
        zzAW = zzn1;
        orientation = -1;
        zzAX = 4;
        url = null;
        zzqb = versioninfoparcel;
        zzAY = null;
        zzAZ = null;
        zzBa = null;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adoverlayinfoparcel)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adoverlayinfoparcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzb(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel.getClassLoader());
            intent = (AdOverlayInfoParcel)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.ads.internal.overlay.zzf.zza(this, parcel, i);
    }

    IBinder zzeE()
    {
        return zze.zzx(zzAP).asBinder();
    }

    IBinder zzeF()
    {
        return zze.zzx(zzAQ).asBinder();
    }

    IBinder zzeG()
    {
        return zze.zzx(zzAR).asBinder();
    }

    IBinder zzeH()
    {
        return zze.zzx(zzAS).asBinder();
    }

    IBinder zzeI()
    {
        return zze.zzx(zzAY).asBinder();
    }

    IBinder zzeJ()
    {
        return zze.zzx(zzAW).asBinder();
    }

}
