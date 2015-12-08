// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.rain;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
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

// Referenced classes of package com.go.weatherex.home.rain:
//            b

public class CuvetteGraphs extends View
{

    private Context a;
    private f b;
    private g c;
    private e d;
    private String e[];
    private String f;
    private Time g;
    private float h;
    private float i;
    private float j;
    private float k;
    private NinePatch l;
    private NinePatch m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private Paint u;
    private Paint v;
    private Paint w;
    private RectF x;
    private SparseArray y;
    private boolean z;

    public CuvetteGraphs(Context context)
    {
        super(context);
        a(context);
    }

    public CuvetteGraphs(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public CuvetteGraphs(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a(context);
    }

    private String a(int i1, int j1, int k1)
    {
        g.setToNow();
        g.set(k1, j1 - 1, i1);
        g.normalize(false);
        return e[g.weekDay];
    }

    private void a(Context context)
    {
        a = context;
        y = new SparseArray();
        x = new RectF();
        Object obj = com.gau.go.launcherex.gowidget.weather.c.c.a(context);
        b = ((c) (obj)).h();
        c = ((c) (obj)).g();
        d = ((c) (obj)).f();
        g = new Time();
        obj = (a)a;
        u = new Paint(1);
        u.setTextAlign(android.graphics.Paint.Align.CENTER);
        u.setTextSize(context.getResources().getDimension(0x7f0c01d3));
        u.setColor(-1);
        v = new Paint(u);
        v.setTextSize(context.getResources().getDimension(0x7f0c01d4));
        w = new Paint(u);
        w.setTextSize(context.getResources().getDimension(0x7f0c01d2));
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), 0x7f020230);
        Bitmap bitmap1 = BitmapFactory.decodeResource(context.getResources(), 0x7f020231);
        s = (float)bitmap.getHeight() * 0.48F;
        t = (float)bitmap.getHeight() * 0.13F;
        n = Math.max(bitmap.getWidth(), 1.0F) * 1.05F;
        o = Math.max(bitmap1.getWidth(), 1.0F);
        p = Math.max(bitmap1.getHeight(), 1.0F);
        l = new NinePatch(bitmap, bitmap.getNinePatchChunk(), null);
        m = new NinePatch(bitmap1, bitmap1.getNinePatchChunk(), null);
        f = com.gau.go.launcherex.gowidget.weather.util.r.e(context.getResources().getString(0x7f0802b7));
        e = com.gau.go.launcherex.gowidget.weather.util.c.h(context);
        for (int i1 = e.length - 1; i1 > -1; i1--)
        {
            e[i1] = com.gau.go.launcherex.gowidget.weather.util.r.e(e[i1]);
        }

