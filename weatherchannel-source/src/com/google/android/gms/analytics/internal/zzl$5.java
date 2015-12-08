// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzl, zzw

class zzKy
    implements Runnable
{

    final zzw zzJx;
    final zzl zzKx;
    final long zzKy;

    public void run()
    {
        zzKx.zza(zzJx, zzKy);
    }

    (zzl zzl1, zzw zzw, long l)
    {
        zzKx = zzl1;
        zzJx = zzw;
        zzKy = l;
        super();
    }
}
