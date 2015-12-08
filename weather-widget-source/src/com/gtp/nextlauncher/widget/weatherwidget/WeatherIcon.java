// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import com.go.gl.animation.Transformation3D;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.view.GLView;
import com.go.gl.widget.GLImageView;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            ad, p, ae

public class WeatherIcon extends GLImageView
{

    private float A;
    private float B;
    private float C;
    private int D;
    private int E;
    private float F;
    private float G;
    private boolean H;
    private float I[] = {
        0.25F, 0.5F
    };
    private float J;
    private int K;
    private double L;
    private float M;
    private float N;
    private float O[];
    private float P[];
    private float Q;
    private long R;
    private long S;
    private boolean T;
    private boolean U;
    private float V;
    private boolean W;
    private boolean X;
    private Transformation3D Y;
    private Transformation3D Z;
    private final int a = 8;
    private GLDrawable b[];
    private final int c = 2;
    private int d[] = {
        -1, 0, 1, -1, -1, -1, -1, -1
    };
    private GLDrawable e[];
    private int f;
    private boolean g;
    private Rect h;
    private GLDrawable i;
    private boolean j;
    private boolean k;
    private Handler l;
    private boolean m;
    int mCx;
    int mCy;
    private long n;
    private int o;
    private boolean p;
    private float q;
    private float r;
    private final float s = 15.70796F;
    private boolean t;
    private int u;
    private int v;
    private long w;
    private int x;
    private int y;
    private float z;

    public WeatherIcon(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new GLDrawable[8];
        e = new GLDrawable[2];
        f = -1;
        g = false;
        j = false;
        k = false;
        l = new ad(this);
        m = false;
        n = 0L;
        o = 1100;
        p = false;
        q = 0.0F;
        r = 0.0F;
        t = false;
        u = 1000;
        v = 0;
        w = 0L;
        z = 0.0F;
        B = -90F;
        C = 0.0F;
        D = 0;
        E = 0;
        F = 0.0F;
        G = 1.0F;
        H = false;
        J = 0.7F;
        K = 30;
        L = 12.566370614359172D;
        O = new float[3];
        P = new float[3];
        Q = 1.0F;
        R = 3000L;
        S = 0L;
        T = false;
        V = 0.0F;
        W = false;
        X = false;
        Y = new Transformation3D();
        Z = new Transformation3D();
        a(context);
    }

    private GLDrawable a(int i1, boolean flag)
    {
        if (i1 < 0 || i1 >= 8)
        {
            return null;
        }
        if (flag)
        {
            int j1 = d[i1];
            if (j1 > -1)
            {
                return e[j1];
            }
        }
        return b[i1];
    }

    private void a()
    {
        if (!m && !k)
        {
            m = true;
            n = -1L;
        }
        setWeather(f, g);
        if (f < 0 || f >= 8)
        {
            return;
        }
        if (g)
        {
            int i1 = d[f];
            if (i1 > -1)
            {
                setImageDrawable(e[i1]);
                invalidate();
                return;
            }
        }
        setImageDrawable(b[f]);
        p = false;
        invalidate();
    }

    private void a(float f1)
    {
        if (f1 < 0.1F)
        {
            return;
        }
        f1 = (f1 - 0.1F) / 0.9F;
        if ((double)f1 < 0.29999999999999999D)
        {
            r = (float)(((double)f1 / 0.29999999999999999D) * (double)q);
            invalidate();
            return;
        }
        if (!p)
        {
            p = true;
            setWeather(f, g);
        }
        if ((double)f1 < 0.5D)
        {
            r = (float)((1.0D - ((double)f1 - 0.29999999999999999D) / 0.20000000000000001D) * (double)q);
        } else
        {
            float f2 = (f1 - 0.5F) / 0.5F;
            r = (float)(Math.sin(L * (double)(1.0F - f2)) * (double)q * 0.30000001192092896D * (double)(1.0F - f2));
        }
        if (f1 == 1.0F)
        {
            c();
        }
        invalidate();
    }

