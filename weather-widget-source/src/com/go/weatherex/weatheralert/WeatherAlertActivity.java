// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.weatheralert;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.scroller.WeatherDetailScrollGroup;
import com.gau.go.launcherex.gowidget.weather.scroller.l;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.view.Indicator;
import com.gau.go.launcherex.gowidget.weather.view.WeatherDetailActivity;
import com.gtp.a.a.b.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// Referenced classes of package com.go.weatherex.weatheralert:
//            h, f, a, b, 
//            c, d

public class WeatherAlertActivity extends Activity
    implements l
{

    private final h a = new h();
    private e b;
    private d c;
    private String d;
    private ArrayList e;
    private com.go.weatherex.weatheralert.f f;
    private TextView g;
    private View h;
    private com.go.weatherex.weatheralert.h i;
    private WeatherDetailScrollGroup j;
    private Indicator k;
    private View l;
    private TextView m;
    private CheckBox n;

    public WeatherAlertActivity()
    {
        e = new ArrayList();
        j = null;
        k = null;
    }

    static String a(WeatherAlertActivity weatheralertactivity, String s)
    {
        return weatheralertactivity.c(s);
    }

    static void a(WeatherAlertActivity weatheralertactivity)
    {
        weatheralertactivity.b();
    }

    static void a(WeatherAlertActivity weatheralertactivity, String s, boolean flag)
    {
        weatheralertactivity.a(s, flag);
    }

    private void a(String s, boolean flag)
    {
        String s3;
        String s1 = b.a().F;
        s3 = s1;
        if (s1 == null)
        {
            s3 = "";
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        String s2 = s3;
        if (!s3.contains(s)) goto _L4; else goto _L3
_L3:
        s = s3.replace(s, "");
        if (!s.startsWith("#")) goto _L6; else goto _L5
_L5:
        s.replaceFirst("#", "");
        s2 = s;
_L4:
        b.b(s2);
        b.a(WeatherContentProvider.g, "setting_key", "no_alerts_cities", "setting_value", s2);
        b.a(s2);
        b.a(WeatherContentProvider.g, "setting_key", "no_notify_temp_change_cities", "setting_value", s2);
        return;
_L6:
        if (s.contains("##"))
        {
            s2 = s.replace("##", "");
        } else
        {
            s2 = s;
            if (s.endsWith("#"))
            {
                s2 = s.substring(0, s.lastIndexOf("#"));
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        s2 = s3;
        if (!s3.contains(s))
        {
            if (TextUtils.isEmpty(s3))
            {
                s2 = s;
            } else
            {
                s2 = (new StringBuilder()).append(s3).append("#").append(s).toString();
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    private boolean a(String s)
    {
        String as[];
        Object obj;
        Object obj1;
        obj1 = null;
        String s1 = b.a().F;
        obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        as = obj1;
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        if (!((String) (obj)).contains("#")) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        try
        {
            as = ((String) (obj)).split("#");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            as = obj1;
            if (com.gtp.a.a.b.c.a())
            {
                ((Exception) (obj)).printStackTrace();
                as = obj1;
            }
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (as == null) goto _L6; else goto _L5
_L5:
        j1 = as.length;
        i1 = 0;
_L7:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = as[i1];
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).equals(s))
        {
            return false;
        }
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        as = new String[1];
        as[0] = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        if (true) goto _L7; else goto _L6
_L6:
        return true;
        if (true) goto _L2; else goto _L8
_L8:
    }

    static CheckBox b(WeatherAlertActivity weatheralertactivity)
    {
        return weatheralertactivity.n;
    }

    private String b(String s)
    {
        if (s != null)
        {
            int i1 = s.lastIndexOf(" ");
            if (i1 != -1)
            {
                return s.substring(0, i1);
            }
        }
        return "";
    }

    private void b()
    {
        Intent intent;
        if (j.b() >= i.getCount())
        {
            break MISSING_BLOCK_LABEL_136;
        }
        com.gau.go.launcherex.gowidget.weather.model.c c1 = (com.gau.go.launcherex.gowidget.weather.model.c)i.getItem(j.b());
        String s = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).h().e(c1.j());
        intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", getString(0x7f0801f5));
        intent.putExtra("android.intent.extra.TEXT", getString(0x7f0801f6, new Object[] {
            s, c1.f(), c(c1.c())
        }));
        startActivity(Intent.createChooser(intent, getString(0x7f0801dd)));
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        Toast.makeText(this, 0x7f0801de, 0).show();
        return;
    }

    static String c(WeatherAlertActivity weatheralertactivity)
    {
        return weatheralertactivity.d;
    }

    private String c(String s)
    {
        Object obj;
        Object obj1;
        obj1 = new SimpleDateFormat("yyyy/MM/dd HH:mm Z");
        obj = null;
        obj1 = ((SimpleDateFormat) (obj1)).parse(s);
        obj = obj1;
_L1:
        if (obj != null)
        {
            WeatherBean weatherbean = com.gau.go.launcherex.gowidget.weather.util.f.a(getApplicationContext()).a(d);
            if (weatherbean != null)
            {
                s = new Time();
                s.set(((Date) (obj)).getTime());
                s.set(s.toMillis(true) - (((Time) (s)).gmtoff * 1000L - (long)weatherbean.l.n()));
                obj = new StringBuffer();
                ((StringBuffer) (obj)).append(((Time) (s)).year).append("/");
                int i1 = ((Time) (s)).month + 1;
                Exception exception;
                if (i1 >= 0 && i1 <= 9)
                {
                    ((StringBuffer) (obj)).append("0").append(i1).append("/");
                } else
                {
                    ((StringBuffer) (obj)).append(i1).append("/");
                }
                i1 = ((Time) (s)).monthDay;
                if (i1 >= 0 && i1 <= 9)
                {
                    ((StringBuffer) (obj)).append("0").append(i1).append(" ");
                } else
                {
                    ((StringBuffer) (obj)).append(i1).append(" ");
                }
                i1 = ((Time) (s)).hour;
                if (i1 >= 0 && i1 <= 9)
                {
                    ((StringBuffer) (obj)).append("0").append(i1).append(":");
                } else
                {
                    ((StringBuffer) (obj)).append(i1).append(":");
                }
                i1 = ((Time) (s)).minute;
                if (i1 >= 0 && i1 <= 9)
                {
                    ((StringBuffer) (obj)).append("0").append(i1);
                } else
                {
                    ((StringBuffer) (obj)).append(i1);
                }
                return ((StringBuffer) (obj)).toString();
            }
        }
        break MISSING_BLOCK_LABEL_323;
        exception;
        exception.printStackTrace();
          goto _L1
        return b(s);
    }

    private void c()
    {
        if (e.size() == 0)
        {
            finish();
            return;
        } else
        {
            i.a(e);
            d();
            return;
        }
    }

    static ArrayList d(WeatherAlertActivity weatheralertactivity)
    {
        return weatheralertactivity.e;
    }

    private void d()
    {
        j.removeAllViews();
        for (int i1 = 0; i1 < i.getCount(); i1++)
        {
            j.addView(i.getView(i1, null, null));
        }

        j.a();
        k.a(j.getChildCount());
        k.c((int)(10F * getResources().getDisplayMetrics().density));
        k.b(j.b());
    }

    static d e(WeatherAlertActivity weatheralertactivity)
    {
        return weatheralertactivity.c;
    }

    public void a()
    {
        c();
    }

    public void a(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
    }

    public void b(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
        k.b(i1);
    }

    public void c(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030129);
        getWindow().clearFlags(0x8000000);
        a.a(800L);
        b = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).f();
        bundle = getIntent();
        if (bundle != null)
        {
            d = bundle.getStringExtra("cityId");
            if (TextUtils.isEmpty(d))
            {
                finish();
                return;
            }
        }
        f = new com.go.weatherex.weatheralert.f(this, null);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_UPDATE_EXTREME_WEATHER");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_EXPIRED_EXTREME_WEATHER");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CLEAR_EXTREME_WEATHER");
        registerReceiver(f, bundle);
        g = (TextView)findViewById(0x7f090568);
        h = findViewById(0x7f090569);
        h.setOnClickListener(new a(this));
        j = (WeatherDetailScrollGroup)findViewById(0x7f09056a);
        j.a(this);
        i = new com.go.weatherex.weatheralert.h(this);
        k = (Indicator)findViewById(0x7f09056b);
        k.a(0x7f020614, 0x7f020613);
        k.c((int)(10F * getResources().getDisplayMetrics().density));
        l = findViewById(0x7f09056c);
        l.setOnClickListener(new b(this));
        m = (TextView)findViewById(0x7f09056d);
        n = (CheckBox)findViewById(0x7f09056e);
        bundle = n;
        boolean flag;
        if (!a(d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.setChecked(flag);
        n.setOnCheckedChangeListener(new com.go.weatherex.weatheralert.c(this));
        c = new d(this, getContentResolver());
        c.a(d);
    }

    public void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(f);
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && keyevent.getRepeatCount() == 0)
        {
            setResult(-1, new Intent(this, com/gau/go/launcherex/gowidget/weather/view/WeatherDetailActivity));
            finish();
            overridePendingTransition(0x7f04001e, 0x7f040009);
        }
        return false;
    }

    public void onStart()
    {
        super.onStart();
        w.a("weather_warning_detail_show", getApplicationContext());
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        setResult(-1, new Intent(this, com/gau/go/launcherex/gowidget/weather/view/WeatherDetailActivity));
        finish();
        overridePendingTransition(0x7f04001e, 0x7f040009);
        return super.onTouchEvent(motionevent);
    }
}
