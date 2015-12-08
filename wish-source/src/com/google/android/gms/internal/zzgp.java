// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzv;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzgp extends zzki
{

    private String zzFf;
    private String zzFg;
    private String zzFh;
    private String zzFi;
    private boolean zzFj;
    private String zzFk;
    private boolean zzFl;
    private double zzFm;

    public zzgp()
    {
    }

    public String getClientId()
    {
        return zzFg;
    }

    public void setClientId(String s)
    {
        zzFg = s;
    }

    public void setSampleRate(double d)
    {
        boolean flag;
        if (d >= 0.0D && d <= 100D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "Sample rate must be between 0% and 100%");
        zzFm = d;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("hitType", zzFf);
        hashmap.put("clientId", zzFg);
        hashmap.put("userId", zzFh);
        hashmap.put("androidAdId", zzFi);
        hashmap.put("AdTargetingEnabled", Boolean.valueOf(zzFj));
        hashmap.put("sessionControl", zzFk);
        hashmap.put("nonInteraction", Boolean.valueOf(zzFl));
        hashmap.put("sampleRate", Double.valueOf(zzFm));
        return zzu(hashmap);
    }

    public void zzE(boolean flag)
    {
        zzFj = flag;
    }

    public void zzF(boolean flag)
    {
        zzFl = flag;
    }

    public void zza(zzgp zzgp1)
    {
        if (!TextUtils.isEmpty(zzFf))
        {
            zzgp1.zzay(zzFf);
        }
        if (!TextUtils.isEmpty(zzFg))
        {
            zzgp1.setClientId(zzFg);
        }
        if (!TextUtils.isEmpty(zzFh))
        {
            zzgp1.zzaz(zzFh);
        }
        if (!TextUtils.isEmpty(zzFi))
        {
            zzgp1.zzaA(zzFi);
        }
        if (zzFj)
        {
            zzgp1.zzE(true);
        }
        if (!TextUtils.isEmpty(zzFk))
        {
            zzgp1.zzaB(zzFk);
        }
        if (zzFl)
        {
            zzgp1.zzF(zzFl);
        }
        if (zzFm != 0.0D)
        {
            zzgp1.setSampleRate(zzFm);
        }
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzgp)zzki1);
    }

    public void zzaA(String s)
    {
        zzFi = s;
    }

    public void zzaB(String s)
    {
        zzFk = s;
    }

    public void zzay(String s)
    {
        zzFf = s;
    }

    public void zzaz(String s)
    {
        zzFh = s;
    }

    public String zzgk()
    {
        return zzFf;
    }

    public String zzgl()
    {
        return zzFh;
    }

    public String zzgm()
    {
        return zzFi;
    }

    public boolean zzgn()
    {
        return zzFj;
    }

    public String zzgo()
    {
        return zzFk;
    }

    public boolean zzgp()
    {
        return zzFl;
    }

    public double zzgq()
    {
        return zzFm;
    }
}
