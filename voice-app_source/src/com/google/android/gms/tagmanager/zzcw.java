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

    private final Map zzaNR = new HashMap();
    private final int zzaNS;
    private final zzm.zza zzaNT;
    private int zzaNU;

    zzcw(int i, zzm.zza zza)
    {
        zzaNS = i;
        zzaNT = zza;
    }

    public Object get(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = zzaNR.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    public void zzf(Object obj, Object obj1)
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
        zzaNU = zzaNU + zzaNT.sizeOf(obj, obj1);
        if (zzaNU > zzaNS)
        {
            Iterator iterator = zzaNR.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                zzaNU = zzaNU - zzaNT.sizeOf(entry.getKey(), entry.getValue());
                iterator.remove();
            } while (zzaNU > zzaNS);
        }
        zzaNR.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
    }
}
