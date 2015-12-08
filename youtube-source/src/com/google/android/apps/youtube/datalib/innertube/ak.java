// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import android.text.TextUtils;
import com.google.a.a.a.a.ct;
import com.google.a.a.a.a.do;
import com.google.a.a.a.a.ii;
import com.google.a.a.a.a.m;
import com.google.a.a.a.a.mx;
import com.google.a.a.a.a.nv;
import com.google.a.a.a.a.qa;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.Util;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class ak extends b
{

    private int A;
    private String c;
    private String d;
    private String e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;
    private String l;
    private long m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private String r;
    private boolean s;
    private int t;
    private String u;
    private int v;
    private int w;
    private int x;
    private String y;
    private int z;

    ak(p p1)
    {
        super(p1);
        f = -1;
        g = false;
        h = false;
        i = false;
        j = false;
        k = "";
        l = "";
        m = -1L;
        n = -1;
        o = -1;
        p = -1;
        q = false;
        r = "";
        s = false;
        t = -1;
        v = 0;
        w = 0;
        x = 0;
        z = -1;
        A = -1;
    }

    public final ak a(int i1)
    {
        f = i1;
        return this;
    }

    public final ak a(long l1)
    {
        m = l1;
        return this;
    }

    public final ak a(String s1)
    {
        c = s1;
        return this;
    }

    public final ak a(boolean flag)
    {
        h = flag;
        return this;
    }

    public final Map a()
    {
        if (b == null)
        {
            super.a();
            if (u == null)
            {
                u = Util.a(9);
            }
            b.put("id", c);
            b.put("t", u);
        }
        return b;
    }

    public final ak b(int i1)
    {
        n = i1;
        return this;
    }

    public final ak b(String s1)
    {
        d = s1;
        return this;
    }

    public final ak b(boolean flag)
    {
        g = flag;
        return this;
    }

    public final ak c(int i1)
    {
        o = i1;
        return this;
    }

    public final ak c(String s1)
    {
        e = s1;
        return this;
    }

    public final ak c(boolean flag)
    {
        i = true;
        return this;
    }

    protected final void c()
    {
        com.google.android.apps.youtube.common.fromguava.c.a(c);
        if (A == -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (j)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.google.android.apps.youtube.common.fromguava.c.a(k);
        boolean flag;
        if (o != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        if (t != -1) goto _L1; else goto _L3
_L3:
        com.google.android.apps.youtube.common.fromguava.c.b(i);
        return;
        if (i) goto _L1; else goto _L4
_L4:
        com.google.android.apps.youtube.common.fromguava.c.a(y);
        return;
    }

    public final ak d(int i1)
    {
        t = i1;
        return this;
    }

    public final ak d(String s1)
    {
        k = s1;
        return this;
    }

    public final ak d(boolean flag)
    {
        j = true;
        return this;
    }

    public final ak e(int i1)
    {
        v = i1;
        return this;
    }

    public final ak e(String s1)
    {
        l = s1;
        return this;
    }

    public final ak e(boolean flag)
    {
        q = flag;
        return this;
    }

    public final String e()
    {
        return "player";
    }

    public final ak f(int i1)
    {
        w = 2;
        return this;
    }

    public final ak f(String s1)
    {
        y = s1;
        return this;
    }

    public final ak f(boolean flag)
    {
        s = flag;
        return this;
    }

    public final com.google.protobuf.nano.c f()
    {
        nv nv1 = new nv();
        nv1.f = h;
        nv1.d = g;
        nv1.c = c;
        nv1.g = i;
        nv1.e = new mx();
        nv1.b = d();
        if (!TextUtils.isEmpty(d))
        {
            nv1.k = d;
        }
        if (!TextUtils.isEmpty(e))
        {
            nv1.h = e;
            if (f >= 0)
            {
                nv1.i = f;
            }
        }
        if (!j)
        {
            do do1 = new do();
            do1.b = k;
            if (!TextUtils.isEmpty(l))
            {
                do1.c = l;
            }
            if (m != -1L)
            {
                do1.e = m;
            }
            if (n != -1)
            {
                do1.d = n;
            }
            if (p != -1)
            {
                do1.f = p;
            }
            if (t != -1)
            {
                do1.h = t;
            }
            do1.k = q;
            do1.l = r;
            do1.j = s;
            do1.g = o;
            nv1.e.b = do1;
        } else
        {
            m m1 = new m();
            m1.b = v;
            m1.c = w;
            m1.d = x;
            m1.e = y;
            nv1.e.c = m1;
        }
        if (z != -1)
        {
            qa qa1 = new qa();
            qa1.b = z;
            nv1.e.e = qa1;
        }
        if (A != -1)
        {
            ct ct1 = new ct();
            ct1.j = A;
            nv1.b.h = ct1;
        }
        return nv1;
    }

    public final ak g(int i1)
    {
        x = i1;
        return this;
    }

    public final ak g(String s1)
    {
        r = s1;
        return this;
    }

    public final ak h(int i1)
    {
        p = i1;
        return this;
    }

    public final ak i(int i1)
    {
        z = i1;
        return this;
    }

    public final ak j(int i1)
    {
        A = i1;
        return this;
    }
}
