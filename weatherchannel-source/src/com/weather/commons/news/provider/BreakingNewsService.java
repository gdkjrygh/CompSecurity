// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.TrafficStats;
import android.util.Log;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.dal2.system.TwcBus;
import com.weather.util.config.ConfigException;
import com.weather.util.device.LocaleUtil;
import com.weather.util.net.HttpRequest;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.news.provider:
//            ContentModePojo, CachingBreakingNewsDataFetcher

public class BreakingNewsService extends IntentService
{
    public static class BreakingNewsFeedRefresh
    {

        public BreakingNewsFeedRefresh()
        {
        }
    }


    private static final String CONTENT_MODE_SEVERE = "severe2";
    public static final String FORCE_REFRESH = "force_refresh";
    protected static final long MIN_FORCED_REFRESH_INTERVAL_MS = 30000L;
    private static final long MIN_REFRESH_INTERVAL_MS = 0xdbba0L;
    private static final String TAG = "BreakingNewsService";
    private static final int TIMEOUT = 15000;

    public BreakingNewsService()
    {
        super("BreakingNewsService");
    }

    public static boolean allowDownload(boolean flag)
    {
        long l = System.currentTimeMillis() - TwcPrefs.getInstance().getLong(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_REFRESH_TIME, 0L);
        return flag && l > 30000L || l > 0xdbba0L;
    }

    private void disconnect(HttpRequest httprequest)
    {
        if (httprequest == null)
        {
            break MISSING_BLOCK_LABEL_9;
        }
        httprequest.disconnect();
        return;
        httprequest;
    }

    public static Intent getBreakingNewsIntent(Context context, boolean flag)
    {
        return getIntent(context, flag);
    }

    public static Intent getIntent(Context context, boolean flag)
    {
        context = new Intent(context, com/weather/commons/news/provider/BreakingNewsService);
        context.putExtra("force_refresh", flag);
        return context;
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        boolean flag;
        flag = intent.getBooleanExtra("force_refresh", false);
        obj1 = null;
        if (!allowDownload(flag)) goto _L1; else goto _L3
_L3:
        HttpRequest httprequest1;
        HttpRequest httprequest2;
        HttpRequest httprequest3;
        intent = null;
        httprequest2 = null;
        httprequest3 = null;
        httprequest1 = null;
        TrafficStats.setThreadStatsTag(61441);
        HttpRequest httprequest = HttpRequest.get(ConfigurationManagers.getInstance().getFlagshipConfig().contentModeUrl).useCaches(false).header("Cache-Control", "no-cache").acceptJson().acceptGzipEncoding().readTimeout(15000).connectTimeout(15000).uncompress(true);
        httprequest1 = httprequest;
        intent = httprequest;
        httprequest2 = httprequest;
        httprequest3 = httprequest;
        ContentModePojo contentmodepojo = (ContentModePojo)JsonObjectMapper.fromJson(httprequest.body(), com/weather/commons/news/provider/ContentModePojo);
        disconnect(httprequest);
        TrafficStats.clearThreadStatsTag();
        intent = contentmodepojo;
_L4:
        Object obj;
        if (LocaleUtil.isDeviceInUSEnglish() && intent != null && "severe2".equals(((ContentModePojo) (intent)).mode))
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ACTIVE, true);
            CachingBreakingNewsDataFetcher.getInstance().request(flag);
            TwcPrefs.getInstance().putLong(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_REFRESH_TIME, System.currentTimeMillis());
            DataAccessLayer.BUS.post(new BreakingNewsFeedRefresh());
            return;
        } else
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ACTIVE, false);
            return;
        }
        obj;
        intent = httprequest1;
        throw new IllegalArgumentException("Flagship config not available", ((Throwable) (obj)));
        obj;
        disconnect(intent);
        TrafficStats.clearThreadStatsTag();
        throw obj;
        obj;
_L5:
        intent = httprequest2;
        Log.e("BreakingNewsService", ((Exception) (obj)).toString(), ((Throwable) (obj)));
        disconnect(httprequest2);
        TrafficStats.clearThreadStatsTag();
        intent = obj1;
          goto _L4
        obj;
        httprequest2 = httprequest3;
          goto _L5
    }
}
