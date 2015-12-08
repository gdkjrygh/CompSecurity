// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.util.p;
import com.go.gl.animation.AlphaAnimation;
import com.go.gl.animation.Animation;
import com.go.gl.animation.AnimationSet;
import com.go.gl.animation.InterpolatorFactory;
import com.go.gl.animation.Rotate3DAnimation;
import com.go.gl.animation.RotateAnimation;
import com.go.gl.animation.ScaleAnimation;
import com.go.gl.view.GLFrameLayout;
import com.go.gl.view.GLLinearLayout;
import com.go.gl.view.GLRelativeLayout;
import com.go.gl.view.GLView;
import com.go.gl.widget.GLImageView;
import com.go.gl.widget.GLTextViewWrapper;
import java.util.Calendar;
import java.util.List;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            h, TemperatureCubeView, af, ag, 
//            ai, e, aj, y, 
//            CustomTextViewWrapper, ah, HourlyTypeView

public class WeatherTrendView extends GLRelativeLayout
    implements com.go.gl.animation.Animation.AnimationListener, com.go.gl.view.GLView.OnClickListener, com.go.gl.view.GLView.OnLongClickListener, h
{

    private static final String a[] = {
        "%m/%d", "%m/%d", "%d/%m"
    };
    private Animation A;
    private AnimationSet B;
    private Animation C;
    private AnimationSet D;
    private SensorManager E;
    private Sensor F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private y K;
    private HourlyTypeView L;
    private Interpolator M;
    private SensorEventListener N;
    private float O;
    private float P;
    private Handler Q;
    private String b;
    private CustomTextViewWrapper c;
    private GLImageView d;
    private GLImageView e;
    private GLImageView f;
    private TemperatureCubeView g;
    private TemperatureCubeView h;
    private TemperatureCubeView i;
    private TemperatureCubeView j;
    private TemperatureCubeView k;
    private TemperatureCubeView l;
    private TemperatureCubeView m[];
    boolean mCubeViewDrawingCacheEnabled;
    private GLTextViewWrapper n;
    private GLTextViewWrapper o;
    private GLTextViewWrapper p;
    private GLTextViewWrapper q;
    private GLTextViewWrapper r;
    private GLTextViewWrapper s;
    private GLTextViewWrapper t[];
    private GLLinearLayout u;
    private GLLinearLayout v;
    private GLFrameLayout w;
    private e x;
    private Animation y;
    private Animation z;

    public WeatherTrendView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = a[0];
        mCubeViewDrawingCacheEnabled = false;
        m = new TemperatureCubeView[6];
        t = new GLTextViewWrapper[6];
        G = false;
        J = true;
        M = new af(this);
        N = new ag(this);
        O = 2.147484E+09F;
        P = -2.147484E+09F;
        Q = new ai(this);
        setChildrenDrawingOrderEnabled(true);
        a();
        registSensorEventListener();
    }

    private String a(ForecastBean forecastbean)
    {
        int i1 = forecastbean.f();
        int j1 = forecastbean.g();
        String s1;
        String s2;
        if (i1 < 10)
        {
            forecastbean = (new StringBuilder()).append("0").append(i1).toString();
        } else
        {
            forecastbean = String.valueOf(i1);
        }
        if (j1 < 10)
        {
            s1 = (new StringBuilder()).append("0").append(j1).toString();
        } else
        {
            s1 = String.valueOf(j1);
        }
        s2 = (new StringBuilder()).append(s1).append("/").append(forecastbean).toString();
        if (b.equals("%m/%d"))
        {
            return (new StringBuilder()).append(forecastbean).append("/").append(s1).toString();
        }
        if (b.equals("%d/%m"))
        {
            return (new StringBuilder()).append(s1).append("/").append(forecastbean).toString();
        } else
        {
            return s2;
        }
    }

    private void a()
    {
        C = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 1.0F);
        C.setDuration(1800L);
        C.setInterpolator(InterpolatorFactory.getInterpolator(8, 0, new float[] {
            0.5F, 0.3F
        }));
        D = new AnimationSet(false);
        ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 1.0F);
        scaleanimation.setDuration(400L);
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(400L);
        D.addAnimation(scaleanimation);
        D.addAnimation(alphaanimation);
        D.setAnimationListener(this);
        y = new RotateAnimation(0.0F, 360F, 1, 0.5F, 1, 0.5F);
        y.setRepeatCount(-1);
        y.setInterpolator(InterpolatorFactory.getInterpolator(0));
        y.setDuration(1000L);
    }

    private void a(int i1)
    {
        Object obj = "";
        int j1;
        if (x.i() > 0)
        {
            obj = x.k();
            j1 = x.l();
        } else
        {
            j1 = -1;
        }
        obj = com.gau.go.launcherex.gowidget.weather.util.p.a(getContext(), ((String) (obj)), true, 17, "", i1);
        ((Intent) (obj)).addFlags(0x4000000);
        ((Intent) (obj)).putExtra("gowidget_Id", I);
        ((Intent) (obj)).putExtra("isMyLocation", j1);
        getContext().startActivity(((Intent) (obj)));
    }

    private void a(GLTextViewWrapper gltextviewwrapper, ForecastBean forecastbean)
    {
        gltextviewwrapper.setText(a(forecastbean));
    }

    private void a(TemperatureCubeView temperaturecubeview, ForecastBean forecastbean)
    {
        temperaturecubeview.setWeatherType(forecastbean.i(), x.o());
    }

    private void a(TemperatureCubeView temperaturecubeview, GLTextViewWrapper gltextviewwrapper, ForecastBean forecastbean, boolean flag)
    {
        int i1 = e.b - 1;
        if (i1 >= 0 && i1 < a.length)
        {
            b = a[i1];
        }
        float f1;
        float f2;
        if (!flag)
        {
            a(gltextviewwrapper, forecastbean);
        } else
        {
            gltextviewwrapper.setText(0x7f0802b7);
        }
        f1 = forecastbean.b(e.a);
        f2 = forecastbean.a(e.a);
        O = Math.min(O, f2);
        P = Math.max(P, f1);
        temperaturecubeview.setHighTemperature(f1);
        temperaturecubeview.setLowTemperature(f2);
        temperaturecubeview.setTemperatureUnit(e.a);
        a(temperaturecubeview, forecastbean);
    }

    private void b(int i1)
    {
        for (; i1 < m.length; i1++)
        {
            t[i1].setText("N/A");
            m[i1].setHighTemperature(0.0F);
            m[i1].setLowTemperature(0.0F);
            m[i1].setWeatherType(1, true);
            m[i1].resetCubes();
            m[i1].setNoData(true);
        }

    }

    private void c(int i1)
    {
        for (; i1 < m.length; i1++)
        {
            t[i1].setText("N/A");
            m[i1].setHighTemperature(0.0F);
            m[i1].setLowTemperature(0.0F);
            m[i1].setWeatherType(1, true);
        }

    }

    public void cleanup()
    {
        J = false;
        x.b(this);
        unRegistSensorEventListener();
        E = null;
        F = null;
        super.cleanup();
    }

    public void endRefresh()
    {
        if (getVisibility() != 0 || !J)
        {
            return;
        } else
        {
            e.clearAnimation();
            return;
        }
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (j1 == 2)
        {
            i1 = 3;
        } else
        {
            i1 = j1;
            if (j1 == 3)
            {
                return 2;
            }
        }
        return i1;
    }

    public void onAnimationEnd(Animation animation)
    {
        int i1;
        int k1;
        k1 = 0;
        i1 = 0;
        if (!animation.equals(z)) goto _L2; else goto _L1
_L1:
        postDelayed(new aj(this), 150L);
_L4:
        return;
_L2:
        if (animation.equals(D))
        {
            u.setVisibility(8);
            return;
        }
        if (!animation.equals(B))
        {
            break; /* Loop/switch isn't completed */
        }
        v.setVisibility(8);
        animation = m;
        k1 = animation.length;
        while (i1 < k1) 
        {
            animation[i1].setVisibility(8);
            i1++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!animation.equals(A)) goto _L4; else goto _L5
_L5:
        animation = m;
        int l1 = animation.length;
        for (int j1 = k1; j1 < l1; j1++)
        {
            TemperatureCubeView temperaturecubeview = animation[j1];
            temperaturecubeview.setHighTemperature(0.0F);
            temperaturecubeview.setLowTemperature(0.0F);
            temperaturecubeview.resetCubes();
        }

        w.setVisibility(8);
        setVisibility(8);
        L = null;
        K.onTrendViewHide();
        return;
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    public void onAutoLocateFail(String s1)
    {
        c.setText(s1);
    }

    public void onClick(GLView glview)
    {
        glview.getId();
        JVM INSTR lookupswitch 4: default 48
    //                   2131297375: 49
    //                   2131297376: 73
    //                   2131297377: 138
    //                   2131297388: 163;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        x.c();
        postDelayed(new ah(this), 1000L);
        return;
_L3:
        if (K.getIfTrendSwitchReady() && K.getIfHourSwitchReady())
        {
            startDisppearAnimation();
            if (L == null)
            {
                L = K.getHourlyTypeView();
            }
            L.startAppearAnimation();
            K.setTrendDisappearStart();
            return;
        }
          goto _L1
_L4:
        if (x.i() > 1)
        {
            x.f();
            return;
        } else
        {
            a(-1);
            return;
        }
_L5:
        a(2);
        return;
    }

    public void onDateStyleChange(int i1)
    {
        i1--;
        if (i1 >= 0 && i1 < a.length)
        {
            b = a[i1];
        }
        List list = x.n();
        if (list != null && list.size() >= 6)
        {
            a(o, (ForecastBean)list.get(1));
            a(p, (ForecastBean)list.get(2));
            a(q, (ForecastBean)list.get(3));
            a(r, (ForecastBean)list.get(4));
            a(s, (ForecastBean)list.get(5));
        }
    }

    protected void onFinishInflate()
    {
        c = (CustomTextViewWrapper)findViewById(0x7f090461);
        c.setOnClickListener(this);
        e = (GLImageView)findViewById(0x7f09045f);
        e.setOnClickListener(this);
        f = (GLImageView)findViewById(0x7f090460);
        f.setOnClickListener(this);
        d = (GLImageView)findViewById(0x7f090462);
        g = (TemperatureCubeView)findViewById(0x7f09046d);
        h = (TemperatureCubeView)findViewById(0x7f09046e);
        i = (TemperatureCubeView)findViewById(0x7f09046f);
        j = (TemperatureCubeView)findViewById(0x7f090470);
        k = (TemperatureCubeView)findViewById(0x7f090471);
        l = (TemperatureCubeView)findViewById(0x7f090472);
        m[0] = g;
        m[1] = h;
        m[2] = i;
        m[3] = j;
        m[4] = k;
        m[5] = l;
        n = (GLTextViewWrapper)findViewById(0x7f090466);
        o = (GLTextViewWrapper)findViewById(0x7f090467);
        p = (GLTextViewWrapper)findViewById(0x7f090468);
        q = (GLTextViewWrapper)findViewById(0x7f090469);
        r = (GLTextViewWrapper)findViewById(0x7f09046a);
        s = (GLTextViewWrapper)findViewById(0x7f09046b);
        t[0] = n;
        t[1] = o;
        t[2] = p;
        t[3] = q;
        t[4] = r;
        t[5] = s;
        u = (GLLinearLayout)findViewById(0x7f09045c);
        u.setHasPixelOverlayed(false);
        v = (GLLinearLayout)findViewById(0x7f09046c);
        v.setOnClickListener(this);
        v.setOnLongClickListener(this);
        v.setHasPixelOverlayed(false);
        w = (GLFrameLayout)findViewById(0x7f090465);
        super.onFinishInflate();
    }

    public void onLoadFinish()
    {
        if (getVisibility() != 0 || !J)
        {
            return;
        } else
        {
            updateUI();
            startChangeCityAnimation();
            return;
        }
    }

    public boolean onLongClick(GLView glview)
    {
        performLongClick();
        return false;
    }

    public void onScreenChange(String s1)
    {
        if (s1.equals("android.intent.action.SCREEN_ON"))
        {
            registSensorEventListener();
        } else
        if (s1.equals("android.intent.action.SCREEN_OFF"))
        {
            unRegistSensorEventListener();
            return;
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
    }

    public void onStart()
    {
        if (x.i() == 0 && J)
        {
            c.setText(0x7f0801af);
        }
        if (x.i() <= 1)
        {
            d.setVisibility(4);
            return;
        } else
        {
            d.setVisibility(0);
            return;
        }
    }

    public void onTemperatureUnitChange(int i1)
    {
        if (!J)
        {
            return;
        } else
        {
            updateTemperatureUnit(e.a);
            updateUI();
            return;
        }
    }

    public void onTimeChange(int i1, int j1)
    {
        if (getVisibility() == 0 && J) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        byte byte0;
        int k1;
        int l1;
        updateUI();
        obj = Calendar.getInstance();
        k1 = ((Calendar) (obj)).get(2);
        l1 = ((Calendar) (obj)).get(5);
        obj = x.n();
        byte0 = -1;
        if (obj == null) goto _L1; else goto _L3
_L3:
        j1 = 0;
_L5:
        i1 = byte0;
        if (j1 >= ((List) (obj)).size())
        {
            continue; /* Loop/switch isn't completed */
        }
        ForecastBean forecastbean = (ForecastBean)((List) (obj)).get(j1);
        if (forecastbean.f() != k1 + 1 || forecastbean.g() != l1)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        i1 = j1;
        if (i1 < 0 || i1 >= ((List) (obj)).size()) goto _L1; else goto _L4
_L4:
        j1 = i1;
        while (j1 < i1 + 6 && j1 < ((List) (obj)).size()) 
        {
            a(m[j1 - i1], (ForecastBean)((List) (obj)).get(j1));
            j1++;
        }
          goto _L1
        j1++;
          goto _L5
    }

    public void rebuildAnimation(int i1)
    {
        B = new AnimationSet(false);
        Object obj = new Rotate3DAnimation(0.0F, 90F, 0.0F, -i1, 0.0F, 1.0F, 0.0F, 0.0F);
        ((Rotate3DAnimation) (obj)).setDuration(400L);
        B.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(1.0F, 0.0F);
        ((AlphaAnimation) (obj)).setDuration(400L);
        B.addAnimation(((Animation) (obj)));
        B.setAnimationListener(this);
        i1 = -getResources().getDrawable(0x7f02037f).getIntrinsicHeight() / 2;
        z = new Rotate3DAnimation(90F, 0.0F, 0.0F, 0.0F, i1, 1.0F, 0.0F, 0.0F);
        z.setDuration(400L);
        z.setAnimationListener(this);
        A = new Rotate3DAnimation(0.0F, 90F, 0.0F, 0.0F, i1, 1.0F, 0.0F, 0.0F);
        A.setDuration(400L);
        A.setInterpolator(M);
        A.setAnimationListener(this);
    }

    public void refreshScreenMode()
    {
        H = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public void registSensorEventListener()
    {
        if (G)
        {
            return;
        }
        G = true;
        if (E == null)
        {
            E = (SensorManager)mContext.getSystemService("sensor");
        }
        if (F == null)
        {
            F = E.getDefaultSensor(1);
        }
        E.registerListener(N, F, 1);
    }

    public void setDataHandler(e e1, y y1)
    {
        x = e1;
        x.a(this);
        K = y1;
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        mCubeViewDrawingCacheEnabled = flag;
    }

    public void setHourlyView(HourlyTypeView hourlytypeview)
    {
        L = hourlytypeview;
    }

    public void setWidgetId(int i1)
    {
        I = i1;
    }

    public void startAppearAnimation()
    {
        setVisibility(0);
        u.setVisibility(8);
        v.setVisibility(8);
        w.setVisibility(0);
        w.startAnimation(z);
    }

    public void startChangeCityAnimation()
    {
        TemperatureCubeView atemperaturecubeview[] = m;
        int j1 = atemperaturecubeview.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            TemperatureCubeView temperaturecubeview = atemperaturecubeview[i1];
            if (!temperaturecubeview.isNoData())
            {
                temperaturecubeview.startAnimating(P, O, false);
            } else
            {
                temperaturecubeview.updateLastWeatherMark();
            }
            i1++;
        }
    }

    public void startDisppearAnimation()
    {
        v.startAnimation(B);
        w.startAnimation(A);
        u.startAnimation(D);
    }

    public void startRefresh()
    {
        if (getVisibility() != 0 || !J)
        {
            return;
        } else
        {
            e.startAnimation(y);
            return;
        }
    }

    public void startShowUpAnimation()
    {
        updateUI();
        u.setVisibility(0);
        v.setVisibility(0);
        u.startAnimation(C);
        Q.sendEmptyMessage(0);
    }

    public void unRegistSensorEventListener()
    {
        if (G)
        {
            G = false;
            E.unregisterListener(N);
        }
    }

    public void updateTemperatureUnit(int i1)
    {
        TemperatureCubeView atemperaturecubeview[] = m;
        int k1 = atemperaturecubeview.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            TemperatureCubeView temperaturecubeview = atemperaturecubeview[j1];
            if (temperaturecubeview != null)
            {
                temperaturecubeview.setTemperatureUnit(i1);
            }
        }

    }

    public void updateUI()
    {
label0:
        {
label1:
            {
                O = 2.147484E+09F;
                P = -2.147484E+09F;
                if (c != null)
                {
                    c.setText(x.m());
                }
                Object obj;
                int i1;
                int j1;
                int k1;
                int l1;
                int i2;
                if (x.i() <= 1)
                {
                    d.setVisibility(4);
                } else
                {
                    d.setVisibility(0);
                }
                obj = Calendar.getInstance();
                l1 = ((Calendar) (obj)).get(2);
                i2 = ((Calendar) (obj)).get(5);
                obj = x.n();
                k1 = -1;
                if (obj == null || ((List) (obj)).size() <= 0)
                {
                    break label0;
                }
                j1 = 0;
label2:
                do
                {
label3:
                    {
                        i1 = k1;
                        if (j1 < ((List) (obj)).size())
                        {
                            ForecastBean forecastbean = (ForecastBean)((List) (obj)).get(j1);
                            if (forecastbean.f() != l1 + 1 || forecastbean.g() != i2)
                            {
                                break label3;
                            }
                            i1 = j1;
                        }
                        if (i1 < 0 || i1 >= ((List) (obj)).size())
                        {
                            break label1;
                        }
                        k1 = i1 + 6;
                        j1 = i1;
                        while (j1 < k1 && j1 < ((List) (obj)).size()) 
                        {
                            TemperatureCubeView temperaturecubeview = m[j1 - i1];
                            GLTextViewWrapper gltextviewwrapper = t[j1 - i1];
                            ForecastBean forecastbean1 = (ForecastBean)((List) (obj)).get(j1);
                            if (j1 == i1)
                            {
                                a(temperaturecubeview, gltextviewwrapper, forecastbean1, true);
                            } else
                            {
                                a(temperaturecubeview, gltextviewwrapper, forecastbean1, false);
                            }
                            temperaturecubeview.setNoData(false);
                            j1++;
                        }
                        break label2;
                    }
                    j1++;
                } while (true);
                if (k1 > ((List) (obj)).size())
                {
                    b(((List) (obj)).size() - i1);
                }
            }
            return;
        }
        c(0);
    }







}
