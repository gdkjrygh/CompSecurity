// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.hourforecast;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.HourlyBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gtp.a.a.d.a;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.hourforecast:
//            g, i, h

public class TrendGraphs extends View
{

    private float A;
    private float B;
    private float C;
    private float D;
    private int E;
    private int F;
    private float G;
    private float H;
    private boolean I;
    private float J;
    private com.go.weatherex.home.hourforecast.i K;
    private NinePatch L;
    private NinePatch M;
    private float N;
    private Paint O;
    private float P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private Context a;
    private SparseArray b;
    private e c;
    private f d;
    private com.gau.go.launcherex.gowidget.weather.util.f e;
    private NinePatch f;
    private NinePatch g;
    private Bitmap h[];
    private float i;
    private Bitmap j;
    private float k;
    private g l[] = {
        new g(this), new g(this)
    };
    private RectF m;
    private Path n;
    private Paint o;
    private Paint p;
    private Paint q;
    private Paint r;
    private Paint s;
    private Path t;
    private boolean u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public TrendGraphs(Context context)
    {
        super(context);
        H = 0.0F;
        I = false;
        J = 4F;
        N = 20F;
        Q = false;
        R = false;
        S = false;
        T = false;
        U = false;
        a(context);
    }

    public TrendGraphs(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        H = 0.0F;
        I = false;
        J = 4F;
        N = 20F;
        Q = false;
        R = false;
        S = false;
        T = false;
        U = false;
        a(context);
    }

    public TrendGraphs(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        H = 0.0F;
        I = false;
        J = 4F;
        N = 20F;
        Q = false;
        R = false;
        S = false;
        T = false;
        U = false;
        a(context);
    }

    static float a(TrendGraphs trendgraphs, float f1)
    {
        trendgraphs.H = f1;
        return f1;
    }

