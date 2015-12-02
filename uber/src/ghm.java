// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;

final class ghm
    implements ide
{

    final ghl a;

    private ghm(ghl ghl1)
    {
        a = ghl1;
        super();
    }

    ghm(ghl ghl1, byte byte0)
    {
        this(ghl1);
    }

    private void a(Client client)
    {
        ghl.a(a, client);
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
