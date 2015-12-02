// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class gju
{

    public gju()
    {
    }

    public static long a()
    {
        return System.currentTimeMillis();
    }

    public static long b()
    {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }
}
