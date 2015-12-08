// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.windforecast;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.windforecast:
//            a, WindInfoBase, c

public class WeatherWindViewHolder extends LinearLayout
{

    private static final int l[] = {
        0x7f02062d, 0x7f02062b, 0x7f02062a, 0x7f02062c, 0x7f02062f, 0x7f020632, 0x7f020630, 0x7f020631, 0x7f02062e
    };
    private static final int m[] = {
        0x7f080084, 0x7f0802eb, 0x7f0802ec, 0x7f0802ef, 0x7f0802f1, 0x7f0802f4
    };
    private Context a;
    private WindInfoBase b;
    private TextView c;
    private String d;
    private String e[];
    private String f;
    private ListView g;
    private e h;
    private com.jiubang.a.a.e i;
    private com.go.weatherex.home.windforecast.c j;
    private boolean k;

    public WeatherWindViewHolder(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = null;
        c = null;
        d = null;
        k = false;
        a(context);
    }

    private int a(int i1)
    {
        if (i1 == -10000 || i1 == 0)
        {
            return 0x7f020633;
        }
        if (i1 < 5)
        {
            return 0x7f020634;
        }
        return i1 >= 11 ? 0x7f020636 : 0x7f020635;
    }

    static int a(WeatherWindViewHolder weatherwindviewholder, int i1)
    {
        return weatherwindviewholder.a(i1);
    }

    static com.go.weatherex.home.windforecast.c a(WeatherWindViewHolder weatherwindviewholder)
    {
        return weatherwindviewholder.j;
    }

    static String a(WeatherWindViewHolder weatherwindviewholder, float f1)
    {
        return weatherwindviewholder.b(f1);
    }

    private void a(Context context)
    {
        a = context;
        h = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext()).f();
        e = com.gau.go.launcherex.gowidget.weather.util.c.h(a);
        f = a.getResources().getString(0x7f0802b7).toUpperCase();
        for (int i1 = e.length - 1; i1 > -1; i1--)
        {
            e[i1] = r.e(e[i1]);
        }

    }

    private int b(int i1)
    {
        if (i1 < 1)
        {
            return m[0];
        }
        if (i1 < 3)
        {
            return m[1];
        }
        if (i1 < 5)
        {
            return m[2];
        }
        if (i1 < 8)
        {
            return m[3];
        }
        if (i1 < 11)
        {
            return m[4];
        } else
        {
            return m[5];
        }
    }

    static int b(WeatherWindViewHolder weatherwindviewholder, int i1)
    {
        return weatherwindviewholder.b(i1);
    }

    static e b(WeatherWindViewHolder weatherwindviewholder)
    {
        return weatherwindviewholder.h;
    }

    private String b(float f1)
    {
        switch (h.a().q)
        {
        default:
            return "--";

        case 2: // '\002'
            return a.getString(0x7f080212, new Object[] {
                Float.valueOf(q.b(f1))
            });

        case 1: // '\001'
            return a.getString(0x7f080211, new Object[] {
                Float.valueOf(q.c(f1, 1))
            });

        case 3: // '\003'
            return a.getString(0x7f080213, new Object[] {
                Float.valueOf(q.d(f1, 1))
            });

        case 4: // '\004'
            return a.getString(0x7f080214, new Object[] {
                Float.valueOf(q.e(f1, 1))
            });

        case 5: // '\005'
            return a.getString(0x7f080215, new Object[] {
                Integer.valueOf(q.a(f1))
            });

        case 6: // '\006'
            return a.getString(0x7f080216, new Object[] {
                Float.valueOf(q.f(f1, 1))
            });
        }
    }

    private void b(String s, boolean flag)
    {
        Object obj = com.gau.go.launcherex.gowidget.weather.util.f.a(a).a(b());
        if (obj == null || ((WeatherBean) (obj)).g == null)
        {
            g.setVisibility(8);
            c.setVisibility(0);
            return;
        }
        int i1 = ((WeatherBean) (obj)).l.n();
        obj = com.gau.go.launcherex.gowidget.weather.util.f.a(a).a().c(i1);
        s = com.go.weatherex.i.c.b(a, s);
        if (s.size() == 0)
        {
            g.setVisibility(8);
            c.setVisibility(0);
            return;
        }
        g.setVisibility(0);
        c.setVisibility(8);
        i = new com.jiubang.a.a.e(new a(this, a, s, ((android.text.format.Time) (obj))));
        if (flag)
        {
            i.a(700L, 130L, 420L, 50F);
        } else
        {
            i.a(0L, 0L, 0L, 0.0F);
        }
        i.a(g);
        g.setAdapter(i);
    }

    private int c(int i1)
    {
        switch (i1)
        {
        default:
            return l[8];

        case 1: // '\001'
        case 2: // '\002'
            return l[8];

        case 3: // '\003'
            return l[4];

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return l[5];

        case 7: // '\007'
            return l[6];

        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            return l[7];

        case 11: // '\013'
            return l[0];

        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            return l[1];

        case 15: // '\017'
            return l[2];

        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
            return l[3];
        }
    }

    static int c(WeatherWindViewHolder weatherwindviewholder, int i1)
    {
        return weatherwindviewholder.c(i1);
    }

    static String c(WeatherWindViewHolder weatherwindviewholder)
    {
        return weatherwindviewholder.f;
    }

    static String[] d(WeatherWindViewHolder weatherwindviewholder)
    {
        return weatherwindviewholder.e;
    }

    protected void a()
    {
        e = com.gau.go.launcherex.gowidget.weather.util.c.h(a);
        f = a.getResources().getString(0x7f0802b7).toUpperCase();
    }

    public void a(float f1)
    {
        b.a(f1);
    }

    public void a(com.go.weatherex.home.windforecast.c c1)
    {
        j = c1;
    }

    public void a(String s, boolean flag)
    {
        k = true;
        b.a(j);
        d = s;
        a(flag);
        invalidate();
    }

    public void a(boolean flag)
    {
        ArrayList arraylist = com.gau.go.launcherex.gowidget.weather.util.f.a(a).d();
        if (!arraylist.isEmpty())
        {
            if (!r.a(b()))
            {
                d = ((WeatherBean)arraylist.get(0)).c();
            } else
            if (com.gau.go.launcherex.gowidget.weather.util.f.a(a).a(b()) == null)
            {
                d = ((WeatherBean)arraylist.get(0)).c();
            }
        }
        b.a(b());
        if (flag)
        {
            b.a(b(), 400L, 400L, 100F);
        } else
        {
            b.a(b(), 0L, 10L, 0.0F);
        }
        b(b(), flag);
    }

    public String b()
    {
        return d;
    }

    protected void onFinishInflate()
    {
        b = (WindInfoBase)findViewById(0x7f0903b9);
        b.a(0);
        c = (TextView)findViewById(0x7f0903ba);
        g = (ListView)findViewById(0x7f0903bb);
        g.setCacheColorHint(0);
        g.setSmoothScrollbarEnabled(true);
    }

}
