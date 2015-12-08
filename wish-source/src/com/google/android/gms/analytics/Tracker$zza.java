// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zze;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker

private class zzFa extends zzd
{

    final Tracker zzEX;
    private long zzFa;
    private boolean zzFb;

    protected void zzgb()
    {
    }

    public boolean zzge()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = zzFb;
        zzFb = false;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected (Tracker tracker, zze zze)
    {
        zzEX = tracker;
        super(zze);
        zzFa = -1L;
    }
}
