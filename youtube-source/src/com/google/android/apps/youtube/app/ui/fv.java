// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.f;
import com.google.android.youtube.g;
import com.google.android.youtube.k;
import java.util.Collections;
import java.util.List;

public final class fv
{

    private final int a;
    private final int b;
    private final int c;
    private final float d;
    private final int e;
    private final int f;
    private final int g[];
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final Bitmap p;
    private final Bitmap q;

    private fv(int i1, int j1, int k1, int l1, int ai[], int i2, int j2, 
            int k2, int l2, int i3, int j3, int k3, int l3, int i4, 
            int j4)
    {
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "stackSize must be > 0");
        if (j1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "width must be > 0");
        if (k1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "height must be > 0");
        if (l1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "scale must be > 0");
        if (ai.length >= i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "rotationAngles count must be greater or equal than stackSize");
        if (l2 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "outerBorder must be > 0");
        if (j3 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "innerBorder must be > 0");
        if (l3 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "defaultBitmapWidth must be > 0");
        if (i4 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "defaultBitmapHeight must be > 0");
        a = i1;
        b = j1;
        c = k1;
        d = (float)l1 / 100F;
        g = ai;
        h = i2;
        e = j2;
        f = k2;
        i = l2;
        j = i3;
        k = j3;
        l = k3;
        m = l3;
        n = i4;
        o = j4;
        ai = Bitmap.createBitmap(m, n, android.graphics.Bitmap.Config.ARGB_8888);
        (new Canvas(ai)).drawColor(o);
        p = ai;
        q = a(Collections.emptyList());
    }

    private fv(Resources resources)
    {
        this(resources.getInteger(k.r), resources.getDimensionPixelSize(g.Z), resources.getDimensionPixelSize(g.T), resources.getInteger(k.q), resources.getIntArray(com.google.android.youtube.c.a), resources.getDimensionPixelSize(g.W), resources.getDimensionPixelSize(g.X), resources.getDimensionPixelSize(g.Y), resources.getDimensionPixelSize(g.V), resources.getColor(f.l), resources.getDimensionPixelSize(g.U), resources.getColor(f.k), resources.getDimensionPixelSize(g.S), resources.getDimensionPixelSize(g.R), resources.getColor(f.j));
    }

    public static Bitmap a(Resources resources)
    {
        return (new fv(resources)).q;
    }

    private Bitmap a(List list)
    {
        if (list.isEmpty() && q != null)
        {
            return q;
        }
        Bitmap bitmap = Bitmap.createBitmap(b, c, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        if (list.isEmpty())
        {
            a(p, m, n, 0, canvas);
        } else
        {
            int i1 = Math.min(a, list.size()) - 1;
            while (i1 >= 0) 
            {
                Bitmap bitmap1 = (Bitmap)list.get(i1);
                a(bitmap1, bitmap1.getWidth(), bitmap1.getHeight(), i1, canvas);
                i1--;
            }
        }
        return bitmap;
    }

    private void a(Bitmap bitmap, int i1, int j1, int k1, Canvas canvas)
    {
        canvas.save();
        float f1 = d * (float)h;
        int l1 = (int)(d * (float)(i + k));
        Object obj = new Matrix();
        ((Matrix) (obj)).postTranslate(-i1 / 2, -j1 / 2);
        ((Matrix) (obj)).postScale(((float)m / (float)i1) * d, ((float)n / (float)j1) * d);
        ((Matrix) (obj)).postRotate(g[k1]);
        ((Matrix) (obj)).postTranslate((float)(b / 2) + (float)(k1 * 2) * f1, (float)(c / 2) - f1 * (float)(k1 * 2));
        ((Matrix) (obj)).postTranslate((float)(-b / 2) + (d * (float)m) / 2.0F + (float)(l1 / 2) + (float)e, (float)(c / 2) - (d * (float)n) / 2.0F - (float)(l1 / 2) - (float)f);
        canvas.setMatrix(((Matrix) (obj)));
        obj = new Paint();
        ((Paint) (obj)).setAntiAlias(true);
        ((Paint) (obj)).setStyle(android.graphics.Paint.Style.STROKE);
        ((Paint) (obj)).setStrokeWidth(i);
        ((Paint) (obj)).setColor(j);
        canvas.drawRect(0.0F, 0.0F, i1, j1, ((Paint) (obj)));
        ((Paint) (obj)).setStrokeWidth(k);
        ((Paint) (obj)).setColor(l);
        canvas.drawRect(0.0F, 0.0F, i1, j1, ((Paint) (obj)));
        ((Paint) (obj)).setFilterBitmap(true);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, ((Paint) (obj)));
        canvas.restore();
    }
}
