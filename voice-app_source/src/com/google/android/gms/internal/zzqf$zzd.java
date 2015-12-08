// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqf, zzae

public static class <init>
{

    private String zzTQ;
    private final Map zzaPA;
    private int zzaPB;
    private final List zzaPz;

    public <init> zzAs()
    {
        return new <init>(zzaPz, zzaPA, zzTQ, zzaPB, null);
    }

    public zzaPB zzb(zzaPB zzapb)
    {
        zzaPz.add(zzapb);
        return this;
    }

    public zzaPz zzc(zzaPz zzapz)
    {
        String s = zzdf.zzg((g)zzapz.zzAn().get(zzae.zzfr.toString()));
        List list = (List)zzaPA.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaPA.put(s, obj);
        }
        ((List) (obj)).add(zzapz);
        return this;
    }

    public zzaPA zzeV(String s)
    {
        zzTQ = s;
        return this;
    }

    public zzTQ zzjb(int i)
    {
        zzaPB = i;
        return this;
    }

    private ()
    {
        zzaPz = new ArrayList();
        zzaPA = new HashMap();
        zzTQ = "";
        zzaPB = 0;
    }

    zzaPB(zzaPB zzapb)
    {
        this();
    }
}
