// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.collect.Lists;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.news.provider:
//            ArticlePojo, Variants, NewsContract, NewsDownloader, 
//            NewsPojo

public class NewsDownloadHelper
{

    private static final long MIN_FORCED_REFRESH_INTERVAL_MS = 30000L;
    private static final long MIN_REFRESH_INTERVAL_MS = 0xdbba0L;
    private static final String TAG = "NewsDownloadHelper";
    private Context context;

    public NewsDownloadHelper()
    {
    }

    public static boolean allowDownload(Uri uri, boolean flag)
    {
        long l = System.currentTimeMillis();
        if (NewsContract.Article.TOP_STORY_CONTENT_URI.equals(uri))
        {
            l -= TwcPrefs.getInstance().getLong(com.weather.util.prefs.TwcPrefs.Keys.NEWS_REFRESH_TIME, 0L);
            boolean flag1;
            if (flag && l > 30000L)
            {
                flag1 = true;
            } else
            if (l > 0xdbba0L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            LogUtil.d("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "uri=%s, timeSinceLastDownload=%s, isForced=%s, result=%s", new Object[] {
                uri, Long.valueOf(l), Boolean.valueOf(flag), Boolean.valueOf(flag1)
            });
            return flag1;
        } else
        {
            return false;
        }
    }

    private void deleteArticles(Uri uri)
    {
        ContentResolver contentresolver = context.getContentResolver();
        try
        {
            contentresolver.delete(uri, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return;
        }
    }

    public static ArticlePojo findDeepLinkedArticle(List list, String s)
    {
        Object obj = null;
        Iterator iterator = list.iterator();
        do
        {
            list = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            list = (ArticlePojo)iterator.next();
        } while (!((ArticlePojo) (list)).id.equals(s));
        return list;
    }

    private void insertArticles(List list, String s, Uri uri)
        throws RemoteException, OperationApplicationException
    {
        ArrayList arraylist = Lists.newArrayList();
        ContentResolver contentresolver = context.getContentResolver();
        int i = 0;
        while (i < list.size()) 
        {
            ArticlePojo articlepojo = (ArticlePojo)list.get(i);
            Object obj;
            if (i < list.size() - 1)
            {
                obj = (ArticlePojo)list.get(i + 1);
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                articlepojo.setNextArticleTitle(((ArticlePojo) (obj)).teaserTitle);
                if (((ArticlePojo) (obj)).variants != null)
                {
                    articlepojo.setNextArticleImageUrl(((ArticlePojo) (obj)).variants._11);
                }
            }
            LogUtil.v("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "%d: insert article: id=%s teaserTitle=%s", new Object[] {
                Integer.valueOf(i), articlepojo.id, articlepojo.teaserTitle
            });
            obj = NewsContract.makeContentValues(articlepojo);
            ((ContentValues) (obj)).put("updated", Long.valueOf(System.currentTimeMillis()));
            arraylist.add(ContentProviderOperation.newInsert(uri).withValues(((ContentValues) (obj))).build());
            i++;
        }
        contentresolver.applyBatch(s, arraylist);
    }

    public void executeDownload(Context context1, NewsDownloader newsdownloader, Uri uri, boolean flag, String s, String s1, String s2, 
            String s3)
    {
        boolean flag2;
        LogUtil.v("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "download top story articles forced: %b", new Object[] {
            Boolean.valueOf(flag)
        });
        context = context1;
        if (s == null || uri == null || s1 == null)
        {
            LogUtil.v("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "Input parameter is null do not request articles", new Object[0]);
            return;
        }
        if (s2 != null && s3 != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!allowDownload(uri, flag) && !flag2)
        {
            LogUtil.v("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "do not allow download", new Object[0]);
            return;
        }
        TrafficStats.setThreadStatsTag(61441);
        ArrayList arraylist;
        LogUtil.d("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "download acticles from: url=%s", new Object[] {
            s1
        });
        arraylist = new ArrayList();
        s1 = ArticlePojo.parseNews(newsdownloader.download(s1));
        boolean flag1;
        context1 = null;
        flag1 = false;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        context1 = findDeepLinkedArticle(((NewsPojo) (s1)).articles, s2);
        if (context1 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag2 || flag1)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        LogUtil.v("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "download deep link story article from: %s", new Object[] {
            s3
        });
        newsdownloader = newsdownloader.download(s3);
        LogUtil.v("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, (new StringBuilder()).append("article json:\n").append(newsdownloader).toString(), new Object[0]);
        newsdownloader = ArticlePojo.fromJson(newsdownloader);
        LogUtil.v("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "received deep link story article %s, tease %s: ", new Object[] {
            ((ArticlePojo) (newsdownloader)).title, ((ArticlePojo) (newsdownloader)).teaserTitle
        });
        arraylist.add(newsdownloader);
        arraylist.addAll(((NewsPojo) (s1)).articles);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        LogUtil.v("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "already have deep linked article", new Object[0]);
        arraylist.remove(context1);
        arraylist.add(0, context1);
        deleteArticles(uri);
        insertArticles(ArticlePojo.filterEmptyArticles(arraylist), s, uri);
        LogUtil.v("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "news download complete. has deep link article %b", new Object[] {
            Boolean.valueOf(flag2)
        });
        DataAccessLayer.BUS.post(new NewsDownloadService.NewsArticlesUpdated(flag2));
        if (uri.equals(NewsContract.Article.TOP_STORY_CONTENT_URI))
        {
            TwcPrefs.getInstance().putLong(com.weather.util.prefs.TwcPrefs.Keys.NEWS_REFRESH_TIME, System.currentTimeMillis());
        }
        TrafficStats.clearThreadStatsTag();
        return;
        context1;
_L2:
        Log.e("NewsDownloadHelper", context1.toString(), context1);
        LogUtil.e("NewsDownloadHelper", LoggingMetaTags.TWC_NEWS, "failed to download news article %s=", new Object[] {
            context1.getMessage()
        });
        DataAccessLayer.BUS.post(new NewsDownloadService.NewsArticlesUpdated(flag2, true));
        TrafficStats.clearThreadStatsTag();
        return;
        context1;
        TrafficStats.clearThreadStatsTag();
        throw context1;
        context1;
        continue; /* Loop/switch isn't completed */
        context1;
        continue; /* Loop/switch isn't completed */
        context1;
        continue; /* Loop/switch isn't completed */
        context1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
