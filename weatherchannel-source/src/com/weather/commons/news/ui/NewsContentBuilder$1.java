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

class val.image
    implements Receiver
{

    final NewsContentBuilder this$0;
    final ImageView val$image;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, (String)obj1);
    }

    public void onCompletion(final String result, String s)
    {
        NewsContentBuilder.access$100(NewsContentBuilder.this).runOnUiThread(new Runnable() {

            final NewsContentBuilder._cls1 this$1;
            final String val$result;

            public void run()
            {
                Picasso.with(NewsContentBuilder.access$000(this$0).getContext()).load(result).config(android.graphics.Bitmap.Config.RGB_565).skipMemoryCache().fit().centerInside().into(image);
            }

            
            {
                this$1 = NewsContentBuilder._cls1.this;
                result = s;
                super();
            }
        });
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (String)obj);
    }

    public void onError(Throwable throwable, String s)
    {
        LogUtil.e("BreakingNewsContentBuilder", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("Error fetching images from asset id of wx nodes article. Data returned:").append(s).toString(), new Object[0]);
    }

    _cls1.val.result()
    {
        this$0 = final_newscontentbuilder;
        val$image = ImageView.this;
        super();
    }
}
