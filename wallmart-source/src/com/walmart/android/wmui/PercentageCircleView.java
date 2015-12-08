// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class PercentageCircleView extends View
{

    private float mFraction;
    private int mMinRadius;
    private final Path mPath;
    private final RectF mPrimaryInner;
    private final RectF mPrimaryOuter;
    private final Paint mPrimaryPaint;
    private final RectF mSecondaryInner;
    private final RectF mSecondaryOuter;
    private final Paint mSecondaryPaint;
    private float mStartDegree;
    private int mThickness;

    public PercentageCircleView(Context context)
    {
        this(context, null, 0);
    }

    public PercentageCircleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PercentageCircleView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mPrimaryPaint = new Paint(1);
        mSecondaryPaint = new Paint(1);
        mPath = new Path();
        mSecondaryOuter = new RectF();
        mSecondaryInner = new RectF();
        mPrimaryOuter = new RectF();
        mPrimaryInner = new RectF();
        context = context.obtainStyledAttributes(attributeset, com.walmart.android.R.styleable.PercentageCircleView, i, 0);
        mSecondaryPaint.setColor(context.getColor(1, 0x106000b));
        mPrimaryPaint.setColor(context.getColor(0, 0x106000c));
        mThickness = context.getDimensionPixelSize(2, 0);
        mStartDegree = context.getFloat(3, 0.0F);
        mFraction = context.getFloat(4, 0.0F);
        mMinRadius = context.getDimensionPixelSize(5, 0);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public float getFraction()
    {
        return mFraction;
    }

    public int getMinRadius()
    {
        return mMinRadius;
    }

    public int getPrimaryColor()
    {
        return mPrimaryPaint.getColor();
    }

    public int getSecondaryColor()
    {
        return mSecondaryPaint.getColor();
    }

    public float getStartDegree()
    {
        return mStartDegree;
    }

    public int getThickness()
    {
        return mThickness;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f3 = mFraction * 360F;
        float f4 = 360F - f3;
        float f;
        float f1;
        float f2;
        float f5;
        boolean flag;
        if (mFraction > 0.0F && mFraction % 1.0F == 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f = (getWidth() - getPaddingLeft() - getPaddingRight()) / 2;
            f1 = (getHeight() - getPaddingTop() - getPaddingBottom()) / 2;
        } else
        {
            f = getWidth() / 2;
            f1 = getHeight() / 2;
        }
        if (f < f1)
        {
            f2 = f;
        } else
        {
            f2 = f1;
        }
        f5 = f2 - (float)mThickness;
        if (!flag)
        {
            mPath.reset();
            mSecondaryOuter.set((f - f2) + (float)getPaddingLeft(), (f1 - f2) + (float)getPaddingTop(), (f + f2) - (float)getPaddingRight(), (f1 + f2) - (float)getPaddingBottom());
            mSecondaryInner.set((f - f5) + (float)getPaddingLeft(), (f1 - f5) + (float)getPaddingTop(), (f + f5) - (float)getPaddingRight(), (f1 + f5) - (float)getPaddingBottom());
            mPath.arcTo(mSecondaryOuter, mStartDegree, -f4);
            mPath.arcTo(mSecondaryInner, mStartDegree - f4, f4);
            mPath.close();
            canvas.drawPath(mPath, mSecondaryPaint);
        }
        mPath.reset();
        if (flag)
        {
            mPath.addCircle((float)getPaddingLeft() + f, (float)getPaddingTop() + f1, f2, android.graphics.Path.Direction.CW);
            mPath.addCircle((float)getPaddingLeft() + f, (float)getPaddingTop() + f1, f5, android.graphics.Path.Direction.CCW);
        } else
        {
            mPrimaryOuter.set((f - f2) + (float)getPaddingLeft(), (f1 - f2) + (float)getPaddingTop(), (f + f2) - (float)getPaddingRight(), (f1 + f2) - (float)getPaddingBottom());
            mPrimaryInner.set((f - f5) + (float)getPaddingLeft(), (f1 - f5) + (float)getPaddingTop(), (f + f5) - (float)getPaddingRight(), (f1 + f5) - (float)getPaddingBottom());
            mPath.arcTo(mPrimaryOuter, mStartDegree, f3);
            mPath.arcTo(mPrimaryInner, mStartDegree + f3, -f3);
        }
        mPath.close();
        canvas.drawPath(mPath, mPrimaryPaint);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        int i1 = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        int k1 = android.view.View.MeasureSpec.getMode(i);
        int j1 = android.view.View.MeasureSpec.getMode(j);
        j = mThickness * 2 + mMinRadius * 2;
        int k;
        if (k1 == 0x40000000)
        {
            i = i1;
        } else
        {
            i = getPaddingLeft() + j + getPaddingRight();
        }
        if (j1 == 0x40000000)
        {
            j = l;
        } else
        {
            j = getPaddingTop() + j + getPaddingBottom();
        }
        k = Math.max(i, j);
        if (k1 != 0x40000000)
        {
            i = k;
        }
        if (j1 != 0x40000000)
        {
            j = k;
        }
        k = i;
        if (k1 == 0x80000000)
        {
            k = Math.min(i, i1);
        }
        i = j;
        if (j1 == 0x80000000)
        {
            i = Math.min(j, l);
        }
        setMeasuredDimension(k, i);
    }

    public void setFraction(float f)
    {
        if (mFraction != f)
        {
            mFraction = f;
            invalidate();
        }
    }

    public void setMinRadius(int i)
    {
        if (mMinRadius != i)
        {
            mMinRadius = i;
            requestLayout();
        }
    }

    public void setPrimaryColor(int i)
    {
        if (mPrimaryPaint.getColor() != i)
        {
            mPrimaryPaint.setColor(i);
            invalidate();
        }
    }

    public void setSecondaryColor(int i)
    {
        if (mSecondaryPaint.getColor() != i)
        {
            mSecondaryPaint.setColor(i);
            invalidate();
        }
    }

    public void setStartDegree(float f)
    {
        if (mStartDegree != f)
        {
            mStartDegree = f;
            invalidate();
        }
    }

    public void setThickness(int i)
    {
        if (mThickness != i)
        {
            mThickness = i;
            requestLayout();
        }
    }
}
