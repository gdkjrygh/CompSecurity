// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzmq

public static class <init>
{

    private zzaFi zzaFi;
    private final Map zzaHk;

    public <init> zzb(String s, <init> <init>1)
    {
        zzaHk.put(s, <init>1);
        return this;
    }

    public zzaHk zzq(zzaHk zzahk)
    {
        zzaFi = zzahk;
        return this;
    }

    public zzaFi zzys()
    {
        return new <init>(zzaHk, zzaFi, null);
    }

    private ()
    {
        zzaHk = new HashMap();
    }

    zzaHk(zzaHk zzahk)
    {
        this();
    }
}
