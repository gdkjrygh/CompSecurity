// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gtp.a.a.c.c;
import java.util.Map;

// Referenced classes of package com.go.weatherex.home.current:
//            a

public class AirQualityIndex extends GoWeatherEXActivity
{

    public static final String a = (new StringBuilder()).append(com.gtp.a.a.c.c.a()).append("/share/weibo/aqi.jpg").toString();
    private static final int m[] = {
        0xffb7a902, 0xfff69802, 0xffec6102, 0xff7e0100
    };
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private String j;
    private WeatherBean k;
    private String l[] = {
        getString(0x7f0802c3), getString(0x7f0802c4), getString(0x7f0802c5), getString(0x7f0802c6)
    };
    private f n;
    private BroadcastReceiver o;

    public AirQualityIndex()
    {
        j = "";
        k = null;
        o = new a(this);
    }

    private void a()
    {
        if (TextUtils.isEmpty(j))
        {
            return;
        }
        k = (WeatherBean)n.c().get(j);
        if (k != null)
        {
            Object obj = k.l;
            b.setText((new StringBuilder()).append(k.d()).append("").toString());
            int i1 = ((NowBean) (obj)).p();
            if (i1 != -10000)
            {
                c.setText((new StringBuilder()).append(i1).append("").toString());
            } else
            {
                c.setText("--");
            }
            i1 = ((NowBean) (obj)).q() - 1;
            if (i1 >= 0 && i1 <= l.length + 1)
            {
                if (i1 == 0 || i1 == 1)
                {
                    d.setText(l[0]);
                    d.setTextColor(m[0]);
                } else
                if (i1 == 4 || i1 == 5)
                {
                    d.setText(l[3]);
                    d.setTextColor(m[3]);
                } else
                {
                    d.setText(l[i1 - 1]);
                    d.setTextColor(m[i1 - 1]);
                }
            } else
            {
                d.setText("--");
            }
            i1 = ((NowBean) (obj)).r();
            if (i1 != -10000)
            {
                f.setText((new StringBuilder()).append(i1).append("").toString());
            } else
            {
                f.setText("--");
            }
            i1 = ((NowBean) (obj)).s();
            if (i1 != -10000)
            {
                g.setText((new StringBuilder()).append(i1).append("").toString());
            } else
            {
                g.setText("--");
            }
            i1 = ((NowBean) (obj)).t();
            if (i1 != -10000)
            {
                h.setText((new StringBuilder()).append(i1).append("").toString());
            } else
            {
                h.setText("--");
            }
            i1 = ((NowBean) (obj)).u();
            if (i1 != -10000)
            {
                i.setText((new StringBuilder()).append(i1).append("").toString());
            } else
            {
                i.setText("--");
            }
            obj = r.a(this, k.l.f());
            if (((String) (obj)).equals("-10000"))
            {
                e.setText((new StringBuilder()).append(e().getString(0x7f08029a)).append(" : ").append("--").toString());
                return;
            } else
            {
                e.setText(((CharSequence) (obj)));
                return;
            }
        } else
        {
            c.setText("--");
            d.setText("--");
            f.setText("--");
            g.setText("--");
            h.setText("--");
            i.setText("--");
            e.setText((new StringBuilder()).append(e().getString(0x7f08029a)).append(" : ").append("--").toString());
            return;
        }
    }

    static void a(AirQualityIndex airqualityindex)
    {
        airqualityindex.a();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030019);
        getWindow().clearFlags(0x8000000);
        b = (TextView)findViewById(0x7f0900ff);
        c = (TextView)findViewById(0x7f0900fe);
        d = (TextView)findViewById(0x7f090100);
        f = (TextView)findViewById(0x7f090104);
        g = (TextView)findViewById(0x7f090108);
        h = (TextView)findViewById(0x7f09010d);
        i = (TextView)findViewById(0x7f090112);
        e = (TextView)findViewById(0x7f090114);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        registerReceiver(o, bundle);
        bundle = getIntent();
        if (bundle != null)
        {
            j = bundle.getStringExtra("cityId");
        }
        n = com.gau.go.launcherex.gowidget.weather.util.f.a(getApplicationContext());
        a();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(o);
        if (k != null)
        {
            k = null;
        }
    }

}
