// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzny extends zznq
{

    private String mName;
    private String zzKI;
    private String zzaEA;
    private String zzaEB;
    private String zzaEC;
    private String zzaED;
    private String zzaEy;
    private String zzaEz;
    private String zzazL;
    private String zzuU;

    public zzny()
    {
    }

    public String getContent()
    {
        return zzuU;
    }

    public String getId()
    {
        return zzKI;
    }

    public String getName()
    {
        return mName;
    }

    public String getSource()
    {
        return zzazL;
    }

    public void setName(String s)
    {
        mName = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("name", mName);
        hashmap.put("source", zzazL);
        hashmap.put("medium", zzaEy);
        hashmap.put("keyword", zzaEz);
        hashmap.put("content", zzuU);
        hashmap.put("id", zzKI);
        hashmap.put("adNetworkId", zzaEA);
        hashmap.put("gclid", zzaEB);
        hashmap.put("dclid", zzaEC);
        hashmap.put("aclid", zzaED);
        return zzy(hashmap);
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zzny)zznq1);
    }

    public void zza(zzny zzny1)
    {
        if (!TextUtils.isEmpty(mName))
        {
            zzny1.setName(mName);
        }
        if (!TextUtils.isEmpty(zzazL))
        {
            zzny1.zzdx(zzazL);
        }
        if (!TextUtils.isEmpty(zzaEy))
        {
            zzny1.zzdy(zzaEy);
        }
        if (!TextUtils.isEmpty(zzaEz))
        {
            zzny1.zzdz(zzaEz);
        }
        if (!TextUtils.isEmpty(zzuU))
        {
            zzny1.zzdA(zzuU);
        }
        if (!TextUtils.isEmpty(zzKI))
        {
            zzny1.zzdB(zzKI);
        }
        if (!TextUtils.isEmpty(zzaEA))
        {
            zzny1.zzdC(zzaEA);
        }
        if (!TextUtils.isEmpty(zzaEB))
        {
            zzny1.zzdD(zzaEB);
        }
        if (!TextUtils.isEmpty(zzaEC))
        {
            zzny1.zzdE(zzaEC);
        }
        if (!TextUtils.isEmpty(zzaED))
        {
            zzny1.zzdF(zzaED);
        }
    }

    public void zzdA(String s)
    {
        zzuU = s;
    }

    public void zzdB(String s)
    {
        zzKI = s;
    }

    public void zzdC(String s)
    {
        zzaEA = s;
    }

    public void zzdD(String s)
    {
        zzaEB = s;
    }

    public void zzdE(String s)
    {
        zzaEC = s;
    }

    public void zzdF(String s)
    {
        zzaED = s;
    }

    public void zzdx(String s)
    {
        zzazL = s;
    }

    public void zzdy(String s)
    {
        zzaEy = s;
    }

    public void zzdz(String s)
    {
        zzaEz = s;
    }

    public String zzwj()
    {
        return zzaEy;
    }

    public String zzwk()
    {
        return zzaEz;
    }

    public String zzwl()
    {
        return zzaEA;
    }

    public String zzwm()
    {
        return zzaEB;
    }

    public String zzwn()
    {
        return zzaEC;
    }

    public String zzwo()
    {
        return zzaED;
    }
}
