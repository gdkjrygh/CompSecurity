// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;

final class ght
    implements ide
{

    final ghs a;

    private ght(ghs ghs1)
    {
        a = ghs1;
        super();
    }

    ght(ghs ghs1, byte byte0)
    {
        this(ghs1);
    }

    private void a(Client client)
    {
        ghs.a(a, client);
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
