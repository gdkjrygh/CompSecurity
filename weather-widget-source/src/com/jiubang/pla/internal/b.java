// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;


// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AbsListView

class b
    implements Runnable
{

    final PLA_AbsListView a;

    b(PLA_AbsListView pla_abslistview)
    {
        a = pla_abslistview;
        super();
    }

    public void run()
    {
        if (a.n)
        {
            a.n = false;
            PLA_AbsListView.a(a, false);
            if ((a.getPersistentDrawingCache() & 2) == 0)
            {
                PLA_AbsListView.b(a, false);
            }
            if (!a.isAlwaysDrawnWithCacheEnabled())
            {
                a.invalidate();
            }
        }
    }
}
