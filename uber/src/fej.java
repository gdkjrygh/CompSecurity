// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.response.ShareYoRide;

final class fej
    implements icg
{

    final fei a;

    private fej(fei fei1)
    {
        a = fei1;
        super();
    }

    fej(fei fei1, byte byte0)
    {
        this(fei1);
    }

    private void a(ShareYoRide shareyoride)
    {
        a.c = shareyoride.getShareUrl();
        fei.a(a).c(new ffj(a.c));
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((ShareYoRide)obj);
    }

    public final void a(Throwable throwable)
    {
    }
}
