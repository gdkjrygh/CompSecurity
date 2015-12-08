// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import com.weather.ads2.ui.AdHolder;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.ui.CursorPagerAdapter;
import java.util.Date;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsActivity, NewsDetailFragment, NewsPreviewListAdapter

private class <init>
    implements android.support.v4.view.ner
{

    final NewsActivity this$0;

    private void fireNewsBeaconAndUpdateVisibleFragment()
    {
        if (NewsActivity.access$1000(NewsActivity.this) != null)
        {
            NewsActivity.access$1000(NewsActivity.this).setVisible(false);
        }
        int i = NewsActivity.access$000(NewsActivity.this).getCurrentItem();
        NewsActivity newsactivity = NewsActivity.this;
        NewsDetailFragment newsdetailfragment;
        if (i < NewsActivity.access$300(NewsActivity.this).getCount())
        {
            newsdetailfragment = (NewsDetailFragment)NewsActivity.access$300(NewsActivity.this).instantiateItem(NewsActivity.access$000(NewsActivity.this), i);
        } else
        {
            newsdetailfragment = null;
        }
        NewsActivity.access$1002(newsactivity, newsdetailfragment);
        if (NewsActivity.access$1000(NewsActivity.this) != null)
        {
            NewsActivity.access$1000(NewsActivity.this).setVisible(true);
        }
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        int j = NewsActivity.access$300(NewsActivity.this).getCount();
        boolean flag;
        if (NewsActivity.access$400(NewsActivity.this) != null)
        {
            View view = NewsActivity.access$400(NewsActivity.this);
            ArticlePojo articlepojo;
            KahunaEvents kahunaevents;
            Date date;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
        }
        if (NewsActivity.access$500(NewsActivity.this) != null)
        {
            view = NewsActivity.access$500(NewsActivity.this);
            if (i < j - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
        }
        fireNewsBeaconAndUpdateVisibleFragment();
        if (NewsActivity.access$600(NewsActivity.this))
        {
            NewsActivity.access$700(NewsActivity.this).refresh();
        }
        NewsActivity.access$602(NewsActivity.this, true);
        if (NewsActivity.access$800(NewsActivity.this) != null)
        {
            NewsActivity.access$800(NewsActivity.this).setSelectedIndex(Integer.valueOf(i));
        }
        if (NewsActivity.access$900(NewsActivity.this) != null)
        {
            NewsActivity.access$900(NewsActivity.this).setText(getString(com.weather.commons.istener.this._fld0, new Object[] {
                Integer.valueOf(i + 1), Integer.valueOf(j)
            }));
        }
        if (NewsActivity.access$1000(NewsActivity.this) != null)
        {
            articlepojo = NewsActivity.access$1000(NewsActivity.this).getArticle();
            if (articlepojo != null)
            {
                kahunaevents = KahunaEvents.getInstance();
                date = new Date();
                String s;
                String s1;
                if (articlepojo.url != null)
                {
                    s = articlepojo.url;
                } else
                {
                    s = "";
                }
                if (articlepojo.teaserTitle != null)
                {
                    s1 = articlepojo.teaserTitle;
                } else
                {
                    s1 = "";
                }
                kahunaevents.readNews(date, "", s, s1);
            }
        }
    }

    private A()
    {
        this$0 = NewsActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
