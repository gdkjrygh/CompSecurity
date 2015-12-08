// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcj;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zza, zzh

public class zzd extends com.google.android.gms.internal.zzcn.zza
    implements zzh.zza
{

    private final Bundle mExtras;
    private final Object zzpc = new Object();
    private final String zzvK;
    private final List zzvL;
    private final String zzvM;
    private final zzcj zzvN;
    private final String zzvO;
    private final double zzvP;
    private final String zzvQ;
    private final String zzvR;
    private final zza zzvS;
    private zzh zzvT;

    public zzd(String s, List list, String s1, zzcj zzcj, String s2, double d, 
            String s3, String s4, zza zza1, Bundle bundle)
    {
        zzvK = s;
        zzvL = list;
        zzvM = s1;
        zzvN = zzcj;
        zzvO = s2;
        zzvP = d;
        zzvQ = s3;
        zzvR = s4;
        zzvS = zza1;
        mExtras = bundle;
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

    public String getPrice()
    {
        return zzvR;
    }

    public double getStarRating()
    {
        return zzvP;
    }

    public String getStore()
    {
        return zzvQ;
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

    public zzcj zzds()
    {
        return zzvN;
    }

    public com.google.android.gms.dynamic.zzd zzdt()
    {
        return zze.zzx(zzvT);
    }

    public String zzdu()
    {
        return "2";
    }

    public zza zzdv()
    {
        return zzvS;
    }
}
