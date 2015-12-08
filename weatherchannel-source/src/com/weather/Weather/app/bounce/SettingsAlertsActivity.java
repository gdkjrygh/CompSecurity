// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app.bounce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.weather.Weather.settings.SettingsActivity;
import com.weather.commons.push.AlertResponseField;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public abstract class SettingsAlertsActivity extends Activity
{

    private final String TAG = getClass().getSimpleName();

    public SettingsAlertsActivity()
    {
    }

    abstract String getAlertId();

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle != null)
        {
            Intent intent = new Intent(bundle);
            intent.setClass(this, com/weather/Weather/settings/SettingsActivity);
            intent.putExtra(AlertResponseField.PRODUCT.getName(), getAlertId());
            bundle.addFlags(0x4000000);
            LogUtil.d(TAG, LoggingMetaTags.TWC_IN_APP_MSG_DEEPLINK, "onCreate: alertIntent= %s, extras= %s", new Object[] {
                intent, intent.getExtras()
            });
            startActivity(intent);
        }
        finish();
    }
}
