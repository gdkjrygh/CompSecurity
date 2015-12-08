// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.d;

import com.gau.a.a.c.b;
import com.gau.a.a.e;
import com.gau.a.a.f;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class a
{

    public int a;
    List b;
    e c;
    int d;
    int e;
    b f;
    com.gau.a.a.a.a g;
    private List h;
    private URI i;
    private URI j;
    private byte k[];
    private HashMap l;
    private int m;
    private int n;
    private boolean o;
    private f p;
    private final int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private long v;
    private int w;

    public a(String s1, e e1)
    {
        this(s1, null, e1);
    }

    public a(String s1, byte abyte0[], e e1)
    {
        m = 2;
        n = -1;
        a = 0;
        o = false;
        d = 15000;
        e = 30000;
        q = 8;
        r = 5;
        s = true;
        t = false;
        u = false;
        v = -1L;
        w = -1;
        if (s1 == null)
        {
            throw new IllegalArgumentException("url==null");
        }
        if (e1 == null)
        {
            throw new IllegalArgumentException("receiver==null");
        } else
        {
            a(s1);
            k = abyte0;
            c = e1;
            return;
        }
    }

    public URI a()
    {
        return j;
    }

    public void a(int i1)
    {
        n = i1;
    }

    public void a(long l1)
    {
        v = l1;
    }

    public void a(b b1)
    {
        f = b1;
    }

    public void a(f f1)
    {
        p = f1;
    }

    public void a(String s1)
    {
        if (s1 == null)
        {
            return;
        }
        s1 = new URI(s1);
        if (h == null)
        {
            h = new ArrayList();
        }
        if (h.isEmpty())
        {
            h.add(s1);
            return;
        } else
        {
            h.set(0, s1);
            return;
        }
    }

    public void a(URI uri)
    {
        i = uri;
    }

    public void a(HashMap hashmap)
    {
        l = hashmap;
    }

    public void a(boolean flag)
    {
        s = flag;
    }

    public List b()
    {
        return h;
    }

    public void b(int i1)
    {
        d = i1;
    }

    public void b(boolean flag)
    {
        t = flag;
    }

    public URI c()
    {
        return i;
    }

    public void c(int i1)
    {
        if (i1 >= 1 && i1 <= 10)
        {
            r = i1;
            return;
        } else
        {
            r = 5;
            return;
        }
    }

    public Object clone()
    {
        return p();
    }

    public com.gau.a.a.a.a d()
    {
        return g;
    }

    public void d(int i1)
    {
        w = i1;
    }

    public b e()
    {
        if (f == null)
        {
            f = new com.gau.a.a.c.a();
        }
        return f;
    }

    public int f()
    {
        if (n == -1)
        {
            n = m;
        }
        return n;
    }

    public int g()
    {
        return d;
    }

    public int h()
    {
        return e;
    }

    public e i()
    {
        return c;
    }

    public URI j()
    {
        if (h != null && h.size() > 0)
        {
            return (URI)h.get(0);
        } else
        {
            return null;
        }
    }

    public byte[] k()
    {
        return k;
    }

    public boolean l()
    {
        return s;
    }

    public boolean m()
    {
        return u;
    }

    public boolean n()
    {
        return t;
    }

    public List o()
    {
        return b;
    }

    public a p()
    {
        return null;
    }

    public int q()
    {
        return r;
    }

    public f r()
    {
        return p;
    }

    public long s()
    {
        return v;
    }

    public HashMap t()
    {
        return l;
    }

    public int u()
    {
        return w;
    }
}
