// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;

public final class eqc
    implements idl
{

    gjy a;
    Client b;
    ClientStatus c;
    gjy d;

    private eqc()
    {
    }

    public eqc(byte byte0)
    {
        this();
    }

    private eqc a(gjy gjy1, Client client, ClientStatus clientstatus, gjy gjy2)
    {
        a = gjy1;
        b = client;
        c = clientstatus;
        d = gjy2;
        return this;
    }

    public final volatile Object a(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return a((gjy)obj, (Client)obj1, (ClientStatus)obj2, (gjy)obj3);
    }
}
