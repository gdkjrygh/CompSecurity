// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.a;

import com.gau.go.launcherex.gowidget.weather.util.r;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.jiubang.goweather.a:
//            e, c, d, b, 
//            f

public class a
{

    public int a;
    public volatile String b;
    public volatile String c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile e g;
    public volatile List h;
    public volatile List i;
    public volatile List j;
    public volatile List k;
    public volatile String l;
    public volatile String m;
    public volatile int n;
    public volatile List o;
    private String p;
    private String q;
    private float r;
    private float s;
    private int t;
    private int u;
    private double v[] = {
        -10000D, -10000D
    };
    private double w[] = {
        -10000D, -10000D
    };
    private String x;

    public a(String s1, String s2, long l1)
    {
        d = 0L;
        e = 0L;
        n = -10000;
        r = -10000F;
        s = -10000F;
        a(s1, s2, l1);
    }

    private void a(String s1, String s2, long l1)
    {
        b = s1;
        c = s2;
        d = l1;
        f = -10000L;
        e = -10000L;
        g = new e();
        h = new ArrayList();
        i = new ArrayList();
        j = new ArrayList();
        k = new ArrayList();
        o = new ArrayList();
        l = null;
    }

    private long e(String s1)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm Z");
        long l1;
        try
        {
            l1 = simpledateformat.parse(s1).getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return -10000L;
        }
        return l1;
    }

    public String a()
    {
        return l;
    }

    public void a(float f1)
    {
        r = f1;
    }

    public void a(int i1)
    {
        t = i1;
    }

    public void a(long l1)
    {
        f = l1;
    }

    public void a(String s1)
    {
        p = s1;
    }

    public void a(double ad[])
    {
        v = ad;
    }

    public String b()
    {
        return p;
    }

    public void b(float f1)
    {
        s = f1;
    }

    public void b(int i1)
    {
        u = i1;
    }

    public void b(long l1)
    {
        e = l1;
    }

    public void b(String s1)
    {
        q = s1;
    }

    public void b(double ad[])
    {
        w = ad;
    }

    public c c(int i1)
    {
        if (h == null || i1 < 0 || i1 >= h.size())
        {
            return null;
        } else
        {
            return (c)h.get(i1);
        }
    }

    public String c()
    {
        return q;
    }

    public void c(long l1)
    {
        d = l1;
    }

    public void c(String s1)
    {
        if (s1 == null || s1.equals("--"))
        {
            f = -10000L;
            return;
        } else
        {
            f = e(s1);
            return;
        }
    }

    public d d(int i1)
    {
        if (i == null || i1 < 0 || i1 >= i.size())
        {
            return null;
        } else
        {
            return (d)i.get(i1);
        }
    }

    public String d()
    {
        return b;
    }

    public void d(String s1)
    {
        x = s1;
    }

    public b e(int i1)
    {
        if (k == null || i1 < 0 || i1 >= k.size())
        {
            return null;
        } else
        {
            return (b)k.get(i1);
        }
    }

    public String e()
    {
        return c;
    }

    public float f()
    {
        return r;
    }

    public void f(int i1)
    {
        n = i1;
    }

    public float g()
    {
        return s;
    }

    public f g(int i1)
    {
        if (o == null || i1 < 0 || i1 >= o.size())
        {
            return null;
        } else
        {
            return (f)o.get(i1);
        }
    }

    public int h()
    {
        return t;
    }

    public void h(int i1)
    {
        a = i1;
    }

    public int i()
    {
        return u;
    }

    public double[] j()
    {
        return v;
    }

    public String k()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(v))
        {
            stringbuffer.append(v[0]);
            stringbuffer.append("#");
            stringbuffer.append(v[1]);
        } else
        {
            stringbuffer.append("");
        }
        return stringbuffer.toString();
    }

    public double[] l()
    {
        return w;
    }

    public String m()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(w))
        {
            stringbuffer.append(w[0]);
            stringbuffer.append("#");
            stringbuffer.append(w[1]);
        } else
        {
            stringbuffer.append("");
        }
        return stringbuffer.toString();
    }

    public long n()
    {
        return f;
    }

    public long o()
    {
        return e;
    }

    public long p()
    {
        return d;
    }

    public e q()
    {
        return g;
    }

    public int r()
    {
        if (h == null)
        {
            return 0;
        } else
        {
            return h.size();
        }
    }

    public int s()
    {
        if (i == null)
        {
            return 0;
        } else
        {
            return i.size();
        }
    }

    public int t()
    {
        if (k == null)
        {
            return 0;
        } else
        {
            return k.size();
        }
    }

    public int u()
    {
        return n;
    }

    public int v()
    {
        if (o == null)
        {
            return 0;
        } else
        {
            return o.size();
        }
    }

    public String w()
    {
        return x;
    }

    public int x()
    {
        return a;
    }
}
