// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

abstract class DrawerArrowDrawable extends Drawable
{

    private static final float ARROW_HEAD_ANGLE = (float)Math.toRadians(45D);
    private final float mBarGap;
    private final float mBarSize;
    private final float mBarThickness;
    private final float mMiddleArrowSize;
    private final Paint mPaint = new Paint();
    private final Path mPath = new Path();
    private float mProgress;
    private final int mSize;
    private final boolean mSpin;
    private final float mTopBottomArrowSize;
    private boolean mVerticalMirror;

    DrawerArrowDrawable(Context context)
    {
        mVerticalMirror = false;
        context = context.getTheme().obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.DrawerArrowToggle, android.support.v7.appcompat.R.attr.drawerArrowStyle, android.support.v7.appcompat.R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        mPaint.setAntiAlias(true);
        mPaint.setColor(context.getColor(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_color, 0));
        mSize = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_drawableSize, 0);
        mBarSize = context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_barSize, 0.0F);
        mTopBottomArrowSize = context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_topBottomBarArrowSize, 0.0F);
        mBarThickness = context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_thickness, 0.0F);
        mBarGap = context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0F);
        mSpin = context.getBoolean(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_spinBars, true);
        mMiddleArrowSize = context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_middleBarArrowSize, 0.0F);
        context.recycle();
        mPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        mPaint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        mPaint.setStrokeWidth(mBarThickness);
    }

    private static float lerp(float f, float f1, float f2)
    {
        return (f1 - f) * f2 + f;
    }

    public void draw(Canvas canvas)
    {
        Rect rect;
        boolean flag;
        rect = getBounds();
        flag = isLayoutRtl();
        float f2 = lerp(mBarSize, mTopBottomArrowSize, mProgress);
        float f4 = lerp(mBarSize, mMiddleArrowSize, mProgress);
        float f5 = lerp(0.0F, mBarThickness / 2.0F, mProgress);
        float f3 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
        float f;
        float f1;
        float f6;
        if (flag)
        {
            f = 0.0F;
        } else
        {
            f = -180F;
        }
        if (flag)
        {
            f1 = 180F;
        } else
        {
            f1 = 0.0F;
        }
        f = lerp(f, f1, mProgress);
        f1 = lerp(mBarGap + mBarThickness, 0.0F, mProgress);
        mPath.rewind();
        f6 = -f4 / 2.0F;
        mPath.moveTo(f6 + f5, 0.0F);
        mPath.rLineTo(f4 - f5, 0.0F);
        f4 = Math.round((double)f2 * Math.cos(f3));
        f2 = Math.round((double)f2 * Math.sin(f3));
        mPath.moveTo(f6, f1);
        mPath.rLineTo(f4, f2);
        mPath.moveTo(f6, -f1);
        mPath.rLineTo(f4, -f2);
        mPath.moveTo(0.0F, 0.0F);
        mPath.close();
        canvas.save();
        if (!mSpin) goto _L2; else goto _L1
_L1:
        int i;
        if (mVerticalMirror ^ flag)
        {
            i = -1;
        } else
        {
            i = 1;
        }
        canvas.rotate((float)i * f, rect.centerX(), rect.centerY());
_L4:
        canvas.translate(rect.centerX(), rect.centerY());
        canvas.drawPath(mPath, mPaint);
        canvas.restore();
        return;
_L2:
        if (flag)
        {
            canvas.rotate(180F, rect.centerX(), rect.centerY());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getIntrinsicHeight()
    {
        return mSize;
    }

    public int getIntrinsicWidth()
    {
        return mSize;
    }

    public int getOpacity()
    {
        return -3;
    }

    public float getProgress()
    {
        return mProgress;
    }

    public boolean isAutoMirrored()
    {
        return true;
    }

    abstract boolean isLayoutRtl();

    public void setAlpha(int i)
    {
        mPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
    }

    public void setProgress(float f)
    {
        mProgress = f;
        invalidateSelf();
    }

    protected void setVerticalMirror(boolean flag)
    {
        mVerticalMirror = flag;
    }

}
