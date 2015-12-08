// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.windforecast;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.framework.fragment.a;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.windforecast:
//            e, WeatherWindViewHolder

public class c extends a
    implements SensorEventListener
{

    private f a;
    private String b;
    private final e c = new e(this, null);
    private Time d;
    private WeatherWindViewHolder e;
    private SensorManager f;

    public c()
    {
        b = "";
    }

    static WeatherWindViewHolder a(c c1)
    {
        return c1.e;
    }

    private void a(boolean flag)
    {
        ArrayList arraylist = a.d();
        int i = 0;
        do
        {
label0:
            {
                if (i < arraylist.size())
                {
                    String s;
                    if (arraylist.get(i) != null)
                    {
                        s = ((WeatherBean)arraylist.get(i)).c();
                    } else
                    {
                        s = "";
                    }
                    e.a(this);
                    if (!s.equals(b))
                    {
                        break label0;
                    }
                    e.a(s, flag);
                }
                return;
            }
            i++;
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

    static boolean b(c c1)
    {
        return c1.b();
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

    protected void b(int i, Object obj)
    {
        i;
        JVM INSTR tableswitch 10 10: default 20
    //                   10 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (!isHidden())
        {
            b = String.valueOf(obj);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void f()
    {
        super.f();
        e.a();
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
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
        return layoutinflater.inflate(0x7f03009b, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        b(c);
    }

    public void onPause()
    {
        super.onPause();
        if (f != null)
        {
            f.unregisterListener(this);
            f = null;
        }
    }

    public void onResume()
    {
label0:
        {
            super.onResume();
            if (!com.gtp.a.a.c.c.b() && f == null)
            {
                f = (SensorManager)getActivity().getSystemService("sensor");
                if (f != null)
                {
                    break label0;
                }
            }
            return;
        }
        f.registerListener(this, f.getDefaultSensor(3), 0);
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        e.a(sensorevent.values[0]);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = com.gau.go.launcherex.gowidget.weather.util.f.a(getActivity().getApplicationContext());
        e = (WeatherWindViewHolder)c(0x7f0903b8);
        view = getArguments();
        if (view != null)
        {
            view = view.getString("cityId");
        } else
        {
            view = "";
        }
        b = view;
        d = new Time();
        d.setToNow();
        a(true);
        a(c);
    }
}
