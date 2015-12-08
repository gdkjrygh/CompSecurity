// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzcj;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zza, zzh

public class zze extends com.google.android.gms.internal.zzcp.zza
    implements zzh.zza
{

    private final Bundle mExtras;
    private final Object zzpc = new Object();
    private final String zzvK;
    private final List zzvL;
    private final String zzvM;
    private final String zzvO;
    private final zza zzvS;
    private zzh zzvT;
    private final zzcj zzvU;
    private final String zzvV;

    public zze(String s, List list, String s1, zzcj zzcj, String s2, String s3, zza zza1, 
            Bundle bundle)
    {
        zzvK = s;
        zzvL = list;
        zzvM = s1;
        zzvU = zzcj;
        zzvO = s2;
        zzvV = s3;
        zzvS = zza1;
        mExtras = bundle;
    }

    public String getAdvertiser()
    {
        return zzvV;
    }

    public String getBody()
    {
        return zzvM;
    }

    public String getCallToAction()
    {
        return zzvO;
    }

    public String getCustomTemplateId()
    {
        return "";
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public String getHeadline()
    {
        return zzvK;
    }

    public List getImages()
    {
        return zzvL;
    }

    public void zza(zzh zzh)
    {
        synchronized (zzpc)
        {
            zzvT = zzh;
        }
        return;
        zzh;
        obj;
        JVM INSTR monitorexit ;
        throw zzh;
    }

    public zzd zzdt()
    {
        return com.google.android.gms.dynamic.zze.zzx(zzvT);
    }

    public String zzdu()
    {
        return "1";
    }

    public zza zzdv()
    {
        return zzvS;
    }

    public zzcj zzdw()
    {
        return zzvU;
    }
}
