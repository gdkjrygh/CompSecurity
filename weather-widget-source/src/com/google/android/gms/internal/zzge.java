// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzn;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            zzhq, zzgf, zzhy, zzhj, 
//            zzht, zzhu, zzbc, zzan

public class zzge extends zzhq
{

    private final zzga.zza zzCD;
    private final zzhj.zza zzCF;
    private final AdResponseParcel zzCG;
    private final zzgf zzCP;
    private Future zzCQ;
    private final Object zzpc;

    public zzge(Context context, zzn zzn, zzbc zzbc, zzhj.zza zza1, zzan zzan, zzga.zza zza2)
    {
        this(zza1, zza2, new zzgf(context, zzn, zzbc, new zzhy(context), zzan, zza1));
    }

    zzge(zzhj.zza zza1, zzga.zza zza2, zzgf zzgf1)
    {
        zzpc = new Object();
        zzCF = zza1;
        zzCG = zza1.zzGM;
        zzCD = zza2;
        zzCP = zzgf1;
    }

    private zzhj zzA(int i)
    {
        return new zzhj(zzCF.zzGL.zzDy, null, null, i, null, null, zzCG.orientation, zzCG.zzyA, zzCF.zzGL.zzDB, false, null, null, null, null, null, zzCG.zzDY, zzCF.zzqf, zzCG.zzDW, zzCF.zzGI, zzCG.zzEb, zzCG.zzEc, zzCF.zzGF, null, zzCF.zzGL.zzDO);
    }

    static zzga.zza zza(zzge zzge1)
    {
        return zzge1.zzCD;
    }

    public void onStop()
    {
        synchronized (zzpc)
        {
            if (zzCQ != null)
            {
                zzCQ.cancel(true);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdG()
    {
        synchronized (zzpc)
        {
            zzCQ = zzht.zza(zzCP);
        }
        obj = (zzhj)zzCQ.get(60000L, TimeUnit.MILLISECONDS);
        byte byte0 = -2;
_L1:
        if (obj == null)
        {
            obj = zzA(byte0);
        }
        zzhu.zzHK.post(new Runnable(((zzhj) (obj))) {

            final zzge zzCR;
            final zzhj zzpx;

            public void run()
            {
                zzge.zza(zzCR).zzb(zzpx);
            }

            
            {
                zzCR = zzge.this;
                zzpx = zzhj1;
                super();
            }
        });
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzaE("Timed out waiting for native ad.");
            zzCQ.cancel(true);
            byte0 = 2;
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            byte0 = 0;
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
            byte0 = -1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
            byte0 = -1;
        }
          goto _L1
    }
}
