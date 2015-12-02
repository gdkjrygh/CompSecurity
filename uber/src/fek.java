// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.ClientStatus;

final class fek
    implements ide
{

    final fei a;

    private fek(fei fei1)
    {
        a = fei1;
        super();
    }

    fek(fei fei1, byte byte0)
    {
        this(fei1);
    }

    private void a(gjy gjy1)
    {
        gjy1 = (ClientStatus)gjy1.d();
        if (gjy1 != null)
        {
            gjy1 = gjy1.getStatus();
            if (a.a && !"OnTrip".equals(gjy1) && !"WaitingForPickup".equals(gjy1))
            {
                a.a = false;
                a.c = null;
                a.b = null;
            }
        }
    }

    public final void call(Object obj)
    {
        a((gjy)obj);
    }
}
