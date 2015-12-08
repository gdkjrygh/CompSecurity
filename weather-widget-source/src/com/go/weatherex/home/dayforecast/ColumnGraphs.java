// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.dayforecast;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.a.a;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.dayforecast:
//            b, c

public class ColumnGraphs extends View
{

    private Context a;
    private SparseArray b;
    private f c;
    private e d;
    private g e;
    private NinePatch f;
    private NinePatch g;
    private float h;
    private RectF i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private Paint r;
    private float s;
    private float t;
    private com.go.weatherex.home.dayforecast.c u;
    private float v;

    public ColumnGraphs(Context context)
    {
        super(context);
        v = 1.0F;
        a(context);
    }

    public ColumnGraphs(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        v = 1.0F;
        a(context);
    }

    public ColumnGraphs(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        v = 1.0F;
        a(context);
    }

    private void a(Context context)
    {
        a = context;
        b = new SparseArray();
        Object obj = BitmapFactory.decodeResource(a.getResources(), 0x7f020215);
        Bitmap bitmap = BitmapFactory.decodeResource(a.getResources(), 0x7f020216);
        h = (float)Math.max(((Bitmap) (obj)).getHeight(), bitmap.getHeight()) / 2.0F + 1.0F;
        f = new NinePatch(((Bitmap) (obj)), ((Bitmap) (obj)).getNinePatchChunk(), null);
        g = new NinePatch(bitmap, bitmap.getNinePatchChunk(), null);
        i = new RectF();
        obj = com.gau.go.launcherex.gowidget.weather.c.c.a(context);
        c = ((c) (obj)).h();
        d = ((c) (obj)).f();
        e = ((c) (obj)).g();
        obj = (a)a;
        r = new Paint(1);
        r.setTextAlign(android.graphics.Paint.Align.CENTER);
        r.setTextSize(context.getResources().getDimension(0x7f0c0142));
        r.setColor(-1);
        r.setTypeface(((a) (obj)).a(a, 4, 0));
    }

    static boolean a(ColumnGraphs columngraphs)
    {
        return columngraphs.j;
    }

    static SparseArray b(ColumnGraphs columngraphs)
    {
        return columngraphs.b;
    }

    static float c(ColumnGraphs columngraphs)
    {
        return columngraphs.v;
    }

    public void a()
    {
        if (f != null)
        {
            f = null;
        }
        if (g != null)
        {
            g = null;
        }
        b.clear();
    }

