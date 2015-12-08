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
import com.google.android.gms.internal.zzde;
import com.google.android.gms.internal.zzdi;
import com.google.android.gms.internal.zzid;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zze, zzf, zzk, AdLauncherIntentInfoParcel

public final class AdOverlayInfoParcel
    implements SafeParcelable
{

    public static final com.google.android.gms.ads.internal.overlay.zze CREATOR = new com.google.android.gms.ads.internal.overlay.zze();
    public final int orientation;
    public final int versionCode;
    public final VersionInfoParcel zzpJ;
    public final AdLauncherIntentInfoParcel zzzB;
    public final zza zzzC;
    public final zzf zzzD;
    public final zzid zzzE;
    public final zzde zzzF;
    public final String zzzG;
    public final boolean zzzH;
    public final String zzzI;
    public final zzk zzzJ;
    public final int zzzK;
    public final zzdi zzzL;
    public final String zzzM;
    public final InterstitialAdParameterParcel zzzN;
    public final String zzzf;

    AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, VersionInfoParcel versioninfoparcel, 
            IBinder ibinder5, String s3, InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        versionCode = i;
        zzzB = adlauncherintentinfoparcel;
        zzzC = (zza)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder));
        zzzD = (zzf)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder1));
        zzzE = (zzid)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder2));
        zzzF = (zzde)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder3));
        zzzG = s;
        zzzH = flag;
        zzzI = s1;
        zzzJ = (zzk)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder4));
        orientation = j;
        zzzK = k;
        zzzf = s2;
        zzpJ = versioninfoparcel;
        zzzL = (zzdi)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder5));
        zzzM = s3;
        zzzN = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(zza zza1, zzf zzf1, zzk zzk1, zzid zzid1, int i, VersionInfoParcel versioninfoparcel, String s, 
            InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        versionCode = 4;
        zzzB = null;
        zzzC = zza1;
        zzzD = zzf1;
        zzzE = zzid1;
        zzzF = null;
        zzzG = null;
        zzzH = false;
        zzzI = null;
        zzzJ = zzk1;
        orientation = i;
        zzzK = 1;
        zzzf = null;
        zzpJ = versioninfoparcel;
        zzzL = null;
        zzzM = s;
        zzzN = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(zza zza1, zzf zzf1, zzk zzk1, zzid zzid1, boolean flag, int i, VersionInfoParcel versioninfoparcel)
    {
        versionCode = 4;
        zzzB = null;
        zzzC = zza1;
        zzzD = zzf1;
        zzzE = zzid1;
        zzzF = null;
        zzzG = null;
        zzzH = flag;
        zzzI = null;
        zzzJ = zzk1;
        orientation = i;
        zzzK = 2;
        zzzf = null;
        zzpJ = versioninfoparcel;
        zzzL = null;
        zzzM = null;
        zzzN = null;
    }

    public AdOverlayInfoParcel(zza zza1, zzf zzf1, zzde zzde1, zzk zzk1, zzid zzid1, boolean flag, int i, 
            String s, VersionInfoParcel versioninfoparcel, zzdi zzdi1)
    {
        versionCode = 4;
        zzzB = null;
        zzzC = zza1;
        zzzD = zzf1;
        zzzE = zzid1;
        zzzF = zzde1;
        zzzG = null;
        zzzH = flag;
        zzzI = null;
        zzzJ = zzk1;
        orientation = i;
        zzzK = 3;
        zzzf = s;
        zzpJ = versioninfoparcel;
        zzzL = zzdi1;
        zzzM = null;
        zzzN = null;
    }

    public AdOverlayInfoParcel(zza zza1, zzf zzf1, zzde zzde1, zzk zzk1, zzid zzid1, boolean flag, int i, 
            String s, String s1, VersionInfoParcel versioninfoparcel, zzdi zzdi1)
    {
        versionCode = 4;
        zzzB = null;
        zzzC = zza1;
        zzzD = zzf1;
        zzzE = zzid1;
        zzzF = zzde1;
        zzzG = s1;
        zzzH = flag;
        zzzI = s;
        zzzJ = zzk1;
        orientation = i;
        zzzK = 3;
        zzzf = null;
        zzpJ = versioninfoparcel;
        zzzL = zzdi1;
        zzzM = null;
        zzzN = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, zza zza1, zzf zzf1, zzk zzk1, VersionInfoParcel versioninfoparcel)
    {
        versionCode = 4;
        zzzB = adlauncherintentinfoparcel;
        zzzC = zza1;
        zzzD = zzf1;
        zzzE = null;
        zzzF = null;
        zzzG = null;
        zzzH = false;
        zzzI = null;
        zzzJ = zzk1;
        orientation = -1;
        zzzK = 4;
        zzzf = null;
        zzpJ = versioninfoparcel;
        zzzL = null;
        zzzM = null;
        zzzN = null;
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
        com.google.android.gms.ads.internal.overlay.zze.zza(this, parcel, i);
    }

    IBinder zzeA()
    {
        return zze.zzw(zzzF).asBinder();
    }

    IBinder zzeB()
    {
        return zze.zzw(zzzL).asBinder();
    }

    IBinder zzeC()
    {
        return zze.zzw(zzzJ).asBinder();
    }

    IBinder zzex()
    {
        return zze.zzw(zzzC).asBinder();
    }

    IBinder zzey()
    {
        return zze.zzw(zzzD).asBinder();
    }

    IBinder zzez()
    {
        return zze.zzw(zzzE).asBinder();
    }

}
