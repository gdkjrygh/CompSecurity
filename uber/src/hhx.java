// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class hhx extends Drawable
{

    private final float a;
    private final RectF b = new RectF();
    private final BitmapShader c;
    private final Paint d = new Paint();

    public hhx(Bitmap bitmap, float f)
    {
        a = f;
        c = new BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
        d.setAntiAlias(true);
        d.setShader(c);
    }

    public final void draw(Canvas canvas)
    {
        canvas.drawRoundRect(b, a, a, d);
    }

    public final int getOpacity()
    {
        return -3;
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        b.set(0.0F, 0.0F, rect.width(), (float)rect.height() + a);
    }

    public final void setAlpha(int i)
    {
        d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
    }
}
