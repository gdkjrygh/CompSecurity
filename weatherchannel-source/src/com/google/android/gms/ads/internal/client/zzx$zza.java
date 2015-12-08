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

public static final class zzsJ
{

    private Date zzaQ;
    private Location zzaU;
    private String zzsB;
    private int zzsC;
    private boolean zzsD;
    private final Bundle zzsE = new Bundle();
    private String zzsG;
    private String zzsH;
    private int zzsJ;
    private final Bundle zzsL = new Bundle();
    private final HashSet zzsN = new HashSet();
    private final HashMap zzsO = new HashMap();
    private final HashSet zzsP = new HashSet();
    private final HashSet zzsQ = new HashSet();

    static Date zza(zzsJ zzsj)
    {
        return zzsj.zzaQ;
    }

    static String zzb(zzaQ zzaq)
    {
        return zzaq.zzsB;
    }

    static int zzc(zzsB zzsb)
    {
        return zzsb.zzsC;
    }

    static HashSet zzd(zzsC zzsc)
    {
        return zzsc.zzsN;
    }

    static Location zze(zzsN zzsn)
    {
        return zzsn.zzaU;
    }

    static boolean zzf(zzaU zzau)
    {
        return zzau.zzsD;
    }

    static Bundle zzg(zzsD zzsd)
    {
        return zzsd.zzsE;
    }

    static HashMap zzh(zzsE zzse)
    {
        return zzse.zzsO;
    }

    static String zzi(zzsO zzso)
    {
        return zzso.zzsG;
    }

    static String zzj(zzsG zzsg)
    {
        return zzsg.zzsH;
    }

    static int zzk(zzsH zzsh)
    {
        return zzsh.zzsJ;
    }

    static HashSet zzl(zzsJ zzsj)
    {
        return zzsj.zzsP;
    }

    static Bundle zzm(zzsP zzsp)
    {
        return zzsp.zzsL;
    }

    static HashSet zzn(zzsL zzsl)
    {
        return zzsl.zzsQ;
    }

    public void zzE(String s)
    {
        zzsN.add(s);
    }

    public void zzF(String s)
    {
        zzsP.add(s);
    }

    public void zzG(String s)
    {
        zzsP.remove(s);
    }

    public void zzH(String s)
    {
        zzsB = s;
    }

    public void zzI(String s)
    {
        zzsG = s;
    }

    public void zzJ(String s)
    {
        zzsH = s;
    }

    public void zzK(String s)
    {
        zzsQ.add(s);
    }

    public void zza(Location location)
    {
        zzaU = location;
    }

    public void zza(NetworkExtras networkextras)
    {
        if (networkextras instanceof AdMobExtras)
        {
            zza(com/google/ads/mediation/admob/AdMobAdapter, ((AdMobExtras)networkextras).getExtras());
            return;
        } else
        {
            zzsO.put(networkextras.getClass(), networkextras);
            return;
        }
    }

    public void zza(Class class1, Bundle bundle)
    {
        zzsE.putBundle(class1.getName(), bundle);
    }

    public void zza(Date date)
    {
        zzaQ = date;
    }

    public void zzb(Class class1, Bundle bundle)
    {
        if (zzsE.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
        {
            zzsE.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        zzsE.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
    }

    public void zzb(String s, String s1)
    {
        zzsL.putString(s, s1);
    }

    public void zzj(boolean flag)
    {
        zzsD = flag;
    }

    public void zzk(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        zzsJ = i;
    }

    public void zzm(int i)
    {
        zzsC = i;
    }

    public ras()
    {
        zzsC = -1;
        zzsD = false;
        zzsJ = -1;
    }
}
