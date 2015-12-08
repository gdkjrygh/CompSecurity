// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import com.weather.commons.news.provider.SlideShow;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.news.ui:
//            SlideShowView

class val.activity
    implements Receiver
{

    final SlideShowView this$0;
    final Activity val$activity;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(final String result, Object obj)
    {
        val$activity.runOnUiThread(new Runnable() {

            final SlideShowView._cls1 this$1;
            final String val$result;

            public void run()
            {
                Object obj1;
                SlideShowView.BreakingNewsViewPagerAdapter breakingnewsviewpageradapter;
                try
                {
                    SlideShowView.access$102(this$0, SlideShow.fromJson(result));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    LogUtil.e("SlideShowView", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("exception parsing slideshow:").append(obj1).toString(), new Object[0]);
                }
                breakingnewsviewpageradapter = SlideShowView.access$200(this$0);
                if (SlideShowView.access$100(this$0) != null)
                {
                    obj1 = SlideShowView.access$100(this$0).assets;
                } else
                {
                    obj1 = null;
                }
                breakingnewsviewpageradapter.setSlideShow(((java.util.List) (obj1)));
                SlideShowView.access$300(this$0).setAdapter(SlideShowView.access$200(this$0));
                obj1 = new SlideShowView.PageChangeListener(this$0, null);
                SlideShowView.access$300(this$0).setCurrentItem(0);
                ((android.support.v4.view.ViewPager.OnPageChangeListener) (obj1)).onPageSelected(0);
                SlideShowView.access$300(this$0).setOnPageChangeListener(((android.support.v4.view.ViewPager.OnPageChangeListener) (obj1)));
            }

            
            {
                this$1 = SlideShowView._cls1.this;
                result = s;
                super();
            }
        });
    }

    public void onError(Throwable throwable, Object obj)
    {
        LogUtil.e("SlideShowView", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("exception fetching slideshow data:").append(throwable.getMessage()).toString(), new Object[0]);
    }

    _cls1.val.result()
    {
        this$0 = final_slideshowview;
        val$activity = Activity.this;
        super();
    }
}
