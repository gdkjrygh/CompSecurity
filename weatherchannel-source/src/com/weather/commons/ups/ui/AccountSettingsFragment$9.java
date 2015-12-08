// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsAttribute;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsAttributeValue;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsSummaryRecorder;
import com.weather.commons.ups.backend.location.LocationEndSyncService;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

class this._cls0
    implements android.content.tener
{

    final AccountSettingsFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        AccountSettingsFragment.access$302(AccountSettingsFragment.this, false);
        Analytics.trackAction(getResources().getString(com.weather.commons.t_logout), null);
        LocalyticsHandler.getInstance().getGeneralSettingsSummaryRecorder().putValue(LocalyticsGeneralSettingsAttribute.LOGOUT_LOGIN_CLICKED, LocalyticsGeneralSettingsAttributeValue.LOGOUT.getAttributeValue());
        try
        {
            AccountSettingsFragment.access$2102(AccountSettingsFragment.this, new ProgressDialog(AccountSettingsFragment.access$600(AccountSettingsFragment.this)));
            AccountSettingsFragment.access$2100(AccountSettingsFragment.this).setMessage(getString(com.weather.commons.ment.getString));
            AccountSettingsFragment.access$2100(AccountSettingsFragment.this).setCancelable(false);
            AccountSettingsFragment.access$2100(AccountSettingsFragment.this).show();
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            LogUtil.e("AccountSettingsFragment", LoggingMetaTags.TWC_UPS, dialoginterface.getMessage(), new Object[] {
                dialoginterface
            });
        }
        AccountSettingsFragment.access$600(AccountSettingsFragment.this).startService(new Intent(AccountSettingsFragment.access$600(AccountSettingsFragment.this), com/weather/commons/ups/backend/location/LocationEndSyncService));
        dialoginterface = new IntentFilter(getString(com.weather.commons.ment.getString));
        AccountSettingsFragment.access$600(AccountSettingsFragment.this).registerReceiver(AccountSettingsFragment.access$1800(AccountSettingsFragment.this), dialoginterface);
    }

    yncService()
    {
        this$0 = AccountSettingsFragment.this;
        super();
    }
}
