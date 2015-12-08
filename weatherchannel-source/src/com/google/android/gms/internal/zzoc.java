// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzoc extends zznq
{

    public boolean zzaEI;
    public String zzakM;

    public zzoc()
    {
    }

    public String getDescription()
    {
        return zzakM;
    }

    public void setDescription(String s)
    {
        zzakM = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("description", zzakM);
        hashmap.put("fatal", Boolean.valueOf(zzaEI));
        return zzy(hashmap);
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zzoc)zznq1);
    }

    public void zza(zzoc zzoc1)
    {
        if (!TextUtils.isEmpty(zzakM))
        {
            zzoc1.setDescription(zzakM);
        }
        if (zzaEI)
        {
            zzoc1.zzag(zzaEI);
        }
    }

    public void zzag(boolean flag)
    {
        zzaEI = flag;
    }

    public boolean zzwz()
    {
        return zzaEI;
    }
}
