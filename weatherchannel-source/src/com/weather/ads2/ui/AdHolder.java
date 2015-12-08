// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;

import android.content.Context;
import android.os.Handler;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.config.AdSlotNotFoundException;
import com.weather.ads2.targeting.AdRefreshEvent;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.locations.ActiveLocation;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.util.CollectionsUtil;
import com.weather.util.TwcPreconditions;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.ui.Dimension;
import java.util.Map;

// Referenced classes of package com.weather.ads2.ui:
//            AdRefreshable

public final class AdHolder
{

    private static final String TAG = "AdHolder";
    private final AdConfigManager adConfigManager;
    private final AdRefreshable adGenerator;
    private boolean adRequestPending;
    private String adSlotName;
    private final TwcBus bus;
    private Map extraTargetingParameters;
    private final Handler handler;
    private AdConfigUnit initializingConfigUnit;
    private AdRefreshEvent lastAdRefresh;
    private boolean paused;
    private boolean registeredOnBus;
    private boolean visible;

    public AdHolder(AdRefreshable adrefreshable)
    {
        this(adrefreshable, AdConfigManager.INSTANCE, DataAccessLayer.BUS, new Handler());
    }

    AdHolder(AdRefreshable adrefreshable, AdConfigManager adconfigmanager, TwcBus twcbus, Handler handler1)
    {
        visible = true;
        paused = true;
        extraTargetingParameters = ImmutableMap.of();
        adConfigManager = (AdConfigManager)Preconditions.checkNotNull(adconfigmanager);
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
        handler = (Handler)Preconditions.checkNotNull(handler1);
        adGenerator = (AdRefreshable)Preconditions.checkNotNull(adrefreshable);
    }

    private void doRefresh(AdRefreshEvent adrefreshevent)
    {
        TwcPreconditions.checkOnMainThread();
        if (adrefreshevent != null && !adrefreshevent.getLocationOfEvent().equals(ActiveLocation.getInstance().getLocation()))
        {
            LogUtil.d("AdHolder", LoggingMetaTags.TWC_AD, "doRefresh: Not refreshing ad %s: location does not match current location", new Object[] {
                this
            });
            return;
        }
        if (adrefreshevent != null)
        {
            if (adrefreshevent.equals(lastAdRefresh))
            {
                LogUtil.d("AdHolder", LoggingMetaTags.TWC_AD, "doRefresh: Not refreshing ad %s: duplicate ad request", new Object[] {
                    this
                });
                return;
            }
            lastAdRefresh = adrefreshevent;
        }
        if (visible && !paused && adGenerator.isConfigured())
        {
            LogUtil.d("AdHolder", LoggingMetaTags.TWC_AD, "doRefresh: Refreshing ad %s", new Object[] {
                this
            });
            adGenerator.refreshAd(adrefreshevent);
            adRequestPending = false;
            return;
        } else
        {
            LogUtil.d("AdHolder", LoggingMetaTags.TWC_AD, "doRefresh: Not refreshing ad %s: ad not visible or not initialized", new Object[] {
                this
            });
            adRequestPending = true;
            return;
        }
    }

    public void destroy()
    {
        adGenerator.destroy();
    }

    public Dimension getAdBoundingBox(Context context)
    {
        if (initializingConfigUnit != null)
        {
            return initializingConfigUnit.getAdBoundingSizeInPixels(context, adConfigManager.getDefaultAdSize(context));
        } else
        {
            return null;
        }
    }

    public void init(String s)
    {
        adSlotName = s;
        adGenerator.setAdSlotName(s);
        initializingConfigUnit = adGenerator.getAdConfiguration();
    }

    public boolean isVisible()
    {
        return visible;
    }

    public void pause()
    {
        if (!paused)
        {
            if (registeredOnBus)
            {
                bus.unregister(this);
                registeredOnBus = false;
            }
            adGenerator.clearPendingAdRequest();
            adGenerator.pause();
            lastAdRefresh = null;
            adRequestPending = false;
            paused = true;
        }
    }

    public void refresh()
    {
        if (!paused)
        {
            doRefresh(null);
        }
    }

    public void refresh(final AdRefreshEvent triggeringEvent)
    {
        Preconditions.checkNotNull(triggeringEvent);
        handler.post(new Runnable() {

            final AdHolder this$0;
            final AdRefreshEvent val$triggeringEvent;

            public void run()
            {
                doRefresh(triggeringEvent);
            }

            
            {
                this$0 = AdHolder.this;
                triggeringEvent = adrefreshevent;
                super();
            }
        });
    }

    public void resume()
    {
        lastAdRefresh = null;
        paused = false;
        adRequestPending = false;
        if (initializingConfigUnit == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        AdConfigUnit adconfigunit = adConfigManager.getAdConfigUnit(adSlotName);
        if (adconfigunit != null)
        {
            try
            {
                if (!adconfigunit.equals(initializingConfigUnit))
                {
                    init(adSlotName);
                    setExtraTargetingParameters(extraTargetingParameters, false);
                }
            }
            catch (ConfigException configexception)
            {
                EventLog.e("AdHolder", (new StringBuilder()).append("Cannot update ad slot for ").append(this).append(": ads are not configured").toString());
            }
            catch (AdSlotNotFoundException adslotnotfoundexception)
            {
                EventLog.e("AdHolder", (new StringBuilder()).append("Cannot update ad slot for ").append(this).append(": slot name not found").toString());
            }
        }
        adGenerator.clearPendingAdRequest();
        adGenerator.resume();
        if (!registeredOnBus)
        {
            bus.register(this);
            registeredOnBus = true;
        }
        return;
    }

    public void setExtraTargetingParameters(Map map, boolean flag)
    {
        Object obj;
        if (flag)
        {
            obj = CollectionsUtil.mergeMaps(extraTargetingParameters, map, ",");
        } else
        {
            obj = ImmutableMap.copyOf(map);
        }
        extraTargetingParameters = ((Map) (obj));
        if (adSlotName != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        AdConfigUnit adconfigunit = adGenerator.getAdConfiguration();
_L3:
        if (adconfigunit != null)
        {
            try
            {
                map = adconfigunit.addTargetingParameters(map);
                adGenerator.setAdConfiguration(map);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                EventLog.e("AdHolder", (new StringBuilder()).append("Cannot update ad targeting for ").append(this).append(": ads are not configured").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                EventLog.e("AdHolder", (new StringBuilder()).append("Cannot update ad targeting for ").append(this).append(": slot name not found").toString());
            }
            break MISSING_BLOCK_LABEL_149;
        }
        continue; /* Loop/switch isn't completed */
        adconfigunit = adConfigManager.getAdConfigUnit(adSlotName);
          goto _L3
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setVisible(boolean flag)
    {
        if (flag != visible)
        {
            LogUtil.d("AdHolder", LoggingMetaTags.TWC_AD, "setVisible visibility changed, newVisible=%s for %s", new Object[] {
                Boolean.valueOf(flag), this
            });
            visible = flag;
            if (adRequestPending && visible)
            {
                AdRefreshEvent adrefreshevent = lastAdRefresh;
                lastAdRefresh = null;
                doRefresh(adrefreshevent);
            }
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("AdHolder@").append(System.identityHashCode(this)).append('{').append(" adGenerator=").append(adGenerator).append(", adRequestPending=").append(adRequestPending).append(", paused=").append(paused).append(", visible=").append(visible).append(", adSlotName='").append(adSlotName).append('\'').append('}').toString();
    }

}
