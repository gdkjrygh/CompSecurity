// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

public class PercentageTextView extends TextView
{

    private static final String SUFFIX = "%";
    private int mHeight;
    private Rect mIntegerBounds;
    private Rect mSuffixBounds;
    private Paint mSuffixPaint;
    private float mSuffixRatio;
    private int mWidth;

    public PercentageTextView(Context context)
    {
        super(context);
        mSuffixBounds = new Rect();
        mIntegerBounds = new Rect();
        mSuffixRatio = 1.0F;
        init(null);
    }

    public PercentageTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSuffixBounds = new Rect();
        mIntegerBounds = new Rect();
        mSuffixRatio = 1.0F;
        init(attributeset);
    }

    public PercentageTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSuffixBounds = new Rect();
        mIntegerBounds = new Rect();
        mSuffixRatio = 1.0F;
        init(attributeset);
    }

    private int drawText(Canvas canvas, Rect rect, String s, Paint paint, int i, int j)
    {
        int k = -rect.top;
        canvas.drawText(s, i, j + k, paint);
        return i + rect.right;
    }

    private void getBounds(String s, Rect rect, Paint paint)
    {
        if (!TextUtils.isEmpty(s))
        {
            paint.getTextBounds(s, 0, s.length(), rect);
            return;
        } else
        {
            rect.bottom = 0;
            rect.right = 0;
            rect.top = 0;
            rect.left = 0;
            return;
        }
    }

    private transient int getTallest(Rect arect[])
    {
        int j = 0;
        int i1 = arect.length;
        for (int i = 0; i < i1;)
        {
            Rect rect = arect[i];
            int l = rect.bottom - rect.top;
            int k = j;
            if (l > j)
            {
                k = l;
            }
            i++;
            j = k;
        }

        return j;
    }

    private transient int getWidth(Rect arect[])
    {
        int j = 0;
        int k = arect.length;
        for (int i = 0; i < k; i++)
        {
            Rect rect = arect[i];
            j += rect.right - rect.left;
        }

        return j;
    }

    private void init(AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        attributeset = getContext().getTheme().obtainStyledAttributes(attributeset, com.walmart.android.R.styleable.PercentageTextView, 0, 0);
        mSuffixRatio = attributeset.getFloat(0, 1.0F);
        attributeset.recycle();
        initBounds();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    private void initBounds()
    {
        mSuffixPaint = new Paint(getPaint());
        mSuffixPaint.setTextSize(getTextSize() * mSuffixRatio);
        getBounds(String.valueOf(getText()), mIntegerBounds, getPaint());
        getBounds("%", mSuffixBounds, mSuffixPaint);
        mHeight = getTallest(new Rect[] {
            mSuffixBounds, mIntegerBounds
        });
        mWidth = getWidth(new Rect[] {
            mSuffixBounds, mIntegerBounds
        }) + mSuffixBounds.left + mIntegerBounds.left;
    }

    public float getSignRatio()
    {
        return mSuffixRatio;
    }

    protected void onDraw(Canvas canvas)
    {
        int i = getPaddingTop();
        int j = getPaddingLeft();
        j = drawText(canvas, mIntegerBounds, String.valueOf(getText()), getPaint(), j, i);
        drawText(canvas, mSuffixBounds, "%", mSuffixPaint, j, i);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        int k = android.view.View.MeasureSpec.getSize(i);
        int i1 = android.view.View.MeasureSpec.getSize(j);
        int k1 = android.view.View.MeasureSpec.getMode(i);
        int j1 = android.view.View.MeasureSpec.getMode(j);
        initBounds();
        if (k1 == 0x40000000)
        {
            mWidth = k;
            i = mWidth;
        } else
        {
            j = mWidth + getPaddingLeft() + getPaddingRight();
            i = j;
            if (k1 == 0x80000000)
            {
                i = Math.min(j, k);
            }
        }
        if (j1 == 0x40000000)
        {
            mHeight = i1;
            j = mHeight;
        } else
        {
            int l = mHeight + getPaddingTop() + getPaddingBottom();
            j = l;
            if (j1 == 0x80000000)
            {
                j = Math.min(l, i1);
            }
        }
        setMeasuredDimension(i, j);
    }

    public void setSignRatio(float f)
    {
        mSuffixRatio = f;
        requestLayout();
    }
}
