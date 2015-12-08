// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;


// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            RainyView

class i
    implements Runnable
{

    final RainyView a;

    i(RainyView rainyview)
    {
        a = rainyview;
        super();
    }

    public void run()
    {
        RainyView.access$100(a, RainyView.access$000(a));
        if (RainyView.access$200(a) > 0 && RainyView.access$300(a) > 0)
        {
            RainyView.access$600(a, RainyView.access$400(a), RainyView.access$500(a));
        }
        if (RainyView.access$700(a))
        {
            RainyView.access$800(a, RainyView.access$000(a));
            RainyView.access$902(a, false);
            if (RainyView.access$1000(a) > 0 && RainyView.access$1100(a) > 0)
            {
                RainyView.access$1400(a, RainyView.access$1200(a), RainyView.access$1300(a));
            }
        }
        if (RainyView.access$1500(a))
        {
            RainyView.access$1600(a, RainyView.access$000(a));
            RainyView.access$1702(a, false);
            if (RainyView.access$1800(a) > 0 && RainyView.access$1900(a) > 0)
            {
                RainyView.access$2200(a, RainyView.access$2000(a), RainyView.access$2100(a));
            }
        }
        if (RainyView.access$2300(a))
        {
            RainyView.access$2400(a);
            RainyView.access$2302(a, false);
            RainyView.access$2502(a, true);
        }
    }
}
