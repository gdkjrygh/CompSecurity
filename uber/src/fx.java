// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

public final class fx
    implements ga
{

    public fx()
    {
    }

    private static float f(fy fy1)
    {
        return ((hy)(hy)fy1.getBackground()).a();
    }

    private static float g(fy fy1)
    {
        return ((hy)(hy)fy1.getBackground()).c();
    }

    private static void h(fy fy1)
    {
        if (!fy1.a())
        {
            fy1.a(0, 0, 0, 0);
            return;
        } else
        {
            float f1 = f(fy1);
            float f2 = g(fy1);
            int i = (int)Math.ceil(hz.b(f1, f2, fy1.f()));
            int j = (int)Math.ceil(hz.a(f1, f2, fy1.f()));
            fy1.a(i, j, i, j);
            return;
        }
    }

    public final void a()
    {
    }

    public final void a(fy fy1)
    {
        ((hy)(hy)fy1.getBackground()).b();
    }

    public final void a(fy fy1, float f1)
    {
        ((hy)(hy)fy1.getBackground()).a(f1, fy1.a(), fy1.f());
        h(fy1);
    }

    public final void a(fy fy1, int i)
    {
        ((hy)(hy)fy1.getBackground()).a(i);
    }

    public final void a(fy fy1, Context context, int i, float f1, float f2, float f3)
    {
        fy1.setBackgroundDrawable(new hy(i, f1));
        context = (View)fy1;
        context.setClipToOutline(true);
        context.setElevation(f2);
        a(fy1, f3);
    }

    public final float b(fy fy1)
    {
        return g(fy1) * 2.0F;
    }

    public final float c(fy fy1)
    {
        return g(fy1) * 2.0F;
    }

    public final void d(fy fy1)
    {
        ((View)fy1).setElevation(0.0F);
    }

    public final void e(fy fy1)
    {
        a(fy1, f(fy1));
    }
}
