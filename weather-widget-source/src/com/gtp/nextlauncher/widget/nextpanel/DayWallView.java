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
//            Wall, l, c

public class DayWallView extends Wall
{

    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L[] = {
        0.75F, 0.8F, 0.85F
    };
    private boolean M;
    private float N;
    private boolean O;
    private boolean P;
    private long Q;
    private long R;
    private float S;
    private float T;
    private float U;
    private float V;
    private float W;
    private float X;
    private float Y[];
    private float Z;
    private final int a = 3;
    private float aa;
    private boolean ab;
    private long ac;
    private long ad;
    private int ae[];
    private int af[];
    private final float ag = 2.0F;
    private final float ah = 1.0F;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private final float ao = 1000F;
    private float ap;
    private long aq;
    private final int b = 1000;
    private GLDrawable c;
    private GLDrawable d;
    private GLDrawable e;
    private GLDrawable f;
    private GLDrawable g;
    private GLDrawable h[];
    private boolean i;
    private long j;
    private boolean k;
    private int l;
    private int m;
    float mCenterPercent[] = {
        0.5F, 0.5F
    };
    float mCloudStartTimeP[] = {
        0.2F, 0.25F, 0.5F, 1.0F
    };
    float mGetCenter[];
    float mGetSize[];
    float mLight2Width;
    float mLight3Width;
    float mLight4Width;
    float mSizePercent[] = {
        0.6F, -1F
    };
    private int n;
    private float o;
    private float p;
    private int q;
    private float r[];
    private float s[];
    private final float t = 1.0F;
    private final float u = 1.0F;
    private final float v = 0.8F;
    private final float w = 0.5F;
    int weatherDeepth;
    private float x;
    private float y;
    private float z;

    public DayWallView(Context context)
    {
        super(context);
        h = new GLDrawable[3];
        i = false;
        k = true;
        l = 0;
        m = 0;
        n = 0;
        o = 0.0F;
        p = 0.0F;
        q = 0;
        r = new float[3];
        s = new float[3];
        x = 0.5F;
        y = 0.0F;
        z = 0.0F;
        A = 0.0F;
        B = 0.0F;
        mLight2Width = 0.0F;
        C = 0.0F;
        D = 0.0F;
        E = 0.0F;
        mLight3Width = 0.0F;
        F = 0.0F;
        G = 0.0F;
        H = 0.0F;
        mLight4Width = 0.0F;
        I = 0.0F;
        J = 0.0F;
        K = 0.0F;
        M = false;
        N = 1.0F;
        O = false;
        P = false;
        Q = 0L;
        R = 2000L;
        S = 0.0F;
        T = 0.0F;
        U = 0.0F;
        V = 0.0F;
        W = 0.0F;
        X = 1.0F;
        Y = new float[3];
        Z = 0.0F;
        aa = 180F;
        ab = false;
        ac = 0L;
        ad = 5000L;
        ae = new int[3];
        af = new int[3];
        mGetCenter = new float[3];
        mGetSize = new float[2];
        ai = false;
        aj = false;
        ak = false;
        al = false;
        am = true;
        an = false;
        ap = 1.0F;
        aq = 0L;
        a(context);
    }

    private void a()
    {
        i = false;
    }

