// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import android.graphics.Rect;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.view.GLView;
import java.lang.reflect.Array;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            Wall, e, l, i

public class RainyView extends Wall
{

    private boolean A;
    private float B;
    private float C[];
    private final int D = 10;
    private int E;
    private boolean F;
    private float G[];
    private final float H = 1.0F;
    private boolean I[];
    private float J[];
    private float K[];
    private long L[];
    private float M;
    private float N[][];
    private boolean O[];
    private float P;
    private boolean Q;
    private final int R = 6;
    private float S[];
    private long T;
    private final int U = 1000;
    private final float V = 0.3333333F;
    private GLDrawable W[];
    private final float X = 0.4F;
    private GLView Y;
    private float Z[] = {
        2.0F, 1.0F, 1.5F, 1.0F, 2.0F, 3F, 1.5F, 2.0F, 1.5F, 3F
    };
    private Context a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private final float ae = 1000F;
    private float af;
    private long ag;
    private boolean ah;
    private boolean ai;
    private boolean b;
    private boolean c;
    private boolean d;
    private GLDrawable e;
    private GLDrawable f;
    private final int g = 3;
    private GLDrawable h[];
    private GLDrawable i;
    private final float j = 0.5F;
    private final float k[] = {
        0.3F, 0.35F, 0.4F
    };
    private Rect l;
    private float m;
    private boolean n;
    private final float o = 0.6F;
    private final int p = 100;
    private final int q = 200;
    private int r[][];
    private int s[][];
    private int t[][];
    private boolean u[][];
    private long v[][];
    private final int w = 800;
    private final float x = 0.05F;
    private boolean y[][];
    private boolean z;

