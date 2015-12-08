// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            zzby, zzbu, zzgr, zzlm

public final class zzgs
{
    private class zza
    {

        public final long zzFY = zzp.zzbB().currentTimeMillis();
        public final zzgr zzFZ;
        final zzgs zzGa;

        public boolean hasExpired()
        {
            return zzFY + ((Long)zzby.zzuY.get()).longValue() < zzp.zzbB().currentTimeMillis();
        }

        public zza(zzgr zzgr)
        {
            zzGa = zzgs.this;
            super();
            zzFZ = zzgr;
        }
    }


    private WeakHashMap zzFX;

    public zzgs()
    {
        zzFX = new WeakHashMap();
    }

    public zzgr zzD(Context context)
    {
        Object obj = (zza)zzFX.get(context);
        if (obj != null && !((zza) (obj)).hasExpired() && ((Boolean)zzby.zzuX.get()).booleanValue())
        {
            obj = (new zzgr.zza(context, ((zza) (obj)).zzFZ)).zzfN();
        } else
        {
            obj = (new zzgr.zza(context)).zzfN();
        }
        zzFX.put(context, new zza(((zzgr) (obj))));
        return ((zzgr) (obj));
    }
}
