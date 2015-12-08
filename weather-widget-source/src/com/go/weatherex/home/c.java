// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.view.ThemeSettingActivity;
import com.go.weatherex.ad.a.e;
import com.go.weatherex.city.d;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.b.h;
import com.go.weatherex.home.refresh.PullRefreshLayout;
import com.go.weatherex.home.refresh.k;
import com.go.weatherex.viewex.AlphaChangeFrameLayout;
import com.go.weatherex.viewex.CityNameSwitcher;
import com.go.weatherex.viewex.FrameImageView;
import com.go.weatherex.wear.b;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home:
//            d, e, m, k, 
//            SidebarIcon, l, f, h, 
//            i, j, g

public class c extends a
    implements android.view.View.OnClickListener, d, k
{

    private final android.view.View.OnClickListener A = new com.go.weatherex.home.d(this);
    private final android.view.View.OnClickListener B = new com.go.weatherex.home.e(this);
    private LinearLayout a;
    private h b;
    private SidebarIcon c;
    private boolean d;
    private int e[] = {
        0x7f0202f8, 0x7f0202fc, 0x7f0202fd, 0x7f0202fe, 0x7f0202ff, 0x7f020300, 0x7f020301, 0x7f020302, 0x7f020303, 0x7f0202f9, 
        0x7f0202fa, 0x7f0202fb, 0x7f0202f8
    };
    private FrameImageView f;
    private CityNameSwitcher g;
    private ImageView h;
    private boolean i;
    private PullRefreshLayout j;
    private FrameLayout k;
    private e l;
    private m m;
    private f n;
    private com.gau.go.launcherex.gowidget.weather.util.f o;
    private g p;
    private String q;
    private String r;
    private boolean s;
    private SharedPreferences t;
    private AlphaChangeFrameLayout u;
    private TextView v;
    private TextView w;
    private com.go.weatherex.city.c x;
    private boolean y;
    private ImageView z;

    public c()
    {
        b = new h(0);
        i = false;
        q = "";
        r = "";
        m = new m(this, null);
        x = com.go.weatherex.city.c.a();
    }

    public static Bundle a(String s1, int i1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s1);
        bundle.putInt("detail_goto", i1);
        return bundle;
    }

    static SidebarIcon a(c c1)
    {
        return c1.c;
    }

    static void a(c c1, String s1)
    {
        c1.a(s1);
    }

    private void a(String s1)
    {
        s1 = new com.gau.go.launcherex.gowidget.statistics.a.a(93, s1);
        s1.e("1");
        com.gau.go.launcherex.gowidget.statistics.q.a(getActivity().getApplicationContext()).a(s1);
    }

    private boolean a(int i1)
    {
        return n.b() || b(i1);
    }

    static boolean a(c c1, boolean flag)
    {
        c1.d = flag;
        return flag;
    }

    static CityNameSwitcher b(c c1)
    {
        return c1.g;
    }

    static String b(c c1, String s1)
    {
        c1.q = s1;
        return s1;
    }

    private boolean b(int i1)
    {
        Time time = new Time();
        time.setToNow();
        return time.gmtoff * 1000L == (long)i1;
    }

    static String c(c c1, String s1)
    {
        c1.r = s1;
        return s1;
    }

    static void c(c c1)
    {
        c1.n();
    }

    static PullRefreshLayout d(c c1)
    {
        return c1.j;
    }

    private void d(int i1)
    {
        Intent intent = new Intent(getActivity(), com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", i1);
        intent.putExtra("recommend_enterance", 4);
        getActivity().startActivity(intent);
    }

    static com.go.weatherex.city.c e(c c1)
    {
        return c1.x;
    }

    private void e(int i1)
    {
        Intent intent = ThemeSettingActivity.a(getActivity(), i1, 40, 40, q);
        intent.addFlags(0x4000000);
        getActivity().startActivity(intent);
    }

    static com.gau.go.launcherex.gowidget.weather.util.f f(c c1)
    {
        return c1.o;
    }

    private void f(int i1)
    {
        b.a(i1);
    }

    static void g(c c1)
    {
        c1.q();
    }

    static String h(c c1)
    {
        return c1.r;
    }

    static boolean i(c c1)
    {
        return c1.d;
    }

    static FrameImageView j(c c1)
    {
        return c1.f;
    }

    private Bitmap[] j()
    {
        int i1 = 0;
        Bitmap abitmap[] = new Bitmap[12];
        for (; i1 < 12; i1++)
        {
            abitmap[i1] = com.go.weatherex.e.a.a().c((new String[] {
                "R.drawable.home_theme_enterance_anim_frame1", "R.drawable.home_theme_enterance_anim_frame2", "R.drawable.home_theme_enterance_anim_frame3", "R.drawable.home_theme_enterance_anim_frame4", "R.drawable.home_theme_enterance_anim_frame5", "R.drawable.home_theme_enterance_anim_frame6", "R.drawable.home_theme_enterance_anim_frame7", "R.drawable.home_theme_enterance_anim_frame8", "R.drawable.home_theme_enterance_anim_frame9", "R.drawable.home_theme_enterance_anim_frame10", 
                "R.drawable.home_theme_enterance_anim_frame11", "R.drawable.home_theme_enterance_anim_frame12"
            })[i1]);
        }

        return abitmap;
    }

    private StateListDrawable k()
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        android.graphics.drawable.Drawable drawable = com.go.weatherex.e.a.a().b("home_theme_enterance_anim_frame1");
        android.graphics.drawable.Drawable drawable1 = com.go.weatherex.e.a.a().b("home_theme_enterance_click");
        if (drawable == null || drawable1 == null)
        {
            return null;
        } else
        {
            statelistdrawable.addState(new int[] {
                0x10100a7, 0x101009e
            }, drawable1);
            statelistdrawable.addState(new int[] {
                0x101009e
            }, drawable);
            return statelistdrawable;
        }
    }

    static f k(c c1)
    {
        return c1.n;
    }

    static e l(c c1)
    {
        return c1.l;
    }

    private void l()
    {
        boolean flag1 = true;
        boolean flag;
        boolean flag2;
        if (n.a(2) || n.a(1) || n.a(32) || n.a(128))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = com.gau.go.launcherex.gowidget.statistics.w.p(getActivity());
        if (!flag && !flag2 && !com.jiubang.playsdk.f.a.c(getActivity(), "com.gto.zero.zboost"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && t.getBoolean("key_zboost_ad_open", true))
        {
            int i1 = t.getInt("key_zboost_show_count", 0);
            if (i1 < 3)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                android.content.SharedPreferences.Editor editor = t.edit();
                editor.putInt("key_zboost_show_count", i1 + 1);
                editor.commit();
            }
        }
    }

    static FrameLayout m(c c1)
    {
        return c1.k;
    }

    private void m()
    {
        if (t.getBoolean("key_ad_world_clock", false) || n.b())
        {
            n();
            return;
        } else
        {
            a(true);
            return;
        }
    }

    static ImageView n(c c1)
    {
        return c1.z;
    }

    private void n()
    {
        if (w.getVisibility() == 0)
        {
            w.setText(0x7f080393);
            return;
        }
        if (TextUtils.isEmpty(q)) goto _L2; else goto _L1
_L1:
        WeatherBean weatherbean = o.a(q);
        if (weatherbean == null) goto _L2; else goto _L3
_L3:
        int i1 = weatherbean.l.n();
_L5:
        if (p.d() && i1 != -10000)
        {
            if (a(i1))
            {
                Object obj = p.b(i1);
                obj = p.a(((Time) (obj)));
                v.setText(((CharSequence) (obj)));
                v.setEnabled(false);
            } else
            {
                v.setText("Local Time");
                v.setEnabled(true);
            }
            v.setVisibility(0);
            return;
        } else
        {
            v.setVisibility(8);
            return;
        }
_L2:
        i1 = -10000;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean o()
    {
        return false;
    }

    private void p()
    {
        s = com.go.weatherex.wear.f.a(getActivity());
        if (s)
        {
            q();
            return;
        } else
        {
            g.a(false);
            return;
        }
    }

    private void q()
    {
        if (s)
        {
            if (TextUtils.isEmpty(r))
            {
                r = com.go.weatherex.wear.b.a(getActivity()).a();
            }
            g.a(r.equals(q));
        }
    }

    public void a(String s1, String s2)
    {
        WeatherBean weatherbean;
label0:
        {
            weatherbean = o.a(s2);
            if (weatherbean != null && g != null)
            {
                q = s2;
                if (!TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                g.b(weatherbean.d(), o.g(s2));
            }
            return;
        }
        g.a(weatherbean.d(), o.g(s2));
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            w.setVisibility(0);
            return;
        } else
        {
            w.setVisibility(8);
            v.postDelayed(new com.go.weatherex.home.k(this), 1500L);
            return;
        }
    }

    public String b()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (o.e() == 0) goto _L2; else goto _L1
_L1:
        WeatherBean weatherbean = o.a(q);
        if (weatherbean == null) goto _L2; else goto _L3
_L3:
        long l1 = weatherbean.l.f();
_L5:
        stringbuffer.append(getString(0x7f0802e6)).append(" : ");
        if (l1 != -1L && com.gau.go.launcherex.gowidget.weather.util.r.b(l1))
        {
            stringbuffer.append(com.gau.go.launcherex.gowidget.weather.util.r.a(getActivity(), l1));
        } else
        {
            stringbuffer.append("N/A");
        }
        return stringbuffer.toString();
_L2:
        l1 = -1L;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void b(int i1, Object obj)
    {
        boolean flag = true;
        i1;
        JVM INSTR tableswitch 9 19: default 64
    //                   9 65
    //                   10 160
    //                   11 64
    //                   12 64
    //                   13 197
    //                   14 64
    //                   15 64
    //                   16 64
    //                   17 256
    //                   18 324
    //                   19 630;
           goto _L1 _L2 _L3 _L1 _L1 _L4 _L1 _L1 _L1 _L5 _L6 _L7
_L1:
        return;
_L2:
        float f1 = ((Float)obj).floatValue();
        f(Color.argb((int)((double)f1 * 76.799999999999997D), 0, 0, 0));
        i1 = Math.min(255, Math.max(0, (int)(255F * (1.0F - f1))));
        if (p.d())
        {
            u.a(i1);
        }
        if (o());
        if (!y && f1 == 1.0F)
        {
            y = true;
            a("up_detail");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj = String.valueOf(obj);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            q = ((String) (obj));
            x.b(q);
            n();
            q();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (!((Boolean)obj).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        j.setEnabled(false);
        u.setVisibility(8);
        if (!o())
        {
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        j.setEnabled(true);
        u.setVisibility(0);
        if (!o())
        {
            return;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        if (((Boolean)obj).booleanValue())
        {
            a(15, Boolean.valueOf(false));
            c.setOnClickListener(A);
            c.c();
            return;
        } else
        {
            a(15, Boolean.valueOf(true));
            c.setOnClickListener(B);
            c.b();
            return;
        }
_L6:
        obj = (String)obj;
        if (com/go/weatherex/home/hourforecast/c.getName().equals(obj))
        {
            g.a(getText(0x7f0802dc), false);
            g.a(false);
            i = true;
            return;
        }
        if (com/go/weatherex/home/dayforecast/g.getName().equals(obj))
        {
            g.a(getText(0x7f0802dd), false);
            g.a(false);
            i = true;
            return;
        }
        if (com/go/weatherex/home/rain/g.getName().equals(obj))
        {
            g.a(getText(0x7f0802df), false);
            g.a(false);
            i = true;
            return;
        }
        if (com/go/weatherex/home/windforecast/c.getName().equals(obj))
        {
            g.a(getText(0x7f0802de), false);
            g.a(false);
            i = true;
            return;
        }
        if (com/go/weatherex/home/c/a.getName().equals(obj))
        {
            g.a(getText(0x7f0802e1), false);
            g.a(false);
            i = true;
            return;
        }
        if (com/go/weatherex/home/current/w.getName().equals(obj))
        {
            if (i)
            {
                g.showPrevious();
            }
            if (!TextUtils.isEmpty(q) && !TextUtils.isEmpty(r))
            {
                obj = g;
                if (!s || !q.equals(r))
                {
                    flag = false;
                }
                ((CityNameSwitcher) (obj)).a(flag);
            }
            i = false;
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        r = (String)obj;
        q();
        return;
    }

    public void c()
    {
        o.i();
    }

    public void d()
    {
        j.a(b());
    }

    protected void f()
    {
        super.f();
        n();
    }

    public void onActivityCreated(Bundle bundle)
    {
        int i1 = -1;
        super.onActivityCreated(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            q = bundle.getString("cityId");
            i1 = bundle.getInt("detail_goto", -1);
        }
        a(com/go/weatherex/home/current/w, com.go.weatherex.home.current.w.a(q, i1));
        Object obj1 = o.d();
        if (((ArrayList) (obj1)).isEmpty())
        {
            a(com/go/weatherex/g/g, ((Bundle) (null)));
        } else
        {
            Object obj;
            boolean flag;
            if (!TextUtils.isEmpty(q))
            {
                bundle = o.a(q);
            } else
            {
                bundle = null;
            }
            obj = bundle;
            if (bundle == null)
            {
                obj = (WeatherBean)((ArrayList) (obj1)).get(0);
                q = ((WeatherBean) (obj)).c();
            }
            x.a(q);
            bundle = g;
            obj1 = ((WeatherBean) (obj)).d();
            if (((WeatherBean) (obj)).e() != 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bundle.b(((CharSequence) (obj1)), flag);
        }
        m();
        r = com.go.weatherex.wear.b.a(getActivity()).a();
        p();
    }

    public void onClick(View view)
    {
        if (view.equals(f))
        {
            a("c000_shop");
            com.gau.go.launcherex.gowidget.weather.util.r.a(getActivity(), false);
            e(1);
            if (d)
            {
                h.setVisibility(8);
                d = false;
                f.b();
                com.gau.go.launcherex.gowidget.weather.globaltheme.a.d.a(getActivity(), false);
            }
        } else
        if (u.a() >= 20)
        {
            a("c000_clock");
            if (view.equals(w))
            {
                d(3);
                view = t.edit();
                view.putBoolean("key_ad_world_clock", true);
                view.commit();
                w.setVisibility(8);
                w.postDelayed(new l(this), 1000L);
                return;
            }
            if (view.equals(v) && !n.b())
            {
                d(3);
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new int[] {
            9, 10, 16, 11, 13, 17, 18, 19
        });
        bundle = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext());
        o = bundle.h();
        n = bundle.e();
        p = bundle.g();
        t = GoWidgetApplication.c(getActivity().getApplicationContext()).a();
        Log.i("wss", "HomeFragment_onCreate");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030099, viewgroup, false);
    }

    public void onDestroy()
    {
        if (k.getVisibility() == 0 && l != null)
        {
            l.a(true);
        }
        x.b(this);
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        b(m);
    }

    public void onPause()
    {
        if (k.getVisibility() == 0 && l != null)
        {
            l.c();
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if (k.getVisibility() == 0 && l != null)
        {
            l.b();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view.setBackgroundDrawable(b);
        a = (LinearLayout)c(0x7f090061);
        a(a, 4, 0);
        c = (SidebarIcon)c(0x7f090230);
        c.setOnClickListener(A);
        c.d();
        h = (ImageView)c(0x7f090235);
        f = (FrameImageView)c(0x7f090234);
        f.setOnClickListener(this);
        f.a(3);
        view = k();
        if (view != null)
        {
            f.setImageDrawable(view);
            f.a(j(), new com.go.weatherex.home.f(this));
        } else
        {
            f.a(e, new com.go.weatherex.home.g(this));
        }
        d = t.getBoolean("new_theme", false);
        if (d)
        {
            h.setVisibility(0);
            f.a();
        }
        g = (CityNameSwitcher)c(0x7f090231);
        g.setFactory(new com.go.weatherex.home.h(this));
        view = AnimationUtils.loadAnimation(getActivity(), 0x10a0000);
        view.setStartOffset(200L);
        view.setAnimationListener(new i(this));
        g.setInAnimation(view);
        g.setOutAnimation(getActivity(), 0x10a0001);
        x.a(this);
        u = (AlphaChangeFrameLayout)c(0x7f0903ae);
        w = (TextView)c(0x7f0903af);
        w.setOnClickListener(this);
        a(w, 4, 0);
        v = (TextView)c(0x7f0903b0);
        v.setOnClickListener(this);
        a(v, 4, 0);
        l();
        j = (PullRefreshLayout)c(0x7f0903ac);
        j.a(this);
        k = (FrameLayout)c(0x7f0903b5);
        l = new e(getActivity(), k);
        l.a();
        a(m);
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.d.a() > 0)
        {
            view = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE");
            view.putExtra("new_theme_num_flag", 0);
            getActivity().sendBroadcast(view);
        }
        z = (ImageView)c(0x7f090232);
        if (!n.b())
        {
            z.setOnClickListener(new j(this));
            return;
        } else
        {
            z.setVisibility(8);
            return;
        }
    }
}
