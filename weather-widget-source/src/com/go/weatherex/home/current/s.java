// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.view.View;
import com.gau.go.launcherex.gowidget.weather.util.r;

// Referenced classes of package com.go.weatherex.home.current:
//            CurrentWeatherContent, w

class s
    implements android.view.View.OnClickListener
{

    final CurrentWeatherContent a;

    s(CurrentWeatherContent currentweathercontent)
    {
        a = currentweathercontent;
        super();
    }

    public void onClick(View view)
    {
        if (r.a(view))
        {
            CurrentWeatherContent.b(a).g(CurrentWeatherContent.a(a));
        }
    }
}
