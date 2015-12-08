// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

public class SquareTextView extends TextView
{

    private int mOffsetLeft;
    private int mOffsetTop;

    public SquareTextView(Context context)
    {
        super(context);
        mOffsetTop = 0;
        mOffsetLeft = 0;
    }

    public SquareTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mOffsetTop = 0;
        mOffsetLeft = 0;
    }

    public SquareTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mOffsetTop = 0;
        mOffsetLeft = 0;
    }

    public void draw(Canvas canvas)
    {
        canvas.translate(mOffsetLeft / 2, mOffsetTop / 2);
        super.draw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        int k = Math.max(i, j);
        if (i > j)
        {
            mOffsetTop = i - j;
            mOffsetLeft = 0;
        } else
        {
            mOffsetTop = 0;
            mOffsetLeft = j - i;
        }
        setMeasuredDimension(k, k);
    }
}
