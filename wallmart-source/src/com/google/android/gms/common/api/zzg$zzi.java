// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, zzi

private abstract class <init>
    implements Runnable
{

    final zzg zzZK;

    public void run()
    {
        zzg.zzc(zzZK).lock();
        boolean flag = Thread.interrupted();
        if (flag)
        {
            zzg.zzc(zzZK).unlock();
            return;
        }
        zznn();
        zzg.zzc(zzZK).unlock();
        return;
        Object obj;
        obj;
        zzg.zzd(zzZK).zza(((RuntimeException) (obj)));
        zzg.zzc(zzZK).unlock();
        return;
        obj;
        zzg.zzc(zzZK).unlock();
        throw obj;
    }

    protected abstract void zznn();

    private (zzg zzg1)
    {
        zzZK = zzg1;
        super();
    }

    zzZK(zzg zzg1, zzZK zzzk)
    {
        this(zzg1);
    }
}
