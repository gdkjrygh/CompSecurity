// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public final class efk extends View
{

    private final gee a;
    private final Paint b = new Paint();
    private final int c;
    private final int d;
    private int e;

    public efk(Context context, gee gee1)
    {
        super(context);
        a = gee1;
        c = context.getResources().getDimensionPixelSize(0x7f0800ef);
        b.setColor(-1);
        b.setStrokeWidth(context.getResources().getDimensionPixelSize(0x7f0800f0));
        b.setStyle(android.graphics.Paint.Style.STROKE);
        d = a(context) / 2;
    }

    private static int a(Context context)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        context.getSize(point);
        return point.x;
    }

    public final void a(int i)
    {
        e = i;
        invalidate();
    }

    public final void onDraw(Canvas canvas)
    {
        canvas.drawBitmap(a.a(), a.b(), a.c(), null);
        float f4 = a.c() - c;
        float f5 = a.c() + a.a().getHeight() + c;
        float f6 = a.b() + a.a().getWidth() + c;
        float f2 = a.b() - c;
        canvas.drawRect(a.b() - c, f4, f6, f5, b);
        float f3 = a.b() + a.a().getWidth() / 2;
        float f;
        float f1;
        if ((float)e > f4)
        {
            f1 = f5;
        } else
        {
            f1 = f4;
        }
        f = f3;
        if ((float)e > f4)
        {
            f = f3;
            if ((float)e < f5)
            {
                f = f6;
                if (f3 > (float)d)
                {
                    f = f2;
                }
            }
        }
        canvas.drawLine(f, f1, f, e, b);
        canvas.drawLine(f, e, d, e, b);
    }
}
