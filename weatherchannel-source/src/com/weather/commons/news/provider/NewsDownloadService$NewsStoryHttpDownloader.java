// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import com.weather.util.net.HttpRequest;

// Referenced classes of package com.weather.commons.news.provider:
//            NewsDownloader, NewsDownloadService

class this._cls0
    implements NewsDownloader
{

    final NewsDownloadService this$0;

    public String download(String s)
        throws com.weather.util.net.tpDownloader
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

    ()
    {
        this$0 = NewsDownloadService.this;
        super();
    }
}
