// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            zzbu, zzbw

public class zzbx
{

    private final Object zzpc = new Object();
    private boolean zzpr;
    private SharedPreferences zztU;

    public zzbx()
    {
        zzpr = false;
        zztU = null;
    }

    public Object zzd(zzbu zzbu1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzpr)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        zzbu1 = ((zzbu) (zzbu1.zzdd()));
        return zzbu1;
        obj;
        JVM INSTR monitorexit ;
        return zzbu1.zza(zztU);
        zzbu1;
        obj;
        JVM INSTR monitorexit ;
        throw zzbu1;
    }

    public void zzw(Context context)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (!zzpr)
                {
                    break label0;
                }
            }
            return;
        }
        context = GooglePlayServicesUtil.getRemoteContext(context);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        zztU = zzp.zzbE().zzv(context);
        zzpr = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
