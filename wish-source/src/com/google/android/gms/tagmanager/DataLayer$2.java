// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

class zzaCZ
    implements c.zza
{

    final DataLayer zzaCZ;

    public void zzp(List list)
    {
        a a;
        for (list = list.iterator(); list.hasNext(); DataLayer.zza(zzaCZ, zzaCZ.zzi(a.zzra, a.zzCM)))
        {
            a = (a)list.next();
        }

        DataLayer.zza(zzaCZ).countDown();
    }

    a(DataLayer datalayer)
    {
        zzaCZ = datalayer;
        super();
    }
}
