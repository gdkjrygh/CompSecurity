// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.config.AppConfigKey;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Trip;
import java.util.List;

final class gbs
    implements ide
{

    final gbr a;

    private gbs(gbr gbr1)
    {
        a = gbr1;
        super();
    }

    gbs(gbr gbr1, byte byte0)
    {
        this(gbr1);
    }

    private void a(gbt gbt1)
    {
        com.ubercab.rider.realtime.model.Client client = gbt1.a;
        Object obj = (ClientStatus)gbt1.b.d();
        gbt1 = (Trip)gbt1.c.d();
        if (obj != null)
        {
            boolean flag;
            boolean flag1;
            if (gbt1 != null && gbt1.getLegs() != null && gbt1.getLegs().size() > 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = gbr.a(a).a(AppConfigKey.k, true);
            if (!flag || !flag1)
            {
                gbr.b(a);
                gbr.c(a);
                gbr.a(a, null);
                gbr.a(a, null);
                return;
            }
            obj = gbr.a(gbt1, client, ((ClientStatus) (obj)).getStatus());
            String s = gbt1.getCurrentRoute();
            if (!gjx.a(gbr.d(a), obj) || !gjx.a(gbr.e(a), s))
            {
                gbr.a(a, ((List) (obj)));
                gbr.a(a, s);
                gbr.b(a);
                gbr.c(a);
                if (obj != null)
                {
                    gbr.a(a, gbt1, client, ((List) (obj)));
                    gbr.b(a, gbt1, client, ((List) (obj)));
                }
                gbr.f(a).b();
                return;
            }
        }
    }

    public final void call(Object obj)
    {
        a((gbt)obj);
    }
}
