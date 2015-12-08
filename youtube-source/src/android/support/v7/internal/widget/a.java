// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.a.c;
import android.support.v7.a.d;
import android.support.v7.a.k;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            b, ActionBarContainer

abstract class a extends ViewGroup
{

    protected ActionMenuView a;
    protected ActionMenuPresenter b;
    protected ActionBarContainer c;
    protected boolean d;
    protected boolean e;
    protected int f;

    a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    a(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected static int a(View view, int i, int j, int l)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
        return Math.max(0, (i - view.getMeasuredWidth()) + 0);
    }

    protected static int b(View view, int i, int j, int l)
    {
        int i1 = view.getMeasuredWidth();
        int j1 = view.getMeasuredHeight();
        j = (l - j1) / 2 + j;
        view.layout(i, j, i + i1, j1 + j);
        return i1;
    }

    protected static int c(View view, int i, int j, int l)
    {
        int i1 = view.getMeasuredWidth();
        int j1 = view.getMeasuredHeight();
        j = (l - j1) / 2 + j;
        view.layout(i - i1, j, i, j1 + j);
        return i1;
    }

    public int a()
    {
        return getVisibility();
    }

    public boolean b()
    {
        if (b != null)
        {
            return b.b();
        } else
        {
            return false;
        }
    }

    public void c()
    {
        post(new b(this));
    }

    public boolean d()
    {
        if (b != null)
        {
            return b.c();
        } else
        {
            return false;
        }
    }

    public boolean e()
    {
        if (b != null)
        {
            return b.f();
        } else
        {
            return false;
        }
    }

    public boolean f()
    {
        return b != null && b.g();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = getContext().obtainStyledAttributes(null, k.a, c.b, 0);
        setContentHeight(configuration.getLayoutDimension(1, 0));
        configuration.recycle();
        if (e)
        {
            setSplitActionBar(getContext().getResources().getBoolean(d.e));
        }
        if (b != null)
        {
            b.a();
        }
    }

    public void setContentHeight(int i)
    {
        f = i;
        requestLayout();
    }

    public void setSplitActionBar(boolean flag)
    {
        d = flag;
    }

    public void setSplitView(ActionBarContainer actionbarcontainer)
    {
        c = actionbarcontainer;
    }

    public void setSplitWhenNarrow(boolean flag)
    {
        e = flag;
    }

    public void setVisibility(int i)
    {
        if (i != getVisibility())
        {
            super.setVisibility(i);
        }
    }
}
