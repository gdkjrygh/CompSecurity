// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzja extends zzod
{

    private final Map zzvs = new HashMap();

    public zzja()
    {
    }

    private String zzaR(String s)
    {
        zzx.zzcs(s);
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.startsWith("&"))
            {
                s1 = s.substring(1);
            }
        }
        zzx.zzh(s1, "Name can not be empty or \"&\"");
        return s1;
    }

    public void set(String s, String s1)
    {
        s = zzaR(s);
        zzvs.put(s, s1);
    }

    public String toString()
    {
        return zzA(zzvs);
    }

    public void zza(zzja zzja1)
    {
        zzx.zzv(zzja1);
        zzja1.zzvs.putAll(zzvs);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzja)zzod1);
    }

    public Map zzhJ()
    {
        return Collections.unmodifiableMap(zzvs);
    }
}
