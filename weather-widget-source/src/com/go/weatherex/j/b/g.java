// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;


// Referenced classes of package com.go.weatherex.j.b:
//            e

class g
    implements Runnable
{

    final int a;
    final String b;
    final e c;

    g(e e1, int i, String s)
    {
        c = e1;
        a = i;
        b = s;
        super();
    }

    public void run()
    {
        e.a(c, a, b);
    }
}