    private void a(Context context)
    {
        a = context;
        b = new SparseArray();
        Object obj = com.gau.go.launcherex.gowidget.weather.c.c.a(context);
        c = ((c) (obj)).f();
        d = ((c) (obj)).e();
        e = ((c) (obj)).h();
        G = context.getResources().getDisplayMetrics().density;
        j = BitmapFactory.decodeResource(a.getResources(), 0x7f02021d);
        if (j != null)
        {
            k = (float)j.getWidth() / 2.2F;
        }
        obj = BitmapFactory.decodeResource(a.getResources(), 0x7f02022c);
        Bitmap bitmap = BitmapFactory.decodeResource(a.getResources(), 0x7f02022b);
        Bitmap bitmap1 = BitmapFactory.decodeResource(a.getResources(), 0x7f02021f);
        Bitmap bitmap2 = BitmapFactory.decodeResource(a.getResources(), 0x7f020220);
        Paint paint = new Paint(3);
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        P = (float)Math.max(bitmap1.getHeight(), bitmap2.getHeight()) / 2.0F;
        f = new NinePatch(((Bitmap) (obj)), ((Bitmap) (obj)).getNinePatchChunk(), null);
        f.setPaint(paint);
        g = new NinePatch(bitmap, bitmap.getNinePatchChunk(), null);
        g.setPaint(paint);
        L = new NinePatch(bitmap1, bitmap1.getNinePatchChunk(), null);
        L.setPaint(paint);
        M = new NinePatch(bitmap2, bitmap2.getNinePatchChunk(), null);
        M.setPaint(paint);
        m = new RectF();
        n = new Path();
        N = N * a.getResources().getDisplayMetrics().density;
        h = new Bitmap[i.e.length];
        for (int i1 = 0; i1 < h.length; i1++)
        {
            h[i1] = com.gau.go.launcherex.gowidget.weather.util.r.a(BitmapFactory.decodeResource(a.getResources(), i.e[i1]), 0.8F);
        }

        i = (float)Math.max(h[0].getWidth(), h[0].getHeight()) / 2.0F;
        p = new Paint(3);
        p.setStrokeWidth(com.gtp.a.a.d.a.a(context, 1.7F));
        p.setTextAlign(android.graphics.Paint.Align.CENTER);
        p.setStyle(android.graphics.Paint.Style.STROKE);
        p.setColor(0xc8ffffff);
        s = new Paint(3);
        s.setStrokeWidth((float)com.gtp.a.a.d.a.a(context, 1.7F) / 2.5F);
        s.setTextAlign(android.graphics.Paint.Align.CENTER);
        s.setColor(0xb0ffffff);
        s.setStyle(android.graphics.Paint.Style.STROKE);
        float f1 = G;
        float f2 = G;
        float f3 = G;
        float f4 = G;
        float f5 = G;
        obj = new DashPathEffect(new float[] {
            f1 * 2.0F, 1.5F * f2, f3 * 2.0F, 1.5F * f4
        }, f5);
        s.setPathEffect(((android.graphics.PathEffect) (obj)));
        t = new Path();
        q = new Paint(3);
        q.setStrokeWidth(com.gtp.a.a.d.a.a(context, 1.7F));
        q.setTextAlign(android.graphics.Paint.Align.CENTER);
        q.setColor(0x24ffffff);
        o = new Paint(33);
        o.setTextAlign(android.graphics.Paint.Align.CENTER);
        o.setColor(-1);
        o.setTextSize(context.getResources().getDimension(0x7f0c0142));
        O = new Paint(33);
        O.setTextAlign(android.graphics.Paint.Align.CENTER);
        O.setColor(-1);
        O.setTextSize(context.getResources().getDimension(0x7f0c0145));
        P = Math.max(P, O.getTextSize() * 1.8F) / 2.0F;
        context = ((com.go.weatherex.framework.a.a)a).a(a, 4, 0);
        O.setTypeface(context);
        r = new Paint(3);
        r.setTextAlign(android.graphics.Paint.Align.CENTER);
        K = new com.go.weatherex.home.hourforecast.i(this, null);
        K.setStartOffset(300L);
        K.setDuration(1150L);
        K.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    private void a(Canvas canvas)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        f6 = -p.getStrokeWidth();
        f1 = v;
        f4 = w;
        f5 = (float)Math.abs(E - ((h)b.get(0)).a()) * D + v;
        if (((h)b.get(0)).a() < ((h)b.get(1)).a())
        {
            f1 = -f4 / 4F;
            f3 = f6 / 4F + (f1 + f5);
        } else
        {
            f3 = (f4 / 4F + f5) - f6 / 4F;
        }
        if (S || ((h)b.get(0)).a() != E) goto _L2; else goto _L1
_L1:
        S = true;
        a(false, f6, f3, f4, f5);
        f1 = l[1].a;
        f2 = l[1].b;
_L4:
        f5 = f1;
        f4 = f2;
        if (f1 > H)
        {
            f4 = ((H * (f3 - f2) + f6 * f2) - f3 * f1) / (f6 - f1);
            f5 = H;
        }
        canvas.drawLine(f6, f3, f5, f4, p);
        n.moveTo(f6, B);
        n.lineTo(f6, f3);
        n.lineTo(f5, f4);
        if (H < w)
        {
            n.lineTo(f5, B);
        }
        return;
_L2:
        f1 = f4;
        f2 = f5;
        if (!U)
        {
            f1 = f4;
            f2 = f5;
            if (((h)b.get(0)).a() == F)
            {
                U = true;
                a(false, f6, f3, f4, f5);
                f1 = l[1].a;
                f2 = l[1].b;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(TrendGraphs trendgraphs, h h1)
    {
        trendgraphs.a(h1);
    }

    private void a(h h1)
    {
        if (h1.c())
        {
            if (h1.b() < J)
            {
                h1.a(h1.b() + 1.0F);
                return;
            } else
            {
                h1.a(false);
                return;
            }
        }
        if (h1.b() > 0.0F)
        {
            h1.a(h1.b() - 1.0F);
            return;
        } else
        {
            h1.b(true);
            return;
        }
    }

    private void a(boolean flag, float f1, float f2, float f3, float f4)
    {
        if (k > 0.0F)
        {
            float f5 = (Math.abs(f3 - f1) * k) / (float)Math.sqrt(Math.pow(f2 - f4, 2D) + Math.pow(f1 - f3, 2D));
            if (flag)
            {
                l[0].a = f5 + f1;
                l[0].b = ((f2 - f4) * l[0].a) / (f1 - f3) + (f1 * f4 - f3 * f2) / (f1 - f3);
                return;
            } else
            {
                l[1].a = f3 - f5;
                l[1].b = ((f2 - f4) * l[1].a) / (f1 - f3) + (f1 * f4 - f3 * f2) / (f1 - f3);
                return;
            }
        } else
        {
            l[0].a = f1;
            l[0].b = f2;
            l[1].a = f3;
            l[1].b = f4;
            return;
        }
    }

    private boolean a(WeatherBean weatherbean, int i1)
    {
        boolean flag = true;
        if (weatherbean != null)
        {
            String s1 = weatherbean.l.j();
            weatherbean = weatherbean.l.k();
            flag = com.gau.go.launcherex.gowidget.weather.util.r.a(i1, com.gau.go.launcherex.gowidget.weather.util.r.a(true, s1), com.gau.go.launcherex.gowidget.weather.util.r.a(false, weatherbean));
        }
        return flag;
    }

    static boolean a(TrendGraphs trendgraphs)
    {
        return trendgraphs.u;
    }

    static float b(TrendGraphs trendgraphs)
    {
        return trendgraphs.A;
    }

    private void b(Canvas canvas)
    {
        int i1 = b.size();
        if (i1 >= 2)
        {
            float f1 = w;
            float f2 = C * (float)(i1 - 1) + f1;
            f1 = Math.abs(E - ((h)b.get(i1 - 1)).a());
            float f3 = D;
            f3 = v + f1 * f3;
            float f4 = A;
            f1 = v;
            if (((h)b.get(i1 - 2)).a() < ((h)b.get(i1 - 1)).a())
            {
                f1 = -f2 / 4F;
                f1 = f4 / 4F + (f1 + f3);
            } else
            {
                f1 = (f2 / 4F + f3) - f4 / 4F;
            }
            if (H > y + w)
            {
                if (!R && ((h)b.get(i1 - 1)).a() == E)
                {
                    R = true;
                    a(true, f2, f3, f4, f1);
                    f2 = l[0].a;
                    f3 = l[0].b;
                } else
                if (!T && ((h)b.get(i1 - 1)).a() == F)
                {
                    T = true;
                    a(true, f2, f3, f4, f1);
                    f2 = l[0].a;
                    f3 = l[0].b;
                }
                if (H < A)
                {
                    f4 = ((H * (f3 - f1) + f2 * f1) - f3 * f4) / (f2 - f4);
                    f1 = H;
                } else
                {
                    float f5 = f1;
                    f1 = f4;
                    f4 = f5;
                }
                canvas.drawLine(f2, f3, f1, f4, p);
                n.lineTo(f1, f4);
                n.lineTo(f1, B);
                return;
            }
        }
    }

    static float c(TrendGraphs trendgraphs)
    {
        return trendgraphs.H;
    }

    static SparseArray d(TrendGraphs trendgraphs)
    {
        return trendgraphs.b;
    }

    static int e(TrendGraphs trendgraphs)
    {
        return trendgraphs.E;
    }

    static int f(TrendGraphs trendgraphs)
    {
        return trendgraphs.F;
    }

    public void a()
    {
        if (j != null)
        {
            if (!j.isRecycled())
            {
                j.recycle();
            }
            j = null;
        }
        if (f != null)
        {
            f = null;
        }
        if (g != null)
        {
            g = null;
        }
        if (L != null)
        {
            L = null;
        }
        if (M != null)
        {
            M = null;
        }
        b.clear();
        if (h != null)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                if (h[i1] != null && !h[i1].isRecycled())
                {
                    h[i1].recycle();
                    h[i1] = null;
                }
            }

            h = null;
        }
    }

    public void a(String s1, ArrayList arraylist, boolean flag)
    {
        if (arraylist == null || arraylist.size() <= 0) goto _L2; else goto _L1
_L1:
        WeatherBean weatherbean;
        boolean flag1;
        int i1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        I = flag;
        u = true;
        j2 = arraylist.size();
        if (b.size() > j2)
        {
            b.clear();
        }
        flag1 = false;
        k1 = -10000;
        l1 = 10000;
        Q = d.b();
        weatherbean = e.a(s1);
        i1 = 0;
        k2 = ((HourlyBean)arraylist.get(0)).d();
        i2 = 0;
_L4:
        Object obj;
        int j1;
        if (i2 >= j2)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        s1 = (h)b.get(i2);
        if (s1 == null)
        {
            s1 = new h(this, null);
            b.put(i2, s1);
        }
        obj = (HourlyBean)arraylist.get(i2);
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = k1;
_L5:
        i2++;
        k1 = j1;
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            s1.b(((HourlyBean) (obj)).d());
            s1.c(com.gau.go.launcherex.gowidget.weather.util.r.a(((HourlyBean) (obj)).e(), a(weatherbean, ((HourlyBean) (obj)).d())));
            s1.a(Math.round(((HourlyBean) (obj)).b(c.a().g)));
            s1.e(0);
            s1.d(-1);
            j1 = k1;
            if (k1 < s1.a())
            {
                j1 = s1.a();
            }
            k1 = l1;
            if (l1 > s1.a())
            {
                k1 = s1.a();
            }
            if (!Q || i2 % 2 != k2 % 2 || i2 <= 1)
            {
                break label0;
            }
            obj = (h)b.get(i2 - 2);
            if (s1.g() != ((h) (obj)).g())
            {
                ((h) (obj)).d(((h) (obj)).g());
                ((h) (obj)).e(i2 - 1 - i1);
                l1 = i2 - 1;
            } else
            {
                l1 = i1;
            }
            if (i2 != j2 - 1)
            {
                i1 = l1;
                if (i2 != j2 - 2)
                {
                    break label0;
                }
            }
            s1.d(s1.g());
            s1.e(i2 - 1 - l1);
            i1 = l1;
        }
        if (Q)
        {
            if (!flag1 && s1.e() == 0)
            {
                s1.c(true);
                flag1 = true;
                l1 = k1;
            } else
            {
                s1.c(false);
                l1 = k1;
            }
        } else
        if (!flag1 && s1.e() >= 0 && s1.e() <= 3)
        {
            s1.c(true);
            flag1 = true;
            l1 = k1;
        } else
        {
            s1.c(false);
            l1 = k1;
        }
          goto _L5
          goto _L4
        E = k1;
        F = l1;
        if (flag)
        {
            clearAnimation();
            startAnimation(K);
        }
_L7:
        invalidate();
        return;
_L2:
        u = false;
        b.clear();
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L4; else goto _L8
_L8:
    }

