// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.rain;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.framework.fragment.a;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.rain:
//            i, ForecastRainProbability

public class g extends a
{

    private f a;
    private String b;
    private i c;
    private Time d;
    private boolean e;
    private ForecastRainProbability f;

    public g()
    {
        b = "";
        c = new i(this, null);
        e = true;
    }

    static ForecastRainProbability a(g g1)
    {
        return g1.f;
    }

    private void a(boolean flag)
    {
        ArrayList arraylist = a.d();
        int j = 0;
        do
        {
label0:
            {
                if (j < arraylist.size())
                {
                    String s;
                    if (arraylist.get(j) != null)
                    {
                        s = ((WeatherBean)arraylist.get(j)).c();
                    } else
                    {
                        s = "";
                    }
                    if (!s.equals(b))
                    {
                        break label0;
                    }
                    f.a(s, flag, false);
                }
                return;
            }
            j++;
        } while (true);
    }

    private boolean b()
    {
        Time time = new Time();
        time.setToNow();
        if (d.year == time.year && d.month == time.month && d.monthDay == time.monthDay)
        {
            return false;
        } else
        {
            d.setToNow();
            return true;
        }
    }

    static boolean b(g g1)
    {
        return g1.b();
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle = bundle.getString("cityId");
        } else
        {
            bundle = "";
        }
        if (!TextUtils.isEmpty(bundle) && !bundle.equals(b))
        {
            b = bundle;
        }
    }

    protected void b(int j, Object obj)
    {
        j;
        JVM INSTR tableswitch 10 10: default 20
    //                   10 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (!isHidden() && (!TextUtils.isEmpty(((CharSequence) (obj = String.valueOf(obj)))) && !((String) (obj)).equals(b)))
        {
            b = ((String) (obj));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void f()
    {
        super.f();
        f.c();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new int[] {
            10
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030085, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onDestroyView()
    {
        b(c);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext()).h();
        f = (ForecastRainProbability)c(0x7f0902eb);
        f.a(this);
        d = new Time();
        d.setToNow();
        view = getArguments();
        if (view != null)
        {
            view = view.getString("cityId");
        } else
        {
            view = "";
        }
        b = view;
        a(true);
        a(c);
    }
}
