// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.content.ContentValues;
import android.net.Uri;
import com.google.common.base.Preconditions;
import com.weather.util.DatabaseContentProvider;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.news.provider:
//            NewsDatabase

public abstract class ArticlesProvider extends DatabaseContentProvider
{

    private static final Map sArticlesProjectionMap = buildArticlesProjectionMap();
    private NewsDatabase mOpenHelper;

    protected ArticlesProvider(String s, String s1)
    {
        super(s, s1, "vnd.android.cursor.dir/vnd.weather.article", "vnd.android.cursor.item/vnd.weather.article", s, "article_id", sArticlesProjectionMap, sArticlesProjectionMap);
    }

    private static Map buildArticlesProjectionMap()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("article_id", "article_id");
        hashmap.put("article_url", "article_url");
        hashmap.put("article_title", "article_title");
        hashmap.put("article_publishdate", "article_publishdate");
        hashmap.put("article_image_small_url", "article_image_small_url");
        hashmap.put("article_json", "article_json");
        return hashmap;
    }

    NewsDatabase getOpenHelperForTest()
    {
        return (NewsDatabase)Preconditions.checkNotNull(mOpenHelper);
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        contentvalues.put("updated", Long.valueOf(System.currentTimeMillis()));
        return super.insert(uri, contentvalues);
    }

    public boolean onCreate()
    {
        mOpenHelper = new NewsDatabase(getContext());
        setDatabaseHelper(mOpenHelper);
        return true;
    }

    public void shutdown()
    {
        mOpenHelper.close();
        NewsDatabase.deleteDatabase(getContext());
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        contentvalues.put("updated", Long.valueOf(System.currentTimeMillis()));
        return super.update(uri, contentvalues, s, as);
    }

}
