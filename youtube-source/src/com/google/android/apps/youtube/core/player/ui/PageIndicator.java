// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import com.google.android.youtube.h;
import com.google.android.youtube.r;

public class PageIndicator extends View
{

    Rect a;
    Rect b;
    private Drawable c;
    private Drawable d;
    private int e;
    private int f;
    private int g;

    public PageIndicator(Context context)
    {
        this(context, null);
    }

    public PageIndicator(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Rect();
        b = new Rect();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, r.w);
        Drawable drawable = typedarray.getDrawable(0);
        Drawable drawable1 = typedarray.getDrawable(1);
        attributeset = drawable;
        if (drawable == null)
        {
            attributeset = context.getResources().getDrawable(h.ao);
        }
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = context.getResources().getDrawable(h.ap);
        }
        attributeset.setBounds(0, 0, attributeset.getIntrinsicWidth(), attributeset.getIntrinsicHeight());
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        c = attributeset;
        d = drawable;
        e = attributeset.getIntrinsicWidth() * 2;
        f = 1;
        g = -1;
        typedarray.recycle();
    }

    protected void onDraw(Canvas canvas)
    {
        int i = 0;
        if (f <= 0)
        {
            return;
        }
        int j = c.getIntrinsicHeight();
        int l = Math.max(0, f * (c.getIntrinsicWidth() + e) - e);
        a.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        Gravity.apply(49, l, j, a, b);
        canvas.save();
        canvas.translate(b.left, b.top);
        while (i < f) 
        {
            Drawable drawable;
            int k;
            if (i == g)
            {
                drawable = d;
            } else
            {
                drawable = c;
            }
            drawable.draw(canvas);
            k = e;
            canvas.translate(drawable.getIntrinsicWidth() + k, 0.0F);
            i++;
        }
        canvas.restore();
    }

    protected void onMeasure(int i, int j)
    {
        int k = f;
        int l = c.getIntrinsicWidth();
        int i1 = f;
        int j1 = e;
        int k1 = c.getIntrinsicHeight();
        int l1 = getPaddingRight();
        int i2 = getPaddingLeft();
        int j2 = getPaddingBottom();
        int k2 = getPaddingTop();
        setMeasuredDimension(resolveSize(k * l + (i1 - 1) * j1 + (l1 + i2), i), resolveSize(k1 + (j2 + k2), j));
    }

    public void setCurrentPage(int i)
    {
        if (g != i)
        {
            g = i;
            invalidate();
        }
    }

    public void setPageCount(int i)
    {
        if (f != i)
        {
            f = i;
            requestLayout();
            invalidate();
        }
    }
}
