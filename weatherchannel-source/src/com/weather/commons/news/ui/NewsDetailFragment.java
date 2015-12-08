// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.ads2.ui.PageAdHolder;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.profile.LocalyticsProfileAttribute;
import com.weather.commons.analytics.profile.LocalyticsProfileHandler;
import com.weather.commons.analytics.session.LocalyticsSessionAttribute;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.share.ShareableUrl;
import com.weather.commons.share.SimpleShareableUrl;
import com.weather.util.SpannableUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.EnumMap;
import java.util.Map;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsContentBuilder, NewsSessionMHelper, NewsPreviewListAdapter, NewsActivity

public class NewsDetailFragment extends Fragment
{

    protected static final String TAG = "NewsDetailFragment";
    private final PageAdHolder adHolder = new PageAdHolder();
    private String adSlotName;
    private ArticlePojo article;
    private NewsPreviewListAdapter.ArticleSelectionListener articleSelectionListener;
    private Cursor cursor;
    private boolean isVisibleToUser;
    private boolean pauseFlag;
    private int position;
    private ScrollView scrollView;

    public NewsDetailFragment()
    {
    }

    private void buildNews(LinearLayout linearlayout)
    {
        (new NewsContentBuilder(getActivity(), linearlayout, article)).build();
    }

    private ArticlePojo parseArticle()
    {
        String s = getArguments().getString("article_json");
        if (s != null)
        {
            try
            {
                article = ArticlePojo.fromJson(s);
            }
            catch (JSONException jsonexception)
            {
                LogUtil.e("NewsDetailFragment", LoggingMetaTags.TWC_NEWS, "could not parse article json, do not display article error=%s", new Object[] {
                    jsonexception.getMessage()
                });
            }
        }
        return article;
    }

    private void sendDisplayPageBeacon()
    {
        if (isVisibleToUser)
        {
            EnumMap enummap = new EnumMap(com/weather/beacons/targeting/BeaconTargetingParam);
            enummap.put(BeaconTargetingParam.NEWS_ARTICLE, getNewsArticleName());
            Analytics.trackState(getResources().getString(com.weather.commons.R.string.beacon_news_details), enummap);
            LocalyticsHandler.getInstance().getSessionSummaryRecorder().incrementValue(LocalyticsSessionAttribute.NEWS_ARTICLES_VIEWED);
            LocalyticsProfileHandler.getInstance().incrementIntegerProfileAttribute(LocalyticsProfileAttribute.NEWS_ARTICLES_READ_COUNT);
            NewsSessionMHelper.logNewsArticleDetailAppeared();
        }
    }

    private static void setTextFromHtml(View view, int i, String s)
    {
        LogUtil.v("NewsDetailFragment", LoggingMetaTags.TWC_UI, "setTextFromHtml: viewId=%s, html=\"%s\"", new Object[] {
            Integer.valueOf(i), s
        });
        view = (TextView)view.findViewById(i);
        if (TextUtils.getTrimmedLength(s) == 0)
        {
            view.setVisibility(8);
            return;
        } else
        {
            view.setText(SpannableUtils.convertHtmlToSpanned(s));
            view.setVisibility(0);
            return;
        }
    }

    private void setupMoreList(Context context)
    {
        RecyclerView recyclerview = (RecyclerView)scrollView.findViewById(com.weather.commons.R.id.news_article_more_list);
        if (recyclerview != null)
        {
            recyclerview.setLayoutManager(new LinearLayoutManager(context, 0, false));
            context = new NewsPreviewListAdapter(Integer.valueOf(position), cursor, recyclerview);
            context.setListener(articleSelectionListener);
            recyclerview.setAdapter(context);
            recyclerview.setItemAnimator(new DefaultItemAnimator());
            recyclerview.scrollToPosition(position);
        }
    }

    public ArticlePojo getArticle()
    {
        if (article == null)
        {
            return parseArticle();
        } else
        {
            return article;
        }
    }

    public String getNewsArticleName()
    {
        if (article != null)
        {
            return article.title;
        } else
        {
            return "";
        }
    }

    public ShareableUrl getSharable()
    {
        Object obj = null;
        SimpleShareableUrl simpleshareableurl = obj;
        if (article != null)
        {
            String s = article.title;
            String s1 = article.url;
            simpleshareableurl = obj;
            if (s != null)
            {
                simpleshareableurl = obj;
                if (s1 != null)
                {
                    simpleshareableurl = new SimpleShareableUrl(s, s1);
                }
            }
        }
        return simpleshareableurl;
    }

    public String getUrl()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            return bundle.getString("article_url", "");
        } else
        {
            return "";
        }
    }

    public void initialize(String s, Cursor cursor1, int i, NewsPreviewListAdapter.ArticleSelectionListener articleselectionlistener)
    {
        adSlotName = s;
        cursor = cursor1;
        position = i;
        articleSelectionListener = articleselectionlistener;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = (ImageView)((View)Preconditions.checkNotNull(getView())).findViewById(com.weather.commons.R.id.news_next_article_main_image);
        if (article != null)
        {
            String s = article.getNextArticleImageUrl();
            if (bundle != null && URLUtil.isValidUrl(s))
            {
                Picasso.with(getActivity()).load(s).config(android.graphics.Bitmap.Config.RGB_565).into(bundle);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        scrollView = (ScrollView)layoutinflater.inflate(com.weather.commons.R.layout.fragment_news_article, viewgroup, false);
        adHolder.init(scrollView, adSlotName);
        article = parseArticle();
        if (article != null)
        {
            buildNews((LinearLayout)scrollView.findViewById(com.weather.commons.R.id.news_article_container));
            viewgroup = scrollView.findViewById(com.weather.commons.R.id.news_next_article_image_layout);
            if (viewgroup != null)
            {
                bundle = article.getNextArticleTitle();
                if (bundle != null)
                {
                    setTextFromHtml(scrollView, com.weather.commons.R.id.news_next_article_title, bundle);
                    viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

                        final NewsDetailFragment this$0;

                        public void onClick(View view)
                        {
                            ((NewsActivity)getActivity()).goToNextArticle();
                        }

            
            {
                this$0 = NewsDetailFragment.this;
                super();
            }
                    });
                } else
                {
                    viewgroup.setVisibility(8);
                }
            }
            setupMoreList(layoutinflater.getContext());
        }
        return scrollView;
    }

    public void onDestroyView()
    {
        adHolder.destroy();
        super.onDestroyView();
    }

    public void onPause()
    {
        adHolder.pause();
        pauseFlag = true;
        super.onPause();
    }

    public void onResume()
    {
        if (pauseFlag)
        {
            sendDisplayPageBeacon();
        }
        pauseFlag = false;
        super.onResume();
        adHolder.resume();
    }

    public void setVisible(boolean flag)
    {
        adHolder.setVisible(flag);
        android.app.Activity activity = getActivity();
        if (activity != null)
        {
            isVisibleToUser = flag;
            boolean flag1;
            if (adHolder.getAdBoundingBox(activity) != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag)
            {
                sendDisplayPageBeacon();
                if (flag1)
                {
                    Object obj = (ViewGroup)scrollView.findViewById(com.weather.commons.R.id.news_article_container);
                    if (((ViewGroup) (obj)).getChildCount() > 0)
                    {
                        obj = ((ViewGroup) (obj)).getChildAt(0);
                    }
                    scrollView.requestChildRectangleOnScreen(((View) (obj)), new Rect(0, 0, ((View) (obj)).getWidth(), ((View) (obj)).getHeight()), true);
                    return;
                }
            }
        }
    }
}
