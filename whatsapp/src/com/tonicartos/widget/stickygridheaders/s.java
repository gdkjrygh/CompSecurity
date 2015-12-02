// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;


// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            q, StickyGridHeadersGridView, p, t

class s extends q
    implements Runnable
{

    final StickyGridHeadersGridView c;
    int d;

    private s(StickyGridHeadersGridView stickygridheadersgridview)
    {
        c = stickygridheadersgridview;
        super(stickygridheadersgridview, null);
    }

    s(StickyGridHeadersGridView stickygridheadersgridview, t t)
    {
        this(stickygridheadersgridview);
    }

    public void run()
    {
        if (!c.C && c.k != null && c.k.getCount() > 0 && d != -1 && d < c.k.getCount() && a())
        {
            android.view.View view = c.a(d);
            if (view != null)
            {
                c.b(view, StickyGridHeadersGridView.a(c, d));
                return;
            }
        }
    }
}