        context = ((a) (obj)).a(a, 2, 0);
        u.setTypeface(context);
        v.setTypeface(context);
        context = ((a) (obj)).a(a, 4, 0);
        w.setTypeface(context);
    }

    public void a()
    {
        if (l != null)
        {
            l = null;
        }
        if (m != null)
        {
            m = null;
        }
    }

    public void a(String s1, ArrayList arraylist, boolean flag)
    {
        int i1;
        if (arraylist != null)
        {
            i1 = arraylist.size();
        } else
        {
            i1 = 0;
        }
        if (i1 <= 0)
        {
            z = false;
            y.clear();
            return;
        }
        s1 = b.a(s1);
        Time time;
        int k1;
        if (s1 != null)
        {
            k1 = ((WeatherBean) (s1)).l.n();
        } else
        {
            k1 = 0;
        }
        time = c.c(k1);
        if (i1 > 3)
        {
            k1 = 0;
            do
            {
                s1 = (ForecastBean)arraylist.get(0);
                if (k1 + 3 == i1 || com.gau.go.launcherex.gowidget.weather.util.r.a(s1.e(), s1.f(), s1.g(), time) || com.go.weatherex.i.c.a(s1.e(), s1.f(), s1.g(), time))
                {
                    for (; arraylist.size() > 3; arraylist.remove(3)) { }
                    break;
                }
                arraylist.remove(0);
                k1++;
            } while (true);
        }
        if (y.size() > arraylist.size())
        {
            y.clear();
        }
        f = com.gau.go.launcherex.gowidget.weather.util.r.e(a.getResources().getString(0x7f0802b7));
        e = com.gau.go.launcherex.gowidget.weather.util.c.h(a);
        for (int j1 = e.length - 1; j1 > -1; j1--)
        {
            e[j1] = com.gau.go.launcherex.gowidget.weather.util.r.e(e[j1]);
        }

        k1 = 0;
        boolean flag1 = false;
        while (k1 < arraylist.size()) 
        {
            ForecastBean forecastbean = (ForecastBean)arraylist.get(k1);
            b b1 = (b)y.get(k1);
            s1 = b1;
            if (b1 == null)
            {
                s1 = new b(this, null);
                y.put(k1, s1);
            }
            if (forecastbean != null)
            {
                int l1 = d.a().k;
                s1.b(com.gau.go.launcherex.gowidget.weather.util.r.a(forecastbean.e(), forecastbean.f(), forecastbean.g(), false, l1));
                if (!flag1 && com.gau.go.launcherex.gowidget.weather.util.r.a(forecastbean.e(), forecastbean.f(), forecastbean.g(), time))
                {
                    s1.a(f);
                    flag1 = true;
                } else
                {
                    s1.a(a(forecastbean.e(), forecastbean.f(), forecastbean.g()));
                }
                s1.a(forecastbean.m());
            }
            k1++;
        }
        z = true;
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        if (z && y.size() != 0)
        {
            int j1 = y.size();
            if (q <= 0.0F)
            {
                q = Math.max((k - u.getTextSize() * 5.8F - s - t - p) / 100F, 0.01F);
                Log.d("liuhui", (new StringBuilder()).append("mCellHeight = ").append(q).toString());
            }
            int i1;
            if (r <= 0.0F)
            {
                float f1 = j;
                if (j1 != 0)
                {
                    i1 = j1;
                } else
                {
                    i1 = 1;
                }
                r = f1 / (float)i1;
            }
            i1 = 0;
            while (i1 < j1) 
            {
                b b1 = (b)y.get(i1);
                if (b1 != null)
                {
                    x.left = (r - n) / 2.0F + r * (float)i1 + i;
                    x.top = h + u.getTextSize() * 2.2F;
                    x.right = x.left + n;
                    x.bottom = (k + h) - u.getTextSize() * 3.6F;
                    l.draw(canvas, x);
                    if (b1.a() > 0)
                    {
                        x.bottom = (k + h) - t - u.getTextSize() * 3.6F;
                        x.left = (r - o) / 2.0F + r * (float)i1 + i;
                        x.top = x.bottom - q * (float)b1.a() - p;
                        x.right = x.left + o;
                        m.draw(canvas, x);
                    }
                    float f2 = r / 2.0F + r * (float)i1 + i;
                    float f3 = h;
                    float f4 = u.getTextSize();
                    canvas.drawText((new StringBuilder()).append(b1.a()).append("%").toString(), f2, f3 + f4 * 1.2F, w);
                    f3 = k;
                    f4 = h;
                    float f5 = u.getTextSize();
                    canvas.drawText(b1.b(), f2, (f3 + f4) - f5 * 1.8F, u);
                    f3 = k;
                    f4 = h;
                    f5 = u.getTextSize();
                    canvas.drawText(b1.c(), f2, (f3 + f4) - f5 * 0.5000002F, v);
                }
                i1++;
            }
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        h = getPaddingTop();
        i = getPaddingLeft();
        j = getWidth() - getPaddingLeft() - getPaddingRight();
        k = getHeight() - getPaddingTop() - getPaddingBottom();
    }
}
