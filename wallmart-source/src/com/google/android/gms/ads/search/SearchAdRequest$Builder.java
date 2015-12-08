// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;

// Referenced classes of package com.google.android.gms.ads.search:
//            SearchAdRequest

public static final class zzJS
{

    private int zzJN;
    private int zzJO;
    private int zzJP;
    private int zzJQ;
    private int zzJR;
    private int zzJS;
    private int zzJT;
    private String zzJU;
    private int zzJV;
    private String zzJW;
    private int zzJX;
    private int zzJY;
    private String zzJZ;
    private final com.google.android.gms.ads.internal.client. zznO = new com.google.android.gms.ads.internal.client.();
    private int zzvF;

    static int zza(zzJS zzjs)
    {
        return zzjs.zzJN;
    }

    static int zzb(zzJN zzjn)
    {
        return zzjn.zzvF;
    }

    static int zzc(zzvF zzvf)
    {
        return zzvf.zzJO;
    }

    static int zzd(zzJO zzjo)
    {
        return zzjo.zzJP;
    }

    static int zze(zzJP zzjp)
    {
        return zzjp.zzJQ;
    }

    static int zzf(zzJQ zzjq)
    {
        return zzjq.zzJR;
    }

    static int zzg(zzJR zzjr)
    {
        return zzjr.zzJS;
    }

    static int zzh(zzJS zzjs)
    {
        return zzjs.zzJT;
    }

    static String zzi(zzJT zzjt)
    {
        return zzjt.zzJU;
    }

    static int zzj(zzJU zzju)
    {
        return zzju.zzJV;
    }

    static String zzk(zzJV zzjv)
    {
        return zzjv.zzJW;
    }

    static int zzl(zzJW zzjw)
    {
        return zzjw.zzJX;
    }

    static int zzm(zzJX zzjx)
    {
        return zzjx.zzJY;
    }

    static String zzn(zzJY zzjy)
    {
        return zzjy.zzJZ;
    }

    static com.google.android.gms.ads.internal.client. zzo(zzJZ zzjz)
    {
        return zzjz.zznO;
    }

    public zznO addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        zznO.(class1, bundle);
        return this;
    }

    public zznO addNetworkExtras(NetworkExtras networkextras)
    {
        zznO.(networkextras);
        return this;
    }

    public zznO addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zznO.(class1, bundle);
        return this;
    }

    public zznO addTestDevice(String s)
    {
        zznO.(s);
        return this;
    }

    public SearchAdRequest build()
    {
        return new SearchAdRequest(this, null);
    }

    public zznO setAnchorTextColor(int i)
    {
        zzJN = i;
        return this;
    }

    public zzJN setBackgroundColor(int i)
    {
        zzvF = i;
        zzJO = Color.argb(0, 0, 0, 0);
        zzJP = Color.argb(0, 0, 0, 0);
        return this;
    }

    public zzJP setBackgroundGradient(int i, int j)
    {
        zzvF = Color.argb(0, 0, 0, 0);
        zzJO = j;
        zzJP = i;
        return this;
    }

    public zzJP setBorderColor(int i)
    {
        zzJQ = i;
        return this;
    }

    public zzJQ setBorderThickness(int i)
    {
        zzJR = i;
        return this;
    }

    public zzJR setBorderType(int i)
    {
        zzJS = i;
        return this;
    }

    public zzJS setCallButtonColor(int i)
    {
        zzJT = i;
        return this;
    }

    public zzJT setCustomChannels(String s)
    {
        zzJU = s;
        return this;
    }

    public zzJU setDescriptionTextColor(int i)
    {
        zzJV = i;
        return this;
    }

    public zzJV setFontFace(String s)
    {
        zzJW = s;
        return this;
    }

    public zzJW setHeaderTextColor(int i)
    {
        zzJX = i;
        return this;
    }

    public zzJX setHeaderTextSize(int i)
    {
        zzJY = i;
        return this;
    }

    public zzJY setLocation(Location location)
    {
        zznO.(location);
        return this;
    }

    public zznO setQuery(String s)
    {
        zzJZ = s;
        return this;
    }

    public zzJZ setRequestAgent(String s)
    {
        zznO.(s);
        return this;
    }

    public zznO tagForChildDirectedTreatment(boolean flag)
    {
        zznO.(flag);
        return this;
    }

    public ()
    {
        zzJS = 0;
    }
}
