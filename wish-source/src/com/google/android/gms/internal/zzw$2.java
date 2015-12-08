// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzw, zzy

class zzoG
    implements zd
{

    final zzw zzoF;
    final JSONObject zzoG;

    public void zza(Object obj)
    {
        zzc((zzy)obj);
    }

    public void zzc(zzy zzy1)
    {
        zzy1.zza("AFMA_updateActiveView", zzoG);
    }

    zd(zzw zzw1, JSONObject jsonobject)
    {
        zzoF = zzw1;
        zzoG = jsonobject;
        super();
    }
}
