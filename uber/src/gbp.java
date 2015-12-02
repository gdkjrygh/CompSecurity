// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Trip;

final class gbp
    implements ide
{

    final gbo a;

    private gbp(gbo gbo1)
    {
        a = gbo1;
        super();
    }

    gbp(gbo gbo1, byte byte0)
    {
        this(gbo1);
    }

    private void a(gjy gjy1)
    {
        gbo.a(a, (Trip)gjy1.d());
    }

    public final void call(Object obj)
    {
        a((gjy)obj);
    }
}
