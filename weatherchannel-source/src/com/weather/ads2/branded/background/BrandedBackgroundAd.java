// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.branded.background;

import android.os.Handler;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.config.AdSlotNotFoundException;
import com.weather.ads2.targeting.AdCallData;
import com.weather.ads2.targeting.AdRefreshEvent;
import com.weather.ads2.targeting.UserIdQueriers;
import com.weather.ads2.ui.AdRefreshable;
import com.weather.ads2.ui.HideableAd;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.net.Receiver;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Map;

// Referenced classes of package com.weather.ads2.branded.background:
//            BackgroundFetcher, BackgroundView, BrandedBackground

public class BrandedBackgroundAd
    implements AdRefreshable
{
    private static final class FallbackDisplayStatus extends Enum
    {

        private static final FallbackDisplayStatus $VALUES[];
        public static final FallbackDisplayStatus LOADED;
        public static final FallbackDisplayStatus NOT_LOADED;
        public static final FallbackDisplayStatus PENDING;

        public static FallbackDisplayStatus valueOf(String s)
        {
            return (FallbackDisplayStatus)Enum.valueOf(com/weather/ads2/branded/background/BrandedBackgroundAd$FallbackDisplayStatus, s);
        }

        public static FallbackDisplayStatus[] values()
        {
            return (FallbackDisplayStatus[])$VALUES.clone();
        }

        static 
        {
            NOT_LOADED = new FallbackDisplayStatus("NOT_LOADED", 0);
            LOADED = new FallbackDisplayStatus("LOADED", 1);
            PENDING = new FallbackDisplayStatus("PENDING", 2);
            $VALUES = (new FallbackDisplayStatus[] {
                NOT_LOADED, LOADED, PENDING
            });
        }

        private FallbackDisplayStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "BrandedBackgroundAd";
    private final AdConfigManager adConfigManager;
    private AdConfigUnit adConfigUnit;
    private final String adSlotName;
    private final BackgroundFetcher backgroundFetcher;
    private final Receiver backgroundReceiver;
    private BackgroundView backgroundView;
    private AdRefreshEvent currentAdRequest;
    private final HideableAd fallbackAd;
    private FallbackDisplayStatus fallbackDisplayStatus;
    private final Handler handler;
    private Map singleUseAdParameters;

    public BrandedBackgroundAd(String s, HideableAd hideablead)
    {
        this(s, hideablead, AdConfigManager.INSTANCE, new BackgroundFetcher(UserIdQueriers.getQuerier()), new Handler());
    }

    BrandedBackgroundAd(String s, HideableAd hideablead, AdConfigManager adconfigmanager, BackgroundFetcher backgroundfetcher, Handler handler1)
    {
        fallbackDisplayStatus = FallbackDisplayStatus.NOT_LOADED;
        singleUseAdParameters = ImmutableMap.of();
        backgroundReceiver = new Receiver() {

            final BrandedBackgroundAd this$0;

            public void onCompletion(BrandedBackground brandedbackground, AdRefreshEvent adrefreshevent)
            {
                handleBackgroundResponse(brandedbackground, adrefreshevent);
            }

            public volatile void onCompletion(Object obj, Object obj1)
            {
                onCompletion((BrandedBackground)obj, (AdRefreshEvent)obj1);
            }

            public void onError(Throwable throwable, AdRefreshEvent adrefreshevent)
            {
                handleBackgroundFailure(adrefreshevent);
            }

            public volatile void onError(Throwable throwable, Object obj)
            {
                onError(throwable, (AdRefreshEvent)obj);
            }

            
            {
                this$0 = BrandedBackgroundAd.this;
                super();
            }
        };
        adSlotName = s;
        fallbackAd = (HideableAd)Preconditions.checkNotNull(hideablead);
        handler = handler1;
        backgroundFetcher = (BackgroundFetcher)Preconditions.checkNotNull(backgroundfetcher);
        adConfigManager = (AdConfigManager)Preconditions.checkNotNull(adconfigmanager);
    }

    private AdConfigUnit getCurrentAdConfig()
    {
        boolean flag;
        if (adSlotName == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return null;
        }
        AdConfigUnit adconfigunit = adConfigManager.getAdConfigUnit(adSlotName);
        return adconfigunit;
        Object obj;
        obj;
_L2:
        EventLog.e("BrandedBackgroundAd", "Branded background is not configured", ((Throwable) (obj)));
        return null;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleBackgroundFailure(final Object userData)
    {
        handler.post(new Runnable() {

            final BrandedBackgroundAd this$0;
            final Object val$userData;

            public void run()
            {
                if (backgroundView != null && Objects.equal(userData, currentAdRequest))
                {
                    showNonBrandedBackground(currentAdRequest);
                }
            }

            
            {
                this$0 = BrandedBackgroundAd.this;
                userData = obj;
                super();
            }
        });
    }

    private void handleBackgroundResponse(final BrandedBackground result, final AdRefreshEvent userData)
    {
        handler.post(new Runnable() {

            final BrandedBackgroundAd this$0;
            final BrandedBackground val$result;
            final AdRefreshEvent val$userData;

            public void run()
            {
label0:
                {
                    if (backgroundView != null && Objects.equal(userData, currentAdRequest))
                    {
                        if (!result.isEmpty())
                        {
                            break label0;
                        }
                        showNonBrandedBackground(currentAdRequest);
                    }
                    return;
                }
                fallbackAd.hideAd();
                backgroundView.showBrandedBackground(result);
                currentAdRequest = null;
                singleUseAdParameters = ImmutableMap.of();
            }

            
            {
                this$0 = BrandedBackgroundAd.this;
                userData = adrefreshevent;
                result = brandedbackground;
                super();
            }
        });
    }

    private void showNonBrandedBackground(AdRefreshEvent adrefreshevent)
    {
        backgroundView.showNonBrandedBackground();
        if (adrefreshevent.isAllowBrandedBackground())
        {
            if (backgroundView.isShowingBrandedBackground())
            {
                fallbackDisplayStatus = FallbackDisplayStatus.PENDING;
            } else
            {
                fallbackAd.setSingleUseAdParameters(singleUseAdParameters);
                fallbackAd.refreshAd(adrefreshevent);
                fallbackAd.showAdOnLoad();
                fallbackDisplayStatus = FallbackDisplayStatus.LOADED;
            }
        } else
        {
            fallbackAd.hideAd();
        }
        if (fallbackDisplayStatus != FallbackDisplayStatus.PENDING)
        {
            currentAdRequest = null;
        }
        singleUseAdParameters = ImmutableMap.of();
    }

    public void clearPendingAdRequest()
    {
        currentAdRequest = null;
        if (fallbackDisplayStatus == FallbackDisplayStatus.PENDING)
        {
            fallbackDisplayStatus = FallbackDisplayStatus.NOT_LOADED;
        }
    }

    public void destroy()
    {
        fallbackAd.destroy();
    }

    public AdConfigUnit getAdConfiguration()
    {
        return fallbackAd.getAdConfiguration();
    }

    public boolean isConfigured()
    {
        return true;
    }

    public void pause()
    {
        clearPendingAdRequest();
        fallbackAd.pause();
    }

    public void recordImpression()
    {
        if (fallbackDisplayStatus == FallbackDisplayStatus.LOADED)
        {
            fallbackAd.recordImpression();
        }
    }

    public void refreshAd(AdRefreshEvent adrefreshevent)
    {
        currentAdRequest = adrefreshevent;
        fallbackDisplayStatus = FallbackDisplayStatus.NOT_LOADED;
        if (adrefreshevent == null)
        {
            LogUtil.d("BrandedBackgroundAd", LoggingMetaTags.TWC_AD, "Not refreshing background ad because refresh event is forced", new Object[0]);
            return;
        }
        if (backgroundView == null)
        {
            fallbackAd.refreshAd(adrefreshevent);
            fallbackAd.showAdOnLoad();
            fallbackDisplayStatus = FallbackDisplayStatus.LOADED;
            currentAdRequest = null;
            LogUtil.d("BrandedBackgroundAd", LoggingMetaTags.TWC_AD, "Not refreshing background ad because background view is not set", new Object[0]);
            return;
        }
        if (adConfigUnit == null)
        {
            LogUtil.d("BrandedBackgroundAd", LoggingMetaTags.TWC_AD, "Not refreshing background ad because background is not configured", new Object[0]);
            showNonBrandedBackground(adrefreshevent);
            return;
        }
        if (!adrefreshevent.isAllowBrandedBackground())
        {
            LogUtil.d("BrandedBackgroundAd", LoggingMetaTags.TWC_AD, "Not refreshing background ad because branded backgrounds are suppressed by weather backgrounds", new Object[0]);
            showNonBrandedBackground(adrefreshevent);
            return;
        }
        LogUtil.d("BrandedBackgroundAd", LoggingMetaTags.TWC_AD, "Refreshing branded background", new Object[0]);
        AdConfigUnit adconfigunit;
        if (singleUseAdParameters.isEmpty())
        {
            adconfigunit = adConfigUnit;
        } else
        {
            adconfigunit = adConfigUnit.addTargetingParameters(singleUseAdParameters);
        }
        backgroundFetcher.asyncFetch(new AdCallData(adconfigunit), backgroundReceiver, adrefreshevent);
    }

    public void resume()
    {
        fallbackAd.resume();
    }

    public void setAdConfiguration(AdConfigUnit adconfigunit)
    {
        fallbackAd.setAdConfiguration(adconfigunit);
        adConfigUnit = getCurrentAdConfig();
    }

    public void setAdSlotName(String s)
    {
        fallbackAd.setAdSlotName(s);
        adConfigUnit = getCurrentAdConfig();
    }

    public void setBackgroundView(BackgroundView backgroundview)
    {
        if (backgroundView != null)
        {
            backgroundView.setOnBackgroundUpdateListener(null);
        }
        backgroundView = backgroundview;
        backgroundview.setOnBackgroundUpdateListener(new BackgroundView.OnBackgroundUpdateListener() {

            final BrandedBackgroundAd this$0;

            public void onBackgroundUpdated(boolean flag)
            {
                if (!flag && fallbackDisplayStatus == FallbackDisplayStatus.PENDING)
                {
                    fallbackAd.refreshAd(currentAdRequest);
                    fallbackAd.showAdOnLoad();
                    fallbackDisplayStatus = FallbackDisplayStatus.LOADED;
                    currentAdRequest = null;
                }
            }

            
            {
                this$0 = BrandedBackgroundAd.this;
                super();
            }
        });
    }

    public void setSingleUseAdParameters(Map map)
    {
        singleUseAdParameters = ImmutableMap.copyOf(map);
    }



/*
    static FallbackDisplayStatus access$002(BrandedBackgroundAd brandedbackgroundad, FallbackDisplayStatus fallbackdisplaystatus)
    {
        brandedbackgroundad.fallbackDisplayStatus = fallbackdisplaystatus;
        return fallbackdisplaystatus;
    }

*/



/*
    static AdRefreshEvent access$102(BrandedBackgroundAd brandedbackgroundad, AdRefreshEvent adrefreshevent)
    {
        brandedbackgroundad.currentAdRequest = adrefreshevent;
        return adrefreshevent;
    }

*/







/*
    static Map access$702(BrandedBackgroundAd brandedbackgroundad, Map map)
    {
        brandedbackgroundad.singleUseAdParameters = map;
        return map;
    }

*/
}
