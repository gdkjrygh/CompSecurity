// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.news.provider.Assets;
import com.weather.commons.news.provider.SlideShow;
import com.weather.commons.news.provider.SlideShowFetcher;
import com.weather.commons.news.provider.Variants;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public class SlideShowView extends RelativeLayout
{
    private class BreakingNewsViewPagerAdapter extends PagerAdapter
    {

        public static final char NEW_LINE = 10;
        private List assets;
        private final Handler handler;
        final SlideShowView this$0;

        private void setSlideShowImage(ViewGroup viewgroup, ViewGroup viewgroup1, Assets assets1)
        {
            ImageView imageview = (ImageView)viewgroup.findViewById(com.weather.commons.R.id.news_image_icon);
            viewgroup = (ProgressBar)viewgroup.findViewById(com.weather.commons.R.id.progressBar);
            viewgroup.setVisibility(0);
            if (assets1.variants != null)
            {
                assets1 = assets1.variants._11;
                if (URLUtil.isValidUrl(assets1))
                {
                    Picasso.with(viewgroup1.getContext()).load(assets1).skipMemoryCache().config(android.graphics.Bitmap.Config.RGB_565).fit().centerCrop().into(imageview, viewgroup. new Callback() {

                        final BreakingNewsViewPagerAdapter this$1;
                        final ProgressBar val$progressBar;

                        public void onError()
                        {
                            LogUtil.e("SlideShowView", LoggingMetaTags.TWC_BREAKING_NEWS, "Error with picasso callback listener", new Object[0]);
                        }

                        public void onSuccess()
                        {
                            progressBar.setVisibility(8);
                        }

            
            {
                this$1 = final_breakingnewsviewpageradapter;
                progressBar = ProgressBar.this;
                super();
            }
                    });
                }
            }
        }

        public void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            if (obj instanceof ViewGroup)
            {
                viewgroup.removeView((ViewGroup)obj);
            }
        }

        public int getCount()
        {
            if (assets == null)
            {
                return 0;
            } else
            {
                return assets.size();
            }
        }

        public Object instantiateItem(ViewGroup viewgroup, int i)
        {
            ViewGroup viewgroup1 = (ViewGroup)activity.getLayoutInflater().inflate(com.weather.commons.R.layout.fragment_breaking_news, viewgroup, false);
            viewgroup.addView(viewgroup1);
            viewgroup1.setTag(Integer.valueOf(i));
            if (assets == null)
            {
                return viewgroup1;
            }
            Assets assets1 = (Assets)assets.get(i);
            final TextView articleTitle = (TextView)viewgroup1.findViewById(com.weather.commons.R.id.news_viewpager_title_collapsed);
            articleTitle.setText(assets1.caption);
            final TextView collapse = (TextView)viewgroup1.findViewById(com.weather.commons.R.id.collapse);
            final TextView seeMore = (TextView)viewgroup1.findViewById(com.weather.commons.R.id.see_more);
            final String expandText = getResources().getString(com.weather.commons.R.string.see_more);
            handler.post(assets1. new Runnable() {

                final BreakingNewsViewPagerAdapter this$1;
                final TextView val$articleTitle;
                final Assets val$assetItem;
                final TextView val$collapse;
                final String val$expandText;
                final TextView val$seeMore;

                public void run()
                {
                    SlideShowView slideshowview = _fld0;
                    boolean flag;
                    if (seeMore.getVisibility() == 8)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    slideshowview.isExpanded = flag;
                    if (articleTitle.getLineCount() > 2)
                    {
                        CharSequence charsequence = articleTitle.getText().subSequence(0, articleTitle.getLayout().getLineEnd(1) - (expandText.length() + 1));
                        articleTitle.setText(charsequence);
                        seeMore.setVisibility(0);
                        collapse.setVisibility(8);
                        articleTitle.setOnClickListener(new android.view.View.OnClickListener() {

                            final BreakingNewsViewPagerAdapter._cls1 this$2;

                            public void onClick(View view)
                            {
                                handler.post(new Runnable() {

                                    final BreakingNewsViewPagerAdapter._cls1._cls1 this$3;

                                    public void run()
                                    {
                                        SlideShowView slideshowview = _fld0;
                                        boolean flag;
                                        if (seeMore.getVisibility() == 8)
                                        {
                                            flag = true;
                                        } else
                                        {
                                            flag = false;
                                        }
                                        slideshowview.isExpanded = flag;
                                        if (isExpanded)
                                        {
                                            CharSequence charsequence = articleTitle.getText().subSequence(0, (articleTitle.getLayout().getLineEnd(1) - expandText.length()) + 1);
                                            articleTitle.setText(charsequence);
                                            seeMore.setVisibility(0);
                                            collapse.setVisibility(8);
                                            return;
                                        } else
                                        {
                                            articleTitle.setText(String.format("%s%s", new Object[] {
                                                assetItem.caption, Character.valueOf('\n')
                                            }));
                                            seeMore.setVisibility(8);
                                            collapse.setVisibility(0);
                                            return;
                                        }
                                    }

            
            {
                this$3 = BreakingNewsViewPagerAdapter._cls1._cls1.this;
                super();
            }
                                });
                                view = _fld0;
                                boolean flag;
                                if (!isExpanded)
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                view.isExpanded = flag;
                            }

            
            {
                this$2 = BreakingNewsViewPagerAdapter._cls1.this;
                super();
            }
                        });
                    }
                }

            
            {
                this$1 = final_breakingnewsviewpageradapter;
                seeMore = textview;
                articleTitle = textview1;
                expandText = s;
                collapse = textview2;
                assetItem = Assets.this;
                super();
            }
            });
            articleTitle = SlideShowView.this;
            boolean flag;
            if (!isExpanded)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            articleTitle.isExpanded = flag;
            setSlideShowImage(viewgroup1, viewgroup, assets1);
            return viewgroup1;
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return view == obj;
        }

        public void setSlideShow(List list)
        {
            if (list != null)
            {
                assets = list;
            }
        }


        private BreakingNewsViewPagerAdapter()
        {
            this$0 = SlideShowView.this;
            super();
            handler = new Handler();
        }

    }

    private class PageChangeListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        final SlideShowView this$0;

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
        }

        public void onPageSelected(int i)
        {
            int j = breakingNewsViewPagerAdapter.getCount();
            if (previousArticle != null)
            {
                if (i > 0)
                {
                    previousArticle.setVisibility(0);
                } else
                {
                    previousArticle.setVisibility(8);
                }
            }
            if (nextArticle != null)
            {
                if (i < j - 1)
                {
                    nextArticle.setVisibility(0);
                } else
                {
                    nextArticle.setVisibility(8);
                }
            }
            if (slidePosition != null)
            {
                slidePosition.setText(activity.getString(com.weather.commons.R.string.news_page_position, new Object[] {
                    Integer.valueOf(i + 1), Integer.valueOf(j)
                }));
            }
            int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        private PageChangeListener()
        {
            this$0 = SlideShowView.this;
            super();
        }

    }


    private static final String TAG = "SlideShowView";
    private Activity activity;
    private BreakingNewsViewPagerAdapter breakingNewsViewPagerAdapter;
    private boolean isExpanded;
    private int localyticsSlideShowPhotosViewedCount;
    private ImageView nextArticle;
    private ImageView previousArticle;
    private TextView slidePosition;
    private SlideShow slideShow;
    private ViewPager viewPager;

    public SlideShowView(Context context)
    {
        RelativeLayout(context);
    }

    public SlideShowView(Context context, AttributeSet attributeset)
    {
        RelativeLayout(context, attributeset);
    }

    public SlideShowView(Context context, AttributeSet attributeset, int i)
    {
        RelativeLayout(context, attributeset, i);
    }

    private void goToPreviousImage()
    {
        if (viewPager.getCurrentItem() > 0)
        {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1, true);
        }
    }

    public void goToNextImage()
    {
        if (viewPager.getCurrentItem() < viewPager.getAdapter().getCount() - 1)
        {
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
        }
    }

    public void recordSlideShowLocalytics()
    {
        HashMap hashmap = new HashMap();
        hashmap.put(com.weather.commons.analytics.LocalyticsTags.ScreenName.MODULE, com.weather.commons.analytics.LocalyticsTags.ScreenName.BREAKING_NOW_MODULE.getName());
        hashmap.put(com.weather.commons.analytics.LocalyticsTags.ScreenName.SLIDESHOW_PHOTOS_VIEWED, String.valueOf(localyticsSlideShowPhotosViewedCount));
        com.weather.commons.analytics.LocalyticsTags.ScreenName screenname = com.weather.commons.analytics.LocalyticsTags.ScreenName.SLIDESHOW_PHOTOS_TITLE;
        String s;
        if (slideShow != null)
        {
            s = slideShow.title;
        } else
        {
            s = "";
        }
        hashmap.put(screenname, s);
        screenname = com.weather.commons.analytics.LocalyticsTags.ScreenName.SLIDESHOW_PHOTOS_ASSET_ID;
        if (slideShow != null)
        {
            s = slideShow.id;
        } else
        {
            s = "";
        }
        hashmap.put(screenname, s);
        LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.PHOTO_GALLERY, hashmap);
    }

    public void setData(final Activity activity, String s)
    {
        this.activity = activity;
        viewPager = (ViewPager)findViewById(com.weather.commons.R.id.breaking_news_article_slideshow);
        breakingNewsViewPagerAdapter = new BreakingNewsViewPagerAdapter();
        if (s != null)
        {
            (new SlideShowFetcher()).asyncFetch(s, new Receiver() {

                final SlideShowView this$0;
                final Activity val$activity;

                public volatile void onCompletion(Object obj, Object obj1)
                {
                    onCompletion((String)obj, obj1);
                }

                public void onCompletion(String s1, Object obj)
                {
                    activity.runOnUiThread(s1. new Runnable() {

                        final _cls1 this$1;
                        final String val$result;

                        public void run()
                        {
                            Object obj;
                            BreakingNewsViewPagerAdapter breakingnewsviewpageradapter;
                            try
                            {
                                slideShow = SlideShow.fromJson(result);
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                LogUtil.e("SlideShowView", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("exception parsing slideshow:").append(obj).toString(), new Object[0]);
                            }
                            breakingnewsviewpageradapter = breakingNewsViewPagerAdapter;
                            if (slideShow != null)
                            {
                                obj = slideShow.assets;
                            } else
                            {
                                obj = null;
                            }
                            breakingnewsviewpageradapter.setSlideShow(((List) (obj)));
                            viewPager.setAdapter(breakingNewsViewPagerAdapter);
                            obj = new PageChangeListener();
                            viewPager.setCurrentItem(0);
                            ((android.support.v4.view.ViewPager.OnPageChangeListener) (obj)).onPageSelected(0);
                            viewPager.setOnPageChangeListener(((android.support.v4.view.ViewPager.OnPageChangeListener) (obj)));
                        }

            
            {
                this$1 = final__pcls1;
                result = String.this;
                super();
            }
                    });
                }

                public void onError(Throwable throwable, Object obj)
                {
                    LogUtil.e("SlideShowView", LoggingMetaTags.TWC_BREAKING_NEWS, (new StringBuilder()).append("exception fetching slideshow data:").append(throwable.getMessage()).toString(), new Object[0]);
                }

            
            {
                this$0 = SlideShowView.this;
                activity = activity1;
                super();
            }
            });
        }
        previousArticle = (ImageView)findViewById(com.weather.commons.R.id.news_previous_slide);
        previousArticle.setOnClickListener(new android.view.View.OnClickListener() {

            final SlideShowView this$0;

            public void onClick(View view)
            {
                goToPreviousImage();
            }

            
            {
                this$0 = SlideShowView.this;
                super();
            }
        });
        nextArticle = (ImageView)findViewById(com.weather.commons.R.id.news_next_slide);
        nextArticle.setOnClickListener(new android.view.View.OnClickListener() {

            final SlideShowView this$0;

            public void onClick(View view)
            {
                goToNextImage();
            }

            
            {
                this$0 = SlideShowView.this;
                super();
            }
        });
        slidePosition = (TextView)findViewById(com.weather.commons.R.id.slide_position);
    }




/*
    static SlideShow access$102(SlideShowView slideshowview, SlideShow slideshow)
    {
        slideshowview.slideShow = slideshow;
        return slideshow;
    }

*/



/*
    static int access$1208(SlideShowView slideshowview)
    {
        int i = slideshowview.localyticsSlideShowPhotosViewedCount;
        slideshowview.localyticsSlideShowPhotosViewedCount = i + 1;
        return i;
    }

*/







/*
    static boolean access$702(SlideShowView slideshowview, boolean flag)
    {
        slideshowview.isExpanded = flag;
        return flag;
    }

*/

}
