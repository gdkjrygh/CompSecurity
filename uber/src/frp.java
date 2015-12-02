// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.ClientStatus;

public final class frp
    implements idj
{

    ClientStatus a;

    public frp()
    {
    }

    private frp a(ClientStatus clientstatus)
    {
        a = clientstatus;
        return this;
    }

    public final volatile Object a(Object obj, Object obj1)
    {
        return a((ClientStatus)obj1);
    }
}
