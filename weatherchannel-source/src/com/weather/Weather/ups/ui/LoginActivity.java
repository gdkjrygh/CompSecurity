// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ups.ui;

import android.content.Intent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSource;
import com.weather.commons.analytics.ups.LocalyticsUpsSupport;
import com.weather.commons.ups.ui.AbstractLoginActivity;

// Referenced classes of package com.weather.Weather.ups.ui:
//            SignUpActivity

public class LoginActivity extends AbstractLoginActivity
{

    public LoginActivity()
    {
    }

    void setLocalyticsHandler(LocalyticsHandler localyticshandler)
    {
        localyticsHandler = localyticshandler;
    }

    protected void startSignupActivity()
    {
        LocalyticsUpsSupport.recordSignupStarted(localyticsHandler, LocalyticsUpsSignupSource.SETTINGS);
        startActivity(new Intent(this, com/weather/Weather/ups/ui/SignUpActivity));
    }
}
