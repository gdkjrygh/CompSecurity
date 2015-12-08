// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.text.format.Time;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            an, a, ao, aq

public abstract class ap extends an
{

    private static final int t[] = {
        0x7f0801bc, 0x7f0801bd, 0x7f0801be, 0x7f0801bf, 0x7f0801c0, 0x7f0801c1, 0x7f0801c2
    };
    protected TextView i;
    protected TextView j;
    protected TextView k;
    protected TextView l;
    protected TextView m;
    protected TextView n;
    protected ImageView o;
    protected aq p;
    protected final int q[] = {
        0x7f020468, 0x7f02046c, 0x7f02046d, 0x7f02045a, 0x7f02045b, 0x7f020469, 0x7f02046b, 0x7f02045c, 0x7f02046a, 0x7f02046e
    };
    private WeatherBean r;
    private u s;

    public ap(Context context, int i1)
    {
        super(context, i1);
    }

    public static String a(Context context, int i1, float f1)
    {
        if (i1 == 1)
        {
            return context.getString(0x7f080211, new Object[] {
                Float.valueOf(com.gau.go.launcherex.gowidget.weather.util.q.c(f1, 1))
            });
        }
        if (i1 == 4)
        {
            return context.getString(0x7f080214, new Object[] {
                Float.valueOf(com.gau.go.launcherex.gowidget.weather.util.q.e(f1, 1))
            });
        }
        if (i1 == 3)
        {
            return context.getString(0x7f080213, new Object[] {
                Float.valueOf(com.gau.go.launcherex.gowidget.weather.util.q.d(f1, 1))
            });
        }
        if (i1 == 5)
        {
            return context.getString(0x7f080215, new Object[] {
                Integer.valueOf(com.gau.go.launcherex.gowidget.weather.util.q.a(f1))
            });
        }
        if (i1 == 6)
        {
            return context.getString(0x7f080216, new Object[] {
                Float.valueOf(com.gau.go.launcherex.gowidget.weather.util.q.f(f1, 1))
            });
        } else
        {
            return context.getString(0x7f080212, new Object[] {
                Float.valueOf(f1)
            });
        }
    }

    public static boolean a(Context context, WeatherBean weatherbean, boolean flag)
    {
        if (weatherbean == null)
        {
            context = new Time();
            context.setToNow();
            return ((Time) (context)).hour > 5 && ((Time) (context)).hour < 19;
        }
        String s1 = weatherbean.l.j();
        String s2 = weatherbean.l.k();
        if (flag)
        {
            context = new g(context);
            context.a(true);
            flag = com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2, context.b(weatherbean.l.n()));
            context.b();
            return flag;
        } else
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2);
        }
    }

    public static String b(Context context, int i1)
    {
        return context.getString(t[i1]);
    }

    public ao a()
    {
        a a1 = new a(this);
        a1.a(s);
        a1.a(r);
        return a1;
    }

    public void a(WeatherBean weatherbean, u u1)
    {
        r = weatherbean;
        s = u1;
        k();
        p();
        q();
        o();
        n();
        m();
        l();
    }

    protected void k()
    {
        boolean flag = true;
        if (o == null)
        {
            return;
        }
        int i1;
        if (r != null)
        {
            i1 = r.l.d();
        } else
        {
            i1 = 1;
        }
        if (!c.a(a.getApplicationContext()).e().b() || s.r != 1)
        {
            flag = false;
        }
        flag = a(a, r, flag);
        i1 = com.gau.go.launcherex.gowidget.weather.util.r.a(q, i1, flag);
        o.setImageResource(i1);
    }

    protected void l()
    {
        if (m == null)
        {
            return;
        } else
        {
            Time time = new Time();
            time.setToNow();
            m.setText(b(a, time.weekDay));
            return;
        }
    }

    protected void m()
    {
        if (l == null)
        {
            return;
        } else
        {
            Object obj = new Time();
            ((Time) (obj)).setToNow();
            obj = (new StringBuilder()).append(((Time) (obj)).year).append("/").append(((Time) (obj)).month + 1).append("/").append(((Time) (obj)).monthDay).append(" ").toString();
            l.setText(((CharSequence) (obj)));
            return;
        }
    }

    protected void n()
    {
        String s1;
        if (j == null || k == null)
        {
            return;
        }
        int i1 = s.g;
        float f1;
        float f2;
        String s2;
        String s3;
        if (i1 == 1)
        {
            s3 = "\260C";
        } else
        {
            s3 = "\260F";
        }
        s1 = "--";
        s2 = s1;
        if (r == null) goto _L2; else goto _L1
_L1:
        f1 = r.l.b(i1);
        f2 = r.l.c(i1);
        if (com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            s1 = (new StringBuilder()).append(com.gau.go.launcherex.gowidget.weather.util.q.a(f1)).append(s3).toString();
        }
        s2 = s1;
        if (!com.gau.go.launcherex.gowidget.weather.util.r.b(f2)) goto _L2; else goto _L3
_L3:
        s3 = (new StringBuilder()).append(com.gau.go.launcherex.gowidget.weather.util.q.a(f2)).append(s3).toString();
        s2 = s1;
        s1 = s3;
_L5:
        j.setText(s2);
        k.setText(s1);
        return;
_L2:
        s1 = "--";
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void o()
    {
        if (n == null)
        {
            return;
        }
        int i1 = s.q;
        String s2 = b(0x7f0801e2);
        String s1 = null;
        float f1 = -10000F;
        if (r != null)
        {
            s1 = r.l.b();
            f1 = r.l.a();
        }
        if (!com.gau.go.launcherex.gowidget.weather.util.r.a(s1) && !com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            s1 = (new StringBuilder()).append(b(0x7f080515)).append(s2).toString();
        } else
        {
            String s3 = a(a, i1, f1);
            if (i1 == 5)
            {
                s1 = (new StringBuilder()).append(b(0x7f080515)).append(s1).append(" ,  ").append(s3).toString();
            } else
            {
                s1 = (new StringBuilder()).append(b(0x7f080515)).append(s3).append(" , ").append(s1).toString();
            }
        }
        n.setText(s1);
    }

    protected void p()
    {
        if (p == null)
        {
            return;
        } else
        {
            p.a(r, s);
            return;
        }
    }

    protected void q()
    {
        if (i == null)
        {
            return;
        }
        String s2 = b(0x7f0801e2).toString();
        String s1 = s2;
        if (r != null)
        {
            s1 = s2;
            if (com.gau.go.launcherex.gowidget.weather.util.r.a(r.l.e()))
            {
                s1 = r.l.e();
            }
        }
        i.setText(s1);
    }

}
