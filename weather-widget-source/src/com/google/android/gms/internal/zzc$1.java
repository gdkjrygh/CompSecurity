// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzc, zzk

class zzm
    implements Runnable
{

    final zzk zzm;
    final zzc zzn;

    public void run()
    {
        try
        {
            zzc.zza(zzn).put(zzm);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    (zzc zzc1, zzk zzk)
    {
        zzn = zzc1;
        zzm = zzk;
        super();
    }
}
