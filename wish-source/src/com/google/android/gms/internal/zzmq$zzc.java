// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzmq

public static class <init>
{

    private final List zzaHl;
    private final Map zzaHm;
    private final int zzaHn;
    private final String zzacK;

    public static <init> zzyt()
    {
        return new <init>(null);
    }

    public String getVersion()
    {
        return zzacK;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Rules: ").append(zzyu()).append("  Macros: ").append(zzaHm).toString();
    }

    public List zzyu()
    {
        return zzaHl;
    }

    public Map zzyv()
    {
        return zzaHm;
    }

    private (List list, Map map, String s, int i)
    {
        zzaHl = Collections.unmodifiableList(list);
        zzaHm = Collections.unmodifiableMap(map);
        zzacK = s;
        zzaHn = i;
    }

    zzaHn(List list, Map map, String s, int i, zzaHn zzahn)
    {
        this(list, map, s, i);
    }
}
