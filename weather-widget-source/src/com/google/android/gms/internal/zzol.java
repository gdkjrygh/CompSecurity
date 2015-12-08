// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzol extends zzod
{

    private String mName;
    private String zzaDI;
    private String zzaIu;
    private String zzaIv;
    private String zzaIw;
    private String zzaIx;
    private String zzaIy;
    private String zzaIz;
    private String zzvx;
    private String zzwj;

    public zzol()
    {
    }

    public String getContent()
    {
        return zzvx;
    }

    public String getId()
    {
        return zzwj;
    }

    public String getName()
    {
        return mName;
    }

    public String getSource()
    {
        return zzaDI;
    }

    public void setName(String s)
    {
        mName = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("name", mName);
        hashmap.put("source", zzaDI);
        hashmap.put("medium", zzaIu);
        hashmap.put("keyword", zzaIv);
        hashmap.put("content", zzvx);
        hashmap.put("id", zzwj);
        hashmap.put("adNetworkId", zzaIw);
        hashmap.put("gclid", zzaIx);
        hashmap.put("dclid", zzaIy);
        hashmap.put("aclid", zzaIz);
        return zzA(hashmap);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzol)zzod1);
    }

    public void zza(zzol zzol1)
    {
        if (!TextUtils.isEmpty(mName))
        {
            zzol1.setName(mName);
        }
        if (!TextUtils.isEmpty(zzaDI))
        {
            zzol1.zzdI(zzaDI);
        }
        if (!TextUtils.isEmpty(zzaIu))
        {
            zzol1.zzdJ(zzaIu);
        }
        if (!TextUtils.isEmpty(zzaIv))
        {
            zzol1.zzdK(zzaIv);
        }
        if (!TextUtils.isEmpty(zzvx))
        {
            zzol1.zzdL(zzvx);
        }
        if (!TextUtils.isEmpty(zzwj))
        {
            zzol1.zzdM(zzwj);
        }
        if (!TextUtils.isEmpty(zzaIw))
        {
            zzol1.zzdN(zzaIw);
        }
        if (!TextUtils.isEmpty(zzaIx))
        {
            zzol1.zzdO(zzaIx);
        }
        if (!TextUtils.isEmpty(zzaIy))
        {
            zzol1.zzdP(zzaIy);
        }
        if (!TextUtils.isEmpty(zzaIz))
        {
            zzol1.zzdQ(zzaIz);
        }
    }

    public void zzdI(String s)
    {
        zzaDI = s;
    }

    public void zzdJ(String s)
    {
        zzaIu = s;
    }

    public void zzdK(String s)
    {
        zzaIv = s;
    }

    public void zzdL(String s)
    {
        zzvx = s;
    }

    public void zzdM(String s)
    {
        zzwj = s;
    }

    public void zzdN(String s)
    {
        zzaIw = s;
    }

    public void zzdO(String s)
    {
        zzaIx = s;
    }

    public void zzdP(String s)
    {
        zzaIy = s;
    }

    public void zzdQ(String s)
    {
        zzaIz = s;
    }

    public String zzxB()
    {
        return zzaIu;
    }

    public String zzxC()
    {
        return zzaIv;
    }

    public String zzxD()
    {
        return zzaIw;
    }

    public String zzxE()
    {
        return zzaIx;
    }

    public String zzxF()
    {
        return zzaIy;
    }

    public String zzxG()
    {
        return zzaIz;
    }
}
