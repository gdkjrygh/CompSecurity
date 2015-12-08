// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app.bounce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.weather.Weather.settings.SettingsActivity;
import com.weather.Weather.ups.ui.SignUpActivity;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class DaltonLaunchBounceActivity extends Activity
{

    private static final String TAG = "DaltonLaunchBounceActivity";

    public DaltonLaunchBounceActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle != null)
        {
            Intent intent = new Intent(bundle);
            if (AccountManager.getInstance().getLoginStatus() == com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT)
            {
                intent.setClass(this, com/weather/Weather/settings/SettingsActivity);
                intent.putExtra("com.weather.Weather.SettingsActivity.setting", "My Alerts");
            } else
            {
                intent.setClass(this, com/weather/Weather/ups/ui/SignUpActivity);
            }
            bundle.addFlags(0x4000000);
            LogUtil.d("DaltonLaunchBounceActivity", LoggingMetaTags.TWC_DEEPLINK, (new StringBuilder()).append("onCreate: bounceIntent=").append(intent).append(", extras=").append(intent.getExtras()).toString(), new Object[0]);
            startActivity(intent);
        }
        finish();
    }
}
