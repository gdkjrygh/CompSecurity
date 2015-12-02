// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Trip;

final class dbz
    implements ide
{

    final dby a;

    private dbz(dby dby1)
    {
        a = dby1;
        super();
    }

    dbz(dby dby1, byte byte0)
    {
        this(dby1);
    }

    private void a(gjy gjy1)
    {
        gjy1 = (Trip)gjy1.d();
        dby.a(a);
        if (!a.a.n())
        {
            return;
        }
        dby dby1 = a;
        if (gjy1 != null)
        {
            gjy1 = gjy1.getUuid();
        } else
        {
            gjy1 = null;
        }
        dby.a(dby1, gjy1);
    }

    public final void call(Object obj)
    {
        a((gjy)obj);
    }
}
