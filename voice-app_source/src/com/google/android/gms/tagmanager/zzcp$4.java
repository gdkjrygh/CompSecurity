// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp, zzck, zzci

class zzaNq
    implements a
{

    final zzcp zzaNq;

    public void zza(com.google.android.gms.internal.e e, Set set, Set set1, zzck zzck1)
    {
        set.addAll(e.zzAw());
        set1.addAll(e.zzAx());
        zzck1.zzyW().zzc(e.zzAw(), e.zzAB());
        zzck1.zzyX().zzc(e.zzAx(), e.zzAC());
    }

    a(zzcp zzcp1)
    {
        zzaNq = zzcp1;
        super();
    }
}
