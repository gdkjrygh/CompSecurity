// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;


// Referenced classes of package com.go.weatherex.home.current:
//            CurrentWeatherContent

class t
    implements Runnable
{

    final CurrentWeatherContent a;

    t(CurrentWeatherContent currentweathercontent)
    {
        a = currentweathercontent;
        super();
    }

    public void run()
    {
        a.j();
    }
}
