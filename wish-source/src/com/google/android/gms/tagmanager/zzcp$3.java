// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp, zzck, zzci

class zzaFg
    implements a
{

    final zzcp zzaFc;
    final Map zzaFd;
    final Map zzaFe;
    final Map zzaFf;
    final Map zzaFg;

    public void zza(com.google.android.gms.internal.e e, Set set, Set set1, zzck zzck1)
    {
        List list = (List)zzaFd.get(e);
        List list1 = (List)zzaFe.get(e);
        if (list != null)
        {
            set.addAll(list);
            zzck1.zzwY().zzc(list, list1);
        }
        set = (List)zzaFf.get(e);
        e = (List)zzaFg.get(e);
        if (set != null)
        {
            set1.addAll(set);
            zzck1.zzwZ().zzc(set, e);
        }
    }

    a(zzcp zzcp1, Map map, Map map1, Map map2, Map map3)
    {
        zzaFc = zzcp1;
        zzaFd = map;
        zzaFe = map1;
        zzaFf = map2;
        zzaFg = map3;
        super();
    }
}
