// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzfz, zzip, zzhv, zziq

public abstract class zzfw extends zzfz
    implements zziq.zza
{

    private final zziq zzCq;
    protected boolean zzCr;
    private boolean zzyg;

    protected zzfw(Context context, zzhj.zza zza1, zzip zzip1, zzga.zza zza2)
    {
        super(context, zza1, zzip1, zza2);
        zzCr = false;
        zzyg = false;
        zzCq = zzip1.zzgS();
    }

    private boolean zze(long l)
        throws zzfz.zza
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 1L)
        {
            return false;
        }
        try
        {
            zzpc.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new zzfz.zza("Ad request cancelled.", -1);
        }
        return true;
    }

    public void onStop()
    {
        synchronized (zzCE)
        {
            zzoL.stopLoading();
            zzp.zzbz().zza(zzoL.getWebView());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzip zzip1, boolean flag)
    {
        boolean flag1 = true;
        zzip1 = ((zzip) (zzpc));
        zzip1;
        JVM INSTR monitorenter ;
        zzb.zzaC("WebView finished loading.");
        zzCr = true;
        Exception exception;
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzyg = flag;
        zzpc.notify();
        zzip1;
        JVM INSTR monitorexit ;
        return;
        exception;
        zzip1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzg(long l)
        throws zzfz.zza
    {
        do
        {
            if (!zze(l))
            {
                throw new zzfz.zza("Timed out waiting for WebView to finish loading.", 2);
            }
            if (zzyg)
            {
                throw new zzfz.zza("Received cancellation request from creative.", 0);
            }
        } while (!zzCr);
    }
}
