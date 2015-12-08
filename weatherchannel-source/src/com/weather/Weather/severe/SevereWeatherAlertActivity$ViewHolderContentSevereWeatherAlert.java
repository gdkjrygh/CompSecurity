// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.severe;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.weather.Weather.severe:
//            SevereWeatherAlertActivity

private static final class severeWeatherAlertContentTextView
{

    private final TextView severeWeatherAlertContentTextView;

    public void setData(CharSequence charsequence)
    {
        severeWeatherAlertContentTextView.setText(charsequence);
    }

    (View view)
    {
        severeWeatherAlertContentTextView = (TextView)view.findViewById(0x7f0d0256);
    }
}
