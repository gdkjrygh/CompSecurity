// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzos extends zzod
{

    public String mCategory;
    public String zzaID;
    public String zzaIP;
    public long zzaIQ;

    public zzos()
    {
    }

    public String getLabel()
    {
        return zzaID;
    }

    public long getTimeInMillis()
    {
        return zzaIQ;
    }

    public void setTimeInMillis(long l)
    {
        zzaIQ = l;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("variableName", zzaIP);
        hashmap.put("timeInMillis", Long.valueOf(zzaIQ));
        hashmap.put("category", mCategory);
        hashmap.put("label", zzaID);
        return zzA(hashmap);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzos)zzod1);
    }

    public void zza(zzos zzos1)
    {
        if (!TextUtils.isEmpty(zzaIP))
        {
            zzos1.zzdY(zzaIP);
        }
        if (zzaIQ != 0L)
        {
            zzos1.setTimeInMillis(zzaIQ);
        }
        if (!TextUtils.isEmpty(mCategory))
        {
            zzos1.zzdR(mCategory);
        }
        if (!TextUtils.isEmpty(zzaID))
        {
            zzos1.zzdT(zzaID);
        }
    }

    public void zzdR(String s)
    {
        mCategory = s;
    }

    public void zzdT(String s)
    {
        zzaID = s;
    }

    public void zzdY(String s)
    {
        zzaIP = s;
    }

    public String zzxQ()
    {
        return mCategory;
    }

    public String zzyb()
    {
        return zzaIP;
    }
}
