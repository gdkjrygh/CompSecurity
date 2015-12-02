// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import chm;
import com.ubercab.ui.TextView;

public class PaymentTextView extends TextView
{

    private Drawable a;
    private final int b;
    private final int c;

    public PaymentTextView(Context context)
    {
        this(context, null);
    }

    public PaymentTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PaymentTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, chm.PaymentTextView);
        c = context.getDimensionPixelSize(0, 0);
        context.recycle();
        b = getPaddingRight();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void b(Drawable drawable)
    {
        Drawable adrawable[] = getCompoundDrawables();
        adrawable[0] = drawable;
        setCompoundDrawablesWithIntrinsicBounds(adrawable[0], adrawable[1], adrawable[2], adrawable[3]);
    }

    public final void a(int i)
    {
        int j = 0;
        int k;
        if (i == 0)
        {
            a = null;
            i = j;
        } else
        {
            a = getResources().getDrawable(i);
            a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
            i = a.getIntrinsicWidth();
        }
        j = b;
        k = c;
        setPadding(getPaddingLeft(), getPaddingTop(), i + (j + k), getPaddingBottom());
        invalidate();
    }

    public final void a(Drawable drawable)
    {
        b(drawable);
    }

    protected void onDraw(Canvas canvas)
    {
        Layout layout;
label0:
        {
            super.onDraw(canvas);
            if (a != null)
            {
                layout = getLayout();
                if (layout != null)
                {
                    break label0;
                }
            }
            return;
        }
        float f = getCompoundPaddingLeft() + c;
        float f1 = layout.getLineWidth(0);
        float f2 = (float)getHeight() / 2.0F;
        float f3 = (float)a.getIntrinsicHeight() / 2.0F;
        canvas.save();
        canvas.translate(f1 + f, f2 - f3);
        a.draw(canvas);
        canvas.restore();
    }
}
