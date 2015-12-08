// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;


// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            t

public class r extends t
{

    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private int o;
    private int p;
    private int q;
    private float r;
    private float s;
    private int t;
    private int u;
    private int v;

    public r(int i1)
    {
        super(i1);
    }

    public int a()
    {
        return v;
    }

    public void a(float f1)
    {
        j = f1;
    }

    public void a(int i1)
    {
        v = i1;
    }

    public float b()
    {
        return j;
    }

    public void b(float f1)
    {
        k = f1;
    }

    public void b(int i1)
    {
        q = i1;
    }

    public float c()
    {
        return k;
    }

    public void c(float f1)
    {
        m = f1;
    }

    public void c(int i1)
    {
        o = i1;
    }

    public int d()
    {
        return q;
    }

    public void d(float f1)
    {
        l = f1;
    }

    public void d(int i1)
    {
        p = i1;
    }

    public float e()
    {
        return l;
    }

    public void e(float f1)
    {
        n = f1;
    }

    public void e(int i1)
    {
        t = i1;
    }

    public float f()
    {
        return n;
    }

    public void f(float f1)
    {
        r = f1;
    }

    public void f(int i1)
    {
        u = i1;
    }

    public float g()
    {
        return r;
    }

    public void g(float f1)
    {
        s = f1;
    }

    public float h()
    {
        return s;
    }

    public int i()
    {
        return o;
    }

    public int j()
    {
        return p;
    }

    public int k()
    {
        return t;
    }

    public int l()
    {
        return u;
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("ImageBean\n").append(super.toString()).toString();
        s1 = (new StringBuilder()).append(s1).append(" antialias = ").append(v).append(", initAlpha = ").append(j).append(", initScaleX = ").append(k).append(", initScalePivotX = ").append(l).append(", initScalePivotXType = ").append(o).append(", initScaleY = ").append(m).append(", initScalePivotY = ").append(n).append(", initScalePivotYType = ").append(p).append(", initRotate = ").append(q).append(", initRotatePivotX = ").append(r).append(", initRotatePivotY = ").append(s).append(", initRotatePivotXType = ").append(t).append(", initRotatePivotYType = ").append(u).toString();
        return (new StringBuilder()).append(s1).append("ImageBean\n").toString();
    }
}
