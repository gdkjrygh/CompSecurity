// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import aaf;
import aag;
import aai;
import acs;
import ada;
import akk;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kp;
import mj;
import mk;
import mo;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdLauncherIntentInfoParcel

public final class AdOverlayInfoParcel
    implements SafeParcelable
{

    public static final mj CREATOR = new mj();
    public final int a;
    public final AdLauncherIntentInfoParcel b;
    public final kp c;
    public final mk d;
    public final akk e;
    public final acs f;
    public final String g;
    public final boolean h;
    public final String i;
    public final mo j;
    public final int k;
    public final int l;
    public final String m;
    public final VersionInfoParcel n;
    public final ada o;
    public final String p;
    public final InterstitialAdParameterParcel q;

    public AdOverlayInfoParcel(int i1, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j1, int k1, String s2, VersionInfoParcel versioninfoparcel, 
            IBinder ibinder5, String s3, InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        a = i1;
        b = adlauncherintentinfoparcel;
        c = (kp)aai.a(aag.a(ibinder));
        d = (mk)aai.a(aag.a(ibinder1));
        e = (akk)aai.a(aag.a(ibinder2));
        f = (acs)aai.a(aag.a(ibinder3));
        g = s;
        h = flag;
        i = s1;
        j = (mo)aai.a(aag.a(ibinder4));
        k = j1;
        l = k1;
        m = s2;
        n = versioninfoparcel;
        o = (ada)aai.a(aag.a(ibinder5));
        p = s3;
        q = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, kp kp1, mk mk1, mo mo1, VersionInfoParcel versioninfoparcel)
    {
        a = 4;
        b = adlauncherintentinfoparcel;
        c = kp1;
        d = mk1;
        e = null;
        f = null;
        g = null;
        h = false;
        i = null;
        j = mo1;
        k = -1;
        l = 4;
        m = null;
        n = versioninfoparcel;
        o = null;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(kp kp1, mk mk1, acs acs1, mo mo1, akk akk1, boolean flag, int i1, 
            String s, VersionInfoParcel versioninfoparcel, ada ada1)
    {
        a = 4;
        b = null;
        c = kp1;
        d = mk1;
        e = akk1;
        f = acs1;
        g = null;
        h = flag;
        i = null;
        j = mo1;
        k = i1;
        l = 3;
        m = s;
        n = versioninfoparcel;
        o = ada1;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(kp kp1, mk mk1, acs acs1, mo mo1, akk akk1, boolean flag, int i1, 
            String s, String s1, VersionInfoParcel versioninfoparcel, ada ada1)
    {
        a = 4;
        b = null;
        c = kp1;
        d = mk1;
        e = akk1;
        f = acs1;
        g = s1;
        h = flag;
        i = s;
        j = mo1;
        k = i1;
        l = 3;
        m = null;
        n = versioninfoparcel;
        o = ada1;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(kp kp1, mk mk1, mo mo1, akk akk1, int i1, VersionInfoParcel versioninfoparcel, String s, 
            InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        a = 4;
        b = null;
        c = kp1;
        d = mk1;
        e = akk1;
        f = null;
        g = null;
        h = false;
        i = null;
        j = mo1;
        k = i1;
        l = 1;
        m = null;
        n = versioninfoparcel;
        o = null;
        p = s;
        q = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(kp kp1, mk mk1, mo mo1, akk akk1, boolean flag, int i1, VersionInfoParcel versioninfoparcel)
    {
        a = 4;
        b = null;
        c = kp1;
        d = mk1;
        e = akk1;
        f = null;
        g = null;
        h = flag;
        i = null;
        j = mo1;
        k = i1;
        l = 2;
        m = null;
        n = versioninfoparcel;
        o = null;
        p = null;
        q = null;
    }

    public static AdOverlayInfoParcel a(Intent intent)
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

    public static void a(Intent intent, AdOverlayInfoParcel adoverlayinfoparcel)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adoverlayinfoparcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final IBinder a()
    {
        return aai.a(c).asBinder();
    }

    public final IBinder b()
    {
        return aai.a(d).asBinder();
    }

    public final IBinder c()
    {
        return aai.a(e).asBinder();
    }

    public final IBinder d()
    {
        return aai.a(f).asBinder();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final IBinder e()
    {
        return aai.a(o).asBinder();
    }

    public final IBinder f()
    {
        return aai.a(j).asBinder();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        mj.a(this, parcel, i1);
    }

}
