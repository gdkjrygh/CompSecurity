// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

// Referenced classes of package com.whatsapp:
//            App, a1g

public class aob extends BitmapDrawable
{

    private int a;
    private Path b;
    private float c;
    private int d;
    private Rect e;
    private Paint f;

    public aob(Context context, Bitmap bitmap, boolean flag)
    {
        int i;
label0:
        {
            i = App.am;
            super(context.getResources(), bitmap);
            c = a1g.a().h;
            a = context.getResources().getDimensionPixelSize(0x7f0a0046);
            int j = bitmap.getWidth();
            int k = bitmap.getHeight();
            if (j < k)
            {
                e = new Rect(0, (k - j) / 2, j, (k + j) / 2);
                if (i == 0)
                {
                    break label0;
                }
            }
            e = new Rect((j - k) / 2, 0, (j + k) / 2, k);
        }
label1:
        {
            b = new Path();
            if (!flag)
            {
                b.moveTo(0.0F, 0.0F);
                b.lineTo((float)a - c, 0.0F);
                b.arcTo(new RectF((float)a - c * 2.0F, 0.0F, a, c * 2.0F), -90F, 90F);
                b.lineTo(a, (float)a - c);
                b.arcTo(new RectF((float)a - c * 2.0F, (float)a - c * 2.0F, a, a), 0.0F, 90F);
                b.lineTo(0.0F, a);
                b.lineTo(0.0F, 0.0F);
                if (i == 0)
                {
                    break label1;
                }
            }
            b.moveTo(a, a);
            b.lineTo(c, a);
            b.arcTo(new RectF(0.0F, (float)a - c * 2.0F, c * 2.0F, a), 90F, 90F);
            b.lineTo(0.0F, c);
            b.arcTo(new RectF(0.0F, 0.0F, c * 2.0F, c * 2.0F), 180F, 90F);
            b.lineTo(a, 0.0F);
            b.lineTo(a, a);
        }
        f = new Paint();
        f.setAntiAlias(true);
        f.setDither(true);
        f.setFilterBitmap(true);
        f.setColor(-1);
    }

    public void draw(Canvas canvas)
    {
        if (getBitmap().isRecycled())
        {
            return;
        }
        if (c == 0.0F)
        {
            super.draw(canvas);
            return;
        } else
        {
            RectF rectf = new RectF(getBounds());
            int i = canvas.saveLayer(rectf, null, 31);
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawPath(b, f);
            f.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(getBitmap(), e, rectf, f);
            f.setXfermode(null);
            canvas.restoreToCount(i);
            return;
        }
    }

    public int getIntrinsicHeight()
    {
        return a;
    }

    public int getIntrinsicWidth()
    {
        return a;
    }

    public boolean isStateful()
    {
        return true;
    }

    public boolean setState(int ai[])
    {
        boolean flag = false;
        int j = App.am;
        int k = d;
        d = 0x10100a9;
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
                d = 0x10100a7;
                if (j == 0)
                {
                    break;
                }
            }
            if (i1 == 0x101009c)
            {
                d = 0x101009c;
            }
            i++;
        } while (j == 0);
        if (k != d)
        {
            invalidateSelf();
            flag = true;
        }
        return flag;
    }
}
