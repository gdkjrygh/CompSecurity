// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralTag;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            TropicalOutlookDetails

class this._cls0
    implements android.widget.pExpandListener
{

    final TropicalOutlookDetails this$0;

    public void onGroupExpand(int i)
    {
        localyticsHandler.getTropicalOutlookSummaryRecorder().incrementValue(HurricaneCentralTag.OUTLOOKS_EXPANDED);
    }

    ()
    {
        this$0 = TropicalOutlookDetails.this;
        super();
    }
}
