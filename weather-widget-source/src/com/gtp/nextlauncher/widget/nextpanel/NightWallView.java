// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import android.view.animation.Interpolator;
import com.go.gl.animation.InterpolatorFactory;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.math3d.Plane;
import com.go.gl.math3d.Point;
import com.go.gl.math3d.Ray;
import com.go.gl.math3d.Vector;
import com.go.gl.view.GLContentView;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            Wall, l, e, f

public class NightWallView extends Wall
{

    public static float sWallB = 0.0F;
    private boolean A;
    private long B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private int I;
    private float J[] = {
        0.75F, 0.8F, 0.85F
    };
    private boolean K;
    private long L;
    private long M;
    private int N[];
    private int O[];
    private float P[] = {
        0.2F, 0.25F, 0.5F, 1.0F
    };
    private float Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private final float X = 1000F;
    private float Y;
    private long Z;
    private int a;
    private boolean aa;
    private boolean ab;
    private GLDrawable b;
    private GLDrawable c;
    private GLDrawable d;
    private GLDrawable e;
    private float f[];
    private float g[];
    private boolean h;
    private GLDrawable i[];
    private final float j = 1.0F;
    private final float k = 1.0F;
    private final float l = 0.8F;
    private final float m = 0.7F;
    float mCenterPercent[] = {
        0.6F, 0.5F
    };
    float mGetCenter[];
    float mGetSize[];
    float mSizePercent[] = {
        0.6F, -1F
    };
    private final float n = 0.8F;
    private final float o = 0.5F;
    private float p;
    private final int q = 18;
    private float r[];
    private float s[];
    private boolean t[];
    private long u[];
    private int v[];
    private float w[];
    int weatherDeepth;
    private boolean x[];
    private int y;
    private int z;

    public NightWallView(Context context)
    {
        super(context);
        a = 1000;
        f = new float[3];
        g = new float[3];
        h = false;
        i = new GLDrawable[3];
        p = 0.6F;
        r = new float[18];
        s = new float[18];
        t = new boolean[18];
        u = new long[18];
        v = new int[18];
        w = new float[18];
        x = new boolean[18];
        y = 15;
        z = 0;
        A = false;
        C = true;
        D = 0;
        E = 0;
        F = 0;
        G = 0.0F;
        H = 0.0F;
        I = 0;
        K = false;
        L = 0L;
        M = 5000L;
        N = new int[3];
        O = new int[3];
        Q = 1.0F;
        R = false;
        S = false;
        mGetCenter = new float[3];
        mGetSize = new float[2];
        T = false;
        U = false;
        V = false;
        W = false;
        Y = 1.0F;
        Z = 0L;
        aa = false;
        ab = true;
        a(context);
    }

    private void a()
    {
        A = false;
    }

    private void a(float f1)
    {
        float f2 = getInterpor(f1);
        if (C)
        {
            E = (int)((float)D * f2) + F;
            G = (float)(I / 2) * f2;
            H = f2 * (float)(I / 2);
        } else
        {
            E = (int)((1.0F - f2) * (float)D);
            G = (float)(I / 2) * (1.0F - f2);
            H = (1.0F - f2) * (float)(I / 2);
        }
        if (f1 == 1.0F)
        {
            a();
        }
        invalidate();
    }

    private void a(int i1)
    {
        if (z >= y)
        {
            if (!h && mWallHoder != null)
            {
                mWallHoder.onPreviewAnimationEnd();
            }
            return;
        } else
        {
            t[i1] = false;
            z = z + 1;
            c(mContext);
            u[i1] = -1L;
            x[i1] = true;
            invalidate();
            return;
        }
    }

    private void a(int i1, float f1)
    {
        w[i1] = 4F * (f1 - 0.5F) * (f1 - 0.5F);
        if (f1 == 1.0F)
        {
            c(i1);
        }
        if ((double)f1 > 0.5D && !t[i1])
        {
            b(i1);
        }
        invalidate();
    }

    private void a(int i1, int j1)
    {
        mCenterPercent[0] = 0.5F;
        mCenterPercent[1] = 0.5F;
        mSizePercent[0] = 0.6F;
        mSizePercent[1] = -1F;
        if (i1 > j1)
        {
            mSizePercent[0] = -1F;
            mSizePercent[1] = 0.6F;
            mCenterPercent[1] = 0.5F;
            mCenterPercent[0] = 0.6F;
        }
    }

