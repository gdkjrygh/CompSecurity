// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui.fonts;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;

// Referenced classes of package com.weather.commons.ui.fonts:
//            TextViewWithFont

public class AutoFitTextView extends TextViewWithFont
{

    private static final int MIN_TEXT_SIZE = 10;
    private final int maxTextSize;
    private boolean needsResize;
    private CharSequence oldText;

    public AutoFitTextView(Context context)
    {
        super(context);
        maxTextSize = (int)getTextSize();
    }

    public AutoFitTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        maxTextSize = (int)getTextSize();
    }

    public AutoFitTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        maxTextSize = (int)getTextSize();
    }

    private void refitText(int i)
    {
        Object obj;
        if (i > 0)
        {
            if ((obj = getText()) != null && !TextUtils.isEmpty(((CharSequence) (obj = ((CharSequence) (obj)).toString()))))
            {
                int j1 = getCompoundPaddingLeft();
                int k1 = getCompoundPaddingRight();
                int l = 10;
                int k = 10;
                for (int j = maxTextSize; k <= j;)
                {
                    int i1 = (k + j) / 2;
                    setTextSize(0, i1);
                    if ((int)getPaint().measureText(((String) (obj))) > i - j1 - k1)
                    {
                        j = i1 - 1;
                    } else
                    {
                        l = i1;
                        k = i1 + 1;
                    }
                }

                setTextSize(0, l);
                return;
            }
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag || needsResize)
        {
            needsResize = false;
            refitText(k - i);
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (i != k)
        {
            needsResize = true;
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (!TextUtils.isEmpty(charsequence) && !charsequence.equals(oldText))
        {
            oldText = charsequence;
            needsResize = true;
        }
    }
}
