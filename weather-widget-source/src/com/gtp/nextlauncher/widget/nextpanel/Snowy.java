// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import android.graphics.Rect;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import java.lang.reflect.Array;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            Wall, l, e, j

public class Snowy extends Wall
{

    private boolean A;
    private boolean B;
    private final float C = 1000F;
    private float D;
    private long E;
    private boolean F;
    private boolean G;
    private final float a = 0.5F;
    private final int b = 3;
    private final int c = 10;
    private GLDrawable d;
    private GLDrawable e;
    private GLDrawable f[];
    private float g[] = {
        0.4F, 0.43F, 0.45F
    };
    private Rect h;
    private float i[];
    private final int j = 15;
    private int k;
    private float l[];
    private boolean m;
    private float n[][];
    private float o[];
    private float p[];
    private final int q = 3000;
    private int r[][];
    private int s[][];
    private boolean t[][];
    private long u[][];
    private final float v = 0.2F;
    private boolean w[][];
    private float x[];
    private float y[][];
    private boolean z;

    public Snowy(Context context)
    {
        super(context);
        f = new GLDrawable[3];
        h = new Rect();
        i = new float[2];
        k = 0;
        l = new float[2];
        m = false;
        n = (float[][])Array.newInstance(Float.TYPE, new int[] {
            3, 10
        });
        o = new float[3];
        p = new float[3];
        r = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            3, 10
        });
        s = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            3, 10
        });
        t = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] {
            3, 10
        });
        u = (long[][])Array.newInstance(Long.TYPE, new int[] {
            3, 10
        });
        w = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] {
            3, 10
        });
        x = new float[3];
        y = (float[][])Array.newInstance(Float.TYPE, new int[] {
            3, 10
        });
        z = false;
        A = false;
        B = false;
        D = 1.0F;
        E = 0L;
        F = false;
        G = true;
        setBackgroundColor(0xffffff);
    }

    private void a()
    {
        int i1;
        int k1;
        if (k > 15)
        {
            z = true;
            mWallHoder.onPreviewAnimationEnd();
            return;
        }
        k1 = (int)(Math.random() * 3D);
        i1 = (int)(Math.random() * 10D);
        if (t[k1][i1]) goto _L2; else goto _L1
_L1:
        d(k1, i1);
_L4:
        k = k + 1;
        return;
_L2:
        int j1 = 0;
        do
        {
            if (j1 < t[k1].length)
            {
label0:
                {
                    if (t[k1][j1])
                    {
                        break label0;
                    }
                    d(k1, j1);
                }
            }
            if (true)
            {
                continue;
            }
            j1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(float f1)
    {
        D = f1;
        if (f1 == 1.0F)
        {
            d();
        }
        invalidate();
    }

    private void a(int i1, int j1)
    {
        float f1 = 0.8F;
        float f2 = 0.4F;
        if (e == null || d == null)
        {
            return;
        }
        if (i1 < j1)
        {
            l[1] = -1F;
            l[0] = 1.2F;
            f1 = 0.4F;
        } else
        {
            l[1] = 0.8F;
            l[0] = -1F;
            f2 = 0.3F;
        }
        if (d != null)
        {
            com.gtp.nextlauncher.widget.nextpanel.e.a(this, d, i1, j1, 0.5F, l, f1, f2, i);
        }
        if (e != null)
        {
            com.gtp.nextlauncher.widget.nextpanel.e.a(this, e, i1, j1, 0.5F, l, f1, f2, i);
        }
        A = true;
    }

    private void a(int i1, int j1, float f1)
    {
        s[i1][j1] = (int)(x[i1] * f1);
        y[i1][j1] = 360F * f1;
        if ((double)f1 < 0.20000000000000001D)
        {
            n[i1][j1] = f1 / 0.2F;
        }
        if ((double)f1 > 0.80000000000000004D)
        {
            n[i1][j1] = (1.0F - f1) / 0.2F;
        }
        if (f1 == 1.0F)
        {
            e(i1, j1);
        }
        if (!w[i1][j1] && f1 > 0.2F)
        {
            a();
            w[i1][j1] = true;
        }
        invalidate();
    }

    private void a(Context context)
    {
        A = false;
        if (d == null)
        {
            d = com.gtp.nextlauncher.widget.nextpanel.e.a().v(context);
        }
        if (e == null)
        {
            e = com.gtp.nextlauncher.widget.nextpanel.e.a().w(context);
        }
        if (mWidth > 0 && mHeight > 0)
        {
            a(mWidth, mHeight);
        }
        if (f[0] == null)
        {
            f[0] = com.gtp.nextlauncher.widget.nextpanel.e.a().D(context);
        }
        if (f[1] == null)
        {
            f[1] = com.gtp.nextlauncher.widget.nextpanel.e.a().E(context);
        }
        if (f[2] == null)
        {
            f[2] = com.gtp.nextlauncher.widget.nextpanel.e.a().F(context);
        }
        if (mWidth > 0 && mHeight > 0)
        {
            b(mWidth, mHeight);
        }
    }

    private void a(GLCanvas glcanvas)
    {
        for (int i1 = 0; i1 < 3; i1++)
        {
            for (int j1 = 0; j1 < 10; j1++)
            {
                if (u[i1][j1] == -1L)
                {
                    u[i1][j1] = getDrawingTime();
                }
                if (!t[i1][j1])
                {
                    continue;
                }
                if (!z)
                {
                    a(i1, j1, Math.max(0.0F, Math.min((float)(getDrawingTime() - u[i1][j1]) / 3000F, 1.0F)));
                }
                int k1 = glcanvas.save();
                int l1 = glcanvas.getAlpha();
                glcanvas.setAlpha((int)((float)l1 * n[i1][j1]));
                glcanvas.translate(r[i1][j1], s[i1][j1]);
                glcanvas.translate(o[i1], p[i1], 0.0F);
                glcanvas.rotateAxisAngle(y[i1][j1], 0.0F, 0.0F, -1F);
                glcanvas.translate(-o[i1], -p[i1], 0.0F);
                if (f[i1] != null)
                {
                    f[i1].draw(glcanvas);
                }
                glcanvas.setAlpha(l1);
                glcanvas.restoreToCount(k1);
            }

        }

    }

    private void b()
    {
        if (E == -1L)
        {
            E = getDrawingTime();
        }
        if (B)
        {
            a(Math.max(0.0F, Math.min(1.0F, (float)(getDrawingTime() - E) / 1000F)));
        }
    }

    private void b(int i1, int j1)
    {
        if (f[2] == null)
        {
            return;
        }
        float f1 = 0.4F;
        float f2 = 0.4F;
        float af[];
        float af1[];
        float af2[];
        if (i1 < j1)
        {
            l[0] = 0.05F;
            l[1] = -1F;
        } else
        {
            l[1] = 0.05F;
            l[0] = -1F;
        }
        if (i1 > j1)
        {
            f1 = 0.85F;
            f2 = 0.3F;
        }
        if (f[0] != null)
        {
            com.gtp.nextlauncher.widget.nextpanel.e.a(this, f[0], i1, j1, g[0], l, f1, f2, i);
        }
        o[0] = i[0];
        p[0] = i[1];
        if (i1 < j1)
        {
            l[0] = 0.08F;
            l[1] = -1F;
        } else
        {
            l[1] = 0.08F;
            l[0] = -1F;
        }
        if (f[1] != null)
        {
            com.gtp.nextlauncher.widget.nextpanel.e.a(this, f[1], i1, j1, g[1], l, f1, f2, i);
        }
        o[1] = i[0];
        p[1] = i[1];
        if (i1 < j1)
        {
            l[0] = 0.07F;
            l[1] = -1F;
        } else
        {
            l[1] = 0.07F;
            l[0] = -1F;
        }
        if (f[2] != null)
        {
            com.gtp.nextlauncher.widget.nextpanel.e.a(this, f[2], i1, j1, g[2], l, f1, f2, i);
        }
        o[2] = i[0];
        p[2] = i[1];
        af = x;
        af1 = x;
        af2 = x;
        f1 = (float)j1 * (1.0F - f2);
        af2[0] = f1;
        af1[1] = f1;
        af[2] = f1;
        c(i1, j1);
        m = false;
    }

    private void c()
    {
        B = true;
        E = -1L;
        invalidate();
    }

    private void c(int i1, int j1)
    {
        int k1 = i1;
        if (i1 > j1)
        {
            k1 = (int)((float)i1 * 0.6F);
        }
        for (i1 = 0; i1 < 3; i1++)
        {
            for (j1 = 0; j1 < 10; j1++)
            {
                int l1 = (int)((float)k1 / g[i1]) / 10;
                r[i1][j1] = l1 * (j1 - 5);
                y[i1][j1] = 0;
                t[i1][j1] = false;
                w[i1][j1] = false;
            }

        }

    }

    private void d()
    {
        B = false;
        if (F)
        {
            startWeatherAnimaiton();
            F = false;
        }
    }

    private void d(int i1, int j1)
    {
        t[i1][j1] = true;
        u[i1][j1] = -1L;
        w[i1][j1] = false;
        invalidate();
    }

    private void e(int i1, int j1)
    {
        t[i1][j1] = false;
    }

    public void clearDrawable()
    {
        if (d != null)
        {
            d.clear();
            d = null;
        }
        if (e != null)
        {
            e.clear();
            e = null;
        }
        if (f[0] != null)
        {
            f[0].clear();
            f[0] = null;
        }
        if (f[1] != null)
        {
            f[1].clear();
            f[1] = null;
        }
        if (f[2] != null)
        {
            f[2].clear();
            f[2] = null;
        }
        G = true;
    }

    public void dispatchDraw(GLCanvas glcanvas)
    {
        if (d == null || G)
        {
            return;
        }
        b();
        int i1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)((float)i1 * D));
        if (A)
        {
            d.draw(glcanvas);
        }
        a(glcanvas);
        if (e != null && A)
        {
            e.draw(glcanvas);
        }
        glcanvas.setAlpha(i1);
    }

    public void forceAnimationStop()
    {
    }

    public void initDrawable()
    {
        G = true;
        j j1 = new j(this);
        mScheduledExecutorService.submit(j1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        h.set(0, 0, i1, j1);
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1 || j1 != l1)
        {
            a(i1, j1);
            b(i1, j1);
        }
    }

    public boolean startForeAnimation(boolean flag)
    {
        return true;
    }

    public void startWeatherAnimaiton()
    {
        if (G)
        {
            return;
        }
        F = false;
        G = false;
        k = 0;
        if (!z)
        {
            a();
            a();
        } else
        {
            int i1 = 0;
            int l1 = 0;
            int j1 = 0;
            while (i1 < 3) 
            {
                int k1 = 0;
                while (k1 < 10) 
                {
                    int i2 = l1;
                    int j2 = j1;
                    if (t[i1][k1])
                    {
                        u[i1][k1] = (long)((float)getDrawingTime() - ((float)s[i1][k1] / x[i1]) * 3000F);
                        if (w[i1][k1])
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
                if (j1 > 2 && l1 < 2)
                {
                    a();
                    a();
                }
                i1++;
            }
        }
        z = false;
    }




/*
    static boolean access$1002(Snowy snowy, boolean flag)
    {
        snowy.F = flag;
        return flag;
    }

*/


/*
    static boolean access$202(Snowy snowy, boolean flag)
    {
        snowy.m = flag;
        return flag;
    }

*/








/*
    static boolean access$802(Snowy snowy, boolean flag)
    {
        snowy.G = flag;
        return flag;
    }

*/

}
