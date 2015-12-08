// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.rain;


// Referenced classes of package com.go.weatherex.home.rain:
//            CuvetteGraphs, a

class b
{

    final CuvetteGraphs a;
    private int b;
    private String c;
    private String d;

    private b(CuvetteGraphs cuvettegraphs)
    {
        a = cuvettegraphs;
        super();
        c = "";
        d = "";
    }

    b(CuvetteGraphs cuvettegraphs, a a1)
    {
        this(cuvettegraphs);
    }

    public int a()
    {
        return b;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(String s)
    {
        c = s;
    }

    public String b()
    {
        return c;
    }

    public void b(String s)
    {
        d = s;
    }

    public String c()
    {
        return d;
    }
}
