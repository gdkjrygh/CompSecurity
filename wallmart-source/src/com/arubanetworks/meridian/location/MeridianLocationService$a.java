// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;


// Referenced classes of package com.arubanetworks.meridian.location:
//            MeridianLocationService

private class <init>
{

    final MeridianLocationService a;
    private long b;

    void a()
    {
        b = 2000L;
    }

    long b()
    {
        long l = Math.min(b * 2L, 30000L);
        b = l;
        return l;
    }

    private (MeridianLocationService meridianlocationservice)
    {
        a = meridianlocationservice;
        super();
        a();
    }

    a(MeridianLocationService meridianlocationservice, a a1)
    {
        this(meridianlocationservice);
    }
}
