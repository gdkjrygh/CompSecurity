// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzck;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zza, zzg, zzc

public class zze extends com.google.android.gms.internal.zzcq.zza
    implements zzg.zza
{

    private final Object zzqt = new Object();
    private final String zzvh;
    private final List zzvi;
    private final String zzvj;
    private final String zzvl;
    private final zza zzvp;
    private zzg zzvq;
    private final zzc zzvr;
    private final String zzvs;

    public zze(String s, List list, String s1, zzc zzc, String s2, String s3, zza zza1)
    {
        zzvh = s;
        zzvi = list;
        zzvj = s1;
        zzvr = zzc;
        zzvl = s2;
        zzvs = s3;
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

    public zzd zzdD()
    {
        return com.google.android.gms.dynamic.zze.zzw(zzvq);
    }

    public String zzdE()
    {
        return "1";
    }

    public zza zzdF()
    {
        return zzvp;
    }

    public zzck zzdG()
    {
        return zzvr;
    }

    public String zzdH()
    {
        return zzvs;
    }

    public String zzdx()
    {
        return zzvh;
    }

    public String zzdz()
    {
        return zzvl;
    }
}
