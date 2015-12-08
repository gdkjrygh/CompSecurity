// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.rain;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.rain:
//            f, e

public class ForecastRainProbabilityGraphs extends View
{

    public static final int a;
    private static final int r[] = {
        0xf000a0ea, 0xf000a0ea, 0xf000a0ea, 0xf000a0ea, 0xf000a0ea
    };
    private static final int s[] = {
        25, 50, 75, 100
    };
    private PathEffect A;
    private Bitmap B;
    private Paint b;
    private Paint c;
    private Paint d;
    private float e;
    private float f;
    private float g;
    private float h;
    private int i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private int p;
    private int q;
    private ArrayList t;
    private SparseArray u;
    private e v;
    private boolean w;
    private boolean x;
    private int y;
    private Path z;

    public ForecastRainProbabilityGraphs(Context context)
    {
        super(context);
        f = 0.9F;
        g = 2.0F;
        m = 10F;
        n = 1.5F;
        o = 0.25F;
        p = 6;
        q = 1;
        w = false;
        x = false;
        y = 0;
        a();
    }

    public ForecastRainProbabilityGraphs(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = 0.9F;
        g = 2.0F;
        m = 10F;
        n = 1.5F;
        o = 0.25F;
        p = 6;
        q = 1;
        w = false;
        x = false;
        y = 0;
        a();
    }

    public ForecastRainProbabilityGraphs(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        f = 0.9F;
        g = 2.0F;
        m = 10F;
        n = 1.5F;
        o = 0.25F;
        p = 6;
        q = 1;
        w = false;
        x = false;
        y = 0;
        a();
    }

    static ArrayList a(ForecastRainProbabilityGraphs forecastrainprobabilitygraphs)
    {
        return forecastrainprobabilitygraphs.t;
    }

    private void a()
    {
        e = getContext().getResources().getDisplayMetrics().density;
        f = f * e;
        g = g * e;
        h = getResources().getDimension(0x7f0c0142);
        u = new SparseArray();
        c = new Paint(3);
        c.setTextSize(h);
        c.setSubpixelText(true);
        c.setAntiAlias(true);
        b = new Paint(3);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        b.setTextAlign(android.graphics.Paint.Align.CENTER);
        b.setStrokeWidth(f);
        b.setColor(0x80ffffff);
        d = new Paint(3);
        d.setStyle(android.graphics.Paint.Style.FILL);
        z = new Path();
        float f1 = 4F * e;
        float f2 = 1.5F * e;
        A = new DashPathEffect(new float[] {
            f1, f2, f1, f2
        }, 1.0F);
        b.setPathEffect(A);
    }

    private void a(RectF rectf, int i1, int j1)
    {
        float f1 = (((float)getPaddingLeft() + l / 2.0F + l * (float)i1) - (float)(i / 2)) + (float)k;
        float f2 = i;
        float f3 = (int)((float)(getBottom() - getTop() - getPaddingTop()) - g - h / 2.0F - 1.0F * e);
        float f4 = j1;
        rectf.bottom = f3;
        rectf.top = f3 - f4;
        rectf.left = f1;
        rectf.right = f2 + f1;
    }

    static SparseArray b(ForecastRainProbabilityGraphs forecastrainprobabilitygraphs)
    {
        return forecastrainprobabilitygraphs.u;
    }

    static float c(ForecastRainProbabilityGraphs forecastrainprobabilitygraphs)
    {
        return forecastrainprobabilitygraphs.o;
    }

    private int c(int i1)
    {
        int j1 = r[0];
        if (i1 < s[0])
        {
            return r[0];
        }
        if (i1 < s[1])
        {
            return r[1];
        }
        if (i1 < s[2])
        {
            return r[2];
        }
        if (i1 < s[3])
        {
            return r[3];
        } else
        {
            return r[4];
        }
    }

    static float d(ForecastRainProbabilityGraphs forecastrainprobabilitygraphs)
    {
        return forecastrainprobabilitygraphs.m;
    }

