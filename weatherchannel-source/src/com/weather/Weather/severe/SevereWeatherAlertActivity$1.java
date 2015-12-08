// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.severe;

import android.content.Intent;
import android.view.View;
import com.weather.Weather.hurricane.HurricaneCentralActivity;

// Referenced classes of package com.weather.Weather.severe:
//            SevereWeatherAlertActivity

class this._cls0
    implements android.view.ertActivity._cls1
{

    final SevereWeatherAlertActivity this$0;

    public void onClick(View view)
    {
        view = new Intent(SevereWeatherAlertActivity.this, com/weather/Weather/hurricane/HurricaneCentralActivity);
        view.putExtra("com.weather.Weather.hurricane.STORM_ID_ARG_KEY", SevereWeatherAlertActivity.access$000(SevereWeatherAlertActivity.this));
        startActivity(view);
    }

    ()
    {
        this$0 = SevereWeatherAlertActivity.this;
        super();
    }
}
