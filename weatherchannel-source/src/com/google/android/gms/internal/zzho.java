// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzac, zzl, zzhv

public class zzho
{

    private static zzl zzGu;
    public static final zza zzGv = new _cls1();
    private static final Object zzoW = new Object();

    public zzho(Context context)
    {
        zzGu = zzN(context);
    }

    private static zzl zzN(Context context)
    {
        synchronized (zzoW)
        {
            if (zzGu == null)
            {
                zzGu = zzac.zza(context.getApplicationContext());
            }
            context = zzGu;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public zzhv zza(String s, zza zza1)
    {
    /* block-local class not found */
    class zzc {}

        zzc zzc1 = new zzc(null);
    /* block-local class not found */
    class zzb {}

        zzGu.zze(new zzb(s, zza1, zzc1));
        return zzc1;
    }

    public zzhv zzb(String s, Map map)
    {
        zzc zzc1 = new zzc(null);
        s = new _cls3(s, zzc1, new _cls2(s, zzc1), map);
        zzGu.zze(s);
        return zzc1;
    }


    // Unreferenced inner class com/google/android/gms/internal/zzho$zza
    /* block-local class not found */
    class zza {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
