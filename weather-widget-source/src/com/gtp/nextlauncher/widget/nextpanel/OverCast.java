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
//            Wall, l, e, g

public class OverCast extends Wall
{

    public static float sWallB = 0.0F;
    private final int a = 3;
    private GLDrawable b[];
    private float c[] = {
        0.55F, 0.6F, 0.65F
    };
    private boolean d;
    private long e;
    private long f;
    private int g[];
    private int h[];
    private float i[] = {
        0.2F, 0.25F, 0.5F, 1.0F
    };
    private float j;
    private boolean k;
    private float l[][];
    private boolean m;
    private float n[];
    private boolean o;
    private final float p = 1000F;
    private float q;
    private long r;
    private boolean s;
    private boolean t;

    public OverCast(Context context)
    {
        super(context);
        b = new GLDrawable[3];
        d = false;
        e = 0L;
        f = 5000L;
        g = new int[3];
        h = new int[3];
        j = 1.0F;
        k = false;
        l = new float[3][];
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
        d = false;
        if (mWallHoder != null)
        {
            mWallHoder.onPreviewAnimationEnd();
        }
    }

    private void a(float f1)
    {
        if (f1 >= i[0]) goto _L2; else goto _L1
_L1:
        j = 1.0F - f1 / i[0];
_L4:
        if (f1 == 1.0F)
        {
            a();
        }
        invalidate();
        return;
_L2:
        if (!k)
        {
            for (int i1 = 0; i1 < 3; i1++)
            {
                h[i1] = g[i1];
            }

            k = true;
        }
        j = 1.0F;
        if (f1 >= i[0])
        {
            float f2 = f1 / (1.0F - i[0]);
            f2 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f2);
            h[0] = (int)((float)g[0] - f2 * (float)g[0]);
        }
        if (f1 >= i[1])
        {
            float f3 = (f1 - i[1]) / (1.0F - i[1]);
            f3 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f3);
            h[1] = (int)((float)g[1] - f3 * (float)g[1]);
        }
        if (f1 >= i[2])
        {
            float f4 = (f1 - i[2]) / (1.0F - i[2]);
            f4 = InterpolatorFactory.getInterpolator(2, 5).getInterpolation(f4);
            h[2] = (int)((float)g[2] - f4 * (float)g[2]);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int i1, int j1)
    {
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
        af4[1] = 0.8F;
        af4[2] = 1.0F;
        if (j1 < i1)
        {
            af1[0] = -1F;
            af4[0] = 0.8F;
            af4[1] = 0.4F;
            af4[2] = 0.6F;
        }
        int k1 = 0;
        do
        {
label0:
            {
                if (k1 < 3)
                {
                    if (i1 < j1)
                    {
                        af1[0] = af4[k1];
                    } else
                    {
                        af1[1] = af4[k1];
                    }
                    if (b[k1] != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            a(b[k1], af, af1, c[k1], i1, j1, af2, af3);
            if (k1 == 0)
            {
                g[k1] = (int)(af3[0] + (float)(i1 / 2) / c[k1]);
            } else
            {
                g[k1] = (int)(-(af3[0] + (float)(i1 / 2) / c[k1]));
            }
            k1++;
        } while (true);
    }

    private void a(Context context)
    {
        mContext = context;
        b(context);
        setBackgroundColor(0xffffff);
    }

    private void a(GLCanvas glcanvas)
    {
        if (e == -1L)
        {
            e = getDrawingTime();
        }
        if (d)
        {
            long l1 = getDrawingTime();
            long l2 = e;
            float f1;
            int i1;
            int j1;
            int k1;
            if (f != 0L)
            {
                f1 = (float)(l1 - l2) / (float)f;
            } else
            {
                f1 = 1.0F;
            }
            a(Math.max(0.0F, Math.min(f1, 1.0F)));
        }
        for (i1 = 0; i1 < 3; i1++)
        {
            j1 = glcanvas.getAlpha();
            glcanvas.setAlpha((int)(j * (float)j1));
            k1 = glcanvas.save();
            glcanvas.translate(h[i1], 0.0F);
            if (b[i1] != null)
            {
                b[i1].draw(glcanvas);
            }
            glcanvas.setAlpha(j1);
            glcanvas.restoreToCount(k1);
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

    private void b(int i1, int j1)
    {
        a(i1, j1);
        m = false;
    }

    private void b(Context context)
    {
        m = true;
        b[0] = com.gtp.nextlauncher.widget.nextpanel.e.a().y(context);
        b[1] = com.gtp.nextlauncher.widget.nextpanel.e.a().z(context);
        b[2] = com.gtp.nextlauncher.widget.nextpanel.e.a().A(context);
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
        for (int i1 = 0; i1 < 3; i1++)
        {
            if (b[i1] != null)
            {
                b[i1].clear();
                b[i1] = null;
            }
        }

        t = true;
    }

    public void dispatchDraw(GLCanvas glcanvas)
    {
        if (t)
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
        if (d)
        {
            a(1.0F);
        }
    }

    public void initDrawable()
    {
        t = true;
        g g1 = new g(this);
        mScheduledExecutorService.submit(g1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        b(i1, j1);
    }

    public void startCloudAnimation()
    {
        if (d || t)
        {
            s = true;
            return;
        } else
        {
            s = false;
            d = true;
            e = -1L;
            k = false;
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
        if (t || o)
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
    static boolean access$1002(OverCast overcast, boolean flag)
    {
        overcast.s = flag;
        return flag;
    }

*/


/*
    static boolean access$202(OverCast overcast, boolean flag)
    {
        overcast.m = flag;
        return flag;
    }

*/








/*
    static boolean access$802(OverCast overcast, boolean flag)
    {
        overcast.t = flag;
        return flag;
    }

*/

}
