// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            App

public class CondensedTextView extends TextView
{

    private TextPaint a;
    private float b;

    public CondensedTextView(Context context)
    {
        super(context);
        b = 0.8F;
    }

    public CondensedTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0.8F;
    }

    public CondensedTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = 0.8F;
    }

    private void a(String s)
    {
label0:
        {
            int i = App.am;
            if (a == null || a.getTextSize() != getPaint().getTextSize())
            {
                a = new TextPaint(getPaint());
                a.setTextScaleX(1.0F);
            }
            float f = a.measureText(s);
            if (f <= 0.0F)
            {
                break label0;
            }
            int j = getMeasuredWidth() - getCompoundPaddingLeft() - getCompoundPaddingRight();
            if (j <= 0)
            {
                break label0;
            }
            f = (float)j / f;
            if (f < 1.0F)
            {
                float f1 = Math.max(b, f);
                setTextScaleX(f1);
                f = getPaint().measureText(s);
                do
                {
                    if (f <= (float)j || f1 <= b)
                    {
                        break;
                    }
                    f1 *= 0.99F;
                    setTextScaleX(f1);
                    f = getPaint().measureText(s);
                } while (i == 0);
                setSingleLine(true);
                setHorizontallyScrolling(false);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (getTextScaleX() != 1.0F)
            {
                setTextScaleX(1.0F);
            }
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k || j != l)
        {
            a(getText().toString());
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        a(getText().toString());
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        super.setText(charsequence, buffertype);
        a(charsequence.toString());
    }

    public void setTextSize(int i, float f)
    {
        super.setTextSize(i, f);
        a.setTextSize(getPaint().getTextSize());
        a(getText().toString());
    }
}