    private void a(Context context)
    {
        for (int i1 = 0; i1 < 8; i1++)
        {
            b[i1] = com.gtp.nextlauncher.widget.weatherwidget.p.a(context, (new int[] {
                0x7f020382, 0x7f02037b, 0x7f020357, 0x7f020376, 0x7f02037a, 0x7f02035e, 0x7f020379, 0x7f02037c
            })[i1]);
        }

        for (int j1 = 0; j1 < 2; j1++)
        {
            e[j1] = com.gtp.nextlauncher.widget.weatherwidget.p.a(context, (new int[] {
                0x7f02036a, 0x7f020358
            })[j1]);
        }

        setIsClearForUpdate(false);
        i = b[0];
    }

    private void b()
    {
        k = true;
        l.removeMessages(0);
        l.sendEmptyMessageDelayed(0, 500L);
    }

    private void b(float f1)
    {
        if ((double)f1 < 0.29999999999999999D)
        {
            F = z + ((A - z) * f1) / 0.3F;
            M = B + ((C - B) * f1) / 0.3F;
            G = (float)(Math.abs(0.29999999999999999D - (double)f1) / 0.29999999999999999D);
            N = f1 / 0.3F;
        } else
        {
            if (!p)
            {
                p = true;
                setWeather(f, g);
                N = 0.0F;
                G = 1.0F;
            }
            float f2 = (f1 - 0.3F) / 0.7F;
            F = (float)(Math.sin(L * (double)f2) * 35D * (double)(1.0F - f2));
        }
        if (f1 == 1.0F)
        {
            d();
        }
        invalidate();
    }

    private void c()
    {
        m = false;
        invalidate();
    }

    private void c(float f1)
    {
        Q = (float)(Math.sin(15.70796F * f1) * (double)0.2F) + 1.0F + V;
        if (W)
        {
            U = true;
            W = false;
            f();
            return;
        }
        if (f1 == 1.0F)
        {
            f();
        }
        invalidate();
    }

    private void d()
    {
        G = 1.0F;
        F = 0.0F;
        t = false;
        D = E;
        invalidate();
    }

    private void e()
    {
        V = 0.0F;
        W = true;
    }

    private void f()
    {
        Q = 1.0F;
        T = false;
        invalidate();
    }

    public void changeWeather(int i1, boolean flag)
    {
        f = i1;
        g = flag;
        if (T)
        {
            e();
        }
        a();
        b();
    }

    public void cleanup()
    {
        boolean flag = false;
        int i1 = 0;
        int j1;
        do
        {
            j1 = ((flag) ? 1 : 0);
            if (i1 >= 8)
            {
                break;
            }
            b[i1].clear();
            i1++;
        } while (true);
        for (; j1 < 2; j1++)
        {
            e[j1].clear();
        }

        super.cleanup();
    }

