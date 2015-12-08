// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzo;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            zzbz, zzbv, zzgk, zzlb

public final class zzgl
{
    private class zza
    {

        public final long zzEI = zzo.zzbz().currentTimeMillis();
        public final zzgk zzEJ;
        final zzgl zzEK;

        public boolean hasExpired()
        {
            long l = zzEI;
            return ((Long)zzbz.zzuw.get()).longValue() + l < zzo.zzbz().currentTimeMillis();
        }

        public zza(zzgk zzgk)
        {
            zzEK = zzgl.this;
            super();
            zzEJ = zzgk;
        }
    }


    private WeakHashMap zzEH;

    public zzgl()
    {
        zzEH = new WeakHashMap();
    }

    public zzgk zzC(Context context)
    {
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
