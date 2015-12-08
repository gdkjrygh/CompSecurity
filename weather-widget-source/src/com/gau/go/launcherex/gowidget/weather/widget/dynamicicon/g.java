// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon:
//            f

public class g extends f
{

    private Bitmap b;
    private Paint c;
    private int d;
    private int e;
    private float f;
    private float g[];
    private float h;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private float m;

    public g(Context context)
    {
        super(context);
        c = null;
        d = 0;
        e = 0;
        f = 0.0F;
        g = new float[10];
        h = 0.0F;
        i = true;
        j = true;
        k = 1.0F;
        c = new Paint(1);
        c.setFilterBitmap(true);
        c.setAntiAlias(true);
    }

    private void a(int i1, int j1)
    {
        d = b.getWidth();
        e = b.getHeight();
        if (d > j1 || e > j1)
        {
            k = Math.min((float)i1 / (float)d, (float)j1 / (float)e);
            l = ((float)j1 - (float)e * k) / 2.0F;
            m = ((float)i1 - (float)d * k) / 2.0F;
        } else
        {
            k = 1.0F;
            m = (i1 - d) / 2;
            l = (j1 - e) / 2;
        }
        f = e / 10;
        for (i1 = 0; i1 < g.length; i1++)
        {
            g[i1] = f * (float)i1;
        }

    }

    private void c()
    {
        h = h + 2.0F;
        if (h > f)
        {
            h = f;
        }
    }

    private void d()
    {
        j = true;
        h = 0.0F;
    }

    public void a(Bitmap bitmap, boolean flag, int i1, int j1)
    {
        b = bitmap;
        if (b != null)
        {
            a(i1, j1);
        }
        d();
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j = flag1;
        i = flag;
    }

    public void a(Canvas canvas, View view)
    {
        if (b != null && !b.isRecycled())
        {
            if (i && !j)
            {
                c();
                for (int i1 = 0; i1 < g.length; i1++)
                {
                    canvas.save();
                    canvas.translate(m, l);
                    if (k != 1.0F)
                    {
                        canvas.scale(k, k);
                    }
                    canvas.clipRect(0.0F, g[i1], d, g[i1] + h);
                    canvas.drawBitmap(b, 0.0F, 0.0F, c);
                    canvas.restore();
                }

            } else
            {
                canvas.save();
                canvas.translate(m, l);
                if (k != 1.0F)
                {
                    canvas.scale(k, k);
                }
                canvas.drawBitmap(b, 0.0F, 0.0F, c);
                canvas.restore();
            }
        }
    }

    public void a(View view)
    {
        if (b != null)
        {
            a(view.getWidth(), view.getHeight());
        }
    }

    public boolean a()
    {
        boolean flag;
        if (h >= f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        return j;
    }

    public void b()
    {
        d();
    }
}
