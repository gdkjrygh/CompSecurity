// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.lotame;

import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.targeting.DemographicsParameters;
import com.weather.ads2.targeting.TargetingDataConnection;
import com.weather.ads2.targeting.UserIdQuerier;
import com.weather.ads2.targeting.UserIdQueriers;
import com.weather.dal2.cache.MemCache;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.system.TwcBus;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;
import com.weather.util.prefs.Prefs;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.ads2.lotame:
//            LotamePrefs

public final class LotameConnectionV1 extends TargetingDataConnection
{

    private static final int EXPIRATION_IN_MINUTES = 0;
    private static final long MIN_INTERVAL;
    private static final String TAG = "LotameConnectionV1";
    private static final String URL_PATTERN = "http://bcp.crwdcntrl.net/5/c=7053/tp=TWCN/mid=%s/dt=GAID/e=app";
    private final Prefs prefs;
    private final UserIdQuerier userIdQuerier;

    public LotameConnectionV1(TwcBus twcbus)
    {
        this(LotamePrefs.getInstance(), null, twcbus, UserIdQueriers.getQuerier());
    }

    LotameConnectionV1(Prefs prefs1, Ticker ticker, TwcBus twcbus, UserIdQuerier useridquerier)
    {
        super(0, ticker, twcbus, "LotameConnectionV1");
        userIdQuerier = (UserIdQuerier)Preconditions.checkNotNull(useridquerier);
        prefs = prefs1;
    }

    private String appendAge(String s, Demographics demographics)
    {
        String s1 = DemographicsParameters.extractAge(demographics);
        demographics = s;
        if (!"nl".equals(s1))
        {
            demographics = (new StringBuilder()).append(s).append("/seg=a_").append(s1).toString();
        }
        return demographics;
    }

    private String appendGender(String s, Demographics demographics)
    {
        String s1 = DemographicsParameters.extractGender(demographics);
        demographics = s;
        if (!"nl".equals(s1))
        {
            demographics = (new StringBuilder()).append(s).append("/seg=").append(s1).toString();
        }
        return demographics;
    }

    protected boolean allowRefresh()
    {
        return System.currentTimeMillis() - prefs.getLong(LotamePrefs.Keys.LAST_V1_UPDATE, 0L) > MIN_INTERVAL;
    }

    protected String getUrl()
    {
        String s = userIdQuerier.getId();
        if (s == null)
        {
            return null;
        } else
        {
            s = String.format("http://bcp.crwdcntrl.net/5/c=7053/tp=TWCN/mid=%s/dt=GAID/e=app", new Object[] {
                s
            });
            Demographics demographics = BasicDemographicsStorage.getInstance().getDemographics();
            return appendGender(appendAge(s, demographics), demographics);
        }
    }

    protected Map loadPersistedValues()
    {
        return ImmutableMap.builder().build();
    }

    protected Map parseResponse(String s)
    {
        return ImmutableMap.of();
    }

    public void refresh(boolean flag)
    {
        if (allowRefresh())
        {
            cache.asyncFetch("key", flag, new Receiver() , null);
        }
    }

    public void start()
    {
        start();
        refresh(false);
    }

    static 
    {
        MIN_INTERVAL = TimeUnit.HOURS.toMillis(24L);
    }


}
