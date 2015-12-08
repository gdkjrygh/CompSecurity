// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class o
{

    private static float a;
    private static float b;
    private static float c;
    private static float d;
    private static Paint e;
    private static Paint f;

    public static Bitmap a(Context context, String s, int i, int j)
    {
        context = new Canvas();
        Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_4444);
        context.setBitmap(bitmap);
        if (e == null)
        {
            e = a(Color.parseColor("#86530D"));
        }
        a(((Canvas) (context)), e, (float)j / 1.5F, s, i);
        return bitmap;
    }

    private static Paint a(int i)
    {
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setTextSize(d);
        paint.setLinearText(true);
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeWidth(0.6F);
        return paint;
    }

    private static void a(Canvas canvas, Paint paint, float f1, String s, int i)
    {
        float f2;
        for (f2 = paint.measureText(s); f2 >= (float)(i + 2); f2 = paint.measureText(s))
        {
            paint.setTextSize(paint.getTextSize() - 1.0F);
        }

        canvas.drawText(s, ((float)i - f2) / 2.0F, f1, paint);
    }

    public static Bitmap b(Context context, String s, int i, int j)
    {
        context = new Canvas();
        Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_4444);
        context.setBitmap(bitmap);
        if (f == null)
        {
            f = a(Color.parseColor("#18629A"));
        }
        a(context, f, (float)j / 1.5F, s, i);
        return bitmap;
    }

    static 
    {
        a = 1.0F;
        b = 60F * a;
        c = 30F * a;
        d = 24F * a;
    }
}
