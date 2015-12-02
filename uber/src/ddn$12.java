// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;

final class ng.Object
    implements gle
{

    final hkr a;
    final ddn b;

    public final String a()
    {
        Client client = a.c();
        if (client != null)
        {
            return client.getUuid();
        } else
        {
            return null;
        }
    }

    ng(ddn ddn1, hkr hkr1)
    {
        b = ddn1;
        a = hkr1;
        super();
    }
}
