// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;

final class fsz
    implements idj
{

    Client a;
    gjy b;

    private fsz()
    {
    }

    fsz(byte byte0)
    {
        this();
    }

    private fsz a(Client client, gjy gjy1)
    {
        a = client;
        b = gjy1;
        return this;
    }

    public final volatile Object a(Object obj, Object obj1)
    {
        return a((Client)obj, (gjy)obj1);
    }
}
