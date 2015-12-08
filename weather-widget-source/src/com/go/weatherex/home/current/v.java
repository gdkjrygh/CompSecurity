// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import com.a.a.an;
import com.a.a.au;

// Referenced classes of package com.go.weatherex.home.current:
//            CurrentWeatherContent

class v
    implements au
{

    final CurrentWeatherContent a;

    v(CurrentWeatherContent currentweathercontent)
    {
        a = currentweathercontent;
        super();
    }

    public void a(an an1)
    {
        a.scrollTo(0, ((Integer)an1.l()).intValue());
    }
}
