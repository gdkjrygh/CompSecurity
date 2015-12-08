// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import uk.co.senab.photoview.b.d;

// Referenced classes of package uk.co.senab.photoview:
//            b, a

class f
    implements Runnable
{

    final b a;
    private final d b;
    private int c;
    private int d;

    public f(b b1, Context context)
    {
        a = b1;
        super();
        b = uk.co.senab.photoview.b.d.a(context);
    }

    public void a()
    {
        b.a(true);
    }

    public void a(int i, int j, int k, int l)
    {
        RectF rectf = a.b();
        if (rectf != null)
        {
            int i1 = Math.round(-rectf.left);
            int j1;
            int k1;
            int l1;
            if ((float)i < rectf.width())
            {
                j1 = Math.round(rectf.width() - (float)i);
                i = 0;
            } else
            {
                j1 = i1;
                i = i1;
            }
            k1 = Math.round(-rectf.top);
            if ((float)j < rectf.height())
            {
                l1 = Math.round(rectf.height() - (float)j);
                j = 0;
            } else
            {
                l1 = k1;
                j = k1;
            }
            c = i1;
            d = k1;
            if (i1 != j1 || k1 != l1)
            {
                b.a(i1, k1, k, l, i, j1, j, l1, 0, 0);
                return;
            }
        }
    }

    public void run()
    {
        android.widget.ImageView imageview;
        if (!b.b())
        {
            if ((imageview = a.c()) != null && b.a())
            {
                int i = b.c();
                int j = b.d();
                uk.co.senab.photoview.b.b(a).postTranslate(c - i, d - j);
                uk.co.senab.photoview.b.a(a, a.g());
                c = i;
                d = j;
                uk.co.senab.photoview.a.a(imageview, this);
                return;
            }
        }
    }
}
