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

class val.result
    implements Runnable
{

    final S this$1;
    final String val$result;

    public void run()
    {
        try
        {
            BreakingNewsActivity.access$202(_fld0, ArticlePojo.fromJson(val$result));
            BreakingNewsActivity.access$300(_fld0);
            return;
        }
        catch (JSONException jsonexception)
        {
            LogUtil.e("BreakingNewsActivity", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("error parsing JSON:").append(jsonexception).toString(), new Object[0]);
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$result = String.this;
        super();
    }

    // Unreferenced inner class com/weather/commons/news/ui/BreakingNewsActivity$2

/* anonymous class */
    class BreakingNewsActivity._cls2
        implements Receiver
    {

        final BreakingNewsActivity this$0;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((String)obj, obj1);
        }

        public void onCompletion(String s, Object obj)
        {
            runOnUiThread(s. new BreakingNewsActivity._cls2._cls1());
        }

        public void onError(Throwable throwable, Object obj)
        {
            LogUtil.e("BreakingNewsActivity", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("error fetching articles:").append(obj).toString(), new Object[0]);
        }

            
            {
                this$0 = BreakingNewsActivity.this;
                super();
            }
    }

}
