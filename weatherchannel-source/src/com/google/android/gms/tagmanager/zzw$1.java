// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzw

class zzaLu
    implements Runnable
{

    final List zzaLt;
    final long zzaLu;
    final zzw zzaLv;

    public void run()
    {
        zzw.zza(zzaLv, zzaLt, zzaLu);
    }

    (zzw zzw1, List list, long l)
    {
        zzaLv = zzw1;
        zzaLt = list;
        zzaLu = l;
        super();
    }
}
