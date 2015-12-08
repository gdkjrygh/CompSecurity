// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzeb

public final class zzec extends zzej.zza
{

    private final Object zzpc = new Object();
    private zzee.zza zzyF;
    private zzeb zzyG;

    public zzec()
    {
    }

    public void onAdClicked()
    {
        synchronized (zzpc)
        {
            if (zzyG != null)
            {
                zzyG.zzaX();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdClosed()
    {
        synchronized (zzpc)
        {
            if (zzyG != null)
            {
                zzyG.zzaY();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdFailedToLoad(int i)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzyF == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        Exception exception;
        if (i == 3)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        zzyF.zzq(i);
        zzyF = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdLeftApplication()
    {
        synchronized (zzpc)
        {
            if (zzyG != null)
            {
                zzyG.zzaZ();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdLoaded()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzyF == null)
                {
                    break label0;
                }
                zzyF.zzq(0);
                zzyF = null;
            }
            return;
        }
        if (zzyG != null)
        {
            zzyG.zzbb();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdOpened()
    {
        synchronized (zzpc)
        {
            if (zzyG != null)
            {
                zzyG.zzba();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzeb zzeb1)
    {
        synchronized (zzpc)
        {
            zzyG = zzeb1;
        }
        return;
        zzeb1;
        obj;
        JVM INSTR monitorexit ;
        throw zzeb1;
    }

    public void zza(zzee.zza zza1)
    {
        synchronized (zzpc)
        {
            zzyF = zza1;
        }
        return;
        zza1;
        obj;
        JVM INSTR monitorexit ;
        throw zza1;
    }
}
