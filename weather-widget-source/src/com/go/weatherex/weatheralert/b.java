// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.weatheralert;

import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.go.weatherex.weatheralert:
//            WeatherAlertActivity

class b
    implements android.view.View.OnClickListener
{

    final WeatherAlertActivity a;

    b(WeatherAlertActivity weatheralertactivity)
    {
        a = weatheralertactivity;
        super();
    }

    public void onClick(View view)
    {
        WeatherAlertActivity.b(a).toggle();
    }
}
