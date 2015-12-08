// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.branded.background;

import android.net.TrafficStats;
import com.google.common.base.Preconditions;
import com.weather.ads2.config.AdConfig;
import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.targeting.AdCallData;
import com.weather.ads2.targeting.TargetingManager;
import com.weather.ads2.targeting.UserIdQuerier;
import com.weather.dal2.cache.AbstractFetcher;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;

// Referenced classes of package com.weather.ads2.branded.background:
//            BrandedBackground

public class BackgroundFetcher extends AbstractFetcher
{

    private static final String IMPRESSION_HEADER = "X-Afma-Manual-Tracking-Urls";
    private static final String TAG = "BackgroundFetcher";
    private final UserIdQuerier userIdQuerier;

    public BackgroundFetcher(UserIdQuerier useridquerier)
    {
        userIdQuerier = (UserIdQuerier)Preconditions.checkNotNull(useridquerier);
    }

    private BrandedBackground getData(String s)
        throws com.weather.util.net.HttpRequest.HttpRequestException
    {
        String s1;
        s1 = null;
        TrafficStats.setThreadStatsTag(40960);
        s = HttpRequest.get(s);
        s1 = s;
        Object obj = s.body();
        s1 = s;
        if (s.success())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        s1 = s;
        LogUtil.d("BackgroundFetcher", LoggingMetaTags.TWC_AD, "Failed to make request: statusCode=%s, error=", new Object[] {
            Integer.valueOf(s.code()), obj
        });
        s1 = s;
        obj = BrandedBackground.EMPTY;
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                TrafficStats.clearThreadStatsTag();
                return ((BrandedBackground) (obj));
            }
            finally
            {
                TrafficStats.clearThreadStatsTag();
            }
        }
        TrafficStats.clearThreadStatsTag();
        return ((BrandedBackground) (obj));
        throw s;
        s1 = s;
        String s2 = s.header("X-Afma-Manual-Tracking-Urls");
        s1 = s;
        if (!LogUtil.isLoggable(LoggingMetaTags.TWC_AD, 3))
        {
            break MISSING_BLOCK_LABEL_148;
        }
        s1 = s;
        LogUtil.d("BackgroundFetcher", LoggingMetaTags.TWC_AD, ((String) (obj)), new Object[0]);
        s1 = s;
        LogUtil.d("BackgroundFetcher", LoggingMetaTags.TWC_AD, "googleDelayImpression=%s", new Object[] {
            s2
        });
        s1 = s;
        obj = new BrandedBackground(((String) (obj)), s2, getSha1Id(), getDid());
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                TrafficStats.clearThreadStatsTag();
                return ((BrandedBackground) (obj));
            }
            finally
            {
                TrafficStats.clearThreadStatsTag();
            }
        }
        TrafficStats.clearThreadStatsTag();
        return ((BrandedBackground) (obj));
        throw s;
        s;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        s1.disconnect();
        TrafficStats.clearThreadStatsTag();
_L2:
        throw s;
        com.weather.util.net.HttpRequest.HttpRequestException httprequestexception;
        httprequestexception;
        TrafficStats.clearThreadStatsTag();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    private String getDid()
    {
        String s1 = userIdQuerier.getDid();
        String s = s1;
        if (s1 == null)
        {
            s = "nl";
        }
        return s;
    }

    private String getSha1Id()
    {
        String s1 = userIdQuerier.getShortSha1Id();
        String s = s1;
        if (s1 == null)
        {
            s = "nl";
        }
        return s;
    }

    private static String updateTargeting(AdCallData adcalldata)
        throws ConfigException
    {
        AdConfig adconfig = AdConfigManager.INSTANCE.getAdConfig();
        adcalldata = TargetingManager.INSTANCE.replaceTokenForAdUrl(adconfig.getAdUrl(), adcalldata, adconfig);
        LogUtil.d("BackgroundFetcher", LoggingMetaTags.TWC_AD, "updateTargeting URL=%s", new Object[] {
            adcalldata
        });
        return adcalldata;
    }

    protected BrandedBackground fetch(AdCallData adcalldata)
        throws Exception
    {
        return getData(updateTargeting(adcalldata));
    }

    protected volatile Object fetch(Object obj)
        throws Exception
    {
        return fetch((AdCallData)obj);
    }
}
