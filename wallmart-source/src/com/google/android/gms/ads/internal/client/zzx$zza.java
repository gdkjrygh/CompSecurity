// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzx

public static final class zztc
{

    private Date zzaT;
    private Location zzaX;
    private boolean zzoM;
    private String zzsV;
    private int zzsW;
    private final Bundle zzsX = new Bundle();
    private String zzsZ;
    private String zzta;
    private int zztc;
    private final Bundle zzte = new Bundle();
    private final HashSet zztg = new HashSet();
    private final HashMap zzth = new HashMap();
    private final HashSet zzti = new HashSet();
    private final HashSet zztj = new HashSet();

    static Date zza(zztc zztc1)
    {
        return zztc1.zzaT;
    }

    static String zzb(zzaT zzat)
    {
        return zzat.zzsV;
    }

    static int zzc(zzsV zzsv)
    {
        return zzsv.zzsW;
    }

    static HashSet zzd(zzsW zzsw)
    {
        return zzsw.zztg;
    }

    static Location zze(zztg zztg1)
    {
        return zztg1.zzaX;
    }

    static boolean zzf(zzaX zzax)
    {
        return zzax.zzoM;
    }

    static Bundle zzg(zzoM zzom)
    {
        return zzom.zzsX;
    }

    static HashMap zzh(zzsX zzsx)
    {
        return zzsx.zzth;
    }

    static String zzi(zzth zzth1)
    {
        return zzth1.zzsZ;
    }

    static String zzj(zzsZ zzsz)
    {
        return zzsz.zzta;
    }

    static int zzk(zzta zzta1)
    {
        return zzta1.zztc;
    }

    static HashSet zzl(zztc zztc1)
    {
        return zztc1.zzti;
    }

    static Bundle zzm(zzti zzti1)
    {
        return zzti1.zzte;
    }

    static HashSet zzn(zzte zzte1)
    {
        return zzte1.zztj;
    }

    public void setManualImpressionsEnabled(boolean flag)
    {
        zzoM = flag;
    }

    public void zzF(String s)
    {
        zztg.add(s);
    }

    public void zzG(String s)
    {
        zzti.add(s);
    }

    public void zzH(String s)
    {
        zzti.remove(s);
    }

    public void zzI(String s)
    {
        zzsV = s;
    }

    public void zzJ(String s)
    {
        zzsZ = s;
    }

    public void zzK(String s)
    {
        zzta = s;
    }

    public void zzL(String s)
    {
        zztj.add(s);
    }

    public void zza(Location location)
    {
        zzaX = location;
    }

    public void zza(NetworkExtras networkextras)
    {
        if (networkextras instanceof AdMobExtras)
        {
            zza(com/google/ads/mediation/admob/AdMobAdapter, ((AdMobExtras)networkextras).getExtras());
            return;
        } else
        {
            zzth.put(networkextras.getClass(), networkextras);
            return;
        }
    }

    public void zza(Class class1, Bundle bundle)
    {
        zzsX.putBundle(class1.getName(), bundle);
    }

    public void zza(Date date)
    {
        zzaT = date;
    }

    public void zzb(Class class1, Bundle bundle)
    {
        if (zzsX.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
        {
            zzsX.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        zzsX.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
    }

    public void zzb(String s, String s1)
    {
        zzte.putString(s, s1);
    }

    public void zzj(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        zztc = i;
    }

    public void zzm(int i)
    {
        zzsW = i;
    }

    public ras()
    {
        zzsW = -1;
        zzoM = false;
        zztc = -1;
    }
}
