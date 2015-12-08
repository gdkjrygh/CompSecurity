// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqp

public static class <init>
{

    private final zzaTS zzaRQ;
    private final Map zzaTS;

    public static <init> zzBC()
    {
        return new <init>(null);
    }

    public String toString()
    {
        return (new StringBuilder()).append("Properties: ").append(zzBD()).append(" pushAfterEvaluate: ").append(zzaRQ).toString();
    }

    public zzaRQ zzAI()
    {
        return zzaRQ;
    }

    public Map zzBD()
    {
        return Collections.unmodifiableMap(zzaTS);
    }

    public void zza(String s, zzaTS zzats)
    {
        zzaTS.put(s, zzats);
    }

    private (Map map,  )
    {
        zzaTS = map;
        zzaRQ = ;
    }

    zzaRQ(Map map, zzaRQ zzarq, zzaRQ zzarq1)
    {
        this(map, zzarq);
    }
}
