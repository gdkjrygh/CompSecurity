// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.PollenIndexBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.q;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.view.WeatherDetailActivity;
import com.gtp.a.a.b.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.go.weatherex.home.current:
//            z

public class PollenIndex extends GoWeatherEXActivity
{

    private static final int n[] = {
        0x7f0802cc, 0x7f0802cd, 0x7f0802ce, 0x7f0802cf, 0x7f0802d0
    };
    private static final int o[] = {
        0x7f0a0068, 0x7f0a0069, 0x7f0a006a, 0x7f0a006b, 0x7f0a006c
    };
    private static final int p[] = {
        0x7f0203fd, 0x7f0203fe, 0x7f0203ff, 0x7f020400, 0x7f0203fc
    };
    private static final int q[] = {
        0x7f0203f8, 0x7f0203f9, 0x7f0203fa, 0x7f0203fb, 0x7f0203f7
    };
    private String a;
    private WeatherBean b;
    private f c;
    private TextView d;
    private TextView e;
    private TextView f;
    private LinearLayout g;
    private LinearLayout h[];
    private ImageView i[];
    private TextView j[];
    private TextView k[];
    private ImageView l[];
    private TextView m[];
    private BroadcastReceiver r;

    public PollenIndex()
    {
        a = "";
        b = null;
        c = null;
        r = new z(this);
    }

