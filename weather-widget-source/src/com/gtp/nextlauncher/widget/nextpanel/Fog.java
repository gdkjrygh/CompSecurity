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
//            Wall, l, d

public class Fog extends Wall
{

    private final int a = 3;
    private final float b[] = {
        0.5F, 0.55F, 0.66F
    };
    private GLDrawable c[];
    private boolean d;
    private boolean e;
    private long f;
    private long g;
    private int h[];
    private int i[];
    private float j[] = {
        0.2F, 0.4F, 0.5F, 1.0F
    };
    private float k[];
    private boolean l;
    private boolean m;
    private float n[];
    private boolean o;
    private final float p = 1000F;
    private float q;
    private long r;
    private boolean s;
    private boolean t;

    public Fog(Context context)
    {
        super(context);
        c = new GLDrawable[3];
        d = false;
        e = true;
        f = 0L;
        g = 5000L;
        h = new int[3];
        i = new int[3];
        k = new float[3];
        l = false;
        m = false;
        n = new float[3];
        o = false;
        q = 1.0F;
        r = 0L;
        s = false;
        t = true;
        a(context);
    }

    private void a()
    {
        e = false;
        if (mWallHoder != null)
        {
            mWallHoder.onPreviewAnimationEnd();
        }
    }

    private void a(float f1)
    {
        boolean flag = false;
        int i1 = 0;
        if (f1 < j[0])
        {
            float f2 = f1 / j[0];
            for (; i1 < 3; i1++)
            {
                k[i1] = 1.0F - f2;
            }

        } else
        {
            if (!l)
            {
                for (int j1 = 0; j1 < 3; j1++)
                {
                    i[j1] = h[j1];
                }

                l = true;
            }
            if (f1 >= j[0])
            {
                float f3 = (f1 - j[0]) / (1.0F - j[0]);
                f3 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f3);
                i[0] = (int)((float)h[0] - (float)h[0] * f3);
                for (int k1 = ((flag) ? 1 : 0); k1 < 3; k1++)
                {
                    k[k1] = f3;
                }

            }
            if (f1 >= j[1])
            {
                float f4 = (f1 - j[1]) / (1.0F - j[1]);
                f4 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f4);
                i[1] = (int)((float)h[1] - f4 * (float)h[1]);
            }
            if (f1 >= j[2])
            {
                float f5 = (f1 - j[2]) / (1.0F - j[2]);
                f5 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f5);
                i[2] = (int)((float)h[2] - f5 * (float)h[2]);
            }
        }
        if (f1 == 1.0F)
        {
            a();
        }
        invalidate();
    }

    private void a(int i1, int j1)
    {
        if (c[2] == null)
        {
            return;
        }
        float af[] = new float[2];
        float[] _tmp = af;
        af[0] = 0.5F;
        af[1] = 0.5F;
        float af1[] = new float[2];
        float[] _tmp1 = af1;
        af1[0] = 0.6F;
        af1[1] = -1F;
        float af2[] = new float[3];
        float af3[] = new float[2];
        if (i1 > j1)
        {
            af1[0] = -1F;
            af1[1] = 0.6F;
            af[1] = 0.5F;
            af[0] = 0.6F;
        }
        af1[1] = -1F;
        float af4[] = new float[3];
        float[] _tmp2 = af4;
        af4[0] = 1.5F;
        af4[1] = 1.5F;
        af4[2] = 1.5F;
        if (j1 < i1)
        {
            af1[0] = -1F;
            af4[0] = 0.8F;
            af4[1] = 0.8F;
            af4[2] = 0.8F;
        }
        float af5[] = new float[3];
        float[] _tmp3 = af5;
        af5[0] = 0.0F;
        af5[1] = -0.25F;
        af5[2] = -0.25F;
        int k1 = 0;
        while (k1 < 3) 
        {
            int l1;
            if (i1 < j1)
            {
                af1[0] = af4[k1];
            } else
            {
                af1[1] = af4[k1];
            }
            af[1] = af[1] - af5[k1];
            a(c[k1], af, af1, b[k1], i1, j1, af2, af3);
            af[1] = af[1] + af5[k1];
            l1 = (int)Math.max(af3[0], (float)i1 / b[k1]);
            h[k1] = (int)((float)(l1 * (new int[] {
                1, 1, -1
            })[k1]) * (new float[] {
                1.0F, 1.0F, 1.0F
            })[k1]);
            k1++;
        }
        d = false;
        m = true;
    }

    private void a(Context context)
    {
        setBackgroundColor(0xffffff);
        for (int i1 = 0; i1 < 3; i1++)
        {
            k[i1] = 1.0F;
        }

    }

    private void a(GLCanvas glcanvas)
    {
        if (m)
        {
            if (f == -1L)
            {
                f = getDrawingTime();
            }
            long l1 = getDrawingTime();
            long l2 = f;
            float f1;
            int i1;
            if (g != 0L)
            {
                f1 = (float)(l1 - l2) / (float)g;
            } else
            {
                f1 = 1.0F;
            }
            if (e)
            {
                a(Math.max(0.0F, Math.min(f1, 1.0F)));
            }
            i1 = 0;
            while (i1 < 3) 
            {
                int j1 = glcanvas.getAlpha();
                glcanvas.setAlpha((int)(k[i1] * (float)j1));
                int k1 = glcanvas.save();
                glcanvas.translate(i[i1], 0.0F);
                if (c[i1] != null)
                {
                    c[i1].draw(glcanvas);
                }
                glcanvas.setAlpha(j1);
                glcanvas.restoreToCount(k1);
                i1++;
            }
        }
    }

    private void a(GLDrawable gldrawable, float af[], float af1[], float f1, int i1, int j1, float af2[], 
            float af3[])
    {
        Object obj;
        if (gldrawable != null)
        {
            if ((obj = getGLRootView()) != null)
            {
                float af4[] = n;
                ((GLContentView) (obj)).getCameraWorldPosition(af4);
                Point point = new Point(af4[0], af4[1], af4[2]);
                float af5[] = n;
                af5[0] = af[0] * (float)i1;
                af5[1] = -af[1] * (float)j1;
                af5[2] = 0.0F;
                af = new Ray(point, new Point(af5[0], af5[1], af5[2]));
                obj = new Plane(new Point(0.0F, 0.0F, ((GLContentView) (obj)).getDepthForProjectScale(f1)), new Vector(0.0F, 0.0F, 1.0F));
                af.startCast();
                ((Plane) (obj)).intersect(af);
                af = af.getHitPoint();
                af2[0] = ((Point) (af)).x;
                af2[1] = ((Point) (af)).y;
                af2[2] = ((Point) (af)).z;
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
                af3[0] = f2;
                af3[1] = f1;
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

    private void b()
    {
        if (r == -1L)
        {
            r = getDrawingTime();
        }
        if (o)
        {
            b(Math.max(0.0F, Math.min(1.0F, (float)(getDrawingTime() - r) / 1000F)));
        }
    }

    private void b(float f1)
    {
        q = f1;
        if (f1 == 1.0F)
        {
            d();
        }
        invalidate();
    }

    private void c()
    {
        o = true;
        r = -1L;
        invalidate();
    }

    private void d()
    {
        o = false;
        if (s)
        {
            startWeatherAnimaiton();
            s = false;
        }
    }

    public void clearDrawable()
    {
        c[0] = null;
        c[1] = null;
        c[2] = null;
        t = true;
    }

    public void dispatchDraw(GLCanvas glcanvas)
    {
        if (c[0] == null)
        {
            return;
        } else
        {
            b();
            int i1 = glcanvas.getAlpha();
            glcanvas.setAlpha((int)((float)i1 * q));
            a(glcanvas);
            glcanvas.setAlpha(i1);
            return;
        }
    }

    public void forceAnimationStop()
    {
        if (e)
        {
            a(1.0F);
        }
    }

    public void initDrawable()
    {
        t = true;
        d d1 = new d(this);
        mScheduledExecutorService.submit(d1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        a(i1, j1);
    }

    public void startCloudAnimation()
    {
        if (e)
        {
            return;
        } else
        {
            e = true;
            f = -1L;
            l = false;
            invalidate();
            return;
        }
    }

    public boolean startForeAnimation(boolean flag)
    {
        return true;
    }

    public void startWeatherAnimaiton()
    {
        if (t)
        {
            s = true;
            return;
        } else
        {
            s = false;
            startCloudAnimation();
            return;
        }
    }






/*
    static boolean access$1102(Fog fog, boolean flag)
    {
        fog.t = flag;
        return flag;
    }

*/



/*
    static boolean access$1302(Fog fog, boolean flag)
    {
        fog.s = flag;
        return flag;
    }

*/




/*
    static boolean access$402(Fog fog, boolean flag)
    {
        fog.d = flag;
        return flag;
    }

*/


/*
    static boolean access$502(Fog fog, boolean flag)
    {
        fog.m = flag;
        return flag;
    }

*/




}
