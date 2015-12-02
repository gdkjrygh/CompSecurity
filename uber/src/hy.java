// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class hy extends Drawable
{

    private float a;
    private final Paint b = new Paint(5);
    private final RectF c = new RectF();
    private final Rect d = new Rect();
    private float e;
    private boolean f;
    private boolean g;

    public hy(int i, float f1)
    {
        f = false;
        g = true;
        a = f1;
        b.setColor(i);
    }

    private void a(Rect rect)
    {
        Rect rect1 = rect;
        if (rect == null)
        {
            rect1 = getBounds();
        }
        c.set(rect1.left, rect1.top, rect1.right, rect1.bottom);
        d.set(rect1);
        if (f)
        {
            float f1 = hz.a(e, a, g);
            float f2 = hz.b(e, a, g);
            d.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
            c.set(d);
        }
    }

    final float a()
    {
        return e;
    }

    final void a(float f1, boolean flag, boolean flag1)
    {
        if (f1 == e && f == flag && g == flag1)
        {
            return;
        } else
        {
            e = f1;
            f = flag;
            g = flag1;
            a(((Rect) (null)));
            invalidateSelf();
            return;
        }
    }

    public final void a(int i)
    {
        b.setColor(i);
        invalidateSelf();
    }

    final void b()
    {
        if (0.0F == a)
        {
            return;
        } else
        {
            a = 0.0F;
            a(((Rect) (null)));
            invalidateSelf();
            return;
        }
    }

    public final float c()
    {
        return a;
    }

    public final void draw(Canvas canvas)
    {
        canvas.drawRoundRect(c, a, a, b);
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void getOutline(Outline outline)
    {
        outline.setRoundRect(d, a);
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a(rect);
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
