// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp, zzck, zzci

class zzaRO
    implements a
{

    final zzcp zzaRK;
    final Map zzaRL;
    final Map zzaRM;
    final Map zzaRN;
    final Map zzaRO;

    public void zza(com.google.android.gms.internal.e e, Set set, Set set1, zzck zzck1)
    {
        List list = (List)zzaRL.get(e);
        List list1 = (List)zzaRM.get(e);
        if (list != null)
        {
            set.addAll(list);
            zzck1.zzAk().zzc(list, list1);
        }
        set = (List)zzaRN.get(e);
        e = (List)zzaRO.get(e);
        if (set != null)
        {
            set1.addAll(set);
            zzck1.zzAl().zzc(set, e);
        }
    }

    a(zzcp zzcp1, Map map, Map map1, Map map2, Map map3)
    {
        zzaRK = zzcp1;
        zzaRL = map;
        zzaRM = map1;
        zzaRN = map2;
        zzaRO = map3;
        super();
    }
}
