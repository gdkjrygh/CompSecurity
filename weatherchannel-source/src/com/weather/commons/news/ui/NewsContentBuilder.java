// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.Activity;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.commons.news.provider.ArticleConfig;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.news.provider.CachingWeatherNodesImageFetcher;
import com.weather.commons.news.provider.Variants;
import com.weather.commons.news.provider.WxNodes;
import com.weather.commons.news.provider.WxNodesType;
import com.weather.dal2.net.Receiver;
import com.weather.util.SpannableUtils;
import com.weather.util.Splitter;
import com.weather.util.StringUtils;
import com.weather.util.date.TwcDateParser;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.commons.news.ui:
//            SlideShowView

public class NewsContentBuilder
{

    private static final Pattern COMPILE = Pattern.compile("\\p{Space}");
    private static final String EXPRESSION = "<div id=\"wxn\\d\" />";
    private static final String TAG = "BreakingNewsContentBuilder";
    private static final String WHITESPACE_EXPRESSION = "\\p{Space}";
    private final Activity activity;
    private final ArticlePojo article;
    private final LinearLayout container;
    private boolean hasShownHeader;
    private boolean hasWxNodeAtTop;
    private final Collection slideShowList = new ArrayList();

    public NewsContentBuilder(Activity activity1, LinearLayout linearlayout, ArticlePojo articlepojo)
    {
        activity = (Activity)Preconditions.checkNotNull(activity1);
        container = (LinearLayout)Preconditions.checkNotNull(linearlayout);
        article = (ArticlePojo)Preconditions.checkNotNull(articlepojo);
    }

