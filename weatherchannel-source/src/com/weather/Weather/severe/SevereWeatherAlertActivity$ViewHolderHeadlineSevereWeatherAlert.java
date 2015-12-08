// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.severe;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.weather.Weather.severe:
//            SevereWeatherAlertActivity

private static final class severeWeatherAlertHeadlineTextView
{

    private final TextView severeWeatherAlertHeadlineTextView;

    public void setData(CharSequence charsequence)
    {
        severeWeatherAlertHeadlineTextView.setText(charsequence);
    }

    (View view)
    {
        severeWeatherAlertHeadlineTextView = (TextView)view.findViewById(0x7f0d0257);
    }
}
