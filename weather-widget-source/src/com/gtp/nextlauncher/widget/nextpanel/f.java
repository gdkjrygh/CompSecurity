// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;


// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            NightWallView, e

class f
    implements Runnable
{

    final NightWallView a;

    f(NightWallView nightwallview)
    {
        a = nightwallview;
        super();
    }

    public void run()
    {
        if (NightWallView.access$000(a) == null)
        {
            NightWallView.access$002(a, e.a().u(NightWallView.access$100(a)));
            NightWallView.access$202(a, false);
        }
        if (NightWallView.access$300(a) > 0 && NightWallView.access$400(a) > 0)
        {
            NightWallView.access$700(a, NightWallView.access$500(a), NightWallView.access$600(a));
        }
        NightWallView.access$900(a, NightWallView.access$800(a));
        NightWallView.access$1002(a, false);
        if (NightWallView.access$1100(a) > 0 && NightWallView.access$1200(a) > 0)
        {
            NightWallView.access$1500(a, NightWallView.access$1300(a), NightWallView.access$1400(a));
        }
        if (NightWallView.access$1600(a))
        {
            NightWallView.access$1800(a, NightWallView.access$1700(a));
            NightWallView.access$1902(a, false);
            if (NightWallView.access$2000(a) > 0 && NightWallView.access$2100(a) > 0)
            {
                NightWallView.access$2400(a, NightWallView.access$2200(a), NightWallView.access$2300(a));
            }
        }
        if (NightWallView.access$2500(a))
        {
            NightWallView.access$2600(a);
            NightWallView.access$2502(a, false);
            NightWallView.access$2702(a, true);
        }
    }
}
