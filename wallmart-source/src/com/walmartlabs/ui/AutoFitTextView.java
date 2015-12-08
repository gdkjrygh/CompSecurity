// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

public class AutoFitTextView extends TextView
{

    private static final String TAG = com/walmartlabs/ui/AutoFitTextView.getSimpleName();
    private RectF mAvailableSpaceRect;
    private boolean mInitialized;
    private int mMaxLines;
    private float mMaxTextSize;
    private final float mMinTextSize;
    private TextPaint mPaint;
    private float mSpacingAdd;
    private float mSpacingMult;
    private RectF mTextRect;
    private int mWidthLimit;

    public AutoFitTextView(Context context)
    {
        super(context);
        mTextRect = new RectF();
        mSpacingMult = 1.0F;
        mSpacingAdd = 0.0F;
        mMinTextSize = 20F;
        init(context, null);
    }

    public AutoFitTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mTextRect = new RectF();
        mSpacingMult = 1.0F;
        mSpacingAdd = 0.0F;
        mMinTextSize = 20F;
        init(context, attributeset);
    }

    public AutoFitTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mTextRect = new RectF();
        mSpacingMult = 1.0F;
        mSpacingAdd = 0.0F;
        mMinTextSize = 20F;
        init(context, attributeset);
    }

    private void adjustTextSize()
    {
        if (!mInitialized)
        {
            return;
        } else
        {
            int i = getMeasuredHeight();
            int j = getCompoundPaddingBottom();
            int k = getCompoundPaddingTop();
            mWidthLimit = getMeasuredWidth() - getCompoundPaddingLeft() - getCompoundPaddingRight();
            mAvailableSpaceRect.right = mWidthLimit;
            mAvailableSpaceRect.bottom = i - j - k;
            super.setTextSize(0, binarySearch(20, (int)mMaxTextSize, mAvailableSpaceRect));
            return;
        }
    }

    private int binarySearch(int i, int j, RectF rectf)
    {
        int k = i;
        int i1 = j - 1;
        j = i;
        i = k;
        for (int l = i1; i <= l;)
        {
            j = i + l >>> 1;
            if (textTooBig(j, rectf))
            {
                l = j - 1;
                j = l;
            } else
            {
                int j1 = j + 1;
                j = i;
                i = j1;
            }
        }

        return j;
    }

    private void init(Context context, AttributeSet attributeset)
    {
        mPaint = new TextPaint(getPaint());
        mMaxTextSize = getTextSize();
        mAvailableSpaceRect = new RectF();
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.AutoFitTextView);
            mSpacingAdd = context.getDimensionPixelSize(com.walmart.lib.R.styleable.AutoFitTextView_lineSpacingExtra, (int)mSpacingAdd);
            mSpacingMult = context.getFloat(com.walmart.lib.R.styleable.AutoFitTextView_lineSpacingMultiplier, mSpacingMult);
            super.setLineSpacing(mSpacingAdd, mSpacingMult);
            mMaxLines = context.getInt(com.walmart.lib.R.styleable.AutoFitTextView_maxLines, 0x7fffffff);
            super.setMaxLines(mMaxLines);
            context.recycle();
        }
        mInitialized = true;
    }

    private boolean textTooBig(int i, RectF rectf)
    {
        Object obj;
        mPaint.setTextSize(i);
        obj = getText().toString();
        if (mMaxLines != 1) goto _L2; else goto _L1
_L1:
        mTextRect.bottom = mPaint.getFontSpacing();
        mTextRect.right = mPaint.measureText(((String) (obj)));
_L6:
        mTextRect.offsetTo(0.0F, 0.0F);
        if (rectf.contains(mTextRect))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        return true;
_L2:
        obj = new StaticLayout(((CharSequence) (obj)), mPaint, mWidthLimit, android.text.Layout.Alignment.ALIGN_NORMAL, mSpacingMult, mSpacingAdd, true);
        if (mMaxLines != -1 && ((StaticLayout) (obj)).getLineCount() > mMaxLines) goto _L4; else goto _L3
_L3:
        mTextRect.bottom = ((StaticLayout) (obj)).getHeight();
        int j = -1;
        for (i = 0; i < ((StaticLayout) (obj)).getLineCount();)
        {
            int k = j;
            if ((float)j < ((StaticLayout) (obj)).getLineWidth(i))
            {
                k = (int)((StaticLayout) (obj)).getLineWidth(i);
            }
            i++;
            j = k;
        }

        mTextRect.right = j;
        if (true) goto _L6; else goto _L5
_L5:
        return false;
    }

    public int getMaxLines()
    {
        return mMaxLines;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k || j != l)
        {
            adjustTextSize();
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        adjustTextSize();
    }

    public void setLineSpacing(float f, float f1)
    {
        super.setLineSpacing(f, f1);
        mSpacingMult = f1;
        mSpacingAdd = f;
        adjustTextSize();
    }

    public void setLines(int i)
    {
        super.setLines(i);
        mMaxLines = i;
        adjustTextSize();
    }

    public void setMaxLines(int i)
    {
        super.setMaxLines(i);
        mMaxLines = i;
        adjustTextSize();
    }

    public void setSingleLine()
    {
        super.setSingleLine();
        mMaxLines = 1;
        adjustTextSize();
    }

    public void setSingleLine(boolean flag)
    {
        super.setSingleLine(flag);
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        mMaxLines = i;
        adjustTextSize();
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        super.setText(charsequence, buffertype);
        adjustTextSize();
    }

    public void setTextSize(float f)
    {
        mMaxTextSize = f;
        adjustTextSize();
    }

    public void setTextSize(int i, float f)
    {
        mMaxTextSize = TypedValue.applyDimension(i, f, getContext().getResources().getDisplayMetrics());
        adjustTextSize();
    }

}
