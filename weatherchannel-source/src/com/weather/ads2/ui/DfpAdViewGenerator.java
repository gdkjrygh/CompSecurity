// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.targeting.AdCallData;
import com.weather.ads2.targeting.AdRefreshEvent;
import com.weather.ads2.targeting.TargetingManager;
import com.weather.ads2.targeting.TwcAdRequest;
import com.weather.ads2.targeting.ViewCount;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.ads2.ui:
//            AdRefreshable, AdViewHolder

public class DfpAdViewGenerator
    implements AdRefreshable
{
    private class DfpAdListener extends AdListener
    {

        private final PublisherAdView ad;
        private final AdViewHolder addAdView;
        final DfpAdViewGenerator this$0;

        public void onAdClosed()
        {
            super.onAdClosed();
            LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "onAdClosed:%s", new Object[] {
                ad
            });
        }

        public void onAdFailedToLoad(int i)
        {
            super.onAdFailedToLoad(i);
            i;
            JVM INSTR tableswitch 0 3: default 36
        //                       0 96
        //                       1 102
        //                       2 108
        //                       3 114;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            String s = "";
_L7:
            EventLog.w("DfpAdViewGenerator", String.format(Locale.US, "Fail to load %s: %n%d: %s", new Object[] {
                ad.getAdUnitId(), Integer.valueOf(i), s
            }));
            impressCanBeRecorded = false;
            addAdView.onAdFail();
            return;
_L2:
            s = "ERROR_CODE_INTERNAL_ERROR";
            continue; /* Loop/switch isn't completed */
_L3:
            s = "ERROR_CODE_INVALID_REQUEST";
            continue; /* Loop/switch isn't completed */
_L4:
            s = "ERROR_CODE_NETWORK_ERROR";
            continue; /* Loop/switch isn't completed */
_L5:
            s = "ERROR_CODE_NO_FILL";
            if (true) goto _L7; else goto _L6
_L6:
        }

        public void onAdLeftApplication()
        {
            super.onAdLeftApplication();
            LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "onAdLeftApplication:%s", new Object[] {
                ad
            });
        }

        public void onAdLoaded()
        {
            super.onAdLoaded();
            android.view.View view = addAdView.getAdViewHolder();
            if (view != null)
            {
                if (ad.getParent() != null)
                {
                    if (view instanceof ViewGroup)
                    {
                        ((ViewGroup)view).removeAllViews();
                        ((ViewGroup)view).addView(ad);
                    }
                } else
                {
                    ((ViewGroup)view).addView(ad);
                }
            }
            impressCanBeRecorded = true;
            LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "%s loaded", new Object[] {
                ad.getAdUnitId()
            });
            addAdView.onAdLoaded(ad.getAdSize());
            if (recordingOption == ImpressionRecordingOption.AUTO_CLIENT)
            {
                recordImpression();
            }
        }

        public void onAdOpened()
        {
            super.onAdOpened();
            LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "onAdOpened:%s", new Object[] {
                ad
            });
        }

        private DfpAdListener(PublisherAdView publisheradview, AdViewHolder adviewholder)
        {
            this$0 = DfpAdViewGenerator.this;
            super();
            ad = publisheradview;
            addAdView = adviewholder;
        }

    }

    public static final class ImpressionRecordingOption extends Enum
    {

        private static final ImpressionRecordingOption $VALUES[];
        public static final ImpressionRecordingOption AUTO_CLIENT;
        public static final ImpressionRecordingOption AUTO_SERVER;
        public static final ImpressionRecordingOption MANUAL;

        public static ImpressionRecordingOption valueOf(String s)
        {
            return (ImpressionRecordingOption)Enum.valueOf(com/weather/ads2/ui/DfpAdViewGenerator$ImpressionRecordingOption, s);
        }

        public static ImpressionRecordingOption[] values()
        {
            return (ImpressionRecordingOption[])$VALUES.clone();
        }

        static 
        {
            MANUAL = new ImpressionRecordingOption("MANUAL", 0);
            AUTO_CLIENT = new ImpressionRecordingOption("AUTO_CLIENT", 1);
            AUTO_SERVER = new ImpressionRecordingOption("AUTO_SERVER", 2);
            $VALUES = (new ImpressionRecordingOption[] {
                MANUAL, AUTO_CLIENT, AUTO_SERVER
            });
        }

        private ImpressionRecordingOption(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String CONTENT_URL_MAIN_FEEDS = "weather.com";
    private static final String KEY_SLOT_NAME = "slotName";
    private static final String REGEX_MAIN_FEEDS = "weather.feed[1-9]";
    private static final String TAG = "DfpAdViewGenerator";
    private AdConfigUnit adConfigUnit;
    private final PublisherAdView adView;
    private boolean impressCanBeRecorded;
    private int lastViewCountId;
    private boolean paused;
    private AdRefreshEvent pendingAdRequest;
    private final ImpressionRecordingOption recordingOption;
    private Map singleUseAdParameters;

    public DfpAdViewGenerator(Context context, AdConfigUnit adconfigunit, AdViewHolder adviewholder, ImpressionRecordingOption impressionrecordingoption, AdSize adsize)
    {
        singleUseAdParameters = ImmutableMap.of();
        Preconditions.checkNotNull(context);
        adConfigUnit = (AdConfigUnit)Preconditions.checkNotNull(adconfigunit);
        Preconditions.checkNotNull(adviewholder);
        recordingOption = (ImpressionRecordingOption)Preconditions.checkNotNull(impressionrecordingoption);
        Preconditions.checkNotNull(adsize);
        adView = createDfpAd(context, adconfigunit.getAllowedAdSizes(adsize), adconfigunit.getAdUnitId());
        adView.setAdListener(new DfpAdListener(adView, adviewholder));
        LogUtil.d("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "Creating ad for %s with sizes %s", new Object[] {
            adView.getAdUnitId(), Arrays.toString(adView.getAdSizes())
        });
    }

    private static PublisherAdView createDfpAd(Context context, List list, String s)
    {
        context = new PublisherAdView(context);
        list.size();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 111
    //                   1 121
    //                   2 145
    //                   3 182;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        context.setAdSizes(new AdSize[] {
            (AdSize)list.get(0), (AdSize)list.get(1), (AdSize)list.get(2), (AdSize)list.get(3)
        });
