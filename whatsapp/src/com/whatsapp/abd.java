// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.whatsapp:
//            a1g, App, Broadcasts

class abd extends Drawable
{

    private int a;
    private Paint b;
    private Paint c;
    private int d;
    final Broadcasts e;

    public abd(Broadcasts broadcasts, int i, int j)
    {
        e = broadcasts;
        super();
        c = new Paint(1);
        b = new Paint(1);
        a = j;
        d = i;
    }

    public void draw(Canvas canvas)
    {
label0:
        {
            float f = (a1g.a().g * 3F) / 2.0F;
            Object obj = new Rect(getBounds());
            obj.right = (int)((float)((Rect) (obj)).right - 2.0F * f);
            obj.bottom = (int)((float)((Rect) (obj)).bottom - 2.0F * f);
            int i = Math.min(((Rect) (obj)).width(), ((Rect) (obj)).height()) / 2 - (int)f;
            BlurMaskFilter blurmaskfilter = new BlurMaskFilter(f, android.graphics.BlurMaskFilter.Blur.NORMAL);
            c.setColor(0xff666666);
            c.setStyle(android.graphics.Paint.Style.FILL);
            c.setMaskFilter(blurmaskfilter);
            canvas.translate((2.0F * f) / 3F, f);
            canvas.drawCircle(((Rect) (obj)).exactCenterX(), ((Rect) (obj)).exactCenterY(), i, c);
            canvas.translate((-2F * f) / 3F, -f);
            c.setMaskFilter(null);
            b.setStrokeWidth(1.0F);
            b.setStyle(android.graphics.Paint.Style.STROKE);
            b.setColor(0x99000000);
            canvas.drawCircle(((Rect) (obj)).exactCenterX(), ((Rect) (obj)).exactCenterY(), i, b);
            obj = new RectF(((Rect) (obj)).exactCenterX() - (float)i, ((Rect) (obj)).exactCenterY() - (float)i, ((Rect) (obj)).exactCenterX() + (float)i, ((Rect) (obj)).exactCenterY() + (float)i);
            b.setStyle(android.graphics.Paint.Style.FILL);
            if (a == 0)
            {
                b.setColor(0x9900cc00);
                canvas.drawArc(((RectF) (obj)), 270F, 360F, true, b);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b.setColor(0x9900cc00);
            canvas.drawArc(((RectF) (obj)), 270F, (d * 360) / a, true, b);
            b.setColor(0xaaffffff);
            canvas.drawArc(((RectF) (obj)), (d * 360) / a + 270, 360 - (d * 360) / a, true, b);
        }
    }

    public int getOpacity()
    {
        return 0;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
