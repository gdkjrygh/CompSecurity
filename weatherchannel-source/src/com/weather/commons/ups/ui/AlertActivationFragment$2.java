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

class this._cls0
    implements android.view.ionFragment._cls2
{

    final AlertActivationFragment this$0;

    public void onClick(final View activity)
    {
        AlertActivationFragment.access$302(AlertActivationFragment.this, true);
        AlertActivationFragment.access$500(AlertActivationFragment.this, AlertActivationFragment.access$400(AlertActivationFragment.this).isChecked(), "severe_alert_signup", com.weather.util.prefs.S);
        AlertActivationFragment.access$500(AlertActivationFragment.this, AlertActivationFragment.access$000(AlertActivationFragment.this).isChecked(), "real_time_rain_alert_signup", com.weather.util.prefs.IN_ALERTS);
        AlertActivationFragment.access$500(AlertActivationFragment.this, AlertActivationFragment.access$600(AlertActivationFragment.this).isChecked(), "breakingnews_alert_signup", com.weather.util.prefs.S_ALERTS);
        activity = new ArrayList(1);
        if (AlertActivationFragment.access$700(AlertActivationFragment.this).getQuery().toString().isEmpty())
        {
            FixedLocations.getInstance().clearTagInAllLocations("home");
        } else
        if (AlertActivationFragment.access$800(AlertActivationFragment.this) != null)
        {
            activity.add(LocalyticsUpsAddressTypes.HOME);
            addLocation(AlertActivationFragment.access$800(AlertActivationFragment.this), AlertActivationFragment.access$900(AlertActivationFragment.this));
            AlertActivationFragment.access$1002(AlertActivationFragment.this, true);
        }
        LocalyticsHandler.getInstance().getUpsSignupSummaryRecorder().recordSignupComplete(activity);
        activity = getActivity();
        if (AlertActivationFragment.access$1000(AlertActivationFragment.this))
        {
            activity.startService(new Intent(activity, com/weather/commons/ups/backend/location/LocationEndSyncService));
            activity.registerReceiver(new BroadcastReceiver() {

                final AlertActivationFragment._cls2 this$1;
                final Activity val$activity;

                public void onReceive(Context context, Intent intent)
                {
                    activity.unregisterReceiver(this);
                    AlertActivationFragment.access$1100(this$0, activity);
                }

            
            {
                this$1 = AlertActivationFragment._cls2.this;
                activity = activity1;
                super();
            }
            }, new IntentFilter(activity.getString(com.weather.commons.ment._fld2)));
            return;
        } else
        {
            AlertActivationFragment.access$1100(AlertActivationFragment.this, activity);
            return;
        }
    }

    _cls1.val.activity()
    {
        this$0 = AlertActivationFragment.this;
        super();
    }
}
