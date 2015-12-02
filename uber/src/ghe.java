// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;

final class ghe
    implements idl
{

    gjy a;
    Client b;
    gjy c;
    gjy d;

    private ghe()
    {
    }

    ghe(byte byte0)
    {
        this();
    }

    private ghe a(gjy gjy1, Client client, gjy gjy2, gjy gjy3)
    {
        a = gjy1;
        b = client;
        c = gjy2;
        d = gjy3;
        return this;
    }

    public final volatile Object a(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return a((gjy)obj, (Client)obj1, (gjy)obj2, (gjy)obj3);
    }
}
