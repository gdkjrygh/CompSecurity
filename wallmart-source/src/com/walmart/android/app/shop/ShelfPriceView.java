// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.walmart.android.util.WalmartPrice;
import com.walmart.android.wmui.VariablePriceViewBase;
import com.walmartlabs.ui.PriceView;

public class ShelfPriceView extends VariablePriceViewBase
{

    private static boolean sDrawBounds = false;

    public ShelfPriceView(Context context)
    {
        super(context, false);
    }

    public ShelfPriceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, false);
    }

    public ShelfPriceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, false);
    }

    protected void onDraw(Canvas canvas)
    {
        if (sDrawBounds)
        {
            canvas.drawRect(1.0F, 1.0F, mWidth, mHeight, mRectPaint);
        }
        canvas.save();
        canvas.translate(mWidth, 0.0F);
        if (shouldDrawPrefix())
        {
            canvas.drawText(mPrice.getPrefix(), -mPrefixBounds.width() - mPrefixBounds.left, mPrefixBounds.height() - mPrefixBounds.bottom, mTextPaint);
            canvas.translate(0.0F, mLeading + mPrefixBounds.height());
        }
        Rect rect = getWidestOf(mPriceRangeDelimiterBounds, mUnitBounds);
        canvas.translate(-rect.width() - rect.left, 0.0F);
        canvas.save();
        canvas.translate(-mPrice1.getMeasuredWidth(), 0.0F);
        mPrice1.draw(canvas);
        canvas.restore();
        if (!isPriceRange()) goto _L2; else goto _L1
_L1:
        canvas.drawText(mPriceRangeDelimiter, 0.0F, mTextPaint.getTextSize() - (float)mFontMetrics.bottom, mTextPaint);
        canvas.translate(-mPrice2.getMeasuredWidth(), mLeading + mPrice1.getMeasuredHeight());
        mPrice2.draw(canvas);
        if (mUnit != null)
        {
            canvas.translate(mPrice2.getMeasuredWidth(), 0.0F);
            canvas.drawText(mUnit, 0.0F, mPrice2.getDecimalsBaseline(), mUnitPaint);
        }
_L4:
        canvas.restore();
        return;
_L2:
        if (mUnit != null)
        {
            canvas.drawText(mUnit, 0.0F, mPrice1.getDecimalsBaseline(), mUnitPaint);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        i = android.view.View.MeasureSpec.getMode(i);
        int i1 = android.view.View.MeasureSpec.getMode(j);
        initBounds();
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(k - mPriceRangeDelimiterBounds.width() - mPriceRangeDelimiterBounds.left, 0x80000000);
        mPrice1.measure(j1, j);
        mPrice2.measure(j1, j);
        mWidth = Math.max(mPriceRangeDelimiterBounds.width() + mPriceRangeDelimiterBounds.left, mUnitBounds.width() + mUnitBounds.left);
        mWidth = mWidth + Math.max(mPrice1.getMeasuredWidth(), mPrice2.getMeasuredWidth());
        mWidth = Math.max(mPrefixBounds.width(), mWidth);
        mHeight = mPrefixBounds.height();
        if (mPrice1.getMeasuredHeight() > 0)
        {
            if (mHeight > 0)
            {
                mHeight = mHeight + mLeading;
            }
            mHeight = mHeight + mPrice1.getMeasuredHeight();
        }
        if (mPrice2.getMeasuredHeight() > 0)
        {
            if (mHeight > 0)
            {
                mHeight = mHeight + mLeading;
            }
            mHeight = mHeight + mPrice2.getMeasuredHeight();
        }
        if (i == 0x40000000)
        {
            mWidth = k;
        } else
        if (i == 0x80000000)
        {
            mWidth = Math.min(mWidth, k);
        }
        if (i1 == 0x40000000)
        {
            mHeight = l;
        } else
        if (i1 == 0x80000000)
        {
            mHeight = Math.min(mHeight, l);
        }
        setMeasuredDimension(mWidth, mHeight);
    }

}
