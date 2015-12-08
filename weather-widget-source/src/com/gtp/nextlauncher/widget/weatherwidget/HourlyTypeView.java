// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import com.gau.go.launcherex.gowidget.weather.model.HourlyBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.util.a;
import com.gau.go.launcherex.gowidget.weather.util.p;
import com.go.gl.animation.AlphaAnimation;
import com.go.gl.animation.Animation;
import com.go.gl.animation.AnimationSet;
import com.go.gl.animation.Rotate3DAnimation;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.view.GLLayoutInflater;
import com.go.gl.view.GLLinearLayout;
import com.go.gl.view.GLView;
import com.go.gl.widget.GLImageView;
import com.go.gowidget.core.WidgetCallback;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            h, HourBottom, w, e, 
//            WeatherIcon, p, CityNameView, ProgressBar, 
//            y, q, r, GLDigitalClock, 
//            s, t, v, x, 
//            WeatherTrendView

public class HourlyTypeView extends GLLinearLayout
    implements com.go.gl.animation.Animation.AnimationListener, com.go.gl.view.GLView.OnClickListener, com.go.gl.view.GLView.OnLongClickListener, h
{

    private long A;
    private long B;
    private boolean C;
    private boolean D;
    private Context a;
    private int b;
    private int c;
    private GLLinearLayout d;
    private GLLayoutInflater e;
    private WeatherIcon f;
    private CityNameView g;
    private HourBottom h[];
    private GLDigitalClock i;
    private ProgressBar j;
    private GLImageView k;
    private GLDrawable l[];
    private HourBottom m;
    String mAm;
    String mPm;
    private e n;
    private WeatherTrendView o;
    private y p;
    private Animation q;
    private AnimationSet r;
    private int s;
    private String t;
    private a u;
    private Interpolator v;
    private int w;
    private final int x;
    private boolean y;
    private float z;

    public HourlyTypeView(Context context)
    {
        super(context);
        b = 0;
        c = -1;
        e = null;
        h = new HourBottom[5];
        l = new GLDrawable[3];
        s = 0;
        t = new String();
        u = null;
        v = new w(this);
        mAm = "am";
        mPm = "pm";
        w = 0;
        x = 5;
        y = true;
        z = 1.0F;
        A = 500L;
        B = 0L;
        C = false;
        D = false;
        a(context);
        setBackgroundColor(0xff225599);
        e = GLLayoutInflater.from(context);
        d = (GLLinearLayout)e.inflate(0x7f0300d4, null);
        d.setBackgroundColor(0xff550000);
        addView(d);
        a = context;
    }

    public HourlyTypeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
        c = -1;
        e = null;
        h = new HourBottom[5];
        l = new GLDrawable[3];
        s = 0;
        t = new String();
        u = null;
        v = new w(this);
        mAm = "am";
        mPm = "pm";
        w = 0;
        x = 5;
        y = true;
        z = 1.0F;
        A = 500L;
        B = 0L;
        C = false;
        D = false;
        a(context);
        a = context;
        setOnClickListener(this);
        u = new a();
        setHasPixelOverlayed(false);
    }

    private String a(int i1)
    {
        String s1 = new String();
        if (n.b())
        {
            if (i1 < 10)
            {
                s1 = "0";
            }
            s1 = (new StringBuilder()).append(s1).append(i1).toString();
            return (new StringBuilder()).append(s1).append(":00").toString();
        }
        s1 = mAm;
        if (i1 >= 12)
        {
            s1 = mPm;
        }
        int j1 = i1;
        if (i1 > 12)
        {
            j1 = i1 % 12;
        }
        return (new StringBuilder()).append(j1).append(s1).toString();
    }

    private void a()
    {
        Object obj = "";
        int i1;
        if (n.i() > 0)
        {
            obj = n.k();
            i1 = n.l();
        } else
        {
            i1 = -1;
        }
        obj = com.gau.go.launcherex.gowidget.weather.util.p.a(getContext(), ((String) (obj)), true, 17, "", -1);
        ((Intent) (obj)).addFlags(0x4000000);
        ((Intent) (obj)).putExtra("gowidget_Id", c);
        ((Intent) (obj)).putExtra("isMyLocation", i1);
        getContext().startActivity(((Intent) (obj)));
    }

    private void a(float f1)
    {
        z = f1;
        if (f1 == 1.0F)
        {
            c();
        }
        invalidate();
    }

    private void a(int i1, boolean flag)
    {
        f.changeWeather(i1 - 1, flag);
    }

    private void a(Context context)
    {
        for (int i1 = 0; i1 < 3; i1++)
        {
            l[i1] = com.gtp.nextlauncher.widget.weatherwidget.p.a(context, (new int[] {
                0x7f020364, 0x7f020364, 0x7f020364
            })[i1]);
        }

    }

    private void a(String s1)
    {
        g.changeCity(s1);
    }

    private void b()
    {
        if (b == 5) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f1;
        String s1;
        Object obj;
        obj = n.p();
        f1 = 0.0F;
        if (obj != null)
        {
            f1 = ((NowBean) (obj)).a(com.gtp.nextlauncher.widget.weatherwidget.e.a);
        }
        s1 = new String();
        if (com.gtp.nextlauncher.widget.weatherwidget.e.a != 1) goto _L4; else goto _L3
_L3:
        s1 = "\260C";
_L5:
        int i1;
        if (obj == null || f1 == -10000F)
        {
            h[0].clearData();
        } else
        {
            String s2 = (new StringBuilder()).append((int)f1).append(s1).toString();
            boolean flag = n.d(n.t().hour);
            HourBottom hourbottom = h[0];
            i1 = ((NowBean) (obj)).d();
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hourbottom.setWeather(i1 - 1, flag, s2, t);
        }
        i1 = 1;
        while (i1 < 5) 
        {
            obj = n.e(i1);
            if (obj == null)
            {
                h[i1].clearData();
            } else
            {
                String s3 = (new StringBuilder()).append((int)((HourlyBean) (obj)).b(com.gtp.nextlauncher.widget.weatherwidget.e.a)).append(s1).toString();
                String s4 = a(((HourlyBean) (obj)).d());
                boolean flag1 = n.d(((HourlyBean) (obj)).d());
                HourBottom hourbottom1 = h[i1];
                int j1 = ((HourlyBean) (obj)).e();
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                hourbottom1.setWeather(j1 - 1, flag1, s3, s4);
            }
            i1++;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (com.gtp.nextlauncher.widget.weatherwidget.e.a == 2)
        {
            s1 = "\260F";
        }
          goto _L5
    }

    private void b(float f1)
    {
        z = 1.0F - f1;
        if (f1 == 1.0F)
        {
            d();
        }
        invalidate();
    }

    private void c()
    {
        C = false;
        invalidate();
    }

    private void d()
    {
        D = false;
        invalidate();
    }

    public void cleanup()
    {
        int i1 = 0;
        b = 0;
        if (n != null)
        {
            n.b(this);
        }
        for (int j1 = l.length; i1 < j1; i1++)
        {
            l[i1].clear();
        }

        super.cleanup();
    }

    protected void dispatchDraw(GLCanvas glcanvas)
    {
        if (B == -1L)
        {
            B = getDrawingTime();
        }
        if (C || D)
        {
            float f1 = Math.max(0.0F, Math.min((float)(getDrawingTime() - B) / (float)A, 1.0F));
            int i1;
            if (C)
            {
                a(f1);
            } else
            {
                b(f1);
            }
        }
        i1 = glcanvas.getAlpha();
        glcanvas.setAlpha((int)((float)i1 * z));
        super.dispatchDraw(glcanvas);
        glcanvas.setAlpha(i1);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction();
        motionevent.getX();
        motionevent.getY();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        default:
            return super.dispatchTouchEvent(motionevent);
        }
    }

    public void endRefresh()
    {
        j.end();
    }

    public int getVersion()
    {
        return 0;
    }

    public boolean onActivate(boolean flag, Bundle bundle)
    {
        return false;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (animation.equals(r))
        {
            setVisibility(8);
            o = null;
            p.onHourlyViewHide();
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    public boolean onApplyTheme(Bundle bundle)
    {
        return false;
    }

    public void onAutoLocateFail(String s1)
    {
        g.setCityName(s1);
    }

    public void onClick(GLView glview)
    {
        if (b == 5) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1 = 0;
_L9:
        if (j1 < 5 && !glview.equals(h[j1])) goto _L4; else goto _L3
_L3:
        if (j1 >= 5 || h[j1].equals(m)) goto _L1; else goto _L5
_L5:
        int i1;
        boolean flag;
        h[j1].setFoucse();
        m.clearFouse();
        s = j1;
        i1 = 0x7f020365;
        if (j1 == 0)
        {
            i1 = 0x7f020364;
        } else
        if (j1 == 4)
        {
            i1 = 0x7f020366;
        }
        h[j1].setBackgroundResource(i1);
        m.setBackgroundDrawable(null);
        m = h[j1];
        if (j1 != 0) goto _L7; else goto _L6
_L6:
        glview = n.p();
        if (glview == null) goto _L1; else goto _L8
_L8:
        i1 = glview.d() - 1;
        flag = n.d(n.t().hour);
_L11:
        glview = f;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        glview.startRotate(j1, i1, flag);
        return;
_L4:
        j1++;
          goto _L9
_L7:
        glview = n.e(j1);
        if (glview == null) goto _L1; else goto _L10
_L10:
        i1 = glview.e() - 1;
        flag = n.d(glview.d());
          goto _L11
    }

    public void onDateStyleChange(int i1)
    {
    }

    public boolean onDeactivate(boolean flag, Bundle bundle)
    {
        return true;
    }

    public void onDelete()
    {
    }

    public void onEnter()
    {
        f.startZoom();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        f = (WeatherIcon)findViewById(0x7f090262);
        f.setOnClickListener(new q(this));
        f.setOnLongClickListener(this);
        g = (CityNameView)findViewById(0x7f090231);
        g.setOnClickListener(new r(this));
        g.setOnLongClickListener(this);
        for (int i1 = 0; i1 < 5; i1++)
        {
            h[i1] = (HourBottom)findViewById((new int[] {
                0x7f09044f, 0x7f090450, 0x7f090451, 0x7f090452, 0x7f090453
            })[i1]);
            h[i1].setOnClickListener(this);
            h[i1].setOnLongClickListener(this);
        }

        m = h[0];
        h[0].setFoucse();
        h[0].setBackgroundDrawable(l[0]);
        i = (GLDigitalClock)findViewById(0x7f09044e);
        i.setOnClickListener(new s(this));
        i.startTimeChangeAnimation(0, 0);
        i.setOnLongClickListener(this);
        j = (ProgressBar)findViewById(0x7f09044c);
        j.setOnClickListener(new t(this));
        k = (GLImageView)findViewById(0x7f09044d);
        k.setOnClickListener(new v(this));
        t = a.getResources().getString(0x7f080591);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
    }

    public void onLeave()
    {
    }

    public void onLoadFinish()
    {
        post(new x(this));
    }

    public boolean onLongClick(GLView glview)
    {
        performLongClick();
        return false;
    }

    public void onMyLoadFinish()
    {
        boolean flag = true;
        if (b != 5)
        {
            y = true;
            w = w + 1;
            return;
        }
        a(n.m());
        int i1;
        int j1;
        if (s == 0)
        {
            NowBean nowbean = n.p();
            if (nowbean != null)
            {
                j1 = nowbean.d();
                i1 = n.t().hour;
            } else
            {
                i1 = 0;
                j1 = 1;
            }
        } else
        {
            HourlyBean hourlybean = n.e(s);
            if (hourlybean != null)
            {
                j1 = hourlybean.e();
                i1 = hourlybean.d();
            } else
            {
                i1 = 0;
                j1 = 1;
            }
        }
        if (n.d(i1))
        {
            flag = false;
        }
        a(j1, flag);
        b();
        n.q();
        i.startTimeChangeAnimation(n.r(), n.s());
        g.setCityNum(n.i());
        g.setCityName(n.m());
        y = false;
    }

    public void onRemove()
    {
    }

    public void onScreenChange(String s1)
    {
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        b = b | 1;
        f.setCenter(i1 / 2 - 12);
        if (y)
        {
            onMyLoadFinish();
        }
    }

    public void onStart()
    {
        n.a(this);
        n.q();
        i.startTimeChangeAnimation(n.r(), n.s());
    }

    public void onStop()
    {
    }

    public void onTemperatureUnitChange(int i1)
    {
        if (b != 5)
        {
            return;
        } else
        {
            b();
            return;
        }
    }

    public void onTimeChange(int i1, int j1)
    {
        if (b != 5)
        {
            return;
        } else
        {
            i.startTimeChangeAnimation(i1, j1);
            b();
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    public void rebuildAnimation(int i1)
    {
        Drawable drawable = getResources().getDrawable(0x7f02037f);
        int j1 = drawable.getIntrinsicHeight() / 2;
        j1 = -drawable.getIntrinsicHeight() / 2;
        r = new AnimationSet(false);
        Rotate3DAnimation rotate3danimation = new Rotate3DAnimation(0.0F, -90F, 0.0F, -i1 + drawable.getIntrinsicHeight(), j1, 1.0F, 0.0F, 0.0F);
        rotate3danimation.setDuration(320L);
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(320L);
        r.addAnimation(rotate3danimation);
        r.addAnimation(alphaanimation);
        r.setAnimationListener(this);
        q = new Rotate3DAnimation(-90F, 0.0F, 0.0F, -i1 + drawable.getIntrinsicHeight(), j1, 1.0F, 0.0F, 0.0F);
        q.setDuration(800L);
        q.setInterpolator(v);
    }

    public void setDataHandler(e e1, y y1)
    {
        if (e1 != null)
        {
            n = e1;
            b = b | 4;
            g.setCityName(n.m());
        }
        p = y1;
        if (y)
        {
            onMyLoadFinish();
        }
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        f.setDrawingCacheEnabled(flag);
    }

    public void setTrendView(WeatherTrendView weathertrendview)
    {
        o = weathertrendview;
    }

    public void setWidgetCallback(WidgetCallback widgetcallback)
    {
    }

    public void startAppearAnimation()
    {
        setVisibility(0);
        startAnimation(q);
    }

    public void startDisppearAnimation()
    {
        startAnimation(r);
    }

    public void startEntering()
    {
        C = true;
        B = -1L;
        invalidate();
    }

    public void startLeaving()
    {
        D = true;
        B = -1L;
        invalidate();
    }

    public void startRefresh()
    {
        j.start();
    }

    void updateRadius()
    {
    }







/*
    static WeatherTrendView access$402(HourlyTypeView hourlytypeview, WeatherTrendView weathertrendview)
    {
        hourlytypeview.o = weathertrendview;
        return weathertrendview;
    }

*/
}
