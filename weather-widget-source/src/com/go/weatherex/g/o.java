// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;


// Referenced classes of package com.go.weatherex.g:
//            l, m

class o
    implements Runnable
{

    String a;
    final l b;

    private o(l l1)
    {
        b = l1;
        super();
    }

    o(l l1, m m)
    {
        this(l1);
    }

    public void a(String s)
    {
        a = s;
    }

    public void run()
    {
        l.b(b, a);
    }
}
