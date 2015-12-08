// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzhv, zzhw

public class zzht
    implements zzhv
{

    private final Object zzGK;
    private final zzhw zzGM = new zzhw();

    public zzht(Object obj)
    {
        zzGK = obj;
        zzGM.zzgy();
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public Object get()
    {
        return zzGK;
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return zzGK;
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }

    public void zzb(Runnable runnable)
    {
        zzGM.zzb(runnable);
    }
}
