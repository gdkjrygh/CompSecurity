// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl

class zzqV
    implements Runnable
{

    final zzhl zzGn;
    final Context zzqV;

    public void run()
    {
        synchronized (zzhl.zza(zzGn))
        {
            zzhl.zza(zzGn, zzGn.zzI(zzqV));
            zzhl.zza(zzGn).notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (zzhl zzhl1, Context context)
    {
        zzGn = zzhl1;
        zzqV = context;
        super();
    }
}
