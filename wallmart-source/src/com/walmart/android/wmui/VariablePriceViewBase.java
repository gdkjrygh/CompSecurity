// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.walmart.android.util.WalmartPrice;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.PriceView;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.wmui:
//            MediumPriceView

public abstract class VariablePriceViewBase extends View
{

    private static final int DEFAULT_LEADING_DP = 4;
    private static final String DEFAULT_PRICE_RANGE_DELIMITER = "-";
    protected static final float UNIT_SIZE_FACTOR = 0.8F;
    protected static final boolean sDrawPrefix = false;
    private static String sPrefixRegEx;
    private static Pattern sPricePattern;
    private static Pattern sPriceRangePattern;
    private static String sPriceRegEx;
    protected android.graphics.Paint.FontMetricsInt mFontMetrics;
    protected int mHeight;
    protected int mLeading;
    protected final Rect mPrefixBounds;
    protected WalmartPrice mPrice;
    protected PriceView mPrice1;
    protected PriceView mPrice2;
    protected String mPriceRangeDelimiter;
    protected final Rect mPriceRangeDelimiterBounds;
    protected Paint mRectPaint;
    protected Paint mTextPaint;
    protected String mUnit;
    protected final Rect mUnitBounds;
    protected Paint mUnitPaint;
    protected int mWidth;

    public VariablePriceViewBase(Context context, AttributeSet attributeset, int i, boolean flag)
    {
        super(context, attributeset, i);
        mPrefixBounds = new Rect();
        mPriceRangeDelimiterBounds = new Rect();
        mUnitBounds = new Rect();
        mPrice = WalmartPrice.fromString("");
        init(attributeset, flag);
    }

    public VariablePriceViewBase(Context context, AttributeSet attributeset, boolean flag)
    {
        super(context, attributeset);
        mPrefixBounds = new Rect();
        mPriceRangeDelimiterBounds = new Rect();
        mUnitBounds = new Rect();
        mPrice = WalmartPrice.fromString("");
        init(attributeset, flag);
    }

    public VariablePriceViewBase(Context context, boolean flag)
    {
        super(context);
        mPrefixBounds = new Rect();
        mPriceRangeDelimiterBounds = new Rect();
        mUnitBounds = new Rect();
        mPrice = WalmartPrice.fromString("");
        init(null, flag);
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

    private void init(AttributeSet attributeset, boolean flag)
    {
        Object obj;
        mRectPaint = new Paint();
        mRectPaint.setColor(0xff000000);
        mRectPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mRectPaint.setStrokeWidth(1.0F);
        if (flag)
        {
            mPrice1 = new MediumPriceView(getContext(), attributeset);
            mPrice2 = new MediumPriceView(getContext(), attributeset);
        } else
        {
            mPrice1 = new PriceView(getContext(), attributeset);
            mPrice2 = new PriceView(getContext(), attributeset);
        }
        mTextPaint = mPrice1.getIntegerPaint();
        mFontMetrics = mTextPaint.getFontMetricsInt();
        mUnitPaint = mPrice1.getDecimalsPaint();
        mUnitPaint.setTextSize(mUnitPaint.getTextSize() * 0.8F);
        mLeading = ViewUtil.dpToPixels(4, getContext());
        obj = null;
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = getContext().getTheme().obtainStyledAttributes(attributeset, com.walmart.android.R.styleable.VariablePriceViewBase, 0, 0);
        mLeading = ((TypedArray) (obj)).getDimensionPixelSize(1, mLeading);
        mPriceRangeDelimiter = ((TypedArray) (obj)).getString(2);
        attributeset = ((TypedArray) (obj)).getString(0);
        ((TypedArray) (obj)).recycle();
        obj = attributeset;
        if (TextUtils.isEmpty(mPriceRangeDelimiter))
        {
            mPriceRangeDelimiter = "-";
        }
        setPrice(((String) (obj)));
        return;
        attributeset;
        ((TypedArray) (obj)).recycle();
        throw attributeset;
    }

    public String getPrefix()
    {
        return mPrice.getPrefix();
    }

    public String getPrice()
    {
        return mPrice.toString();
    }

    public WalmartPrice getWalmartPrice()
    {
        return mPrice;
    }

    protected Rect getWidestOf(Rect rect, Rect rect1)
    {
        if (rect1.right - rect1.left > rect.right - rect.left)
        {
            return rect1;
        } else
        {
            return rect;
        }
    }

    protected boolean hasPrefix()
    {
        return mPrice.hasPrefix();
    }

    public boolean hasPrice(String s)
    {
        return mPrice != null && mPrice.toString().equals(WalmartPrice.fromString(s).toString());
    }

    protected void initBounds()
    {
        Object obj = null;
        String s;
        if (shouldDrawPrefix())
        {
            s = mPrice.getPrefix();
        } else
        {
            s = null;
        }
        getBounds(s, mPrefixBounds, mTextPaint);
        s = obj;
        if (mPrice.isRange())
        {
            s = mPriceRangeDelimiter;
        }
        getBounds(s, mPriceRangeDelimiterBounds, mTextPaint);
        getBounds(mUnit, mUnitBounds, mUnitPaint);
    }

    protected boolean isPriceRange()
    {
        return mPrice.isRange();
    }

    public void setPrice(String s)
    {
        mPrice = WalmartPrice.fromString(s);
        String s1;
        if (mPrice.isValid())
        {
            s1 = mPrice.getLowerBound().toString();
            if (mPrice.isRange())
            {
                s = mPrice.getUpperBound().toString();
            } else
            {
                s = null;
            }
        } else
        {
            s1 = null;
            s = null;
        }
        mPrice1.setPrice(s1);
        mPrice2.setPrice(s);
        requestLayout();
    }

    public void setUnit(String s)
    {
        if (s != null)
        {
            s = (new StringBuilder()).append(" / ").append(s).toString();
        } else
        {
            s = null;
        }
        mUnit = s;
    }

    protected boolean shouldDrawPrefix()
    {
        return false;
    }

    static 
    {
        sPrefixRegEx = "([^$]*?)";
        sPriceRegEx = "(\\$?\\d{1,3}(?:,?\\d{3})*(\\.\\d{2})?)";
        sPricePattern = Pattern.compile((new StringBuilder()).append("^").append(sPrefixRegEx).append(sPriceRegEx).append("(.*)$").toString());
        sPriceRangePattern = Pattern.compile((new StringBuilder()).append("^").append(sPrefixRegEx).append(sPriceRegEx).append("\\s*-\\s*").append(sPriceRegEx).append("(.*)$").toString());
    }
}