    private void a(Context context)
    {
        mContext = context;
        setBackgroundColor(0xffffff);
        for (int i1 = 0; i1 < 18; i1++)
        {
            v[i1] = 500;
            x[i1] = false;
            w[i1] = 1.0F;
        }

    }

    private void a(GLCanvas glcanvas)
    {
        if (L == -1L)
        {
            L = getDrawingTime();
        }
        if (K)
        {
            long l1 = getDrawingTime();
            long l2 = L;
            float f1;
            int i1;
            int j1;
            if (M != 0L)
            {
                f1 = (float)(l1 - l2) / (float)M;
            } else
            {
                f1 = 1.0F;
            }
            b(Math.max(0.0F, Math.min(f1, 1.0F)));
        }
        i1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)(Q * (float)i1));
        j1 = glcanvas.save();
        glcanvas.translate(O[0], 0.0F);
        if (i[0] != null)
        {
            i[0].draw(glcanvas);
        }
        glcanvas.setAlpha(i1);
        glcanvas.restoreToCount(j1);
    }

    private void a(GLDrawable gldrawable, float af[], float af1[], float f1, int i1, int j1, float af2[], 
            float af3[])
    {
        Object obj;
        if (gldrawable != null)
        {
            if ((obj = getGLRootView()) != null)
            {
                float af4[] = f;
                ((GLContentView) (obj)).getCameraWorldPosition(af4);
                Point point = new Point(af4[0], af4[1], af4[2]);
                float af5[] = f;
                af5[0] = af[0] * (float)i1;
                af5[1] = -af[1] * (float)j1;
                af5[2] = 0.0F;
                af = new Ray(point, new Point(af5[0], af5[1], af5[2]));
                obj = new Plane(new Point(0.0F, 0.0F, ((GLContentView) (obj)).getDepthForProjectScale(f1)), new Vector(0.0F, 0.0F, 1.0F));
                af.startCast();
                ((Plane) (obj)).intersect(af);
                af = af.getHitPoint();
                if (af2 != null)
                {
                    af2[0] = ((Point) (af)).x;
                    af2[1] = ((Point) (af)).y;
                    af2[2] = ((Point) (af)).z;
                }
                float f2;
                float f3;
                float f4;
                float f5;
                if (af1[0] == -1F)
                {
                    f1 = (af1[1] * (float)j1) / f1;
                    f2 = (f1 / (float)gldrawable.getIntrinsicHeight()) * (float)gldrawable.getIntrinsicWidth();
                } else
                {
                    f2 = (af1[0] * (float)i1) / f1;
                    f1 = (f2 / (float)gldrawable.getIntrinsicWidth()) * (float)gldrawable.getIntrinsicHeight();
                }
                if (af3 != null)
                {
                    af3[0] = f2;
                    af3[1] = f1;
                }
                f3 = ((Point) (af)).x - f2 / 2.0F;
                f4 = ((Point) (af)).y;
                f4 = f1 / 2.0F + f4;
                f5 = ((Point) (af)).z;
                gldrawable.setBounds3D(new float[] {
                    f3, f4, f5, f3, f4 - f1, f5, f3 + f2, f4, f5
                }, 0, 3, 6, false, false);
                return;
            }
        }
    }

    private boolean a(boolean flag)
    {
        if (A)
        {
            return false;
        } else
        {
            C = flag;
            F = E;
            B = -1L;
            A = true;
            invalidate();
            return true;
        }
    }

    private void b()
    {
        K = false;
        if (mWallHoder != null)
        {
            mWallHoder.onPreviewAnimationEnd();
        }
    }

    private void b(float f1)
    {
        if (f1 >= P[0]) goto _L2; else goto _L1
_L1:
        Q = 1.0F - f1 / P[0];
_L4:
        if (f1 == 1.0F)
        {
            b();
        }
        invalidate();
        return;
_L2:
        if (!R)
        {
            for (int i1 = 0; i1 < 3; i1++)
            {
                O[i1] = N[i1];
            }

            R = true;
        }
        Q = 1.0F;
        if (f1 >= P[0])
        {
            float f2 = f1 / (1.0F - P[0]);
            f2 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f2);
            O[0] = (int)((float)N[0] - f2 * (float)N[0]);
        }
        if (f1 >= P[1])
        {
            float f3 = (f1 - P[1]) / (1.0F - P[1]);
            f3 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f3);
            O[1] = (int)((float)N[1] - f3 * (float)N[1]);
        }
        if (f1 >= P[2])
        {
            float f4 = (f1 - P[2]) / (1.0F - P[2]);
            f4 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f4);
            O[2] = (int)((float)N[2] - f4 * (float)N[2]);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(int i1)
    {
        t[i1] = true;
        a(Math.min(17, Math.max(0, (int)(Math.random() * 18D))));
    }

    private void b(int i1, int j1)
    {
        a(i1, j1);
        if (e != null)
        {
            a(e, mCenterPercent, mSizePercent, 0.8F, i1, j1, mGetCenter, mGetSize);
            T = true;
        }
    }

    private void b(Context context)
    {
        i[0] = com.gtp.nextlauncher.widget.nextpanel.e.a().x(context);
        i[1] = com.gtp.nextlauncher.widget.nextpanel.e.a().B(context);
        i[2] = com.gtp.nextlauncher.widget.nextpanel.e.a().C(context);
    }

    private void b(GLCanvas glcanvas)
    {
        for (int i1 = 1; i1 < 3; i1++)
        {
            int j1 = glcanvas.getAlpha();
            glcanvas.setAlpha((int)(Q * (float)j1));
            int k1 = glcanvas.save();
            glcanvas.translate(O[i1], 0.0F);
            if (i[i1] != null)
            {
                i[i1].draw(glcanvas);
            }
            glcanvas.setAlpha(j1);
            glcanvas.restoreToCount(k1);
        }

    }

    private float c(float f1)
    {
        return -(float)Math.pow(2D, -f1);
    }

    private void c()
    {
        z = 0;
        a(1);
    }

    private void c(int i1)
    {
        x[i1] = false;
    }

    private void c(int i1, int j1)
    {
        if (i[2] != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            if (!h)
            {
                break label0;
            }
            mSizePercent[1] = -1F;
            float af[] = new float[3];
            af;
            af[0] = 1.5F;
            af[1] = 0.8F;
            af[2] = 1.0F;
            if (j1 < i1)
            {
                mSizePercent[0] = -1F;
                af[0] = 0.8F;
                af[1] = 0.4F;
                af[2] = 0.6F;
            }
            int k1 = 0;
            do
            {
                if (k1 >= 3)
                {
                    break label0;
                }
                if (i1 < j1)
                {
                    mSizePercent[0] = af[k1];
                } else
                {
                    mSizePercent[1] = af[k1];
                }
                if (i[k1] == null)
                {
                    break;
                }
                a(i[k1], mCenterPercent, mSizePercent, J[k1], i1, j1, null, null);
                if (k1 == 0)
                {
                    N[k1] = (int)(mGetSize[0] + (float)(i1 / 2) / J[k1]);
                } else
                {
                    N[k1] = (int)(-(mGetSize[0] + (float)(i1 / 2) / J[k1]));
                }
                k1++;
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        U = true;
        return;
    }

    private void c(Context context)
    {
        b = com.gtp.nextlauncher.widget.nextpanel.e.a().l(context);
        c = com.gtp.nextlauncher.widget.nextpanel.e.a().m(context);
        d = com.gtp.nextlauncher.widget.nextpanel.e.a().n(context);
    }

    private void c(GLCanvas glcanvas)
    {
        int i1 = 0;
        while (i1 < 18) 
        {
            int j1 = glcanvas.save();
            glcanvas.translate(r[i1], s[i1], 0.0F);
            if (u[i1] == -1L)
            {
                u[i1] = getDrawingTime();
            }
            if (x[i1])
            {
                a(i1, Math.min(1.0F, Math.max(0.0F, (float)(getDrawingTime() - u[i1]) / (float)v[i1])));
            }
            int k1 = glcanvas.getAlpha();
            glcanvas.setAlpha((int)((float)k1 * w[i1]));
            if (i1 < 6)
            {
                if (c != null)
                {
                    c.draw(glcanvas);
                }
            } else
            if (i1 < 12)
            {
                if (b != null)
                {
                    b.draw(glcanvas);
                }
            } else
            if (d != null)
            {
                d.draw(glcanvas);
            }
            glcanvas.setAlpha(k1);
            glcanvas.restoreToCount(j1);
            i1++;
        }
    }

    private void d()
    {
        if (Z == -1L)
        {
            Z = getDrawingTime();
        }
        if (W)
        {
            d(Math.max(0.0F, Math.min(1.0F, (float)(getDrawingTime() - Z) / 1000F)));
        }
    }

    private void d(float f1)
    {
        Y = f1;
        if (f1 == 1.0F)
        {
            f();
        }
        invalidate();
    }

    private void d(int i1, int j1)
    {
        GLContentView glcontentview;
        if (b != null && c != null && d != null)
        {
            if ((glcontentview = getGLRootView()) != null)
            {
                D = (int)mGetCenter[2];
                weatherDeepth = (int)mGetCenter[2];
                I = (int)mGetSize[0];
                float f5 = mGetCenter[0] - mGetSize[0] / 2.0F;
                float f6 = mGetSize[0];
                float f2 = mGetCenter[1] + mGetSize[1] / 2.0F;
                float f3 = mGetSize[1];
                float f1 = (float)b.getIntrinsicWidth() / 0.8F;
                float f4 = (float)b.getIntrinsicHeight() / 0.8F;
                f5 = (f5 + (f6 + f5)) / 2.0F;
                f6 = (f2 + (f2 - f3)) / 2.0F;
                f2 = (int)(f5 - f1 / 2.0F);
                f3 = (int)(f2 + f1);
                f5 = (int)(f4 / 2.0F + f6);
                f4 = (int)(f5 - f4);
                f6 = weatherDeepth;
                float f7 = weatherDeepth;
                float f8 = weatherDeepth;
                b.setBounds3D(new float[] {
                    f2, f5, f6, f2, f4, f7, f3, f5, f8
                }, 0, 3, 6, false, false);
                f6 = glcontentview.getDepthForProjectScale(0.7F);
                c.setBounds3D(new float[] {
                    f2, f5, f6, f2, f4, f6, f3, f5, f6
                }, 0, 3, 6, false, false);
                f6 = glcontentview.getDepthForProjectScale(0.8F);
                d.setBounds3D(new float[] {
                    f2, f5, f6, f2, f4, f6, f3, f5, f6
                }, 0, 3, 6, false, false);
                f2 = mGetSize[1] / 2.0F;
                double ad[] = new double[18];
                double[] _tmp = ad;
                ad[0] = 0.19634954084936207D;
                ad[1] = 1.1780972450961724D;
                ad[2] = 2.3561944901923448D;
                ad[3] = 2.748893571891069D;
                ad[4] = 3.5342917352885173D;
                ad[5] = 5.497787143782138D;
                ad[6] = 0.39269908169872414D;
                ad[7] = 0.78539816339744828D;
                ad[8] = 1.5707963267948966D;
                ad[9] = 3.9269908169872414D;
                ad[10] = 4.7123889803846897D;
                ad[11] = 5.1050880620834143D;
                ad[12] = 0.19634954084936207D;
                ad[13] = 1.1780972450961724D;
                ad[14] = 2.3561944901923448D;
                ad[15] = 2.748893571891069D;
                ad[16] = 3.5342917352885173D;
                ad[17] = 5.497787143782138D;
                f1 /= 2.0F;
                float af[] = new float[18];
                af[0] = f2;
                af[1] = f2 + f1;
                af[2] = f2 + f1;
                af[3] = f2 + f1;
                af[4] = f2;
                af[5] = f2 + f1;
                af[6] = 2.0F * f1 + f2;
                af[7] = f1 / 2.0F + f2;
                af[8] = f2 + f1;
                af[9] = f2 + f1;
                af[10] = f1 / 2.0F + f2;
                af[11] = f2 + f1;
                af[12] = f2;
                af[13] = f2 + f1;
                af[14] = f2 + f1;
                af[15] = f2 + f1;
                af[16] = f2;
                af[17] = f2 + f1;
                for (i1 = 0; i1 < 18; i1++)
                {
                    r[i1] = (float)((double)af[i1] * Math.sin(ad[i1]));
                    s[i1] = (float)((double)af[i1] * Math.cos(ad[i1]));
                }

                V = true;
                return;
            }
        }
    }

    private void e()
    {
        W = true;
        Z = -1L;
        invalidate();
    }

    private void f()
    {
        W = false;
        if (aa)
        {
            startWeatherAnimaiton();
            aa = false;
        }
    }

    public void clearDrawable()
    {
        if (e != null)
        {
            e.clear();
            e = null;
        }
        if (b != null)
        {
            b.clear();
        }
        if (c != null)
        {
            c.clear();
        }
        if (d != null)
        {
            d.clear();
        }
        for (int i1 = 0; i1 < 3; i1++)
        {
            if (i[i1] != null)
            {
                i[i1].clear();
            }
        }

        ab = true;
    }

    public void dispatchDraw(GLCanvas glcanvas)
    {
        if (e == null || ab)
        {
            return;
        }
        d();
        int i1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)((float)i1 * Y));
        if (B == -1L)
        {
            B = getDrawingTime();
        }
        long l1 = getDrawingTime();
        long l2 = B;
        float f1;
        if (a != 0)
        {
            f1 = (float)(l1 - l2) / (float)a;
        } else
        {
            f1 = 1.0F;
        }
        f1 = Math.max(0.0F, Math.min(f1, 1.0F));
        if (A)
        {
            a(f1);
        }
        glcanvas.translate(G, H, E);
        if (h && U)
        {
            a(glcanvas);
        }
        if (T)
        {
            e.draw(glcanvas);
        }
        c(glcanvas);
        if (h && U)
        {
            b(glcanvas);
        }
        glcanvas.setAlpha(i1);
    }

    public void forceAnimationStop()
    {
        if (K)
        {
            b(1.0F);
        }
    }

    public float getInterpor(float f1)
    {
        f1 = c((float)10 * f1 + (float)-2);
        float f2 = c(8);
        float f3 = c(-2);
        return (f1 - f3) / (f2 - f3);
    }

    public void initDrawable()
    {
        if (e == null)
        {
            ab = true;
        }
        if (h && i[0] == null)
        {
            ab = true;
        }
        f f1 = new f(this);
        mScheduledExecutorService.submit(f1);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1 || j1 != l1)
        {
            U = false;
            V = false;
            T = false;
        }
        if (!T)
        {
            b(i1, j1);
        }
        if (h && !U)
        {
            c(i1, j1);
        }
        if (!V)
        {
            d(i1, j1);
        }
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        super.setDrawingCacheEnabled(flag);
    }

    public void setHasCloud(boolean flag)
    {
        h = flag;
    }

    public void startCloudAnimation()
    {
        if (K)
        {
            return;
        } else
        {
            K = true;
            L = -1L;
            R = false;
            invalidate();
            return;
        }
    }

    public boolean startForeAnimation(boolean flag)
    {
        return a(flag);
    }

    public void startWeatherAnimaiton()
    {
        if (ab || W)
        {
            aa = true;
        } else
        {
            aa = false;
            c();
            if (h)
            {
                startCloudAnimation();
                return;
            }
        }
    }




/*
    static GLDrawable access$002(NightWallView nightwallview, GLDrawable gldrawable)
    {
        nightwallview.e = gldrawable;
        return gldrawable;
    }

*/



/*
    static boolean access$1002(NightWallView nightwallview, boolean flag)
    {
        nightwallview.V = flag;
        return flag;
    }

*/










/*
    static boolean access$1902(NightWallView nightwallview, boolean flag)
    {
        nightwallview.U = flag;
        return flag;
    }

*/



/*
    static boolean access$202(NightWallView nightwallview, boolean flag)
    {
        nightwallview.T = flag;
        return flag;
    }

*/







/*
    static boolean access$2502(NightWallView nightwallview, boolean flag)
    {
        nightwallview.ab = flag;
        return flag;
    }

*/



/*
    static boolean access$2702(NightWallView nightwallview, boolean flag)
    {
        nightwallview.aa = flag;
        return flag;
    }

*/







}
