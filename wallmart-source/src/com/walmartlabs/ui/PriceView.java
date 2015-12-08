// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.walmart.android.utils.ViewUtil;

public class PriceView extends View
{

    private static final boolean Debug = false;
    private static final String TAG = com/walmartlabs/ui/PriceView.getSimpleName();
    private boolean mAlignBaselineMode;
    private String mCurrency;
    private Rect mDecimalBounds;
    private int mDecimalLeftMargin;
    private String mDecimals;
    private Paint mDecimalsPaint;
    private boolean mDrawBoundingBoxes;
    private boolean mDrawStrikethrough;
    private int mHeight;
    private Rect mIntegerBounds;
    private int mIntegerLeftMargin;
    private Paint mIntegerPaint;
    private String mIntegers;
    private String mPrefix;
    private Rect mPrefixBounds;
    private Paint mPrefixPaint;
    private Paint mRectPaint;
    private Paint mSmallPaint;
    private Paint mStrikethroughPaint;
    private int mWidth;

    public PriceView(Context context)
    {
        super(context);
        mCurrency = "$";
        mPrefixBounds = new Rect();
        mIntegerBounds = new Rect();
        mDecimalBounds = new Rect();
        mDrawBoundingBoxes = false;
        mDrawStrikethrough = false;
        mAlignBaselineMode = false;
        init(null);
    }

