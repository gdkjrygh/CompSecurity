// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.uicomponents;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;

public class RotatedButton extends Button
{

    private int totalPaddingLeft;
    private int totalPaddingTop;

    public RotatedButton(Context context)
    {
        super(context);
    }

    public RotatedButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.save();
        canvas.translate(0.0F, getHeight());
        canvas.rotate(-90F);
        Object obj = new Rect();
        (new Paint()).getTextBounds((String)getText(), 0, getText().length(), ((Rect) (obj)));
        canvas.translate(totalPaddingLeft, totalPaddingTop);
        obj = getText();
        setText(null);
        super.onDraw(canvas);
        setText(((CharSequence) (obj)));
        if (getLayout() != null)
        {
            getLayout().draw(canvas);
        }
        canvas.restore();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        totalPaddingTop = getTotalPaddingTop();
        totalPaddingLeft = getTotalPaddingLeft();
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setBackgroundColor(int i)
    {
        PorterDuffColorFilter porterduffcolorfilter = new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_ATOP);
        getBackground().setColorFilter(porterduffcolorfilter);
    }
}
