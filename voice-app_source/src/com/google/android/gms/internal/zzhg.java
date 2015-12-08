// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.math.BigInteger;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzca, zzcc, zzcb

public final class zzhg
{

    private static zzcb zzFX;
    private static String zzFY;
    private static final Object zzoW = new Object();

    public static String zza(Context context, String s, String s1)
    {
        synchronized (zzoW)
        {
            if (zzFY == null && !TextUtils.isEmpty(s))
            {
                zzb(context, s, s1);
            }
            context = zzFY;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void zzb(Context context, String s, String s1)
    {
        Class class1;
        String as[];
        try
        {
            s1 = context.createPackageContext(s1, 3).getClassLoader();
            class1 = Class.forName("com.google.ads.mediation.MediationAdapter", false, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzFY = "err";
            return;
        }
        context = new BigInteger(new byte[1]);
        as = s.split(",");
        for (int i = 0; i < as.length;)
        {
            s = context;
            if (zzo.zzbv().zza(s1, class1, as[i]))
            {
                s = context.setBit(i);
            }
            i++;
            context = s;
        }

        zzFY = String.format(Locale.US, "%X", new Object[] {
            context
        });
    }

    public static void zze(Context context, String s)
    {
        Object obj = zzoW;
        obj;
        JVM INSTR monitorenter ;
        zzca zzca1;
        if (zzFX != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        zzca1 = new zzca();
        zzca1.zzb(context, s);
        zzFX = zzo.zzbA().zzb(zzca1);
_L1:
        return;
        context;
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Cannot initialize CSI reporter.").append(context.getMessage()).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static zzcb zzfY()
    {
        zzcb zzcb;
        synchronized (zzoW)
        {
            zzcb = zzFX;
        }
        return zzcb;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String zzgh()
    {
        String s;
        synchronized (zzoW)
        {
            s = zzFY;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
