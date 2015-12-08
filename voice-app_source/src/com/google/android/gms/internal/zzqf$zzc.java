// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqf

public static class <init>
{

    private final String zzTQ;
    private final Map zzaPA;
    private final int zzaPB;
    private final List zzaPz;

    public static <init> zzAp()
    {
        return new <init>(null);
    }

    public String getVersion()
    {
        return zzTQ;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Rules: ").append(zzAq()).append("  Macros: ").append(zzaPA).toString();
    }

    public List zzAq()
    {
        return zzaPz;
    }

    public Map zzAr()
    {
        return zzaPA;
    }

    private (List list, Map map, String s, int i)
    {
        zzaPz = Collections.unmodifiableList(list);
        zzaPA = Collections.unmodifiableMap(map);
        zzTQ = s;
        zzaPB = i;
    }

    zzaPB(List list, Map map, String s, int i, zzaPB zzapb)
    {
        this(list, map, s, i);
    }
}
