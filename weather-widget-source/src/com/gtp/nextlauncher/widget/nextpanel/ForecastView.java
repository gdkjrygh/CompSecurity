// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.Time;
import android.view.MotionEvent;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.go.gl.animation.Transformation3D;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.math3d.Plane;
import com.go.gl.math3d.Point;
import com.go.gl.math3d.Ray;
import com.go.gl.math3d.Vector;
import com.go.gl.view.GLContentView;
import com.go.gl.view.GLLayoutInflater;
import com.go.gl.view.GLRelativeLayout;
import com.go.gl.view.GLView;
import com.go.gl.widget.GLImageView;
import com.go.gl.widget.GLTextView;
import com.gtp.nextlauncher.widget.weatherwidget.e;
import java.util.List;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            e

public class ForecastView extends GLRelativeLayout
{

    private e A;
    private float B;
    private boolean C;
    private Transformation3D D;
    private int E;
    private g F;
    private Time G;
    private float H[] = {
        0.4F, 0.3F, 0.2F, 0.1F, 0.0F
    };
    private float I[] = {
        0.0F, 0.1F, 0.2F, 0.3F, 0.4F
    };
    private boolean J;
    private final int a = 5;
    private final float b = 0.8F;
    float bottomY[];
    private boolean c;
    private long d;
    float deeps[];
    private int e;
    private boolean f;
    private boolean g;
    private float h[];
    private Point i;
    private Point j;
    private final float k = 0.5F;
    private GLView l[];
    private int m;
    boolean mHasGetCanvasT;
    private GLImageView n[];
    private GLTextView o[];
    private GLImageView p[];
    private GLTextView q[];
    private float r;
    private float s[];
    private float t[];
    private float u;
    private String v[];
    private Context w;
    private GLDrawable x[];
    private GLDrawable y[];
    private int z;

    public ForecastView(Context context)
    {
        super(context);
        c = false;
        e = 1000;
        f = true;
        g = false;
        h = new float[3];
        i = new Point();
        j = new Point();
        bottomY = new float[5];
        deeps = new float[5];
        l = new GLView[5];
        m = 80;
        n = new GLImageView[5];
        o = new GLTextView[5];
        p = new GLImageView[5];
        q = new GLTextView[5];
        r = 0.0F;
        s = new float[5];
        t = new float[5];
        u = 0.0F;
        v = new String[7];
        z = 0;
        B = 0.0F;
        mHasGetCanvasT = false;
        C = true;
        D = new Transformation3D();
        E = 0;
        F = null;
        G = new Time();
        J = false;
        w = context;
        a();
    }

    private void a()
    {
        for (int i1 = 0; i1 < 5; i1++)
        {
            GLLayoutInflater gllayoutinflater = GLLayoutInflater.from(w);
            l[i1] = gllayoutinflater.inflate(0x7f030057, null);
            n[i1] = (GLImageView)l[i1].findViewById(0x7f090033);
            o[i1] = (GLTextView)l[i1].findViewById(0x7f090261);
            p[i1] = (GLImageView)l[i1].findViewById(0x7f090262);
            q[i1] = (GLTextView)l[i1].findViewById(0x7f090263);
            addView(l[i1]);
        }

        b();
        a(w);
        J = true;
    }

    private void a(float f1)
    {
        int i1 = 0;
        boolean flag = false;
        if (f)
        {
            for (i1 = ((flag) ? 1 : 0); i1 < 5; i1++)
            {
                float f2 = Math.min(1.0F, Math.max(0.0F, getInterpor((f1 - H[i1]) / 0.6F)));
                s[i1] = (deeps[i1] - r) * f2 + r;
                t[i1] = f2 * (bottomY[i1] - u) + u;
            }

        } else
        {
            for (; i1 < 5; i1++)
            {
                float f3 = Math.min(1.0F, Math.max(0.0F, c((f1 - I[i1]) / 0.6F)));
                s[i1] = (r - deeps[i1]) * f3 + deeps[i1];
                t[i1] = f3 * (u - bottomY[i1]) + bottomY[i1];
            }

        }
        if (f1 == 1.0F)
        {
            c();
        }
        invalidate();
    }

