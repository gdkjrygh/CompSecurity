// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.lotame;

import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.ads2.targeting.TargetingDataConnection;
import com.weather.ads2.targeting.UserIdQuerier;
import com.weather.ads2.targeting.UserIdQueriers;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.ads2.lotame:
//            LotamePrefs, LotameResponse

public final class LotameConnectionV2 extends TargetingDataConnection
{

    private static final long AUDIENCE_STALE_TIME_IN_MILLIS;
    private static final int EXPIRATION_IN_MINUTES = 0;
    private static final String TAG = "LotameConnectionV2";
    public static final int TPID_STALE_TIME_IN_DAYS = 14;
    private static final long TPID_STALE_TIME_IN_MILLIS;
    private static final String URL_PATTERN = "http://ad.crwdcntrl.net/5/c=2215/tp=TWCN/mid=%s/e=app/pe=y";
    private final Prefs prefs;
    private final TimeProvider timeProvider;
    private final UserIdQuerier userIdQuerier;

    public LotameConnectionV2(TwcBus twcbus)
    {
        this(LotamePrefs.getInstance(), SystemTimeProvider.getInstance(), null, twcbus, UserIdQueriers.getQuerier());
    }

    LotameConnectionV2(Prefs prefs1, TimeProvider timeprovider, Ticker ticker, TwcBus twcbus, UserIdQuerier useridquerier)
    {
        super(0, ticker, twcbus, "LotameConnectionV2");
        prefs = prefs1;
        timeProvider = (TimeProvider)Preconditions.checkNotNull(timeprovider);
        userIdQuerier = (UserIdQuerier)Preconditions.checkNotNull(useridquerier);
    }

    protected String getUrl()
    {
        String s = userIdQuerier.getId();
        if (s == null)
        {
            return null;
        } else
        {
            return String.format("http://ad.crwdcntrl.net/5/c=2215/tp=TWCN/mid=%s/e=app/pe=y", new Object[] {
                s
            });
        }
    }

    protected Map loadPersistedValues()
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        if (prefs.getLong(LotamePrefs.Keys.AUDIENCE_EXPIRES_AT, 0L) < timeProvider.currentTimeMillis())
        {
            LogUtil.d("LotameConnectionV2", LoggingMetaTags.TWC_AD, "Unable to make Lotame request or access tolerably stale data", new Object[0]);
            builder.put(AdTargetingParam.LOTAME, "nl");
        } else
        {
            LogUtil.d("LotameConnectionV2", LoggingMetaTags.TWC_AD, "Using tolerably stale data for Lotame", new Object[0]);
            builder.put(AdTargetingParam.LOTAME, prefs.getString(LotamePrefs.Keys.AUDIENCE_VALUE, "nl"));
        }
        if (prefs.getLong(LotamePrefs.Keys.TPID_EXPIRES_AT, 0L) < timeProvider.currentTimeMillis())
        {
            LogUtil.d("LotameConnectionV2", LoggingMetaTags.TWC_AD, "Unable to make Lotame request or access tolerably stale data", new Object[0]);
            builder.put(AdTargetingParam.TPID, "nl");
        } else
        {
            LogUtil.d("LotameConnectionV2", LoggingMetaTags.TWC_AD, "Using tolerably stale data for tpid", new Object[0]);
            builder.put(AdTargetingParam.TPID, prefs.getString(LotamePrefs.Keys.TPID_VALUE, "nl"));
        }
        if (prefs.getLong(LotamePrefs.Keys.LPID_EXPIRES_AT, 0L) < timeProvider.currentTimeMillis())
        {
            LogUtil.d("LotameConnectionV2", LoggingMetaTags.TWC_AD, "Unable to make Lotame request or access tolerably stale data", new Object[0]);
            builder.put(AdTargetingParam.LPID, "nl");
        } else
        {
            LogUtil.d("LotameConnectionV2", LoggingMetaTags.TWC_AD, "Using tolerably stale data for lpid", new Object[0]);
            builder.put(AdTargetingParam.LPID, prefs.getString(LotamePrefs.Keys.LPID_VALUE, "nl"));
        }
        return builder.build();
    }

    protected Map parseResponse(String s)
    {
        Object obj = new LotameResponse(s);
        s = ((LotameResponse) (obj)).getAudienceIds();
        prefs.putString(LotamePrefs.Keys.AUDIENCE_VALUE, s);
        prefs.putLong(LotamePrefs.Keys.AUDIENCE_EXPIRES_AT, timeProvider.currentTimeMillis() + AUDIENCE_STALE_TIME_IN_MILLIS);
        String s1 = ((LotameResponse) (obj)).getTpid();
        obj = ((LotameResponse) (obj)).getLpid();
        prefs.putString(LotamePrefs.Keys.TPID_VALUE, s1);
        prefs.putString(LotamePrefs.Keys.LPID_VALUE, ((String) (obj)));
        prefs.putLong(LotamePrefs.Keys.TPID_EXPIRES_AT, timeProvider.currentTimeMillis() + TPID_STALE_TIME_IN_MILLIS);
        prefs.putLong(LotamePrefs.Keys.LPID_EXPIRES_AT, timeProvider.currentTimeMillis() + TPID_STALE_TIME_IN_MILLIS);
        return ImmutableMap.of(AdTargetingParam.LOTAME, s, AdTargetingParam.TPID, s1, AdTargetingParam.LPID, obj);
    }

    public void start()
    {
        super.start();
        refresh(false);
    }

    static 
    {
        AUDIENCE_STALE_TIME_IN_MILLIS = TimeUnit.DAYS.toMillis(1L);
        TPID_STALE_TIME_IN_MILLIS = TimeUnit.DAYS.toMillis(14L);
    }
}
