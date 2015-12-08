// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.commons.news.provider.Assets;
import com.weather.commons.news.provider.Variants;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;

// Referenced classes of package com.weather.commons.news.ui:
//            SlideShowView

private class <init> extends PagerAdapter
{

    public static final char NEW_LINE = 10;
    private List assets;
    private final Handler handler;
    final SlideShowView this$0;

    private void setSlideShowImage(final ViewGroup progressBar, ViewGroup viewgroup, Assets assets1)
    {
        ImageView imageview = (ImageView)progressBar.findViewById(com.weather.commons.Adapter);
        progressBar = (ProgressBar)progressBar.findViewById(com.weather.commons.Adapter);
        progressBar.setVisibility(0);
        if (assets1.variants != null)
        {
            assets1 = assets1.variants._11;
            if (URLUtil.isValidUrl(assets1))
            {
                Picasso.with(viewgroup.getContext()).load(assets1).skipMemoryCache().config(android.graphics.gerAdapter).fit().centerCrop().into(imageview, new Callback() {

                    final SlideShowView.BreakingNewsViewPagerAdapter this$1;
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
                this$1 = SlideShowView.BreakingNewsViewPagerAdapter.this;
                progressBar = progressbar;
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
        ViewGroup viewgroup1 = (ViewGroup)SlideShowView.access$600(SlideShowView.this).getLayoutInflater().inflate(com.weather.commons.Adapter.this._fld0, viewgroup, false);
        viewgroup.addView(viewgroup1);
        viewgroup1.setTag(Integer.valueOf(i));
        if (assets == null)
        {
            return viewgroup1;
        }
        final Assets assetItem = (Assets)assets.get(i);
        final TextView articleTitle = (TextView)viewgroup1.findViewById(com.weather.commons.Adapter.assets);
        articleTitle.setText(assetItem.caption);
        final TextView collapse = (TextView)viewgroup1.findViewById(com.weather.commons.Adapter.assets);
        final TextView seeMore = (TextView)viewgroup1.findViewById(com.weather.commons.Adapter.assets);
        final String expandText = getResources().getString(com.weather.commons.Adapter.assets);
        handler.post(new Runnable() {

            final SlideShowView.BreakingNewsViewPagerAdapter this$1;
            final TextView val$articleTitle;
            final Assets val$assetItem;
            final TextView val$collapse;
            final String val$expandText;
            final TextView val$seeMore;

            public void run()
            {
                SlideShowView slideshowview = this$0;
                boolean flag1;
                if (seeMore.getVisibility() == 8)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                SlideShowView.access$702(slideshowview, flag1);
                if (articleTitle.getLineCount() > 2)
                {
                    CharSequence charsequence = articleTitle.getText().subSequence(0, articleTitle.getLayout().getLineEnd(1) - (expandText.length() + 1));
                    articleTitle.setText(charsequence);
                    seeMore.setVisibility(0);
                    collapse.setVisibility(8);
                    articleTitle.setOnClickListener(new android.view.View.OnClickListener() {

                        final _cls1 this$2;

                        public void onClick(View view)
                        {
                            handler.post(new Runnable() {

                                final _cls1 this$3;

                                public void run()
                                {
                                    SlideShowView slideshowview = this$0;
                                    boolean flag;
                                    if (seeMore.getVisibility() == 8)
                                    {
                                        flag = true;
                                    } else
                                    {
                                        flag = false;
                                    }
                                    SlideShowView.access$702(slideshowview, flag);
                                    if (SlideShowView.access$700(this$0))
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
                this$3 = _cls1.this;
                super();
            }
                            });
                            view = this$0;
                            boolean flag;
                            if (!SlideShowView.access$700(this$0))
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            SlideShowView.access$702(view, flag);
                        }

            
            {
                this$2 = _cls1.this;
                super();
            }
                    });
                }
            }

            
            {
                this$1 = SlideShowView.BreakingNewsViewPagerAdapter.this;
                seeMore = textview;
                articleTitle = textview1;
                expandText = s;
                collapse = textview2;
                assetItem = assets1;
                super();
            }
        });
        articleTitle = SlideShowView.this;
        boolean flag;
        if (!SlideShowView.access$700(SlideShowView.this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SlideShowView.access$702(articleTitle, flag);
        setSlideShowImage(viewgroup1, viewgroup, assetItem);
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


    private _cls2.val.progressBar()
    {
        this$0 = SlideShowView.this;
        super();
        handler = new Handler();
    }

    handler(handler handler1)
    {
        this();
    }
}