    private void a(int i1, int j1)
    {
        boolean flag = false;
        Ray ray = new Ray();
        Plane plane = new Plane();
        m = l[0].getMeasuredHeight();
        int k1 = l[0].getMeasuredWidth();
        Object obj;
        if (i1 < j1)
        {
            z = (mWidth - k1) / 2;
        } else
        {
            z = mWidth - k1 - 50;
        }
        obj = getGLRootView();
        if (obj != null)
        {
            B = ((GLContentView) (obj)).getDepthForProjectScale(0.8F);
            float f1 = ((GLContentView) (obj)).getDepthForProjectScale(0.5F) / 4F;
            for (int l1 = 0; l1 < 5; l1++)
            {
                deeps[l1] = (float)l1 * f1;
            }

            bottomY[0] = -j1 + m;
            float af[] = h;
            ((GLContentView) (obj)).getCameraWorldPosition(af);
            obj = i;
            ((Point) (obj)).set(af[0], af[1], af[2]);
            Point point = j;
            for (int i2 = 1; i2 < 5; i2++)
            {
                float af1[] = h;
                af1[0] = i1 / 2;
                af1[1] = bottomY[i2 - 1];
                af1[2] = deeps[i2 - 1];
                point.set(af1[0], af1[1], af1[2]);
                ray.set(((Point) (obj)), point);
                ray.startCast();
                plane.set(new Point(0.0F, 0.0F, deeps[i2]), new Vector(0.0F, 0.0F, 1.0F));
                plane.intersect(ray);
                point = ray.getHitPoint();
                bottomY[i2] = point.y + (float)m;
            }

            r = -deeps[1] * 5F - B;
            u = -j1 - m;
            for (i1 = ((flag) ? 1 : 0); i1 < 5; i1++)
            {
                s[i1] = r;
                t[i1] = u;
            }

            if (!f)
            {
                a(1.0F);
                invalidate();
                return;
            }
        }
    }

    private void a(Context context)
    {
        x = com.gtp.nextlauncher.widget.nextpanel.e.a().e(w);
        y = com.gtp.nextlauncher.widget.nextpanel.e.a().f(w);
        setIsClearForUpdateFalse();
    }

    private float b(float f1)
    {
        return -(float)Math.pow(2D, -f1);
    }

    private void b()
    {
        int ai[] = new int[7];
        int[] _tmp = ai;
        ai[0] = 0x7f0801bc;
        ai[1] = 0x7f0801bd;
        ai[2] = 0x7f0801be;
        ai[3] = 0x7f0801bf;
        ai[4] = 0x7f0801c0;
        ai[5] = 0x7f0801c1;
        ai[6] = 0x7f0801c2;
        for (int i1 = 0; i1 < ai.length; i1++)
        {
            v[i1] = w.getResources().getString(ai[i1]);
        }

    }

    private float c(float f1)
    {
        f1 = d((float)10 * f1 + (float)-2);
        float f2 = d(8);
        float f3 = d(-2);
        return (f1 - f3) / (f2 - f3);
    }

    private void c()
    {
        c = false;
    }

    private float d(float f1)
    {
        return (float)Math.pow(2D, f1);
    }

    public void cleanup()
    {
        J = false;
        super.cleanup();
    }

