// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.kui.uicontrols.PageDetectionEvent;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            a

class c extends View
{

    static volatile a a = new a();
    private Paint b;
    private int c;
    private int d;
    private BoundingTetragon e;
    private int f;
    private int g;
    private float h;
    private int i;
    private android.graphics.Paint.Style j;
    private boolean k;

    public c(Context context)
    {
        super(context);
        c = 0;
        d = 0;
        b = new Paint(1);
        a(-256);
        a(6F);
    }

    public float a()
    {
        return h;
    }

    public void a(float f1)
    {
        if (f1 <= 10F) goto _L2; else goto _L1
_L1:
        float f2 = 10F;
_L4:
        h = f2;
        b.setStrokeWidth(h);
        return;
_L2:
        f2 = f1;
        if (f1 > 0.0F)
        {
            f2 = f1;
            if (f1 < 3F)
            {
                f2 = 3F;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(int l)
    {
        i = l;
        b.setColor(i);
    }

    public void a(android.graphics.Paint.Style style)
    {
        j = style;
        b.setStyle(j);
    }

    void a(PageDetectionEvent pagedetectionevent)
    {
        e = pagedetectionevent.getBound();
        f = pagedetectionevent.getPreviewImage().getWidth();
        g = pagedetectionevent.getPreviewImage().getHeight();
    }

    public void a(a a1)
    {
        a = a1;
        (new Handler(Looper.getMainLooper())).post(new _cls1());
    }

    public int b()
    {
        return i;
    }

    void b(a a1)
    {
        a(a1.i());
        k = false;
    }

    public android.graphics.Paint.Style c()
    {
        return j;
    }

    void d()
    {
        e = null;
        k = true;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a.e())
        {
            b(a);
        } else
        if (!k)
        {
            d();
        }
        if (e == null || a() <= 0.0F)
        {
            return;
        } else
        {
            canvas.save();
            canvas.scale((float)getWidth() / (float)f, (float)getHeight() / (float)g);
            float f1 = e.getBottomLeft().x;
            float f2 = e.getBottomLeft().y;
            float f3 = e.getTopLeft().x;
            float f4 = e.getTopLeft().y;
            float f5 = e.getTopRight().x;
            float f6 = e.getTopRight().y;
            float f7 = e.getBottomRight().x;
            float f8 = e.getBottomRight().y;
            float f9 = h / 2.0F - 2.0F;
            b.setColor(i);
            Paint paint = b;
            canvas.drawLines(new float[] {
                f1, f2 + f9, f3, f4 - f9, f3 - f9, f4, f5 + f9, f6, f5, f6 - f9, 
                f7, f8 + f9, f7 + f9, f8, f1 - f9, f2
            }, paint);
            canvas.restore();
            return;
        }
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        d = l;
        c = i1;
        super.onLayout(flag, l, i1, j1, k1);
    }


    private class _cls1
        implements Runnable
    {

        final c a;

        public void run()
        {
            a.invalidate();
        }

        _cls1()
        {
            a = c.this;
            super();
        }
    }

}
