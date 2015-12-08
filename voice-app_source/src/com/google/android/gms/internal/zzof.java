// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzof extends zznq
{

    public String mCategory;
    public String zzaEH;
    public String zzaET;
    public long zzaEU;

    public zzof()
    {
    }

    public String getLabel()
    {
        return zzaEH;
    }

    public long getTimeInMillis()
    {
        return zzaEU;
    }

    public void setTimeInMillis(long l)
    {
        zzaEU = l;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("variableName", zzaET);
        hashmap.put("timeInMillis", Long.valueOf(zzaEU));
        hashmap.put("category", mCategory);
        hashmap.put("label", zzaEH);
        return zzy(hashmap);
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zzof)zznq1);
    }

    public void zza(zzof zzof1)
    {
        if (!TextUtils.isEmpty(zzaET))
        {
            zzof1.zzdN(zzaET);
        }
        if (zzaEU != 0L)
        {
            zzof1.setTimeInMillis(zzaEU);
        }
        if (!TextUtils.isEmpty(mCategory))
        {
            zzof1.zzdG(mCategory);
        }
        if (!TextUtils.isEmpty(zzaEH))
        {
            zzof1.zzdI(zzaEH);
        }
    }

    public void zzdG(String s)
    {
        mCategory = s;
    }

    public void zzdI(String s)
    {
        zzaEH = s;
    }

    public void zzdN(String s)
    {
        zzaET = s;
    }

    public String zzwJ()
    {
        return zzaET;
    }

    public String zzwy()
    {
        return mCategory;
    }
}
