// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzoe extends zznq
{

    public String zzaER;
    public String zzaES;
    public String zzuO;

    public zzoe()
    {
    }

    public String getAction()
    {
        return zzuO;
    }

    public String getTarget()
    {
        return zzaES;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("network", zzaER);
        hashmap.put("action", zzuO);
        hashmap.put("target", zzaES);
        return zzy(hashmap);
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zzoe)zznq1);
    }

    public void zza(zzoe zzoe1)
    {
        if (!TextUtils.isEmpty(zzaER))
        {
            zzoe1.zzdL(zzaER);
        }
        if (!TextUtils.isEmpty(zzuO))
        {
            zzoe1.zzdH(zzuO);
        }
        if (!TextUtils.isEmpty(zzaES))
        {
            zzoe1.zzdM(zzaES);
        }
    }

    public void zzdH(String s)
    {
        zzuO = s;
    }

    public void zzdL(String s)
    {
        zzaER = s;
    }

    public void zzdM(String s)
    {
        zzaES = s;
    }

    public String zzwI()
    {
        return zzaER;
    }
}
