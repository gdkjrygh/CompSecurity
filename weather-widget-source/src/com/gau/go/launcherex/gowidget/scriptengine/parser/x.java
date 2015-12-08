// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;


// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            d

public class x extends d
{

    private int h;
    private int i;
    private float j;
    private float k;
    private int l;
    private int m;
    private float n;
    private float o;
    private int p;

    public x(int i1)
    {
        super(i1);
    }

    public float a()
    {
        return j;
    }

    public void a(float f)
    {
        j = f;
    }

    public void a(int i1)
    {
        h = i1;
    }

    public float b()
    {
        return k;
    }

    public void b(float f)
    {
        k = f;
    }

    public void b(int i1)
    {
        i = i1;
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
        l = i1;
    }

    public float i()
    {
        return n;
    }

    public void i(int i1)
    {
        m = i1;
    }

    public float j()
    {
        return o;
    }

    public void j(int i1)
    {
        p = i1;
    }

    public int k()
    {
        return l;
    }

    public int l()
    {
        return m;
    }

    public String toString()
    {
        return (new StringBuilder()).append("RotateBehaviorBean ").append(super.toString()).append(", fromDegrees = ").append(j).append(", toDegrees = ").append(k).append(", pivotX = ").append(n).append(", pivotY = ").append(o).append("\n").toString();
    }
}
