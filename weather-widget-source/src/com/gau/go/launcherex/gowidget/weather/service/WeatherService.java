// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.v;
import com.gau.go.launcherex.gowidget.weather.util.w;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            n, l, b

public class WeatherService extends Service
{

    private l a;
    private SparseArray b;
    private n c;

    public WeatherService()
    {
        b = new SparseArray();
    }

    static SparseArray a(WeatherService weatherservice)
    {
        return weatherservice.b;
    }

    private void a()
    {
        c = new n(this, null);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.TIME_TICK");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATESTYLE_UNIT");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LUNAR");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FESTIVAL");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_CYCLE_MODE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_GOWIDGET_DYNAMIC_ICON_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GOWIDGET_THEME_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CONVERT_INDEX_STATE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ADD_CITY");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_THEME_SWITCHER_CHANGE");
        registerReceiver(c, intentfilter);
    }

    static void a(WeatherService weatherservice, Intent intent)
    {
        weatherservice.b(intent);
    }

    static void a(WeatherService weatherservice, String s)
    {
        weatherservice.a(s);
    }

    private void a(String s)
    {
        String s1;
        int i;
        int j;
        try
        {
            s1 = a.a(s);
        }
        catch (RemoteException remoteexception)
        {
            remoteexception.printStackTrace();
            remoteexception = null;
        }
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        j = b.size();
        i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)b.valueAt(i)).a(s, s1);
        i++;
        if (true) goto _L3; else goto _L2
        s;
        s.printStackTrace();
_L2:
    }

    private void b()
    {
        int j;
        boolean flag;
        flag = a.d();
        j = b.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)b.valueAt(i)).a(flag);
        i++;
        if (true) goto _L2; else goto _L1
        RemoteException remoteexception;
        remoteexception;
        remoteexception.printStackTrace();
_L1:
    }

    private void b(Intent intent)
    {
        int j;
        int k;
        j = intent.getIntExtra("extra_convert_from_index", -1);
        k = intent.getIntExtra("extra_convert_to_index", -1);
        if (j < 0 || k < 0 || j == k) goto _L2; else goto _L1
_L1:
        int i;
        int i1;
        i1 = b.size();
        i = 0;
_L3:
        if (i >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)b.valueAt(i)).a(j, k);
        i++;
        if (true) goto _L3; else goto _L2
        intent;
        intent.printStackTrace();
_L2:
    }

    static void b(WeatherService weatherservice)
    {
        weatherservice.b();
    }

    static void b(WeatherService weatherservice, Intent intent)
    {
        weatherservice.c(intent);
    }

    private void c(Intent intent)
    {
        WeatherBean weatherbean;
        int i;
        int j;
        String s = intent.getStringExtra("city_code");
        intent = intent.getStringExtra("city_name");
        weatherbean = new WeatherBean();
        weatherbean.c(s);
        weatherbean.e(intent);
        j = b.size();
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)b.valueAt(i)).a(weatherbean);
        i++;
        if (true) goto _L2; else goto _L1
        intent;
        intent.printStackTrace();
_L1:
    }

    static void c(WeatherService weatherservice, Intent intent)
    {
        weatherservice.d(intent);
    }

    private void d(Intent intent)
    {
        int i;
        int j;
        intent = intent.getStringArrayListExtra("city_code_list");
        j = b.size();
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)b.valueAt(i)).a(intent);
        i++;
        if (true) goto _L2; else goto _L1
        intent;
        intent.printStackTrace();
_L1:
    }

    static void d(WeatherService weatherservice, Intent intent)
    {
        weatherservice.e(intent);
    }

    private void e(Intent intent)
    {
        intent = a.c();
        if (intent == null) goto _L2; else goto _L1
_L1:
        int j = b.size();
        int i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)b.valueAt(i)).b(intent);
        i++;
        if (true) goto _L3; else goto _L2
        intent;
        intent.printStackTrace();
_L2:
    }

    static void e(WeatherService weatherservice, Intent intent)
    {
        weatherservice.f(intent);
    }

    private void f(Intent intent)
    {
        int j = intent.getIntExtra("extra_new_theme_flag", 0);
        int k = b.size();
        int i = 0;
_L2:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        intent = (b)b.valueAt(i);
        boolean flag;
        if (j == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.b(flag);
        i++;
        if (true) goto _L2; else goto _L1
        intent;
        intent.printStackTrace();
_L1:
    }

    public void a(Intent intent)
    {
        w w1 = (new v()).a(intent);
        if (w1 == null) goto _L2; else goto _L1
_L1:
        w1.a;
        JVM INSTR lookupswitch 3: default 56
    //                   1: 115
    //                   2: 120
    //                   11: 120;
           goto _L3 _L4 _L5 _L5
_L3:
        int i = 0;
_L9:
        if (i == 0) goto _L7; else goto _L6
_L6:
        intent = a.a();
_L10:
        int j = b.size();
        i = 0;
_L8:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)b.valueAt(i)).a(w1.a, intent);
        i++;
        if (true) goto _L8; else goto _L2
_L4:
        i = 1;
          goto _L9
_L5:
        i = 0;
          goto _L9
        intent;
        intent.printStackTrace();
_L2:
        return;
_L7:
        intent = null;
          goto _L10
    }

    public IBinder onBind(Intent intent)
    {
        return a;
    }

    public void onCreate()
    {
        super.onCreate();
        a = new l(this);
        a();
    }

    public void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(c);
    }
}
