// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.ups;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.base.Ticker;
import com.google.common.collect.Iterables;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.dal2.ups.Demographics;
import java.util.Collection;

// Referenced classes of package com.weather.commons.analytics.ups:
//            LocalyticsUpsTag, LocalyticsUpsAccountProvider, LocalyticsUpsAddressTypes

public class LocalyticsUpsSignupSummaryRecorder extends LocalyticsRecorder
{

    public LocalyticsUpsSignupSummaryRecorder()
    {
        this(Ticker.systemTicker());
    }

    LocalyticsUpsSignupSummaryRecorder(Ticker ticker)
    {
        super(ticker);
        putValueIfAbsent(LocalyticsUpsTag.COMPLETED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
    }

    public void pauseTime()
    {
        pauseStopwatch(LocalyticsUpsTag.TIME_SPENT);
    }

    public void recordAccountCreated(Demographics demographics, LocalyticsUpsAccountProvider localyticsupsaccountprovider)
    {
        putValueIfAbsent(LocalyticsUpsTag.METHOD, localyticsupsaccountprovider.getAttributeValue());
        putValue(LocalyticsUpsTag.COMPLETED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        localyticsupsaccountprovider = LocalyticsUpsTag.PROVIDED_GENDER;
        if (Strings.isNullOrEmpty(demographics.getGender()))
        {
            demographics = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        } else
        {
            demographics = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        }
        putValueIfAbsent(localyticsupsaccountprovider, demographics);
    }

    public void recordAccountDeleted(LocalyticsUpsAccountProvider localyticsupsaccountprovider)
    {
        putValueIfAbsent(LocalyticsUpsTag.METHOD, localyticsupsaccountprovider.getAttributeValue());
        putValue(LocalyticsUpsTag.COMPLETED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    public void recordAttemptStarted()
    {
        incrementValue(LocalyticsUpsTag.ATTEMPTS);
    }

    public void recordCreationProcessStarted()
    {
        initIncrementalValue(LocalyticsUpsTag.ATTEMPTS);
        startSecondsStopwatch(LocalyticsUpsTag.TIME_SPENT);
    }

    public void recordSignupComplete(Collection collection)
    {
        pauseTime();
        if (!collection.isEmpty())
        {
            putValueIfAbsent(LocalyticsUpsTag.PROVIDED_ADDRESSES, Joiner.on(',').join(Iterables.transform(collection, new Function() {

                final LocalyticsUpsSignupSummaryRecorder this$0;

                public volatile Object apply(Object obj)
                {
                    return apply((LocalyticsUpsAddressTypes)obj);
                }

                public String apply(LocalyticsUpsAddressTypes localyticsupsaddresstypes)
                {
                    if (localyticsupsaddresstypes == null)
                    {
                        return null;
                    } else
                    {
                        return localyticsupsaddresstypes.getAttributeValue();
                    }
                }

            
            {
                this$0 = LocalyticsUpsSignupSummaryRecorder.this;
                super();
            }
            })));
        }
    }

    public void resumeTime()
    {
        resumeStopwatch(LocalyticsUpsTag.TIME_SPENT);
    }
}
