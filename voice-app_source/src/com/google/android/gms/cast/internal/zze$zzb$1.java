// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;


// Referenced classes of package com.google.android.gms.cast.internal:
//            zze

class zzUK
    implements Runnable
{

    final zze zzUJ;
    final int zzUK;
    final zzUK zzUL;

    public void run()
    {
        if (zze.zzd(zzUJ) != null)
        {
            zze.zzd(zzUJ).onApplicationDisconnected(zzUK);
        }
    }

    ( , zze zze1, int i)
    {
        zzUL = ;
        zzUJ = zze1;
        zzUK = i;
        super();
    }
}
