// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.uicomponents;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;

public class RotatedTextView extends TextView
{

    private int totalPaddingLeft;
    private int totalPaddingTop;

    public RotatedTextView(Context context)
    {
        super(context);
    }

    public RotatedTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onDraw(Canvas canvas)
    {
        canvas.save();
        canvas.translate(0.0F, getHeight());
        canvas.rotate(-90F);
        canvas.translate(totalPaddingLeft, totalPaddingTop);
        CharSequence charsequence = getText();
        setText(null);
        super.onDraw(canvas);
        setText(charsequence);
        getLayout().draw(canvas);
        canvas.restore();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        totalPaddingTop = getTotalPaddingTop();
        totalPaddingLeft = getTotalPaddingLeft();
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
