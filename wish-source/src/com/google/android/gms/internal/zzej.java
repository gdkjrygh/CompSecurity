// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            zzfh, zzek, zzfo, zzfa, 
//            zzfk, zzfl, zzz, zzk

public class zzej extends zzfh
{

    private final Object zzoe;
    private final zzef.zza zzyf;
    private final zzfa.zza zzyh;
    private final AdResponseParcel zzyi;
    private final zzek zzys;
    private Future zzyt;

    public zzej(Context context, zza zza1, zzz zzz, zzfa.zza zza2, zzk zzk, zzef.zza zza3)
    {
        this(zza2, zza3, new zzek(context, zza1, zzz, new zzfo(), zzk, zza2));
    }

    zzej(zzfa.zza zza1, zzef.zza zza2, zzek zzek1)
    {
        zzoe = new Object();
        zzyh = zza1;
        zzyi = zza1.zzBz;
        zzyf = zza2;
        zzys = zzek1;
    }

    static zzef.zza zza(zzej zzej1)
    {
        return zzej1.zzyf;
    }

    private zzfa zzu(int i)
    {
        return new zzfa(zzyh.zzBy.zzyW, null, null, i, null, null, zzyi.orientation, zzyi.zzuG, zzyh.zzBy.zzyZ, false, null, null, null, null, null, zzyi.zzzu, zzyh.zzmP, zzyi.zzzs, zzyh.zzBv, zzyi.zzzx, zzyi.zzzy, zzyh.zzBs, null, zzyh.zzBy.zzzm);
    }

    public void onStop()
    {
        synchronized (zzoe)
        {
            if (zzyt != null)
            {
                zzyt.cancel(true);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzcX()
    {
        synchronized (zzoe)
        {
            zzyt = com.google.android.gms.internal.zzfk.zza(zzys);
        }
        obj = (zzfa)zzyt.get(60000L, TimeUnit.MILLISECONDS);
        byte byte0 = -2;
_L1:
        if (obj == null)
        {
            obj = zzu(byte0);
        }
        zzfl.zzCr.post(new Runnable(((zzfa) (obj))) {

            final zzfa zzyk;
            final zzej zzyu;

            public void run()
            {
                com.google.android.gms.internal.zzej.zza(zzyu).zza(zzyk);
            }

            
            {
                zzyu = zzej.this;
                zzyk = zzfa1;
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
            zzb.zzan("Timed out waiting for native ad.");
            zzyt.cancel(true);
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
