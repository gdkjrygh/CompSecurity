// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

final class h extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{

    private Drawable a;
    private float b;
    private float c;
    private final Rect d = new Rect();

    public h(Drawable drawable)
    {
        a = drawable;
    }

    public final float a()
    {
        return b;
    }

    public final void a(float f)
    {
        b = f;
        invalidateSelf();
    }

    public final void b(float f)
    {
        c = 0.3333333F;
        invalidateSelf();
    }

    public final void clearColorFilter()
    {
        a.clearColorFilter();
    }

    public final void draw(Canvas canvas)
    {
        a.copyBounds(d);
        canvas.save();
        canvas.translate(c * (float)d.width() * -b, 0.0F);
        a.draw(canvas);
        canvas.restore();
    }

    public final int getChangingConfigurations()
    {
        return a.getChangingConfigurations();
    }

    public final android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return super.getConstantState();
    }

    public final Drawable getCurrent()
    {
        return a.getCurrent();
    }

    public final int getIntrinsicHeight()
    {
        return a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth()
    {
        return a.getIntrinsicWidth();
    }

    public final int getMinimumHeight()
    {
        return a.getMinimumHeight();
    }

    public final int getMinimumWidth()
    {
        return a.getMinimumWidth();
    }

    public final int getOpacity()
    {
        return a.getOpacity();
    }

    public final boolean getPadding(Rect rect)
    {
        return a.getPadding(rect);
    }

    public final int[] getState()
    {
        return a.getState();
    }

    public final Region getTransparentRegion()
    {
        return a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable)
    {
        if (drawable == a)
        {
            invalidateSelf();
        }
    }

    public final boolean isStateful()
    {
        return a.isStateful();
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a.setBounds(rect);
    }

    protected final boolean onStateChange(int ai[])
    {
        a.setState(ai);
        return super.onStateChange(ai);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (drawable == a)
        {
            scheduleSelf(runnable, l);
        }
    }

    public final void setAlpha(int i)
    {
        a.setAlpha(i);
    }

    public final void setChangingConfigurations(int i)
    {
        a.setChangingConfigurations(i);
    }

    public final void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
    {
        a.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }

    public final void setDither(boolean flag)
    {
        a.setDither(flag);
    }

    public final void setFilterBitmap(boolean flag)
    {
        a.setFilterBitmap(flag);
    }

    public final boolean setState(int ai[])
    {
        return a.setState(ai);
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        return super.setVisible(flag, flag1);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (drawable == a)
        {
            unscheduleSelf(runnable);
        }
    }
}
