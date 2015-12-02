// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Eyeball;

final class elb
    implements ide
{

    final ela a;

    private elb(ela ela1)
    {
        a = ela1;
        super();
    }

    elb(ela ela1, byte byte0)
    {
        this(ela1);
    }

    private void a(gjy gjy1)
    {
        gjy1 = (Eyeball)gjy1.d();
        if (gjy1 != null)
        {
            gjy1 = gjy1.getFareSplit();
        } else
        {
            gjy1 = null;
        }
        a.a(gjy1);
    }

    public final void call(Object obj)
    {
        a((gjy)obj);
    }
}
