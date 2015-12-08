// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.scroller:
//            g, d, i, b

public class h extends g
{

    static final boolean ae;
    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected int E;
    protected int F;
    protected boolean G;
    protected int H;
    protected int I;
    protected int J;
    protected int K;
    protected int L;
    protected int M;
    protected int N;
    protected int O;
    protected int P;
    protected int Q;
    protected int R;
    protected int S;
    protected int T;
    protected int U;
    boolean V;
    boolean W;
    protected boolean X;
    protected boolean Y;
    protected Drawable Z;
    protected Bitmap aa;
    protected Paint ab;
    protected int ac;
    protected int ad;
    protected d m;
    protected int n;
    protected i o;
    protected Interpolator p;
    protected Interpolator q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    protected float w;
    protected float x;
    protected float y;
    protected float z;

    public h(i i1)
    {
        this(i1, null);
    }

    public h(i i1, d d1)
    {
        z = 0.5F;
        A = 1;
        D = 1;
        P = 1000;
        Q = 500;
        V = true;
        W = true;
        ac = 49;
        if (!ae && i1 == null)
        {
            throw new AssertionError();
        }
        q = g.l;
        p = q;
        o = i1;
        if (d1 == null)
        {
            d1 = new d();
        }
        m = d1;
    }

    private static void a(h h1, h h2)
    {
        h2.F = h1.a();
        h2.T = h1.T;
        h2.z = h1.z;
        h2.A = h1.A;
        h2.f = h1.f;
        h2.c(h1.B, h1.C);
        h2.a(h1.n());
        h2.h(h1.P);
        h2.a(h1.i);
        h2.a(h1.Z);
        h2.b(h1.Y);
        h2.k(h1.ac);
        h2.a(Boolean.valueOf(h1.V));
    }

    public static void a(i i1, boolean flag)
    {
        h h1;
        if (i1 != null)
        {
            if ((h1 = i1.getScreenScroller()) == null || h1.s() != flag)
            {
                Object obj;
                if (flag)
                {
                    obj = new b(i1);
                } else
                {
                    obj = new h(i1);
                }
                i1.setScreenScroller(((h) (obj)));
                if (h1 != null)
                {
                    a(h1, ((h) (obj)));
                    h1.u();
                    return;
                }
            }
        }
    }

    private static float l(int i1)
    {
        float af[] = new float[11];
        float[] _tmp = af;
        af[0] = 0.0F;
        af[1] = 1.165295F;
        af[2] = 1.70154F;
        af[3] = 2.164294F;
        af[4] = 2.592389F;
        af[5] = 3F;
        af[6] = 3.394052F;
        af[7] = 3.77848F;
        af[8] = 4.155745F;
        af[9] = 4.527488F;
        af[10] = 4.894859F;
        i1 = Math.max(0, Math.min(i1, 49));
        int j1 = i1 / 5;
        float f1 = af[j1];
        return (af[j1 + 1] - af[j1]) * ((float)i1 / 5F - (float)j1) + f1;
    }

    public int a()
    {
        return F;
    }

    public void a(float f1)
    {
        float f2 = 0.0F;
        f();
        if (z == f1)
        {
            return;
        }
        z = Math.max(0.0F, Math.min(f1, 0.5F));
        r = Math.max(-(int)((float)D * f1), -D / 2);
        s = Math.min(t + (int)((float)D * f1), (t + D / 2) - 1);
        s = Math.max(r, s);
        f1 = f2;
        if (s > r)
        {
            f1 = 1.0F / (float)(s - r);
        }
        w = f1;
        a(a() * D);
    }

    protected void a(int i1)
    {
        u = e;
        e = i1;
        if (e != u)
        {
            if (f == 0)
            {
                o.scrollBy(e - u, 0);
            } else
            {
                o.scrollBy(0, e - u);
            }
            o.onScrollChanged(e, u);
            i1 = E;
            E = b(e);
            if (E != i1)
            {
                o.onScreenChanged(E, i1);
            }
        }
    }

