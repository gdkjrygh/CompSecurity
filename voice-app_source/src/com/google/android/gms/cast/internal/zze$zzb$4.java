// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zze, zzl

class zzUO
    implements Runnable
{

    final String zzQz;
    final zze zzUJ;
    final zzQz zzUL;
    final String zzUO;

    public void run()
    {
        com.google.android.gms.cast.geReceivedCallback gereceivedcallback;
        synchronized (zze.zze(zzUJ))
        {
            gereceivedcallback = (com.google.android.gms.cast.geReceivedCallback)zze.zze(zzUJ).get(zzQz);
        }
        if (gereceivedcallback != null)
        {
            gereceivedcallback.onMessageReceived(zze.zzf(zzUJ), zzQz, zzUO);
            return;
        } else
        {
            zze.zzlT().zzb("Discarded message for unknown namespace '%s'", new Object[] {
                zzQz
            });
            return;
        }
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    dCallback(dCallback dcallback, zze zze1, String s, String s1)
    {
        zzUL = dcallback;
        zzUJ = zze1;
        zzQz = s;
        zzUO = s1;
        super();
    }
}
