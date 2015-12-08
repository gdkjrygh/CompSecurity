// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.city;


// Referenced classes of package com.go.weatherex.city:
//            g, EditCityScrollComponent

class h
    implements Runnable
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public void run()
    {
        EditCityScrollComponent.a(a.c, a.a, a.b);
    }
}
