// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzi, zzac

class zzMd
    implements Runnable
{

    final zzac zzMd;
    final zzMd zzMe;

    public void run()
    {
        if (!zzMe.Ma.isConnected())
        {
            zzMe.Ma.zzaZ("Connected to service after a timeout");
            zzi.zza(zzMe.Ma, zzMd);
        }
    }

    _cls9(_cls9 _pcls9, zzac zzac)
    {
        zzMe = _pcls9;
        zzMd = zzac;
        super();
    }
}