    private int d(int i1)
    {
        int j1 = i1;
        if (i1 == -10000)
        {
            j1 = 0;
        }
        return ((((getBottom() - getTop() - getPaddingBottom() - getPaddingTop()) * 8) / 9) * j1) / 100;
    }

    static float e(ForecastRainProbabilityGraphs forecastrainprobabilitygraphs)
    {
        return forecastrainprobabilitygraphs.n;
    }

    public void a(int i1)
    {
        j = i1;
        i = (int)((float)j * 0.4F);
    }

    public void a(ArrayList arraylist, boolean flag, boolean flag1, boolean flag2)
    {
        x = flag2;
        w = flag1;
        t = arraylist;
        if (t == null || t.size() <= 0) goto _L2; else goto _L1
_L1:
        float f1;
        int i2;
        i2 = t.size();
        int i1 = 0;
        float f2;
        for (f1 = 0.0F; i1 < i2; f1 += f2)
        {
            ForecastBean forecastbean = (ForecastBean)t.get(i1);
            f f5 = (f)u.get(i1);
            arraylist = f5;
            if (f5 == null)
            {
                arraylist = new f(this, null);
                u.put(i1, arraylist);
            }
            arraylist.a(c(forecastbean.m()));
            arraylist.c(forecastbean.m());
            arraylist.d(arraylist.d());
            arraylist.b(false);
            f2 = Math.max(arraylist.d(), 1.0F);
            i1++;
        }

        if (f1 > 0.0F)
        {
            int j1 = 0;
            float f3 = 0.0F;
            while (j1 < i2) 
            {
                arraylist = (f)u.get(j1);
                float f4 = Math.max(arraylist.d(), 1.0F) / f1;
                arraylist.c(f3);
                arraylist.b(0.0F);
                arraylist.a(true);
                if (flag)
                {
                    arraylist.a(0.0F);
                    arraylist.e(p);
                } else
                {
                    arraylist.a(1.0F);
                    arraylist.e(0);
                }
                if (arraylist.d() > 0)
                {
                    arraylist.d(f4);
                } else
                {
                    arraylist.d(0.0F);
                }
                f3 += f4;
                j1++;
            }
        }
        if (!flag || x || f1 <= 0.0F) goto _L4; else goto _L3
_L3:
        if (v != null) goto _L6; else goto _L5
_L5:
        int k1 = (int)(f1 / (float)i2);
        long l2;
        if (k1 > 50)
        {
            l2 = 1800L;
        } else
        if (k1 > 25)
        {
            l2 = 1600L;
        } else
        if (k1 > 10)
        {
            l2 = 900L;
        } else
        if (k1 > 5)
        {
            l2 = 600L;
        } else
        {
            l2 = 400L;
        }
_L9:
        v = new e(this, f1);
        v.setDuration(l2);
        v.setStartOffset(200L);
        v.setInterpolator(new LinearInterpolator());
_L6:
        clearAnimation();
        startAnimation(v);
_L2:
        return;
_L4:
        if (flag || !x) goto _L2; else goto _L7
_L7:
        for (int l1 = 0; l1 < i2; l1++)
        {
            arraylist = (f)u.get(l1);
            if (arraylist != null)
            {
                arraylist.d(0);
                arraylist.a(0.0F);
            }
        }

        invalidate();
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void b(int i1)
    {
        k = i1;
    }

    protected void onDraw(Canvas canvas)
    {
        float f1;
        int l1;
        int i2;
        f1 = 4F * ((float)(getBottom() - getTop() - getPaddingBottom() - getPaddingTop()) / 45F);
        i2 = (int)((float)(getBottom() - getTop() - getPaddingTop()) - g - h / 2.0F);
        int i1 = (j - i) / 6 + k;
        l1 = y;
        l1 = (int)(f1 / 4F - g - h / 2.0F);
        l1 = y + i1;
        getRight();
        getLeft();
        getPaddingRight();
        if (w) goto _L2; else goto _L1
_L1:
        for (int j1 = 11; j1 > 0; j1--)
        {
            int j2 = (int)((float)i2 - (float)(j1 - 1) * f1 - 1.0F * e);
            if (B != null && !B.isRecycled())
            {
                canvas.drawBitmap(B, 0.0F, j2 - B.getHeight() / 2, d);
            }
        }

        c.setTextAlign(android.graphics.Paint.Align.CENTER);
        c.setColor(0xff22a5e9);
        if (t == null || t.size() <= 0 || x) goto _L2; else goto _L3
_L3:
        int k1;
        i2 = t.size();
        l = (getWidth() - getPaddingLeft() - getPaddingRight()) / i2;
        k1 = 0;
_L5:
        if (k1 < i2)
        {
            f f8 = (f)u.get(k1);
            f8.b(d(f8.e()));
            a(f8.a(), k1, f8.c());
            if (f8.d() != -10000)
            {
                String s1 = (new StringBuilder()).append(f8.d()).append("%").toString();
                c.setTextSize(h);
                float f2 = c.measureText(s1);
                float f4 = c.descent() - c.ascent();
                float f6 = f8.a().left + (float)(i / 2);
                int k2 = (int)(f8.a().top - f4 / 3F - 3F * e);
                c.setColor(-1);
                if (f6 - f2 / 2.0F < (float)l1)
                {
                    if (f8.f() == 1.0F)
                    {
                        c.setTextSize(h + (float)f8.g());
                        if (f8.g() > 0)
                        {
                            f8.e(f8.g() - q);
                        }
                        canvas.save();
                        canvas.clipRect(l1, (float)k2 - f4, f2 + (float)l1, f4 + (float)k2);
                        canvas.drawText(s1, f6, k2, c);
                        canvas.restore();
                    }
                } else
                if (f8.f() == 1.0F)
                {
                    c.setTextSize(h + (float)f8.g());
                    if (f8.g() > 0)
                    {
                        f8.e(f8.g() - q);
                    }
                    canvas.drawText(s1, f6, k2, c);
                }
                if (f8.a().left < (float)l1)
                {
                    f8.a().left = l1;
                }
                if (f8.a().right > f8.a().left)
                {
                    d.setColor(f8.b());
                    canvas.drawRect(f8.a(), d);
                }
            } else
            {
                c.setTextSize(h);
                float f3 = c.measureText("N/A");
                float f5 = c.descent() - c.ascent();
                float f7 = f8.a().left + (float)(i / 2);
                int l2 = (int)(f8.a().top - f5 / 3F);
                c.setTextSize(h + (float)f8.g());
                if (f8.g() > 0)
                {
                    f8.e(f8.g() - 1);
                }
                if (f7 - f3 / 2.0F < (float)l1)
                {
                    if (f8.f() == 1.0F)
                    {
                        c.setTextSize(h + (float)f8.g());
                        if (f8.g() > 0)
                        {
                            f8.e(f8.g() - q);
                        }
                        canvas.save();
                        canvas.clipRect(l1, (float)l2 - f5, f3 + (float)l1, f5 + (float)l2);
                        canvas.drawText("N/A", f7, l2, c);
                        canvas.restore();
                    }
                } else
                if (f8.f() == 1.0F)
                {
                    c.setTextSize(h + (float)f8.g());
                    if (f8.g() > 0)
                    {
                        f8.e(f8.g() - q);
                    }
                    canvas.drawText("N/A", f7, l2, c);
                }
            }
            k1++;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        j1 = getWidth();
        k1 = getPaddingLeft();
        l1 = getPaddingRight();
        if (t != null)
        {
            i1 = t.size();
        } else
        {
            i1 = 1;
        }
        l = (j1 - k1 - l1) / Math.max(i1, 1);
        if (B == null)
        {
            B = Bitmap.createBitmap(getWidth(), 4, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(B);
            z.moveTo(0.0F, 2.0F);
            z.lineTo(getWidth(), 2.0F);
            canvas.drawPath(z, b);
        }
    }

    static 
    {
        a = android.os.Build.VERSION.SDK_INT;
    }
}
