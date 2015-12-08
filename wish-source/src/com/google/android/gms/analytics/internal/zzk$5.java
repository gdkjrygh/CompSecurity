// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzk, zzv

class zzGC
    implements Runnable
{

    final zzv zzFC;
    final zzk zzGB;
    final long zzGC;

    public void run()
    {
        zzGB.zza(zzFC, zzGC);
    }

    (zzk zzk1, zzv zzv, long l)
    {
        zzGB = zzk1;
        zzFC = zzv;
        zzGC = l;
        super();
    }
}
