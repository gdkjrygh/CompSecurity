// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbo, zzgd

class zztf
    implements Runnable
{

    final zzgd zzte;
    final Map zztf;
    final zzbo zztg;

    public void run()
    {
        zztg.zza(zzte, zztf);
    }

    (zzbo zzbo1, zzgd zzgd, Map map)
    {
        zztg = zzbo1;
        zzte = zzgd;
        zztf = map;
        super();
    }
}
