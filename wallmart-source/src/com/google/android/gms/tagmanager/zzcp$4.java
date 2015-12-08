// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp, zzck, zzci

class zzaRK
    implements a
{

    final zzcp zzaRK;

    public void zza(com.google.android.gms.internal.e e, Set set, Set set1, zzck zzck1)
    {
        set.addAll(e.zzBM());
        set1.addAll(e.zzBN());
        zzck1.zzAm().zzc(e.zzBM(), e.zzBR());
        zzck1.zzAn().zzc(e.zzBN(), e.zzBS());
    }

    a(zzcp zzcp1)
    {
        zzaRK = zzcp1;
        super();
    }
}
