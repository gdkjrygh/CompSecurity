// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import com.weather.commons.news.provider.ArticlePojo;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.news.ui:
//            BreakingNewsActivity

class this._cls0
    implements Receiver
{

    final BreakingNewsActivity this$0;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(final String result, Object obj)
    {
        runOnUiThread(new Runnable() {

            final BreakingNewsActivity._cls2 this$1;
            final String val$result;

            public void run()
            {
                try
                {
                    BreakingNewsActivity.access$202(this$0, ArticlePojo.fromJson(result));
                    BreakingNewsActivity.access$300(this$0);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    LogUtil.e("BreakingNewsActivity", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("error parsing JSON:").append(jsonexception).toString(), new Object[0]);
                }
            }

            
            {
                this$1 = BreakingNewsActivity._cls2.this;
                result = s;
                super();
            }
        });
    }

    public void onError(Throwable throwable, Object obj)
    {
        LogUtil.e("BreakingNewsActivity", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("error fetching articles:").append(obj).toString(), new Object[0]);
    }

    _cls1.val.result()
    {
        this$0 = BreakingNewsActivity.this;
        super();
    }
}