    protected void onDraw(Canvas canvas)
    {
        if (u) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!I)
        {
            H = getWidth();
        }
        int i3 = b.size();
        float f1 = y;
        int i1;
        int j1;
        if (i3 - 1 != 0)
        {
            i1 = i3 - 1;
        } else
        {
            i1 = 1;
        }
        C = f1 / (float)i1;
        f1 = z;
        if (E - F != 0)
        {
            i1 = Math.abs(E - F);
        } else
        {
            i1 = 1;
        }
        D = f1 / (float)i1;
        R = false;
        S = false;
        T = false;
        U = false;
        n.reset();
        a(canvas);
        i1 = 0;
        j1 = 0;
label0:
        do
        {
label1:
            {
                float f6;
                float f7;
                int k1;
                int i2;
                boolean flag1;
                int k2;
                int j3;
                if (j1 < i3 - 1)
                {
                    float f2 = w + C * (float)j1;
                    f6 = (float)Math.abs(E - ((h)b.get(j1)).a()) * D + v;
                    float f12 = w + C * (float)(j1 + 1);
                    float f16 = (float)Math.abs(E - ((h)b.get(j1 + 1)).a()) * D + v;
                    float f8;
                    if (!R && ((h)b.get(j1)).a() == E)
                    {
                        R = true;
                        a(true, f2, f6, f12, f16);
                        f7 = l[0].a;
                        f8 = l[0].b;
                    } else
                    {
                        f7 = f2;
                        f8 = f6;
                        if (!T)
                        {
                            f7 = f2;
                            f8 = f6;
                            if (((h)b.get(j1)).a() == F)
                            {
                                T = true;
                                a(true, f2, f6, f12, f16);
                                f7 = l[0].a;
                                f8 = l[0].b;
                            }
                        }
                    }
                    if (!S && ((h)b.get(j1 + 1)).a() == E)
                    {
                        S = true;
                        a(false, f7, f8, f12, f16);
                        f6 = l[1].a;
                        f2 = l[1].b;
                    } else
                    {
                        f6 = f12;
                        f2 = f16;
                        if (!U)
                        {
                            f6 = f12;
                            f2 = f16;
                            if (((h)b.get(j1 + 1)).a() == F)
                            {
                                U = true;
                                a(false, f7, f8, f12, f16);
                                f6 = l[1].a;
                                f2 = l[1].b;
                            }
                        }
                    }
                    if (f6 > H && H > w)
                    {
                        f2 = ((H * (f8 - f2) + f7 * f2) - f8 * f6) / (f7 - f6);
                        f6 = H;
                        i1 = 1;
                    }
                    if (H > w)
                    {
                        canvas.drawLine(f7, f8, f6, f2, p);
                    }
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                i2 = 0;
                j1 = 0;
                k1 = 0;
                flag1 = false;
                f6 = B - N - O.getTextSize() * 0.32F;
                f7 = f6 - P - i * 2.5F;
                i1 = 0;
                j3 = ((h)b.get(0)).e();
                k2 = 0;
                while (k2 < i3) 
                {
                    h h2 = (h)b.get(k2);
                    int l1;
                    if (h2 == null)
                    {
                        l1 = i1;
                        i1 = k1;
                        k1 = i2;
                    } else
                    {
                        l1 = i2;
                        float f3;
                        if (i2 == 0)
                        {
                            l1 = i2;
                            if (h2.f())
                            {
                                boolean flag = true;
                                float f9;
                                float f13;
                                String s1;
                                boolean flag2;
                                if (k2 != 0)
                                {
                                    f3 = (w + (float)k2 * C) - C / 2.0F;
                                } else
                                {
                                    f3 = A;
                                }
                                m.set(0.0F, f6 - P, f3, P + f6);
                                L.draw(canvas, m);
                                l1 = ((flag) ? 1 : 0);
                                if (k2 != 0)
                                {
                                    m.set(f3, f6 - P, A, P + f6);
                                    M.draw(canvas, m);
                                    l1 = ((flag) ? 1 : 0);
                                }
                            }
                        }
                        if (!flag1)
                        {
                            s1 = (new StringBuilder()).append(h2.a()).append("\260").toString();
                            f3 = w;
                            f3 = C * (float)k2 + f3;
                            f9 = Math.abs(E - h2.a());
                            f13 = D;
                            float f10 = v + f9 * f13;
                            int j2;
                            if (f3 < H && H > w)
                            {
                                n.lineTo(f3, f10);
                            } else
                            {
                                if (k2 > 0)
                                {
                                    float f14 = w;
                                    f14 = C * (float)(k2 - 1) + f14;
                                    float f17 = (float)Math.abs(E - ((h)b.get(k2 - 1)).a()) * D + v;
                                    f10 = ((f17 * f3 + H * (f10 - f17)) - f10 * f14) / (f3 - f14);
                                    n.lineTo(H, f10);
                                } else
                                {
                                    n.lineTo(H, f10);
                                }
                                n.lineTo(H, B);
                                flag1 = true;
                            }
                            if (!Q || Q && k2 % 2 == j3 % 2)
                            {
                                if (H >= f3)
                                {
                                    canvas.drawText(String.valueOf(h2.e()), f3, O.getTextSize() * 0.32F + f6, O);
                                }
                                if (h != null && h.length > 0)
                                {
                                    if (!Q && H >= f3)
                                    {
                                        canvas.drawBitmap(com.gau.go.launcherex.gowidget.weather.util.r.a(h, h2.g()), f3 - i, f7, r);
                                    } else
                                    if (Q && h2.h() >= 0)
                                    {
                                        float f5;
                                        h h1;
                                        if (k2 < i3 - 2)
                                        {
                                            h1 = (h)b.get(k2 + 1);
                                        } else
                                        {
                                            h1 = null;
                                        }
                                        if (h1 != null)
                                        {
                                            float f4 = C * (float)(k2 + 1) + w;
                                            if (H >= f4)
                                            {
                                                float f11 = Math.abs(E - h1.a());
                                                float f15 = D;
                                                float f18 = v;
                                                float f19 = k / 2.0F;
                                                t.reset();
                                                t.moveTo(f4, f11 * f15 + f18 + f19);
                                                t.lineTo(f4, f6 - P - k / 2.0F);
                                                canvas.drawPath(t, s);
                                            }
                                        }
                                        if (i1 == 0)
                                        {
                                            f5 = (w + C * (float)(k2 + 1)) / 2.0F - i;
                                        } else
                                        if (k2 != i3 - 1 && k2 != i3 - 2)
                                        {
                                            f5 = (w + (float)i1 * C + ((float)h2.i() * C) / 2.0F) - i;
                                        } else
                                        {
                                            f5 = A - ((float)((h2.i() + i3) - k2) * C + x) / 2.0F - i;
                                        }
                                        if (H >= f5)
                                        {
                                            canvas.drawBitmap(com.gau.go.launcherex.gowidget.weather.util.r.a(h, h2.g()), f5, f7, r);
                                        }
                                        i1 += h2.i();
                                    }
                                }
                            }
                            j2 = j1;
                            if (j1 == 0)
                            {
                                j2 = j1;
                                if (E == h2.a())
                                {
                                    j2 = j1;
                                    if (H >= w + C * (float)k2)
                                    {
                                        j1 = 1;
                                        if (j != null && !j.isRecycled())
                                        {
                                            f3 = (float)j.getWidth() / 2.0F;
                                            f10 = (float)j.getHeight() / 2.0F;
                                            canvas.drawBitmap(j, (w + C * (float)k2) - f3, ((float)Math.abs(E - h2.a()) * D + v) - f10, r);
                                        }
                                        j2 = j1;
                                        if (H >= A)
                                        {
                                            o.setTextSize(a.getResources().getDimension(0x7f0c0142) + h2.b() * G);
                                            f3 = (float)Math.abs(E - h2.a()) * D - o.getTextSize() * 1.3F;
                                            canvas.drawText(s1, w + C * (float)k2, v + f3 + 2.0F * G, o);
                                            j2 = j1;
                                            if (f != null)
                                            {
                                                f10 = o.measureText(s1) / 2.0F + a.getResources().getDimension(0x7f0c0143);
                                                f13 = (o.descent() - o.ascent()) / 2.0F + a.getResources().getDimension(0x7f0c0144);
                                                m.set((w + C * (float)k2) - f10, (v + f3) - f13, f10 + (w + C * (float)k2), f3 + v + f13);
                                                f.draw(canvas, m);
                                                j2 = j1;
                                            }
                                        }
                                    }
                                }
                            }
                            if (k1 == 0 && F == h2.a() && H >= w + C * (float)k2)
                            {
                                if (j != null && !j.isRecycled())
                                {
                                    f3 = (float)j.getWidth() / 2.0F;
                                    f10 = (float)j.getHeight() / 2.0F;
                                    canvas.drawBitmap(j, (w + C * (float)k2) - f3, ((float)Math.abs(E - h2.a()) * D + v) - f10, r);
                                }
                                if (H >= A)
                                {
                                    o.setTextSize(a.getResources().getDimension(0x7f0c0142) + h2.b() * G);
                                    f3 = (float)Math.abs(E - h2.a()) * D + o.getTextSize() * 1.3F;
                                    canvas.drawText(s1, w + C * (float)k2, ((f3 - o.ascent()) + v) - 5F * G, o);
                                    if (g != null)
                                    {
                                        f10 = o.measureText(s1) / 2.0F + a.getResources().getDimension(0x7f0c0143);
                                        f13 = (o.descent() - o.ascent()) / 2.0F + a.getResources().getDimension(0x7f0c0144);
                                        m.set((w + C * (float)k2) - f10, (v + f3) - f13, f10 + (w + C * (float)k2), f3 + v + f13);
                                        g.draw(canvas, m);
                                    }
                                }
                                flag2 = true;
                                k1 = l1;
                                j1 = j2;
                                l1 = i1;
                                i1 = ((flag2) ? 1 : 0);
                            } else
                            {
                                int l2 = k1;
                                j1 = j2;
                                k1 = l1;
                                l1 = i1;
                                i1 = l2;
                            }
                        } else
                        {
                            j2 = k1;
                            k1 = l1;
                            l1 = i1;
                            i1 = j2;
                        }
                    }
                    k2++;
                    i2 = k1;
                    k1 = i1;
                    i1 = l1;
                }
                break label0;
            }
            j1++;
        } while (true);
        b(canvas);
        n.close();
        if (H > 0.0F)
        {
            canvas.drawPath(n, q);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        v = getPaddingTop();
        w = getPaddingLeft();
        x = getPaddingRight();
        y = getWidth() - getPaddingLeft() - getPaddingRight();
        z = getHeight() - getPaddingTop() - getPaddingBottom();
        A = getWidth();
        B = getHeight();
        if (!I)
        {
            H = getWidth();
        }
    }
}
