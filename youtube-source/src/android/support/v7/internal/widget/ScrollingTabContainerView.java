// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.a.c;
import android.support.v7.a.h;
import android.support.v7.internal.view.a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            x, ar, v, AbsSpinnerICS, 
//            ap, ao, aq

public class ScrollingTabContainerView extends HorizontalScrollView
    implements x
{

    Runnable a;
    int b;
    int c;
    private aq d;
    private LinearLayout e;
    private ar f;
    private boolean g;
    private final LayoutInflater h;
    private int i;
    private int j;

    public ScrollingTabContainerView(Context context)
    {
        super(context);
        h = LayoutInflater.from(context);
        setHorizontalScrollBarEnabled(false);
        context = android.support.v7.internal.view.a.a(context);
        setContentHeight(context.d());
        c = context.f();
        e = (LinearLayout)h.inflate(h.e, this, false);
        addView(e, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    static TabView a(ScrollingTabContainerView scrollingtabcontainerview, android.support.v7.app.c c1, boolean flag)
    {
        TabView tabview = (TabView)scrollingtabcontainerview.h.inflate(h.d, scrollingtabcontainerview.e, false);
        tabview.a(scrollingtabcontainerview, c1, true);
        tabview.setBackgroundDrawable(null);
        tabview.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, scrollingtabcontainerview.i));
        return tabview;
    }

    static LinearLayout a(ScrollingTabContainerView scrollingtabcontainerview)
    {
        return scrollingtabcontainerview.e;
    }

    private boolean a()
    {
        return f != null && f.getParent() == this;
    }

    private boolean b()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(f);
            addView(e, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(((v) (f)).v);
            return false;
        }
    }

    public final void a(View view, int k)
    {
        ((TabView)view).a();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            post(a);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        configuration = android.support.v7.internal.view.a.a(getContext());
        setContentHeight(configuration.d());
        c = configuration.f();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public void onMeasure(int k, int l)
    {
        l = 1;
        int i1 = android.view.View.MeasureSpec.getMode(k);
        int k1;
        boolean flag;
        if (i1 == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        k1 = e.getChildCount();
        if (k1 > 1 && (i1 == 0x40000000 || i1 == 0x80000000))
        {
            ar ar1;
            int j1;
            if (k1 > 2)
            {
                b = (int)((float)android.view.View.MeasureSpec.getSize(k) * 0.4F);
            } else
            {
                b = android.view.View.MeasureSpec.getSize(k) / 2;
            }
            b = Math.min(b, c);
        } else
        {
            b = -1;
        }
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        if (flag || !g)
        {
            l = 0;
        }
        if (l != 0)
        {
            e.measure(0, j1);
            if (e.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(k))
            {
                if (!a())
                {
                    if (f == null)
                    {
                        ar1 = new ar(getContext(), null, c.e);
                        ar1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
                        ar1.b(this);
                        f = ar1;
                    }
                    removeView(e);
                    addView(f, new android.view.ViewGroup.LayoutParams(-2, -1));
                    if (((AbsSpinnerICS) (f)).a == null)
                    {
                        f.a(new ap(this, (byte)0));
                    }
                    if (a != null)
                    {
                        removeCallbacks(a);
                        a = null;
                    }
                    f.a(j);
                }
            } else
            {
                b();
            }
        } else
        {
            b();
        }
        l = getMeasuredWidth();
        super.onMeasure(k, j1);
        k = getMeasuredWidth();
        if (flag && l != k)
        {
            setTabSelected(j);
        }
    }

    public void setAllowCollapse(boolean flag)
    {
        g = flag;
    }

    public void setContentHeight(int k)
    {
        i = k;
        requestLayout();
    }

    public void setTabSelected(int k)
    {
        j = k;
        int i1 = e.getChildCount();
        int l = 0;
        while (l < i1) 
        {
            View view = e.getChildAt(l);
            boolean flag;
            if (l == k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (!flag)
            {
                continue;
            }
            view = e.getChildAt(k);
            if (a != null)
            {
                removeCallbacks(a);
            }
            a = new ao(this, view);
            post(a);
            l++;
        }
        if (f != null && k >= 0)
        {
            f.a(k);
        }
    }

    private class TabView extends LinearLayout
    {

        private android.support.v7.app.c a;
        private TextView b;
        private ImageView c;
        private View d;
        private ScrollingTabContainerView e;

        private void b()
        {
            Object obj = a;
            View view = ((android.support.v7.app.c) (obj)).c();
            if (view != null)
            {
                obj = view.getParent();
                if (obj != this)
                {
                    if (obj != null)
                    {
                        ((ViewGroup)obj).removeView(view);
                    }
                    addView(view);
                }
                d = view;
                if (b != null)
                {
                    b.setVisibility(8);
                }
                if (c != null)
                {
                    c.setVisibility(8);
                    c.setImageDrawable(null);
                }
            } else
            {
                if (d != null)
                {
                    removeView(d);
                    d = null;
                }
                android.graphics.drawable.Drawable drawable = ((android.support.v7.app.c) (obj)).a();
                CharSequence charsequence = ((android.support.v7.app.c) (obj)).b();
                if (drawable != null)
                {
                    if (c == null)
                    {
                        ImageView imageview = new ImageView(getContext());
                        android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutparams1.gravity = 16;
                        imageview.setLayoutParams(layoutparams1);
                        addView(imageview, 0);
                        c = imageview;
                    }
                    c.setImageDrawable(drawable);
                    c.setVisibility(0);
                } else
                if (c != null)
                {
                    c.setVisibility(8);
                    c.setImageDrawable(null);
                }
                if (charsequence != null)
                {
                    if (b == null)
                    {
                        CompatTextView compattextview = new CompatTextView(getContext(), null, c.c);
                        compattextview.setEllipsize(android.text.TextUtils.TruncateAt.END);
                        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutparams.gravity = 16;
                        compattextview.setLayoutParams(layoutparams);
                        addView(compattextview);
                        b = compattextview;
                    }
                    b.setText(charsequence);
                    b.setVisibility(0);
                } else
                if (b != null)
                {
                    b.setVisibility(8);
                    b.setText(null);
                }
                if (c != null)
                {
                    c.setContentDescription(((android.support.v7.app.c) (obj)).d());
                    return;
                }
            }
        }

        public final android.support.v7.app.c a()
        {
            return a;
        }

        public final void a(android.support.v7.app.c c1)
        {
            a = c1;
            b();
        }

        final void a(ScrollingTabContainerView scrollingtabcontainerview, android.support.v7.app.c c1, boolean flag)
        {
            e = scrollingtabcontainerview;
            a = c1;
            if (flag)
            {
                setGravity(19);
            }
            b();
        }

        public void onMeasure(int k, int l)
        {
            super.onMeasure(k, l);
            if (e != null)
            {
                k = e.b;
            } else
            {
                k = 0;
            }
            if (k > 0 && getMeasuredWidth() > k)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), l);
            }
        }

        public TabView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }

}
