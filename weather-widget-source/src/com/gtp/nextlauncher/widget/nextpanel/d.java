// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;


// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            Fog, e

class d
    implements Runnable
{

    final Fog a;

    d(Fog fog)
    {
        a = fog;
        super();
    }

    public void run()
    {
        Fog.access$000(a)[0] = e.a().h(Fog.access$100(a));
        Fog.access$000(a)[1] = e.a().i(Fog.access$200(a));
        Fog.access$000(a)[2] = e.a().j(Fog.access$300(a));
        Fog.access$402(a, true);
        Fog.access$502(a, false);
        if (Fog.access$600(a) > 0 && Fog.access$700(a) > 0)
        {
            Fog.access$1000(a, Fog.access$800(a), Fog.access$900(a));
        }
        if (Fog.access$1100(a))
        {
            Fog.access$1200(a);
            Fog.access$1102(a, false);
            Fog.access$1302(a, true);
        }
    }
}
