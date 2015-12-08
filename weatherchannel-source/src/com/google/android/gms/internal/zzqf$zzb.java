// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqf

public static class <init>
{

    private zzaNw zzaNw;
    private final Map zzaPy;

    public <init> zzAo()
    {
        return new <init>(zzaPy, zzaNw, null);
    }

    public zzaNw zzb(String s, zzaNw zzanw)
    {
        zzaPy.put(s, zzanw);
        return this;
    }

    public zzaPy zzq(zzaPy zzapy)
    {
        zzaNw = zzapy;
        return this;
    }

    private ()
    {
        zzaPy = new HashMap();
    }

    zzaPy(zzaPy zzapy)
    {
        this();
    }
}
