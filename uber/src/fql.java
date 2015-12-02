// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;

public final class fql
    implements idk
{

    gjy a;
    Client b;
    ClientStatus c;

    private fql()
    {
    }

    public fql(byte byte0)
    {
        this();
    }

    private fql a(gjy gjy1, Client client, ClientStatus clientstatus)
    {
        a = gjy1;
        b = client;
        c = clientstatus;
        return this;
    }

    public final volatile Object a(Object obj, Object obj1, Object obj2)
    {
        return a((gjy)obj, (Client)obj1, (ClientStatus)obj2);
    }
}
