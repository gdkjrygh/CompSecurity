// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            q, StickyGridHeadersGridView, t

class r extends q
    implements Runnable
{

    final StickyGridHeadersGridView c;

    private r(StickyGridHeadersGridView stickygridheadersgridview)
    {
        c = stickygridheadersgridview;
        super(stickygridheadersgridview, null);
    }

    r(StickyGridHeadersGridView stickygridheadersgridview, t t)
    {
        this(stickygridheadersgridview);
    }

    public void run()
    {
label0:
        {
            View view = c.a(c.h);
            if (view == null)
            {
                break label0;
            }
            long l = StickyGridHeadersGridView.a(c, c.h);
            boolean flag;
            if (a() && !c.C)
            {
                flag = c.a(view, l);
            } else
            {
                flag = false;
            }
            if (flag)
            {
                c.j = -2;
                c.setPressed(false);
                view.setPressed(false);
                if (StickyGridHeadersGridView.s == 0)
                {
                    break label0;
                }
            }
            c.j = 2;
        }
    }
}
