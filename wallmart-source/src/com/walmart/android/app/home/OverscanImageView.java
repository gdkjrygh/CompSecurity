// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class OverscanImageView extends ImageView
{

    private static final int DEFAULT_OVERSCAN_PIXELS = 1;
    private Paint mIndicatorPaint;
    private Rect mOverscanBounds;
    private int mOverscanPixels;

    public OverscanImageView(Context context)
    {
        super(context);
        mOverscanBounds = new Rect();
        mOverscanPixels = 1;
        mIndicatorPaint = null;
    }

    public OverscanImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mOverscanBounds = new Rect();
        mOverscanPixels = 1;
        mIndicatorPaint = null;
    }

    public OverscanImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mOverscanBounds = new Rect();
        mOverscanPixels = 1;
        mIndicatorPaint = null;
    }

    private boolean bitmapRecycled(Drawable drawable)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (drawable instanceof BitmapDrawable)
        {
            drawable = ((BitmapDrawable)drawable).getBitmap();
            flag = flag1;
            if (drawable != null)
            {
                flag = flag1;
                if (drawable.isRecycled())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private void renderSourceIndicator(Canvas canvas)
    {
        if (mIndicatorPaint != null)
        {
            canvas.drawRect(0.0F, 0.0F, 20F, 20F, mIndicatorPaint);
        }
    }

    public void onDraw(Canvas canvas)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            Rect rect = drawable.copyBounds();
            mOverscanBounds.set(rect.left - mOverscanPixels, rect.top - mOverscanPixels, rect.right + mOverscanPixels, rect.bottom + mOverscanPixels);
            drawable.setBounds(mOverscanBounds);
            if (!bitmapRecycled(drawable))
            {
                super.onDraw(canvas);
            }
            drawable.setBounds(rect);
            return;
        } else
        {
            super.onDraw(canvas);
            return;
        }
    }

    public void setOverscanPixels(int i)
    {
        mOverscanPixels = i;
        invalidate();
    }

    public void setSourceIndicatorColor(int i)
    {
        mIndicatorPaint = new Paint();
        mIndicatorPaint.setColor(i);
        mIndicatorPaint.setStyle(android.graphics.Paint.Style.FILL);
    }
}
