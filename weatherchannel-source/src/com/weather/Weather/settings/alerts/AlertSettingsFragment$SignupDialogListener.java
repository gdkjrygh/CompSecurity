// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSource;
import com.weather.commons.ups.backend.AnalyticsWpDialogListener;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            AlertSettingsFragment

private class this._cls0 extends AnalyticsWpDialogListener
{

    final AlertSettingsFragment this$0;

    public void onCancel()
    {
        updateSwitchAndLayout();
    }

    public void onClickNegative()
    {
        updateSwitchAndLayout();
    }

    (String s, LocalyticsUpsSignupSource localyticsupssignupsource, LocalyticsHandler localyticshandler)
    {
        this$0 = AlertSettingsFragment.this;
        super(s, localyticsupssignupsource, localyticshandler);
    }
}
