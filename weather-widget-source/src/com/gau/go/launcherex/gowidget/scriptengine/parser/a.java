// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;


// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            d

public class a extends d
{

    private int h;
    private int i;
    private float j;
    private float k;

    public a(int l)
    {
        super(l);
    }

    public float a()
    {
        return j;
    }

    public void a(float f)
    {
        j = f;
    }

    public void a(int l)
    {
        h = l;
    }

    public float b()
    {
        return k;
    }

    public void b(float f)
    {
        k = f;
    }

    public void b(int l)
    {
        i = l;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AlphaBehavior ").append(super.toString()).append(", fromAlpha = ").append(j).append(", toAlpha = ").append(k).append("\n").toString();
    }
}
