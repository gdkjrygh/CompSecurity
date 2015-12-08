// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.n;
import android.support.v7.a.e;
import android.support.v7.a.f;
import android.support.v7.a.h;
import android.support.v7.a.i;
import android.support.v7.a.k;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.widget:
//            q, r, u, t, 
//            s, ListPopupWindow, k

public class ActivityChooserView extends ViewGroup
{

    n a;
    private final t b;
    private final u c;
    private final LinearLayout d;
    private final Drawable e;
    private final FrameLayout f;
    private final ImageView g;
    private final FrameLayout h;
    private final ImageView i;
    private final int j;
    private final DataSetObserver k;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener l;
    private ListPopupWindow m;
    private android.widget.PopupWindow.OnDismissListener n;
    private boolean o;
    private int p;
    private boolean q;
    private int r;

    public ActivityChooserView(Context context)
    {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = new q(this);
        l = new r(this);
        p = 4;
        attributeset = context.obtainStyledAttributes(attributeset, k.h, i1, 0);
        p = attributeset.getInt(0, 4);
        Drawable drawable = attributeset.getDrawable(1);
        attributeset.recycle();
        LayoutInflater.from(getContext()).inflate(h.j, this, true);
        c = new u(this, (byte)0);
        d = (LinearLayout)findViewById(f.j);
        e = d.getBackground();
        h = (FrameLayout)findViewById(f.k);
        h.setOnClickListener(c);
        h.setOnLongClickListener(c);
        i = (ImageView)h.findViewById(f.p);
        f = (FrameLayout)findViewById(f.m);
        f.setOnClickListener(c);
        g = (ImageView)f.findViewById(f.p);
        g.setImageDrawable(drawable);
        b = new t(this, (byte)0);
        b.registerDataSetObserver(new s(this));
        context = context.getResources();
        j = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(e.c));
    }

    static t a(ActivityChooserView activitychooserview)
    {
        return activitychooserview.b;
    }

    private void a(int i1)
    {
        if (b.e() == null)
        {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(l);
        ListPopupWindow listpopupwindow;
        int j1;
        int k1;
        boolean flag;
        if (h.getVisibility() == 0)
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
        listpopupwindow = c();
        if (!listpopupwindow.f())
        {
            if (o || !flag)
            {
                b.a(true, flag);
            } else
            {
                b.a(false, false);
            }
            listpopupwindow.d(Math.min(b.a(), j));
            listpopupwindow.c();
            if (a != null)
            {
                a.a(true);
            }
            listpopupwindow.h().setContentDescription(getContext().getString(i.d));
        }
    }

    static void a(ActivityChooserView activitychooserview, int i1)
    {
        activitychooserview.a(i1);
    }

    static boolean a(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.o = flag;
        return flag;
    }

    static ListPopupWindow b(ActivityChooserView activitychooserview)
    {
        return activitychooserview.c();
    }

    private ListPopupWindow c()
    {
        if (m == null)
        {
            m = new ListPopupWindow(getContext());
            m.a(b);
            m.a(this);
            m.a(true);
            m.a(c);
            m.a(c);
        }
        return m;
    }

    static void c(ActivityChooserView activitychooserview)
    {
        int i1;
        int j1;
        if (activitychooserview.b.getCount() > 0)
        {
            activitychooserview.f.setEnabled(true);
        } else
        {
            activitychooserview.f.setEnabled(false);
        }
        i1 = activitychooserview.b.c();
        j1 = activitychooserview.b.d();
        if (i1 == 1 || i1 > 1 && j1 > 0)
        {
            activitychooserview.h.setVisibility(0);
            Object obj = activitychooserview.b.b();
            android.content.pm.PackageManager packagemanager = activitychooserview.getContext().getPackageManager();
            activitychooserview.i.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
            if (activitychooserview.r != 0)
            {
                obj = ((ResolveInfo) (obj)).loadLabel(packagemanager);
                obj = activitychooserview.getContext().getString(activitychooserview.r, new Object[] {
                    obj
                });
                activitychooserview.h.setContentDescription(((CharSequence) (obj)));
            }
        } else
        {
            activitychooserview.h.setVisibility(8);
        }
        if (activitychooserview.h.getVisibility() == 0)
        {
            activitychooserview.d.setBackgroundDrawable(activitychooserview.e);
            return;
        } else
        {
            activitychooserview.d.setBackgroundDrawable(null);
            return;
        }
    }

    static boolean d(ActivityChooserView activitychooserview)
    {
        return activitychooserview.o;
    }

    static FrameLayout e(ActivityChooserView activitychooserview)
    {
        return activitychooserview.h;
    }

    static FrameLayout f(ActivityChooserView activitychooserview)
    {
        return activitychooserview.f;
    }

    static int g(ActivityChooserView activitychooserview)
    {
        return activitychooserview.p;
    }

    static android.widget.PopupWindow.OnDismissListener h(ActivityChooserView activitychooserview)
    {
        return activitychooserview.n;
    }

    static DataSetObserver i(ActivityChooserView activitychooserview)
    {
        return activitychooserview.k;
    }

    public final boolean a()
    {
        if (c().f())
        {
            c().d();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(l);
            }
        }
        return true;
    }

    public final boolean b()
    {
        return c().f();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        android.support.v7.internal.widget.k k1 = b.e();
        if (k1 != null)
        {
            k1.registerObserver(k);
        }
        q = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = b.e();
        if (obj != null)
        {
            ((android.support.v7.internal.widget.k) (obj)).unregisterObserver(k);
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(l);
        }
        if (c().f())
        {
            a();
        }
        q = false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        d.layout(0, 0, k1 - i1, l1 - j1);
        if (!c().f())
        {
            a();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        LinearLayout linearlayout = d;
        int k1 = j1;
        if (h.getVisibility() != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
        }
        measureChild(linearlayout, i1, k1);
        setMeasuredDimension(linearlayout.getMeasuredWidth(), linearlayout.getMeasuredHeight());
    }

    public void setActivityChooserModel(android.support.v7.internal.widget.k k1)
    {
label0:
        {
            b.a(k1);
            if (c().f())
            {
                a();
                if (!c().f() && q)
                {
                    break label0;
                }
            }
            return;
        }
        o = false;
        a(p);
    }

    public void setDefaultActionButtonContentDescription(int i1)
    {
        r = i1;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i1)
    {
        String s1 = getContext().getString(i1);
        g.setContentDescription(s1);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
    {
        g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i1)
    {
        p = i1;
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        n = ondismisslistener;
    }

    public void setProvider(n n1)
    {
        a = n1;
    }
}
