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
//            zzki

public final class zzgm extends zzki
{

    private Map zzFd;

    public zzgm()
    {
        zzFd = new HashMap(4);
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = zzFd.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append("dimension").append(entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return zzu(hashmap);
    }

    public void zza(zzgm zzgm1)
    {
        zzgm1.zzFd.putAll(zzFd);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzgm)zzki1);
    }

    public Map zzgh()
    {
        return Collections.unmodifiableMap(zzFd);
    }
}
