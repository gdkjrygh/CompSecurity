// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.util.Log;
import com.squareup.picasso.Picasso;
import com.weather.commons.locations.SQSLocationUpdateUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.TwcPrefs;

// Referenced classes of package com.weather.Weather.app:
//            FlagshipApplication

class this._cls0
    implements Runnable
{

    final FlagshipApplication this$0;

    public void run()
    {
        try
        {
            com.weather.util.prefs.Prefs prefs = TwcPrefs.getInstance();
            Picasso picasso = Picasso.with(FlagshipApplication.this);
            if (LogUtil.isLoggable(LoggingMetaTags.TWC_GENERAL, 3))
            {
                LogUtil.d("FlagshipApplication", LoggingMetaTags.TWC_GENERAL, "warmup.run prefs: %s", new Object[] {
                    prefs
                });
                LogUtil.d("FlagshipApplication", LoggingMetaTags.TWC_GENERAL, "warmup.run picasso: %s", new Object[] {
                    picasso
                });
            }
        }
        catch (Exception exception)
        {
            Log.w("FlagshipApplication", (new StringBuilder()).append("warmup.run ex:").append(exception).toString());
        }
        SQSLocationUpdateUtil.initialize();
    }

    eUtil()
    {
        this$0 = FlagshipApplication.this;
        super();
    }
}