    private void addHeader()
    {
        LinearLayout linearlayout = (LinearLayout)activity.getLayoutInflater().inflate(com.weather.commons.R.layout.news_article_header, container, false);
        Object obj1 = (TextView)linearlayout.findViewById(com.weather.commons.R.id.news_article_title);
        Object obj;
        java.util.Date date;
        if (Strings.isNullOrEmpty(article.teaserTitle))
        {
            obj = article.title;
        } else
        {
            obj = article.teaserTitle;
        }
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        obj = (TextView)linearlayout.findViewById(com.weather.commons.R.id.news_article_author);
        if (article.author != null && article.author.length > 0)
        {
            obj1 = Joiner.on(", ").join(article.author);
            LogUtil.d("BreakingNewsContentBuilder", LoggingMetaTags.TWC_NEWS, "authors=%s", new Object[] {
                obj1
            });
            ((TextView) (obj)).setText(((CharSequence) (obj1)));
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        obj1 = (TextView)linearlayout.findViewById(com.weather.commons.R.id.news_article_publish_date);
        date = TwcDateParser.parseISO(article.publishdate);
        if (date != null)
        {
            if (DateFormat.is24HourFormat(activity.getLayoutInflater().getContext()))
            {
                obj = new SimpleDateFormat("MMM dd, yyyy, H:mm", Locale.US);
            } else
            {
                obj = new SimpleDateFormat("MMM dd, yyyy, h:mm a", Locale.US);
            }
            ((TextView) (obj1)).setText(SpannableUtils.convertHtmlToSpanned(((java.text.DateFormat) (obj)).format(date)));
            container.addView(linearlayout);
        }
    }

    private void addImage(WxNodes wxnodes)
    {
        if (wxnodes.assetid == null)
        {
            return;
        }
        LinearLayout linearlayout;
        final ImageView image;
        if (hasShownHeader)
        {
            linearlayout = (LinearLayout)activity.getLayoutInflater().inflate(com.weather.commons.R.layout.news_image_container, container, false);
        } else
        {
            linearlayout = (LinearLayout)activity.getLayoutInflater().inflate(com.weather.commons.R.layout.news_header_image_container, container, false);
            hasWxNodeAtTop = true;
        }
        image = (ImageView)linearlayout.findViewById(com.weather.commons.R.id.news_article_main_image);
        container.addView(linearlayout);
        CachingWeatherNodesImageFetcher.getInstance().asyncFetch(wxnodes.assetid, false, new Receiver() {

            final NewsContentBuilder this$0;
            final ImageView val$image;

            public volatile void onCompletion(Object obj, Object obj1)
            {
                onCompletion((String)obj, (String)obj1);
            }

            public void onCompletion(String s, String s1)
            {
                activity.runOnUiThread(s. new Runnable() {

                    final _cls1 this$1;
                    final String val$result;

                    public void run()
                    {
                        Picasso.with(container.getContext()).load(result).config(android.graphics.Bitmap.Config.RGB_565).skipMemoryCache().fit().centerInside().into(image);
                    }

            
            {
                this$1 = final__pcls1;
                result = String.this;
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

            
            {
                this$0 = NewsContentBuilder.this;
                image = imageview;
                super();
            }
        }, "breaking");
    }

    private void addImageHeaderIfNeeded()
    {
        if (!hasWxNodeAtTop && article.variants != null && URLUtil.isValidUrl(article.variants._9))
        {
            LinearLayout linearlayout = (LinearLayout)activity.getLayoutInflater().inflate(com.weather.commons.R.layout.news_header_image_container, container, false);
            ImageView imageview = (ImageView)linearlayout.findViewById(com.weather.commons.R.id.news_article_main_image);
            container.addView(linearlayout);
            String s;
            if (article._config == null || article._config.overrideimage == null || article._config.overrideimage._9 == null)
            {
                s = (String)Preconditions.checkNotNull(article.variants._9);
            } else
            {
                s = article._config.overrideimage._9;
            }
            Picasso.with(linearlayout.getContext()).load(s).skipMemoryCache().config(android.graphics.Bitmap.Config.RGB_565).fit().centerCrop().into(imageview);
        }
    }

    private void addWeatherNode(WxNodes wxnodes)
    {
        if (wxnodes.type != null)
        {
            WxNodesType wxnodestype = WxNodesType.getWxNodeType(wxnodes.type);
            if (wxnodestype == WxNodesType.WX_IMAGE || wxnodestype == WxNodesType.WX_MAP)
            {
                addImage(wxnodes);
                return;
            }
            if (wxnodestype == WxNodesType.WX_SLIDESHOW)
            {
                SlideShowView slideshowview = (SlideShowView)activity.getLayoutInflater().inflate(com.weather.commons.R.layout.news_slideshow, container, false);
                slideshowview.setData(activity, wxnodes.slideshow);
                container.addView(slideshowview);
                slideShowList.add(slideshowview);
                if (!hasShownHeader)
                {
                    hasWxNodeAtTop = true;
                    return;
                }
            }
        }
    }

    public void build()
    {
        if (article.body != null)
        {
            String as[] = (new Splitter("<div id=\"wxn\\d\" />", true)).split(article.body);
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = as[i];
                if (!Strings.isNullOrEmpty(((String) (obj))))
                {
                    Object obj1 = getWxNode(article.wxnodes, ((String) (obj)));
                    if (obj1 == null)
                    {
                        obj = SpannableUtils.convertHtmlToSpanned(((String) (obj)));
                        if (!COMPILE.matcher(obj.toString()).replaceAll("").isEmpty())
                        {
                            if (!hasShownHeader)
                            {
                                addImageHeaderIfNeeded();
                                addHeader();
                                hasShownHeader = true;
                            }
                            obj1 = (LinearLayout)activity.getLayoutInflater().inflate(com.weather.commons.R.layout.news_article_body, container, false);
                            ((TextView)((LinearLayout) (obj1)).findViewById(com.weather.commons.R.id.news_article_detail)).setText(StringUtils.trimTrailingWhitespace(((CharSequence) (obj))));
                            container.addView(((android.view.View) (obj1)));
                        }
                    } else
                    {
                        addWeatherNode(((WxNodes) (obj1)));
                    }
                }
                i++;
            }
        }
    }

    WxNodes getWxNode(Iterable iterable, String s)
    {
        Object obj = null;
        WxNodes wxnodes = obj;
        if (iterable != null)
        {
            s = getWxNodeId(s);
            wxnodes = obj;
            if (s != null)
            {
                iterable = iterable.iterator();
                do
                {
                    wxnodes = obj;
                    if (!iterable.hasNext())
                    {
                        break;
                    }
                    wxnodes = (WxNodes)iterable.next();
                } while (wxnodes == null || !s.equals(wxnodes.id));
            }
        }
        return wxnodes;
    }

    String getWxNodeId(String s)
    {
        String s1 = null;
        if (s.contains("wxn"))
        {
            s = s.substring(s.indexOf("wxn"));
            s1 = s.substring(0, s.indexOf('"'));
        }
        return s1;
    }

    public void tagSlideShowLocalyticsEvent()
    {
        for (Iterator iterator = slideShowList.iterator(); iterator.hasNext(); ((SlideShowView)iterator.next()).recordSlideShowLocalytics()) { }
    }



}
