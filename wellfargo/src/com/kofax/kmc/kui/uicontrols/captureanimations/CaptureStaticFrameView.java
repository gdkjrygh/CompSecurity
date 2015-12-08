// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.kofax.kmc.kut.utilities.RectUtil;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            a

public class CaptureStaticFrameView extends View
{

    private static final int a = 5;
    private static final int b = 0;
    private final Rect c = new Rect();
    private final Paint d = new Paint(1);
    private android.graphics.Paint.Style e;
    private float f;
    private int g;
    private int h;
    private float i;
    private int j;
    private Point k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private final Rect v = new Rect();

    public CaptureStaticFrameView(Context context)
    {
        super(context);
        i = 0.0F;
        j = 5;
        l = -1;
        m = -1;
        n = true;
        setBorderStyle(android.graphics.Paint.Style.STROKE);
        setBorderThickness(6F);
        setBorderColor(Color.argb(120, 244, 251, 251));
        setCaptureIndicationColor(0xff00ff00);
    }

    static int a(CaptureStaticFrameView capturestaticframeview)
    {
        return capturestaticframeview.h;
    }

    private void a()
    {
        if (s <= 0 || t <= 0)
        {
            return;
        }
        Rect rect = new Rect(0, 0, s, t);
        int i1 = (int)Math.round((double)s / 2D);
        int j1 = (int)Math.round((double)t / 2D);
        double d1;
        Point point;
        int k1;
        if (k == null)
        {
            point = new Point(i1, j1);
        } else
        {
            point = k;
        }
        d1 = i;
        k1 = j;
        if (l < 0 && m < 0)
        {
            RectUtil.fit(rect, c, point, k1, d1);
        } else
        {
            o = i1 - l / 2;
            p = j1 - m / 2;
            q = o + l;
            r = p + m;
            c.set(o, p, q, r);
        }
        v.set(c.top, c.left, c.bottom, c.right);
        (new Handler(Looper.getMainLooper())).post(new _cls2());
    }

    static Paint b(CaptureStaticFrameView capturestaticframeview)
    {
        return capturestaticframeview.d;
    }

    static int c(CaptureStaticFrameView capturestaticframeview)
    {
        return capturestaticframeview.g;
    }

    public float getAspectRatio()
    {
        float f2 = 0.0F;
        float f1;
        if (i > 0.0F)
        {
            f1 = i;
        } else
        {
            f1 = f2;
            if (m > 0)
            {
                f1 = f2;
                if (l > 0)
                {
                    return ((float)l * 1.0F) / (float)m;
                }
            }
        }
        return f1;
    }

    public int getBorderColor()
    {
        return g;
    }

    public android.graphics.Paint.Style getBorderStyle()
    {
        return e;
    }

    public float getBorderThickness()
    {
        return f;
    }

    public int getCaptureIndicationColor()
    {
        return h;
    }

    public Rect getFrameBounds()
    {
        if (u)
        {
            return v;
        } else
        {
            return c;
        }
    }

    public int getFrameHeight()
    {
        if (m == -1)
        {
            return 0;
        } else
        {
            return m;
        }
    }

    public int getFrameWidth()
    {
        if (l == -1)
        {
            return 0;
        } else
        {
            return l;
        }
    }

    public int getPaddingPercent()
    {
        return j;
    }

    protected void onDraw(Canvas canvas)
    {
        if (n && c != null && f > 0.0F)
        {
            canvas.save();
            if (u)
            {
                canvas.translate(t, 0.0F);
                canvas.rotate(90F);
            }
            canvas.drawRect(c, d);
            canvas.restore();
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        s = i1;
        t = j1;
        if (s > t)
        {
            i1 = s;
            s = t;
            t = i1;
            u = true;
        } else
        {
            u = false;
        }
        a();
    }

    public void setAspectRatio(float f1)
    {
        i = f1;
        boolean flag;
        if (i != 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        a();
    }

    public void setBorderColor(int i1)
    {
        g = i1;
        d.setColor(g);
    }

    public void setBorderStyle(android.graphics.Paint.Style style)
    {
        e = style;
        d.setStyle(e);
    }

    public void setBorderThickness(float f1)
    {
        if (f1 <= 10F) goto _L2; else goto _L1
_L1:
        float f2 = 10F;
_L4:
        f = f2;
        d.setStrokeWidth(f);
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

    public void setCaptureExperienceData(a a1)
    {
        boolean flag = a1.n();
        (new Handler(Looper.getMainLooper())).post(new _cls1(flag));
    }

    public void setCaptureIndicationColor(int i1)
    {
        h = i1;
    }

    public void setCenter(Point point)
    {
        k = point;
    }

    public void setFrameHeight(int i1)
    {
        m = i1;
        boolean flag;
        if (m != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        a();
    }

    public void setFrameWidth(int i1)
    {
        l = i1;
        boolean flag;
        if (l != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        a();
    }

    public void setPaddingPercent(int i1)
    {
        j = i1;
        a();
    }

    private class _cls2
        implements Runnable
    {

        final CaptureStaticFrameView a;

        public void run()
        {
            a.invalidate();
        }

        _cls2()
        {
            a = CaptureStaticFrameView.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final boolean a;
        final CaptureStaticFrameView b;

        public void run()
        {
            if (a)
            {
                CaptureStaticFrameView.b(b).setColor(CaptureStaticFrameView.a(b));
            } else
            {
                CaptureStaticFrameView.b(b).setColor(CaptureStaticFrameView.c(b));
            }
            b.invalidate();
        }

        _cls1(boolean flag)
        {
            b = CaptureStaticFrameView.this;
            a = flag;
            super();
        }
    }

}
