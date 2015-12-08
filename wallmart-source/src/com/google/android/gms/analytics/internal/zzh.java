// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzh
{

    private final long zzLS;
    private final String zzLT;
    private final boolean zzLU;
    private long zzLV;
    private final String zzLd;
    private final Map zzvs;

    public zzh(long l, String s, String s1, boolean flag, long l1, 
            Map map)
    {
        zzx.zzcs(s);
        zzx.zzcs(s1);
        zzLS = l;
        zzLd = s;
        zzLT = s1;
        zzLU = flag;
        zzLV = l1;
        if (map != null)
        {
            zzvs = new HashMap(map);
            return;
        } else
        {
            zzvs = Collections.emptyMap();
            return;
        }
    }

    public String getClientId()
    {
        return zzLd;
    }

    public long zziw()
    {
        return zzLS;
    }

    public String zzix()
    {
        return zzLT;
    }

    public boolean zziy()
    {
        return zzLU;
    }

    public long zziz()
    {
        return zzLV;
    }

    public Map zzn()
    {
        return zzvs;
    }

    public void zzn(long l)
    {
        zzLV = l;
    }
}
