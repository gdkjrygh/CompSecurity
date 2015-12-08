// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.c.b;
import android.support.v7.internal.view.menu.ad;
import android.support.v7.internal.view.menu.aj;
import android.support.v7.internal.view.menu.o;
import android.support.v7.internal.view.menu.s;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, ScrollingTabContainerView, ar

final class i
    implements ad
{

    o a;
    s b;
    final ActionBarView c;

    private i(ActionBarView actionbarview)
    {
        c = actionbarview;
        super();
    }

    i(ActionBarView actionbarview, byte byte0)
    {
        this(actionbarview);
    }

    public final void a(Context context, o o1)
    {
        if (a != null && b != null)
        {
            a.b(b);
        }
        a = o1;
    }

    public final void a(o o1, boolean flag)
    {
    }

    public final boolean a(aj aj)
    {
        return false;
    }

    public final boolean b(s s1)
    {
        c.g = s1.getActionView();
        ActionBarView.e(c).a(ActionBarView.d(c).getConstantState().newDrawable(c.getResources()));
        b = s1;
        if (c.g.getParent() != c)
        {
            c.addView(c.g);
        }
        if (ActionBarView.e(c).getParent() != c)
        {
            c.addView(ActionBarView.e(c));
        }
        ActionBarView.f(c).setVisibility(8);
        if (ActionBarView.g(c) != null)
        {
            ActionBarView.g(c).setVisibility(8);
        }
        if (ActionBarView.h(c) != null)
        {
            ActionBarView.h(c).setVisibility(8);
        }
        if (ActionBarView.i(c) != null)
        {
            ActionBarView.i(c).setVisibility(8);
        }
        if (ActionBarView.j(c) != null)
        {
            ActionBarView.j(c).setVisibility(8);
        }
        c.requestLayout();
        s1.e(true);
        if (c.g instanceof b)
        {
            ((b)c.g).a();
        }
        return true;
    }

    public final void c(boolean flag)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        k = a.size();
        j = 0;
_L5:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        if ((android.support.v4.c.a.b)a.getItem(j) != b) goto _L4; else goto _L3
_L3:
        j = 1;
_L6:
        if (j == 0)
        {
            o o1 = a;
            c(b);
        }
_L2:
        return;
_L4:
        j++;
          goto _L5
        j = 0;
          goto _L6
    }

    public final boolean c(s s1)
    {
        if (c.g instanceof b)
        {
            ((b)c.g).b();
        }
        c.removeView(c.g);
        c.removeView(ActionBarView.e(c));
        c.g = null;
        if ((ActionBarView.k(c) & 2) != 0)
        {
            ActionBarView.f(c).setVisibility(0);
        }
        if ((ActionBarView.k(c) & 8) != 0)
        {
            if (ActionBarView.g(c) == null)
            {
                ActionBarView.l(c);
            } else
            {
                ActionBarView.g(c).setVisibility(0);
            }
        }
        if (ActionBarView.h(c) != null && ActionBarView.m(c) == 2)
        {
            ActionBarView.h(c).setVisibility(0);
        }
        if (ActionBarView.i(c) != null && ActionBarView.m(c) == 1)
        {
            ActionBarView.i(c).setVisibility(0);
        }
        if (ActionBarView.j(c) != null && (ActionBarView.k(c) & 0x10) != 0)
        {
            ActionBarView.j(c).setVisibility(0);
        }
        ActionBarView.e(c).a(null);
        b = null;
        c.requestLayout();
        s1.e(false);
        return true;
    }

    public final boolean h()
    {
        return false;
    }
}
