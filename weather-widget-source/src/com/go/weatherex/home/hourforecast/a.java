// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.hourforecast;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.go.weatherex.home.hourforecast:
//            ForecastHourForm

class a
{

    public TextView a;
    public TextView b;
    public ImageView c;
    public TextView d;
    public TextView e;
    final ForecastHourForm f;

    public a(ForecastHourForm forecasthourform, View view)
    {
        f = forecasthourform;
        super();
        a = (TextView)view.findViewById(0x7f0900b5);
        b = (TextView)view.findViewById(0x7f0902a4);
        c = (ImageView)view.findViewById(0x7f090082);
        d = (TextView)view.findViewById(0x7f09028d);
        e = (TextView)view.findViewById(0x7f0900b9);
    }
}
