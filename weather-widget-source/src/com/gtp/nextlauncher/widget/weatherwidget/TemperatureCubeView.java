// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.view.GLView;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            aa, ac

public class TemperatureCubeView extends GLView
{

    private float a;
    private aa b;
    private aa c;
    private float d;
    private float e;
    private String f;
    private boolean g;
    private int h;
    private int i;
    private float j;
    private float k;
    private float l;
    private float m;
    boolean mDrawingCacheEnabled;
    private float n;
    private boolean o;
    private int p;
    private final int q = 10;

    public TemperatureCubeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = "\260F";
        g = true;
        h = 1;
        i = 40;
        k = 20F;
        l = 0.0F;
        p = 0;
        mDrawingCacheEnabled = false;
        context = getResources().getDisplayMetrics();
        float f1 = k;
        k = ((DisplayMetrics) (context)).density * f1;
    }

    private int a(int i1, boolean flag)
    {
        switch (i1)
        {
        case 1: // '\001'
        default:
            return 0x7f020382;

        case 2: // '\002'
            return !flag ? 0x7f02036a : 0x7f02037b;

        case 3: // '\003'
            return !flag ? 0x7f020358 : 0x7f020357;

        case 4: // '\004'
            return 0x7f020376;

        case 5: // '\005'
            return 0x7f02037a;

        case 6: // '\006'
            return 0x7f02035e;

        case 7: // '\007'
            return 0x7f020379;

        case 8: // '\b'
            return 0x7f02037c;
        }
    }

    private void a(int i1, int j1)
    {
        if (i1 > 0 && j1 > 0 && c == null)
        {
            BitmapDrawable bitmapdrawable = (BitmapDrawable)getResources().getDrawable(0x7f02037b);
            int k1 = bitmapdrawable.getIntrinsicWidth() / 2;
            int l1 = bitmapdrawable.getIntrinsicHeight() / 2;
            float f1 = Math.min((float)i1 - 5F, (float)k1 * 0.65F);
            float f2 = j1 - l1;
            c = new aa(this, f1, f2, k, k1, l1, false, 0.0F, l);
            c.a(0x7f020369);
            b = new aa(this, f1, f2, k, k1, l1, true, l, 2.0F * l);
            b.a(0x7f020360);
            i = (int)((double)f1 * 0.80000000000000004D);
            j = (float)i / f2;
            j = Math.min(0.5F, j);
        }
    }

    private void b(int i1, int j1)
    {
label0:
        {
            if (i1 > 0 && j1 > 0)
            {
                if (c != null)
                {
                    break label0;
                }
                BitmapDrawable bitmapdrawable = (BitmapDrawable)getResources().getDrawable(0x7f02037b);
                int k1 = bitmapdrawable.getIntrinsicWidth() / 2;
                int i2 = bitmapdrawable.getIntrinsicHeight() / 2;
                float f1 = Math.min((float)i1 - 5F, (float)k1 * 0.65F);
                float f3 = j1 - i2;
                c = new aa(this, f1, f3, k, k1, i2, false, 0.0F, l);
                c.a(0x7f020369);
                b = new aa(this, f1, f3, k, k1, i2, true, l, 2.0F * l);
                b.a(0x7f020360);
                i = (int)((double)f1 * 0.80000000000000004D);
                j = (float)i / f3;
                j = Math.min(0.5F, j);
            }
            return;
        }
        BitmapDrawable bitmapdrawable1 = (BitmapDrawable)getResources().getDrawable(0x7f02037b);
        int l1 = bitmapdrawable1.getIntrinsicWidth() / 2;
        int j2 = bitmapdrawable1.getIntrinsicHeight() / 2;
        float f2 = Math.min((float)i1 - 5F, (float)l1 * 0.65F);
        float f4 = j1 - j2;
        c.a(f2, f4, k, l1, j2);
        b.a(f2, f4, k, l1, j2);
        i = (int)((double)f2 * 0.80000000000000004D);
        j = (float)i / f4;
        j = Math.min(0.5F, j);
        c.a((new StringBuilder()).append((int)e).append(f).toString(), false);
        b.a((new StringBuilder()).append((int)d).append(f).toString(), true);
        float f5 = Math.max((d - n) / (m - n), 2.0F * j);
        f4 = Math.min((e - n) / (m - n), f5 - j);
        f2 = f4;
        if (f4 < j)
        {
            f2 = j;
        }
        c.a(f2);
        b.a(f5);
    }

    public void cleanup()
    {
        if (b != null)
        {
            b.e();
        }
        if (c != null)
        {
            c.e();
        }
        super.cleanup();
    }

    public boolean isNoData()
    {
        return o;
    }

    protected void onDraw(GLCanvas glcanvas)
    {
        if (c == null)
        {
            return;
        } else
        {
            glcanvas.save();
            glcanvas.translate(getWidth() / 2, -getHeight(), -k);
            glcanvas.rotateAxisAngle(a, 0.0F, 1.0F, 0.0F);
            b.a(glcanvas);
            glcanvas.translate(0.0F, 0.0F, k);
            c.a(glcanvas);
            super.onDraw(glcanvas);
            glcanvas.restore();
            return;
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        b(i1, j1);
    }

    public void resetCubes()
    {
        if (b != null)
        {
            b.a();
        }
        if (c != null)
        {
            c.a();
        }
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        mDrawingCacheEnabled = flag;
    }

    public void setHighTemperature(float f1)
    {
        d = f1;
        if (b != null)
        {
            b.a((new StringBuilder()).append((int)d).append(f).toString(), true);
        }
    }

    public void setLowTemperature(float f1)
    {
        e = f1;
        if (c != null)
        {
            c.a((new StringBuilder()).append((int)e).append(f).toString(), false);
        }
    }

    public void setNoData(boolean flag)
    {
        o = flag;
    }

    public void setTemperatureUnit(int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            f = "\260C";
            return;

        case 2: // '\002'
            f = "\260F";
            break;
        }
    }

    public void setWeatherType(int i1, boolean flag)
    {
        if (h != i1 || g != flag)
        {
            h = i1;
            g = flag;
            if (b != null)
            {
                b.b(a(h, g));
            }
        }
    }

    public void startAnimating(float f1, float f2, boolean flag)
    {
        if (c == null)
        {
            a(getWidth(), getHeight());
        }
        if (c == null)
        {
            if (p < 10)
            {
                postDelayed(new ac(this, f1, f2, flag), 10L);
            }
            p = p + 1;
            return;
        }
        c.a((new StringBuilder()).append((int)e).append(f).toString(), false);
        b.a((new StringBuilder()).append((int)d).append(f).toString(), true);
        b.b(a(h, g));
        m = f1;
        n = f2 - 5F;
        float f3 = Math.max((d - n) / (m - n), 2.0F * j);
        f2 = Math.min((e - n) / (m - n), f3 - j);
        f1 = f2;
        if (f2 < j)
        {
            f1 = j;
        }
        if (flag)
        {
            b.a(0.0F, f3, flag);
            c.a(0.0F, f1, flag);
        } else
        {
            b.a(f3, flag);
            c.a(f1, flag);
        }
        b.d();
    }

    public void updateAngleByAccelerometer(float f1)
    {
        a = -f1 * 10F * 0.5625F;
        invalidate();
    }

    public void updateLastWeatherMark()
    {
        if (b != null)
        {
            b.c(a(h, g));
            b.d();
        }
    }
}
