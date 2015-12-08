// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;


// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            ab, d

public class t
{

    protected ab a;
    protected float b;
    protected float c;
    protected int d;
    protected int e;
    protected String f;
    protected int g;
    protected int h;
    protected int i;
    private int j;
    private float k;
    private float l;

    public t(int i1)
    {
        i = i1;
        a = new ab(6);
    }

    public void a(String s1)
    {
        f = s1;
    }

    public d g(int i1)
    {
        return a.a(i1);
    }

    public void h(float f1)
    {
        b = f1;
    }

    public void h(int i1)
    {
        g = i1;
    }

    public void i(float f1)
    {
        c = f1;
    }

    public void i(int i1)
    {
        h = i1;
    }

    public void j(float f1)
    {
        k = f1;
    }

    public void j(int i1)
    {
        d = i1;
    }

    public void k(float f1)
    {
        l = f1;
    }

    public void k(int i1)
    {
        e = i1;
    }

    public void l(int i1)
    {
        j = i1;
    }

    public int m()
    {
        return i;
    }

    public ab n()
    {
        return a;
    }

    public int o()
    {
        return g;
    }

    public int p()
    {
        return h;
    }

    public float q()
    {
        return b;
    }

    public float r()
    {
        return c;
    }

    public String s()
    {
        return f;
    }

    public int t()
    {
        return d;
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("ImageFrameBean x = ").append(b).append(", y = ").append(c).append(", src = ").append(f).append(", width = ").append(g).append(", height = ").append(h).toString();
        s1 = (new StringBuilder()).append(s1).append("\t").append(a.toString()).toString();
        return (new StringBuilder()).append(s1).append("ImageFrameBean\n").toString();
    }

    public int u()
    {
        return e;
    }

    public int v()
    {
        return j;
    }
}
