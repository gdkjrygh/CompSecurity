// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;

public final class fcl
    implements idj
{

    Client a;
    ClientStatus b;

    private fcl()
    {
    }

    public fcl(byte byte0)
    {
        this();
    }

    private fcl a(Client client, ClientStatus clientstatus)
    {
        a = client;
        b = clientstatus;
        return this;
    }

    public final volatile Object a(Object obj, Object obj1)
    {
        return a((Client)obj, (ClientStatus)obj1);
    }
}
