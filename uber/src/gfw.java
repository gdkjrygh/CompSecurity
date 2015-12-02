// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;

final class gfw
    implements ide
{

    final gfu a;

    private gfw(gfu gfu1)
    {
        a = gfu1;
        super();
    }

    gfw(gfu gfu1, byte byte0)
    {
        this(gfu1);
    }

    private void a(Client client)
    {
        gfu.a(a, client);
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