    public RainyView(Context context)
    {
        super(context);
        b = false;
        c = false;
        d = false;
        h = new GLDrawable[3];
        l = new Rect();
        m = 0.0F;
        n = false;
        r = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            3, 100
        });
        s = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            3, 100
        });
        t = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            3, 100
        });
        u = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] {
            3, 100
        });
        v = (long[][])Array.newInstance(Long.TYPE, new int[] {
            3, 100
        });
        y = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] {
            3, 100
        });
        z = false;
        A = false;
        B = 0.0F;
        C = new float[2];
        E = 0;
        F = false;
        G = new float[3];
        I = new boolean[10];
        J = new float[10];
        K = new float[10];
        L = new long[10];
        M = 2000F;
        N = (float[][])Array.newInstance(Float.TYPE, new int[] {
            10, 3
        });
        O = new boolean[10];
        P = 0.2F;
        Q = false;
        S = new float[6];
        aa = false;
        ab = false;
        ac = false;
        ad = false;
        af = 1.0F;
        ag = 0L;
        ah = false;
        ai = true;
        a = context;
        setBackgroundColor(0xffffff);
    }

    private void a()
    {
        if (z)
        {
            double d1 = Math.random();
            int i1 = (int)(10D * d1);
            if (!I[i1])
            {
                int j1 = (int)((double)G[2] * (1.0D - d1));
                int k1 = (int)((double)mWidth / (0.60000002384185791D * d1));
                N[i1][0] = (float)((d1 - 0.5D) * (double)k1);
                N[i1][2] = j1;
                a(i1);
                F = false;
                return;
            }
        }
    }

    private void a(float f1)
    {
        int i1 = 0;
        while (i1 < 6) 
        {
            float f2 = (f1 - 0.1666667F * (float)i1) / 0.3333333F;
            if (f2 < 0.0F || f2 > 1.0F)
            {
                S[i1] = 0.0F;
            } else
            {
                S[i1] = 1.0F;
            }
            i1++;
        }
        if (f1 < 0.1F || (double)f1 > 0.20000000000000001D && (double)f1 < 0.29999999999999999D || (double)f1 > 0.59999999999999998D && (double)f1 < 0.69999999999999996D)
        {
            B = 1.0F;
        } else
        {
            B = 0.0F;
        }
        if (f1 == 1.0F)
        {
            c();
        }
        invalidate();
    }

    private void a(int i1)
    {
        I[i1] = true;
        L[i1] = -1L;
        O[i1] = false;
        invalidate();
    }

    private void a(int i1, float f1)
    {
        J[i1] = 1.0F - f1;
        K[i1] = Z[i1] * f1;
        if (f1 > P && !O[i1])
        {
            a();
            O[i1] = true;
        }
        if (f1 == 1.0F)
        {
            b(i1);
        }
        invalidate();
    }

    private void a(int i1, int j1)
    {
        float f1 = 0.8F;
        float f2 = 0.4F;
        if (e == null || f == null)
        {
            return;
        }
        if (i1 < j1)
        {
            C[1] = -1F;
            C[0] = 1.2F;
            f1 = 0.4F;
        } else
        {
            C[1] = 0.8F;
            C[0] = -1F;
            f2 = 0.3F;
        }
        if (e != null)
        {
            com.gtp.nextlauncher.widget.nextpanel.e.a(this, e, i1, j1, 0.5F, C, f1, f2, null);
        }
        if (f != null)
        {
            com.gtp.nextlauncher.widget.nextpanel.e.a(this, f, i1, j1, 0.5F, C, f1, f2, null);
        }
        aa = true;
    }

    private void a(int i1, int j1, float f1)
    {
        t[i1][j1] = (int)(m * f1);
        if (f1 == 1.0F)
        {
            g(i1, j1);
        }
        if (!y[i1][j1] && f1 > 0.05F)
        {
            f(i1, j1);
            y[i1][j1] = true;
        }
        invalidate();
    }

    private void a(int i1, int j1, float f1, float f2)
    {
        if (h[2] == null || i == null)
        {
            return;
        }
        C[0] = -1F;
        C[1] = 0.1F;
        if (h[0] != null)
        {
            com.gtp.nextlauncher.widget.nextpanel.e.a(this, h[0], i1, j1, k[0], C, f1, f2, null);
        }
        com.gtp.nextlauncher.widget.nextpanel.e.a(this, h[1], i1, j1, k[1], C, f1 + 0.1F, f2, null);
        com.gtp.nextlauncher.widget.nextpanel.e.a(this, h[2], i1, j1, k[2], C, f1 - 0.1F, f2, null);
        m = 0.7F * (float)j1;
        C[0] = 0.2F;
        com.gtp.nextlauncher.widget.nextpanel.e.a(this, i, i1, j1, 0.6F, C, f1, 1.0F, G);
        d(i1, j1);
    }

    private void a(Context context)
    {
        if (e == null)
        {
            e = com.gtp.nextlauncher.widget.nextpanel.e.a().v(context);
        }
        if (f == null)
        {
            f = com.gtp.nextlauncher.widget.nextpanel.e.a().w(context);
        }
    }

    private void a(GLCanvas glcanvas)
    {
        int k1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)((float)k1 * 1.0F));
        for (int i1 = 0; i1 < 3; i1++)
        {
            for (int j1 = 0; j1 < 100; j1++)
            {
                if (v[i1][j1] == -1L)
                {
                    v[i1][j1] = getDrawingTime();
                }
                if (!u[i1][j1])
                {
                    continue;
                }
                float f1 = Math.max(0.0F, Math.min((float)(getDrawingTime() - v[i1][j1]) / 800F, 1.0F));
                if (!F)
                {
                    a(i1, j1, f1);
                }
                int l1 = glcanvas.save();
                glcanvas.translate(r[i1][j1], t[i1][j1]);
                if (h[i1] != null)
                {
                    h[i1].draw(glcanvas);
                }
                glcanvas.restoreToCount(l1);
            }

        }

        glcanvas.setAlpha(k1);
    }

    private void b()
    {
        Q = true;
        T = -1L;
        invalidate();
    }

    private void b(float f1)
    {
        af = f1;
        if (f1 == 1.0F)
        {
            f();
        }
        invalidate();
    }

    private void b(int i1)
    {
        I[i1] = false;
    }

    private void b(int i1, int j1)
    {
        float f2 = 0.8F;
        float f1 = 0.4F;
        if (i1 < j1)
        {
            C[1] = -1F;
            C[0] = 1.2F;
            f2 = 0.4F;
        } else
        {
            C[1] = 0.8F;
            C[0] = -1F;
            f1 = 0.3F;
        }
        if (c)
        {
            a(i1, j1, f2, f1);
        }
        ab = true;
    }

    private void b(Context context)
    {
        if (h[0] == null)
        {
            h[0] = com.gtp.nextlauncher.widget.nextpanel.e.a().G(context);
        }
        if (h[1] == null)
        {
            h[1] = com.gtp.nextlauncher.widget.nextpanel.e.a().H(context);
        }
        if (h[2] == null)
        {
            h[2] = com.gtp.nextlauncher.widget.nextpanel.e.a().I(context);
        }
        if (i == null)
        {
            i = com.gtp.nextlauncher.widget.nextpanel.e.a().J(context);
        }
    }

    private void b(GLCanvas glcanvas)
    {
        for (int i1 = 0; i1 < 10; i1++)
        {
            if (L[i1] == -1L)
            {
                L[i1] = getDrawingTime();
            }
            if (!I[i1])
            {
                continue;
            }
            float f1 = Math.min(1.0F, Math.max(0.0F, (float)(getDrawingTime() - L[i1]) / M));
            if (!F)
            {
                a(i1, f1);
            }
            int j1 = glcanvas.save();
            int k1 = glcanvas.getAlpha();
            glcanvas.setAlpha((int)((float)k1 * J[i1]));
            glcanvas.translate(N[i1][0], N[i1][1], N[i1][2]);
            glcanvas.translate(G[0], G[1], G[2]);
            glcanvas.scale(K[i1], K[i1], K[i1]);
            glcanvas.translate(-G[0], -G[1], -G[2]);
            if (i != null)
            {
                i.draw(glcanvas);
            }
            glcanvas.setAlpha(k1);
            glcanvas.restoreToCount(j1);
        }

    }

    private void c()
    {
        Q = false;
        F = true;
        A = false;
    }

    private void c(int i1, int j1)
    {
        if (W == null || W[5] == null)
        {
            return;
        }
        if (i1 < j1)
        {
            C[1] = -1F;
            C[0] = 1.2F;
        } else
        {
            C[1] = 0.8F;
            C[0] = -1F;
        }
        C[0] = -1F;
        C[1] = 0.5F;
        for (int k1 = 0; k1 < 6; k1++)
        {
            if (W[k1] != null)
            {
                com.gtp.nextlauncher.widget.nextpanel.e.a(this, W[k1], i1, j1, 0.4F, C, 0.5F, 0.75F, null);
            }
        }

        C[0] = 1.0F;
        C[1] = -1F;
        ac = true;
    }

    private void c(Context context)
    {
        W = com.gtp.nextlauncher.widget.nextpanel.e.a().K(context);
    }

    private void c(GLCanvas glcanvas)
    {
        if (W != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!Q)
        {
            break; /* Loop/switch isn't completed */
        }
        if (T == -1L)
        {
            T = getDrawingTime();
        }
        a(Math.max(0.0F, Math.min(1.0F, (float)(getDrawingTime() - T) / 1000F)));
        int i1 = 0;
        while (i1 < 6) 
        {
            int j1 = glcanvas.getAlpha();
            glcanvas.setAlpha((int)((float)j1 * S[i1]));
            if (W[i1] != null)
            {
                W[i1].draw(glcanvas);
            }
            glcanvas.setAlpha(j1);
            i1++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (W[5] == null) goto _L1; else goto _L4
_L4:
        W[5].draw(glcanvas);
        return;
    }

    private void d()
    {
        if (ag == -1L)
        {
            ag = getDrawingTime();
        }
        if (ad)
        {
            b(Math.max(0.0F, Math.min(1.0F, (float)(getDrawingTime() - ag) / 1000F)));
        }
    }

    private void d(int i1, int j1)
    {
        int k1 = i1;
        if (i1 > j1)
        {
            k1 = (int)((float)i1 * 0.4F);
        }
        for (i1 = 0; i1 < 3; i1++)
        {
            for (int l1 = 0; l1 < 100; l1++)
            {
                int i2 = (int)((float)k1 / (k[i1] * 1.5F)) / 100;
                r[i1][l1] = i2 * (l1 - 50);
                i2 = (int)((float)j1 / k[i1]);
                s[i1][l1] = i2;
                u[i1][l1] = false;
                y[i1][l1] = false;
            }

        }

    }

    private void e()
    {
        ad = true;
        ag = -1L;
        invalidate();
    }

    private void e(int i1, int j1)
    {
        u[i1][j1] = true;
        v[i1][j1] = -1L;
        y[i1][j1] = false;
        invalidate();
    }

    private void f()
    {
        ad = false;
        if (ah)
        {
            startWeatherAnimaiton();
            ah = false;
        }
    }

    private void f(int i1, int j1)
    {
        if (!z)
        {
            return;
        }
        if (E > 200)
        {
            mWallHoder.onPreviewAnimationEnd();
            F = true;
            A = false;
            return;
        } else
        {
            E = E + 1;
            e(i1, (i1 * 11 + j1) % 100);
            return;
        }
    }

    private void g(int i1, int j1)
    {
        u[i1][j1] = false;
        a();
    }

    public void clearDrawable()
    {
        boolean flag = false;
        if (W != null)
        {
            for (int i1 = 0; i1 < 6; i1++)
            {
                if (W[i1] != null)
                {
                    W[i1].clear();
                }
            }

        }
        if (e != null)
        {
            e.clear();
            e = null;
        }
        if (f != null)
        {
            f.clear();
            f = null;
        }
        if (h != null)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < 3; j1++)
            {
                if (h[j1] != null)
                {
                    h[j1].clear();
                    h[j1] = null;
                }
            }

        }
        if (i != null)
        {
            i.clear();
            i = null;
        }
        ai = true;
    }

    public void dispatchDraw(GLCanvas glcanvas)
    {
        if (e == null || ai)
        {
            return;
        }
        d();
        int i1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)((float)i1 * af));
        if (d)
        {
            int j1 = glcanvas.getAlpha();
            glcanvas.setAlpha((int)((float)j1 * B));
            if (Y != null)
            {
                Y.draw(glcanvas);
            }
            glcanvas.setAlpha(j1);
        }
        super.dispatchDraw(glcanvas);
        if (c)
        {
            a(glcanvas);
            b(glcanvas);
        }
        if (e != null && aa)
        {
            e.draw(glcanvas);
        }
        if (d)
        {
            c(glcanvas);
        }
        if (f != null && aa)
        {
            f.draw(glcanvas);
        }
        glcanvas.setAlpha(i1);
    }

    public void forceAnimationStop()
    {
        if (Q)
        {
            a(1.0F);
        }
    }

    public void initDrawable()
    {
        aa = false;
        ai = true;
        i i1 = new i(this);
        mScheduledExecutorService.submit(i1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        l.set(0, 0, i1, j1);
        if (i1 != k1 || j1 != l1)
        {
            aa = false;
            ab = false;
            ac = false;
        }
        if (!aa)
        {
            a(i1, j1);
        }
        if (c && !ab)
        {
            b(i1, j1);
        }
        if (d && !ac)
        {
            c(i1, j1);
        }
        if (Y != null)
        {
            Y.layout(0, 0, i1, j1);
            b = true;
        }
    }

    public void setHasRain(boolean flag)
    {
        c = flag;
    }

    public void setHasThunder(boolean flag)
    {
        d = flag;
        Y = new GLView(a);
        Y.setBackgroundColor(0x55c2eeff);
        if (!b && mWidth > 0 && mHeight > 0)
        {
            Y.layout(0, 0, mWidth, mHeight);
            b = true;
        }
    }

    public boolean startForeAnimation(boolean flag)
    {
        return true;
    }

    public void startWeatherAnimaiton()
    {
        if (A || ai)
        {
            return;
        }
        ah = false;
        E = 0;
        z = true;
        if (!F)
        {
            e(2, 0);
            e(0, 16);
            e(1, 33);
            e(0, 99);
            e(1, 80);
            e(2, 50);
        } else
        {
            int i1 = 0;
            int l1 = 0;
            int j1 = 0;
            for (; i1 < 3; i1++)
            {
                int k1 = 0;
                while (k1 < 100) 
                {
                    int i2 = l1;
                    int j2 = j1;
                    if (u[i1][k1])
                    {
                        v[i1][k1] = (long)((float)getDrawingTime() - ((float)t[i1][k1] / m) * 800F);
                        if (y[i1][k1])
                        {
                            j2 = j1 + 1;
                            i2 = l1;
                        } else
                        {
                            i2 = l1 + 1;
                            j2 = j1;
                        }
                    }
                    k1++;
                    l1 = i2;
                    j1 = j2;
                }
            }

            if (j1 > l1 || l1 + j1 < 6)
            {
                e(0, 16);
                e(1, 33);
                e(0, 99);
                e(1, 80);
            }
            i1 = 0;
            while (i1 < 10) 
            {
                if (I[i1])
                {
                    L[i1] = (long)((float)getDrawingTime() - (K[i1] / Z[i1]) * M);
                }
                i1++;
            }
        }
        F = false;
        A = true;
        b();
        invalidate();
    }











/*
    static boolean access$1702(RainyView rainyview, boolean flag)
    {
        rainyview.ac = flag;
        return flag;
    }

*/









/*
    static boolean access$2302(RainyView rainyview, boolean flag)
    {
        rainyview.ai = flag;
        return flag;
    }

*/



/*
    static boolean access$2502(RainyView rainyview, boolean flag)
    {
        rainyview.ah = flag;
        return flag;
    }

*/








/*
    static boolean access$902(RainyView rainyview, boolean flag)
    {
        rainyview.ab = flag;
        return flag;
    }

*/
}
