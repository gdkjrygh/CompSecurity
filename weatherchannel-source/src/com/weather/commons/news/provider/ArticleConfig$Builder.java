// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;


// Referenced classes of package com.weather.commons.news.provider:
//            ArticleConfig, Variants

public static class 
{

    private String asset;
    private Variants overrideimage;
    private String overridetitle;

    public ArticleConfig build()
    {
        return new ArticleConfig(asset, overridetitle, overrideimage);
    }

    public overrideimage setAsset(String s)
    {
        asset = s;
        return this;
    }

    public asset setOverrideimage(Variants variants)
    {
        overrideimage = variants;
        return this;
    }

    public overrideimage setOverridetitle(String s)
    {
        overridetitle = s;
        return this;
    }

    public ()
    {
    }
}
