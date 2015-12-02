// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class OptionRadioButton extends RadioButton
{

    private boolean a;
    private String b;
    private int c;
    private Drawable d;
    private int e[];

    public OptionRadioButton(Context context)
    {
        super(context);
        c();
    }

    public OptionRadioButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c();
    }

    public OptionRadioButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c();
    }

    private void a(Canvas canvas)
    {
        canvas.save();
        float f1 = getPaint().measureText(getText().toString());
        Drawable drawable = d;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int ai[];
        if (isChecked())
        {
            ai = e;
        } else
        {
            ai = null;
        }
        drawable.setState(ai);
        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        f = (float)canvas.getWidth() / 2.0F;
        f1 /= 2.0F;
        f2 = d.getIntrinsicWidth();
        f3 = c;
        f4 = (float)getHeight() / 2.0F;
        f5 = (float)d.getIntrinsicHeight() / 2.0F;
        canvas.translate(Math.round(f - f1 - f2 - f3), Math.round(f4 - f5));
        d.draw(canvas);
        canvas.restore();
    }

    private void c()
    {
        e = (new int[] {
            0x10100a0
        });
        d = getResources().getDrawable(0x7f020332);
        c = getResources().getDimensionPixelSize(0x7f0802ba);
    }

    final String a()
    {
        return b;
    }

    final void a(String s)
    {
        b = s;
    }

    final void a(boolean flag)
    {
        a = flag;
    }

    final int b()
    {
        int ai[] = new int[2];
        getLocationInWindow(ai);
        return ai[0];
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a)
        {
            a(canvas);
        }
    }
}
