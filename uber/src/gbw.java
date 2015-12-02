// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Trip;
import java.util.List;

final class gbw
    implements ide
{

    final gbv a;

    private gbw(gbv gbv1)
    {
        a = gbv1;
        super();
    }

    gbw(gbv gbv1, byte byte0)
    {
        this(gbv1);
    }

    private void a(gjy gjy1)
    {
        boolean flag1 = true;
        gjy1 = (Trip)gjy1.d();
        if (gjy1 != null && gjy1.getLegs() != null && gjy1.getLegs().size() > 1)
        {
            gbv.a(a);
        } else
        {
            int i = gbv.b(a).g();
            boolean flag2 = gbv.b(a).a();
            boolean flag3 = gbv.b(a).j();
            boolean flag;
            if (i == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (i != 4)
            {
                flag1 = false;
            }
            if (!flag2 || !flag3 || !flag && !flag1)
            {
                if (gjy1 == null)
                {
                    gbv.a(a);
                    return;
                } else
                {
                    gbv.a(a, gjy1.getRouteToDestination());
                    return;
                }
            }
        }
    }

    public final void call(Object obj)
    {
        a((gjy)obj);
    }
}