    protected void dispatchDraw(GLCanvas glcanvas)
    {
        if (J)
        {
            if (d == -1L)
            {
                d = getDrawingTime();
            }
            long l1 = getDrawingTime();
            long l2 = d;
            float f1;
            int i1;
            if (e != 0)
            {
                f1 = (float)(l1 - l2) / (float)e;
            } else
            {
                f1 = 1.0F;
            }
            f1 = Math.max(0.0F, Math.min(f1, 1.0F));
            if (c)
            {
                a(f1);
            }
            i1 = 4;
            while (i1 >= 0) 
            {
                int j1 = glcanvas.save();
                glcanvas.translate(0.0F, 0.0F, B);
                glcanvas.translate(z, t[i1], s[i1]);
                if (s[i1] + B < (float)m)
                {
                    l[i1].draw(glcanvas);
                }
                glcanvas.restoreToCount(j1);
                i1--;
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return super.dispatchTouchEvent(motionevent);
    }

    public float getInterpor(float f1)
    {
        f1 = b((float)10 * f1 + (float)-2);
        float f2 = b(8);
        float f3 = b(-2);
        return (f1 - f3) / (f2 - f3);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (flag)
        {
            a(mWidth, mHeight);
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        mHasGetCanvasT = false;
        C = true;
    }

    public void setDataHandler(e e1, int i1)
    {
        A = e1;
        E = i1;
    }

    public void setIsClearForUpdateFalse()
    {
        for (int i1 = 0; i1 < 5; i1++)
        {
            n[i1].setIsClearForUpdate(false);
            p[i1].setIsClearForUpdate(false);
        }

    }

    public void setNight(boolean flag)
    {
        int k1 = 0;
        if (J) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = 0xffd7dfe4;
        g = true;
        for (int i1 = 0; i1 < 5; i1++)
        {
            o[i1].showTextShadow();
            q[i1].showTextShadow();
        }

        a();
        j1 = l1;
_L4:
        while (k1 < 5) 
        {
            o[k1].setTextColor(j1);
            q[k1].setTextColor(j1);
            k1++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        g = false;
        for (j1 = 0; j1 < 5; j1++)
        {
            o[j1].hideTextShadow();
            q[j1].hideTextShadow();
        }

        j1 = 0xff31364c;
        a();
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setTempreture(int i1, String s1)
    {
        if (!J)
        {
            return;
        } else
        {
            q[i1].setText(s1);
            return;
        }
    }

    public void setWeatherIcon(int i1, GLDrawable gldrawable)
    {
        if (!J)
        {
            return;
        } else
        {
            p[i1].setImageDrawable(gldrawable);
            return;
        }
    }

    public void setWeekday(int i1, String s1)
    {
        if (!J)
        {
            return;
        } else
        {
            o[i1].setText(s1);
            return;
        }
    }

    public boolean startForeAnimation(boolean flag)
    {
        updateUI();
        if (c)
        {
            return false;
        } else
        {
            f = flag;
            d = -1L;
            invalidate();
            c = true;
            return true;
        }
    }

    public void updateUI()
    {
        if (J)
        {
            if (F == null)
            {
                F = new g(w);
            }
            GLDrawable agldrawable[];
            if (!g)
            {
                agldrawable = x;
            } else
            {
                agldrawable = y;
            }
            if (A.b(E) != null)
            {
                int i1 = A.b(E).l.n();
                G = F.b(i1);
                int i2 = G.month + 1;
                int k2 = G.monthDay;
                java.util.ArrayList arraylist = A.b(E).g;
                byte byte0 = -1;
                if (arraylist != null && arraylist.size() > 0)
                {
                    int k1 = 0;
label0:
                    do
                    {
label1:
                        {
                            int j1 = byte0;
                            if (k1 < arraylist.size())
                            {
                                ForecastBean forecastbean = (ForecastBean)arraylist.get(k1);
                                if ((forecastbean.f() != i2 || forecastbean.g() != k2) && (forecastbean.f() != i2 || forecastbean.g() <= k2) && forecastbean.f() <= i2)
                                {
                                    break label1;
                                }
                                j1 = k1;
                            }
                            if (j1 >= 0 && j1 < arraylist.size())
                            {
                                k1 = j1;
                                while (k1 < j1 + 5 && k1 < arraylist.size() && k1 - j1 < 5) 
                                {
                                    ForecastBean forecastbean1 = (ForecastBean)arraylist.get(k1);
                                    int l1;
                                    int j2;
                                    if (k1 == j1)
                                    {
                                        n[k1 - j1].setBackgroundColor(0x555555ff);
                                        l[k1 - j1].setBackgroundResource(0x7f0205c5);
                                    } else
                                    {
                                        n[k1 - j1].setBackgroundColor(0xffffff);
                                        l[k1 - j1].setBackgroundColor(0xffffff);
                                    }
                                    l1 = forecastbean1.i() - 1;
                                    if (l1 >= 0 && l1 < 8)
                                    {
                                        setWeatherIcon(k1 - j1, agldrawable[forecastbean1.i() - 1]);
                                    } else
                                    {
                                        setWeatherIcon(k1 - j1, agldrawable[0]);
                                    }
                                    setWeekday(k1 - j1, forecastbean1.h());
                                    l1 = (int)forecastbean1.b(e.a);
                                    j2 = (int)forecastbean1.a(e.a);
                                    setTempreture(k1 - j1, (new StringBuilder()).append(l1).append("\260").append("/").append(j2).append("\260").toString());
                                    k1++;
                                }
                            }
                            break label0;
                        }
                        k1++;
                    } while (true);
                }
                invalidate();
                return;
            }
        }
    }
}
