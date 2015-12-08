// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqp

public static class <init>
{

    private final String zzWs;
    private final List zzaTT;
    private final Map zzaTU;
    private final int zzaTV;

    public static <init> zzBF()
    {
        return new <init>(null);
    }

    public String getVersion()
    {
        return zzWs;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Rules: ").append(zzBG()).append("  Macros: ").append(zzaTU).toString();
    }

    public List zzBG()
    {
        return zzaTT;
    }

    public Map zzBH()
    {
        return zzaTU;
    }

    private (List list, Map map, String s, int i)
    {
        zzaTT = Collections.unmodifiableList(list);
        zzaTU = Collections.unmodifiableMap(map);
        zzWs = s;
        zzaTV = i;
    }

    zzaTV(List list, Map map, String s, int i, zzaTV zzatv)
    {
        this(list, map, s, i);
    }
}
