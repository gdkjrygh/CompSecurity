// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.testmode;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.weather.util.log.alerts.AlertsLogger;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

// Referenced classes of package com.weather.Weather.settings.testmode:
//            AlertsLoggingListAdapter

public class AlertsLoggingFragment extends ListFragment
{

    private AlertsLoggingListAdapter adapter;

    public AlertsLoggingFragment()
    {
    }

    private void setupOnOffToggle(View view)
    {
        view = (ToggleButton)view.findViewById(0x7f0d013d);
        view.setChecked(TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.ALERTS_LOG_ENABLED, false));
        view.setOnCheckedChangeListener(new _cls2());
    }

    private void setupSendButton(View view)
    {
        ((TextView)view.findViewById(0x7f0d013c)).setOnClickListener(new _cls1());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030047, viewgroup, false);
        viewgroup = getActivity();
        if (viewgroup == null)
        {
            return layoutinflater;
        } else
        {
            adapter = new AlertsLoggingListAdapter(viewgroup, AlertsLogger.getInstance().getAlertsLog());
            setListAdapter(adapter);
            setupSendButton(layoutinflater);
            setupOnOffToggle(layoutinflater);
            return layoutinflater;
        }
    }


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
