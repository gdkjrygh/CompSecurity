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

class this._cls0
    implements Receiver
{

    final BreakingNewsActivity this$0;

    public void onCompletion(final BreakingNewsData result, String s)
    {
        BreakingNewsActivity.access$002(BreakingNewsActivity.this, ImmutableList.copyOf(result.getArticles()));
        runOnUiThread(new Runnable() {

            final BreakingNewsActivity._cls1 this$1;
            final BreakingNewsData val$result;

            public void run()
            {
                List list = result.getOrder();
                if (BreakingNewsActivity.access$100(this$0) < list.size())
                {
                    BreakingNewsActivity.access$202(this$0, (ArticlePojo)BreakingNewsActivity.access$000(this$0).get(((Integer)list.get(BreakingNewsActivity.access$100(this$0))).intValue()));
                    BreakingNewsActivity.access$300(this$0);
                }
            }

            
            {
                this$1 = BreakingNewsActivity._cls1.this;
                result = breakingnewsdata;
                super();
            }
        });
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

    _cls1.val.result()
    {
        this$0 = BreakingNewsActivity.this;
        super();
    }
}
