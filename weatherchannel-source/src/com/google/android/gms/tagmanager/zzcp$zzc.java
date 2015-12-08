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

    private final Map zzaNA = new HashMap();
    private com.google.android.gms.internal.c.zzaNB zzaNB;
    private final Set zzaNm = new HashSet();
    private final Map zzaNx = new HashMap();
    private final Map zzaNy = new HashMap();
    private final Map zzaNz = new HashMap();

    public void zza(com.google.android.gms.internal.c c)
    {
        zzaNm.add(c);
    }

    public void zza(com.google.android.gms.internal.c c, com.google.android.gms.internal.c c1)
    {
        List list = (List)zzaNx.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaNx.put(c, obj);
        }
        ((List) (obj)).add(c1);
    }

    public void zza(com.google.android.gms.internal.c c, String s)
    {
        List list = (List)zzaNz.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaNz.put(c, obj);
        }
        ((List) (obj)).add(s);
    }

    public void zzb(com.google.android.gms.internal.c c)
    {
        zzaNB = c;
    }

    public void zzb(com.google.android.gms.internal.c c, com.google.android.gms.internal.c c1)
    {
        List list = (List)zzaNy.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaNy.put(c, obj);
        }
        ((List) (obj)).add(c1);
    }

    public void zzb(com.google.android.gms.internal.c c, String s)
    {
        List list = (List)zzaNA.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaNA.put(c, obj);
        }
        ((List) (obj)).add(s);
    }

    public Set zzzt()
    {
        return zzaNm;
    }

    public Map zzzu()
    {
        return zzaNx;
    }

    public Map zzzv()
    {
        return zzaNz;
    }

    public Map zzzw()
    {
        return zzaNA;
    }

    public Map zzzx()
    {
        return zzaNy;
    }

    public com.google.android.gms.internal.c zzzy()
    {
        return zzaNB;
    }

    public ()
    {
    }
}
