// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.Context;
import android.view.LayoutInflater;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.go.weatherex.framework.fragment.a;

// Referenced classes of package com.go.weatherex.home.current:
//            CityWeatherInfoBase, d, b, c, 
//            r, p, j, h, 
//            o, aa

public class ab
{

    public static CityWeatherInfoBase a(Context context)
    {
        if (w.k(context).equals("en"))
        {
            return (CityWeatherInfoBase)LayoutInflater.from(context).inflate(0x7f030046, null, false);
        } else
        {
            return (CityWeatherInfoBase)LayoutInflater.from(context).inflate(0x7f030045, null, false);
        }
    }

    public static aa a(a a1, int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return new d(a1, i);

        case 2: // '\002'
            return new b(a1, i);

        case 3: // '\003'
            return new c(a1, i);

        case 4: // '\004'
            return new r(a1, i);

        case 5: // '\005'
            return new p(a1, i);

        case 6: // '\006'
            return new j(a1, i);

        case 7: // '\007'
            return new h(a1, i);

        case 8: // '\b'
            return new o(a1, i);
        }
    }
}
