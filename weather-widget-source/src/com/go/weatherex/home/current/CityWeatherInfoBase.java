// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.PollenIndexBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            AirQualityIndex, PollenIndex

public class CityWeatherInfoBase extends LinearLayout
    implements android.view.View.OnClickListener
{

    private int A;
    private int B;
    private g C;
    private u D;
    private String E;
    private f F;
    private Context a;
    private int b[] = {
        0x7f020095, 0x7f020099, 0x7f02009a, 0x7f020092, 0x7f020093, 0x7f020096, 0x7f020098, 0x7f020094, 0x7f020097, 0x7f02009b
    };
    private String c;
    private String d;
    private WeatherBean e;
    private TextView f;
    private TextView g;
    private View h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private View m;
    private TextView n;
    private TextView o;
    private ImageView p;
    private View q;
    private TextView r;
    private TextView s;
    private View t;
    private TextView u;
    private TextView v;
    private ImageView w;
    private TextView x;
    private int y;
    private int z;

    public CityWeatherInfoBase(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        c = "";
        d = "";
        e = null;
        x = null;
        C = null;
        D = null;
        E = "";
        a = context;
        context = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext());
        F = context.e();
        C = context.g();
        D = context.f().a();
        E = a.getText(0x7f0801e2).toString();
    }

    private void a(String s1, String s2)
    {
        c = s1;
        d = s2;
    }

    private boolean a(int i1, String s1)
    {
        float f1 = e.l.a(i1);
        if (!com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            f.setText("--\260");
            return false;
        } else
        {
            i1 = com.gau.go.launcherex.gowidget.weather.util.q.a(f1);
            f.setText((new StringBuilder()).append(i1).append("\260").toString());
            return true;
        }
    }

    private String b(String s1)
    {
        String s2;
label0:
        {
            if (s1 != null)
            {
                s2 = s1;
                if (!"--".equals(s1))
                {
                    break label0;
                }
            }
            s2 = getResources().getString(0x7f0801e2);
        }
        return s2;
    }

    private void b(int i1, String s1)
    {
        float f1 = e.l.j(i1);
        if (f1 != -10000F)
        {
            n.setText(0x7f0802a5);
            o.setText((new StringBuilder()).append(com.gau.go.launcherex.gowidget.weather.util.q.a(f1)).append(s1).toString());
            m.setVisibility(0);
            return;
        } else
        {
            m.setVisibility(8);
            return;
        }
    }

    private void c(int i1, String s1)
    {
        float f1 = e.l.b(i1);
        String s2;
        if (!com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            s2 = E;
        } else
        {
            s2 = (new StringBuilder()).append(com.gau.go.launcherex.gowidget.weather.util.q.a(f1)).append(s1).toString();
        }
        f1 = e.l.c(i1);
        if (!com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            s1 = E;
        } else
        {
            s1 = (new StringBuilder()).append(com.gau.go.launcherex.gowidget.weather.util.q.a(f1)).append(s1).toString();
        }
        i.setText(0x7f08028f);
        k.setText(0x7f080290);
        j.setText(s2);
        l.setText(s1);
    }

    private void d()
    {
        if (!com.go.weatherex.i.c.a(e) && !com.gau.go.launcherex.gowidget.weather.b.r.a(a).b())
        {
            a(a.getText(0x7f0801e6).toString());
            return;
        } else
        {
            a(((String) (null)));
            return;
        }
    }

    private void e()
    {
        if (e == null)
        {
            return;
        }
        int i1 = e.l.p();
        if (i1 != -10000 && i1 != 0)
        {
            r.setText(0x7f0802c2);
            s.setText((new StringBuilder()).append(i1).append("").toString());
            q.setVisibility(0);
            return;
        } else
        {
            q.setVisibility(8);
            return;
        }
    }

    private void f()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        java.util.ArrayList arraylist = e.i;
        if (arraylist != null && arraylist.size() > 0)
        {
            u.setText(0x7f0802c9);
            v.setText("N/A");
            t.setVisibility(0);
            android.text.format.Time time = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext()).g().c(e.l.n());
            int i1 = 0;
            do
            {
                if (i1 >= arraylist.size())
                {
                    continue; /* Loop/switch isn't completed */
                }
                PollenIndexBean pollenindexbean = (PollenIndexBean)arraylist.get(i1);
                if (pollenindexbean != null && com.gau.go.launcherex.gowidget.weather.util.r.a(pollenindexbean.b(), pollenindexbean.c() + 1, pollenindexbean.d(), time))
                {
                    float f1 = pollenindexbean.f();
                    if (f1 != -10000F)
                    {
                        f1 = (float)Math.round(f1 * 10F) / 10F;
                        v.setText((new StringBuilder()).append(f1).append("").toString());
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
            } while (true);
        }
        t.setVisibility(8);
        return;
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void g()
    {
        byte byte0 = 8;
        ImageView imageview = w;
        if (q.getVisibility() != 8 || t.getVisibility() != 8)
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
    }

    private void h()
    {
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(q, 1000))
        {
            Intent intent = new Intent();
            intent.setClass(a, com/go/weatherex/home/current/AirQualityIndex);
            intent.putExtra("cityId", c);
            ((Activity)a).startActivityForResult(intent, 0);
            ((Activity)a).overridePendingTransition(0x7f040008, 0x7f04001e);
        }
    }

    private void i()
    {
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(t, 1000))
        {
            Intent intent = new Intent();
            intent.setClass(a, com/go/weatherex/home/current/PollenIndex);
            intent.putExtra("cityId", c);
            ((Activity)a).startActivityForResult(intent, 0);
            ((Activity)a).overridePendingTransition(0x7f040008, 0x7f04001e);
        }
    }

    public void a()
    {
        int i1 = 0;
        if (e != null)
        {
            g.setCompoundDrawablesWithIntrinsicBounds(com.gau.go.launcherex.gowidget.weather.util.r.a(b, e.l.d(), a(e)), 0, 0, 0);
            int j1 = D.g;
            String s1;
            Object obj;
            boolean flag;
            if (j1 == 1)
            {
                s1 = "\260C";
            } else
            {
                s1 = "\260F";
            }
            flag = a(j1, s1);
            obj = e.l.e();
            if (!com.gau.go.launcherex.gowidget.weather.util.r.a(((String) (obj))))
            {
                g.setText(E);
            } else
            {
                g.setText(b(((String) (obj))));
            }
            obj = h;
            if (!flag)
            {
                i1 = 8;
            }
            ((View) (obj)).setVisibility(i1);
            if (flag)
            {
                e();
                f();
                g();
                b();
                c(j1, s1);
                b(j1, s1);
                d();
                requestLayout();
                return;
            }
        }
    }

    public void a(int i1)
    {
        switch (i1)
        {
        default:
            a(a.getText(0x7f0801e5).toString());
            return;

        case 1: // '\001'
        case 2: // '\002'
            a("");
            return;

        case 3: // '\003'
            a(a.getText(0x7f0801e6).toString());
            break;
        }
    }

    public void a(a a1)
    {
        a1.a(g, 4, 0);
        a1.a(f, 3, 0);
        a1.a(n, 4, 0);
        a1.a(o, 2, 0);
        a1.a(i, 4, 0);
        a1.a(j, 2, 0);
        a1.a(k, 4, 0);
        a1.a(l, 2, 0);
        a1.a(r, 4, 0);
        a1.a(s, 2, 0);
        a1.a(u, 4, 0);
        a1.a(v, 2, 0);
    }

    public void a(String s1)
    {
        if (!TextUtils.isEmpty(s1) && !com.go.weatherex.i.c.a(e))
        {
            x.setVisibility(0);
            x.setText(s1);
            return;
        } else
        {
            x.setVisibility(8);
            return;
        }
    }

    public boolean a(WeatherBean weatherbean)
    {
        if (weatherbean == null)
        {
            return true;
        }
        String s1 = weatherbean.l.j();
        String s2 = weatherbean.l.k();
        if (F.b() && C.d())
        {
            int i1 = weatherbean.l.n();
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2, C.b(i1));
        } else
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2);
        }
    }

    public void b()
    {
        if (e != null && e.p())
        {
            p.setVisibility(0);
            return;
        } else
        {
            p.setVisibility(8);
            return;
        }
    }

    public void b(WeatherBean weatherbean)
    {
        if (weatherbean != null)
        {
            e = weatherbean;
            a(e.c(), e.d());
            String s1 = weatherbean.l.j();
            weatherbean = weatherbean.l.k();
            if (com.gau.go.launcherex.gowidget.weather.util.r.a(s1) && com.gau.go.launcherex.gowidget.weather.util.r.a(weatherbean))
            {
                try
                {
                    String as[] = s1.split(":");
                    y = Integer.parseInt(as[0]);
                    z = Integer.parseInt(as[1]);
                    weatherbean = weatherbean.split(":");
                    A = Integer.parseInt(weatherbean[0]);
                    B = Integer.parseInt(weatherbean[1]);
                }
                // Misplaced declaration of an exception variable
                catch (WeatherBean weatherbean)
                {
                    weatherbean.printStackTrace();
                }
            } else
            {
                y = 6;
                z = 0;
                A = 18;
                B = 0;
            }
        }
        d();
    }

    public View c()
    {
        return p;
    }

    public void onClick(View view)
    {
        if (!view.equals(w)) goto _L2; else goto _L1
_L1:
        if (q.getVisibility() != 0) goto _L4; else goto _L3
_L3:
        h();
_L6:
        return;
_L4:
        if (t.getVisibility() == 0)
        {
            i();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (view.equals(q))
        {
            h();
            return;
        }
        if (view.equals(t))
        {
            i();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        f = (TextView)findViewById(0x7f09020d);
        h = findViewById(0x7f09020f);
        i = (TextView)findViewById(0x7f090214);
        j = (TextView)findViewById(0x7f090215);
        k = (TextView)findViewById(0x7f090216);
        l = (TextView)findViewById(0x7f090217);
        g = (TextView)findViewById(0x7f09020c);
        m = findViewById(0x7f090210);
        n = (TextView)findViewById(0x7f090211);
        o = (TextView)findViewById(0x7f090212);
        p = (ImageView)findViewById(0x7f09020e);
        q = findViewById(0x7f090218);
        r = (TextView)findViewById(0x7f090219);
        s = (TextView)findViewById(0x7f09021a);
        q.setOnClickListener(this);
        t = findViewById(0x7f09021b);
        u = (TextView)findViewById(0x7f09021c);
        v = (TextView)findViewById(0x7f09021d);
        t.setOnClickListener(this);
        w = (ImageView)findViewById(0x7f09021e);
        w.setOnClickListener(this);
        x = (TextView)findViewById(0x7f09021f);
    }
}
