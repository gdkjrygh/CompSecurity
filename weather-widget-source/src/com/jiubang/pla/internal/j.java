// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;


// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AbsListView, a

class j
{

    private int a;
    final PLA_AbsListView d;

    private j(PLA_AbsListView pla_abslistview)
    {
        d = pla_abslistview;
        super();
    }

    j(PLA_AbsListView pla_abslistview, a a1)
    {
        this(pla_abslistview);
    }

    public void a()
    {
        a = PLA_AbsListView.a(d);
    }

    public boolean b()
    {
        return d.hasWindowFocus() && PLA_AbsListView.b(d) == a;
    }
}
