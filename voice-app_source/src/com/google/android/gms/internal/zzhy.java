// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx

public class zzhy
    implements zzhx
{
    class zza
    {

        public final zzhx.zzc zzGW;
        public final zzhx.zza zzGX;
        final zzhy zzGY;

        public zza(zzhx.zzc zzc, zzhx.zza zza1)
        {
            zzGY = zzhy.this;
            super();
            zzGW = zzc;
            zzGX = zza1;
        }
    }


    protected final BlockingQueue zzGU = new LinkedBlockingQueue();
    protected Object zzGV;
    private final Object zzqt = new Object();
    protected int zzwS;

    public zzhy()
    {
        zzwS = 0;
    }

    public int getStatus()
    {
        return zzwS;
    }

    public void reject()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzwS != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzwS = -1;
        for (Iterator iterator = zzGU.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzGX.run()) { }
        zzGU.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void zza(zzhx.zzc zzc, zzhx.zza zza1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzwS != 1) goto _L2; else goto _L1
_L1:
        zzc.zzc(zzGV);
_L5:
        return;
_L2:
        if (zzwS != -1) goto _L4; else goto _L3
_L3:
        zza1.run();
          goto _L5
        zzc;
        obj;
        JVM INSTR monitorexit ;
        throw zzc;
_L4:
        if (zzwS != 0) goto _L5; else goto _L6
_L6:
        zzGU.add(new zza(zzc, zza1));
          goto _L5
    }

    public void zzg(Object obj)
    {
        Object obj1 = zzqt;
        obj1;
        JVM INSTR monitorenter ;
        if (zzwS != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzGV = obj;
        zzwS = 1;
        for (Iterator iterator = zzGU.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzGW.zzc(obj)) { }
        zzGU.clear();
        obj1;
        JVM INSTR monitorexit ;
    }
}
