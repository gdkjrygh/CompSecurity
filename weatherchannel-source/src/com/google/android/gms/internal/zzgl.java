// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            zzbz, zzbv, zzgk

public final class zzgl
{

    private WeakHashMap zzEH;

    public zzgl()
    {
        zzEH = new WeakHashMap();
    }

    public zzgk zzC(Context context)
    {
    /* block-local class not found */
    class zza {}

        Object obj = (zza)zzEH.get(context);
        if (obj != null && !((zza) (obj)).hasExpired() && ((Boolean)zzbz.zzuv.get()).booleanValue())
        {
            obj = (new zzgk.zza(context, ((zza) (obj)).zzEJ)).zzfJ();
        } else
        {
            obj = (new zzgk.zza(context)).zzfJ();
        }
        zzEH.put(context, new zza(((zzgk) (obj))));
        return ((zzgk) (obj));
    }
}