    private void a()
    {
        b();
        if (!TextUtils.isEmpty(a))
        {
            b = (WeatherBean)c.c().get(a);
            if (b != null)
            {
                d.setText(b.d());
                Time time = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).g().c(b.l.n());
                ArrayList arraylist = new ArrayList(b.i);
                if (arraylist != null)
                {
                    if (arraylist.size() > 4)
                    {
                        Object obj = (PollenIndexBean)arraylist.get(0);
                        obj = (new StringBuilder()).append(String.valueOf(((PollenIndexBean) (obj)).b())).append(String.valueOf(((PollenIndexBean) (obj)).c())).append(String.valueOf(((PollenIndexBean) (obj)).d())).toString();
                        if ((new StringBuilder()).append(String.valueOf(time.year)).append(String.valueOf(time.month)).append(String.valueOf(time.monthDay)).toString().compareTo(((String) (obj))) > 0)
                        {
                            arraylist.remove(0);
                        }
                    }
                    int i1 = 0;
                    while (i1 < arraylist.size()) 
                    {
                        PollenIndexBean pollenindexbean = (PollenIndexBean)arraylist.get(i1);
                        if (pollenindexbean == null)
                        {
                            continue;
                        }
                        Object obj1 = com.gau.go.launcherex.gowidget.weather.util.c.h(this)[pollenindexbean.e()];
                        float f1 = pollenindexbean.f();
                        if (f1 == -10000F)
                        {
                            continue;
                        }
                        f1 = (float)Math.round(f1 * 10F) / 10F;
                        int k1 = (int)((double)f1 / 2.3999999999999999D);
                        int j1 = k1;
                        if (k1 > 4)
                        {
                            j1 = 4;
                        }
                        if (com.gau.go.launcherex.gowidget.weather.util.r.a(pollenindexbean.b(), pollenindexbean.c() + 1, pollenindexbean.d(), time))
                        {
                            obj1 = getString(0x7f0802b7);
                            e.setText(String.valueOf(f1));
                            f.setText(getString(n[j1]));
                            f.setTextColor(e().getColor(o[j1]));
                            a(pollenindexbean);
                        }
                        if (i1 < 4)
                        {
                            k[i1].setText(((CharSequence) (obj1)));
                            k[i1].setVisibility(0);
                            m[i1].setBackgroundResource(p[j1]);
                            m[i1].setText(String.valueOf(f1));
                            m[i1].setVisibility(0);
                            l[i1].setBackgroundResource(q[j1]);
                            obj1 = l[i1].getLayoutParams();
                            double d1;
                            if ((double)f1 <= 13.199999999999999D)
                            {
                                d1 = f1;
                            } else
                            {
                                d1 = 13.199999999999999D;
                            }
                            obj1.height = (int)((d1 * (double)e().getDimension(0x7f0c01a6)) / 2.3999999999999999D);
                            l[i1].setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                            l[i1].setVisibility(0);
                        }
                        i1++;
                    }
                }
            }
        }
    }

    private void a(PollenIndexBean pollenindexbean)
    {
        if (pollenindexbean != null)
        {
            pollenindexbean = pollenindexbean.g();
            if (pollenindexbean != null)
            {
                int i1 = 0;
                while (i1 < pollenindexbean.size() && i1 < 2) 
                {
                    q q1 = (q)pollenindexbean.get(i1);
                    if (q1 == null)
                    {
                        continue;
                    }
                    Object obj = q1.a();
                    if (TextUtils.isEmpty(((CharSequence) (obj))) || ((String) (obj)).equals("--"))
                    {
                        continue;
                    }
                    j[i1].setText(((CharSequence) (obj)));
                    com.gtp.a.a.b.c.a("PollenIndex", ((String) (obj)));
                    obj = q1.b();
                    if (!TextUtils.isEmpty(((CharSequence) (obj))) && !((String) (obj)).equals("--"))
                    {
                        File file = new File((new StringBuilder()).append(a.c).append(com.jiubang.core.c.a.g.a(((String) (obj)))).append(".png").toString());
                        i[i1].setTag(file.getPath());
                        if (file.exists())
                        {
                            try
                            {
                                i[i1].setImageBitmap(BitmapFactory.decodeFile(file.getPath(), null));
                                g.setVisibility(0);
                                h[i1].setVisibility(0);
                                com.gtp.a.a.b.c.a("PollenIndex", (new StringBuilder()).append("show: ").append(file.getPath()).toString());
                            }
                            catch (Exception exception) { }
                        } else
                        {
                            obj = new com.jiubang.core.c.a.a(((String) (obj)), a.c, file.getName());
                            com.jiubang.core.c.a.g.a(getApplicationContext()).a(((com.jiubang.core.c.a.a) (obj)));
                            com.gtp.a.a.b.c.a("PollenIndex", (new StringBuilder()).append("download: ").append(file.getPath()).toString());
                        }
                    }
                    i1++;
                }
            }
        }
    }

    static void a(PollenIndex pollenindex)
    {
        pollenindex.a();
    }

    private void b()
    {
        int i1 = 0;
        d.setText("N/A");
        e.setText("N/A");
        f.setText("N/A");
        f.setTextColor(e().getColor(o[0]));
        g.setVisibility(4);
        h[0].setVisibility(4);
        i[0].setImageBitmap(null);
        j[0].setText("N/A");
        h[1].setVisibility(4);
        i[1].setImageBitmap(null);
        j[1].setText("N/A");
        for (; i1 < 4; i1++)
        {
            k[i1].setVisibility(4);
            l[i1].setVisibility(4);
            m[i1].setVisibility(4);
        }

    }

    static ImageView[] b(PollenIndex pollenindex)
    {
        return pollenindex.i;
    }

    static LinearLayout c(PollenIndex pollenindex)
    {
        return pollenindex.g;
    }

    static LinearLayout[] d(PollenIndex pollenindex)
    {
        return pollenindex.h;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300eb);
        getWindow().clearFlags(0x8000000);
        d = (TextView)findViewById(0x7f0904ab);
        e = (TextView)findViewById(0x7f0904ac);
        f = (TextView)findViewById(0x7f0904ad);
        g = (LinearLayout)findViewById(0x7f0904ae);
        h = (new LinearLayout[] {
            (LinearLayout)findViewById(0x7f0904b0), (LinearLayout)findViewById(0x7f0904b3)
        });
        i = (new ImageView[] {
            (ImageView)findViewById(0x7f0904b1), (ImageView)findViewById(0x7f0904b4)
        });
        j = (new TextView[] {
            (TextView)findViewById(0x7f0904b2), (TextView)findViewById(0x7f0904b5)
        });
        l = (new ImageView[] {
            (ImageView)findViewById(0x7f0904c0), (ImageView)findViewById(0x7f0904c3), (ImageView)findViewById(0x7f0904c6), (ImageView)findViewById(0x7f0904c9)
        });
        m = (new TextView[] {
            (TextView)findViewById(0x7f0904bf), (TextView)findViewById(0x7f0904c2), (TextView)findViewById(0x7f0904c5), (TextView)findViewById(0x7f0904c8)
        });
        k = (new TextView[] {
            (TextView)findViewById(0x7f0904b9), (TextView)findViewById(0x7f0904ba), (TextView)findViewById(0x7f0904bb), (TextView)findViewById(0x7f0904bc)
        });
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DOWNLOAD_PHOTO");
        registerReceiver(r, bundle);
        bundle = getIntent();
        if (bundle != null)
        {
            a = bundle.getStringExtra("cityId");
        }
        c = com.gau.go.launcherex.gowidget.weather.util.f.a(getApplicationContext());
        a();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(r);
        if (b != null)
        {
            b = null;
        }
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

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        setResult(-1, new Intent(this, com/gau/go/launcherex/gowidget/weather/view/WeatherDetailActivity));
        finish();
        overridePendingTransition(0x7f04001e, 0x7f040009);
        return super.onTouchEvent(motionevent);
    }

}
