// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzkk, zzkg, zzkj, zzkl

class zzawp
    implements Runnable
{

    final zzkg zzawp;
    final zzkk zzawq;

    public void run()
    {
        zzawp.zzue().zza(zzawp);
        for (Iterator iterator = zzkk.zza(zzawq).iterator(); iterator.hasNext(); ((zzkl)iterator.next()).zza(zzawp)) { }
        zzkk.zza(zzawq, zzawp);
    }

    (zzkk zzkk1, zzkg zzkg1)
    {
        zzawq = zzkk1;
        zzawp = zzkg1;
        super();
    }
}
