// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            App, a1g

public class f extends ImageView
{

    private Shader a;
    private Shader b;
    private Paint c;
    private Shader d;
    private Shader e;
    private RectF f;

    public void onDraw(Canvas canvas)
    {
        int i = App.am;
        super.onDraw(canvas);
        float f2 = 24F * a1g.a().g;
        float f1 = (float)getHeight() - f2;
        int j = getWidth();
        float f3 = a1g.a().g * 30F;
        int k = (int)(f1 / f3);
        float f4 = f1 / (float)k;
        f.set(0.0F, 0.0F, f3, getHeight());
        c.setColor(0x66000000);
        c.setStyle(android.graphics.eight);
        c.setShader(b);
        canvas.drawRect(f, c);
        f.set((float)j - f3, 0.0F, j, getHeight());
        canvas.drawRect(f, c);
        c.setShader(e);
        f1 = 0.0F;
        do
        {
            if (f1 >= (float)k)
            {
                break;
            }
            float f5 = f1 * f4;
            f.set(f3 / 4F, (f4 / 2.0F + f5) - f3 / 4F, (3F * f3) / 4F, f5 + f4 / 2.0F + f3 / 4F);
            c.setColor(0x99f3ffe8);
            c.setStyle(android.graphics.eight);
            canvas.drawRoundRect(f, f3 / 12F, f3 / 12F, c);
            f.offset((float)j - f3, 0.0F);
            c.setColor(0x99f3ffe8);
            c.setStyle(android.graphics.eight);
            canvas.drawRoundRect(f, f3 / 12F, f3 / 12F, c);
            f1++;
        } while (i == 0);
        c.setShader(d);
        f1 = 0.0F;
        do
        {
            if (f1 >= (float)k)
            {
                break;
            }
            float f6 = f1 * f4;
            f.set(f3 / 4F, (f4 / 2.0F + f6) - f3 / 4F, (3F * f3) / 4F, f6 + f4 / 2.0F + f3 / 4F);
            c.setColor(0x99333333);
            c.setStyle(android.graphics.eight);
            c.setStrokeWidth(f3 / 32F);
            canvas.drawRoundRect(f, f3 / 12F, f3 / 12F, c);
            f.offset((float)j - f3, 0.0F);
            c.setColor(0x99333333);
            c.setStyle(android.graphics.eight);
            c.setStrokeWidth(f3 / 32F);
            canvas.drawRoundRect(f, f3 / 12F, f3 / 12F, c);
            f1++;
        } while (i == 0);
        c.setColor(0x66000000);
        c.setShader(a);
        c.setStyle(android.graphics.eight);
        f.set(0.0F, (float)getHeight() - (f2 * 4F) / 3F, j, getHeight());
        canvas.drawRect(f, c);
    }

    protected void onMeasure(int i, int j)
    {
        View view = ((Activity)getContext()).getWindow().getDecorView();
        i = (Math.min(view.getWidth(), view.getHeight()) * 70) / 100;
        super.onMeasure(android.view.getContext(i, 0x40000000), android.view.getContext(i, 0x40000000));
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        float f1 = a1g.a().g * 24F;
        b = new LinearGradient(0.0F, (float)j - 2.0F * f1, 0.0F, (float)j - (3F * f1) / 4F, 0xff000000, 0, android.graphics.ontext);
        e = new LinearGradient(0.0F, (float)j - 2.0F * f1, 0.0F, (float)j - (3F * f1) / 4F, 0x99f3ffe8, 0, android.graphics.ontext);
        d = new LinearGradient(0.0F, (float)j - 2.0F * f1, 0.0F, (float)j - (3F * f1) / 4F, 0x99333333, 0, android.graphics.ontext);
        a = new LinearGradient(0.0F, (float)j - (4F * f1) / 3F, 0.0F, j, 0, 0xff000000, android.graphics.ontext);
    }

    public (Context context)
    {
        super(context);
        c = new Paint(1);
        f = new RectF();
    }

    public f(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Paint(1);
        f = new RectF();
    }

    public f(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new Paint(1);
        f = new RectF();
    }
}
