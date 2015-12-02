// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm.v2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.ubercab.ui.EditText;

public class RupeeEditText extends EditText
{

    private final String a;
    private final int b;
    private final Rect c;

    public RupeeEditText(Context context)
    {
        this(context, null);
    }

    public RupeeEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public RupeeEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = context.getString(0x7f070779);
        b = getPaddingLeft();
        c = new Rect();
        getPaint().getTextBounds(a, 0, a.length(), c);
        setPadding(b * 2 + c.width(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i = getPaddingTop();
        int j = getPaddingBottom();
        int k = getHeight();
        float f = i;
        float f1 = (float)(k - i - j) / 2.0F;
        float f2 = (float)c.height() / 2.0F;
        float f3 = c.bottom;
        canvas.drawText(a, b, (f + f1 + f2) - f3, getPaint());
    }
}