    protected void a(int i1, int j1, Interpolator interpolator)
    {
        int k1;
        if (interpolator == null)
        {
            interpolator = g.l;
        }
        p = interpolator;
        F = d(i1);
        k1 = F * D - e;
        if (k1 == 0 && j() == 0.0F)
        {
            g = 0;
            o.onScrollFinish(a());
            return;
        }
        i1 = j1;
        if (n != 0)
        {
            i1 = j1;
            if (p != k)
            {
                i1 = Math.min(j1, d(k1, n));
                n = 0;
            }
        }
        a(e, k1, i1);
        o.onFlingStart();
        o.postInvalidate();
    }

    public void a(Drawable drawable)
    {
        Z = drawable;
        aa = null;
        if (Z != null)
        {
            R = Z.getIntrinsicWidth();
            S = Z.getIntrinsicHeight();
            Z.setBounds(0, 0, R, S);
            t();
            if (Z instanceof BitmapDrawable)
            {
                aa = ((BitmapDrawable)Z).getBitmap();
            }
        }
    }

    public void a(Interpolator interpolator)
    {
        Interpolator interpolator1 = interpolator;
        if (interpolator == null)
        {
            interpolator1 = g.l;
        }
        p = interpolator1;
        q = p;
    }

    public void a(Boolean boolean1)
    {
        V = boolean1.booleanValue();
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    public boolean a(MotionEvent motionevent, int i1)
    {
        int j1;
        int k1;
        N = (int)motionevent.getX();
        O = (int)motionevent.getY();
        if (f == 0)
        {
            j1 = N;
        } else
        {
            j1 = O;
        }
        k1 = M;
        M = j1;
        i1;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 87
    //                   1 193
    //                   2 173
    //                   3 341;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        m.a();
        m.a(motionevent);
        I = M;
        J = N;
        K = O;
        L = e;
        H = E;
        if (g == 1)
        {
            o.onFlingIntercepted();
        }
        if (g != 0)
        {
            g = 2;
        }
_L7:
        return true;
_L4:
        m.a(motionevent);
        e(k1 - j1);
        continue; /* Loop/switch isn't completed */
_L3:
        m.a(motionevent);
        m.a(1000);
        float f1;
        if (f == 0)
        {
            f1 = m.b();
        } else
        {
            f1 = m.c();
        }
        n = (int)f1;
        if (n > 500 && I < j1)
        {
            b(H - 1, P);
        } else
        if (n < -500 && I > j1)
        {
            b(H + 1, P);
        } else
        {
            n = 500;
            b(b(e), P);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        b(H, P);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int b()
    {
        int j1;
label0:
        {
            j1 = E;
            int i1 = j1;
            if (r() > 0)
            {
                i1 = j1 - 1;
            }
            if (i1 >= 0)
            {
                j1 = i1;
                if (i1 < A)
                {
                    break label0;
                }
            }
            j1 = -1;
        }
        return j1;
    }

    protected int b(int i1)
    {
        return (D / 2 + i1) / D;
    }

    protected void b(float f1)
    {
        f1 = p.getInterpolation(f1);
        int i1;
        boolean flag;
        if (e())
        {
            i1 = c;
        } else
        {
            i1 = b + Math.round((float)d * f1);
        }
        if (!e() && f1 > 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        G = flag;
        a(i1);
        if (d())
        {
            o.onScrollFinish(a());
        }
        o.postInvalidate();
    }

    protected void b(int i1, int j1)
    {
        Interpolator interpolator = q;
        if (e >= 0 && i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1;
        k1 = 0;
        j1 = Q;
        interpolator = g.k;
_L4:
        a(k1, j1, interpolator);
        return;
_L2:
        if (e < t)
        {
            k1 = i1;
            if (i1 < A)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        k1 = A - 1;
        j1 = Q;
        interpolator = g.k;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b(boolean flag)
    {
        Y = flag;
    }

    public int c()
    {
        int j1 = E;
        int k1 = r();
        if (k1 != 0)
        {
            int i1 = j1;
            if (k1 < 0)
            {
                i1 = j1 + 1;
            }
            if (i1 >= 0 && i1 < A)
            {
                return i1;
            }
        }
        return -1;
    }

    protected int c(int i1)
    {
        i1 /= 2;
        return Math.max(r - e, Math.min(i1, s - e));
    }

    public void c(int i1, int j1)
    {
        f();
        while (B == i1 && C == j1 || i1 <= 0 || j1 <= 0) 
        {
            return;
        }
        B = i1;
        C = j1;
        t();
        m();
    }

    protected int d(int i1)
    {
        return Math.max(0, Math.min(i1, A - 1));
    }

    protected int d(int i1, int j1)
    {
        return (int)Math.abs((p.getInterpolation(1E-06F) * 1000000F * (float)i1 * 1000F) / (float)j1);
    }

    protected void e(int i1)
    {
        int j1;
label0:
        {
            int k1 = e + i1;
            if (k1 >= 0)
            {
                j1 = i1;
                if (k1 < t)
                {
                    break label0;
                }
            }
            j1 = c(i1);
        }
        if (j1 == 0)
        {
            return;
        }
        if (g == 0)
        {
            h();
            o.onScrollStart();
        }
        a(e + j1);
    }

    public void f()
    {
        if (g == 1)
        {
            super.f();
            b(1.0F);
        }
    }

    public void f(int i1)
    {
        f();
        if (i1 == f)
        {
            return;
        }
        e = 0;
        if (i1 == 0)
        {
            o.scrollBy(0, -o.getScrollY());
        } else
        {
            o.scrollBy(-o.getScrollX(), 0);
        }
        f = i1;
        m();
    }

    public void g(int i1)
    {
        float f2 = 0.0F;
        f();
        while (A == i1 || i1 <= 0) 
        {
            return;
        }
        A = i1;
        float f1;
        if (A > 0)
        {
            f1 = 1.0F / (float)A;
        } else
        {
            f1 = 0.0F;
        }
        y = f1;
        t = D * (A - 1);
        v = D * A;
        f1 = f2;
        if (v > 0)
        {
            f1 = 1.0F / (float)v;
        }
        x = f1;
        f1 = z;
        z = -1F;
        a(f1);
    }

    public volatile boolean g()
    {
        return super.g();
    }

    public void h(int i1)
    {
        P = Math.max(1, i1);
    }

    protected void i()
    {
        o.postInvalidate();
    }

    public void i(int i1)
    {
        f();
        F = i1;
        if (F == 0 && e == 0)
        {
            i1 = E;
            E = 0;
            if (E != i1)
            {
                o.onScreenChanged(E, i1);
            }
            return;
        } else
        {
            a(F * D);
            return;
        }
    }

    public volatile float j()
    {
        return super.j();
    }

    public void j(int i1)
    {
        if (W || i1 == ac)
        {
            if (ad != (i1 = Math.min(i1, ac)))
            {
                ad = i1;
                if (i1 <= 0)
                {
                    a(l);
                    return;
                } else
                {
                    a(new OvershootInterpolator(l(i1)));
                    return;
                }
            }
        }
    }

    public void k(int i1)
    {
        ac = Math.max(0, Math.min(i1, 49));
        j(ac);
    }

    protected void m()
    {
        e = 0;
        int i1;
        if (f == 0)
        {
            D = B;
            o.scrollBy(-o.getScrollX(), 0);
        } else
        {
            D = C;
            o.scrollBy(0, -o.getScrollY());
        }
        i1 = A;
        A = -1;
        g(i1);
    }

    public final Interpolator n()
    {
        return q;
    }

    public final int o()
    {
        return B;
    }

    public final int p()
    {
        return C;
    }

    public final int q()
    {
        return D;
    }

    public final int r()
    {
        return E * D - e;
    }

    public boolean s()
    {
        return X;
    }

    protected void t()
    {
        U = ((T + S) - C) / 2;
    }

    void u()
    {
    }

    public float v()
    {
        m.a(1000);
        return (float)Math.sqrt(m.b() * m.b() + m.c() * m.c());
    }

    static 
    {
        boolean flag;
        if (!com/gau/go/launcherex/gowidget/weather/scroller/h.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ae = flag;
    }
}
