// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView, s

class a
    implements Runnable
{

    final s a;
    final StickyGridHeadersGridView b;
    final View c;

    a(StickyGridHeadersGridView stickygridheadersgridview, View view, s s1)
    {
        b = stickygridheadersgridview;
        c = view;
        a = s1;
        super();
    }

    public void run()
    {
        b.j = -1;
        c.setPressed(false);
        b.setPressed(false);
        if (!b.C)
        {
            a.run();
        }
    }
}
