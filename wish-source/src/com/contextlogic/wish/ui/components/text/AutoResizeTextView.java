// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;

// Referenced classes of package com.contextlogic.wish.ui.components.text:
//            UnifiedFontTextView

public class AutoResizeTextView extends UnifiedFontTextView
{

    private static final int NO_LINE_LIMIT = -1;
    private boolean isChanging;
    private boolean isStale;
    private float lineAdditionalVerticalPadding;
    private float lineSpacingMultiplier;
    private float maxFontSize;
    private int maxLines;
    private float minFontSize;

    public AutoResizeTextView(Context context)
    {
        this(context, null);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        maxLines = -1;
        lineSpacingMultiplier = 1.0F;
        lineAdditionalVerticalPadding = 0.0F;
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x1010153
        });
        setMaxLines(context.getInt(0, 2));
        context.recycle();
        minFontSize = TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        maxFontSize = getTextSize();
    }

    private void adjustTextSize()
    {
        isChanging = true;
        setTextSize(0, getIdealFontSize());
        isChanging = false;
        isStale = false;
    }

    private Layout createWorkingLayout(String s, TextPaint textpaint)
    {
        if (getAvailableWidth() <= 0)
        {
            return null;
        } else
        {
            return new StaticLayout(s, textpaint, getAvailableWidth(), android.text.Layout.Alignment.ALIGN_NORMAL, lineSpacingMultiplier, lineAdditionalVerticalPadding, false);
        }
    }

    private int getAvailableHeight()
    {
        return getHeight() - getCompoundPaddingBottom() - getCompoundPaddingTop();
    }

    private int getAvailableWidth()
    {
        return getWidth() - getCompoundPaddingLeft() - getCompoundPaddingRight();
    }

    private int getIdealFontSize()
    {
        int j = (int)minFontSize;
        int i = (int)maxFontSize;
        int k = j;
        while (j <= i) 
        {
            int l = (i + j) / 2;
            if (testFontSize(l))
            {
                j = l + 1;
                k = l;
            } else
            {
                i = l - 1;
            }
        }
        return k;
    }

    private boolean testFontSize(float f)
    {
        Object obj = getText().toString();
        TextPaint textpaint = new TextPaint(getPaint());
        textpaint.setTextSize(f);
        obj = createWorkingLayout(((String) (obj)), textpaint);
        if (obj != null)
        {
            if (maxLines != -1 && ((Layout) (obj)).getLineCount() > maxLines)
            {
                return false;
            }
            if (((Layout) (obj)).getHeight() > getAvailableHeight())
            {
                return false;
            }
        }
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        if (isChanging)
        {
            return;
        }
        if (isStale)
        {
            adjustTextSize();
        }
        super.onDraw(canvas);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        isStale = true;
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        isStale = true;
    }

    public void setMaxLines(int i)
    {
        super.setMaxLines(i);
        int j = i;
        if (i == 0)
        {
            j = -1;
        }
        maxLines = j;
        if (!isStale)
        {
            isStale = true;
            invalidate();
        }
    }

    public void setMaxTextSize(int i)
    {
        maxFontSize = i;
        if (!isStale)
        {
            isStale = true;
            invalidate();
        }
    }

    public void setMinTextSize(int i)
    {
        minFontSize = i;
        if (!isStale)
        {
            isStale = true;
            invalidate();
        }
    }

    public void setSingleLine()
    {
        super.setSingleLine();
        maxLines = 1;
        if (!isStale)
        {
            isStale = true;
            invalidate();
        }
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
        maxLines = i;
        if (!isStale)
        {
            isStale = true;
            invalidate();
        }
    }
}
