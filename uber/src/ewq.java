// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Trip;

final class ewq
    implements ide
{

    final ewm a;

    private ewq(ewm ewm1)
    {
        a = ewm1;
        super();
    }

    ewq(ewm ewm1, byte byte0)
    {
        this(ewm1);
    }

    private void a(gjy gjy1)
    {
        ewm.a(a, (Trip)gjy1.d());
    }

    public final void call(Object obj)
    {
        a((gjy)obj);
    }
}
