// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

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

// Referenced classes of package com.android.volley:
//            s, d, n, l, 
//            k, r, q, b, 
//            VolleyError, j, m

public abstract class Request
    implements Comparable
{

    private final s a;
    private final int b;
    private final String c;
    private final int d;
    private final n e;
    private Integer f;
    private l g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private q l;
    private b m;

    public Request(int i1, String s1, n n1)
    {
        s s2;
        if (s.a)
        {
            s2 = new s();
        } else
        {
            s2 = null;
        }
        a = s2;
        h = true;
        i = false;
        j = false;
        k = 0L;
        m = null;
        b = i1;
        c = s1;
        e = n1;
        l = new d();
        if (TextUtils.isEmpty(s1))
        {
            i1 = 0;
        } else
        {
            i1 = Uri.parse(s1).getHost().hashCode();
        }
        d = i1;
    }

    static s a(Request request)
    {
        return request.a;
    }

    private static byte[] a(Map map, String s1)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        try
        {
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append('&'))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s1));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s1));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder("Encoding not supported: ")).append(s1).toString(), map);
        }
        map = stringbuilder.toString().getBytes(s1);
        return map;
    }

    protected VolleyError a(VolleyError volleyerror)
    {
        return volleyerror;
    }

    protected abstract m a(j j1);

    public final void a(int i1)
    {
        f = Integer.valueOf(i1);
    }

    public final void a(l l1)
    {
        g = l1;
    }

    public final void a(q q1)
    {
        l = q1;
    }

    protected abstract void a(Object obj);

    public final void a(String s1)
    {
        if (s.a)
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
        h = false;
    }

    public final int b()
    {
        return d;
    }

    public void b(VolleyError volleyerror)
    {
        if (e != null)
        {
            e.a(volleyerror);
        }
    }

    final void b(String s1)
    {
        if (g != null)
        {
            g.b(this);
        }
        if (!s.a) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new k(this, s1, l1));
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
            com.android.volley.r.b("%d ms: %s", new Object[] {
                Long.valueOf(l2), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String c()
    {
        return c;
    }

    public int compareTo(Object obj)
    {
        obj = (Request)obj;
        Priority priority = n();
        Priority priority1 = ((Request) (obj)).n();
        if (priority == priority1)
        {
            return f.intValue() - ((Request) (obj)).f.intValue();
        } else
        {
            return priority1.ordinal() - priority.ordinal();
        }
    }

    public final String d()
    {
        return c();
    }

    public final b e()
    {
        return m;
    }

    public final void f()
    {
        i = true;
    }

    public final boolean g()
    {
        return i;
    }

    public Map h()
    {
        return Collections.emptyMap();
    }

    public String i()
    {
        return k();
    }

    public byte[] j()
    {
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            return null;
        }
    }

    public String k()
    {
        return (new StringBuilder("application/x-www-form-urlencoded; charset=")).append("UTF-8").toString();
    }

    public byte[] l()
    {
        return null;
    }

    public final boolean m()
    {
        return h;
    }

    public Priority n()
    {
        return Priority.NORMAL;
    }

    public final int o()
    {
        return l.a();
    }

    public final q p()
    {
        return l;
    }

    public final void q()
    {
        j = true;
    }

    public final boolean r()
    {
        return j;
    }

    public final int t_()
    {
        return b;
    }

    public String toString()
    {
        String s2 = (new StringBuilder("0x")).append(Integer.toHexString(d)).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (i)
        {
            s1 = "[X] ";
        } else
        {
            s1 = "[ ] ";
        }
        return stringbuilder.append(s1).append(c()).append(" ").append(s2).append(" ").append(n()).append(" ").append(f).toString();
    }

    private class Priority extends Enum
    {

        private static final Priority $VALUES[];
        public static final Priority HIGH;
        public static final Priority IMMEDIATE;
        public static final Priority LOW;
        public static final Priority NORMAL;

        public static Priority valueOf(String s1)
        {
            return (Priority)Enum.valueOf(com/android/volley/Request$Priority, s1);
        }

        public static Priority[] values()
        {
            return (Priority[])$VALUES.clone();
        }

        static 
        {
            LOW = new Priority("LOW", 0);
            NORMAL = new Priority("NORMAL", 1);
            HIGH = new Priority("HIGH", 2);
            IMMEDIATE = new Priority("IMMEDIATE", 3);
            $VALUES = (new Priority[] {
                LOW, NORMAL, HIGH, IMMEDIATE
            });
        }

        private Priority(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
