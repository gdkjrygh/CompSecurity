// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.weatheralert;

import android.widget.CompoundButton;

// Referenced classes of package com.go.weatherex.weatheralert:
//            WeatherAlertActivity

class c
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final WeatherAlertActivity a;

    c(WeatherAlertActivity weatheralertactivity)
    {
        a = weatheralertactivity;
        super();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = a;
        String s = WeatherAlertActivity.c(a);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WeatherAlertActivity.a(compoundbutton, s, flag);
    }
}
