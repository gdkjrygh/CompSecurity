// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.ups;

import com.google.common.base.Function;

// Referenced classes of package com.weather.commons.analytics.ups:
//            LocalyticsUpsSignupSummaryRecorder, LocalyticsUpsAddressTypes

class this._cls0
    implements Function
{

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

    ()
    {
        this$0 = LocalyticsUpsSignupSummaryRecorder.this;
        super();
    }
}
