// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzl, zzw

class zzMy
    implements Runnable
{

    final zzw zzLx;
    final zzl zzMx;
    final long zzMy;

    public void run()
    {
        zzMx.zza(zzLx, zzMy);
    }

    (zzl zzl1, zzw zzw, long l)
    {
        zzMx = zzl1;
        zzLx = zzw;
        zzMy = l;
        super();
    }
}
