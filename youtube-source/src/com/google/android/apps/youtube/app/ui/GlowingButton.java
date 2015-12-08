// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.youtube.f;

public final class GlowingButton extends Button
{

    private static final BlurMaskFilter c[];
    private final Paint a;
    private final Rect b;

    public GlowingButton(Context context)
    {
        super(context);
        a = new Paint();
        b = new Rect();
        a(context);
    }

    public GlowingButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Paint();
        b = new Rect();
        a(context);
    }

    private void a(Context context)
    {
        context.getResources();
        setTextColor(context.getResources().getColorStateList(f.g));
        a.setAntiAlias(true);
        a.setTextAlign(android.graphics.Paint.Align.LEFT);
        setBackgroundDrawable(null);
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (isFocused() || isSelected() || isPressed())
        {
            String s = getText().toString();
            canvas.getClipBounds(b);
            a.setTextSize(getTextSize());
            a.setColor(0xffc14242);
            int i = b.left;
            int k = getTotalPaddingLeft() + i;
            int l = getBaseline();
            BlurMaskFilter ablurmaskfilter[] = c;
            int i1 = ablurmaskfilter.length;
            for (int j = 0; j < i1; j++)
            {
                BlurMaskFilter blurmaskfilter = ablurmaskfilter[j];
                a.setMaskFilter(blurmaskfilter);
                canvas.drawText(s, k, l, a);
            }

            a.setColor(-1);
            canvas.drawText(s, k, l, a);
        }
    }

    static 
    {
        c = new BlurMaskFilter[5];
        for (int i = 0; i < c.length; i++)
        {
            c[i] = new BlurMaskFilter(i * 2 + 1, android.graphics.BlurMaskFilter.Blur.SOLID);
        }

    }
}
