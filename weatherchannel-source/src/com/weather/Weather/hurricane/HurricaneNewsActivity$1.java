// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.content.Context;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.share.ShareSimpleUrlSupport;
import com.weather.commons.share.ShareableUrl;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.Weather.hurricane:
//            HurricaneNewsActivity

class  extends ShareSimpleUrlSupport
{

    final HurricaneNewsActivity this$0;

    public void fireBeacon(ShareableUrl shareableurl)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(com.weather.commons.analytics.e.SHARE_ARTICLE, shareableurl.getTitle());
        com.weather.commons.analytics.e e = com.weather.commons.analytics.e.SHARE_ARTICLE_TYPE;
        if (HurricaneNewsActivity.access$000(HurricaneNewsActivity.this) == null || HurricaneNewsActivity.access$000(HurricaneNewsActivity.this).type == null)
        {
            shareableurl = "";
        } else
        {
            shareableurl = HurricaneNewsActivity.access$000(HurricaneNewsActivity.this).type;
        }
        hashmap.put(e, shareableurl);
        localyticsHandler.tagEvent(LocalyticsEvent.SHARE, hashmap);
    }

    e(Context context, int i, int j, int k, int l, String s)
    {
        this$0 = HurricaneNewsActivity.this;
        super(context, i, j, k, l, s);
    }
}
