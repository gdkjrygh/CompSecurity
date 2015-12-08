// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive;

import android.content.SharedPreferences;
import android.util.Log;
import com.weather.ads2.ui.AdHolder;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.session.LocalyticsSessionAttribute;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.Weather.map.interactive:
//            InteractiveMapActivity

class val.layerTypeKey
    implements com.wsi.android.weather.utils.settings.ngsChangeListener
{

    final InteractiveMapActivity this$0;
    final String val$layerTypeKey;

    public boolean onSettingsChanged(String s, SharedPreferences sharedpreferences)
    {
        if (s.startsWith("overlay_cat_") || s.equals(val$layerTypeKey))
        {
            String s2 = sharedpreferences.getString(s, "");
            if (!InteractiveMapActivity.access$000(InteractiveMapActivity.this))
            {
                HashMap hashmap = new HashMap();
                String s1;
                if (s2.equals("0052"))
                {
                    s1 = "driving";
                } else
                {
                    s1 = "nl";
                }
                hashmap.put("mlayer", s1);
                InteractiveMapActivity.access$100(InteractiveMapActivity.this).setExtraTargetingParameters(hashmap, false);
                InteractiveMapActivity.access$100(InteractiveMapActivity.this).refresh();
            }
            InteractiveMapActivity.access$002(InteractiveMapActivity.this, false);
            Log.d("SessionTracker", (new StringBuilder()).append("settings changed ").append(s).append(' ').append(sharedpreferences.getString(s, null)).toString());
            if (!"NONE".equals(s2))
            {
                LocalyticsHandler.getInstance().getSessionSummaryRecorder().incrementValue(LocalyticsSessionAttribute.MAP_LAYERS_VIEWED);
            }
        }
        return false;
    }

    yRecorder()
    {
        this$0 = final_interactivemapactivity;
        val$layerTypeKey = String.this;
        super();
    }
}
