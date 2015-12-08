// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.p;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.view.GLContentView;
import com.go.gl.view.GLLayoutInflater;
import com.go.gl.view.GLRelativeLayout;
import com.go.gowidget.core.FullScreenNextWidgetCallback;
import com.gtp.nextlauncher.widget.weatherwidget.e;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            l, WeatherDespView, ForecastView, PanelMain, 
//            Wall, m, b

public class CityView extends GLRelativeLayout
    implements l
{

    private float A;
    private float B;
    private FullScreenNextWidgetCallback C;
    private boolean D;
    private ForecastView a;
    private int b;
    private e c;
    private WeatherDespView d;
    private boolean e;
    private boolean f;
    private Wall g;
    private boolean h;
    private int i;
    private boolean j;
    private long k;
    private float l;
    private float m;
    boolean mIsInRiseAnimation;
    protected float mOffSet;
    private float n;
    private float o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private long u;
    private int v;
    private int w;
    private float x;
    private float y;
    private float z[];

    public CityView(Context context)
    {
        super(context);
        b = 0;
        mOffSet = 0.0F;
        e = false;
        f = true;
        h = false;
        i = -1;
        j = false;
        k = 0L;
        mIsInRiseAnimation = false;
        l = 1.0F;
        m = 0.0F;
        n = 0.0F;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        t = false;
        u = 0L;
        w = 0;
        x = 0.0F;
        y = 0.0F;
        A = 0.0F;
        B = 0.0F;
        D = false;
        a(context);
    }

    public CityView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
        mOffSet = 0.0F;
        e = false;
        f = true;
        h = false;
        i = -1;
        j = false;
        k = 0L;
        mIsInRiseAnimation = false;
        l = 1.0F;
        m = 0.0F;
        n = 0.0F;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        t = false;
        u = 0L;
        w = 0;
        x = 0.0F;
        y = 0.0F;
        A = 0.0F;
        B = 0.0F;
        D = false;
        a(context);
    }

    private void a()
    {
        Object obj = "";
        int i1;
        if (c.i() > 0)
        {
            obj = c.k();
            i1 = c.l();
        } else
        {
            i1 = -1;
        }
        obj = com.gau.go.launcherex.gowidget.weather.util.p.a(getContext(), ((String) (obj)), true, 18, "", -1);
        ((Intent) (obj)).addFlags(0x4000000);
        ((Intent) (obj)).putExtra("gowidget_Id", v);
        ((Intent) (obj)).putExtra("isMyLocation", i1);
        getContext().startActivity(((Intent) (obj)));
    }

    private void a(float f1)
    {
        l = 1.0F - f1;
        m = f1;
        y = x * f1;
        B = A * f1;
        n = -o * f1;
        if (f1 == 1.0F)
        {
            b();
        }
        invalidate();
    }

    private void a(Context context)
    {
        mContext = context;
        d = (WeatherDespView)GLLayoutInflater.from(context).inflate(0x7f0300d6, null);
        a = new ForecastView(mContext);
        D = true;
    }

    private void a(GLCanvas glcanvas)
    {
        if (u == -1L)
        {
            u = getDrawingTime();
        }
        if (mIsInRiseAnimation)
        {
            a(Math.max(0.0F, Math.min((float)(getDrawingTime() - u) / 500F, 1.0F)));
        }
        if (k == -1L)
        {
            k = getDrawingTime();
        }
        if (j)
        {
            b(Math.max(0.0F, Math.min((float)(getDrawingTime() - k) / 300F, 1.0F)));
        }
        int i1 = glcanvas.save();
        int j1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)((float)j1 * l));
        glcanvas.translate(-mOffSet, 0.0F);
        glcanvas.clipRect(PanelMain.sClickRect);
        glcanvas.translate(mOffSet, 0.0F);
        g.draw(glcanvas);
        glcanvas.restoreToCount(i1);
        glcanvas.setAlpha(j1);
    }

    private void b()
    {
        mIsInRiseAnimation = false;
        e = true;
        g.startWeatherAnimaiton();
    }

    private void b(float f1)
    {
        l = f1;
        m = 1.0F - f1;
        y = x * (1.0F - f1);
        n = -o * (1.0F - f1);
        B = A * (1.0F - f1);
        if (f1 == 1.0F)
        {
            d();
        }
        invalidate();
    }

    private void c()
    {
        j = true;
        k = -1L;
        invalidate();
    }

    private void d()
    {
        j = false;
        if (C != null)
        {
            C.onFullAnimationEnd();
        }
    }

    private void e()
    {
        if (g == null || a == null || mWidth <= 0 || t)
        {
            return;
        }
        int i1 = p;
        int j1 = q;
        int l1 = r;
        int k1 = s;
        if (mWidth > mHeight)
        {
            g.layout((i1 + j1) / 2, l1, j1, k1);
            l1 = a.getMeasuredHeight();
            a.layout((i1 + j1) / 2, k1 - l1, j1, k1);
        }
        t = true;
    }

    public void cleanup()
    {
        D = false;
        super.cleanup();
    }

    public void clearWall()
    {
        g.clearDrawable();
    }

    protected void dispatchDraw(GLCanvas glcanvas)
    {
        int i1 = glcanvas.save();
        a(glcanvas);
        glcanvas.restoreToCount(i1);
        i1 = glcanvas.save();
        glcanvas.translate(-mOffSet, 0.0F);
        glcanvas.clipRect(PanelMain.sClickRect);
        glcanvas.translate(mOffSet, 0.0F);
        a.draw(glcanvas);
        glcanvas.restoreToCount(i1);
        i1 = glcanvas.save();
        glcanvas.translate(-mOffSet, 0.0F);
        glcanvas.clipRect(PanelMain.sClickRect);
        glcanvas.translate(mOffSet, 0.0F);
        d.draw(glcanvas);
        glcanvas.restoreToCount(i1);
    }

    public void drawFlyingFrame(GLCanvas glcanvas)
    {
        int i1 = glcanvas.save();
        int j1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)((float)j1 * m));
        glcanvas.translate(0.0F, -B, n);
        if (z != null)
        {
            glcanvas.translate(0.0F, z[1], 0.0F);
        }
        glcanvas.rotateAxisAngle(y, -1F, 0.0F, 0.0F);
        if (z != null)
        {
            glcanvas.translate(0.0F, -z[1], 0.0F);
        }
        g.draw(glcanvas);
        glcanvas.setAlpha(j1);
        glcanvas.restoreToCount(i1);
    }

    public void forceClosePreviewAnimation()
    {
        if (j || mIsInRiseAnimation || e)
        {
            b(1.0F);
            mIsInRiseAnimation = false;
            e = false;
        }
        g.forceAnimationStop();
    }

    public boolean getIsFore()
    {
        return f;
    }

    public int getWeatherType()
    {
        return i;
    }

    public void initWall()
    {
        onTimeChange();
        g.initDrawable();
    }

    public void onEnterPreview()
    {
        if (!f)
        {
            startForecast();
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        p = i1;
        q = k1;
        r = j1;
        s = l1;
    }

    public void onPreviewAnimationEnd()
    {
        if (e)
        {
            c();
        }
        e = false;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        GLContentView glcontentview = getGLRootView();
        t = false;
        if (glcontentview != null)
        {
            o = glcontentview.getDepthForProjectScale(0.6F);
        }
        forceClosePreviewAnimation();
        onEnterPreview();
        e();
    }

    public void onTimeChange()
    {
        while (c == null || !h || !D || c.b(w) == null || c.b(w).l == null) 
        {
            return;
        }
        int i1 = c.b(w).l.d();
        boolean flag = c.c(w);
        i1 = com.gtp.nextlauncher.widget.nextpanel.m.a(i1, flag);
        if (i1 != i)
        {
            i = i1;
            removeView(g);
            g = (new m(i1, flag)).a(mContext);
            g.setWallHodler(this);
            addView(g, new com.go.gl.view.GLRelativeLayout.LayoutParams(-1, -1));
            g.initDrawable();
            if (i == 3 || i == 2 || i == 4)
            {
                d.setNight(false);
                a.setNight(false);
            } else
            {
                d.setNight(true);
                a.setNight(true);
            }
        }
        a.updateUI();
    }

    public void setDateHandler(e e1, int i1, int j1)
    {
        b = i1;
        c = e1;
        w = i1;
        v = c.u();
        boolean flag = e1.c(i1);
        i1 = com.gtp.nextlauncher.widget.nextpanel.m.a(j1, flag);
        if (i1 == 3 || i1 == 2 || i1 == 4)
        {
            d.setNight(false);
            a.setNight(false);
        } else
        {
            d.setNight(true);
            a.setNight(true);
        }
        d.setOnClickListener(new b(this));
        a.setDataHandler(e1, w);
        if (i != i1 && h)
        {
            removeView(g);
            g = (new m(i1, flag)).a(mContext);
            g.setWallHodler(this);
            e();
            addView(g, new com.go.gl.view.GLRelativeLayout.LayoutParams(-1, -1));
        }
        if (!h)
        {
            g = (new m(i1, flag)).a(mContext);
            g.setWallHodler(this);
            e();
            addView(g, new com.go.gl.view.GLRelativeLayout.LayoutParams(-1, -1));
            addView(a, new com.go.gl.view.GLRelativeLayout.LayoutParams(-1, -1));
            addView(d);
            h = true;
        }
        showWeatherDesp();
        i = i1;
        a.updateUI();
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        super.setDrawingCacheEnabled(flag);
    }

    public void setOffSet(float f1)
    {
        mOffSet = f1;
    }

    public void showWeatherDesp()
    {
        if (c == null)
        {
            return;
        }
        WeatherBean weatherbean = c.b(b);
        if (weatherbean == null)
        {
            d.setCityName(c.m());
            return;
        } else
        {
            d.setWindDesp(c.g(weatherbean));
            d.setCityName(weatherbean.d());
            d.setNowTemp(c.b(weatherbean));
            d.setNowTempUnit(c.c(weatherbean));
            d.setLTempDesp(c.f(weatherbean));
            d.setHTempDesp(c.e(weatherbean));
            d.setHumidity(c.d(weatherbean));
            d.setWeatherDesp(c.a(weatherbean));
            return;
        }
    }

    public void startForecast()
    {
        if (g.startForeAnimation(f))
        {
            a.startForeAnimation(f);
            boolean flag;
            if (!f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
        }
        invalidate();
    }

    public void startRiseAnimation(float f1, float af[], FullScreenNextWidgetCallback fullscreennextwidgetcallback)
    {
        if (mIsInRiseAnimation)
        {
            return;
        } else
        {
            C = fullscreennextwidgetcallback;
            mIsInRiseAnimation = true;
            u = -1L;
            l = 1.0F;
            m = 0.0F;
            n = 0.0F;
            x = f1;
            z = af;
            y = 0.0F;
            e = true;
            A = (float)(Math.tan(Math.toRadians(x)) * (double)o);
            invalidate();
            return;
        }
    }

    public void startWeatherAnimation()
    {
        g.startWeatherAnimaiton();
    }

    public void updateTemp()
    {
        WeatherBean weatherbean;
        if (c != null)
        {
            if ((weatherbean = c.b(b)) != null)
            {
                d.setNowTemp(c.b(weatherbean));
                d.setNowTempUnit(c.c(weatherbean));
                d.setLTempDesp(c.f(weatherbean));
                d.setHTempDesp(c.e(weatherbean));
                return;
            }
        }
    }

}
