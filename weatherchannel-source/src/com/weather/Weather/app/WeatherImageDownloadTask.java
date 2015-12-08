// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.TwcDataServer;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.config.ConfigException;
import com.weather.util.json.JsonUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;
import com.weather.util.ui.Dimension;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController, BackgroundManager

public class WeatherImageDownloadTask extends AsyncTask
{

    private static final String DEFAULT_IMAGES_URL_FORMAT = (new StringBuilder()).append("http://dsx.weather.com/util/images/m/%1$s,%2$s?api=").append(TwcDataServer.getApiKey()).toString();
    private static final String DEFAULT_IMAGE_CUT_URL_FORMAT = "http://dsx.weather.com/util/image/m/%1$s?v=%2$s&w=%3$s&h=%4$s";
    private static final String TAG = "WeatherImageDownloadTask";
    private static final Random random = new Random();
    private final WeakReference backgroundManagerRef;
    private final LocationManager locationManager;

    public WeatherImageDownloadTask(BackgroundManager backgroundmanager, LocationManager locationmanager)
    {
        locationManager = locationmanager;
        backgroundManagerRef = new WeakReference(backgroundmanager);
    }

    public static String getImageUrl(double d, double d1, Dimension dimension)
    {
        Object obj;
        String s;
        obj = DEFAULT_IMAGES_URL_FORMAT;
        s = "http://dsx.weather.com/util/image/m/%1$s?v=%2$s&w=%3$s&h=%4$s";
        Object obj1 = ConfigurationManagers.getInstance().getFlagshipConfig().weatherImages;
        obj = obj1;
        String s1 = ConfigurationManagers.getInstance().getFlagshipConfig().weatherImageCut;
        obj = obj1;
        s = s1;
_L2:
        obj1 = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.US));
        s1 = String.format(Locale.US, ((String) (obj)), new Object[] {
            ((DecimalFormat) (obj1)).format(d), ((DecimalFormat) (obj1)).format(d1)
        });
        TrafficStats.setThreadStatsTag(61443);
        obj1 = "";
        obj = obj1;
        s1 = HttpRequest.get(s1).useCaches(true).header("Cache-Control", "max-age=300").body();
        obj = s1;
        obj1 = s1;
        Object obj2 = new JSONArray(s1);
        obj = s1;
        obj1 = s1;
        if (((JSONArray) (obj2)).length() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s1;
        obj1 = s1;
        obj2 = Uri.parse(((JSONArray) (obj2)).getString(random.nextInt(((JSONArray) (obj2)).length()))).getLastPathSegment();
        obj = s1;
        obj1 = s1;
        dimension = String.format(Locale.US, s, new Object[] {
            obj2, "ap", Integer.valueOf(dimension.getWidth()), Integer.valueOf(dimension.getHeight())
        });
        TrafficStats.clearThreadStatsTag();
        return dimension;
        obj1;
        Log.e("WeatherImageDownloadTask", ((ConfigException) (obj1)).toString(), ((Throwable) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
        TrafficStats.clearThreadStatsTag();
_L3:
        return null;
        dimension;
_L4:
        LogUtil.d("WeatherImageDownloadTask", LoggingMetaTags.TWC_UI, "getImage failed. url=%s", new Object[0]);
        Log.e("WeatherImageDownloadTask", dimension.toString(), dimension);
        JsonUtil.logPretty("WeatherImageDownloadTask", LoggingMetaTags.TWC_GENERAL, ((String) (obj)));
        TrafficStats.clearThreadStatsTag();
          goto _L3
        dimension;
        TrafficStats.clearThreadStatsTag();
        throw dimension;
        dimension;
        obj = obj1;
          goto _L4
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient String doInBackground(Void avoid[])
    {
        boolean flag;
        if (backgroundManagerRef.get() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            avoid = locationManager.getCurrentLocation();
            if (avoid != null)
            {
                Dimension dimension = WeatherController.getScreenDimension();
                if (dimension != null)
                {
                    return getImageUrl(avoid.getLat(), avoid.getLng(), dimension);
                }
            }
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        BackgroundManager backgroundmanager = (BackgroundManager)backgroundManagerRef.get();
        if (s != null && backgroundmanager != null)
        {
            backgroundmanager.loadBackground(s);
        }
    }

}
