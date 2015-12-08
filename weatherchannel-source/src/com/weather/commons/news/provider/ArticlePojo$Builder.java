// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.weather.commons.news.provider:
//            ArticlePojo, ArticleConfig, Tags, Variants

public static class <init>
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

    public transient tags setAuthor(String as[])
    {
        author = (String[])Arrays.copyOf(as, as.length);
        return this;
    }

    public author setBody(String s)
    {
        body = s;
        return this;
    }

    public body setId(String s)
    {
        id = s;
        return this;
    }

    public id setPublishdate(String s)
    {
        publishdate = s;
        return this;
    }

    public publishdate setTags(Tags tags1)
    {
        tags = tags1;
        return this;
    }

    public tags setTeaserTitle(String s)
    {
        teaserTitle = s;
        return this;
    }

    public teaserTitle setTitle(String s)
    {
        title = s;
        return this;
    }

    public title setType(String s)
    {
        type = s;
        return this;
    }

    public type setUrl(String s)
    {
        url = s;
        return this;
    }

    public url setVariants(Variants variants1)
    {
        variants = variants1;
        return this;
    }

    public variants setWxnodes(List list)
    {
        wxnodes = list;
        return this;
    }

    public wxnodes set_config(ArticleConfig articleconfig)
    {
        _config = articleconfig;
        return this;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
