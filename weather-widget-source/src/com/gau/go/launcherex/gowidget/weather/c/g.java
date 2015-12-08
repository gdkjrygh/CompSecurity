// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.c;

import android.content.Context;
import android.content.IntentFilter;
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.o;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.jiubang.b.b.b;
import com.jiubang.b.b.c;
import java.util.Calendar;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.c:
//            b, i, c, e

public class g extends com.gau.go.launcherex.gowidget.weather.c.b
{

    private static final String f[] = {
        "%Y/%m/%d", "%m/%d/%Y", "%d/%m/%Y"
    };
    private static final String g[] = {
        "%m/%d", "%m/%d", "%d/%m"
    };
    private static final int h[] = {
        0x7f0801bc, 0x7f0801bd, 0x7f0801be, 0x7f0801bf, 0x7f0801c0, 0x7f0801c1, 0x7f0801c2
    };
    private Context a;
    private u b;
    private i c;
    private Time d;
    private boolean e;
    private int i;
    private b j;
    private c k;

    public g(Context context)
    {
        d = new Time();
        e = false;
        i = 0;
        j = null;
        k = null;
        a = context;
        c = new i(this, null);
        context = new IntentFilter();
        context.addAction("android.intent.action.TIMEZONE_CHANGED");
        a.registerReceiver(c, context);
    }

    public String a(Time time)
    {
        boolean flag = true;
        StringBuffer stringbuffer;
        String s;
        int l;
        boolean flag1;
        if ("zh".equalsIgnoreCase(com.gau.go.launcherex.gowidget.language.e.a(a).b()))
        {
            l = 1;
        } else
        {
            l = 0;
        }
        stringbuffer = new StringBuffer();
        flag1 = r.b(a);
        s = time.format(g[i]);
        if (time.hour < 0 || time.hour >= 12)
        {
            flag = false;
        }
        if (l != 0)
        {
            stringbuffer.append(s);
            stringbuffer.append("\uFF0C");
            l = Integer.parseInt(time.format("%w"));
            stringbuffer.append(a.getText(h[l]));
            stringbuffer.append("\uFF0C");
            if (!flag1)
            {
                if (flag)
                {
                    stringbuffer.append(a.getText(0x7f0801f0));
                } else
                {
                    stringbuffer.append(a.getText(0x7f0801f1));
                }
                stringbuffer.append(time.format("%I:%M"));
            } else
            {
                stringbuffer.append(time.format("%H:%M"));
            }
        } else
        {
            l = Integer.parseInt(time.format("%w"));
            stringbuffer.append(a.getText(h[l]));
            stringbuffer.append(" ");
            stringbuffer.append(s);
            stringbuffer.append(" ");
            if (!flag1)
            {
                stringbuffer.append(time.format("%I:%M "));
                if (flag)
                {
                    stringbuffer.append(a.getText(0x7f0801f0));
                } else
                {
                    stringbuffer.append(a.getText(0x7f0801f1));
                }
            } else
            {
                stringbuffer.append(time.format("%H:%M"));
            }
        }
        return stringbuffer.toString();
    }

    public String a(Time time, boolean flag)
    {
        if (flag)
        {
            return time.format(g[i]);
        } else
        {
            return time.format(f[i]);
        }
    }

    public void a()
    {
        d = new Time();
    }

    protected void a(o o)
    {
        boolean flag1 = true;
        super.a(o);
        b = com.gau.go.launcherex.gowidget.weather.c.c.a(a).f().a();
        boolean flag;
        if (b.h == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        e(b.i);
        d(b.k);
        if (b.r == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(flag);
        a(6);
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public Time b(int l)
    {
        d.setToNow();
        if (e && l != -10000)
        {
            d.set(d.toMillis(true) - (d.gmtoff * 1000L - (long)l));
        }
        return d;
    }

    public String b(Time time)
    {
        Object obj = "";
        if (j != null)
        {
            obj = Calendar.getInstance();
            ((Calendar) (obj)).setTimeInMillis(time.toMillis(false));
            obj = j.a(((Calendar) (obj)));
        }
        return ((String) (obj));
    }

    public void b()
    {
        super.b();
        a.unregisterReceiver(c);
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            k = new c(a);
            return;
        } else
        {
            k = null;
            return;
        }
    }

    public Time c()
    {
        d.setToNow();
        return d;
    }

    public Time c(int l)
    {
        d.setToNow();
        if (l != -10000)
        {
            d.set(d.toMillis(true) - (d.gmtoff * 1000L - (long)l));
        }
        return d;
    }

    public String c(Time time)
    {
        Object obj = "";
        if (k != null)
        {
            obj = Calendar.getInstance();
            ((Calendar) (obj)).setTimeInMillis(time.toMillis(false));
            obj = k.a(((Calendar) (obj)), true);
        }
        return ((String) (obj));
    }

    public void d(int l)
    {
        i = l - 1;
        if (i < 0 || i >= f.length)
        {
            i = 0;
        }
    }

    public boolean d()
    {
        return e;
    }

    public void e(int l)
    {
        int i1;
        if (l == 0)
        {
            j = null;
            return;
        }
        i1 = 1;
        l;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 64
    //                   2 71
    //                   3 78;
           goto _L1 _L2 _L3 _L4
_L1:
        try
        {
            j = new b(a, l, i1);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return;
_L2:
        i1 = 0x7f050008;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 0x7f050007;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 0x7f050006;
        if (true) goto _L1; else goto _L5
_L5:
    }

}
