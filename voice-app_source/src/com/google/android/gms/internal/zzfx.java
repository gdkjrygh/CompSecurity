// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzm;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            zzhh, zzfy, zzho, zzha, 
//            zzhk, zzhl, zzbc, zzan

public class zzfx extends zzhh
{

    private final zzfy zzBC;
    private Future zzBD;
    private final zzft.zza zzBq;
    private final zzha.zza zzBs;
    private final AdResponseParcel zzBt;
    private final Object zzqt;

    public zzfx(Context context, zzm zzm, zzbc zzbc, zzha.zza zza1, zzan zzan, zzft.zza zza2)
    {
        this(zza1, zza2, new zzfy(context, zzm, zzbc, new zzho(context), zzan, zza1));
    }

    zzfx(zzha.zza zza1, zzft.zza zza2, zzfy zzfy1)
    {
        zzqt = new Object();
        zzBs = zza1;
        zzBt = zza1.zzFs;
        zzBq = zza2;
        zzBC = zzfy1;
    }

    private zzha zzA(int i)
    {
        return new zzha(zzBs.zzFr.zzCm, null, null, i, null, null, zzBt.orientation, zzBt.zzxJ, zzBs.zzFr.zzCp, false, null, null, null, null, null, zzBt.zzCL, zzBs.zzpN, zzBt.zzCJ, zzBs.zzFo, zzBt.zzCO, zzBt.zzCP, zzBs.zzFl, null, zzBs.zzFr.zzCC);
    }

    static zzft.zza zza(zzfx zzfx1)
    {
        return zzfx1.zzBq;
    }

    public void onStop()
    {
        synchronized (zzqt)
        {
            if (zzBD != null)
            {
                zzBD.cancel(true);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdP()
    {
        synchronized (zzqt)
        {
            zzBD = zzhk.zza(zzBC);
        }
        obj = (zzha)zzBD.get(60000L, TimeUnit.MILLISECONDS);
        byte byte0 = -2;
_L1:
        if (obj == null)
        {
            obj = zzA(byte0);
        }
        zzhl.zzGk.post(new Runnable(((zzha) (obj))) {

            final zzfx zzBE;
            final zzha zzpd;

            public void run()
            {
                zzfx.zza(zzBE).zzb(zzpd);
            }

            
            {
                zzBE = zzfx.this;
                zzpd = zzha1;
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
            zzb.zzaC("Timed out waiting for native ad.");
            zzBD.cancel(true);
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
