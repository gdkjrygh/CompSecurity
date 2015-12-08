// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;

public class zzhz
{

    private HandlerThread zzIn;
    private int zzIo;
    private final Object zzpc = new Object();

    public zzhz()
    {
        zzIn = null;
        zzIo = 0;
    }

    public Looper zzgB()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzIn != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        Looper looper;
        Exception exception;
        boolean flag;
        if (zzIo == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Invalid state: mHandlerThread should already been initialized.");
        zzb.v("Starting the looper provider thread.");
        zzIn = new HandlerThread("LooperProvider");
        zzIn.start();
        zzIo = zzIo + 1;
        looper = zzIn.getLooper();
        obj;
        JVM INSTR monitorexit ;
        return looper;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzgC()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        int i;
        boolean flag;
        if (zzIo > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Invalid state: release() called more times than expected.");
        i = zzIo - 1;
        zzIo = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzb.v("Terminate the looper provider thread.");
        zzIn.quit();
        zzIn = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
