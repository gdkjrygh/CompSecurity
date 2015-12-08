// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzaz, zzbe

class zzrm
    implements c
{

    final zzaz zzrl;
    final JSONObject zzrm;

    public void zzb(zzbe zzbe1)
    {
        zzbe1.zza("AFMA_updateActiveView", zzrm);
    }

    public void zzc(Object obj)
    {
        zzb((zzbe)obj);
    }

    c(zzaz zzaz1, JSONObject jsonobject)
    {
        zzrl = zzaz1;
        zzrm = jsonobject;
        super();
    }
}
