// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;

public final class gel
    implements chc
{

    private final int a;
    private final int b;
    private final String c;

    public gel(Resources resources, int i)
    {
        a = resources.getDimensionPixelSize(0x7f0802a2);
        if (a == 0)
        {
            i = 0;
        } else
        {
            i = resources.getColor(i);
        }
        b = i;
        c = String.format("circle-%d-%d", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b)
        });
    }

    public final Bitmap a(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        float f;
        Bitmap bitmap1;
        Object obj;
        Canvas canvas;
        int k;
        if (i > j)
        {
            i = (i - j) / 2;
            k = 0;
        } else
        {
            k = (j - i) / 2;
            j = i;
            i = 0;
        }
        f = (float)j / 2.0F;
        bitmap1 = Bitmap.createBitmap(bitmap, i, k, j, j);
        if (bitmap != bitmap1)
        {
            bitmap.recycle();
        }
        obj = new BitmapShader(bitmap1, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        bitmap = new Paint(1);
        bitmap.setShader(((android.graphics.Shader) (obj)));
        obj = Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(((Bitmap) (obj)));
        canvas.drawCircle(f, f, f, bitmap);
        bitmap1.recycle();
        if (a > 0)
        {
            bitmap = new Paint(1);
            bitmap.setStyle(android.graphics.Paint.Style.STROKE);
            bitmap.setStrokeWidth(a);
            bitmap.setColor(b);
            canvas.drawCircle(f, f, f, bitmap);
        }
        return ((Bitmap) (obj));
    }

    public final String a()
    {
        return c;
    }
}
