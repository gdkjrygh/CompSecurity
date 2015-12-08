// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsContentBuilder

class val.result
    implements Runnable
{

    final l.image this$1;
    final String val$result;

    public void run()
    {
        Picasso.with(NewsContentBuilder.access$000(_fld0).getContext()).load(val$result).config(android.graphics.ig).skipMemoryCache().fit().centerInside().into(image);
    }

    l.image()
    {
        this$1 = final_image;
        val$result = String.this;
        super();
    }

    // Unreferenced inner class com/weather/commons/news/ui/NewsContentBuilder$1

/* anonymous class */
    class NewsContentBuilder._cls1
        implements Receiver
    {

        final NewsContentBuilder this$0;
        final ImageView val$image;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((String)obj, (String)obj1);
        }

        public void onCompletion(String s, String s1)
        {
            NewsContentBuilder.access$100(NewsContentBuilder.this).runOnUiThread(s. new NewsContentBuilder._cls1._cls1());
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (String)obj);
        }

        public void onError(Throwable throwable, String s)
        {
            LogUtil.e("BreakingNewsContentBuilder", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("Error fetching images from asset id of wx nodes article. Data returned:").append(s).toString(), new Object[0]);
        }

            
            {
                this$0 = final_newscontentbuilder;
                image = ImageView.this;
                super();
            }
    }

}
