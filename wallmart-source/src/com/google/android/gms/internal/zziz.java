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

public final class zziz extends zzod
{

    private Map zzLb;

    public zziz()
    {
        zzLb = new HashMap(4);
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = zzLb.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append("metric").append(entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return zzA(hashmap);
    }

    public void zza(zziz zziz1)
    {
        zziz1.zzLb.putAll(zzLb);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zziz)zzod1);
    }

    public Map zzhI()
    {
        return Collections.unmodifiableMap(zzLb);
    }
}
