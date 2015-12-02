// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;


// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView, t

class q
{

    final StickyGridHeadersGridView a;
    private int b;

    private q(StickyGridHeadersGridView stickygridheadersgridview)
    {
        a = stickygridheadersgridview;
        super();
    }

    q(StickyGridHeadersGridView stickygridheadersgridview, t t)
    {
        this(stickygridheadersgridview);
    }

    public boolean a()
    {
        return a.hasWindowFocus() && StickyGridHeadersGridView.a(a) == b;
    }

    public void b()
    {
        b = StickyGridHeadersGridView.c(a);
    }
}
