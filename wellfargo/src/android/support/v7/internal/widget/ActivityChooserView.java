// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ActionProvider;
import android.support.v7.a.j;
import android.support.v7.widget.ab;
import android.support.v7.widget.z;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.widget:
//            u, n, v

public class ActivityChooserView extends ViewGroup
{

    ActionProvider a;
    private final u b;
    private final v c;
    private final z d;
    private final FrameLayout e;
    private final ImageView f;
    private final FrameLayout g;
    private final int h;
    private final DataSetObserver i;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener j;
    private ab k;
    private android.widget.PopupWindow.OnDismissListener l;
    private boolean m;
    private int n;
    private boolean o;
    private int p;

    static u a(ActivityChooserView activitychooserview)
    {
        return activitychooserview.b;
    }

    private void a(int i1)
    {
        if (b.d() == null)
        {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(j);
        ab ab1;
        int j1;
        int k1;
        boolean flag;
        if (g.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = b.c();
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 != 0x7fffffff && k1 > j1 + i1)
        {
            b.a(true);
            b.a(i1 - 1);
        } else
        {
            b.a(false);
            b.a(i1);
        }
        ab1 = getListPopupWindow();
        if (!ab1.b())
        {
            if (m || !flag)
            {
                b.a(true, flag);
            } else
            {
                b.a(false, false);
            }
            ab1.d(Math.min(b.a(), h));
            ab1.c();
            if (a != null)
            {
                a.subUiVisibilityChanged(true);
            }
            ab1.g().setContentDescription(getContext().getString(j.abc_activitychooserview_choose_application));
        }
    }

    static void a(ActivityChooserView activitychooserview, int i1)
    {
        activitychooserview.a(i1);
    }

    static boolean a(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.m = flag;
        return flag;
    }

    static boolean b(ActivityChooserView activitychooserview)
    {
        return activitychooserview.m;
    }

    static FrameLayout c(ActivityChooserView activitychooserview)
    {
        return activitychooserview.g;
    }

    static FrameLayout d(ActivityChooserView activitychooserview)
    {
        return activitychooserview.e;
    }

    static int e(ActivityChooserView activitychooserview)
    {
        return activitychooserview.n;
    }

    static android.widget.PopupWindow.OnDismissListener f(ActivityChooserView activitychooserview)
    {
        return activitychooserview.l;
    }

    static DataSetObserver g(ActivityChooserView activitychooserview)
    {
        return activitychooserview.i;
    }

    private ab getListPopupWindow()
    {
        if (k == null)
        {
            k = new ab(getContext());
            k.a(b);
            k.a(this);
            k.a(true);
            k.a(c);
            k.a(c);
        }
        return k;
    }

    public boolean a()
    {
        if (c() || !o)
        {
            return false;
        } else
        {
            m = false;
            a(n);
            return true;
        }
    }

    public boolean b()
    {
        if (c())
        {
            getListPopupWindow().a();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(j);
            }
        }
        return true;
    }

    public boolean c()
    {
        return getListPopupWindow().b();
    }

    public n getDataModel()
    {
        return b.d();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        n n1 = b.d();
        if (n1 != null)
        {
            n1.registerObserver(i);
        }
        o = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = b.d();
        if (obj != null)
        {
            ((n) (obj)).unregisterObserver(i);
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(j);
        }
        if (c())
        {
            b();
        }
        o = false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        d.layout(0, 0, k1 - i1, l1 - j1);
        if (!c())
        {
            b();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        z z1 = d;
        int k1 = j1;
        if (g.getVisibility() != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
        }
        measureChild(z1, i1, k1);
        setMeasuredDimension(z1.getMeasuredWidth(), z1.getMeasuredHeight());
    }

    public void setActivityChooserModel(n n1)
    {
        b.a(n1);
        if (c())
        {
            b();
            a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i1)
    {
        p = i1;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i1)
    {
        String s = getContext().getString(i1);
        f.setContentDescription(s);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
    {
        f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i1)
    {
        n = i1;
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        l = ondismisslistener;
    }

    public void setProvider(ActionProvider actionprovider)
    {
        a = actionprovider;
    }
}
