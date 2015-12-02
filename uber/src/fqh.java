// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;

final class fqh
    implements ide
{

    final fqg a;

    private fqh(fqg fqg1)
    {
        a = fqg1;
        super();
    }

    fqh(fqg fqg1, byte byte0)
    {
        this(fqg1);
    }

    private void a(Client client)
    {
        fqg.a(a, client);
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
