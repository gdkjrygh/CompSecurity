// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;


// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            d

public class g extends d
{

    private int h;
    private int i;
    private int j;

    public g(int k)
    {
        super(k);
    }

    public int a()
    {
        return h;
    }

    public void a(int k)
    {
        h = k;
    }

    public int b()
    {
        return i;
    }

    public void b(int k)
    {
        i = k;
    }

    public void h(int k)
    {
        j = k;
    }

    public int i()
    {
        return j;
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("cycle\n").append(super.toString()).toString();
        s = (new StringBuilder()).append(s).append("initOffsetX : ").append(h).append(", initOffsetY : ").append(i).append(", direction : ").append(j).toString();
        return (new StringBuilder()).append(s).append("\n").toString();
    }
}
