// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.aw;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

final class y
    implements Runnable
{

    final View a;
    final SlidingPaneLayout b;

    y(SlidingPaneLayout slidingpanelayout, View view)
    {
        b = slidingpanelayout;
        super();
        a = view;
    }

    public final void run()
    {
        if (a.getParent() == b)
        {
            aw.a(a, 0, null);
            SlidingPaneLayout.a(b, a);
        }
        SlidingPaneLayout.f(b).remove(this);
    }
}
