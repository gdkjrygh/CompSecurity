// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            s

public class PageDetectRenderer extends View
{

    private final Handler a;
    private final Paint b;
    private final a c;
    private long d;
    private BoundingTetragon e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public PageDetectRenderer(Context context)
    {
        this(context, null, 0);
    }

    public PageDetectRenderer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PageDetectRenderer(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, null);
    }

    public PageDetectRenderer(Context context, AttributeSet attributeset, int i1, Bus bus)
    {
        super(context, attributeset, i1);
        c = new a(null);
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = 0;
        k = 0;
        l = 0;
        m = 0;
        if (!isInEditMode())
        {
            attributeset = bus;
            if (bus == null)
            {
                attributeset = s.a(context);
            }
            attributeset.register(c);
            b = new Paint();
            b.setStrokeWidth(2.0F);
            b.setColor(0xff00ff00);
            b.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.XOR));
            a = new Handler(context.getMainLooper());
            a.post(new _cls1());
            setWillNotDraw(false);
            return;
        } else
        {
            a = null;
            b = null;
            return;
        }
    }

    static int a(PageDetectRenderer pagedetectrenderer, int i1)
    {
        pagedetectrenderer.f = i1;
        return i1;
    }

    static long a(PageDetectRenderer pagedetectrenderer, long l1)
    {
        pagedetectrenderer.d = l1;
        return l1;
    }

    static Handler a(PageDetectRenderer pagedetectrenderer)
    {
        return pagedetectrenderer.a;
    }

    static BoundingTetragon a(PageDetectRenderer pagedetectrenderer, BoundingTetragon boundingtetragon)
    {
        pagedetectrenderer.e = boundingtetragon;
        return boundingtetragon;
    }

    static int b(PageDetectRenderer pagedetectrenderer, int i1)
    {
        pagedetectrenderer.g = i1;
        return i1;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        bringToFront();
        long l1 = System.currentTimeMillis();
        if (l1 - d <= 1000L)
        {
            l1 -= d;
            float f1 = 1.0F;
            if (l1 > 200L)
            {
                f1 = (float)(1000L - l1) / 1000F;
            }
            if (f1 > 0.0F && e != null)
            {
                b.setColor(Color.argb((int)(f1 * 255F), 0, 255, 0));
                canvas.save();
                canvas.scale((float)l / (float)f, (float)m / (float)g);
                f1 = e.getBottomLeft().x;
                float f2 = e.getBottomLeft().y;
                float f3 = e.getTopLeft().x;
                float f4 = e.getTopLeft().y;
                float f5 = e.getTopRight().x;
                float f6 = e.getTopRight().y;
                float f7 = e.getBottomRight().x;
                float f8 = e.getBottomRight().y;
                canvas.drawLine(f1, f2, f3, f4, b);
                canvas.drawLine(f3, f4, f5, f6, b);
                canvas.drawLine(f5, f6, f7, f8, b);
                canvas.drawLine(f7, f8, f1, f2, b);
                canvas.restore();
                return;
            }
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        h = j1;
        i = i1;
        j = k1;
        k = l1;
        l = Math.abs(j - i);
        m = Math.abs(k - h);
    }

    private class a
    {

        final PageDetectRenderer a;

        public void a(BusEvents.PageDetectionBusEvent pagedetectionbusevent)
        {
            PageDetectRenderer.a(a, pagedetectionbusevent.bound);
            PageDetectRenderer.a(a, pagedetectionbusevent.image.getWidth());
            PageDetectRenderer.b(a, pagedetectionbusevent.image.getHeight());
            PageDetectRenderer.a(a, System.currentTimeMillis());
            class _cls1
                implements Runnable
            {

                final a a;

                public void run()
                {
                    a.a.invalidate();
                }

                _cls1()
                {
                    a = a.this;
                    super();
                }
            }

            PageDetectRenderer.a(a).post(new _cls1());
        }

        private a()
        {
            a = PageDetectRenderer.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements Runnable
    {

        final PageDetectRenderer a;

        public void run()
        {
            a.invalidate();
            PageDetectRenderer.a(a).postDelayed(this, 100L);
        }

        _cls1()
        {
            a = PageDetectRenderer.this;
            super();
        }
    }

}
