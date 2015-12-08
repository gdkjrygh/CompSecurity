// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.common.base.Preconditions;
import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.config.AdSlotNotFoundException;
import com.weather.ads2.targeting.AdRefreshEvent;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.AndroidConstants;
import com.weather.util.TwcPreconditions;
import com.weather.util.config.ConfigException;
import com.weather.util.ui.Dimension;
import java.util.Map;

// Referenced classes of package com.weather.ads2.ui:
//            HideableAd, AdViewHolder, NullAdRefreshable, AdRefreshable

public class DfpAd
    implements HideableAd, AdViewHolder
{
    public static class Builder
    {

        private AdConfigManager adConfigManager;
        private int hiddenVisibility;
        private boolean hideAdOnLoadFailure;
        private boolean resizeAdOnLoad;

        public DfpAd build()
        {
            return new DfpAd(adConfigManager, resizeAdOnLoad, hideAdOnLoadFailure, hiddenVisibility);
        }

        Builder setAdConfigManager(AdConfigManager adconfigmanager)
        {
            adConfigManager = (AdConfigManager)Preconditions.checkNotNull(adconfigmanager);
            return this;
        }

        public Builder setHiddenVisibility(int i)
        {
            TwcPreconditions.checkAllowed(Integer.valueOf(i), AndroidConstants.VIEW_VISIBILITIES);
            hiddenVisibility = i;
            return this;
        }

        public Builder setHideAdOnLoadFailure(boolean flag)
        {
            hideAdOnLoadFailure = flag;
            return this;
        }

        public Builder setResizeAdOnLoad(boolean flag)
        {
            resizeAdOnLoad = flag;
            return this;
        }

        private Builder()
        {
            adConfigManager = AdConfigManager.INSTANCE;
            hiddenVisibility = 4;
        }

    }

    private static final class InitializeState extends Enum
    {

        private static final InitializeState $VALUES[];
        public static final InitializeState AD_SLOT;
        public static final InitializeState FULL;
        public static final InitializeState NONE;
        public static final InitializeState PARENT_VIEW;

        public static InitializeState valueOf(String s)
        {
            return (InitializeState)Enum.valueOf(com/weather/ads2/ui/DfpAd$InitializeState, s);
        }

        public static InitializeState[] values()
        {
            return (InitializeState[])$VALUES.clone();
        }

        static 
        {
            NONE = new InitializeState("NONE", 0);
            PARENT_VIEW = new InitializeState("PARENT_VIEW", 1);
            AD_SLOT = new InitializeState("AD_SLOT", 2);
            FULL = new InitializeState("FULL", 3);
            $VALUES = (new InitializeState[] {
                NONE, PARENT_VIEW, AD_SLOT, FULL
            });
        }

        private InitializeState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "DfpAd";
    private final AdConfigManager adConfigManager;
    private AdRefreshable adGenerator;
    private String adSlotName;
    private final int hiddenVisibility;
    private final boolean hideAdOnLoadFailure;
    private InitializeState initializeState;
    private View parentView;
    private final boolean resizeAdOnLoad;
    private boolean shouldShow;
    private boolean showOnLoad;
    private View viewContainer;
    private View viewContainerParent;

    DfpAd(AdConfigManager adconfigmanager, boolean flag, boolean flag1, int i)
    {
        initializeState = InitializeState.NONE;
        adGenerator = NullAdRefreshable.getInstance();
        TwcPreconditions.checkAllowed(Integer.valueOf(i), AndroidConstants.VIEW_VISIBILITIES);
        hideAdOnLoadFailure = flag1;
        adConfigManager = (AdConfigManager)Preconditions.checkNotNull(adconfigmanager);
        hiddenVisibility = i;
        resizeAdOnLoad = flag;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    private void cleanupAdGenerator()
    {
        if (adGenerator != null)
        {
            adGenerator.pause();
            adGenerator.destroy();
            adGenerator = NullAdRefreshable.getInstance();
        }
    }

    private AdRefreshable createAdViewGenerator(Context context)
    {
        context = adConfigManager.generateAdView(context, adSlotName, this, DfpAdViewGenerator.ImpressionRecordingOption.AUTO_SERVER);
        return context;
        context;
        EventLog.e("DfpAd", (new StringBuilder()).append("Cannot create ad for ").append(this).append(": ads are not configured").toString());
_L2:
        return null;
        context;
        EventLog.e("DfpAd", (new StringBuilder()).append("Cannot create ad for ").append(this).append(": slot name not found").toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void initializeAd()
    {
        cleanupAdGenerator();
        initializeState = InitializeState.FULL;
        viewContainer = parentView.findViewById(com.weather.ads2.R.id.ad_view_holder);
        viewContainerParent = parentView.findViewById(com.weather.ads2.R.id.ad_view_parent);
        if (viewContainer == null)
        {
            return;
        }
        if (!shouldShow)
        {
            setAdVisibility(hiddenVisibility);
            return;
        }
        Object obj = parentView.getContext();
        adGenerator = createAdViewGenerator(((Context) (obj)));
        if (adGenerator == null)
        {
            adGenerator = NullAdRefreshable.getInstance();
            setAdVisibility(hiddenVisibility);
            return;
        }
        AdConfigUnit adconfigunit = adGenerator.getAdConfiguration();
        if (adconfigunit == null)
        {
            shouldShow = false;
            setAdVisibility(hiddenVisibility);
            cleanupAdGenerator();
            return;
        } else
        {
            obj = adconfigunit.getAdBoundingSizeInPixels(((Context) (obj)), adConfigManager.getDefaultAdSize(((Context) (obj))));
            viewContainer.getLayoutParams().width = ((Dimension) (obj)).getWidth();
            viewContainer.getLayoutParams().height = ((Dimension) (obj)).getHeight();
            viewContainer.setVisibility(0);
            return;
        }
    }

    private void setAdVisibility(int i)
    {
        if (viewContainer != null)
        {
            viewContainer.setVisibility(i);
        }
        if (viewContainerParent != null)
        {
            viewContainerParent.setVisibility(i);
        }
    }

    public void clearPendingAdRequest()
    {
        adGenerator.clearPendingAdRequest();
    }

    public void destroy()
    {
        adGenerator.destroy();
    }

    public AdConfigUnit getAdConfiguration()
    {
        return adGenerator.getAdConfiguration();
    }

    public View getAdViewHolder()
    {
        return viewContainer;
    }

    public void hideAd()
    {
        setAdVisibility(hiddenVisibility);
        showOnLoad = false;
    }

    public void init(View view)
    {
        parentView = (View)Preconditions.checkNotNull(view);
        static class _cls1
        {

            static final int $SwitchMap$com$weather$ads2$ui$DfpAd$InitializeState[];

            static 
            {
                $SwitchMap$com$weather$ads2$ui$DfpAd$InitializeState = new int[InitializeState.values().length];
                try
                {
                    $SwitchMap$com$weather$ads2$ui$DfpAd$InitializeState[InitializeState.NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1..SwitchMap.com.weather.ads2.ui.DfpAd.InitializeState[initializeState.ordinal()])
        {
        default:
            initializeAd();
            return;

        case 1: // '\001'
            initializeState = InitializeState.PARENT_VIEW;
            break;
        }
    }

    public boolean isConfigured()
    {
        return adGenerator.isConfigured();
    }

    public void onAdFail()
    {
        if (hideAdOnLoadFailure)
        {
            setAdVisibility(hiddenVisibility);
        }
    }

    public void onAdLoaded(AdSize adsize)
    {
        if (resizeAdOnLoad && viewContainer != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = viewContainer.getLayoutParams();
            Context context = viewContainer.getContext();
            layoutparams.width = adsize.getWidthInPixels(context);
            layoutparams.height = adsize.getHeightInPixels(context);
        }
        if (showOnLoad)
        {
            setAdVisibility(0);
        }
    }

    public void pause()
    {
        adGenerator.pause();
    }

    public void recordImpression()
    {
        adGenerator.recordImpression();
    }

    public void refreshAd(AdRefreshEvent adrefreshevent)
    {
        adGenerator.refreshAd(adrefreshevent);
    }

    public void resume()
    {
        adGenerator.resume();
    }

    public void setAdConfiguration(AdConfigUnit adconfigunit)
    {
        adGenerator.setAdConfiguration(adconfigunit);
    }

    public void setAdSlotName(String s)
    {
        adSlotName = s;
        boolean flag;
        if (adSlotName != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        shouldShow = flag;
        switch (_cls1..SwitchMap.com.weather.ads2.ui.DfpAd.InitializeState[initializeState.ordinal()])
        {
        default:
            initializeAd();
            return;

        case 1: // '\001'
            initializeState = InitializeState.AD_SLOT;
            break;
        }
    }

    public void setSingleUseAdParameters(Map map)
    {
        adGenerator.setSingleUseAdParameters(map);
    }

    public void showAdOnLoad()
    {
        showOnLoad = true;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DfpAd{initializeState=").append(initializeState).append(", resizeAdOnLoad=").append(resizeAdOnLoad).append(", adSlotName='").append(adSlotName).append('\'').append(", shouldShow=").append(shouldShow).append(", adGenerator=").append(adGenerator).append(", showOnLoad=").append(showOnLoad).append('}').toString();
    }
}