    private void a(float f1)
    {
        float f2 = getInterpor(f1);
        if (k)
        {
            m = (int)((float)l * f2) + n;
            o = (float)(q / 2) * f2;
            p = f2 * (float)(q / 2);
        } else
        {
            m = (int)((1.0F - f2) * (float)l);
            o = (float)(q / 2) * (1.0F - f2);
            p = (1.0F - f2) * (float)(q / 2);
        }
        if (f1 == 1.0F)
        {
            a();
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
    }

    private void a(GLCanvas glcanvas)
    {
        if (h[0] == null)
        {
            return;
        }
        if (ac == -1L)
        {
            ac = getDrawingTime();
        }
        if (ab)
        {
            long l1 = getDrawingTime();
            long l2 = ac;
            float f1;
            int i1;
            int j1;
            if (ad != 0L)
            {
                f1 = (float)(l1 - l2) / (float)ad;
            } else
            {
                f1 = 1.0F;
            }
            f(Math.max(0.0F, Math.min(f1, 1.0F)));
        }
        i1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)(N * (float)i1));
        j1 = glcanvas.save();
        glcanvas.translate(af[0], 0.0F);
        h[0].draw(glcanvas);
        glcanvas.setAlpha(i1);
        glcanvas.restoreToCount(j1);
    }

    private void a(GLDrawable gldrawable, float af1[], float af2[], float f1, int i1, int j1, float af3[], 
            float af4[])
    {
        Object obj;
        if (gldrawable != null)
        {
            if ((obj = getGLRootView()) != null)
            {
                float af5[] = r;
                ((GLContentView) (obj)).getCameraWorldPosition(af5);
                Point point = new Point(af5[0], af5[1], af5[2]);
                float af6[] = r;
                af6[0] = af1[0] * (float)i1;
                af6[1] = -af1[1] * (float)j1;
                af6[2] = 0.0F;
                af1 = new Ray(point, new Point(af6[0], af6[1], af6[2]));
                obj = new Plane(new Point(0.0F, 0.0F, ((GLContentView) (obj)).getDepthForProjectScale(f1)), new Vector(0.0F, 0.0F, 1.0F));
                af1.startCast();
                ((Plane) (obj)).intersect(af1);
                af1 = af1.getHitPoint();
                if (af3 != null)
                {
                    af3[0] = ((Point) (af1)).x;
                    af3[1] = ((Point) (af1)).y;
                    af3[2] = ((Point) (af1)).z;
                }
                float f2;
                float f3;
                float f4;
                float f5;
                if (af2[0] == -1F)
                {
                    f1 = (af2[1] * (float)j1) / f1;
                    f2 = (f1 / (float)gldrawable.getIntrinsicHeight()) * (float)gldrawable.getIntrinsicWidth();
                } else
                {
                    f2 = (af2[0] * (float)i1) / f1;
                    f1 = (f2 / (float)gldrawable.getIntrinsicWidth()) * (float)gldrawable.getIntrinsicHeight();
                }
                if (af4 != null)
                {
                    af4[0] = f2;
                    af4[1] = f1;
                }
                f3 = ((Point) (af1)).x - f2 / 2.0F;
                f4 = ((Point) (af1)).y;
                f4 = f1 / 2.0F + f4;
                f5 = ((Point) (af1)).z;
                gldrawable.setBounds3D(new float[] {
                    f3, f4, f5, f3, f4 - f1, f5, f3 + f2, f4, f5
                }, 0, 3, 6, false, false);
                return;
            }
        }
    }

    private void b()
    {
        P = false;
        if (!M && mWallHoder != null)
        {
            mWallHoder.onPreviewAnimationEnd();
        }
    }

    private void b(float f1)
    {
        if (e == null)
        {
            return;
        } else
        {
            float f2 = mLight2Width * f1;
            f1 = C * f1;
            float f3 = D - f2 / 2.0F;
            float f4 = E + f1 / 2.0F;
            float f5 = weatherDeepth;
            float f6 = weatherDeepth;
            float f7 = weatherDeepth;
            e.setBounds3D(new float[] {
                f3, f4, f5, f3, f4 - f1, f6, f2 + f3, f4, f7
            }, 0, 3, 6, false, false);
            return;
        }
    }

    private void b(int i1, int j1)
    {
        a(i1, j1);
        if (c != null)
        {
            a(c, mCenterPercent, mSizePercent, 0.8F, i1, j1, mGetCenter, mGetSize);
            aj = true;
        }
    }

    private void b(GLCanvas glcanvas)
    {
        if (h[2] != null)
        {
            int i1 = 1;
            while (i1 < 3) 
            {
                int j1 = glcanvas.getAlpha();
                glcanvas.setAlpha((int)(N * (float)j1));
                int k1 = glcanvas.save();
                glcanvas.translate(af[i1], 0.0F);
                if (h[i1] != null)
                {
                    h[i1].draw(glcanvas);
                }
                glcanvas.setAlpha(j1);
                glcanvas.restoreToCount(k1);
                i1++;
            }
        }
    }

    private void c()
    {
        ab = false;
        if (mWallHoder != null)
        {
            mWallHoder.onPreviewAnimationEnd();
        }
    }

    private void c(float f1)
    {
        if (f == null)
        {
            return;
        } else
        {
            float f2 = mLight3Width * f1;
            f1 = F * f1;
            float f3 = G - f2 / 2.0F;
            float f4 = H + f1 / 2.0F;
            float f5 = weatherDeepth;
            float f6 = weatherDeepth;
            float f7 = weatherDeepth;
            f.setBounds3D(new float[] {
                f3, f4, f5, f3, f4 - f1, f6, f2 + f3, f4, f7
            }, 0, 3, 6, false, false);
            return;
        }
    }

    private void c(int i1, int j1)
    {
        if (g == null || d == null || e == null || f == null)
        {
            return;
        }
        l = (int)mGetCenter[2];
        weatherDeepth = (int)mGetCenter[2];
        q = (int)mGetSize[0];
        float f4 = mGetCenter[0];
        float f5 = mGetCenter[1];
        float f2 = mGetSize[1] / 2.0F;
        float f1 = f4 - mGetSize[0] / 2.0F;
        j1 = (int)mGetSize[0];
        int k1 = (int)mGetSize[1];
        f2 = (f2 + f5) - (float)(k1 / 8);
        float f3 = f1 - (float)(j1 / 2);
        float f6 = j1;
        float f7 = f2 + (float)(k1 / 2);
        float f8 = k1;
        float f9 = weatherDeepth;
        float f10 = weatherDeepth;
        float f11 = weatherDeepth;
        if (d != null)
        {
            d.setBounds3D(new float[] {
                f3, f7, f9, f3, f7 - f8, f10, f3 + f6, f7, f11
            }, 0, 3, 6, false, false);
        }
        Y[2] = weatherDeepth;
        Y[1] = f2;
        Y[0] = f1;
        f2 = mGetCenter[0] + mGetSize[0] / 2.0F;
        f6 = mGetCenter[1];
        f7 = mGetSize[1] / 2.0F;
        if (e != null)
        {
            f1 = mGetSize[0] / 10F;
            f3 = (f1 / (float)e.getIntrinsicWidth()) * (float)e.getIntrinsicHeight();
        } else
        {
            f3 = 0.0F;
            f1 = 0.0F;
        }
        D = f2;
        E = f3 / 2.0F + (f6 - f7);
        f6 = E;
        mLight2Width = f1;
        C = f3;
        f2 -= f1 / 2.0F;
        f7 = f6 + f3 / 2.0F;
        f8 = weatherDeepth;
        f9 = weatherDeepth;
        f10 = weatherDeepth;
        if (e != null)
        {
            e.setBounds3D(new float[] {
                f2, f7, f8, f2, f7 - f3, f9, f1 + f2, f7, f10
            }, 0, 3, 6, false, false);
        }
        z = -mGetSize[0] - ((float)i1 * (1.0F - x)) / 2.0F / 0.8F;
        y = -z / 2.0F;
        f6 -= f3 / 2.0F;
        H = f6;
        if (f != null)
        {
            f1 = 2.0F * mLight2Width;
            f2 = (f1 / (float)f.getIntrinsicWidth()) * (float)f.getIntrinsicHeight();
        } else
        {
            f2 = 0.0F;
            f1 = 0.0F;
        }
        mLight3Width = f1;
        F = f2;
        f7 = D + mLight2Width / 2.0F;
        G = f7;
        f7 += f1 / 2.0F;
        f6 += f2 / 2.0F;
        f8 = weatherDeepth;
        f9 = weatherDeepth;
        f10 = weatherDeepth;
        if (f != null)
        {
            f.setBounds3D(new float[] {
                f7, f6, f8, f7, f6 - f2, f9, f7 + f1, f6, f10
            }, 0, 3, 6, false, false);
        }
        A = -(mGetSize[1] + f3) - ((float)i1 * (1.0F - x)) / 2.0F / 0.8F;
        f5 -= (mGetSize[1] + f3 + f2) / 2.0F;
        f4 = (mGetSize[1] + f3 + f2) / 2.0F + f4;
        K = f5;
        J = f4;
        if (g != null)
        {
            f1 = mLight3Width * 2.0F;
            f2 = f1 / (float)g.getIntrinsicWidth();
            f2 = (float)g.getIntrinsicHeight() * f2;
        }
        mLight4Width = f1;
        I = f2;
        f4 = f1 / 2.0F + f4;
        f5 += f2 / 2.0F;
        f6 = weatherDeepth;
        f7 = weatherDeepth;
        f8 = weatherDeepth;
        if (g != null)
        {
            g.setBounds3D(new float[] {
                f4, f5, f6, f4, f5 - f2, f7, f4 + f1, f5, f8
            }, 0, 3, 6, false, false);
        }
        B = -(mGetSize[1] + f3 + f2) - ((float)i1 * (1.0F - x)) / 2.0F / 0.8F;
        ak = true;
    }

    private void d()
    {
        if (aq == -1L)
        {
            aq = getDrawingTime();
        }
        if (an)
        {
            g(Math.max(0.0F, Math.min(1.0F, (float)(getDrawingTime() - aq) / 1000F)));
        }
    }

    private void d(float f1)
    {
        if (g == null)
        {
            return;
        } else
        {
            float f2 = mLight4Width * f1;
            f1 = I * f1;
            float f3 = J - f2 / 2.0F;
            float f4 = K + f1 / 2.0F;
            float f5 = weatherDeepth;
            float f6 = weatherDeepth;
            float f7 = weatherDeepth;
            g.setBounds3D(new float[] {
                f3, f4, f5, f3, f4 - f1, f6, f2 + f3, f4, f7
            }, 0, 3, 6, false, false);
            return;
        }
    }

    private void d(int i1, int j1)
    {
        if (!M)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        if (h[2] != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        mSizePercent[1] = -1F;
        float af1[] = new float[3];
        af1;
        af1[0] = 1.5F;
        af1[1] = 0.8F;
        af1[2] = 1.0F;
        if (j1 < i1)
        {
            mSizePercent[0] = -1F;
            af1[0] = 0.8F;
            af1[1] = 0.4F;
            af1[2] = 0.6F;
        }
        int k1 = 0;
        do
        {
            if (k1 >= 3)
            {
                break MISSING_BLOCK_LABEL_224;
            }
            if (i1 < j1)
            {
                mSizePercent[0] = af1[k1];
            } else
            {
                mSizePercent[1] = af1[k1];
            }
            if (h[k1] == null)
            {
                break;
            }
            a(h[k1], mCenterPercent, mSizePercent, L[k1], i1, j1, null, null);
            if (k1 == 0)
            {
                ae[k1] = (int)(mGetSize[0] + (float)(i1 / 2) / L[k1]);
            } else
            {
                ae[k1] = (int)(-(mGetSize[0] + (float)(i1 / 2) / L[k1]));
            }
            k1++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        al = true;
        return;
    }

    private void e()
    {
        an = true;
        aq = -1L;
        invalidate();
    }

    private void e(float f1)
    {
        S = y * f1;
        T = z * f1;
        U = A * f1;
        V = B * f1;
        if (f1 < 0.5F)
        {
            W = f1 / 0.5F;
        } else
        {
            W = 1.0F - (f1 - 0.5F) / 0.5F;
        }
        X = 4F * (f1 - 0.5F) * (f1 - 0.5F) + 1.0F;
        b(X);
        c(X);
        d(X);
        Z = aa * f1;
        if (f1 == 1.0F)
        {
            b();
        }
        invalidate();
    }

    private void e(int i1, int j1)
    {
        if (!aj)
        {
            b(i1, j1);
        }
        if (M && !al)
        {
            d(i1, j1);
        }
        if (!ak)
        {
            c(i1, j1);
        }
    }

    private void f()
    {
        an = false;
        if (ai)
        {
            startWeatherAnimaiton();
            ai = false;
        }
    }

    private void f(float f1)
    {
        if (f1 >= mCloudStartTimeP[0]) goto _L2; else goto _L1
_L1:
        N = 1.0F - f1 / mCloudStartTimeP[0];
_L4:
        if (f1 == 1.0F)
        {
            c();
        }
        invalidate();
        return;
_L2:
        if (!O)
        {
            for (int i1 = 0; i1 < 3; i1++)
            {
                af[i1] = ae[i1];
            }

            O = true;
        }
        N = 1.0F;
        if (f1 >= mCloudStartTimeP[0])
        {
            float f2 = f1 / (1.0F - mCloudStartTimeP[0]);
            f2 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f2);
            af[0] = (int)((float)ae[0] - f2 * (float)ae[0]);
        }
        if (f1 >= mCloudStartTimeP[1])
        {
            float f3 = (f1 - mCloudStartTimeP[1]) / (1.0F - mCloudStartTimeP[1]);
            f3 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f3);
            af[1] = (int)((float)ae[1] - f3 * (float)ae[1]);
        }
        if (f1 >= mCloudStartTimeP[2])
        {
            float f4 = (f1 - mCloudStartTimeP[2]) / (1.0F - mCloudStartTimeP[2]);
            f4 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f4);
            af[2] = (int)((float)ae[2] - f4 * (float)ae[2]);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void g(float f1)
    {
        ap = f1;
        if (f1 == 1.0F)
        {
            f();
        }
        invalidate();
    }

    private float h(float f1)
    {
        return -(float)Math.pow(2D, -f1);
    }

    public void clearDrawable()
    {
        if (c != null)
        {
            c.clear();
            c = null;
        }
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
        if (f != null)
        {
            f.clear();
            f = null;
        }
        if (g != null)
        {
            g.clear();
            g = null;
        }
        if (h != null)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                if (h[i1] != null)
                {
                    h[i1].clear();
                }
            }

        }
        am = true;
    }

    public void dispatchDraw(GLCanvas glcanvas)
    {
        if (am)
        {
            return;
        }
        d();
        int i1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)((float)i1 * ap));
        if (j == -1L)
        {
            j = getDrawingTime();
        }
        float f1 = Math.max(0.0F, Math.min((float)(getDrawingTime() - j) / 1000F, 1.0F));
        if (i)
        {
            a(f1);
        }
        if (Q == -1L)
        {
            Q = getDrawingTime();
        }
        if (P)
        {
            long l1 = getDrawingTime();
            long l2 = Q;
            float f2;
            int j1;
            int k1;
            if (R != 0L)
            {
                f2 = (float)(l1 - l2) / (float)R;
            } else
            {
                f2 = 1.0F;
            }
            e(Math.max(0.0F, Math.min(f2, 1.0F)));
        }
        glcanvas.translate(o, p, m);
        if (M && al)
        {
            a(glcanvas);
        }
        if (c != null && aj)
        {
            c.draw(glcanvas);
        }
        if (P)
        {
            k1 = glcanvas.save();
            j1 = glcanvas.getAlpha();
            glcanvas.setAlpha((int)((float)j1 * W));
            glcanvas.translate(S, 0.0F);
            glcanvas.translate(Y[0], Y[1], Y[2]);
            glcanvas.rotateAxisAngle(-Z, 0.0F, 0.0F, 1.0F);
            glcanvas.translate(-Y[0], -Y[1], -Y[2]);
            if (d != null)
            {
                d.draw(glcanvas);
            }
            glcanvas.restoreToCount(k1);
            k1 = glcanvas.save();
            glcanvas.translate(T, 0.0F, 0.0F);
            if (e != null)
            {
                e.draw(glcanvas);
            }
            glcanvas.translate(-T, 0.0F, 0.0F);
            glcanvas.translate(U, 0.0F, 0.0F);
            if (f != null)
            {
                f.draw(glcanvas);
            }
            glcanvas.translate(-U, 0.0F, 0.0F);
            glcanvas.translate(V, 0.0F, 0.0F);
            if (g != null)
            {
                g.draw(glcanvas);
            }
            glcanvas.restoreToCount(k1);
            glcanvas.setAlpha(j1);
        }
        if (M && al)
        {
            b(glcanvas);
        }
        glcanvas.setAlpha(i1);
    }

    public void forceAnimationStop()
    {
        if (ab)
        {
            f(1.0F);
        }
        if (P)
        {
            e(1.0F);
        }
    }

    public float getInterpor(float f1)
    {
        f1 = h((float)10 * f1 + (float)-2);
        float f2 = h(8);
        float f3 = h(-2);
        return (f1 - f3) / (f2 - f3);
    }

    public void initDrawable()
    {
        am = true;
        c c1 = new c(this);
        mScheduledExecutorService.submit(c1);
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
            al = false;
            ak = false;
            aj = false;
        }
        e(i1, j1);
    }

    public void setHasCloud(boolean flag)
    {
        M = flag;
    }

    public void startCloudAnimation()
    {
        if (ab)
        {
            return;
        } else
        {
            ab = true;
            ac = -1L;
            O = false;
            invalidate();
            return;
        }
    }

    public boolean startForeAnimation(boolean flag)
    {
        if (i)
        {
            return false;
        } else
        {
            k = flag;
            n = m;
            j = -1L;
            i = true;
            invalidate();
            return true;
        }
    }

    public void startLightAnimation()
    {
        if (P)
        {
            return;
        } else
        {
            S = 0.0F;
            T = 0.0F;
            U = 0.0F;
            V = 0.0F;
            W = 0.0F;
            P = true;
            Q = -1L;
            invalidate();
            return;
        }
    }

    public void startWeatherAnimaiton()
    {
        if (am)
        {
            ai = true;
            return;
        }
        if (!ak || !aj || M && !al)
        {
            ai = true;
            return;
        }
        if (M)
        {
            startCloudAnimation();
        }
        startLightAnimation();
    }



