// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzof, zzob, zzoe, zzog

class zzaIi
    implements Runnable
{

    final zzob zzaIi;
    final zzof zzaIj;

    public void run()
    {
        zzaIi.zzxo().zza(zzaIi);
        for (Iterator iterator = zzof.zza(zzaIj).iterator(); iterator.hasNext(); ((zzog)iterator.next()).zza(zzaIi)) { }
        zzof.zza(zzaIj, zzaIi);
    }

    (zzof zzof1, zzob zzob1)
    {
        zzaIj = zzof1;
        zzaIi = zzob1;
        super();
    }
}
