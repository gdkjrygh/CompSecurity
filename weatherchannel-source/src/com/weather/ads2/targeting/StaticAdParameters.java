// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.util.AdUtils;
import com.weather.ads2.util.LaunchPartner;
import com.weather.ads2.util.Partner;
import com.weather.ads2.util.PreloadPartner;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.Map;

// Referenced classes of package com.weather.ads2.targeting:
//            UserIdQueriers, UserIdQuerier, AdTargetingParam, AdTargetingChange

final class StaticAdParameters
{

    private static final String ANDROID_STANDARD = "androidstandard_";
    private static final String BURDA_TEST_AD = "demoads";
    private static final String TAG = "StaticAdParameters";
    private final TwcBus bus;
    private final LaunchPartner launchPartner;
    private final Partner partner;
    private final PreloadPartner preloadPartner;
    private final UserIdQuerier userIdQuerier;

    StaticAdParameters()
    {
        this(DataAccessLayer.BUS, UserIdQueriers.getQuerier(), new Partner(), new PreloadPartner(), LaunchPartner.getInstance());
    }

    StaticAdParameters(TwcBus twcbus, UserIdQuerier useridquerier, Partner partner1, PreloadPartner preloadpartner, LaunchPartner launchpartner)
    {
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
        userIdQuerier = (UserIdQuerier)Preconditions.checkNotNull(useridquerier);
        partner = (Partner)Preconditions.checkNotNull(partner1);
        preloadPartner = (PreloadPartner)Preconditions.checkNotNull(preloadpartner);
        launchPartner = (LaunchPartner)Preconditions.checkNotNull(launchpartner);
    }

    private String getAid()
    {
        String s1 = userIdQuerier.getObfuscatedId();
        String s = s1;
        if (s1 == null)
        {
            s = "nl";
        }
        return s;
    }

    private Map getInitialParameters()
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put(AdTargetingParam.RMID, AdUtils.getSha1AndroidId());
        builder.put(AdTargetingParam.LAYER, "nl");
        builder.put(AdTargetingParam.PARTNER, partner.getAdPartner());
        builder.put(AdTargetingParam.AID, getAid());
        builder.put(AdTargetingParam.ADID, getSha1Aid());
        if (LocaleUtil.isDeviceInGermany())
        {
            String s1 = AdUtils.getMD5HashAdvertisingId();
            String s = s1;
            if (s1 == null)
            {
                s = "nl";
            }
            builder.put(AdTargetingParam.ATFID, s);
            try
            {
                Object obj = AbstractTwcApplication.getRootContext();
                PackageInfo packageinfo = ((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 0);
                builder.put(AdTargetingParam.VAPP, (new StringBuilder()).append("androidstandard_").append(packageinfo.versionName).toString());
                obj = new VersionInfoParcel(((Context) (obj)).getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, false);
                builder.put(AdTargetingParam.VSDK, ((VersionInfoParcel) (obj)).zzGG);
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                LogUtil.w("StaticAdParameters", LoggingMetaTags.TWC_AD, namenotfoundexception.getMessage(), new Object[0]);
            }
            if (TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.AD_TEST_ENABLED, false))
            {
                builder.put(AdTargetingParam.KW, "demoads");
            }
        }
        builder.put(AdTargetingParam.PRELOAD_PARTNER, preloadPartner.getPreloadPartner());
        builder.put(AdTargetingParam.LAUNCH_PARTNER, launchPartner.getLaunchPartner());
        return builder.build();
    }

    private String getSha1Aid()
    {
        String s1 = userIdQuerier.getSha1Id();
        String s = s1;
        if (s1 == null)
        {
            s = "nl";
        }
        return s;
    }

    public void handleAppEvent(AppEvent appevent)
    {
        if (appevent.getCause() == com.weather.dal2.system.AppEvent.Cause.APP_START)
        {
            AsyncTask.execute(new Runnable() {

                final StaticAdParameters this$0;

                public void run()
                {
                    bus.post(new AdTargetingChange(ImmutableMap.of(AdTargetingParam.AID, getAid(), AdTargetingParam.ADID, getSha1Aid(), AdTargetingParam.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner())));
                }

            
            {
                this$0 = StaticAdParameters.this;
                super();
            }
            });
        }
    }

    public void start()
    {
        bus.register(this);
        AsyncTask.execute(new Runnable() {

            final StaticAdParameters this$0;

            public void run()
            {
                bus.post(new AdTargetingChange(getInitialParameters()));
            }

            
            {
                this$0 = StaticAdParameters.this;
                super();
            }
        });
    }




}
