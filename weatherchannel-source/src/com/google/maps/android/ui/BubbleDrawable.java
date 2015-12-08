// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.ui;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

class BubbleDrawable extends Drawable
{

    private int mColor;
    private final Drawable mMask;
    private final Drawable mShadow;

    public BubbleDrawable(Resources resources)
    {
        mColor = -1;
        mMask = resources.getDrawable(com.google.maps.android.R.drawable.bubble_mask);
        mShadow = resources.getDrawable(com.google.maps.android.R.drawable.bubble_shadow);
    }

    public void draw(Canvas canvas)
    {
        mMask.draw(canvas);
        canvas.drawColor(mColor, android.graphics.PorterDuff.Mode.SRC_IN);
        mShadow.draw(canvas);
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean getPadding(Rect rect)
    {
        return mMask.getPadding(rect);
    }

    public void setAlpha(int i)
    {
        throw new UnsupportedOperationException();
    }

    public void setBounds(int i, int j, int k, int l)
    {
        mMask.setBounds(i, j, k, l);
        mShadow.setBounds(i, j, k, l);
    }

    public void setBounds(Rect rect)
    {
        mMask.setBounds(rect);
        mShadow.setBounds(rect);
    }

    public void setColor(int i)
    {
        mColor = i;
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        throw new UnsupportedOperationException();
    }
}
