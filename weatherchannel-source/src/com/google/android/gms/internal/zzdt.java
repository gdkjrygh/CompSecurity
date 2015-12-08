// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzbd, zzbb

public class zzdt
{

    private final Context mContext;
    private final VersionInfoParcel zzoM;
    private final Object zzqt;
    private final String zzwO;
    private zzb zzwP;
    private zzb zzwQ;
    private zze zzwR;
    private int zzwS;

    public zzdt(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        zzqt = new Object();
        zzwS = 1;
        zzwO = s;
        mContext = context.getApplicationContext();
        zzoM = versioninfoparcel;
    /* block-local class not found */
    class zzc {}

        zzwP = new zzc();
        zzwQ = new zzc();
    }

    public zzdt(Context context, VersionInfoParcel versioninfoparcel, String s, zzb zzb1, zzb zzb2)
    {
        this(context, versioninfoparcel, s);
        zzwP = zzb1;
        zzwQ = zzb2;
    }

    static int zza(zzdt zzdt1, int i)
    {
        zzdt1.zzwS = i;
        return i;
    }

    static Context zza(zzdt zzdt1)
    {
        return zzdt1.mContext;
    }

    static zze zza(zzdt zzdt1, zze zze1)
    {
        zzdt1.zzwR = zze1;
        return zze1;
    }

    static VersionInfoParcel zzb(zzdt zzdt1)
    {
        return zzdt1.zzoM;
    }

    static Object zzc(zzdt zzdt1)
    {
        return zzdt1.zzqt;
    }

    static zzb zzd(zzdt zzdt1)
    {
        return zzdt1.zzwP;
    }

    private zze zzdS()
    {
    /* block-local class not found */
    class zze {}

        zze zze1 = new zze(zzwQ);
        zzhl.runOnUiThread(new _cls1(zze1));
        return zze1;
    }

    static int zze(zzdt zzdt1)
    {
        return zzdt1.zzwS;
    }

    static String zzf(zzdt zzdt1)
    {
        return zzdt1.zzwO;
    }

    static zze zzg(zzdt zzdt1)
    {
        return zzdt1.zzwR;
    }

    protected zzbb zza(Context context, VersionInfoParcel versioninfoparcel)
    {
        return new zzbd(context, versioninfoparcel);
    }

    protected zze zzdT()
    {
        zze zze1 = zzdS();
        zze1.zza(new _cls2(zze1), new _cls3(zze1));
        return zze1;
    }

    public zzd zzdU()
    {
label0:
        {
            zzd zzd1;
            synchronized (zzqt)
            {
                if (zzwR != null && zzwR.getStatus() != -1)
                {
                    break label0;
                }
                zzwS = 2;
                zzwR = zzdT();
                zzd1 = zzwR.zzdV();
            }
            return zzd1;
        }
        zzd zzd2;
        if (zzwS != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        zzd2 = zzwR.zzdV();
        obj;
        JVM INSTR monitorexit ;
        return zzd2;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (zzwS != 1)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        zzwS = 2;
        zzdT();
        exception = zzwR.zzdV();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        if (zzwS != 2)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        exception = zzwR.zzdV();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        exception = zzwR.zzdV();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    // Unreferenced inner class com/google/android/gms/internal/zzdt$zza
    /* block-local class not found */
    class zza {}


    // Unreferenced inner class com/google/android/gms/internal/zzdt$zzb
    /* block-local class not found */
    class zzb {}


    // Unreferenced inner class com/google/android/gms/internal/zzdt$zzd
    /* block-local class not found */
    class zzd {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
