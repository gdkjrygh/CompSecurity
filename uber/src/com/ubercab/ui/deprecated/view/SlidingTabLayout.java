// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.deprecated.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import hqy;
import hqz;
import hra;
import hrj;
import hrk;
import hrm;

public abstract class SlidingTabLayout extends FrameLayout
{

    private static final int b;
    private static final int c;
    public final hrm a;
    private final int d;
    private final int e;
    private ViewPager f;
    private android.support.v4.view.ViewPager.OnPageChangeListener g;
    private View h;

    public SlidingTabLayout(Context context)
    {
        this(context, null);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new hrm(context);
        a.setPadding(b(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        context = context.obtainStyledAttributes(attributeset, hra.SlidingTabLayout);
        d = context.getResourceId(hra.SlidingTabLayout_tabBackground, b);
        e = context.getResourceId(hra.SlidingTabLayout_textAppearance, c);
        context.recycle();
    }

    public static android.support.v4.view.ViewPager.OnPageChangeListener a(SlidingTabLayout slidingtablayout)
    {
        return slidingtablayout.g;
    }

    private TextView a(Context context)
    {
        TextView textview = new TextView(context);
        textview.setGravity(17);
        textview.setTextAppearance(context, e);
        context = new TypedValue();
        getContext().getTheme().resolveAttribute(0x101030e, context, true);
        textview.setBackgroundResource(d);
        int i = (int)(16F * getResources().getDisplayMetrics().density);
        textview.setPadding(i, i, i, i);
        a(textview);
        return textview;
    }

    private void a(int i, int j)
    {
        int k = a.getChildCount();
        View view;
        if (k != 0 && i >= 0 && i < k)
        {
            if ((view = a.getChildAt(i)) != null)
            {
                if (h != null)
                {
                    h.setSelected(false);
                }
                h = view;
                h.setSelected(true);
                a(view, i, j);
                return;
            }
        }
    }

    public static void a(SlidingTabLayout slidingtablayout, int i, int j)
    {
        slidingtablayout.a(i, j);
    }

    public static ViewPager b(SlidingTabLayout slidingtablayout)
    {
        return slidingtablayout.f;
    }

    private void b(ViewPager viewpager)
    {
        int i = 0;
        viewpager = viewpager.getAdapter();
        hrk hrk1 = new hrk(this, (byte)0);
        for (; i < viewpager.getCount(); i++)
        {
            TextView textview = a(getContext());
            textview.setText(viewpager.getPageTitle(i));
            textview.setOnClickListener(hrk1);
            a.addView(textview);
        }

    }

    protected ViewGroup a()
    {
        return this;
    }

    public final void a(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        g = onpagechangelistener;
    }

    public final void a(ViewPager viewpager)
    {
        a.removeAllViews();
        a().removeAllViews();
        a().addView(a, -1, -2);
        f = viewpager;
        if (viewpager != null)
        {
            viewpager.setOnPageChangeListener(new hrj(this, (byte)0));
            b(viewpager);
        }
    }

    protected void a(View view, int i, int j)
    {
    }

    protected void a(TextView textview)
    {
    }

    protected int b()
    {
        return 0;
    }

    protected final int c()
    {
        return (int)(24F * getResources().getDisplayMetrics().density);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (f != null)
        {
            a(f.getCurrentItem(), 0);
        }
    }

    static 
    {
        b = hqy.ub__tab_background_grey;
        c = hqz.Uber_TextAppearance_H3_Tab;
    }
}
