// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.content.Context;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.share.ShareSimpleUrlSupport;
import com.weather.commons.share.ShareableUrl;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsActivity

class port extends ShareSimpleUrlSupport
{

    final NewsActivity this$0;

    public void fireBeacon(ShareableUrl shareableurl)
    {
        EnumMap enummap = new EnumMap(com/weather/beacons/targeting/BeaconTargetingParam);
        enummap.put(BeaconTargetingParam.NEWS_ARTICLE, shareableurl.getTitle());
        Analytics.trackAction(getShareBeaconResourceId(), enummap);
    }

    ngParam(Context context, int i, int j, int k, int l, String s)
    {
        this$0 = NewsActivity.this;
        super(context, i, j, k, l, s);
    }
}
