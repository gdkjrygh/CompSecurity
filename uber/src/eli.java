// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.ClientStatus;

final class eli
    implements idl
{

    gjy a;
    ClientStatus b;
    gjy c;
    gjy d;

    private eli()
    {
    }

    eli(byte byte0)
    {
        this();
    }

    private eli a(gjy gjy1, ClientStatus clientstatus, gjy gjy2, gjy gjy3)
    {
        a = gjy1;
        b = clientstatus;
        c = gjy2;
        d = gjy3;
        return this;
    }

    public final volatile Object a(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return a((gjy)obj, (ClientStatus)obj1, (gjy)obj2, (gjy)obj3);
    }
}
