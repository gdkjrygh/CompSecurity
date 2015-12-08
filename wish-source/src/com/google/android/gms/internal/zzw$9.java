// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzw, zzgd

class zzoF
    implements zzbs
{

    final zzw zzoF;

    public void zza(zzgd zzgd1, Map map)
    {
        if (!zzoF.zza(map))
        {
            return;
        } else
        {
            zzoF.zza(zzgd1.getWebView(), map);
            return;
        }
    }

    (zzw zzw1)
    {
        zzoF = zzw1;
        super();
    }
}
