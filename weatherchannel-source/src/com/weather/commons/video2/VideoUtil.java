// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.util.Log;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.config.AdSlotNotFoundException;
import com.weather.ads2.targeting.AdCallData;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.ads2.targeting.TargetingManager;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.video2.dsx.AdsMetrics;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.video2:
//            VideoMessage

public final class VideoUtil
{

    private static final String TAG = "VideoUtil";

    private VideoUtil()
    {
    }

    public static String getVideoAdTags(String s, VideoMessage videomessage)
    {
        com.weather.ads2.config.AdConfig adconfig;
        com.google.common.collect.ImmutableMap.Builder builder;
        String s1;
        adconfig = AdConfigManager.INSTANCE.getAdConfig();
        s1 = videomessage.getId();
        builder = ImmutableMap.builder();
        builder.put(AdTargetingParam.LNID.getParameterKey(), videomessage.getCollectionId().replace("/", "_"));
        builder.put(AdTargetingParam.VIDEO.getParameterKey(), s1);
        builder.put(AdTargetingParam.TTID.getParameterKey(), s1);
        s1 = videomessage.getPlaylistId();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        builder.put(AdTargetingParam.PLAYLIST.getParameterKey(), s1);
        s = (new AdConfigUnit(adconfig, s)).addTargetingParameters(builder.build());
        s = TargetingManager.INSTANCE.replaceIMAParameters(new AdCallData(s), adconfig, videomessage.getAdsMetrics().getAdZone());
        return s;
        s;
        LogUtil.e("VideoUtil", LoggingMetaTags.TWC_VIDEOS, (new StringBuilder()).append("Ad config error:").append(s).toString(), new Object[0]);
_L2:
        return null;
        s;
        LogUtil.e("VideoUtil", LoggingMetaTags.TWC_VIDEOS, (new StringBuilder()).append("Ad slot not found:").append(s).toString(), new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean imaVideoUseAbr()
    {
        boolean flag = false;
        boolean flag1 = ConfigurationManagers.getInstance().getFlagshipConfig().shouldImaVideoUseAbr;
        flag = flag1;
_L2:
        LogUtil.d("VideoUtil", LoggingMetaTags.TWC_VIDEOS, "imaVideoUseAbr=%s", new Object[] {
            Boolean.valueOf(flag)
        });
        return flag;
        ConfigException configexception;
        configexception;
        Log.e("VideoUtil", configexception.getMessage());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean useImaVideoFeature()
    {
        boolean flag = false;
        boolean flag1 = ConfigurationManagers.getInstance().getFlagshipConfig().featureEnabledImaVideo;
        flag = flag1;
_L1:
        ConfigException configexception;
        if (flag && android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        LogUtil.d("VideoUtil", LoggingMetaTags.TWC_VIDEOS, "useImaVideoFeature=%s", new Object[] {
            Boolean.valueOf(flag)
        });
        return flag;
        configexception;
        Log.e("VideoUtil", configexception.getMessage());
          goto _L1
    }
}
