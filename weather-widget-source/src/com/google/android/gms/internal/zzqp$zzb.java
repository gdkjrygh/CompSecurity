// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqp

public static class <init>
{

    private zzaRQ zzaRQ;
    private final Map zzaTS;

    public <init> zzBE()
    {
        return new <init>(zzaTS, zzaRQ, null);
    }

    public zzaRQ zzb(String s, zzaRQ zzarq)
    {
        zzaTS.put(s, zzarq);
        return this;
    }

    public zzaTS zzq(zzaTS zzats)
    {
        zzaRQ = zzats;
        return this;
    }

    private ()
    {
        zzaTS = new HashMap();
    }

    zzaTS(zzaTS zzats)
    {
        this();
    }
}
