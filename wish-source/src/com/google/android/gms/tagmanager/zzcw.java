// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzl

class zzcw
    implements zzl
{

    private final Map zzaFD = new HashMap();
    private final int zzaFE;
    private final zzm.zza zzaFF;
    private int zzaFG;

    zzcw(int i, zzm.zza zza)
    {
        zzaFE = i;
        zzaFF = zza;
    }

    public Object get(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = zzaFD.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    public void zze(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null && obj1 != null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        throw new NullPointerException("key == null || value == null");
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        zzaFG = zzaFG + zzaFF.sizeOf(obj, obj1);
        if (zzaFG > zzaFE)
        {
            Iterator iterator = zzaFD.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                zzaFG = zzaFG - zzaFF.sizeOf(entry.getKey(), entry.getValue());
                iterator.remove();
            } while (zzaFG > zzaFE);
        }
        zzaFD.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
    }
}
