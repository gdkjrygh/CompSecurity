// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            aj, SlidingPaneLayout, ag

final class z extends aj
{

    final SlidingPaneLayout a;

    private z(SlidingPaneLayout slidingpanelayout)
    {
        a = slidingpanelayout;
        super();
    }

    z(SlidingPaneLayout slidingpanelayout, byte byte0)
    {
        this(slidingpanelayout);
    }

    public final void a(int i)
    {
label0:
        {
            if (SlidingPaneLayout.b(a).a() == 0)
            {
                if (SlidingPaneLayout.c(a) != 0.0F)
                {
                    break label0;
                }
                a.c(SlidingPaneLayout.d(a));
                a.b(SlidingPaneLayout.d(a));
                SlidingPaneLayout.a(a, false);
            }
            return;
        }
        a.a(SlidingPaneLayout.d(a));
        SlidingPaneLayout.a(a, true);
    }

    public final void a(int i, int j)
    {
        SlidingPaneLayout.b(a).a(SlidingPaneLayout.d(a), j);
    }

    public final void a(View view, float f)
    {
        int i;
label0:
        {
            SlidingPaneLayout.LayoutParams layoutparams = (SlidingPaneLayout.LayoutParams)view.getLayoutParams();
            i = a.getPaddingLeft();
            int j = layoutparams.leftMargin + i;
            if (f <= 0.0F)
            {
                i = j;
                if (f != 0.0F)
                {
                    break label0;
                }
                i = j;
                if (SlidingPaneLayout.c(a) <= 0.5F)
                {
                    break label0;
                }
            }
            i = j + SlidingPaneLayout.e(a);
        }
        SlidingPaneLayout.b(a).a(i, view.getTop());
        a.invalidate();
    }

    public final void a(View view, int i)
    {
        SlidingPaneLayout.a(a, i);
        a.invalidate();
    }

    public final boolean a(View view)
    {
        if (SlidingPaneLayout.a(a))
        {
            return false;
        } else
        {
            return ((SlidingPaneLayout.LayoutParams)view.getLayoutParams()).b;
        }
    }

    public final int b(View view, int i)
    {
        view = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.d(a).getLayoutParams();
        int j = a.getPaddingLeft();
        j = ((SlidingPaneLayout.LayoutParams) (view)).leftMargin + j;
        int k = SlidingPaneLayout.e(a);
        return Math.min(Math.max(i, j), k + j);
    }

    public final void b(View view)
    {
        a.a();
    }

    public final int c(View view)
    {
        return SlidingPaneLayout.e(a);
    }
}
