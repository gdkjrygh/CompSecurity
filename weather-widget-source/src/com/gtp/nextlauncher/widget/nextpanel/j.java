// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;


// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            Snowy

class j
    implements Runnable
{

    final Snowy a;

    j(Snowy snowy)
    {
        a = snowy;
        super();
    }

    public void run()
    {
        Snowy.access$100(a, Snowy.access$000(a));
        Snowy.access$202(a, true);
        if (Snowy.access$300(a) > 0 && Snowy.access$400(a) > 0)
        {
            Snowy.access$700(a, Snowy.access$500(a), Snowy.access$600(a));
        }
        if (Snowy.access$800(a))
        {
            Snowy.access$900(a);
            Snowy.access$1002(a, true);
            Snowy.access$802(a, false);
        }
    }
}
