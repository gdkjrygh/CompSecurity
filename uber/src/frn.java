// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import java.util.Map;

public final class frn
    implements idn
{

    Map a;
    gjy b;
    Client c;
    ClientStatus d;
    gjy e;
    gjy f;

    private frn()
    {
    }

    public frn(byte byte0)
    {
        this();
    }

    private frn a(Map map, gjy gjy1, Client client, ClientStatus clientstatus, gjy gjy2, gjy gjy3)
    {
        a = map;
        b = gjy1;
        c = client;
        d = clientstatus;
        e = gjy2;
        f = gjy3;
        return this;
    }

    public final volatile Object a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return a((Map)obj, (gjy)obj1, (Client)obj2, (ClientStatus)obj3, (gjy)obj4, (gjy)obj5);
    }
}
