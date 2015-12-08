// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            s

public class LevelRenderer extends View
{

    public float _levelIndicatorSize;
    private final Paint a;
    private final RectF b;
    private Handler c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private final a t;
    private Runnable u;

    public LevelRenderer(Context context)
    {
        this(context, null, 0, null);
    }

    public LevelRenderer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0, null);
    }

    public LevelRenderer(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, null);
    }

    public LevelRenderer(Context context, AttributeSet attributeset, int i1, Bus bus)
    {
        super(context, attributeset, i1);
        d = true;
        t = new a(null);
        u = new _cls1();
        if (!isInEditMode())
        {
            c = new Handler(Looper.getMainLooper());
            a = new Paint();
            a.setStrokeWidth(5F);
            a.setStyle(android.graphics.Paint.Style.STROKE);
            b = new RectF();
            attributeset = bus;
            if (bus == null)
            {
                attributeset = com.kofax.kmc.kui.uicontrols.s.a(context);
            }
            attributeset.register(t);
            setWillNotDraw(false);
            return;
        } else
        {
            a = null;
            b = null;
            return;
        }
    }

    static float a(LevelRenderer levelrenderer, float f1)
    {
        levelrenderer.r = f1;
        return f1;
    }

    private int a()
    {
        int i1 = i;
        if (l)
        {
            i1 = j;
            if (m)
            {
                i1 = h;
                if (k)
                {
                    i1 = g;
                }
            }
        }
        return i1;
    }

    static int a(LevelRenderer levelrenderer, int i1)
    {
        levelrenderer.h = i1;
        return i1;
    }

    static Runnable a(LevelRenderer levelrenderer)
    {
        return levelrenderer.u;
    }

    static boolean a(LevelRenderer levelrenderer, boolean flag)
    {
        levelrenderer.k = flag;
        return flag;
    }

    static float b(LevelRenderer levelrenderer, float f1)
    {
        levelrenderer.s = f1;
        return f1;
    }

    static int b(LevelRenderer levelrenderer, int i1)
    {
        levelrenderer.g = i1;
        return i1;
    }

    static Handler b(LevelRenderer levelrenderer)
    {
        return levelrenderer.c;
    }

    static boolean b(LevelRenderer levelrenderer, boolean flag)
    {
        levelrenderer.l = flag;
        return flag;
    }

    static float c(LevelRenderer levelrenderer, float f1)
    {
        levelrenderer.p = f1;
        return f1;
    }

    static int c(LevelRenderer levelrenderer, int i1)
    {
        levelrenderer.i = i1;
        return i1;
    }

    static boolean c(LevelRenderer levelrenderer, boolean flag)
    {
        levelrenderer.m = flag;
        return flag;
    }

    static float d(LevelRenderer levelrenderer, float f1)
    {
        levelrenderer.q = f1;
        return f1;
    }

    static int d(LevelRenderer levelrenderer, int i1)
    {
        levelrenderer.j = i1;
        return i1;
    }

    public void draw(Canvas canvas)
    {
        int i1 = a();
        if (i1 == 0)
        {
            return;
        }
        a.setColor(i1);
        if (_levelIndicatorSize == 0.0F)
        {
            _levelIndicatorSize = (float)Math.min(getWidth(), getHeight()) / 20F;
        }
        o = _levelIndicatorSize;
        n = o * 2.0F;
        float f1 = f;
        float f2 = o;
        float f3 = f;
        float f4 = o;
        float f5 = e;
        float f6 = o;
        float f7 = e;
        float f8 = o;
        canvas.drawLine(e, f1 - f2, e, f3 + f4, a);
        canvas.drawLine(f5 - f6, f, f7 + f8, f, a);
        float f9;
        float f10;
        float f11;
        boolean flag;
        boolean flag1;
        if ((double)Math.abs(p) >= 0.78539816339744828D - 0.001D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((double)Math.abs(q) >= 0.78539816339744828D - 0.001D)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = r;
        }
        if (flag1)
        {
            f2 = 0.0F;
        } else
        {
            f2 = s;
        }
        if (flag && !flag1)
        {
            f3 = q;
        } else
        {
            f3 = p;
        }
        if (flag1 && !flag)
        {
            f4 = p;
        } else
        {
            f4 = q;
        }
        f8 = (float)Math.sin(f1);
        f7 = (float)Math.sin(f2);
        f9 = (float)Math.sin(f3);
        f4 = (float)Math.sin(f4);
        f10 = Math.min(e, f);
        f5 = (n + 2.0F * (f10 - o) * f4) / 2.0F;
        f6 = (n + 2.0F * (f10 - o) * f9) / 2.0F;
        f11 = o;
        f1 = 0.0F - (f10 - o) * f8;
        if (f8 >= 0.0F)
        {
            f2 = 1.0F;
        } else
        {
            f2 = -1F;
        }
        if (f7 >= 0.0F)
        {
            f3 = 1.0F;
        } else
        {
            f3 = -1F;
        }
        if (Math.abs(f8) > f9)
        {
            f1 = 0.0F - (f10 - o) * f9;
            f1 = f1 * f2 - (f8 - f2 * f9) * ((float)f - (f6 - o) - f1);
        }
        if (Math.abs(f7) > f4)
        {
            f2 = 0.0F - (f10 - o) * f4;
            f2 = f2 * f3 - (f7 - f3 * f4) * ((float)e - (f5 - o) - f2);
        } else
        {
            f2 = 0.0F - (f10 - f11) * f7;
        }
        f4 = f2;
        f3 = f1;
        if (d)
        {
            f4 = 0.0F - f2;
            f3 = 0.0F - f1;
        }
        f1 = f4 + (float)e;
        f2 = f3 + (float)f;
        b.set(f1 - f5, f2 - f6, f1 + f5, f2 + f6);
        canvas.drawOval(b, a);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        e = (k1 - i1) / 2;
        f = (l1 - j1) / 2;
    }

    private class a
    {

        final LevelRenderer a;

        public void a(BusEvents.FocusChangedEvent focuschangedevent)
        {
            LevelRenderer.a(a, focuschangedevent.focused);
            LevelRenderer.b(a).post(LevelRenderer.a(a));
        }

        public void a(BusEvents.IndicatorColorFocusingChangedEvent indicatorcolorfocusingchangedevent)
        {
            LevelRenderer.a(a, indicatorcolorfocusingchangedevent.color);
            LevelRenderer.b(a).post(LevelRenderer.a(a));
        }

        public void a(BusEvents.IndicatorColorGoodChangedEvent indicatorcolorgoodchangedevent)
        {
            LevelRenderer.b(a, indicatorcolorgoodchangedevent.color);
            LevelRenderer.b(a).post(LevelRenderer.a(a));
        }

        public void a(BusEvents.IndicatorColorNotLevelChangedEvent indicatorcolornotlevelchangedevent)
        {
            LevelRenderer.c(a, indicatorcolornotlevelchangedevent.color);
            LevelRenderer.b(a).post(LevelRenderer.a(a));
        }

        public void a(BusEvents.IndicatorColorNotStableChangedEvent indicatorcolornotstablechangedevent)
        {
            LevelRenderer.d(a, indicatorcolornotstablechangedevent.color);
            LevelRenderer.b(a).post(LevelRenderer.a(a));
        }

        public void a(BusEvents.LevelChangedEvent levelchangedevent)
        {
            LevelRenderer.b(a, levelchangedevent.level);
            LevelRenderer.a(a, (float)Math.toRadians(levelchangedevent.pitch));
            LevelRenderer.b(a, (float)Math.toRadians(levelchangedevent.roll));
            LevelRenderer.b(a).post(LevelRenderer.a(a));
        }

        public void a(BusEvents.PitchThresholdChangedEvent pitchthresholdchangedevent)
        {
            LevelRenderer.c(a, (float)Math.toRadians(pitchthresholdchangedevent.threshold));
            LevelRenderer.b(a).post(LevelRenderer.a(a));
        }

        public void a(BusEvents.RollThresholdChangedEvent rollthresholdchangedevent)
        {
            LevelRenderer.d(a, (float)Math.toRadians(rollthresholdchangedevent.threshold));
            LevelRenderer.b(a).post(LevelRenderer.a(a));
        }

        public void a(BusEvents.StabilityChangedEvent stabilitychangedevent)
        {
            LevelRenderer.c(a, stabilitychangedevent.stable);
            LevelRenderer.b(a).post(LevelRenderer.a(a));
        }

        private a()
        {
            a = LevelRenderer.this;
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

        final LevelRenderer a;

        public void run()
        {
            a.invalidate();
        }

        _cls1()
        {
            a = LevelRenderer.this;
            super();
        }
    }

}
