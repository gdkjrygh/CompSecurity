// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzih, zzii

public class zzif
    implements zzih
{

    private final Object zzID;
    private final zzii zzIF = new zzii();

    public zzif(Object obj)
    {
        zzID = obj;
        zzIF.zzgK();
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public Object get()
    {
        return zzID;
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return zzID;
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }

    public void zzc(Runnable runnable)
    {
        zzIF.zzc(runnable);
    }
}
