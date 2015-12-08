// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import com.jiubang.playsdk.d.c;
import com.jiubang.playsdk.d.d;
import com.jiubang.playsdk.d.f;
import com.jiubang.playsdk.d.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jiubang.playsdk.a:
//            s, v, r

public class b
    implements s
{

    private Map a;
    private r b;

    b(r r1)
    {
        a = new HashMap();
        b = r1;
    }

    public v a(String s1, v v1)
    {
        int l = 0;
        d d1 = b(s1);
        if (d1 != null)
        {
            s1 = f.a(s1);
            int i;
            int j;
            int k;
            if (s1 != null)
            {
                k = s1.b();
                j = s1.c();
                i = s1.a();
            } else
            {
                i = 0;
                j = 0;
                k = 0;
            }
            if (v1.b() == 1)
            {
                v1.b(d1.a());
                v1.a(i);
            }
            v1.b(v1.b() + 1);
            if (d1.e())
            {
                for (; l < d1.a.size(); l++)
                {
                    s1 = (c)d1.a.get(l);
                    if (s1 != null)
                    {
                        a(f.b(s1.a(), i, k, j), v1);
                    }
                }

            }
            v1.a(d1);
        }
        return v1;
    }

    public void a()
    {
        a.clear();
    }

    public void a(String s1, d d1)
    {
        a.put(s1, d1);
        b.a(s1, d1);
    }

    public volatile void a(String s1, Object obj)
    {
        a(s1, (d)obj);
    }

    public void a(String s1, boolean flag)
    {
        a.remove(s1);
        if (flag)
        {
            b.b(s1);
        }
    }

    public boolean a(String s1)
    {
        return a.containsKey(s1);
    }

    public d b(String s1)
    {
        d d2 = (d)a.get(s1);
        d d1 = d2;
        if (d2 == null)
        {
            d1 = b.a(s1);
            a.put(s1, d1);
        }
        return d1;
    }

    public v c(String s1)
    {
        return a(s1, new v());
    }

    public boolean d(String s1)
    {
        return b.c(s1);
    }

    public Object e(String s1)
    {
        return b(s1);
    }
}
