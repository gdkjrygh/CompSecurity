// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;

public class WeatherDetailInfo extends RelativeLayout
{

    private Context a;
    private com.gau.go.launcherex.gowidget.weather.util.f b;
    private e c;
    private WeatherBean d;
    private u e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private String t;
    private String u;

    public WeatherDetailInfo(Context context)
    {
        super(context);
        a(context);
    }

    public WeatherDetailInfo(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    private void a(Context context)
    {
        a = context;
        u = a.getString(0x7f0801e2);
    }

    private void d()
    {
        Object obj1 = d.l.j();
        String s1 = d.l.k();
        Object obj;
        if (!com.gau.go.launcherex.gowidget.weather.util.r.a(((String) (obj1))))
        {
            obj = u;
        } else
        {
            obj = obj1;
            if (!com.gau.go.launcherex.gowidget.weather.util.r.b(a))
            {
                try
                {
                    obj = ((String) (obj1)).split(":");
                    int i1 = Integer.parseInt(obj[0]);
                    StringBuffer stringbuffer = new StringBuffer();
                    stringbuffer.append(i1 % 12).append(":").append(obj[1]).append(" AM");
                    obj = stringbuffer.toString();
                }
                catch (NumberFormatException numberformatexception)
                {
                    numberformatexception.printStackTrace();
                    numberformatexception = ((NumberFormatException) (obj1));
                }
            }
        }
        if (!com.gau.go.launcherex.gowidget.weather.util.r.a(s1))
        {
            obj1 = u;
        } else
        {
            obj1 = s1;
            if (!com.gau.go.launcherex.gowidget.weather.util.r.b(a))
            {
                try
                {
                    obj1 = s1.split(":");
                    int j1 = Integer.parseInt(obj1[0]);
                    StringBuffer stringbuffer1 = new StringBuffer();
                    stringbuffer1.append(j1 % 12).append(":").append(obj1[1]).append(" PM");
                    obj1 = stringbuffer1.toString();
                }
                catch (NumberFormatException numberformatexception1)
                {
                    numberformatexception1.printStackTrace();
                    numberformatexception1 = s1;
                }
            }
        }
        if (!((String) (obj)).equals(u) && !((String) (obj1)).equals(u))
        {
            f.setText(((CharSequence) (obj)));
            g.setText(((CharSequence) (obj1)));
        }
    }

    private void e()
    {
        int i1 = d.l.c();
        View view = (View)(View)n.getParent();
        if (com.gau.go.launcherex.gowidget.weather.util.r.b(i1))
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append(i1).append("%");
            n.setText(stringbuffer);
            h.setText(0x7f0802ab);
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    private void f()
    {
        float f1 = d.l.l();
        View view = (View)(View)r.getParent();
        if (com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            r.setText((new StringBuilder()).append(f1).append("").toString());
            l.setText(0x7f0802ae);
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    private void g()
    {
        View view = (View)(View)s.getParent();
        if (com.gau.go.launcherex.gowidget.weather.c.c.a(a).e().b())
        {
            view.setVisibility(8);
            return;
        }
        int i1 = d.l.o();
        if (i1 >= 0 && i1 <= 100)
        {
            s.setText((new StringBuilder()).append(i1).append("%").toString());
            m.setText(0x7f0802b0);
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public void a()
    {
        float f1 = d.l.h();
        View view = (View)(View)o.getParent();
        if (com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            String s1;
            StringBuffer stringbuffer;
            if (e.A == 2)
            {
                f1 = com.gau.go.launcherex.gowidget.weather.util.q.i(f1, 2);
                s1 = a.getString(0x7f080207);
            } else
            {
                s1 = a.getString(0x7f080206);
            }
            stringbuffer = new StringBuffer();
            stringbuffer.append(f1).append(" ").append(s1);
            o.setText(stringbuffer);
            i.setText(0x7f0802ac);
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            return;
        } else
        {
            a1.a(f, 4, true);
            a1.a(g, 4, true);
            a1.a(h, 2, true);
            a1.a(i, 2, true);
            a1.a(j, 2, true);
            a1.a(k, 2, true);
            a1.a(l, 2, true);
            a1.a(m, 2, true);
            a1.a(n, 4, true);
            a1.a(o, 4, true);
            a1.a(p, 4, true);
            a1.a(q, 4, true);
            a1.a(r, 4, true);
            a1.a(s, 4, true);
            return;
        }
    }

    public void a(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            Object obj;
            if (b == null)
            {
                obj = com.gau.go.launcherex.gowidget.weather.util.f.a(a.getApplicationContext());
            } else
            {
                obj = b;
            }
            b = ((com.gau.go.launcherex.gowidget.weather.util.f) (obj));
            if (c == null)
            {
                obj = com.gau.go.launcherex.gowidget.weather.c.e.a(a.getApplicationContext());
            } else
            {
                obj = c;
            }
            c = ((e) (obj));
            if (e == null)
            {
                obj = c.a();
            } else
            {
                obj = e;
            }
            e = ((u) (obj));
            if (!s1.equals(t))
            {
                t = s1;
                d = b.a(t);
            }
            if (d != null)
            {
                d();
                e();
                a();
                c();
                b();
                f();
                g();
                return;
            }
        }
    }

    public void b()
    {
        float f1 = d.l.i();
        View view = (View)(View)p.getParent();
        if (com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            int i1 = e.B;
            String s1;
            StringBuffer stringbuffer;
            if (i1 == 1)
            {
                f1 = com.gau.go.launcherex.gowidget.weather.util.q.j(f1, 1);
                s1 = a.getString(0x7f080209);
            } else
            if (i1 == 2)
            {
                f1 = com.gau.go.launcherex.gowidget.weather.util.q.k(f1, 1);
                s1 = a.getString(0x7f08020a);
            } else
            if (i1 == 4)
            {
                f1 = com.gau.go.launcherex.gowidget.weather.util.q.l(f1, 1);
                s1 = a.getString(0x7f08020c);
            } else
            if (i1 == 5)
            {
                f1 = com.gau.go.launcherex.gowidget.weather.util.q.m(f1, 1);
                s1 = a.getString(0x7f08020d);
            } else
            if (i1 == 6)
            {
                f1 = com.gau.go.launcherex.gowidget.weather.util.q.n(f1, 1);
                s1 = a.getString(0x7f08020f);
            } else
            {
                s1 = a.getString(0x7f08020b);
            }
            stringbuffer = new StringBuffer();
            stringbuffer.append(f1).append(" ").append(s1);
            p.setText(stringbuffer);
            j.setText(0x7f0802af);
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public void c()
    {
        float f1 = d.l.f(e.g);
        View view = (View)(View)q.getParent();
        if (com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            String s1;
            StringBuffer stringbuffer;
            if (e.g == 1)
            {
                s1 = "\260C";
            } else
            {
                s1 = "\260F";
            }
            stringbuffer = new StringBuffer();
            stringbuffer.append(f1).append(s1);
            q.setText(stringbuffer);
            k.setText(0x7f0802ad);
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        f = (TextView)findViewById(0x7f090576);
        g = (TextView)findViewById(0x7f090577);
        h = (TextView)findViewById(0x7f090578);
        i = (TextView)findViewById(0x7f09057a);
        j = (TextView)findViewById(0x7f09057c);
        k = (TextView)findViewById(0x7f09057e);
        l = (TextView)findViewById(0x7f090580);
        m = (TextView)findViewById(0x7f090582);
        n = (TextView)findViewById(0x7f090579);
        o = (TextView)findViewById(0x7f09057b);
        p = (TextView)findViewById(0x7f09057d);
        q = (TextView)findViewById(0x7f09057f);
        r = (TextView)findViewById(0x7f090581);
        s = (TextView)findViewById(0x7f090583);
    }
}
