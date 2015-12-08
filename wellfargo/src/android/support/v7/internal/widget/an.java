// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.Configuration;
import android.support.v7.a.b;
import android.support.v7.app.d;
import android.support.v7.internal.view.a;
import android.support.v7.widget.aa;
import android.support.v7.widget.z;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.HorizontalScrollView;

// Referenced classes of package android.support.v7.internal.widget:
//            z, ar, aq, SpinnerCompat, 
//            ap, ao, w

public class an extends HorizontalScrollView
    implements android.support.v7.internal.widget.z
{

    private static final Interpolator j = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    private aq d;
    private z e;
    private SpinnerCompat f;
    private boolean g;
    private int h;
    private int i;

    private ar a(d d1, boolean flag)
    {
        d1 = new ar(this, getContext(), d1, flag);
        if (flag)
        {
            d1.setBackgroundDrawable(null);
            d1.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, h));
            return d1;
        }
        d1.setFocusable(true);
        if (d == null)
        {
            d = new aq(this, null);
        }
        d1.setOnClickListener(d);
        return d1;
    }

    static ar a(an an1, d d1, boolean flag)
    {
        return an1.a(d1, flag);
    }

    static z a(an an1)
    {
        return an1.e;
    }

    private boolean a()
    {
        return f != null && f.getParent() == this;
    }

    private void b()
    {
        if (a())
        {
            return;
        }
        if (f == null)
        {
            f = d();
        }
        removeView(e);
        addView(f, new android.view.ViewGroup.LayoutParams(-2, -1));
        if (f.c() == null)
        {
            f.a(new ap(this, null));
        }
        if (a != null)
        {
            removeCallbacks(a);
            a = null;
        }
        f.setSelection(i);
    }

    private boolean c()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(f);
            addView(e, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(f.getSelectedItemPosition());
            return false;
        }
    }

    private SpinnerCompat d()
    {
        SpinnerCompat spinnercompat = new SpinnerCompat(getContext(), null, b.actionDropDownStyle);
        spinnercompat.setLayoutParams(new aa(-2, -1));
        spinnercompat.a(this);
        return spinnercompat;
    }

    public void a(int k)
    {
        View view = e.getChildAt(k);
        if (a != null)
        {
            removeCallbacks(a);
        }
        a = new ao(this, view);
        post(a);
    }

    public void a(w w, View view, int k, long l)
    {
        ((ar)view).b().d();
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
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = android.support.v7.internal.view.a.a(getContext());
        setContentHeight(configuration.e());
        c = configuration.g();
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
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(h, 0x40000000);
        if (flag || !g)
        {
            l = 0;
        }
        if (l != 0)
        {
            e.measure(0, j1);
            if (e.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(k))
            {
                b();
            } else
            {
                c();
            }
        } else
        {
            c();
        }
        l = getMeasuredWidth();
        super.onMeasure(k, j1);
        k = getMeasuredWidth();
        if (flag && l != k)
        {
            setTabSelected(i);
        }
    }

    public void setAllowCollapse(boolean flag)
    {
        g = flag;
    }

    public void setContentHeight(int k)
    {
        h = k;
        requestLayout();
    }

    public void setTabSelected(int k)
    {
        i = k;
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
            if (flag)
            {
                a(k);
            }
            l++;
        }
        if (f != null && k >= 0)
        {
            f.setSelection(k);
        }
    }

}
