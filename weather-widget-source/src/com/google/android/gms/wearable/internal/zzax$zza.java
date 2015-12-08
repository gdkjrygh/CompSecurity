// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzax, zzbo

private static class zzbaE extends zzbaE
{

    private WeakReference zzbaD;
    private WeakReference zzbaE;

    public void zzc(Status status)
    {
        Map map;
        Object obj;
        map = (Map)zzbaD.get();
        obj = zzbaE.get();
        if (status.getStatus().isSuccess() || map == null || obj == null) goto _L2; else goto _L1
_L1:
        map;
        JVM INSTR monitorenter ;
        obj = (zzbo)map.remove(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((zzbo) (obj)).clear();
        map;
        JVM INSTR monitorexit ;
_L2:
        zzR(status);
        return;
        status;
        map;
        JVM INSTR monitorexit ;
        throw status;
    }

    (Map map, Object obj, com.google.android.gms.common.api.ax.zza zza1)
    {
        super(zza1);
        zzbaD = new WeakReference(map);
        zzbaE = new WeakReference(obj);
    }
}
