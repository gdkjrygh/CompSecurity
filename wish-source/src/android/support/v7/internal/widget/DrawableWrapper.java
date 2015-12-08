// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;

class DrawableWrapper extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{

    private final Drawable mDrawable;

    public DrawableWrapper(Drawable drawable)
    {
        mDrawable = drawable;
        mDrawable.setCallback(this);
    }

    public void draw(Canvas canvas)
    {
        mDrawable.draw(canvas);
    }

    public int getChangingConfigurations()
    {
        return mDrawable.getChangingConfigurations();
    }

    public Drawable getCurrent()
    {
        return mDrawable.getCurrent();
    }

    public int getIntrinsicHeight()
    {
        return mDrawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth()
    {
        return mDrawable.getIntrinsicWidth();
    }

    public int getMinimumHeight()
    {
        return mDrawable.getMinimumHeight();
    }

    public int getMinimumWidth()
    {
        return mDrawable.getMinimumWidth();
    }

    public int getOpacity()
    {
        return mDrawable.getOpacity();
    }

    public boolean getPadding(Rect rect)
    {
        return mDrawable.getPadding(rect);
    }

    public int[] getState()
    {
        return mDrawable.getState();
    }

    public Region getTransparentRegion()
    {
        return mDrawable.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable)
    {
        invalidateSelf();
    }

    public boolean isAutoMirrored()
    {
        return DrawableCompat.isAutoMirrored(mDrawable);
    }

    public boolean isStateful()
    {
        return mDrawable.isStateful();
    }

    public void jumpToCurrentState()
    {
        DrawableCompat.jumpToCurrentState(mDrawable);
    }

    protected boolean onLevelChange(int i)
    {
        return mDrawable.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        scheduleSelf(runnable, l);
    }

    public void setAlpha(int i)
    {
        mDrawable.setAlpha(i);
    }

    public void setAutoMirrored(boolean flag)
    {
        DrawableCompat.setAutoMirrored(mDrawable, flag);
    }

    public void setBounds(int i, int j, int k, int l)
    {
        super.setBounds(i, j, k, l);
        mDrawable.setBounds(i, j, k, l);
    }

    public void setChangingConfigurations(int i)
    {
        mDrawable.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mDrawable.setColorFilter(colorfilter);
    }

    public void setDither(boolean flag)
    {
        mDrawable.setDither(flag);
    }

    public void setFilterBitmap(boolean flag)
    {
        mDrawable.setFilterBitmap(flag);
    }

    public void setHotspot(float f, float f1)
    {
        DrawableCompat.setHotspot(mDrawable, f, f1);
    }

    public void setHotspotBounds(int i, int j, int k, int l)
    {
        DrawableCompat.setHotspotBounds(mDrawable, i, j, k, l);
    }

    public boolean setState(int ai[])
    {
        return mDrawable.setState(ai);
    }

    public void setTint(int i)
    {
        DrawableCompat.setTint(mDrawable, i);
    }

    public void setTintList(ColorStateList colorstatelist)
    {
        DrawableCompat.setTintList(mDrawable, colorstatelist);
    }

    public void setTintMode(android.graphics.PorterDuff.Mode mode)
    {
        DrawableCompat.setTintMode(mDrawable, mode);
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        return super.setVisible(flag, flag1) || mDrawable.setVisible(flag, flag1);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        unscheduleSelf(runnable);
    }
}
