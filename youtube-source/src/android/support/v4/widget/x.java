// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.aw;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

final class x extends a
{

    final SlidingPaneLayout b;
    private final Rect c = new Rect();

    x(SlidingPaneLayout slidingpanelayout)
    {
        b = slidingpanelayout;
        super();
    }

    private boolean b(View view)
    {
        return b.d(view);
    }

    public final void a(View view, android.support.v4.view.a.a a1)
    {
        android.support.v4.view.a.a a2 = android.support.v4.view.a.a.a(a1);
        super.a(view, a2);
        Rect rect = c;
        a2.a(rect);
        a1.b(rect);
        a2.c(rect);
        a1.d(rect);
        a1.c(a2.f());
        a1.a(a2.l());
        a1.b(a2.m());
        a1.c(a2.n());
        a1.h(a2.k());
        a1.f(a2.i());
        a1.a(a2.d());
        a1.b(a2.e());
        a1.d(a2.g());
        a1.e(a2.h());
        a1.g(a2.j());
        a1.a(a2.b());
        a1.b(a2.c());
        a2.o();
        a1.b(android/support/v4/widget/SlidingPaneLayout.getName());
        a1.a(view);
        view = aw.f(view);
        if (view instanceof View)
        {
            a1.c((View)view);
        }
        int j = b.getChildCount();
        for (int i = 0; i < j; i++)
        {
            view = b.getChildAt(i);
            if (!b(view) && view.getVisibility() == 0)
            {
                aw.b(view, 1);
                a1.b(view);
            }
        }

    }

    public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (!b(view))
        {
            return super.a(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
    }
}
