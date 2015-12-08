// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview;

import android.graphics.Matrix;
import android.view.animation.Interpolator;

// Referenced classes of package uk.co.senab.photoview:
//            b, a

class e
    implements Runnable
{

    final b a;
    private final float b;
    private final float c;
    private final long d = System.currentTimeMillis();
    private final float e;
    private final float f;

    public e(b b1, float f1, float f2, float f3, float f4)
    {
        a = b1;
        super();
        b = f3;
        c = f4;
        e = f1;
        f = f2;
    }

    private float a()
    {
        float f1 = Math.min(1.0F, ((float)(System.currentTimeMillis() - d) * 1.0F) / 200F);
        return b.a.getInterpolation(f1);
    }

    public void run()
    {
        android.widget.ImageView imageview = a.c();
        if (imageview != null)
        {
            float f1 = a();
            float f2 = (e + (f - e) * f1) / a.d();
            uk.co.senab.photoview.b.b(a).postScale(f2, f2, b, c);
            uk.co.senab.photoview.b.c(a);
            if (f1 < 1.0F)
            {
                uk.co.senab.photoview.a.a(imageview, this);
                return;
            }
        }
    }
}
