// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.whatsapp:
//            a1g, App

public class ao4 extends Drawable
{

    private int a;
    private int b;
    private float c;
    private Paint d;

    public ao4()
    {
        a = 18;
        b = 0x10100a9;
        c = 3F;
        d = new Paint(1);
        c = 2.0F * a1g.a().g;
    }

    private Path a(float f, float f1)
    {
        Path path = new Path();
        int i = (int)(a1g.a().g * 2.0F);
        path.moveTo(f / 2.0F - (float)((a * 2) / 3), f1 - (float)a);
        path.lineTo(f / 2.0F, f1);
        path.lineTo(f / 2.0F + (float)((a * 2) / 3), f1 - (float)a);
        path.lineTo(f - (float)i, f1 - (float)a);
        path.arcTo(new RectF(f - (float)(i * 2), f1 - (float)a - (float)(i * 2), f, f1 - (float)a), 90F, -90F);
        path.lineTo(f, i);
        path.arcTo(new RectF(f - (float)(i * 2), 0.0F, f, i * 2), 0.0F, -90F);
        path.lineTo(i, 0.0F);
        path.arcTo(new RectF(0.0F, 0.0F, i * 2, i * 2), -90F, -90F);
        path.lineTo(0.0F, f1 - (float)a - (float)i);
        path.arcTo(new RectF(0.0F, f1 - (float)a - (float)(i * 2), i * 2, f1 - (float)a), -180F, -90F);
        path.close();
        path.setFillType(android.graphics.Path.FillType.WINDING);
        return path;
    }

    public void a(int i)
    {
        a = i;
    }

    public void draw(Canvas canvas)
    {
        Object obj;
label0:
        {
            d.setARGB(255, 0, 0, 0);
            obj = getBounds();
            int i = ((Rect) (obj)).width();
            int j = ((Rect) (obj)).height();
            obj = a((float)i - c * 2.0F, (float)j - c * 2.0F);
            BlurMaskFilter blurmaskfilter = new BlurMaskFilter(c, android.graphics.BlurMaskFilter.Blur.NORMAL);
            d.setColor(0x99333333);
            d.setStyle(android.graphics.Paint.Style.FILL);
            d.setMaskFilter(blurmaskfilter);
            canvas.translate(c, c * 1.5F);
            canvas.drawPath(((Path) (obj)), d);
            canvas.translate(-c, -c * 1.5F);
            canvas.translate(c, c);
            if (b == 0x10100a7)
            {
                d.setColor(0xff33b5e5);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            d.setColor(-1);
        }
        d.setMaskFilter(null);
        canvas.drawPath(((Path) (obj)), d);
        if (b == 0x10100a1)
        {
            d.setStrokeWidth(c);
            d.setStyle(android.graphics.Paint.Style.STROKE);
            d.setColor(0xff33b5e5);
            canvas.drawPath(((Path) (obj)), d);
        }
        canvas.translate(-c, -c);
    }

    public int getOpacity()
    {
        return 0;
    }

    public boolean getPadding(Rect rect)
    {
        rect.top = (int)c;
        rect.bottom = a + (int)c;
        rect.left = (int)c;
        rect.right = (int)c;
        return true;
    }

    public boolean isStateful()
    {
        return true;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

    public boolean setState(int ai[])
    {
        boolean flag = false;
        int j = App.am;
        int k = b;
        b = 0x10100a9;
        int l = ai.length;
        int i = 0;
        do
        {
            if (i >= l)
            {
                break;
            }
            int i1 = ai[i];
            if (i1 == 0x10100a7)
            {
                b = 0x10100a7;
                if (j == 0)
                {
                    break;
                }
            }
            if (i1 == 0x10100a1)
            {
                b = 0x10100a1;
                if (j == 0)
                {
                    break;
                }
            }
            if (i1 == 0x101009c)
            {
                b = 0x101009c;
            }
            i++;
        } while (j == 0);
        if (k != b)
        {
            invalidateSelf();
            flag = true;
        }
        return flag;
    }
}