    public void a(String s1, ArrayList arraylist, boolean flag)
    {
        if (arraylist != null && arraylist.size() > 0)
        {
            j = true;
            int i2 = arraylist.size();
            if (b.size() > i2)
            {
                b.clear();
            }
            float f3 = -10000F;
            float f1 = 10000F;
            boolean flag1 = false;
            s1 = c.a(s1);
            float f5;
            android.text.format.Time time;
            int i1;
            int k1;
            if (s1 != null)
            {
                i1 = ((WeatherBean) (s1)).l.n();
            } else
            {
                i1 = 0;
            }
            time = e.c(i1);
            f5 = 0.0F;
            k1 = 0;
            i1 = ((flag1) ? 1 : 0);
            while (k1 < i2) 
            {
                ForecastBean forecastbean = (ForecastBean)arraylist.get(k1);
                float f7;
                if (forecastbean == null)
                {
                    float f6 = f5;
                    f5 = f3;
                    f3 = f1;
                    f1 = f6;
                } else
                {
                    b b1 = (b)b.get(k1);
                    s1 = b1;
                    if (b1 == null)
                    {
                        s1 = new b(this, null);
                        b.put(k1, s1);
                    }
                    int l1 = d.a().g;
                    s1.a(Math.round(forecastbean.b(l1)), Math.round(forecastbean.a(l1)));
                    s1.e(0.0F);
                    s1.a(1.0F);
                    s1.c(false);
                    float f8 = f5 + s1.c();
                    f5 = f3;
                    if (f3 < s1.b())
                    {
                        f5 = s1.b();
                    }
                    f3 = f1;
                    if (f1 > s1.a())
                    {
                        f3 = s1.a();
                    }
                    if (i1 == 0 && com.gau.go.launcherex.gowidget.weather.util.r.a(forecastbean.e(), forecastbean.f(), forecastbean.g(), time))
                    {
                        s1.a(true);
                        i1 = 1;
                        f1 = f8;
                    } else
                    {
                        s1.a(false);
                        f1 = f8;
                    }
                }
                k1++;
                f7 = f3;
                f3 = f5;
                f5 = f1;
                f1 = f7;
            }
            s = f3;
            t = f1;
            if (flag && f5 > 0.0F)
            {
                float f2 = 0.0F;
                for (int j1 = 0; j1 < b.size(); j1++)
                {
                    s1 = (b)b.get(j1);
                    float f4 = Math.max(s1.c(), 0.5F) / f5;
                    s1.c(f2);
                    s1.d(f4);
                    s1.a(0.0F);
                    f2 += f4;
                }

            }
            if (flag)
            {
                if (u == null)
                {
                    u = new com.go.weatherex.home.dayforecast.c(this, null);
                    u.setStartOffset(360L);
                    u.setDuration(1450L);
                    u.setInterpolator(new LinearInterpolator());
                }
                clearAnimation();
                startAnimation(u);
            }
        } else
        {
            j = false;
            b.clear();
        }
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        if (j)
        {
            int j1 = b.size();
            float f1 = m;
            float f3;
            float f5;
            int i1;
            if (j1 != 0)
            {
                i1 = j1;
            } else
            {
                i1 = 1;
            }
            o = f1 / (float)i1;
            f3 = n;
            f5 = r.getTextSize();
            if (s != t)
            {
                f1 = Math.abs(s - t);
            } else
            {
                f1 = 1.0F;
            }
            p = (f3 - f5 * 3.2F) / f1;
            i1 = 0;
            while (i1 < j1) 
            {
                b b1 = (b)b.get(i1);
                if (b1 != null && b1.f() != 0.0F)
                {
                    float f4 = Math.max(b1.g() * p, h);
                    float f6 = l;
                    float f8 = o;
                    float f10 = i1;
                    float f11 = (o - q) / 2.0F;
                    float f2 = (k + r.getTextSize() * 1.6F + Math.abs(s - b1.e()) * p) - f4 - b1.j() * p;
                    float f12 = l;
                    float f13 = o;
                    float f14 = i1 + 1;
                    float f15 = (o - q) / 2.0F;
                    f4 = f4 + (k + r.getTextSize() * 1.6F + Math.abs(s - b1.e()) * p) + b1.j() * p;
                    i.set(f6 + f8 * f10 + f11, f2, (f12 + f13 * f14) - f15, f4);
                    if (b1.d())
                    {
                        if (g != null)
                        {
                            g.draw(canvas, i);
                        }
                    } else
                    if (f != null)
                    {
                        f.draw(canvas, i);
                    }
                    if (b1.f() == 1.0F)
                    {
                        float f7 = l + o * (float)i1 + o / 2.0F;
                        float f9 = r.getTextSize();
                        canvas.drawText((new StringBuilder()).append((int)b1.b()).append("\260").toString(), f7, f2 - f9 * 0.7F, r);
                        f2 = Math.round(r.getTextSize() * 1.4F);
                        canvas.drawText((new StringBuilder()).append((int)b1.a()).append("\260").toString(), f7, f4 + f2, r);
                    }
                }
                i1++;
            }
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        k = getPaddingTop();
        l = getPaddingLeft();
        m = getWidth() - getPaddingLeft() - getPaddingRight();
        n = getHeight() - getPaddingTop() - getPaddingBottom();
        q = (m / 10F) * 0.4F;
    }
}
