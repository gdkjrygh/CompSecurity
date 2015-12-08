// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzee, zzgd, zzfm, zzge

public abstract class zzeb extends zzee
    implements zzge.zza
{

    private boolean zzun;
    private final zzge zzxS;
    protected boolean zzxT;

    protected zzeb(Context context, zzfa.zza zza1, zzgd zzgd1, zzef.zza zza2)
    {
        super(context, zza1, zzgd1, zza2);
        zzxT = false;
        zzun = false;
        zzxS = zzgd1.zzft();
    }

    private boolean zzd(long l)
        throws zzee.zza
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 1L)
        {
            return false;
        }
        try
        {
            zzoe.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new zzee.zza("Ad request cancelled.", -1);
        }
        return true;
    }

    public void onStop()
    {
        synchronized (zzyg)
        {
            zznp.stopLoading();
            zzh.zzaS().zza(zznp.getWebView());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzgd zzgd1, boolean flag)
    {
        boolean flag1 = true;
        zzgd1 = ((zzgd) (zzoe));
        zzgd1;
        JVM INSTR monitorenter ;
        zzb.zzaj("WebView finished loading.");
        zzxT = true;
        Exception exception;
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzun = flag;
        zzoe.notify();
        zzgd1;
        JVM INSTR monitorexit ;
        return;
        exception;
        zzgd1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzf(long l)
        throws zzee.zza
    {
        do
        {
            if (!zzd(l))
            {
                throw new zzee.zza("Timed out waiting for WebView to finish loading.", 2);
            }
            if (zzun)
            {
                throw new zzee.zza("Received cancellation request from creative.", 0);
            }
        } while (!zzxT);
    }
}
