// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class CornerRadiusDrawable extends Drawable
{

    private final BitmapShader mBitmapShader;
    private final float mCornerRadius;
    private final int mMargin;
    private final Paint mPaint;
    private final RectF mRect;

    public CornerRadiusDrawable(Bitmap bitmap, float f)
    {
        this(bitmap, f, 0);
    }

    public CornerRadiusDrawable(Bitmap bitmap, float f, int i)
    {
        mRect = new RectF();
        mCornerRadius = f;
        mBitmapShader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(mBitmapShader);
        mMargin = i;
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRoundRect(mRect, mCornerRadius, mCornerRadius, mPaint);
    }

    public int getOpacity()
    {
        return -3;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        mRect.set(mMargin, mMargin, rect.width() - mMargin, rect.height() - mMargin);
    }

    public void setAlpha(int i)
    {
        mPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
    }
}
