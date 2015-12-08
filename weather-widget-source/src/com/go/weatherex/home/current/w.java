// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.scroller.WeatherDetailScrollGroup;
import com.gau.go.launcherex.gowidget.weather.scroller.h;
import com.gau.go.launcherex.gowidget.weather.scroller.l;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.view.MapDetailActivity;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.dayforecast.g;
import com.go.weatherex.home.windforecast.c;
import com.go.weatherex.weatheralert.WeatherAlertActivity;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.go.weatherex.home.current:
//            y, CurrentWeatherContent

public class w extends a
    implements android.widget.AbsListView.OnScrollListener, l
{

    private LayoutInflater a;
    private WeatherDetailScrollGroup b;
    private int c;
    private String d;
    private f e;
    private final y f = new y(this, null);
    private boolean g;
    private boolean h;
    private boolean i;
    private AccelerateDecelerateInterpolator j;
    private int k;
    private int l;

    public w()
    {
        c = 0;
        d = "";
        g = false;
        h = false;
        i = false;
        j = new AccelerateDecelerateInterpolator();
    }

    static int a(w w1, int i1)
    {
        w1.c = i1;
        return i1;
    }

    public static Bundle a(String s, int i1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s);
        bundle.putInt("detail_goto", i1);
        return bundle;
    }

    static WeatherDetailScrollGroup a(w w1)
    {
        return w1.b;
    }

    static String a(w w1, String s)
    {
        w1.d = s;
        return s;
    }

    private void a(int i1)
    {
        if (b != null && b.getChildCount() != 0 && i1 < b.getChildCount())
        {
            ((CurrentWeatherContent)b.getChildAt(i1)).i();
        }
    }

    private void a(int i1, int j1)
    {
        int l1 = b.getChildCount();
        for (int k1 = 0; k1 < l1; k1++)
        {
            ((CurrentWeatherContent)b.getChildAt(k1)).setSelectionFromTop(i1, j1);
        }

    }

    private void a(int i1, String s)
    {
        switch (i1)
        {
        case 6: // '\006'
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            c(s);
            return;

        case 3: // '\003'
            d(s);
            return;

        case 4: // '\004'
            a(s);
            return;

        case 5: // '\005'
            f(s);
            return;

        case 7: // '\007'
            g(s);
            return;

        case 8: // '\b'
            e(s);
            break;
        }
    }

    private void a(boolean flag, int i1)
    {
        boolean flag1 = false;
        if (g) goto _L2; else goto _L1
_L1:
        Object obj;
        int k1;
        obj = e.d();
        k1 = b.getChildCount();
        if (k1 == ((ArrayList) (obj)).size()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        int j1 = ((i1 - 1) + k1) % k1;
        boolean flag2 = b(j1, ((WeatherBean)((ArrayList) (obj)).get(j1)).c());
        j1 = (i1 + 1) % k1;
        j1 = false | flag2 | b(j1, ((WeatherBean)((ArrayList) (obj)).get(j1)).c());
        if (flag && k1 > 3)
        {
            int l1 = ((i1 - 2) + k1) % k1;
            flag = b(l1, ((WeatherBean)((ArrayList) (obj)).get(l1)).c());
            i1 = (i1 + 2) % k1;
            i1 = b(i1, ((WeatherBean)((ArrayList) (obj)).get(i1)).c()) | (j1 | flag);
        } else
        {
            i1 = j1;
        }
        if (i1 == 0) goto _L2; else goto _L4
_L4:
        i1 = 0;
_L7:
        if (i1 >= b.getChildCount())
        {
            break MISSING_BLOCK_LABEL_226;
        }
        obj = (CurrentWeatherContent)b.getChildAt(i1);
        if (obj == null || ((CurrentWeatherContent) (obj)).g()) goto _L6; else goto _L5
_L5:
        flag = flag1;
_L8:
        g = flag;
        return;
_L6:
        i1++;
          goto _L7
        flag = true;
          goto _L8
    }

    static boolean a(w w1, boolean flag)
    {
        w1.i = flag;
        return flag;
    }

    private void b()
    {
        int j1 = b.getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((CurrentWeatherContent)b.getChildAt(i1)).f();
        }

    }

    private boolean b(int i1, String s)
    {
        s = (CurrentWeatherContent)b.getChildAt(i1);
        if (s != null && !s.g())
        {
            s.a();
            s.setSelectionFromTop(k, l);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean b(w w1)
    {
        return w1.i;
    }

    static boolean b(w w1, String s)
    {
        return w1.i(s);
    }

    private void c()
    {
        int i1 = 0;
        ArrayList arraylist = e.d();
        int j1 = arraylist.size();
        boolean flag;
        if (j1 < 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        while (i1 < j1) 
        {
            String s = ((WeatherBean)arraylist.get(i1)).c();
            CurrentWeatherContent currentweathercontent = d();
            currentweathercontent.a(s);
            currentweathercontent.a(this);
            if (s.equals(d))
            {
                c = i1;
                currentweathercontent.a();
                currentweathercontent.setOnScrollListener(this);
            } else
            if (g)
            {
                currentweathercontent.a();
            }
            b.addView(currentweathercontent);
            i1++;
        }
        b.a();
        b.getScreenScroller().i(c);
        a(true, c);
    }

    static void c(w w1)
    {
        w1.l();
    }

    private CurrentWeatherContent d()
    {
        return (CurrentWeatherContent)a.inflate(0x7f030047, null, false);
    }

    static void d(w w1)
    {
        w1.o();
    }

    static CurrentWeatherContent e(w w1)
    {
        return w1.d();
    }

    static f f(w w1)
    {
        return w1.e;
    }

    static int g(w w1)
    {
        return w1.c;
    }

    static void h(w w1)
    {
        w1.p();
    }

    private void h(String s)
    {
        com.gau.go.launcherex.gowidget.statistics.q.a(getActivity().getApplicationContext()).a(new com.gau.go.launcherex.gowidget.statistics.a.a(93, s));
    }

    static void i(w w1)
    {
        w1.q();
    }

    private boolean i(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            int i1 = 0;
            while (i1 < b.getChildCount()) 
            {
                CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)b.getChildAt(i1);
                if (currentweathercontent == null || !s.equals(currentweathercontent.c()))
                {
                    i1++;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    static String j(w w1)
    {
        return w1.d;
    }

    private void j()
    {
        int j1 = b.getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((CurrentWeatherContent)b.getChildAt(i1)).d();
        }

    }

    private void j(String s)
    {
        if (TextUtils.isEmpty(s) || s.equals(d)) goto _L2; else goto _L1
_L1:
        int i1;
        d = s;
        i1 = 0;
_L7:
        if (i1 >= b.getChildCount()) goto _L2; else goto _L3
_L3:
        CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)b.getChildAt(i1);
        if (currentweathercontent == null || !s.equals(currentweathercontent.c())) goto _L5; else goto _L4
_L4:
        b.a(i1);
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void k()
    {
        int j1 = b.getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((CurrentWeatherContent)b.getChildAt(i1)).e();
        }

    }

    private void l()
    {
        if (!h)
        {
            a(c);
        }
    }

    private boolean m()
    {
        return GoWidgetApplication.c(getActivity()).a().getBoolean("key_home_screen_slide_tips", false);
    }

    private void n()
    {
        if (h)
        {
            return;
        } else
        {
            GoWidgetApplication.c(getActivity()).a().edit().putBoolean("key_home_screen_slide_tips", true).commit();
            return;
        }
    }

    private void o()
    {
        for (int i1 = 0; i1 < b.getChildCount(); i1++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)b.getChildAt(i1);
            if (currentweathercontent != null)
            {
                currentweathercontent.b();
            }
        }

    }

    private void p()
    {
        int j1 = b.getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((CurrentWeatherContent)b.getChildAt(i1)).setOnScrollListener(null);
        }

    }

    private void q()
    {
        ((CurrentWeatherContent)b.getChildAt(c)).setOnScrollListener(this);
    }

    protected void a(Bundle bundle)
    {
        int i1;
        super.a(bundle);
        CurrentWeatherContent currentweathercontent;
        if (bundle != null)
        {
            bundle = bundle.getString("cityId");
        } else
        {
            bundle = "";
        }
        if (TextUtils.isEmpty(bundle) || bundle.equals(d)) goto _L2; else goto _L1
_L1:
        d = bundle;
        i1 = 0;
_L7:
        if (i1 >= b.getChildCount()) goto _L2; else goto _L3
_L3:
        currentweathercontent = (CurrentWeatherContent)b.getChildAt(i1);
        if (currentweathercontent == null || !currentweathercontent.c().equals(bundle)) goto _L5; else goto _L4
_L4:
        b.a(i1);
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
    }

    public void a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s);
        a(com/go/weatherex/home/windforecast/c, bundle);
        h("c000_wind");
    }

    protected void b(int i1, Object obj)
    {
        switch (i1)
        {
        default:
            return;

        case 10: // '\n'
            j(String.valueOf(obj));
            break;
        }
    }

    public void b(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
        if (i1 < weatherdetailscrollgroup.getChildCount())
        {
            weatherdetailscrollgroup = (CurrentWeatherContent)weatherdetailscrollgroup.getChildAt(i1);
        } else
        {
            weatherdetailscrollgroup = null;
        }
        if (weatherdetailscrollgroup != null)
        {
            weatherdetailscrollgroup = weatherdetailscrollgroup.c();
        } else
        {
            weatherdetailscrollgroup = null;
        }
        if (!TextUtils.isEmpty(weatherdetailscrollgroup) && !weatherdetailscrollgroup.equals(d))
        {
            d = weatherdetailscrollgroup;
            if (!isHidden())
            {
                a(10, weatherdetailscrollgroup);
            }
        }
        a(false, i1);
    }

    public void b(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s);
        a(com/go/weatherex/home/hourforecast/c, bundle);
        h("24_hour_weather");
    }

    public void c(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
        int j1 = weatherdetailscrollgroup.getChildCount();
        if (i1 != c && r.c(i1, 0, j1 - 1))
        {
            c = i1;
            p();
            q();
            if (!TextUtils.isEmpty(d) && !isHidden())
            {
                a(12, d, 10L, true);
                return;
            }
        }
    }

    public void c(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s);
        a(com/go/weatherex/home/dayforecast/g, bundle);
        h("c000_moeweather");
    }

    public void d(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s);
        a(com/go/weatherex/home/rain/g, bundle);
        h("c000_rain");
    }

    public void e(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s);
        a(com/go/weatherex/home/c/a, bundle);
        h("c000_gl");
    }

    protected void f()
    {
        super.f();
        for (int i1 = 0; i1 < b.getChildCount(); i1++)
        {
            CurrentWeatherContent currentweathercontent = (CurrentWeatherContent)b.getChildAt(i1);
            if (currentweathercontent != null)
            {
                currentweathercontent.k();
            }
        }

    }

    public void f(String s)
    {
        boolean flag1 = true;
        if (!GoWidgetApplication.a)
        {
            Toast.makeText(getActivity(), 0x7f080301, 0).show();
        } else
        {
            Object obj = e.a(s);
            if (obj != null)
            {
                s = new Bundle();
                s.putString("cityId", ((WeatherBean) (obj)).c());
                NowBean nowbean = ((WeatherBean) (obj)).l;
                Intent intent = new Intent(getActivity(), com/gau/go/launcherex/gowidget/weather/view/MapDetailActivity);
                obj = ((WeatherBean) (obj)).d();
                double d1 = nowbean.w();
                double d2 = nowbean.v();
                boolean flag;
                if (nowbean.x() == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (nowbean.y() != 1)
                {
                    flag1 = false;
                }
                MapDetailActivity.a(intent, ((String) (obj)), d1, d2, flag, flag1, nowbean.C());
                intent.putExtras(s);
                startActivity(intent);
                h("c000_radio");
                return;
            }
        }
    }

    public void g(String s)
    {
        Intent intent = new Intent(getActivity(), com/go/weatherex/weatheralert/WeatherAlertActivity);
        intent.putExtra("cityId", s);
        startActivityForResult(intent, 0);
        getActivity().overridePendingTransition(0x7f040008, 0x7f04001e);
    }

    public void onActivityCreated(Bundle bundle)
    {
        int i1 = -1;
        super.onActivityCreated(bundle);
        bundle = getArguments();
        e = com.gau.go.launcherex.gowidget.weather.util.f.a(getActivity().getApplicationContext());
        b = (WeatherDetailScrollGroup)c(0x7f0902bd);
        b.a(true);
        b.a(this);
        if (bundle != null)
        {
            d = bundle.getString("cityId");
            i1 = bundle.getInt("detail_goto", -1);
        }
        if (TextUtils.isEmpty(d) && !e.c().isEmpty())
        {
            d = ((WeatherBean)e.d().get(0)).c();
        }
        c();
        a(i1, d);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new int[] {
            10, 3
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030079, viewgroup, false);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        b(f);
        b();
    }

    public void onPause()
    {
        super.onPause();
        j();
    }

    public void onResume()
    {
        super.onResume();
        k();
        if (!h)
        {
            h = m();
            if (e.e() != 0)
            {
                i = true;
                l();
            }
        }
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        float f1 = 0.0F;
        if (i1 == 0)
        {
            abslistview = abslistview.getChildAt(0);
            if (abslistview != null)
            {
                i1 = abslistview.getMeasuredHeight();
                f1 = r.a(((float)(-abslistview.getTop()) * 1.6F) / (float)i1, 0.0F, 1.0F);
                f1 = j.getInterpolation(f1);
            }
        } else
        {
            n();
            f1 = 1.0F;
        }
        a(9, Float.valueOf(f1));
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (i1 == 0)
        {
            k = abslistview.getFirstVisiblePosition();
            l = abslistview.getChildAt(0).getTop();
            a(k, l);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = getActivity().getLayoutInflater();
        a(f);
    }
}
