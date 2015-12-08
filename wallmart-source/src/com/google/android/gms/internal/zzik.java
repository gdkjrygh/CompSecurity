// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzij

public class zzik
    implements zzij
{
    class zza
    {

        public final zzij.zzc zzIP;
        public final zzij.zza zzIQ;
        final zzik zzIR;

        public zza(zzij.zzc zzc, zzij.zza zza1)
        {
            zzIR = zzik.this;
            super();
            zzIP = zzc;
            zzIQ = zza1;
        }
    }


    protected final BlockingQueue zzIN = new LinkedBlockingQueue();
    protected Object zzIO;
    private final Object zzpc = new Object();
    protected int zzxJ;

    public zzik()
    {
        zzxJ = 0;
    }

    public int getStatus()
    {
        return zzxJ;
    }

    public void reject()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzxJ != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzxJ = -1;
        for (Iterator iterator = zzIN.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzIQ.run()) { }
        zzIN.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void zza(zzij.zzc zzc, zzij.zza zza1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzxJ != 1) goto _L2; else goto _L1
_L1:
        zzc.zzc(zzIO);
_L5:
        return;
_L2:
        if (zzxJ != -1) goto _L4; else goto _L3
_L3:
        zza1.run();
          goto _L5
        zzc;
        obj;
        JVM INSTR monitorexit ;
        throw zzc;
_L4:
        if (zzxJ != 0) goto _L5; else goto _L6
_L6:
        zzIN.add(new zza(zzc, zza1));
          goto _L5
    }

    public void zzg(Object obj)
    {
        Object obj1 = zzpc;
        obj1;
        JVM INSTR monitorenter ;
        if (zzxJ != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzIO = obj;
        zzxJ = 1;
        for (Iterator iterator = zzIN.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzIP.zzc(obj)) { }
        zzIN.clear();
        obj1;
        JVM INSTR monitorexit ;
    }
}
