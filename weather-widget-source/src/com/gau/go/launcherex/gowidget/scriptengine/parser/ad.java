// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;


// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            d

public class ad extends d
{

    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private boolean p;
    private boolean q;
    private int r;

    public ad(int i1)
    {
        super(i1);
        p = true;
        q = true;
    }

    public void a(float f)
    {
        l = f;
    }

    public void a(int i1)
    {
        h = i1;
    }

    public void a(boolean flag)
    {
        p = flag;
    }

    public boolean a()
    {
        return p;
    }

    public void b(float f)
    {
        m = f;
    }

    public void b(int i1)
    {
        i = i1;
    }

    public void b(boolean flag)
    {
        q = flag;
    }

    public boolean b()
    {
        return q;
    }

    public void d(float f)
    {
        n = f;
    }

    public void e(float f)
    {
        o = f;
    }

    public void h(int i1)
    {
        j = i1;
    }

    public float i()
    {
        return l;
    }

    public void i(int i1)
    {
        k = i1;
    }

    public float j()
    {
        return m;
    }

    public void j(int i1)
    {
        r = i1;
    }

    public float k()
    {
        return n;
    }

    public float l()
    {
        return o;
    }

    public int m()
    {
        return h;
    }

    public int n()
    {
        return i;
    }

    public int o()
    {
        return j;
    }

    public int p()
    {
        return k;
    }

    public int q()
    {
        return r;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TranslateBehavior ").append(super.toString()).append(", fromXDelta = ").append(l).append(", toXDelta = ").append(m).append(", fromYDelta = ").append(n).append(", toYDelta = ").append(o).append(", outScreenX = ").append(p).append(", outScreenY = ").append(q).append("\n").toString();
    }
}
