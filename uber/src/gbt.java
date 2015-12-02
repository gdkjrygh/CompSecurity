// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;

final class gbt
    implements idk
{

    Client a;
    gjy b;
    gjy c;

    private gbt()
    {
    }

    gbt(byte byte0)
    {
        this();
    }

    private gbt a(Client client, gjy gjy1, gjy gjy2)
    {
        a = client;
        b = gjy1;
        c = gjy2;
        return this;
    }

    public final volatile Object a(Object obj, Object obj1, Object obj2)
    {
        return a((Client)obj, (gjy)obj1, (gjy)obj2);
    }
}
