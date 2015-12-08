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
//            zzod

public final class zziy extends zzod
{

    private Map zzLa;

    public zziy()
    {
        zzLa = new HashMap(4);
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = zzLa.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append("dimension").append(entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return zzA(hashmap);
    }

    public void zza(zziy zziy1)
    {
        zziy1.zzLa.putAll(zzLa);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zziy)zzod1);
    }

    public Map zzhH()
    {
        return Collections.unmodifiableMap(zzLa);
    }
}
