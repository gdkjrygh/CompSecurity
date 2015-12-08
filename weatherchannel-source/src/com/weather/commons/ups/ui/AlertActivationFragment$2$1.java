// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.widget.SearchView;
import android.widget.Switch;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsAddressTypes;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSummaryRecorder;
import com.weather.commons.ups.backend.location.LocationEndSyncService;
import com.weather.dal2.locations.FixedLocations;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.weather.commons.ups.ui:
//            AlertActivationFragment

class val.activity extends BroadcastReceiver
{

    final val.activity this$1;
    final Activity val$activity;

    public void onReceive(Context context, Intent intent)
    {
        val$activity.unregisterReceiver(this);
        AlertActivationFragment.access$1100(_fld0, val$activity);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$activity = Activity.this;
        super();
    }

    // Unreferenced inner class com/weather/commons/ups/ui/AlertActivationFragment$2

/* anonymous class */
    class AlertActivationFragment._cls2
        implements android.view.View.OnClickListener
    {

        final AlertActivationFragment this$0;

        public void onClick(View view)
        {
            AlertActivationFragment.access$302(AlertActivationFragment.this, true);
            AlertActivationFragment.access$500(AlertActivationFragment.this, AlertActivationFragment.access$400(AlertActivationFragment.this).isChecked(), "severe_alert_signup", com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS);
            AlertActivationFragment.access$500(AlertActivationFragment.this, AlertActivationFragment.access$000(AlertActivationFragment.this).isChecked(), "real_time_rain_alert_signup", com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS);
            AlertActivationFragment.access$500(AlertActivationFragment.this, AlertActivationFragment.access$600(AlertActivationFragment.this).isChecked(), "breakingnews_alert_signup", com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERTS);
            view = new ArrayList(1);
            if (AlertActivationFragment.access$700(AlertActivationFragment.this).getQuery().toString().isEmpty())
            {
                FixedLocations.getInstance().clearTagInAllLocations("home");
            } else
            if (AlertActivationFragment.access$800(AlertActivationFragment.this) != null)
            {
                view.add(LocalyticsUpsAddressTypes.HOME);
                addLocation(AlertActivationFragment.access$800(AlertActivationFragment.this), AlertActivationFragment.access$900(AlertActivationFragment.this));
                AlertActivationFragment.access$1002(AlertActivationFragment.this, true);
            }
            LocalyticsHandler.getInstance().getUpsSignupSummaryRecorder().recordSignupComplete(view);
            view = getActivity();
            if (AlertActivationFragment.access$1000(AlertActivationFragment.this))
            {
                view.startService(new Intent(view, com/weather/commons/ups/backend/location/LocationEndSyncService));
                view.registerReceiver(view. new AlertActivationFragment._cls2._cls1(), new IntentFilter(view.getString(com.weather.commons.R.string.sync_task_result)));
                return;
            } else
            {
                AlertActivationFragment.access$1100(AlertActivationFragment.this, view);
                return;
            }
        }

            
            {
                this$0 = AlertActivationFragment.this;
                super();
            }
    }

}
