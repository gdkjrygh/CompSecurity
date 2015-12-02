// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;
import android.view.ViewConfiguration;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView, r

final class e
    implements Runnable
{

    final StickyGridHeadersGridView a;

    e(StickyGridHeadersGridView stickygridheadersgridview)
    {
        a = stickygridheadersgridview;
        super();
    }

    public void run()
    {
label0:
        {
label1:
            {
                int i;
label2:
                {
                    i = StickyGridHeadersGridView.s;
                    if (a.j != 0)
                    {
                        break label0;
                    }
                    a.j = 1;
                    View view = a.a(a.h);
                    if (view == null || view.hasFocusable())
                    {
                        break label0;
                    }
                    if (a.C)
                    {
                        break label1;
                    }
                    view.setPressed(true);
                    a.setPressed(true);
                    a.refreshDrawableState();
                    int j = ViewConfiguration.getLongPressTimeout();
                    if (a.isLongClickable())
                    {
                        if (a.y == null)
                        {
                            a.y = new r(a, null);
                        }
                        a.y.b();
                        a.postDelayed(a.y, j);
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    a.j = 2;
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            a.j = 2;
        }
    }
}
