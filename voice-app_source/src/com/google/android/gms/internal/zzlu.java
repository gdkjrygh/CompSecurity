// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class zzlu
{

    private static final List zzajL;

    public static long zza(long l, TimeUnit timeunit, TimeUnit timeunit1)
    {
        return timeunit.convert(timeunit1.convert(l, timeunit), timeunit1);
    }

    public static boolean zza(TimeUnit timeunit)
    {
        return zza(timeunit, TimeUnit.MILLISECONDS);
    }

    private static boolean zza(TimeUnit timeunit, TimeUnit timeunit1)
    {
        return zzajL.indexOf(timeunit) < zzajL.indexOf(timeunit1);
    }

    static 
    {
        zzajL = Arrays.asList(new TimeUnit[] {
            TimeUnit.NANOSECONDS, TimeUnit.MICROSECONDS, TimeUnit.MILLISECONDS, TimeUnit.SECONDS, TimeUnit.MINUTES, TimeUnit.HOURS, TimeUnit.DAYS
        });
    }
}
