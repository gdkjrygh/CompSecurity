// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.content.ContentValues;
import android.net.Uri;
import android.provider.BaseColumns;
import com.weather.dal2.net.JsonObjectMapper;

// Referenced classes of package com.weather.commons.news.provider:
//            ArticlePojo, Variants

public final class NewsContract
{
    public static class Article
        implements ArticleColumns, BaseColumns
    {

        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.weather.article";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.weather.article";
        public static final Uri TOP_STORY_CONTENT_URI = Uri.parse("content://com.weather.weather.provider.topstories").buildUpon().appendPath("top_stories").build();


        public Article()
        {
        }
    }

    static interface ArticleColumns
    {

        public static final String ARTICLE_ID = "article_id";
        public static final String ARTICLE_IMAGE_SMALL_URL = "article_image_small_url";
        public static final String ARTICLE_JSON = "article_json";
        public static final String ARTICLE_PUBLISHDATE = "article_publishdate";
        public static final String ARTICLE_TITLE = "article_title";
        public static final String ARTICLE_URL = "article_url";
    }

    public static interface SyncColumns
    {

        public static final String UPDATED = "updated";
    }


    private static final String PATH_TOP_STORIES = "top_stories";

    private NewsContract()
    {
    }

    public static ContentValues makeContentValues(ArticlePojo articlepojo)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("article_id", articlepojo.id);
        contentvalues.put("article_url", articlepojo.url);
        contentvalues.put("article_title", articlepojo.teaserTitle);
        contentvalues.put("article_publishdate", articlepojo.publishdate);
        if (articlepojo.variants != null)
        {
            contentvalues.put("article_image_small_url", articlepojo.variants._10);
        } else
        {
            contentvalues.put("article_image_small_url", "");
        }
        contentvalues.put("article_json", JsonObjectMapper.toJson(articlepojo));
        return contentvalues;
    }
}
