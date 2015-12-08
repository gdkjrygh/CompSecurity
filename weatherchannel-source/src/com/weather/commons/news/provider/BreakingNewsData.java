// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.commons.video2.VideoUtil;
import com.weather.commons.video2.dsx.ListVideo;
import com.weather.util.parsing.ValidationException;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.news.provider:
//            ArticlePojo

public class BreakingNewsData
{

    public static final int MAX_CONTENT_SIZE = 6;
    private static final String NEWS_TYPE_ARTICLE = "article";
    private static final String NEWS_TYPE_VIDEO = "video";
    private static final String PARSING_TAG_MAIN = "main";
    private static final String PARSING_TAG_TYPE = "type";
    private final ImmutableList articles;
    private final ImmutableList order;
    private final ImmutableList videos;

    public BreakingNewsData(Collection collection, Collection collection1, Collection collection2)
    {
        Object obj = null;
        super();
        if (collection != null)
        {
            collection = ImmutableList.copyOf(collection);
        } else
        {
            collection = null;
        }
        articles = collection;
        if (collection1 != null)
        {
            collection = ImmutableList.copyOf(collection1);
        } else
        {
            collection = null;
        }
        videos = collection;
        collection = obj;
        if (collection2 != null)
        {
            collection = ImmutableList.copyOf(collection2);
        }
        order = collection;
    }

    public static BreakingNewsData fromJson(JSONArray jsonarray)
    {
        com.google.common.collect.ImmutableList.Builder builder;
        com.google.common.collect.ImmutableList.Builder builder1;
        com.google.common.collect.ImmutableList.Builder builder2;
        int k;
        int l;
        int i1;
        Preconditions.checkNotNull(jsonarray);
        builder = ImmutableList.builder();
        builder1 = ImmutableList.builder();
        builder2 = ImmutableList.builder();
        i1 = 0;
        l = 0;
        k = 0;
_L5:
        if (k >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        boolean flag;
        flag = VideoUtil.useImaVideoFeature();
        jsonobject = jsonarray.getJSONObject(k);
        if (!jsonobject.getString("type").equals("article")) goto _L4; else goto _L3
_L3:
        builder.add(ArticlePojo.fromJson(jsonobject.toString()));
        int i = i1 + 1;
        builder2.add(Integer.valueOf(i1));
        int j = l;
_L7:
        k++;
        i1 = i;
        l = j;
          goto _L5
_L4:
        i = i1;
        j = l;
        if (!jsonobject.getString("type").equals("video")) goto _L7; else goto _L6
_L6:
        i = i1;
        j = l;
        if (!flag) goto _L7; else goto _L8
_L8:
        builder1.add(ListVideo.fromJson(jsonobject));
        i = l + 1;
        builder2.add(Integer.valueOf(l + 6));
        j = i;
        i = i1;
          goto _L7
_L2:
        return new BreakingNewsData(builder.build(), builder1.build(), builder2.build());
        Object obj;
        obj;
        i = i1;
        j = l;
          goto _L7
        obj;
        j = l;
          goto _L7
        obj;
        j = i;
        i = i1;
          goto _L7
        obj;
        i = i1;
        j = l;
          goto _L7
        obj;
        j = l;
          goto _L7
        obj;
        j = i;
        i = i1;
          goto _L7
    }

    public static BreakingNewsData fromJsonString(String s)
        throws JSONException
    {
        return fromJson((new JSONObject(s)).getJSONArray("main"));
    }

    public ArticlePojo getArticle(int i)
    {
        if (i < articles.size() && i >= 0)
        {
            return (ArticlePojo)articles.get(i);
        } else
        {
            return null;
        }
    }

    public List getArticles()
    {
        return articles;
    }

    public List getOrder()
    {
        return order;
    }

    public ListVideo getVideo(int i)
    {
        if (i < videos.size() && i >= 0)
        {
            return (ListVideo)videos.get(i);
        } else
        {
            return null;
        }
    }

    public List getVideos()
    {
        return videos;
    }
}