_L7:
        context.setAdUnitId(s);
        return context;
_L2:
        throw new IllegalArgumentException("Ad size can't be empty");
_L3:
        context.setAdSizes(new AdSize[] {
            (AdSize)list.get(0)
        });
        continue; /* Loop/switch isn't completed */
_L4:
        context.setAdSizes(new AdSize[] {
            (AdSize)list.get(0), (AdSize)list.get(1)
        });
        continue; /* Loop/switch isn't completed */
_L5:
        context.setAdSizes(new AdSize[] {
            (AdSize)list.get(0), (AdSize)list.get(1), (AdSize)list.get(2)
        });
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void clearPendingAdRequest()
    {
        LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "Clearing pending ad", new Object[0]);
        pendingAdRequest = null;
    }

    public void destroy()
    {
        LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "Destroying ad", new Object[0]);
        adView.destroy();
        impressCanBeRecorded = false;
    }

    public AdConfigUnit getAdConfiguration()
    {
        return adConfigUnit;
    }

    public boolean isConfigured()
    {
        return true;
    }

    public void pause()
    {
        LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "Pausing ad", new Object[0]);
        paused = true;
        adView.pause();
    }

    public void recordImpression()
    {
        if (impressCanBeRecorded)
        {
            LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "Recording impression", new Object[0]);
            ViewCount.INSTANCE.incrementCount(lastViewCountId);
            if (recordingOption == ImpressionRecordingOption.MANUAL || recordingOption == ImpressionRecordingOption.AUTO_CLIENT)
            {
                adView.recordManualImpression();
            }
            impressCanBeRecorded = false;
        }
    }

    public void refreshAd(AdRefreshEvent adrefreshevent)
    {
        Bundle bundle;
        Object obj;
        if (!TargetingManager.INSTANCE.isInitialSettingComplete())
        {
            LogUtil.d("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "Skipping ad refresh because not all parameters are initialized; will refresh when initialization is complete", new Object[0]);
            return;
        }
        if (paused)
        {
            LogUtil.d("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "Skipping ad refresh because the ad view is paused", new Object[0]);
            pendingAdRequest = adrefreshevent;
            return;
        }
        pendingAdRequest = null;
        adrefreshevent = TargetingManager.INSTANCE.getAdRequest(new AdCallData(adConfigUnit));
        obj = new com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder();
        bundle = new Bundle();
        Map map = adrefreshevent.getTargetingParameters();
        java.util.Map.Entry entry;
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); bundle.putString((String)entry.getKey(), entry.getValue().toString()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator1 = singleUseAdParameters.entrySet().iterator(); iterator1.hasNext(); bundle.putString((String)entry1.getKey(), (String)entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

        singleUseAdParameters = ImmutableMap.of();
        ((com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder) (obj)).addNetworkExtras(new AdMobExtras(bundle));
        if (recordingOption != ImpressionRecordingOption.AUTO_SERVER)
        {
            ((com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder) (obj)).setManualImpressionsEnabled(true);
        }
        if (map.containsKey("slotName") && Pattern.matches("weather.feed[1-9]", ((String)map.get("slotName")).toString()))
        {
            ((com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder) (obj)).setContentUrl("weather.com");
        }
        obj = ((com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder) (obj)).build();
        impressCanBeRecorded = false;
        lastViewCountId = adrefreshevent.getViewCountId();
        TrafficStats.setThreadStatsTag(40960);
        adView.loadAd(((com.google.android.gms.ads.doubleclick.PublisherAdRequest) (obj)));
        TrafficStats.clearThreadStatsTag();
        LogUtil.d("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "TargetingMap=%s, adUnitId=%s", new Object[] {
            bundle, adView.getAdUnitId()
        });
        return;
        adrefreshevent;
        TrafficStats.clearThreadStatsTag();
        throw adrefreshevent;
    }

    public void resume()
    {
        LogUtil.v("DfpAdViewGenerator", LoggingMetaTags.TWC_AD, "Resuming ad", new Object[0]);
        paused = false;
        adView.resume();
        if (pendingAdRequest != null)
        {
            refreshAd(pendingAdRequest);
            pendingAdRequest = null;
        }
    }

    public void setAdConfiguration(AdConfigUnit adconfigunit)
    {
        adConfigUnit = (AdConfigUnit)Preconditions.checkNotNull(adconfigunit);
    }

    public void setAdSlotName(String s)
    {
    }

    public void setSingleUseAdParameters(Map map)
    {
        singleUseAdParameters = ImmutableMap.copyOf(map);
    }


/*
    static boolean access$102(DfpAdViewGenerator dfpadviewgenerator, boolean flag)
    {
        dfpadviewgenerator.impressCanBeRecorded = flag;
        return flag;
    }

*/

}
