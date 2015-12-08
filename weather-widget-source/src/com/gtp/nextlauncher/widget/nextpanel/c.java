// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;


// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            DayWallView, e

class c
    implements Runnable
{

    final DayWallView a;

    c(DayWallView daywallview)
    {
        a = daywallview;
        super();
    }

    public void run()
    {
        if (DayWallView.access$000(a) == null)
        {
            DayWallView.access$002(a, e.a().s(DayWallView.access$100(a)));
            DayWallView.access$202(a, false);
        }
        if (DayWallView.access$300(a) > 0 && DayWallView.access$400(a) > 0)
        {
            DayWallView.access$700(a, DayWallView.access$500(a), DayWallView.access$600(a));
            DayWallView.access$202(a, true);
        }
        if (DayWallView.access$800(a))
        {
            DayWallView.access$902(a, false);
            int i = 0;
            while (i < 3) 
            {
                if (i == 0)
                {
                    DayWallView.access$1000(a)[i] = e.a().x(DayWallView.access$1100(a));
                } else
                if (i == 1)
                {
                    DayWallView.access$1000(a)[i] = e.a().B(DayWallView.access$1200(a));
                } else
                if (i == 2)
                {
                    DayWallView.access$1000(a)[i] = e.a().C(DayWallView.access$1300(a));
                }
                i++;
            }
            if (DayWallView.access$1400(a) > 0 && DayWallView.access$1500(a) > 0)
            {
                DayWallView.access$1800(a, DayWallView.access$1600(a), DayWallView.access$1700(a));
                DayWallView.access$902(a, true);
            }
        }
        if (DayWallView.access$1900(a) == null)
        {
            DayWallView.access$1902(a, e.a().o(DayWallView.access$2000(a)));
        }
        if (DayWallView.access$2100(a) == null)
        {
            DayWallView.access$2102(a, e.a().p(DayWallView.access$2200(a)));
        }
        if (DayWallView.access$2300(a) == null)
        {
            DayWallView.access$2302(a, e.a().q(DayWallView.access$2400(a)));
        }
        if (DayWallView.access$2500(a) == null)
        {
            DayWallView.access$2502(a, e.a().r(DayWallView.access$2600(a)));
        }
        DayWallView.access$2702(a, false);
        if (DayWallView.access$2800(a) > 0 && DayWallView.access$2900(a) > 0)
        {
            DayWallView.access$3200(a, DayWallView.access$3000(a), DayWallView.access$3100(a));
            DayWallView.access$2702(a, true);
        }
        if (DayWallView.access$3300(a))
        {
            DayWallView.access$3400(a);
        }
        DayWallView.access$3302(a, false);
    }
}
