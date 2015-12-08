// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzhs, zzid, zzdg

public final class zzgh
{

    private String zzDK;
    private String zzDL;
    private zzhs zzDM;
    zzdt.zzd zzDN;
    public final zzdg zzDO = new _cls1();
    public final zzdg zzDP = new _cls2();
    zzid zzoA;
    private final Object zzqt = new Object();

    public zzgh(String s, String s1)
    {
        zzDM = new zzhs();
        zzDL = s1;
        zzDK = s;
    }

    static Object zza(zzgh zzgh1)
    {
        return zzgh1.zzqt;
    }

    static zzhs zzb(zzgh zzgh1)
    {
        return zzgh1.zzDM;
    }

    static String zzc(zzgh zzgh1)
    {
        return zzgh1.zzDK;
    }

    static String zzd(zzgh zzgh1)
    {
        return zzgh1.zzDL;
    }

    public void zzb(zzdt.zzd zzd1)
    {
        zzDN = zzd1;
    }

    public void zze(zzid zzid1)
    {
        zzoA = zzid1;
    }

    public zzdt.zzd zzfD()
    {
        return zzDN;
    }

    public Future zzfE()
    {
        return zzDM;
    }

    public void zzfF()
    {
        if (zzoA != null)
        {
            zzoA.destroy();
            zzoA = null;
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
