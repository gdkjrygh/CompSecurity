// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import com.google.common.collect.ImmutableList;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.news.provider.BreakingNewsData;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;

// Referenced classes of package com.weather.commons.news.ui:
//            BreakingNewsActivity

class val.result
    implements Runnable
{

    final is._cls0 this$1;
    final BreakingNewsData val$result;

    public void run()
    {
        List list = val$result.getOrder();
        if (BreakingNewsActivity.access$100(_fld0) < list.size())
        {
            BreakingNewsActivity.access$202(_fld0, (ArticlePojo)BreakingNewsActivity.access$000(_fld0).get(((Integer)list.get(BreakingNewsActivity.access$100(_fld0))).intValue()));
            BreakingNewsActivity.access$300(_fld0);
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$result = BreakingNewsData.this;
        super();
    }

    // Unreferenced inner class com/weather/commons/news/ui/BreakingNewsActivity$1

/* anonymous class */
    class BreakingNewsActivity._cls1
        implements Receiver
    {

        final BreakingNewsActivity this$0;

        public void onCompletion(BreakingNewsData breakingnewsdata, String s)
        {
            BreakingNewsActivity.access$002(BreakingNewsActivity.this, ImmutableList.copyOf(breakingnewsdata.getArticles()));
            runOnUiThread(breakingnewsdata. new BreakingNewsActivity._cls1._cls1());
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((BreakingNewsData)obj, (String)obj1);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (String)obj);
        }

        public void onError(Throwable throwable, String s)
        {
            LogUtil.e("BreakingNewsActivity", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("Error fetching breaking news article. Data returned:").append(s).toString(), new Object[0]);
        }

            
            {
                this$0 = BreakingNewsActivity.this;
                super();
            }
    }

}
