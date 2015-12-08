// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;


// Referenced classes of package com.weather.commons.news.provider:
//            Variants

public class ArticleConfig
{
    public static class Builder
    {

        private String asset;
        private Variants overrideimage;
        private String overridetitle;

        public ArticleConfig build()
        {
            return new ArticleConfig(asset, overridetitle, overrideimage);
        }

        public Builder setAsset(String s)
        {
            asset = s;
            return this;
        }

        public Builder setOverrideimage(Variants variants)
        {
            overrideimage = variants;
            return this;
        }

        public Builder setOverridetitle(String s)
        {
            overridetitle = s;
            return this;
        }

        public Builder()
        {
        }
    }


    public final String asset;
    public final Variants overrideimage;
    public final String overridetitle;

    public ArticleConfig()
    {
        this(null, null, null);
    }

    ArticleConfig(String s, String s1, Variants variants)
    {
        asset = s;
        overridetitle = s1;
        overrideimage = variants;
    }

    public static Builder builder()
    {
        return new Builder();
    }
}
