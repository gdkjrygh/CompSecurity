// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.content.Context;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.share.ShareSimpleUrlSupport;
import com.weather.commons.share.ShareableUrl;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.news.ui:
//            BreakingNewsActivity

class it> extends ShareSimpleUrlSupport
{

    final BreakingNewsActivity this$0;

    public void fireBeacon(ShareableUrl shareableurl)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(com.weather.commons.analytics.me.SHARE_ARTICLE, shareableurl.getTitle());
        com.weather.commons.analytics.me me = com.weather.commons.analytics.me.SHARE_ARTICLE_TYPE;
        if (BreakingNewsActivity.access$200(BreakingNewsActivity.this) == null)
        {
            shareableurl = "";
        } else
        {
            shareableurl = BreakingNewsActivity.access$200(BreakingNewsActivity.this).type;
        }
        hashmap.put(me, shareableurl);
        hashmap.put(com.weather.commons.analytics.me.MODULE, com.weather.commons.analytics.me.BREAKING_NOW_MODULE.getName());
        LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.SHARE, hashmap);
    }

    Name(Context context, int i, int j, int k, int l, String s)
    {
        this$0 = BreakingNewsActivity.this;
        super(context, i, j, k, l, s);
    }
}
