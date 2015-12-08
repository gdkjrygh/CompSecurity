// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp

private static class 
{

    private final Set zzaRG = new HashSet();
    private final Map zzaRR = new HashMap();
    private final Map zzaRS = new HashMap();
    private final Map zzaRT = new HashMap();
    private final Map zzaRU = new HashMap();
    private com.google.android.gms.internal.c.zzaRU zzaRV;

    public Set zzAJ()
    {
        return zzaRG;
    }

    public Map zzAK()
    {
        return zzaRR;
    }

    public Map zzAL()
    {
        return zzaRT;
    }

    public Map zzAM()
    {
        return zzaRU;
    }

    public Map zzAN()
    {
        return zzaRS;
    }

    public com.google.android.gms.internal.c zzAO()
    {
        return zzaRV;
    }

    public void zza(com.google.android.gms.internal.c c)
    {
        zzaRG.add(c);
    }

    public void zza(com.google.android.gms.internal.c c, com.google.android.gms.internal.c c1)
    {
        List list = (List)zzaRR.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaRR.put(c, obj);
        }
        ((List) (obj)).add(c1);
    }

    public void zza(com.google.android.gms.internal.c c, String s)
    {
        List list = (List)zzaRT.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaRT.put(c, obj);
        }
        ((List) (obj)).add(s);
    }

    public void zzb(com.google.android.gms.internal.c c)
    {
        zzaRV = c;
    }

    public void zzb(com.google.android.gms.internal.c c, com.google.android.gms.internal.c c1)
    {
        List list = (List)zzaRS.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaRS.put(c, obj);
        }
        ((List) (obj)).add(c1);
    }

    public void zzb(com.google.android.gms.internal.c c, String s)
    {
        List list = (List)zzaRU.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaRU.put(c, obj);
        }
        ((List) (obj)).add(s);
    }

    public ()
    {
    }
}
