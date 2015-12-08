// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;

public class StarsView extends View
{

    private static final int DEFAULT_ICON_COUNT = 5;
    private static final int DEFAULT_SPACING_DP = 3;
    private static SparseArray sIconBitmaps = new SparseArray();
    private int mEmptyIconId;
    private int mFullIconId;
    private int mFullIconsCount;
    private int mIconCount;
    private int mIconHeight;
    private int mIconSpacing;
    private int mIconWidth;
    private boolean mInternallyMeasured;
    private int mPartialIconClipWidth;
    private double mValue;

    public StarsView(Context context)
    {
        this(context, null);
    }

    public StarsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StarsView(Context context, AttributeSet attributeset, int i)
    {
        int j;
        int k;
        int l;
        super(context, attributeset, i);
        l = Math.round(3F * getResources().getDisplayMetrics().density);
        k = 5;
        j = l;
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        context = context.obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.StarsView, i, 0);
        mEmptyIconId = context.getResourceId(com.walmart.lib.R.styleable.StarsView_starsEmptyIcon, 0);
        mFullIconId = context.getResourceId(com.walmart.lib.R.styleable.StarsView_starsFullIcon, 0);
        j = context.getDimensionPixelSize(com.walmart.lib.R.styleable.StarsView_starsSpacing, l);
        k = context.getInteger(com.walmart.lib.R.styleable.StarsView_starsCount, 5);
        setValue(context.getFloat(com.walmart.lib.R.styleable.StarsView_starsFilled, 0.0F));
        context.recycle();
        setIconSpacing(j);
        setIconCount(k);
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void internalMeasureAndOptimize()
    {
        if (mEmptyIconId == 0 || mFullIconId == 0)
        {
            throw new NullPointerException("No icon drawables set, must both be set using app:starsEmptyIcon/app:starsFullIcon in XML or using corresponding methods in code.");
        }
        Bitmap bitmap1 = (Bitmap)sIconBitmaps.get(mEmptyIconId);
        Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            bitmap = BitmapFactory.decodeResource(getResources(), mEmptyIconId);
            if (bitmap == null)
            {
                throw new NullPointerException("Empty icon bitmap could not be decoded, has one been set?");
            }
            sIconBitmaps.put(mEmptyIconId, bitmap);
        }
        Bitmap bitmap2 = (Bitmap)sIconBitmaps.get(mFullIconId);
        bitmap1 = bitmap2;
        if (bitmap2 == null)
        {
            bitmap1 = BitmapFactory.decodeResource(getResources(), mFullIconId);
            if (bitmap1 == null)
            {
                throw new NullPointerException("Full icon bitmap could not be decoded, has one been set?");
            }
            sIconBitmaps.put(mFullIconId, bitmap1);
        }
        if (bitmap1.getWidth() >= bitmap.getWidth())
        {
            mIconWidth = bitmap1.getWidth();
            mIconHeight = bitmap1.getHeight();
        } else
        {
            mIconWidth = bitmap.getWidth();
            mIconHeight = bitmap.getHeight();
        }
        optimizeDrawing();
        mInternallyMeasured = true;
    }

    private void optimizeDrawing()
    {
        mFullIconsCount = (int)mValue;
        mPartialIconClipWidth = (int)((mValue - (double)mFullIconsCount) * (double)mIconWidth);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!mInternallyMeasured)
        {
            internalMeasureAndOptimize();
        }
        Bitmap bitmap = (Bitmap)sIconBitmaps.get(mEmptyIconId);
        Bitmap bitmap1 = (Bitmap)sIconBitmaps.get(mFullIconId);
        int j = getPaddingLeft();
        int k = getPaddingTop();
        int i = 0;
        while (i < mIconCount) 
        {
            if (i < mFullIconsCount)
            {
                canvas.drawBitmap(bitmap1, j, k, null);
            } else
            if (i == mFullIconsCount && mPartialIconClipWidth > 0)
            {
                canvas.drawBitmap(bitmap, j, k, null);
                canvas.save();
                canvas.clipRect(j, k, mPartialIconClipWidth + j, mIconHeight + k);
                canvas.drawBitmap(bitmap1, j, k, null);
                canvas.restore();
            } else
            {
                canvas.drawBitmap(bitmap, j, k, null);
            }
            j += mIconWidth + mIconSpacing;
            i++;
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        if (!mInternallyMeasured)
        {
            internalMeasureAndOptimize();
        }
        i1 = getPaddingLeft();
        j1 = getPaddingRight();
        k = getPaddingTop();
        l = getPaddingBottom();
        i1 = mIconWidth * mIconCount + mIconSpacing * (mIconCount - 1) + (i1 + j1);
        k = mIconHeight + (k + l);
        j1 = android.view.View.MeasureSpec.getSize(i);
        l = android.view.View.MeasureSpec.getSize(j);
        android.view.View.MeasureSpec.getMode(i);
        JVM INSTR lookupswitch 2: default 116
    //                   -2147483648: 163
    //                   1073741824: 157;
           goto _L1 _L2 _L3
_L1:
        i = i1;
_L7:
        android.view.View.MeasureSpec.getMode(j);
        JVM INSTR lookupswitch 2: default 148
    //                   -2147483648: 180
    //                   1073741824: 174;
           goto _L4 _L5 _L6
_L4:
        j = k;
_L8:
        setMeasuredDimension(i, j);
        return;
_L3:
        i = j1;
          goto _L7
_L2:
        i = Math.min(i1, j1);
          goto _L7
_L6:
        j = l;
          goto _L8
_L5:
        j = Math.min(k, l);
          goto _L8
    }

    public void setEmptyIcon(int i)
    {
        mEmptyIconId = i;
        mInternallyMeasured = false;
        invalidate();
    }

    public void setFullIcon(int i)
    {
        mFullIconId = i;
        mInternallyMeasured = false;
        invalidate();
    }

    public void setIconCount(int i)
    {
        mIconCount = Math.max(i, 0);
        mInternallyMeasured = false;
        invalidate();
    }

    public void setIconSpacing(int i)
    {
        mIconSpacing = Math.max(i, 0);
        mInternallyMeasured = false;
        invalidate();
    }

    public void setPercentage(double d)
    {
        d = Math.min(Math.max(d, 0.0D), 100D) / 100D;
        setValue((double)mIconCount * d);
    }

    public void setValue(double d)
    {
        mValue = Math.max(d, 0.0D);
        mInternallyMeasured = false;
        invalidate();
    }

}
