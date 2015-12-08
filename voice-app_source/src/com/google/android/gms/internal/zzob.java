// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzob extends zznq
{

    private String mCategory;
    private String zzaEH;
    private long zzaoL;
    private String zzuO;

    public zzob()
    {
    }

    public String getAction()
    {
        return zzuO;
    }

    public String getLabel()
    {
        return zzaEH;
    }

    public long getValue()
    {
        return zzaoL;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("category", mCategory);
        hashmap.put("action", zzuO);
        hashmap.put("label", zzaEH);
        hashmap.put("value", Long.valueOf(zzaoL));
        return zzy(hashmap);
    }

    public void zzM(long l)
    {
        zzaoL = l;
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zzob)zznq1);
    }

    public void zza(zzob zzob1)
    {
        if (!TextUtils.isEmpty(mCategory))
        {
            zzob1.zzdG(mCategory);
        }
        if (!TextUtils.isEmpty(zzuO))
        {
            zzob1.zzdH(zzuO);
        }
        if (!TextUtils.isEmpty(zzaEH))
        {
            zzob1.zzdI(zzaEH);
        }
        if (zzaoL != 0L)
        {
            zzob1.zzM(zzaoL);
        }
    }

    public void zzdG(String s)
    {
        mCategory = s;
    }

    public void zzdH(String s)
    {
        zzuO = s;
    }

    public void zzdI(String s)
    {
        zzaEH = s;
    }

    public String zzwy()
    {
        return mCategory;
    }
}
