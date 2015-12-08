// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzw

class zzaDg
    implements Runnable
{

    final List zzaDf;
    final long zzaDg;
    final zzw zzaDh;

    public void run()
    {
        zzw.zza(zzaDh, zzaDf, zzaDg);
    }

    (zzw zzw1, List list, long l)
    {
        zzaDh = zzw1;
        zzaDf = list;
        zzaDg = l;
        super();
    }
}
