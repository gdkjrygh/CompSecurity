// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.youtube.d;
import com.google.android.youtube.r;

public class SelectorOnTopImageView extends ImageView
{

    private Drawable a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;

    public SelectorOnTopImageView(Context context)
    {
        super(context);
    }

    public SelectorOnTopImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = context.obtainStyledAttributes(attributeset, r.B);
        b = attributeset.getBoolean(1, false);
        d = (int)attributeset.getDimension(2, 0.0F);
        e = (int)attributeset.getDimension(3, 0.0F);
        f = (int)attributeset.getDimension(4, 0.0F);
        g = (int)attributeset.getDimension(5, 0.0F);
        Drawable drawable = attributeset.getDrawable(0);
        if (drawable != null)
        {
            setSelectorDrawable(drawable);
        } else
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(d.a, typedvalue, true);
            setSelectorDrawable(context.getResources().getDrawable(typedvalue.resourceId));
        }
        attributeset.recycle();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (a != null && a.isStateful())
        {
            a.setState(getDrawableState());
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null)
        {
            if (c)
            {
                int i;
                int j;
                int k;
                int l;
                int i1;
                int j1;
                int k1;
                int l1;
                int i2;
                int j2;
                if (b)
                {
                    i = 0;
                } else
                {
                    i = getPaddingLeft();
                }
                if (b)
                {
                    j = 0;
                } else
                {
                    j = getPaddingTop();
                }
                i1 = getWidth();
                if (b)
                {
                    k = 0;
                } else
                {
                    k = getPaddingRight();
                }
                j1 = getHeight();
                if (b)
                {
                    l = 0;
                } else
                {
                    l = getPaddingBottom();
                }
                k1 = d;
                l1 = e;
                i2 = f;
                j2 = g;
                a.setBounds(i + k1, j + l1, i1 - k - i2, j1 - l - j2);
                c = false;
            }
            a.draw(canvas);
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        c = true;
        invalidate();
    }

    public void setSelector(int i)
    {
        Drawable drawable;
        if (i != 0)
        {
            drawable = getResources().getDrawable(i);
        } else
        {
            drawable = null;
        }
        setSelectorDrawable(drawable);
    }

    public void setSelectorDrawable(Drawable drawable)
    {
        if (a == drawable)
        {
            return;
        }
        if (a != null)
        {
            a.setCallback(null);
            unscheduleDrawable(a);
        }
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (drawable.isStateful())
            {
                drawable.setState(getDrawableState());
            }
        }
        a = drawable;
        c = true;
        invalidate();
    }

    public void setSelectorMargins(int i, int j, int k, int l)
    {
        d = i;
        e = j;
        f = k;
        g = l;
        if (a != null)
        {
            c = true;
            invalidate();
        }
    }
}
