// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzjb extends zzod
{

    private String zzGh;
    private String zzLc;
    private String zzLd;
    private String zzLe;
    private boolean zzLf;
    private String zzLg;
    private boolean zzLh;
    private double zzLi;

    public zzjb()
    {
    }

    public String getClientId()
    {
        return zzLd;
    }

    public String getUserId()
    {
        return zzGh;
    }

    public void setClientId(String s)
    {
        zzLd = s;
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
        zzx.zzb(flag, "Sample rate must be between 0% and 100%");
        zzLi = d;
    }

    public void setUserId(String s)
    {
        zzGh = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("hitType", zzLc);
        hashmap.put("clientId", zzLd);
        hashmap.put("userId", zzGh);
        hashmap.put("androidAdId", zzLe);
        hashmap.put("AdTargetingEnabled", Boolean.valueOf(zzLf));
        hashmap.put("sessionControl", zzLg);
        hashmap.put("nonInteraction", Boolean.valueOf(zzLh));
        hashmap.put("sampleRate", Double.valueOf(zzLi));
        return zzA(hashmap);
    }

    public void zzG(boolean flag)
    {
        zzLf = flag;
    }

    public void zzH(boolean flag)
    {
        zzLh = flag;
    }

    public void zza(zzjb zzjb1)
    {
        if (!TextUtils.isEmpty(zzLc))
        {
            zzjb1.zzaS(zzLc);
        }
        if (!TextUtils.isEmpty(zzLd))
        {
            zzjb1.setClientId(zzLd);
        }
        if (!TextUtils.isEmpty(zzGh))
        {
            zzjb1.setUserId(zzGh);
        }
        if (!TextUtils.isEmpty(zzLe))
        {
            zzjb1.zzaT(zzLe);
        }
        if (zzLf)
        {
            zzjb1.zzG(true);
        }
        if (!TextUtils.isEmpty(zzLg))
        {
            zzjb1.zzaU(zzLg);
        }
        if (zzLh)
        {
            zzjb1.zzH(zzLh);
        }
        if (zzLi != 0.0D)
        {
            zzjb1.setSampleRate(zzLi);
        }
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzjb)zzod1);
    }

    public void zzaS(String s)
    {
        zzLc = s;
    }

    public void zzaT(String s)
    {
        zzLe = s;
    }

    public void zzaU(String s)
    {
        zzLg = s;
    }

    public String zzhK()
    {
        return zzLc;
    }

    public String zzhL()
    {
        return zzLe;
    }

    public boolean zzhM()
    {
        return zzLf;
    }

    public String zzhN()
    {
        return zzLg;
    }

    public boolean zzhO()
    {
        return zzLh;
    }

    public double zzhP()
    {
        return zzLi;
    }
}
