// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.view.View;
import android.widget.Toast;
import com.weather.commons.config.ConfigPrefs;
import com.weather.commons.locations.SQSLocationUpdateUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

// Referenced classes of package com.weather.Weather.settings:
//            AboutFragment

class this._cls0
    implements android.view.Listener
{

    final AboutFragment this$0;

    public boolean onLongClick(View view)
    {
        if (AboutFragment.access$200(AboutFragment.this) != null)
        {
            AboutFragment.access$200(AboutFragment.this).setVisibility(8);
        }
        view = getActivity();
        if (view != null)
        {
            Toast.makeText(view, "Production Mode Activated, now restart the app", 1).show();
        }
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.ST_MODE, false);
        TwcPrefs.getInstance().remove(com.weather.util.prefs.X_SERVER);
        TwcPrefs.getInstance().remove(com.weather.util.prefs.X_SERVER_SECURE);
        TwcPrefs.getInstance().remove(com.weather.util.prefs._TEST_ENABLED);
        TwcPrefs.getInstance().remove(com.weather.util.prefs._CONFIG_ENABLED);
        SQSLocationUpdateUtil.cancelAlarm();
        TwcPrefs.getInstance().remove(com.weather.util.prefs.CATION_UPDATE_LOG);
        ConfigPrefs.clearAll();
        return true;
    }

    teUtil()
    {
        this$0 = AboutFragment.this;
        super();
    }
}
