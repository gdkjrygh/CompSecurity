// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;

// Referenced classes of package com.weather.commons.news.provider:
//            NewsDownloadHelper, NewsDownloader

public class NewsDownloadService extends IntentService
{
    public static class NewsArticlesUpdated
    {

        private boolean failure;
        private boolean hasDeepLink;

        public boolean hasDeepLink()
        {
            return hasDeepLink;
        }

        public boolean isFailure()
        {
            return failure;
        }

        public NewsArticlesUpdated(boolean flag)
        {
            this(flag, false);
        }

        public NewsArticlesUpdated(boolean flag, boolean flag1)
        {
            hasDeepLink = flag;
            failure = flag1;
        }
    }

    class NewsStoryHttpDownloader
        implements NewsDownloader
    {

        final NewsDownloadService this$0;

        public String download(String s)
            throws com.weather.util.net.HttpRequest.HttpRequestException
        {
            s = HttpRequest.get(s).useCaches(true).header("Cache-Control", "no-cache").acceptJson().acceptGzipEncoding().readTimeout(15000).connectTimeout(15000).uncompress(true);
            if (s != null)
            {
                s.disconnect();
                return s.body();
            } else
            {
                return "";
            }
            s;
            if (false)
            {
                throw new NullPointerException();
            } else
            {
                return "";
            }
        }

        NewsStoryHttpDownloader()
        {
            this$0 = NewsDownloadService.this;
            super();
        }
    }


    private static final String AUTHORITY_KEY = "authority";
    public static final String CONTENT_URI_KEY = "CONTENT_URI";
    private static final String DEEP_LINK_ARTICLE_ID_KEY = "deepkey";
    private static final String DEEP_LINK_BASE_URL_DEFAULT = "http://dsx.weather.com/cms/v1/a/%1$s?api=c58dba3f-01b0-45a6-bd9b-3a113dec4508";
    public static final String DEEP_LINK_URL_KEY = "deepurl";
    public static final String FORCE_REFRESH = "force_refresh";
    private static final String TAG = "NewsDownloadService";
    private static final int TIMEOUT = 15000;
    private static final String TOP_STORIES_URL_DEFAULT = "http://dsx.weather.com/cms/assets/topstories?api=c58dba3f-01b0-45a6-bd9b-3a113dec4508";
    private static final String URL_KEY = "url";

    public NewsDownloadService()
    {
        super("NewsDownloadService");
    }

    public static Intent getIntent(Context context, String s, Uri uri, String s1, boolean flag)
    {
        context = new Intent(context, com/weather/commons/news/provider/NewsDownloadService);
        context.putExtra("url", s1);
        context.putExtra("authority", s);
        context.putExtra("CONTENT_URI", uri);
        context.putExtra("force_refresh", flag);
        return context;
    }

    public static Intent getTopStoriesIntent(Context context, boolean flag)
    {
        String s = "http://dsx.weather.com/cms/assets/topstories?api=c58dba3f-01b0-45a6-bd9b-3a113dec4508";
        String s1 = ConfigurationManagers.getInstance().getFlagshipConfig().topStoryUrl;
        s = s1;
_L2:
        return getIntent(context, "com.weather.weather.provider.topstories", NewsContract.Article.TOP_STORY_CONTENT_URI, s, flag);
        ConfigException configexception;
        configexception;
        LogUtil.e("NewsDownloadService", LoggingMetaTags.TWC_NEWS, "error with config, no topStoryUrl %s=", new Object[] {
            configexception.getMessage()
        });
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Intent getTopStoriesIntent(Context context, boolean flag, String s)
    {
        Intent intent;
        intent = getTopStoriesIntent(context, flag);
        context = "http://dsx.weather.com/cms/v1/a/%1$s?api=c58dba3f-01b0-45a6-bd9b-3a113dec4508";
        String s1 = ConfigurationManagers.getInstance().getFlagshipConfig().getAssetRequestUrl(s);
        context = s1;
_L2:
        intent.putExtra("deepurl", context);
        intent.putExtra("deepkey", s);
        return intent;
        ConfigException configexception;
        configexception;
        LogUtil.e("NewsDownloadService", LoggingMetaTags.TWC_NEWS, "error with config, no assetUrl %s=", new Object[] {
            configexception.getMessage()
        });
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        } else
        {
            Uri uri = (Uri)intent.getParcelableExtra("CONTENT_URI");
            boolean flag = intent.getBooleanExtra("force_refresh", false);
            String s = intent.getStringExtra("authority");
            String s1 = intent.getStringExtra("url");
            String s2 = intent.getStringExtra("deepkey");
            intent = intent.getStringExtra("deepurl");
            NewsStoryHttpDownloader newsstoryhttpdownloader = new NewsStoryHttpDownloader();
            (new NewsDownloadHelper()).executeDownload(this, newsstoryhttpdownloader, uri, flag, s, s1, s2, intent);
            LogUtil.v("NewsDownloadService", LoggingMetaTags.TWC_NEWS, "done download articles", new Object[0]);
            return;
        }
    }
}
