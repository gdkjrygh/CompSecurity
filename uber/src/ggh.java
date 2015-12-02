// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;

final class ggh
    implements ide
{

    final ggc a;

    private ggh(ggc ggc1)
    {
        a = ggc1;
        super();
    }

    ggh(ggc ggc1, byte byte0)
    {
        this(ggc1);
    }

    private void a(Client client)
    {
        while (!duh.c(a.f, null) || ggc.a(a) || ggc.a(client)) 
        {
            return;
        }
        ggc.b(a);
        ggc.c(a);
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