    public void draw(GLCanvas glcanvas)
    {
        if (!X)
        {
            return;
        }
        int i1 = glcanvas.save();
        if (n == -1L)
        {
            n = getDrawingTime();
        }
        if (m)
        {
            a(Math.max(0.0F, Math.min((float)(getDrawingTime() - n) / (float)o, 1.0F)));
        }
        if (w == -1L)
        {
            w = getDrawingTime();
        }
        if (t)
        {
            b(Math.max(0.0F, Math.min((float)(getDrawingTime() - w) / (float)v, 1.0F)));
        }
        if (S == -1L)
        {
            S = getDrawingTime();
        }
        if (T)
        {
            c(Math.max(0.0F, Math.min((float)(getDrawingTime() - S) / (float)R, 1.0F)));
        }
        glcanvas.clipRect(h);
        glcanvas.translate(0.0F, r, 0.0F);
        glcanvas.translate(x - mWidth / 2, y - mHeight / 2, 0.0F);
        glcanvas.rotate(F);
        glcanvas.translate(-x + mWidth / 2, -y + mHeight / 2, 0.0F);
        glcanvas.translate(mWidth / 2, -mHeight / 2, 0.0F);
        glcanvas.rotate(-F);
        glcanvas.translate(-mWidth / 2, mHeight / 2, 0.0F);
        int j1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)((float)j1 * G));
        glcanvas.scale(Q, Q, P[0], P[1]);
        super.draw(glcanvas);
        glcanvas.setAlpha(j1);
        glcanvas.restoreToCount(i1);
        i1 = glcanvas.save();
        if (t)
        {
            glcanvas.clipRect(h);
            glcanvas.translate(x - mWidth / 2, y - mHeight / 2, 0.0F);
            glcanvas.rotate(M);
            glcanvas.translate(-x + mWidth / 2, -y + mHeight / 2, 0.0F);
            glcanvas.translate(mWidth / 2, -mHeight / 2, 0.0F);
            glcanvas.rotate(-M);
            glcanvas.translate(-mWidth / 2, mHeight / 2, 0.0F);
            int k1 = glcanvas.getAlpha();
            glcanvas.setAlpha((int)((float)k1 * N));
            i.draw(glcanvas);
            glcanvas.setAlpha(k1);
        }
        glcanvas.restoreToCount(i1);
    }

    public Transformation3D getTransformation()
    {
        Y.clear();
        Z.clear();
        Y.setTranslate(x - mWidth, y - mHeight, 0.0F);
        Z.setRotate(F);
        Y.compose(Z);
        Z.clear();
        Z.setTranslate(-x + mWidth, -y + mHeight, 0.0F);
        Y.compose(Z);
        Z.clear();
        Z.setTranslate(mWidth / 2, -mHeight / 2, 0.0F);
        Y.compose(Z);
        Z.clear();
        Z.setRotate(-F);
        Y.compose(Z);
        Z.clear();
        Z.setTranslate(-mWidth / 2, mHeight / 2, 0.0F);
        Y.compose(Z);
        Z.clear();
        return Y;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        k1 = i.getIntrinsicWidth();
        j1 = i.getIntrinsicHeight();
        i1 = Math.max(0, (mWidth - k1) / 2);
        k1 = (k1 + mWidth) / 2;
        k1 = Math.min(mWidth, k1);
        l1 = Math.max(0, (mHeight - j1) / 2);
        j1 = (j1 + mHeight) / 2;
        j1 = Math.min(mHeight, j1);
        i.setBounds(i1, l1, k1, j1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        q = -3F * (float)j1;
        GLView glview = (GLView)getGLParent();
        if (glview != null)
        {
            mCx = glview.getWidth();
            mCy = 0;
            k1 = glview.getHeight();
        } else
        {
            k1 = 0;
        }
        h = new Rect(-i1, j1 * -10, i1 * 4, (k1 * 6) / 4);
        X = true;
    }

    public void setCenter(int i1)
    {
        x = i1;
        y = (int)(-((double)x / Math.tan(1.0471975511965976D)));
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        j = flag;
        if (flag)
        {
            W = true;
            return;
        }
        if (U)
        {
            postDelayed(new ae(this), 500L);
        }
        W = false;
    }

    public void setWeather(int i1, boolean flag)
    {
        if (i1 < 0 || i1 >= 8)
        {
            return;
        }
        if (flag)
        {
            int j1 = d[i1];
            if (j1 > -1)
            {
                setImageDrawable(e[j1]);
                invalidate();
                return;
            }
        }
        setImageDrawable(b[i1]);
        invalidate();
    }

    public void startRotate(int i1, int j1, boolean flag)
    {
        H = false;
        H = true;
        g = flag;
        f = j1;
        E = i1;
        v = u;
        t = true;
        w = -1L;
        A = 90F;
        z = 0.0F;
        F = z;
        p = false;
        G = 1.0F;
        i = a(f, g);
        N = 0.0F;
        M = B;
        invalidate();
    }

    public void startZoom()
    {
        if (j)
        {
            U = true;
            return;
        } else
        {
            U = false;
            T = true;
            Q = 1.0F;
            S = -1L;
            invalidate();
            return;
        }
    }


/*
    static boolean access$002(WeatherIcon weathericon, boolean flag)
    {
        weathericon.k = flag;
        return flag;
    }

*/

}
