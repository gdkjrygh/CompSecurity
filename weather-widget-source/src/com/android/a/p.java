// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.a:
//            ac, f, r, u, 
//            s, q, ab, x, 
//            c, aa, m, t

public abstract class p
    implements Comparable
{

    private final ac a;
    private final int b;
    private final String c;
    private final int d;
    private final u e;
    private Integer f;
    private s g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private x l;
    private c m;
    private Object n;

    public p(int i1, String s1, u u1)
    {
        ac ac1;
        if (ac.a)
        {
            ac1 = new ac();
        } else
        {
            ac1 = null;
        }
        a = ac1;
        h = true;
        i = false;
        j = false;
        k = 0L;
        m = null;
        b = i1;
        c = s1;
        e = u1;
        a(new f());
        if (TextUtils.isEmpty(s1))
        {
            i1 = 0;
        } else
        {
            i1 = Uri.parse(s1).getHost().hashCode();
        }
        d = i1;
    }

    private byte[] a(Map map, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    return stringbuilder.toString().getBytes(s1);
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s1));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s1));
                stringbuilder.append('&');
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder("Encoding not supported: ")).append(s1).toString(), map);
        }
    }

    static ac b(p p1)
    {
        return p1.a;
    }

    public int a()
    {
        return b;
    }

    public int a(p p1)
    {
        r r1 = s();
        r r2 = p1.s();
        if (r1 == r2)
        {
            return f.intValue() - p1.f.intValue();
        } else
        {
            return r2.ordinal() - r1.ordinal();
        }
    }

    protected aa a(aa aa)
    {
        return aa;
    }

    protected abstract t a(m m1);

    public final void a(int i1)
    {
        f = Integer.valueOf(i1);
    }

    public void a(c c1)
    {
        m = c1;
    }

    public void a(s s1)
    {
        g = s1;
    }

    public void a(x x1)
    {
        l = x1;
    }

    public void a(Object obj)
    {
        n = obj;
    }

    public void a(String s1)
    {
        if (ac.a)
        {
            a.a(s1, Thread.currentThread().getId());
        } else
        if (k == 0L)
        {
            k = SystemClock.elapsedRealtime();
            return;
        }
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public Object b()
    {
        return n;
    }

    public void b(aa aa)
    {
        if (e != null)
        {
            e.a(aa);
        }
    }

    protected abstract void b(Object obj);

    void b(String s1)
    {
        if (g != null)
        {
            g.b(this);
        }
        if (!ac.a) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new q(this, s1, l1));
_L6:
        return;
_L4:
        a.a(s1, l1);
        a.a(toString());
        return;
_L2:
        long l2 = SystemClock.elapsedRealtime() - k;
        if (l2 >= 3000L)
        {
            ab.b("%d ms: %s", new Object[] {
                Long.valueOf(l2), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int c()
    {
        return d;
    }

    public int compareTo(Object obj)
    {
        return a((p)obj);
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return d();
    }

    public c f()
    {
        return m;
    }

    public void g()
    {
        i = true;
    }

    public boolean h()
    {
        return i;
    }

    public Map i()
    {
        return Collections.emptyMap();
    }

    protected Map j()
    {
        return n();
    }

    protected String k()
    {
        return o();
    }

    public String l()
    {
        return p();
    }

    public byte[] m()
    {
        Map map = j();
        if (map != null && map.size() > 0)
        {
            return a(map, k());
        } else
        {
            return null;
        }
    }

    protected Map n()
    {
        return null;
    }

    protected String o()
    {
        return "UTF-8";
    }

    public String p()
    {
        return (new StringBuilder("application/x-www-form-urlencoded; charset=")).append(o()).toString();
    }

    public byte[] q()
    {
        Map map = n();
        if (map != null && map.size() > 0)
        {
            return a(map, o());
        } else
        {
            return null;
        }
    }

    public final boolean r()
    {
        return h;
    }

    public r s()
    {
        return r.b;
    }

    public final int t()
    {
        return l.a();
    }

    public String toString()
    {
        String s2 = (new StringBuilder("0x")).append(Integer.toHexString(c())).toString();
        String s1;
        if (i)
        {
            s1 = "[X] ";
        } else
        {
            s1 = "[ ] ";
        }
        return (new StringBuilder(String.valueOf(s1))).append(d()).append(" ").append(s2).append(" ").append(s()).append(" ").append(f).toString();
    }

    public x u()
    {
        return l;
    }

    public void v()
    {
        j = true;
    }

    public boolean w()
    {
        return j;
    }
}
