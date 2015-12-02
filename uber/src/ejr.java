// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public final class ejr
    implements chc
{

    private final int a;

    public ejr(int i)
    {
        a = i;
    }

    public final Bitmap a(Bitmap bitmap)
    {
        Paint paint = new Paint(1);
        paint.setShader(new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        Bitmap bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawRoundRect(new RectF(0.0F, 0.0F, i, j), a, a, paint);
        canvas.drawRect(new RectF(0.0F, j - a, i, j), paint);
        bitmap.recycle();
        return bitmap1;
    }

    public final String a()
    {
        return (new StringBuilder("round-top-corners-")).append(a).toString();
    }
}
