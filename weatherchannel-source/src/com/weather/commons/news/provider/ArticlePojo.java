// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.text.Html;
import com.google.common.collect.Lists;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.news.provider:
//            NewsPojo, Variants, WxNodes, ArticleConfig, 
//            Tags

public class ArticlePojo
{
    public static class Builder
    {

        private ArticleConfig _config;
        private String author[];
        private String body;
        private String id;
        private String publishdate;
        private Tags tags;
        private String teaserTitle;
        private String title;
        private String type;
        private String url;
        private Variants variants;
        private List wxnodes;

        public ArticlePojo build()
        {
            return new ArticlePojo(id, title, teaserTitle, author, publishdate, body, type, variants, _config, url, wxnodes, tags);
        }

        public transient Builder setAuthor(String as[])
        {
            author = (String[])Arrays.copyOf(as, as.length);
            return this;
        }

        public Builder setBody(String s)
        {
            body = s;
            return this;
        }

        public Builder setId(String s)
        {
            id = s;
            return this;
        }

        public Builder setPublishdate(String s)
        {
            publishdate = s;
            return this;
        }

        public Builder setTags(Tags tags1)
        {
            tags = tags1;
            return this;
        }

        public Builder setTeaserTitle(String s)
        {
            teaserTitle = s;
            return this;
        }

        public Builder setTitle(String s)
        {
            title = s;
            return this;
        }

        public Builder setType(String s)
        {
            type = s;
            return this;
        }

        public Builder setUrl(String s)
        {
            url = s;
            return this;
        }

        public Builder setVariants(Variants variants1)
        {
            variants = variants1;
            return this;
        }

        public Builder setWxnodes(List list)
        {
            wxnodes = list;
            return this;
        }

        public Builder set_config(ArticleConfig articleconfig)
        {
            _config = articleconfig;
            return this;
        }

        private Builder()
        {
        }

    }


    private static final String TAG = "ArticlePojo";
    private static final String TYPE_SLIDESHOW = "wxnode_slideshow";
    public final ArticleConfig _config;
    public final String author[];
    public final String body;
    public final String id;
    private String nextArticleImageUrl;
    private String nextArticleTitle;
    public final String publishdate;
    public final Tags tags;
    public final String teaserTitle;
    public final String title;
    public final String type;
    public final String url;
    public final Variants variants;
    public final List wxnodes;

    public ArticlePojo()
    {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    ArticlePojo(String s, String s1, String s2, String as[], String s3, String s4, String s5, 
            Variants variants1, ArticleConfig articleconfig, String s6, List list, Tags tags1)
    {
        id = s;
        title = s1;
        teaserTitle = s2;
        if (as == null)
        {
            s = null;
        } else
        {
            s = (String[])Arrays.copyOf(as, as.length);
        }
        author = s;
        publishdate = s3;
        body = s4;
        type = s5;
        variants = variants1;
        _config = articleconfig;
        url = s6;
        wxnodes = list;
        tags = tags1;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static List filterEmptyArticles(Iterable iterable)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        if (iterable != null)
        {
            iterable = iterable.iterator();
            do
            {
                if (!iterable.hasNext())
                {
                    break;
                }
                ArticlePojo articlepojo = (ArticlePojo)iterable.next();
                if (articlepojo.hasNonEmptyBody() && articlepojo.teaserTitle != null)
                {
                    arraylist.add(articlepojo);
                }
            } while (true);
        }
        return arraylist;
    }

    public static ArticlePojo fromJson(String s)
        throws JSONException
    {
        return (ArticlePojo)JsonObjectMapper.fromJson(s, com/weather/commons/news/provider/ArticlePojo);
    }

    public static NewsPojo parseNews(String s)
        throws JSONException
    {
        if (LogUtil.isLoggable(LoggingMetaTags.TWC_NEWS, 2))
        {
            int k = s.length();
            LogUtil.v("ArticlePojo", LoggingMetaTags.TWC_NEWS, "parseNews jsonString.length()=%s, jsonString=...", new Object[] {
                Integer.valueOf(k)
            });
            for (int i = 0; i < k; i += 2500)
            {
                int l = i + 2500;
                int j = l;
                if (l > k)
                {
                    j = k;
                }
                LogUtil.v("ArticlePojo", LoggingMetaTags.TWC_NEWS, "%6s..%6s %s", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(j), s.substring(i, j)
                });
            }

        }
        return (NewsPojo)JsonObjectMapper.fromJson(s, com/weather/commons/news/provider/NewsPojo);
    }

    public static void updateNextArticleFields(Iterable iterable)
    {
        ArticlePojo articlepojo = null;
        Iterator iterator = iterable.iterator();
        for (iterable = articlepojo; iterator.hasNext(); iterable = articlepojo)
        {
            articlepojo = (ArticlePojo)iterator.next();
            if (iterable == null)
            {
                continue;
            }
            iterable.setNextArticleTitle(articlepojo.teaserTitle);
            if (articlepojo.variants != null)
            {
                iterable.setNextArticleImageUrl(articlepojo.variants._11);
            }
        }

    }

    public String getNextArticleImageUrl()
    {
        return nextArticleImageUrl;
    }

    public String getNextArticleTitle()
    {
        return nextArticleTitle;
    }

    public boolean hasNonEmptyBody()
    {
        return body != null && !Html.fromHtml(body).toString().isEmpty();
    }

    public boolean isArticleContainsSlideshow()
    {
label0:
        {
            if (wxnodes == null)
            {
                break label0;
            }
            Iterator iterator = wxnodes.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((WxNodes)iterator.next()).type.equals("wxnode_slideshow"));
            return true;
        }
        return false;
    }

    public void setNextArticleImageUrl(String s)
    {
        nextArticleImageUrl = s;
    }

    public void setNextArticleTitle(String s)
    {
        nextArticleTitle = s;
    }
}