    public PriceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mCurrency = "$";
        mPrefixBounds = new Rect();
        mIntegerBounds = new Rect();
        mDecimalBounds = new Rect();
        mDrawBoundingBoxes = false;
        mDrawStrikethrough = false;
        mAlignBaselineMode = false;
        init(attributeset);
    }

    public PriceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mCurrency = "$";
        mPrefixBounds = new Rect();
        mIntegerBounds = new Rect();
        mDecimalBounds = new Rect();
        mDrawBoundingBoxes = false;
        mDrawStrikethrough = false;
        mAlignBaselineMode = false;
        init(attributeset);
    }

    private int drawText(Canvas canvas, Rect rect, String s, Paint paint, int i, int j)
    {
        j += -rect.top;
        canvas.drawText(s, i, j, paint);
        int k = i + rect.right;
        if (mDrawBoundingBoxes)
        {
            int l = rect.left;
            int i1 = rect.top;
            int j1 = rect.bottom;
            canvas.drawRect(i + l, j + i1, k, j + j1, mRectPaint);
        }
        return k;
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
        Typeface typeface;
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        mRectPaint = new Paint();
        mRectPaint.setColor(getContext().getResources().getColor(com.walmart.lib.R.color.black));
        mRectPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mRectPaint.setStrokeWidth(1.0F);
        mSmallPaint = new Paint();
        mSmallPaint.setTextSize(ViewUtil.dpToPixels(10, getContext()));
        l = 20;
        k = 40;
        j = 20;
        i1 = getContext().getResources().getColor(com.walmart.lib.R.color.black);
        typeface = Typeface.DEFAULT;
        i = i1;
        obj = typeface;
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        obj = getContext().getTheme().obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.PriceView, 0, 0);
        String s;
        mCurrency = ((TypedArray) (obj)).getString(com.walmart.lib.R.styleable.PriceView_currency);
        if (mCurrency == null)
        {
            mCurrency = "$";
        }
        s = ((TypedArray) (obj)).getString(com.walmart.lib.R.styleable.PriceView_price);
        l = ((TypedArray) (obj)).getDimensionPixelSize(com.walmart.lib.R.styleable.PriceView_prefixSize, 20);
        k = ((TypedArray) (obj)).getDimensionPixelSize(com.walmart.lib.R.styleable.PriceView_integerSize, 40);
        j = ((TypedArray) (obj)).getDimensionPixelSize(com.walmart.lib.R.styleable.PriceView_decimalSize, 20);
        mIntegerLeftMargin = ((TypedArray) (obj)).getDimensionPixelSize(com.walmart.lib.R.styleable.PriceView_integerLeftMargin, 0);
        mDecimalLeftMargin = ((TypedArray) (obj)).getDimensionPixelSize(com.walmart.lib.R.styleable.PriceView_decimalLeftMargin, 0);
        mAlignBaselineMode = ((TypedArray) (obj)).getBoolean(com.walmart.lib.R.styleable.PriceView_alignBaseline, false);
        i = ((TypedArray) (obj)).getColor(com.walmart.lib.R.styleable.PriceView_textColor, i1);
        attributeset = typeface;
        if (((TypedArray) (obj)).getInteger(com.walmart.lib.R.styleable.PriceView_textStyle, 0) == 1)
        {
            attributeset = Typeface.DEFAULT_BOLD;
        }
        setPrice(s);
        ((TypedArray) (obj)).recycle();
        obj = attributeset;
        mPrefixPaint = new Paint();
        mPrefixPaint.setTypeface(((Typeface) (obj)));
        mPrefixPaint.setTextSize(ViewUtil.dpToPixels(20, getContext()));
        mPrefixPaint.setAntiAlias(true);
        mPrefixPaint.setColor(i);
        mIntegerPaint = new Paint(mPrefixPaint);
        mDecimalsPaint = new Paint(mPrefixPaint);
        mPrefixPaint.setTextSize(l);
        mIntegerPaint.setTextSize(k);
        mDecimalsPaint.setTextSize(j);
        mStrikethroughPaint = new Paint();
        mStrikethroughPaint.setColor(mIntegerPaint.getColor());
        mStrikethroughPaint.setStyle(android.graphics.Paint.Style.STROKE);
        setStrikethroughWidth();
        initBounds();
        return;
        attributeset;
        ((TypedArray) (obj)).recycle();
        throw attributeset;
    }

    private void initBounds()
    {
        getBounds(mPrefix, mPrefixBounds, mPrefixPaint);
        getBounds(mIntegers, mIntegerBounds, mIntegerPaint);
        getBounds(mDecimals, mDecimalBounds, mDecimalsPaint);
        mHeight = getTallest(new Rect[] {
            mPrefixBounds, mIntegerBounds, mDecimalBounds
        });
        mWidth = getWidth(new Rect[] {
            mPrefixBounds, mIntegerBounds, mDecimalBounds
        }) + mPrefixBounds.left + mIntegerBounds.left + mDecimalBounds.left;
        if (!mPrefixBounds.isEmpty() || !mIntegerBounds.isEmpty() || !mDecimalBounds.isEmpty())
        {
            mWidth = mWidth + (mIntegerLeftMargin + mDecimalLeftMargin);
        }
    }

    private void invalidateView()
    {
        requestLayout();
        invalidate();
    }

    private void setStrikethroughWidth()
    {
        mStrikethroughPaint.setStrokeWidth(mIntegerPaint.getTextSize() / 15F);
    }

    public int getBaseline()
    {
        if (mAlignBaselineMode)
        {
            return -Math.min(Math.min(mPrefixBounds.top, mIntegerBounds.top), mDecimalBounds.top);
        } else
        {
            return super.getBaseline();
        }
    }

    public float getDecimalsBaseline()
    {
        return (float)(mDecimalBounds.height() - mDecimalBounds.bottom);
    }

    public Paint getDecimalsPaint()
    {
        return new Paint(mDecimalsPaint);
    }

    public Paint getIntegerPaint()
    {
        return new Paint(mIntegerPaint);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i = getPaddingTop();
        int j = getPaddingLeft();
        if (mDrawBoundingBoxes)
        {
            canvas.drawRect(j + 1, i + 1, mWidth + j, mHeight + i, mRectPaint);
        }
        int k = drawText(canvas, mPrefixBounds, mPrefix, mPrefixPaint, j, i);
        k = drawText(canvas, mIntegerBounds, mIntegers, mIntegerPaint, k + mIntegerLeftMargin, i);
        drawText(canvas, mDecimalBounds, mDecimals, mDecimalsPaint, k + mDecimalLeftMargin, i);
        if (mDrawStrikethrough)
        {
            float f = (float)(mHeight + i) * 0.5F;
            canvas.drawLine(j, f, mWidth + j, f, mStrikethroughPaint);
        }
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

    public void setPrice(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if (s.startsWith(mCurrency))
            {
                mPrefix = mCurrency;
                s = s.substring(mPrefix.length()).split("\\.");
            } else
            {
                mPrefix = "";
                s = s.split("\\.");
            }
            if (s.length == 2)
            {
                mIntegers = s[0];
                mDecimals = s[1];
            } else
            {
                mIntegers = s[0];
                mDecimals = "";
            }
        } else
        {
            mPrefix = "";
            mIntegers = "";
            mDecimals = "";
        }
        invalidateView();
    }

    public void setStrikethough(boolean flag)
    {
        mDrawStrikethrough = flag;
    }

    public void setTextColor(int i)
    {
        mPrefixPaint.setColor(i);
        mIntegerPaint.setColor(i);
        mDecimalsPaint.setColor(i);
        mStrikethroughPaint.setColor(i);
        invalidateView();
    }

    public void setTextSize(int i, int j, int k)
    {
        mPrefixPaint.setTextSize(i);
        mIntegerPaint.setTextSize(j);
        mDecimalsPaint.setTextSize(k);
        setStrikethroughWidth();
        invalidateView();
    }

    public void setTypeface(Typeface typeface)
    {
        mPrefixPaint.setTypeface(typeface);
        mIntegerPaint.setTypeface(typeface);
        mDecimalsPaint.setTypeface(typeface);
        invalidateView();
    }

    public void setTypefaceParts(Typeface typeface, Typeface typeface1, Typeface typeface2)
    {
        mPrefixPaint.setTypeface(typeface);
        mIntegerPaint.setTypeface(typeface1);
        mDecimalsPaint.setTypeface(typeface2);
        invalidateView();
    }

}
