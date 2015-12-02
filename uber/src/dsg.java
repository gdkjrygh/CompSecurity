// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.View;

public final class dsg extends View
{

    private final int a;
    private final int b;
    private final float c;
    private final Paint d = new Paint(1);
    private final Paint e = new Paint(1);
    private final int f = getResources().getColor(0x7f0d004c);
    private final int g = getResources().getColor(0x7f0d0078);
    private final int h = getResources().getDimensionPixelSize(0x7f080137);
    private final int i = getResources().getDimensionPixelSize(0x7f080138);

    public dsg(Context context, int j, float f1, int k)
    {
        super(context);
        b = j;
        c = f1;
        a = k;
        d.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setStrokeWidth(i);
        e.setColor(g);
        setClickable(true);
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f1 = getWidth() / 2;
        float f2 = b;
        canvas.drawColor(f);
        if (a > 0)
        {
            canvas.drawLine(f1, f2, f1, c + f2 + (float)a, e);
            canvas.drawCircle(f1, c + f2 + (float)a + (float)h, h, e);
        }
        canvas.drawCircle(f1, f2, c, d);
    }
}
