// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzoo extends zzod
{

    private String mCategory;
    private String zzOj;
    private String zzaID;
    private long zzasE;

    public zzoo()
    {
    }

    public String getAction()
    {
        return zzOj;
    }

    public String getLabel()
    {
        return zzaID;
    }

    public long getValue()
    {
        return zzasE;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("category", mCategory);
        hashmap.put("action", zzOj);
        hashmap.put("label", zzaID);
        hashmap.put("value", Long.valueOf(zzasE));
        return zzA(hashmap);
    }

    public void zzM(long l)
    {
        zzasE = l;
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzoo)zzod1);
    }

    public void zza(zzoo zzoo1)
    {
        if (!TextUtils.isEmpty(mCategory))
        {
            zzoo1.zzdR(mCategory);
        }
        if (!TextUtils.isEmpty(zzOj))
        {
            zzoo1.zzdS(zzOj);
        }
        if (!TextUtils.isEmpty(zzaID))
        {
            zzoo1.zzdT(zzaID);
        }
        if (zzasE != 0L)
        {
            zzoo1.zzM(zzasE);
        }
    }

    public void zzdR(String s)
    {
        mCategory = s;
    }

    public void zzdS(String s)
    {
        zzOj = s;
    }

    public void zzdT(String s)
    {
        zzaID = s;
    }

    public String zzxQ()
    {
        return mCategory;
    }
}