/*
    static GLDrawable access$002(DayWallView daywallview, GLDrawable gldrawable)
    {
        daywallview.c = gldrawable;
        return gldrawable;
    }

*/













/*
    static GLDrawable access$1902(DayWallView daywallview, GLDrawable gldrawable)
    {
        daywallview.d = gldrawable;
        return gldrawable;
    }

*/



/*
    static boolean access$202(DayWallView daywallview, boolean flag)
    {
        daywallview.aj = flag;
        return flag;
    }

*/



/*
    static GLDrawable access$2102(DayWallView daywallview, GLDrawable gldrawable)
    {
        daywallview.e = gldrawable;
        return gldrawable;
    }

*/




/*
    static GLDrawable access$2302(DayWallView daywallview, GLDrawable gldrawable)
    {
        daywallview.f = gldrawable;
        return gldrawable;
    }

*/




/*
    static GLDrawable access$2502(DayWallView daywallview, GLDrawable gldrawable)
    {
        daywallview.g = gldrawable;
        return gldrawable;
    }

*/



/*
    static boolean access$2702(DayWallView daywallview, boolean flag)
    {
        daywallview.ak = flag;
        return flag;
    }

*/









/*
    static boolean access$3302(DayWallView daywallview, boolean flag)
    {
        daywallview.am = flag;
        return flag;
    }

*/








/*
    static boolean access$902(DayWallView daywallview, boolean flag)
    {
        daywallview.al = flag;
        return flag;
    }

*/
}
