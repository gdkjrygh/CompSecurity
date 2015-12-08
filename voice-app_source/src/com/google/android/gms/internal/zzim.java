// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzim extends zznq
{

    private Map zzJa;

    public zzim()
    {
        zzJa = new HashMap(4);
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = zzJa.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append("dimension").append(entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return zzy(hashmap);
    }

    public void zza(zzim zzim1)
    {
        zzim1.zzJa.putAll(zzJa);
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zzim)zznq1);
    }

    public Map zzht()
    {
        return Collections.unmodifiableMap(zzJa);
    }
}
