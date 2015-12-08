// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzw

class zzaPO
    implements Runnable
{

    final List zzaPN;
    final long zzaPO;
    final zzw zzaPP;

    public void run()
    {
        zzw.zza(zzaPP, zzaPN, zzaPO);
    }

    (zzw zzw1, List list, long l)
    {
        zzaPP = zzw1;
        zzaPN = list;
        zzaPO = l;
        super();
    }
}
