// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzck;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzc, zza, zzg

public class zzd extends com.google.android.gms.internal.zzco.zza
    implements zzg.zza
{

    private final Object zzqt = new Object();
    private final String zzvh;
    private final List zzvi;
    private final String zzvj;
    private final zzc zzvk;
    private final String zzvl;
    private final double zzvm;
    private final String zzvn;
    private final String zzvo;
    private final zza zzvp;
    private zzg zzvq;

    public zzd(String s, List list, String s1, zzc zzc, String s2, double d, 
            String s3, String s4, zza zza1)
    {
        zzvh = s;
        zzvi = list;
        zzvj = s1;
        zzvk = zzc;
        zzvl = s2;
        zzvm = d;
        zzvn = s3;
        zzvo = s4;
        zzvp = zza1;
    }

    public String getBody()
    {
        return zzvj;
    }

    public String getCustomTemplateId()
    {
        return "";
    }

    public List getImages()
    {
        return zzvi;
    }

    public void zza(zzg zzg)
    {
        synchronized (zzqt)
        {
            zzvq = zzg;
        }
        return;
        zzg;
        obj;
        JVM INSTR monitorexit ;
        throw zzg;
    }

    public double zzdA()
    {
        return zzvm;
    }

    public String zzdB()
    {
        return zzvn;
    }

    public String zzdC()
    {
        return zzvo;
    }

    public com.google.android.gms.dynamic.zzd zzdD()
    {
        return zze.zzw(zzvq);
    }

    public String zzdE()
    {
        return "2";
    }

    public zza zzdF()
    {
        return zzvp;
    }

    public String zzdx()
    {
        return zzvh;
    }

    public zzck zzdy()
    {
        return zzvk;
    }

    public String zzdz()
    {
        return zzvl;
    }
}
