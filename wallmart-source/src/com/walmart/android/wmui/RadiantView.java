// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RadiantView extends View
{

    private int mBackgroundCenterColor;
    private int mBackgroundEdgeColor;
    private RadialGradient mBackgroundGradient;
    private float mBackgroundRadiusRatio;
    private Bitmap mBitmap;
    private final Paint mPaint;
    private float mRayAngleInterval;
    private int mRayCenterColor;
    private int mRayEdgeColor;
    private RadialGradient mRayGradient;
    private RectF mRayOvalBounds;
    private float mRayRadiusRatio;
    private float mRaySweepAngle;

    public RadiantView(Context context)
    {
        this(context, null);
    }

    public RadiantView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RadiantView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mPaint = new Paint(5);
        context = context.obtainStyledAttributes(attributeset, com.walmart.android.R.styleable.RadiantView, i, 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        mBackgroundCenterColor = context.getColor(0, 0x7f0f0011);
        mBackgroundEdgeColor = context.getColor(1, 0x7f0f0011);
        mBackgroundRadiusRatio = context.getFloat(2, 0.0F);
        mRayCenterColor = context.getColor(3, 0x7f0f012f);
        mRayEdgeColor = context.getColor(4, 0x7f0f012f);
        mRayRadiusRatio = context.getFloat(5, 0.0F);
        mRayAngleInterval = context.getFloat(6, 0.0F);
        mRaySweepAngle = context.getFloat(7, 0.0F);
        updateBackgroundGradient();
        updateRayGradient();
        updateRayOvalBounds();
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void updateBackgroundGradient()
    {
        int i = Math.max(getWidth(), getHeight());
        if (mBackgroundRadiusRatio > 0.0F && i > 0)
        {
            mBackgroundGradient = new RadialGradient(getWidth() / 2, getHeight() / 2, (float)(i / 2) * mBackgroundRadiusRatio, mBackgroundCenterColor, mBackgroundEdgeColor, android.graphics.Shader.TileMode.CLAMP);
            return;
        } else
        {
            mBackgroundGradient = null;
            return;
        }
    }

    private void updateBitmap()
    {
        if (getWidth() > 0 && getHeight() > 0)
        {
            int i = Math.max(getWidth(), getHeight());
            float f = Math.abs(i - getWidth()) / 2;
            float f2 = Math.abs(i - getHeight()) / 2;
            Bitmap bitmap = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.translate(f, f2);
            if (mBackgroundGradient != null)
            {
                mPaint.setShader(mBackgroundGradient);
                canvas.drawRect(-f, -f2, (float)i - f, (float)i - f2, mPaint);
            }
            if (mRayGradient != null && mRayOvalBounds != null && mRayAngleInterval > 0.0F)
            {
                mPaint.setShader(mRayGradient);
                for (float f1 = 0.0F; f1 < 359F; f1 += mRayAngleInterval)
                {
                    canvas.drawArc(mRayOvalBounds, f1, mRaySweepAngle, true, mPaint);
                }

            }
            mBitmap = bitmap;
        }
    }

    private void updateRayGradient()
    {
        int i = Math.max(getWidth(), getHeight());
        if (mRayRadiusRatio > 0.0F && i > 0)
        {
            mRayGradient = new RadialGradient(getWidth() / 2, getHeight() / 2, (float)(i / 2) * mRayRadiusRatio, mRayCenterColor, mRayEdgeColor, android.graphics.Shader.TileMode.CLAMP);
            return;
        } else
        {
            mRayGradient = null;
            return;
        }
    }

    private void updateRayOvalBounds()
    {
        int i = Math.max(getWidth(), getHeight());
        float f = (float)Math.sqrt(Math.pow(i / 2, 2D) + Math.pow(i / 2, 2D));
        mRayOvalBounds = new RectF((float)(getWidth() / 2) - f, (float)(getHeight() / 2) - f, (float)(getWidth() / 2) + f, (float)(getHeight() / 2) + f);
    }

    public int getBackgroundCenterColor()
    {
        return mBackgroundCenterColor;
    }

    public int getBackgroundEdgeColor()
    {
        return mBackgroundEdgeColor;
    }

    public float getBackgroundRadiusRatio()
    {
        return mBackgroundRadiusRatio;
    }

    public float getRayAngleInterval()
    {
        return mRayAngleInterval;
    }

    public int getRayCenterColor()
    {
        return mRayCenterColor;
    }

    public int getRayEdgeColor()
    {
        return mRayEdgeColor;
    }

    public float getRayRadiusRatio()
    {
        return mRayRadiusRatio;
    }

    public float getRaySweepAngle()
    {
        return mRaySweepAngle;
    }

    public void invalidate()
    {
        updateBitmap();
        super.invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mBitmap == null)
        {
            updateBitmap();
        }
        int i = Math.max(getWidth(), getHeight());
        float f = Math.abs(i - getWidth()) / 2;
        float f1 = Math.abs(i - getHeight()) / 2;
        canvas.drawBitmap(mBitmap, -f, -f1, null);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        updateBackgroundGradient();
        updateRayGradient();
        updateRayOvalBounds();
        updateBitmap();
    }

    public void setBackgroundCenterColor(int i)
    {
        mBackgroundCenterColor = i;
        updateBackgroundGradient();
        invalidate();
    }

    public void setBackgroundEdgeColor(int i)
    {
        mBackgroundEdgeColor = i;
        updateBackgroundGradient();
        invalidate();
    }

    public void setBackgroundRadiusRatio(float f)
    {
        mBackgroundRadiusRatio = f;
        updateBackgroundGradient();
        invalidate();
    }

    public void setRayAngleInterval(float f)
    {
        mRayAngleInterval = f;
        invalidate();
    }

    public void setRayCenterColor(int i)
    {
        mRayCenterColor = i;
        updateRayGradient();
        invalidate();
    }

    public void setRayEdgeColor(int i)
    {
        mRayEdgeColor = i;
        updateRayGradient();
        invalidate();
    }

    public void setRayRadiusRatio(float f)
    {
        mRayRadiusRatio = f;
        updateRayGradient();
        invalidate();
    }

    public void setRaySweepAngle(float f)
    {
        mRaySweepAngle = f;
        invalidate();
    }
}
