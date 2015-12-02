// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class fz
    implements ga
{

    final RectF a = new RectF();

    public fz()
    {
    }

    private static hz a(Context context, int i, float f1, float f2, float f3)
    {
        return new hz(context.getResources(), i, f1, f2, f3);
    }

    private void f(fy fy1)
    {
        Rect rect = new Rect();
        g(fy1).a(rect);
        ((View)fy1).setMinimumHeight((int)Math.ceil(c(fy1)));
        ((View)fy1).setMinimumWidth((int)Math.ceil(b(fy1)));
        fy1.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    private static hz g(fy fy1)
    {
        return (hz)fy1.getBackground();
    }

    public void a()
    {
        hz.c = new ia() {

            final fz a;

            public final void a(Canvas canvas, RectF rectf, float f1, Paint paint)
            {
                float f3 = 2.0F * f1;
                float f4 = rectf.width() - f3 - 1.0F;
                float f5 = rectf.height();
                float f2 = f1;
                if (f1 >= 1.0F)
                {
                    f2 = f1 + 0.5F;
                    a.a.set(-f2, -f2, f2, f2);
                    int i = canvas.save();
                    canvas.translate(rectf.left + f2, rectf.top + f2);
                    canvas.drawArc(a.a, 180F, 90F, true, paint);
                    canvas.translate(f4, 0.0F);
                    canvas.rotate(90F);
                    canvas.drawArc(a.a, 180F, 90F, true, paint);
                    canvas.translate(f5 - f3 - 1.0F, 0.0F);
                    canvas.rotate(90F);
                    canvas.drawArc(a.a, 180F, 90F, true, paint);
                    canvas.translate(f4, 0.0F);
                    canvas.rotate(90F);
                    canvas.drawArc(a.a, 180F, 90F, true, paint);
                    canvas.restoreToCount(i);
                    canvas.drawRect((rectf.left + f2) - 1.0F, rectf.top, (rectf.right - f2) + 1.0F, rectf.top + f2, paint);
                    canvas.drawRect((rectf.left + f2) - 1.0F, (rectf.bottom - f2) + 1.0F, (rectf.right - f2) + 1.0F, rectf.bottom, paint);
                }
                f1 = rectf.left;
                f3 = rectf.top;
                canvas.drawRect(f1, Math.max(0.0F, f2 - 1.0F) + f3, rectf.right, (rectf.bottom - f2) + 1.0F, paint);
            }

            
            {
                a = fz.this;
                super();
            }
        };
    }

    public final void a(fy fy1)
    {
        g(fy1).a();
        f(fy1);
    }

    public final void a(fy fy1, float f1)
    {
        g(fy1).a(f1);
        f(fy1);
    }

    public final void a(fy fy1, int i)
    {
        g(fy1).a(i);
    }

    public final void a(fy fy1, Context context, int i, float f1, float f2, float f3)
    {
        context = a(context, i, f1, f2, f3);
        context.a(fy1.f());
        fy1.setBackgroundDrawable(context);
        f(fy1);
    }

    public final float b(fy fy1)
    {
        return g(fy1).c();
    }

    public final float c(fy fy1)
    {
        return g(fy1).d();
    }

    public final void d(fy fy1)
    {
        g(fy1).b();
    }

    public final void e(fy fy1)
    {
    }
}
