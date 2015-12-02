// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import hot;
import hou;
import hox;

public class PagerIndicator extends View
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private final float a;
    private final float b;
    private final Paint c;
    private final Paint d;
    private android.support.v4.view.ViewPager.OnPageChangeListener e;
    private ViewPager f;
    private int g;

    public PagerIndicator(Context context)
    {
        this(context, null);
    }

    public PagerIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PagerIndicator(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new Paint(1);
        d = new Paint(1);
        g = 0;
        context = context.getTheme().obtainStyledAttributes(attributeset, hox.PagerIndicator, i, 0);
        c.setColor(context.getColor(hox.PagerIndicator_selectedIndicatorColor, getResources().getColor(hot.ub__uber_blue_100)));
        d.setColor(context.getColor(hox.PagerIndicator_unselectedIndicatorColor, getResources().getColor(hot.ub__uber_black_40)));
        a = context.getDimension(hox.PagerIndicator_indicatorWidth, getResources().getDimension(hou.ui__pager_indicator_indicator_width_default));
        b = context.getDimension(hox.PagerIndicator_indicatorPadding, getResources().getDimension(hou.ui__pager_indicator_indicator_padding_default));
        context.recycle();
        c.setStyle(android.graphics.Paint.Style.FILL);
        d.setStyle(android.graphics.Paint.Style.FILL);
    }

    private int a(int i)
    {
        int j = android.view.View.MeasureSpec.getSize(i);
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000 || f == null || f.getAdapter() == null)
        {
            return j;
        } else
        {
            i = f.getAdapter().getCount();
            float f1 = getPaddingLeft() + getPaddingRight();
            return (int)(((float)i * (a + b) + f1) - b);
        }
    }

    private void a(ViewPager viewpager, int i)
    {
        if (f != null)
        {
            f.setOnPageChangeListener(null);
        }
        if (viewpager == null || viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager doesn't have an adapter");
        }
        if (i >= viewpager.getAdapter().getCount())
        {
            throw new IndexOutOfBoundsException("initialPosition is greater than adapter count");
        } else
        {
            c(i);
            f = viewpager;
            f.setOnPageChangeListener(this);
            invalidate();
            return;
        }
    }

    private int b(int i)
    {
        int j = android.view.View.MeasureSpec.getSize(i);
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            return j;
        } else
        {
            return (int)(a + (float)getPaddingTop() + (float)getPaddingBottom());
        }
    }

    private void c(int i)
    {
        g = i;
    }

    public final void a(ViewPager viewpager)
    {
        a(viewpager, g);
    }

    protected void onDraw(Canvas canvas)
    {
        if (f != null && f.getAdapter() != null)
        {
            int j = f.getAdapter().getCount();
            float f1 = a / 2.0F;
            float f2 = a;
            float f3 = b;
            float f4 = getWidth() - getPaddingLeft() - getPaddingRight();
            float f5 = getPaddingLeft();
            float f6 = ((float)j * (a + b) - b) / 2.0F;
            float f7 = getPaddingTop();
            int i = 0;
            while (i < j) 
            {
                float f8 = i;
                Paint paint;
                if (i == g)
                {
                    paint = c;
                } else
                {
                    paint = d;
                }
                canvas.drawCircle(((f4 * 0.5F + f5) - f6) + f1 + f8 * (f2 + f3), f7 + f1, f1, paint);
                i++;
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(a(i), b(j));
    }

    public void onPageScrollStateChanged(int i)
    {
        if (e != null)
        {
            e.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f1, int j)
    {
        if (e != null)
        {
            e.onPageScrolled(i, f1, j);
        }
    }

    public void onPageSelected(int i)
    {
        if (e != null)
        {
            e.onPageSelected(i);
        }
        g = i;
        invalidate();
    }
}
