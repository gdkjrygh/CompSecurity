// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;


// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            OverCast

class g
    implements Runnable
{

    final OverCast a;

    g(OverCast overcast)
    {
        a = overcast;
        super();
    }

    public void run()
    {
        OverCast.access$100(a, OverCast.access$000(a));
        OverCast.access$202(a, true);
        if (OverCast.access$300(a) > 0 && OverCast.access$400(a) > 0)
        {
            OverCast.access$700(a, OverCast.access$500(a), OverCast.access$600(a));
        }
        if (OverCast.access$800(a))
        {
            OverCast.access$900(a);
            OverCast.access$802(a, false);
            OverCast.access$1002(a, true);
        }
    }
}
