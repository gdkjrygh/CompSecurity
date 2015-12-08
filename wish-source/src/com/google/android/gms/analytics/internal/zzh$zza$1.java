// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzh, zzab

class zzGh
    implements Runnable
{

    final zzab zzGh;
    final zzGh zzGi;

    public void run()
    {
        if (!zzGi.Ge.isConnected())
        {
            zzGi.Ge.zzaG("Connected to service after a timeout");
            zzh.zza(zzGi.Ge, zzGh);
        }
    }

    _cls9(_cls9 _pcls9, zzab zzab)
    {
        zzGi = _pcls9;
        zzGh = zzab;
        super();
    }
}
